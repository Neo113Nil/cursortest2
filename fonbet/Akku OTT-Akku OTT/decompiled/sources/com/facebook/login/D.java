package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.credentials.provider.CredentialEntry;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0688a;
import com.facebook.C0724m;
import com.facebook.C0728q;
import com.facebook.C0729s;
import com.facebook.EnumC0718l;
import com.facebook.S;
import com.facebook.login.u;
import com.facebook.login.z;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nWebLoginMethodHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebLoginMethodHandler.kt\ncom/facebook/login/WebLoginMethodHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,264:1\n1#2:265\n*E\n"})
/* loaded from: classes3.dex */
public abstract class D extends z {
    public static final a Companion = new a();
    public String c;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
    }

    public void v(Bundle parameters, u.c request) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(request, "request");
        String str = request.e;
        A a2 = request.p;
        String str2 = request.t;
        String str3 = request.d;
        parameters.putString("redirect_uri", (str == null || str.length() == 0) ? p() : request.e);
        A a3 = A.INSTAGRAM;
        if (a2 == a3) {
            parameters.putString("app_id", str3);
        } else {
            parameters.putString("client_id", str3);
        }
        u.Companion.getClass();
        parameters.putString("e2e", u.b.a());
        if (a2 == a3) {
            parameters.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.b.contains("openid")) {
                parameters.putString("nonce", request.u);
            }
            parameters.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        parameters.putString("code_challenge", request.w);
        EnumC0719a enumC0719a = request.x;
        parameters.putString("code_challenge_method", enumC0719a != null ? enumC0719a.name() : null);
        parameters.putString("return_scopes", CredentialEntry.TRUE_STRING);
        parameters.putString("auth_type", request.l);
        parameters.putString("login_behavior", request.a.name());
        com.facebook.w wVar = com.facebook.w.a;
        parameters.putString("sdk", "android-18.3.0");
        if (x() != null) {
            parameters.putString("sso", x());
        }
        boolean z = com.facebook.w.n;
        String str4 = SessionDescription.SUPPORTED_SDP_VERSION;
        parameters.putString("cct_prefetching", z ? "1" : SessionDescription.SUPPORTED_SDP_VERSION);
        if (request.q) {
            parameters.putString("fx_app", a2.a);
        }
        if (request.r) {
            parameters.putString("skip_dedupe", CredentialEntry.TRUE_STRING);
        }
        if (request.s) {
            parameters.putString("force_confirmation", CredentialEntry.TRUE_STRING);
        }
        if (str2 != null && str2.length() != 0) {
            parameters.putString("android_sso_context", str2);
        }
        String str5 = request.n;
        if (str5 != null) {
            parameters.putString("messenger_page_id", str5);
            if (request.o) {
                str4 = "1";
            }
            parameters.putString("reset_messenger_state", str4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle w(u.c request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle bundle = new Bundle();
        HashSet hashSet = request.b;
        com.facebook.internal.E e = com.facebook.internal.E.a;
        if (hashSet != null && !hashSet.isEmpty()) {
            String join = TextUtils.join(",", request.b);
            bundle.putString("scope", join);
            h("scope", join);
        }
        EnumC0722d enumC0722d = request.c;
        if (enumC0722d == null) {
            enumC0722d = EnumC0722d.NONE;
        }
        bundle.putString("default_audience", enumC0722d.a);
        bundle.putString("state", m(request.i));
        C0688a.Companion.getClass();
        C0688a b = C0688a.b.b();
        String str = b != null ? b.e : null;
        String str2 = SessionDescription.SUPPORTED_SDP_VERSION;
        if (str != null) {
            Context o = n().o();
            if (o == null) {
                o = com.facebook.w.a();
            }
            if (Intrinsics.areEqual(str, o.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", ""))) {
                bundle.putString("access_token", str);
                h("access_token", "1");
                bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
                com.facebook.w wVar = com.facebook.w.a;
                if (S.c()) {
                    str2 = "1";
                }
                bundle.putString("ies", str2);
                return bundle;
            }
        }
        FragmentActivity o2 = n().o();
        if (o2 != null) {
            com.facebook.internal.E.c(o2);
        }
        h("access_token", SessionDescription.SUPPORTED_SDP_VERSION);
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        com.facebook.w wVar2 = com.facebook.w.a;
        if (S.c()) {
        }
        bundle.putString("ies", str2);
        return bundle;
    }

    public String x() {
        return null;
    }

    public abstract EnumC0718l y();

    @VisibleForTesting(otherwise = 4)
    public final void z(u.c request, Bundle bundle, C0728q c0728q) {
        String str;
        u.d b;
        String str2;
        Intrinsics.checkNotNullParameter(request, "request");
        u n = n();
        this.c = null;
        String str3 = request.e;
        if (str3 != null && str3.length() != 0 && !Intrinsics.areEqual(request.e, p())) {
            if (c0728q instanceof C0729s) {
                u.d.c cVar = u.d.Companion;
                u.c cVar2 = n.i;
                cVar.getClass();
                n.n(u.d.c.a(cVar2, "User canceled log in."));
                return;
            }
            if (c0728q != null) {
                this.c = null;
                String message = c0728q.getMessage();
                if (c0728q instanceof com.facebook.y) {
                    com.facebook.t tVar = ((com.facebook.y) c0728q).b;
                    str2 = String.valueOf(tVar.b);
                    message = tVar.toString();
                } else {
                    str2 = null;
                }
                u.d.c cVar3 = u.d.Companion;
                u.c cVar4 = n.i;
                cVar3.getClass();
                n.n(u.d.c.b(cVar4, null, message, str2));
                return;
            }
            return;
        }
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.c = bundle.getString("e2e");
            }
            try {
                z.a aVar = z.Companion;
                HashSet hashSet = request.b;
                EnumC0718l y = y();
                String str4 = request.d;
                aVar.getClass();
                C0688a b2 = z.a.b(hashSet, bundle, y, str4);
                C0724m c = z.a.c(bundle, request.u);
                u.d.c cVar5 = u.d.Companion;
                u.c cVar6 = n.i;
                cVar5.getClass();
                b = new u.d(cVar6, u.d.a.SUCCESS, b2, c, null, null);
                if (n.o() != null) {
                    try {
                        CookieSyncManager.createInstance(n.o()).sync();
                    } catch (Exception unused) {
                    }
                    if (b2 != null) {
                        String str5 = b2.e;
                        Context o = n().o();
                        if (o == null) {
                            o = com.facebook.w.a();
                        }
                        o.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str5).apply();
                    }
                }
            } catch (C0728q e) {
                b = u.d.c.c(u.d.Companion, n.i, null, e.getMessage());
            }
        } else if (c0728q instanceof C0729s) {
            u.d.c cVar7 = u.d.Companion;
            u.c cVar8 = n.i;
            cVar7.getClass();
            b = u.d.c.a(cVar8, "User canceled log in.");
        } else {
            this.c = null;
            String message2 = c0728q != null ? c0728q.getMessage() : null;
            if (c0728q instanceof com.facebook.y) {
                com.facebook.t tVar2 = ((com.facebook.y) c0728q).b;
                str = String.valueOf(tVar2.b);
                message2 = tVar2.toString();
            } else {
                str = null;
            }
            u.d.c cVar9 = u.d.Companion;
            u.c cVar10 = n.i;
            cVar9.getClass();
            b = u.d.c.b(cVar10, null, message2, str);
        }
        if (!com.facebook.internal.E.z(this.c)) {
            q(this.c);
        }
        n.n(b);
    }
}

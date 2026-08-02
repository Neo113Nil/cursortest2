package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.credentials.provider.CredentialEntry;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0727p;
import com.facebook.C0728q;
import com.facebook.EnumC0718l;
import com.facebook.internal.C0711g;
import com.facebook.internal.F;
import com.facebook.internal.J;
import com.facebook.login.u;
import com.google.firebase.messaging.Constants;
import io.flutter.plugins.firebase.auth.Constants;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class E extends D {
    public J d;
    public String e;
    public final String f;
    public final EnumC0718l i;
    public static final c Companion = new c();

    @JvmField
    public static final Parcelable.Creator<E> CREATOR = new b();

    public final class a extends J.a {
        public String e;
        public t f;
        public A g;
        public boolean h;
        public boolean i;
        public u.c j;
        public String k;
        public String l;
    }

    public static final class b implements Parcelable.Creator<E> {
        @Override // android.os.Parcelable.Creator
        public final E createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new E(source);
        }

        @Override // android.os.Parcelable.Creator
        public final E[] newArray(int i) {
            return new E[i];
        }
    }

    public static final class c {
    }

    public static final class d extends J {
        public static final a Companion = new a();
        public final String p;

        public static final class a {

            /* renamed from: com.facebook.login.E$d$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0096a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[A.values().length];
                    try {
                        iArr[1] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(FragmentActivity context, String url, String expectedRedirectUrl) {
            super(context, url);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(expectedRedirectUrl, "customRedirectUri");
            this.p = expectedRedirectUrl;
            Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
            this.b = expectedRedirectUrl;
        }

        @Override // com.facebook.internal.J
        public final Bundle c(String str) {
            boolean startsWith$default;
            if (str != null) {
                String str2 = this.p;
                if (str2.length() > 0) {
                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, str2, false, 2, null);
                    if (startsWith$default) {
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                            intent.addFlags(268435456);
                            getContext().startActivity(intent);
                            dismiss();
                        } catch (Exception e) {
                            e(new C0727p("Failed to launch custom redirect: " + e.getMessage(), -1, str));
                        }
                        return new Bundle();
                    }
                }
            }
            return super.c(str);
        }
    }

    public static final class e implements J.d {
        public final /* synthetic */ u.c b;

        public e(u.c cVar) {
            this.b = cVar;
        }

        @Override // com.facebook.internal.J.d
        public final void a(Bundle bundle, C0728q c0728q) {
            E e = E.this;
            e.getClass();
            u.c request = this.b;
            Intrinsics.checkNotNullParameter(request, "request");
            e.z(request, bundle, c0728q);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f = "web_view";
        this.i = EnumC0718l.WEB_VIEW;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.z
    public final void l() {
        J j = this.d;
        if (j != null) {
            if (j != null) {
                j.cancel();
            }
            this.d = null;
        }
    }

    @Override // com.facebook.login.z
    public final String o() {
        return this.f;
    }

    @Override // com.facebook.login.z
    public final int u(u.c request) {
        J j;
        Uri a2;
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle parameters = w(request);
        v(parameters, request);
        e eVar = new e(request);
        u.Companion.getClass();
        String a3 = u.b.a();
        this.e = a3;
        h("e2e", a3);
        FragmentActivity context = n().o();
        if (context == null) {
            return 0;
        }
        boolean w = com.facebook.internal.E.w(context);
        String applicationId = request.d;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(Constants.SIGN_IN_METHOD_OAUTH, "action");
        a aVar = new a();
        if (applicationId == null) {
            applicationId = com.facebook.internal.E.p(context);
        }
        F.e(applicationId, "applicationId");
        aVar.b = applicationId;
        aVar.a = context;
        aVar.d = parameters;
        aVar.e = "fbconnect://success";
        aVar.f = t.NATIVE_WITH_FALLBACK;
        aVar.g = A.FACEBOOK;
        aVar.j = request;
        String e2e = this.e;
        Intrinsics.checkNotNull(e2e, "null cannot be cast to non-null type kotlin.String");
        Intrinsics.checkNotNullParameter(e2e, "e2e");
        Intrinsics.checkNotNullParameter(e2e, "<set-?>");
        aVar.k = e2e;
        aVar.e = w ? "fbconnect://chrome_os_success" : "fbconnect://success";
        String authType = request.l;
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(authType, "<set-?>");
        aVar.l = authType;
        t loginBehavior = request.a;
        Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
        aVar.f = loginBehavior;
        A targetApp = request.p;
        Intrinsics.checkNotNullParameter(targetApp, "targetApp");
        aVar.g = targetApp;
        aVar.h = request.q;
        aVar.i = request.r;
        aVar.c = eVar;
        Bundle bundle = aVar.d;
        Intrinsics.checkNotNull(bundle, "null cannot be cast to non-null type android.os.Bundle");
        u.c cVar = aVar.j;
        String str = cVar.e;
        boolean z = str == null || str.length() == 0;
        if (!bundle.containsKey("redirect_uri")) {
            bundle.putString("redirect_uri", aVar.e);
        }
        bundle.putString("client_id", aVar.b);
        String str2 = aVar.k;
        String str3 = null;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("e2e");
            str2 = null;
        }
        bundle.putString("e2e", str2);
        bundle.putString("response_type", aVar.g == A.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
        bundle.putString("return_scopes", CredentialEntry.TRUE_STRING);
        String str4 = aVar.l;
        if (str4 != null) {
            str3 = str4;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("authType");
        }
        bundle.putString("auth_type", str3);
        bundle.putString("login_behavior", aVar.f.name());
        if (aVar.h) {
            bundle.putString("fx_app", aVar.g.a);
        }
        if (aVar.i) {
            bundle.putString("skip_dedupe", CredentialEntry.TRUE_STRING);
        }
        if (z) {
            J.b bVar = J.Companion;
            FragmentActivity context2 = aVar.a;
            Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.content.Context");
            A targetApp2 = aVar.g;
            J.d dVar = aVar.c;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(targetApp2, "targetApp");
            J.b(context2);
            j = new J(context2, Constants.SIGN_IN_METHOD_OAUTH, bundle, targetApp2, dVar);
        } else {
            d.a aVar2 = d.Companion;
            FragmentActivity context3 = aVar.a;
            Intrinsics.checkNotNull(context3, "null cannot be cast to non-null type android.content.Context");
            A targetApp3 = aVar.g;
            J.d dVar2 = aVar.c;
            String customRedirectUri = cVar.e;
            Intrinsics.checkNotNull(customRedirectUri);
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(context3, "context");
            Intrinsics.checkNotNullParameter(targetApp3, "targetApp");
            Intrinsics.checkNotNullParameter(customRedirectUri, "customRedirectUri");
            Bundle bundle2 = new Bundle(bundle);
            bundle2.putString(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "touch");
            bundle2.putString("client_id", com.facebook.w.b());
            bundle2.putString("sdk", "android-18.3.0");
            if (d.a.C0096a.$EnumSwitchMapping$0[targetApp3.ordinal()] == 1) {
                a2 = com.facebook.internal.E.a(com.facebook.internal.A.b(), "oauth/authorize", bundle2);
            } else {
                a2 = com.facebook.internal.E.a(com.facebook.internal.A.a(), com.facebook.w.d() + "/dialog/oauth", bundle2);
            }
            J.b(context3);
            String uri = a2.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "uri.toString()");
            j = new d(context3, uri, customRedirectUri);
            j.c = dVar2;
        }
        this.d = j;
        C0711g c0711g = new C0711g();
        c0711g.setRetainInstance(true);
        c0711g.a = this.d;
        c0711g.show(context.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.z, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i);
        dest.writeString(this.e);
    }

    @Override // com.facebook.login.D
    public final EnumC0718l y() {
        return this.i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f = "web_view";
        this.i = EnumC0718l.WEB_VIEW;
        this.e = source.readString();
    }
}

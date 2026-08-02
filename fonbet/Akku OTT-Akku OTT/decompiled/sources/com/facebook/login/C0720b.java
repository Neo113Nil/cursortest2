package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0728q;
import com.facebook.C0729s;
import com.facebook.CustomTabMainActivity;
import com.facebook.EnumC0718l;
import com.facebook.internal.C0708d;
import com.facebook.internal.C0709e;
import com.facebook.internal.q;
import com.facebook.login.C0721c;
import com.facebook.login.u;
import com.google.firebase.messaging.Constants;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0720b extends D {

    @JvmField
    public static boolean k;
    public String d;
    public final String e;
    public final String f;
    public final String i;
    public final EnumC0718l j;
    public static final C0097b Companion = new C0097b();

    @JvmField
    public static final Parcelable.Creator<C0720b> CREATOR = new a();

    /* renamed from: com.facebook.login.b$a */
    public static final class a implements Parcelable.Creator<C0720b> {
        @Override // android.os.Parcelable.Creator
        public final C0720b createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new C0720b(source);
        }

        @Override // android.os.Parcelable.Creator
        public final C0720b[] newArray(int i) {
            return new C0720b[i];
        }
    }

    /* renamed from: com.facebook.login.b$b, reason: collision with other inner class name */
    public static final class C0097b {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0720b(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.i = "custom_tab";
        this.j = EnumC0718l.CHROME_CUSTOM_TAB;
        com.facebook.internal.E e = com.facebook.internal.E.a;
        String bigInteger = new BigInteger(100, new SecureRandom()).toString(32);
        Intrinsics.checkNotNullExpressionValue(bigInteger, "BigInteger(length * 5, r).toString(32)");
        this.e = bigInteger;
        k = false;
        this.f = C0709e.c(super.p());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.z
    public final String o() {
        return this.i;
    }

    @Override // com.facebook.login.z
    public final String p() {
        return this.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r9 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r9.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false) != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    @Override // com.facebook.login.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(int i, int i2, Intent intent) {
        u.c cVar;
        String str;
        boolean startsWith$default;
        int parseInt;
        boolean startsWith$default2;
        boolean z = false;
        if (intent != null) {
            CustomTabMainActivity.Companion companion = CustomTabMainActivity.INSTANCE;
        }
        if (i == 1 && (cVar = n().i) != null) {
            if (i2 != -1) {
                z(cVar, null, new C0729s());
                return false;
            }
            if (intent != null) {
                CustomTabMainActivity.Companion companion2 = CustomTabMainActivity.INSTANCE;
                str = intent.getStringExtra("CustomTabMainActivity.extra_url");
            } else {
                str = null;
            }
            if (str != null) {
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "fbconnect://cct.", false, 2, null);
                if (!startsWith$default) {
                    startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str, super.p(), false, 2, null);
                }
                Uri parse = Uri.parse(str);
                Bundle E = com.facebook.internal.E.E(parse.getQuery());
                E.putAll(com.facebook.internal.E.E(parse.getFragment()));
                try {
                    String string = E.getString("state");
                    if (string != null) {
                        z = Intrinsics.areEqual(new JSONObject(string).getString("7_challenge"), this.e);
                    }
                } catch (JSONException unused) {
                }
                if (z) {
                    String string2 = E.getString(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                    if (string2 == null) {
                        string2 = E.getString("error_type");
                    }
                    String string3 = E.getString("error_msg");
                    if (string3 == null) {
                        string3 = E.getString("error_message");
                    }
                    if (string3 == null) {
                        string3 = E.getString("error_description");
                    }
                    String string4 = E.getString("error_code");
                    if (string4 != null) {
                        try {
                            parseInt = Integer.parseInt(string4);
                        } catch (NumberFormatException unused2) {
                        }
                        if (!com.facebook.internal.E.z(string2) && com.facebook.internal.E.z(string3) && parseInt == -1) {
                            if (E.containsKey("access_token")) {
                                z(cVar, E, null);
                            } else {
                                com.facebook.w.c().execute(new androidx.media3.exoplayer.drm.u(this, cVar, E, 1));
                            }
                        } else if (string2 == null && (Intrinsics.areEqual(string2, "access_denied") || Intrinsics.areEqual(string2, "OAuthAccessDeniedException"))) {
                            z(cVar, null, new C0729s());
                        } else if (parseInt != 4201) {
                            z(cVar, null, new C0729s());
                        } else {
                            z(cVar, null, new com.facebook.y(new com.facebook.t(parseInt, string2, string3), string3));
                        }
                    }
                    parseInt = -1;
                    if (!com.facebook.internal.E.z(string2)) {
                    }
                    if (string2 == null) {
                    }
                    if (parseInt != 4201) {
                    }
                } else {
                    z(cVar, null, new C0728q("Invalid state parameter"));
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.login.z
    public final void t(JSONObject param) throws JSONException {
        Intrinsics.checkNotNullParameter(param, "param");
        param.put("7_challenge", this.e);
    }

    @Override // com.facebook.login.z
    public final int u(u.c request) {
        CustomTabsClient customTabsClient;
        CustomTabsClient customTabsClient2;
        Intrinsics.checkNotNullParameter(request, "request");
        u n = n();
        if (this.f.length() == 0) {
            return 0;
        }
        Bundle w = w(request);
        A a2 = request.p;
        v(w, request);
        if (k) {
            w.putString("cct_over_app_switch", "1");
        }
        if (com.facebook.w.n) {
            if (a2 == A.INSTAGRAM) {
                C0721c.a aVar = C0721c.Companion;
                com.facebook.internal.q.Companion.getClass();
                Uri url = q.a.a(w, io.flutter.plugins.firebase.auth.Constants.SIGN_IN_METHOD_OAUTH);
                aVar.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                ReentrantLock reentrantLock = C0721c.c;
                reentrantLock.lock();
                if (C0721c.b == null && (customTabsClient2 = C0721c.a) != null) {
                    C0721c.b = customTabsClient2.newSession(null);
                }
                reentrantLock.unlock();
                reentrantLock.lock();
                CustomTabsSession customTabsSession = C0721c.b;
                if (customTabsSession != null) {
                    customTabsSession.mayLaunchUrl(url, null, null);
                }
                reentrantLock.unlock();
            } else {
                C0721c.a aVar2 = C0721c.Companion;
                C0708d.Companion.getClass();
                Uri url2 = C0708d.a.a(w, io.flutter.plugins.firebase.auth.Constants.SIGN_IN_METHOD_OAUTH);
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                ReentrantLock reentrantLock2 = C0721c.c;
                reentrantLock2.lock();
                if (C0721c.b == null && (customTabsClient = C0721c.a) != null) {
                    C0721c.b = customTabsClient.newSession(null);
                }
                reentrantLock2.unlock();
                reentrantLock2.lock();
                CustomTabsSession customTabsSession2 = C0721c.b;
                if (customTabsSession2 != null) {
                    customTabsSession2.mayLaunchUrl(url2, null, null);
                }
                reentrantLock2.unlock();
            }
        }
        FragmentActivity o = n.o();
        if (o == null) {
            return 0;
        }
        Intent intent = new Intent(o, (Class<?>) CustomTabMainActivity.class);
        CustomTabMainActivity.Companion companion = CustomTabMainActivity.INSTANCE;
        intent.putExtra("CustomTabMainActivity.extra_action", io.flutter.plugins.firebase.auth.Constants.SIGN_IN_METHOD_OAUTH);
        intent.putExtra("CustomTabMainActivity.extra_params", w);
        String str = this.d;
        if (str == null) {
            str = C0709e.a();
            this.d = str;
        }
        intent.putExtra("CustomTabMainActivity.extra_chromePackage", str);
        intent.putExtra("CustomTabMainActivity.extra_targetApp", a2.a);
        v vVar = n.c;
        if (vVar != null) {
            vVar.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.D
    public final void v(Bundle parameters, u.c request) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(request, "request");
        super.v(parameters, request);
        String str = request.f;
        String str2 = request.e;
        if (str2 == null || str2.length() == 0) {
            if (str == null || str.length() == 0) {
                str2 = this.f;
            } else {
                Intrinsics.checkNotNull(str);
                str2 = "intent://".concat(str);
            }
        }
        parameters.putString("redirect_uri", str2);
    }

    @Override // com.facebook.login.z, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i);
        dest.writeString(this.e);
    }

    @Override // com.facebook.login.D
    public final String x() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.D
    public final EnumC0718l y() {
        return this.j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0720b(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.i = "custom_tab";
        this.j = EnumC0718l.CHROME_CUSTOM_TAB;
        this.e = source.readString();
        this.f = C0709e.c(super.p());
    }
}

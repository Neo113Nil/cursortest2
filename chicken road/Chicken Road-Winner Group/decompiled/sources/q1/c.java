package q1;

import android.content.Context;
import android.content.pm.PackageManager;
import b0.j;
import com.amazon.privacypass.PrivacyPass;
import com.amazon.privacypass.VerificationContext;
import com.amazon.privacypass.callback.AttestAPICallback;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements InterfaceC1171a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10262a;

    /* renamed from: b, reason: collision with root package name */
    public final d f10263b;

    public c(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Application context cannot be null");
        }
        this.f10262a = context;
        this.f10263b = d.a(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        if (r0.startsWith("http://") == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(j jVar) {
        Boolean bool;
        PackageManager packageManager;
        boolean hasSystemFeature;
        boolean z3;
        Map map;
        d dVar = this.f10263b;
        boolean z4 = false;
        if (dVar.f10266b != null) {
            z3 = dVar.f10266b.booleanValue();
        } else {
            synchronized (dVar) {
                try {
                    if (dVar.f10266b != null) {
                        hasSystemFeature = dVar.f10266b.booleanValue();
                    } else {
                        if (dVar.b()) {
                            try {
                                packageManager = dVar.f10267c.getPackageManager();
                            } catch (SecurityException unused) {
                                bool = Boolean.FALSE;
                            } catch (Exception unused2) {
                                bool = Boolean.FALSE;
                            }
                            if (packageManager == null) {
                                dVar.f10266b = Boolean.FALSE;
                                z3 = false;
                            } else {
                                hasSystemFeature = packageManager.hasSystemFeature("com.amazon.privacypass");
                                dVar.f10266b = Boolean.valueOf(hasSystemFeature);
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                        dVar.f10266b = bool;
                        z3 = false;
                    }
                    z3 = hasSystemFeature;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z3 && (map = (Map) jVar.f2462a) != null) {
            String str = (String) map.get("verifierurl");
            String str2 = (String) ((Map) jVar.f2462a).get("version");
            if (str2 == null || str2.trim().isEmpty()) {
                str2 = "1.0";
            }
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            try {
                new URL(str);
                if (!str.startsWith("https://")) {
                }
                z4 = true;
            } catch (MalformedURLException unused3) {
            }
            if (z4) {
                try {
                    if (this.f10262a == null) {
                        return;
                    }
                    PrivacyPass.getInstance(this.f10262a).attest(new VerificationContext(Collections.singletonList(str)), (AttestAPICallback) null, str2);
                } catch (IllegalArgumentException | Exception unused4) {
                }
            }
        }
    }
}

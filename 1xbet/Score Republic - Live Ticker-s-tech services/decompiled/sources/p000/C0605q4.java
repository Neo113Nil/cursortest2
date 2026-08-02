package p000;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;

/* JADX INFO: renamed from: q4 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0605q4 implements InterfaceC0931yy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6365a;

    /* JADX INFO: renamed from: b */
    public final Object f6366b;

    public C0605q4(qd0 qd0Var, C0568p4 c0568p4) {
        this.f6365a = 0;
        this.f6366b = c0568p4;
    }

    @Override // p000.ny0
    public final Object get() {
        Signature[] signatureArr;
        Signature signature;
        int i = this.f6365a;
        Object obj = this.f6366b;
        switch (i) {
            case 0:
                return new wc1((x90) ((C0568p4) obj).get());
            case 1:
                Application application = (Application) ((b90) obj).f793k;
                yd0.m5765d(application);
                return application;
            case 2:
                x80 x80Var = np0.f5485d;
                BitSet bitSet = kp0.f4493d;
                jp0 jp0Var = new jp0("X-Goog-Api-Key", x80Var);
                jp0 jp0Var2 = new jp0("X-Android-Package", x80Var);
                jp0 jp0Var3 = new jp0("X-Android-Cert", x80Var);
                np0 np0Var = new np0();
                w00 w00Var = ((x90) obj).f8872a;
                w00Var.m5224a();
                Context context = w00Var.f8318a;
                String packageName = context.getPackageName();
                w00Var.m5224a();
                np0Var.m3581e(jp0Var, w00Var.f8320c.f6650a);
                np0Var.m3581e(jp0Var2, packageName);
                w00Var.m5224a();
                String strM3197c = null;
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
                    if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && (signature = signatureArr[0]) != null) {
                        strM3197c = C0427lb.f4750f.m3200h().m3197c(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
                    }
                    break;
                } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
                }
                if (strM3197c != null) {
                    np0Var.m3581e(jp0Var3, strM3197c);
                }
                return np0Var;
            default:
                return obj;
        }
    }

    public /* synthetic */ C0605q4(int i, Object obj) {
        this.f6365a = i;
        this.f6366b = obj;
    }
}

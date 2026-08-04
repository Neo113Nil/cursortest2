package p046g0;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p155w1.C1009l0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends C1009l0 {
    @Override // p155w1.C1009l0
    public final Signature[] k(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}

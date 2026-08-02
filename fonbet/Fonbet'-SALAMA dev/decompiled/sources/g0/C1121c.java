package g0;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import w1.C1718l0;

/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1121c extends C1718l0 {
    @Override // w1.C1718l0
    public final Signature[] k(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}

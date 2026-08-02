package v1;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import l3.C2054a;

/* loaded from: classes.dex */
public final class c extends C2054a {
    @Override // l3.C2054a
    public final Signature[] i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}

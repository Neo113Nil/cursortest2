package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class g extends f {
    @Override // androidx.emoji2.text.e
    @NonNull
    public final Signature[] b(@NonNull PackageManager packageManager, @NonNull String str) throws PackageManager.NameNotFoundException {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}

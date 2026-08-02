package androidx.emoji2.text;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes.dex */
public class e {
    public ProviderInfo a(@NonNull ResolveInfo resolveInfo) {
        throw null;
    }

    @NonNull
    public Signature[] b(@NonNull PackageManager packageManager, @NonNull String str) throws PackageManager.NameNotFoundException {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @NonNull
    public List c(@NonNull PackageManager packageManager, @NonNull Intent intent) {
        throw null;
    }
}

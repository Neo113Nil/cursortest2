package androidx.emoji2.text;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes.dex */
public class f extends e {
    @Override // androidx.emoji2.text.e
    public final ProviderInfo a(@NonNull ResolveInfo resolveInfo) {
        return resolveInfo.providerInfo;
    }

    @Override // androidx.emoji2.text.e
    @NonNull
    public final List c(@NonNull PackageManager packageManager, @NonNull Intent intent) {
        return packageManager.queryIntentContentProviders(intent, 0);
    }
}

package Ve;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Xi {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30395a;

    public Xi(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30395a = context;
    }

    public final String a(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            PackageManager packageManager = this.f30395a.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, UserVerificationMethods.USER_VERIFY_PATTERN);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "packageManager.getApplic…ageManager.GET_META_DATA)");
            CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
            Intrinsics.g(applicationLabel, "null cannot be cast to non-null type kotlin.String");
            return (String) applicationLabel;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}

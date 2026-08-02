package com.miteksystems.misnap.workflow.util;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/miteksystems/misnap/workflow/util/PermissionsUtil;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "", "hasPermission", "(Landroid/content/Context;Ljava/lang/String;)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PermissionsUtil {
    public static final com.miteksystems.misnap.workflow.util.PermissionsUtil INSTANCE = new com.miteksystems.misnap.workflow.util.PermissionsUtil();

    @kotlin.jvm.JvmStatic
    public static final boolean hasPermission(android.content.Context context, java.lang.String permission) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permission, "");
        return androidx.core.content.ContextCompat.checkSelfPermission(context, permission) == 0;
    }

    private PermissionsUtil() {
    }
}

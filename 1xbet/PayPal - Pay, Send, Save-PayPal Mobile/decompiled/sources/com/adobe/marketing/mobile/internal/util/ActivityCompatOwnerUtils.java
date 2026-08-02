package com.adobe.marketing.mobile.internal.util;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/internal/util/ActivityCompatOwnerUtils;", "", "<init>", "()V", "Landroid/app/Activity;", "activityToAttach", "", "attachActivityCompatOwner$core_phoneRelease", "(Landroid/app/Activity;)V", "activityToDetach", "detachActivityCompatOwner$core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityCompatOwnerUtils {
    public final void attachActivityCompatOwner$core_phoneRelease(android.app.Activity activityToAttach) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityToAttach, "");
        android.view.View decorView = activityToAttach.getWindow().getDecorView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decorView, "");
        if (androidx.view.C0276ViewTreeLifecycleOwner.get(decorView) != null) {
            return;
        }
        com.adobe.marketing.mobile.internal.util.ActivityCompatOwner activityCompatOwner = new com.adobe.marketing.mobile.internal.util.ActivityCompatOwner();
        activityCompatOwner.onCreate$core_phoneRelease();
        activityCompatOwner.attachToView$core_phoneRelease(decorView);
    }

    public final void detachActivityCompatOwner$core_phoneRelease(android.app.Activity activityToDetach) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityToDetach, "");
        android.view.View decorView = activityToDetach.getWindow().getDecorView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decorView, "");
        androidx.view.LifecycleOwner lifecycleOwner = androidx.view.C0276ViewTreeLifecycleOwner.get(decorView);
        if (lifecycleOwner instanceof com.adobe.marketing.mobile.internal.util.ActivityCompatOwner) {
            com.adobe.marketing.mobile.internal.util.ActivityCompatOwner activityCompatOwner = (com.adobe.marketing.mobile.internal.util.ActivityCompatOwner) lifecycleOwner;
            activityCompatOwner.detachFromView$core_phoneRelease(decorView);
            activityCompatOwner.onDestroy$core_phoneRelease();
        }
    }
}

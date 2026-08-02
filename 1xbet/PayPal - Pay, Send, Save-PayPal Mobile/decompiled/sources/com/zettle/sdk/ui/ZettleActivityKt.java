package com.zettle.sdk.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\" \u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00008GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/app/Activity;", "Lcom/zettle/sdk/features/Action;", "getAction", "(Landroid/app/Activity;)Lcom/zettle/sdk/features/Action;", "getAction$annotations", "(Landroid/app/Activity;)V", "action"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZettleActivityKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Implement the ZettleFragment and use that to retreieve the action, or handle it internally in your feature.")
    public static /* synthetic */ void getAction$annotations(android.app.Activity activity) {
    }

    public static final com.zettle.sdk.features.Action getAction(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        com.zettle.sdk.ui.ZettleActivity zettleActivity = activity instanceof com.zettle.sdk.ui.ZettleActivity ? (com.zettle.sdk.ui.ZettleActivity) activity : null;
        if (zettleActivity != null) {
            return zettleActivity.getRunningAction$core_publicRelease();
        }
        return null;
    }
}

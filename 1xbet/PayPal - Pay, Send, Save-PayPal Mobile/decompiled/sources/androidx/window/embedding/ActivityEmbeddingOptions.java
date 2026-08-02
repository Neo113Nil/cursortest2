package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroid/os/Bundle;", "Landroid/content/Context;", "context", "Landroidx/window/embedding/ActivityStack;", "activityStack", "setLaunchingActivityStack", "(Landroid/os/Bundle;Landroid/content/Context;Landroidx/window/embedding/ActivityStack;)Landroid/os/Bundle;", "Landroid/app/Activity;", "activity", "Landroidx/window/embedding/OverlayCreateParams;", "overlayCreateParams", "setOverlayCreateParams", "(Landroid/os/Bundle;Landroid/app/Activity;Landroidx/window/embedding/OverlayCreateParams;)Landroid/os/Bundle;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityEmbeddingOptions {
    public static final android.os.Bundle setLaunchingActivityStack(android.os.Bundle bundle, android.content.Context context, androidx.window.embedding.ActivityStack activityStack) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStack, "");
        return androidx.window.embedding.ActivityEmbeddingController.INSTANCE.getInstance(context).setLaunchingActivityStack$window_release(bundle, activityStack);
    }

    public static final android.os.Bundle setOverlayCreateParams(android.os.Bundle bundle, android.app.Activity activity, androidx.window.embedding.OverlayCreateParams overlayCreateParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overlayCreateParams, "");
        return androidx.window.embedding.OverlayController.INSTANCE.getInstance(activity).setOverlayCreateParams$window_release(bundle, overlayCreateParams);
    }
}

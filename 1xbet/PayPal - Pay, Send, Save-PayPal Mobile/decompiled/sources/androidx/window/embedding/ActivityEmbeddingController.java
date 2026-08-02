package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001%B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Landroidx/window/embedding/ActivityEmbeddingController;", "", "Landroidx/window/embedding/EmbeddingBackend;", "backend", "<init>", "(Landroidx/window/embedding/EmbeddingBackend;)V", "Landroid/app/Activity;", "activity", "", "isActivityEmbedded", "(Landroid/app/Activity;)Z", "Landroidx/window/embedding/ActivityStack;", "getActivityStack", "(Landroid/app/Activity;)Landroidx/window/embedding/ActivityStack;", "Landroid/os/Bundle;", "options", "activityStack", "setLaunchingActivityStack$window_release", "(Landroid/os/Bundle;Landroidx/window/embedding/ActivityStack;)Landroid/os/Bundle;", "", "activityStacks", "", "finishActivityStacks", "(Ljava/util/Set;)V", "Landroidx/window/embedding/EmbeddingConfiguration;", "embeddingConfiguration", "setEmbeddingConfiguration", "(Landroidx/window/embedding/EmbeddingConfiguration;)V", "invalidateVisibleActivityStacks", "()V", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/window/embedding/EmbeddedActivityWindowInfo;", "embeddedActivityWindowInfo", "(Landroid/app/Activity;)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRanges", "Landroidx/window/embedding/EmbeddingBackend;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityEmbeddingController {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.embedding.ActivityEmbeddingController.Companion INSTANCE = new androidx.window.embedding.ActivityEmbeddingController.Companion(null);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.window.embedding.EmbeddingBackend Camera2StreamConfigurationMap;

    public ActivityEmbeddingController(androidx.window.embedding.EmbeddingBackend embeddingBackend) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingBackend, "");
        this.Camera2StreamConfigurationMap = embeddingBackend;
    }

    public final boolean isActivityEmbedded(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return this.Camera2StreamConfigurationMap.isActivityEmbedded(activity);
    }

    public final androidx.window.embedding.ActivityStack getActivityStack(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return this.Camera2StreamConfigurationMap.getActivityStack(activity);
    }

    public final android.os.Bundle setLaunchingActivityStack$window_release(android.os.Bundle options, androidx.window.embedding.ActivityStack activityStack) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStack, "");
        return this.Camera2StreamConfigurationMap.setLaunchingActivityStack(options, activityStack);
    }

    public final void finishActivityStacks(java.util.Set<androidx.window.embedding.ActivityStack> activityStacks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStacks, "");
        this.Camera2StreamConfigurationMap.finishActivityStacks(activityStacks);
    }

    public final void setEmbeddingConfiguration(androidx.window.embedding.EmbeddingConfiguration embeddingConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingConfiguration, "");
        this.Camera2StreamConfigurationMap.setEmbeddingConfiguration(embeddingConfiguration);
    }

    public final void invalidateVisibleActivityStacks() {
        this.Camera2StreamConfigurationMap.invalidateVisibleActivityStacks();
    }

    public final kotlinx.coroutines.flow.Flow<androidx.window.embedding.EmbeddedActivityWindowInfo> embeddedActivityWindowInfo(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.window.embedding.ActivityEmbeddingController$embeddedActivityWindowInfo$1(this, activity, null));
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/window/embedding/ActivityEmbeddingController$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/window/embedding/ActivityEmbeddingController;", "getInstance", "(Landroid/content/Context;)Landroidx/window/embedding/ActivityEmbeddingController;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.window.embedding.ActivityEmbeddingController getInstance(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new androidx.window.embedding.ActivityEmbeddingController(androidx.window.embedding.EmbeddingBackend.INSTANCE.getInstance(context));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.window.embedding.ActivityEmbeddingController getInstance(android.content.Context context) {
        return INSTANCE.getInstance(context);
    }
}

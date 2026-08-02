package androidx.view.result;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/activity/result/ActivityResult;", "", "component1", "(Landroidx/activity/result/ActivityResult;)I", "Landroid/content/Intent;", "component2", "(Landroidx/activity/result/ActivityResult;)Landroid/content/Intent;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActivityResultKt {
    public static final int component1(androidx.view.result.ActivityResult activityResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "");
        return activityResult.getResultCode();
    }

    public static final android.content.Intent component2(androidx.view.result.ActivityResult activityResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "");
        return activityResult.getData();
    }
}

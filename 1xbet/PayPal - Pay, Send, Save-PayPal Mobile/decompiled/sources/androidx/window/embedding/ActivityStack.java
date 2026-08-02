package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B)\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u001f\b\u0017\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u000bJ\r\u0010\u000f\u001a\u00020\bH\u0001¢\u0006\u0002\b\u0010J\u0011\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004H\u0086\u0002J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/window/embedding/ActivityStack;", "", "activitiesInProcess", "", "Landroid/app/Activity;", "isEmpty", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Landroidx/window/extensions/embedding/ActivityStack$Token;", "<init>", "(Ljava/util/List;ZLandroidx/window/extensions/embedding/ActivityStack$Token;)V", "(Ljava/util/List;Z)V", "getActivitiesInProcess$window_release", "()Ljava/util/List;", "()Z", "getToken", "getToken$window_release", "contains", "activity", "equals", "other", "hashCode", "", "toString", "", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityStack {
    private final java.util.List<android.app.Activity> Camera2StreamConfigurationMap;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final androidx.window.extensions.embedding.ActivityStack.Token getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityStack(java.util.List<? extends android.app.Activity> list, boolean z, androidx.window.extensions.embedding.ActivityStack.Token token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.Camera2StreamConfigurationMap = list;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoSizes = token;
    }

    public final java.util.List<android.app.Activity> getActivitiesInProcess$window_release() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: isEmpty, reason: from getter */
    public final boolean getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityStack(java.util.List<? extends android.app.Activity> list, boolean z) {
        this(list, z, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    public final androidx.window.extensions.embedding.ActivityStack.Token getToken$window_release() {
        androidx.window.WindowSdkExtensions.INSTANCE.getInstance().requireExtensionVersion$window_release(5);
        androidx.window.extensions.embedding.ActivityStack.Token token = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(token);
        return token;
    }

    public final boolean contains(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return this.Camera2StreamConfigurationMap.contains(activity);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.ActivityStack)) {
            return false;
        }
        androidx.window.embedding.ActivityStack activityStack = (androidx.window.embedding.ActivityStack) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, activityStack.Camera2StreamConfigurationMap) && this.getHighSpeedVideoFpsRangesFor == activityStack.getHighSpeedVideoFpsRangesFor && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, activityStack.getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        int hashCode = this.Camera2StreamConfigurationMap.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRangesFor);
        androidx.window.extensions.embedding.ActivityStack.Token token = this.getHighSpeedVideoSizes;
        return (((hashCode * 31) + hashCode2) * 31) + (token != null ? token.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityStack{activitiesInProcess=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", isEmpty=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", token=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}

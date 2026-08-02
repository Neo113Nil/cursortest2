package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B5\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB)\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\rB)\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u000eB!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u000fJ\r\u0010\u0017\u001a\u00020\bH\u0001¢\u0006\u0002\b\u0018J\r\u0010\u0019\u001a\u00020\nH\u0001¢\u0006\u0002\b\u001aJ\u0011\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0086\u0002J\u0013\u0010\u001f\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Landroidx/window/embedding/SplitInfo;", "", "primaryActivityStack", "Landroidx/window/embedding/ActivityStack;", "secondaryActivityStack", "splitAttributes", "Landroidx/window/embedding/SplitAttributes;", "binder", "Landroid/os/IBinder;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Landroidx/window/extensions/embedding/SplitInfo$Token;", "<init>", "(Landroidx/window/embedding/ActivityStack;Landroidx/window/embedding/ActivityStack;Landroidx/window/embedding/SplitAttributes;Landroid/os/IBinder;Landroidx/window/extensions/embedding/SplitInfo$Token;)V", "(Landroidx/window/embedding/ActivityStack;Landroidx/window/embedding/ActivityStack;Landroidx/window/embedding/SplitAttributes;Landroidx/window/extensions/embedding/SplitInfo$Token;)V", "(Landroidx/window/embedding/ActivityStack;Landroidx/window/embedding/ActivityStack;Landroidx/window/embedding/SplitAttributes;Landroid/os/IBinder;)V", "(Landroidx/window/embedding/ActivityStack;Landroidx/window/embedding/ActivityStack;Landroidx/window/embedding/SplitAttributes;)V", "getPrimaryActivityStack", "()Landroidx/window/embedding/ActivityStack;", "getSecondaryActivityStack", "getSplitAttributes", "()Landroidx/window/embedding/SplitAttributes;", "getBinder$annotations", "()V", "getBinder", "getBinder$window_release", "getToken", "getToken$window_release", "contains", "", "activity", "Landroid/app/Activity;", "equals", "other", "hashCode", "", "toString", "", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SplitInfo {
    private final androidx.window.embedding.SplitAttributes Camera2StreamConfigurationMap;
    private final androidx.window.embedding.ActivityStack getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.window.embedding.ActivityStack getHighSpeedVideoFpsRanges;
    private final android.os.IBinder getHighSpeedVideoFpsRangesFor;
    private final androidx.window.extensions.embedding.SplitInfo.Token getHighSpeedVideoSizes;

    private SplitInfo(androidx.window.embedding.ActivityStack activityStack, androidx.window.embedding.ActivityStack activityStack2, androidx.window.embedding.SplitAttributes splitAttributes, android.os.IBinder iBinder, androidx.window.extensions.embedding.SplitInfo.Token token) {
        this.getHighResolutionOutputSizeshNQ4ISI = activityStack;
        this.getHighSpeedVideoFpsRanges = activityStack2;
        this.Camera2StreamConfigurationMap = splitAttributes;
        this.getHighSpeedVideoFpsRangesFor = iBinder;
        this.getHighSpeedVideoSizes = token;
    }

    /* renamed from: getPrimaryActivityStack, reason: from getter */
    public final androidx.window.embedding.ActivityStack getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: getSecondaryActivityStack, reason: from getter */
    public final androidx.window.embedding.ActivityStack getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getSplitAttributes, reason: from getter */
    public final androidx.window.embedding.SplitAttributes getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SplitInfo(androidx.window.embedding.ActivityStack activityStack, androidx.window.embedding.ActivityStack activityStack2, androidx.window.embedding.SplitAttributes splitAttributes, androidx.window.extensions.embedding.SplitInfo.Token token) {
        this(activityStack, activityStack2, splitAttributes, null, token);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStack, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStack2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SplitInfo(androidx.window.embedding.ActivityStack activityStack, androidx.window.embedding.ActivityStack activityStack2, androidx.window.embedding.SplitAttributes splitAttributes, android.os.IBinder iBinder) {
        this(activityStack, activityStack2, splitAttributes, iBinder, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStack, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStack2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iBinder, "");
        androidx.window.WindowSdkExtensions.INSTANCE.getInstance().requireExtensionVersion$window_release(new kotlin.ranges.IntRange(3, 4));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SplitInfo(androidx.window.embedding.ActivityStack activityStack, androidx.window.embedding.ActivityStack activityStack2, androidx.window.embedding.SplitAttributes splitAttributes) {
        this(activityStack, activityStack2, splitAttributes, null, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStack, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStack2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitAttributes, "");
    }

    public final android.os.IBinder getBinder$window_release() {
        androidx.window.WindowSdkExtensions.INSTANCE.getInstance().requireExtensionVersion$window_release(new kotlin.ranges.IntRange(3, 4));
        android.os.IBinder iBinder = this.getHighSpeedVideoFpsRangesFor;
        if (iBinder != null) {
            return iBinder;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
    }

    public final androidx.window.extensions.embedding.SplitInfo.Token getToken$window_release() {
        androidx.window.WindowSdkExtensions.INSTANCE.getInstance().requireExtensionVersion$window_release(5);
        androidx.window.extensions.embedding.SplitInfo.Token token = this.getHighSpeedVideoSizes;
        if (token != null) {
            return token;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
    }

    public final boolean contains(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.contains(activity) || this.getHighSpeedVideoFpsRanges.contains(activity);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.SplitInfo)) {
            return false;
        }
        androidx.window.embedding.SplitInfo splitInfo = (androidx.window.embedding.SplitInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, splitInfo.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, splitInfo.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, splitInfo.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, splitInfo.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, splitInfo.getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        int hashCode = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        int hashCode2 = this.getHighSpeedVideoFpsRanges.hashCode();
        int hashCode3 = this.Camera2StreamConfigurationMap.hashCode();
        androidx.window.extensions.embedding.SplitInfo.Token token = this.getHighSpeedVideoSizes;
        int hashCode4 = token != null ? token.hashCode() : 0;
        android.os.IBinder iBinder = this.getHighSpeedVideoFpsRangesFor;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (iBinder != null ? iBinder.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SplitInfo:{");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("primaryActivityStack=");
        sb2.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb2.append(", ");
        sb.append(sb2.toString());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("secondaryActivityStack=");
        sb3.append(this.getHighSpeedVideoFpsRanges);
        sb3.append(", ");
        sb.append(sb3.toString());
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("splitAttributes=");
        sb4.append(this.Camera2StreamConfigurationMap);
        sb4.append(", ");
        sb.append(sb4.toString());
        if (this.getHighSpeedVideoSizes != null) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("token=");
            sb5.append(this.getHighSpeedVideoSizes);
            sb.append(sb5.toString());
        }
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("binder=");
            sb6.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(sb6.toString());
        }
        sb.append("}");
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}

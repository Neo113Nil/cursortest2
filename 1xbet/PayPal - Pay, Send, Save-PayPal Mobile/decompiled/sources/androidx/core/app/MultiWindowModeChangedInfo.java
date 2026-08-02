package androidx.core.app;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\u0003\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/core/app/MultiWindowModeChangedInfo;", "", "", "isInMultiWindowMode", "<init>", "(Z)V", "Landroid/content/res/Configuration;", "newConfig", "(ZLandroid/content/res/Configuration;)V", "Z", "()Z", "getHighSpeedVideoSizes", "Landroid/content/res/Configuration;", "getHighSpeedVideoFpsRangesFor", "getNewConfig", "()Landroid/content/res/Configuration;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiWindowModeChangedInfo {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.content.res.Configuration getHighSpeedVideoFpsRangesFor;
    private final boolean isInMultiWindowMode;

    public MultiWindowModeChangedInfo(boolean z) {
        this.isInMultiWindowMode = z;
    }

    /* renamed from: isInMultiWindowMode, reason: from getter */
    public final boolean getIsInMultiWindowMode() {
        return this.isInMultiWindowMode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiWindowModeChangedInfo(boolean z, android.content.res.Configuration configuration) {
        this(z);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        this.getHighSpeedVideoFpsRangesFor = configuration;
    }

    public final android.content.res.Configuration getNewConfig() {
        android.content.res.Configuration configuration = this.getHighSpeedVideoFpsRangesFor;
        if (configuration != null) {
            return configuration;
        }
        throw new java.lang.IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?".toString());
    }
}

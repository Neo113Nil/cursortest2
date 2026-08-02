package androidx.core.app;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\u0003\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/core/app/PictureInPictureModeChangedInfo;", "", "", "isInPictureInPictureMode", "<init>", "(Z)V", "Landroid/content/res/Configuration;", "newConfig", "(ZLandroid/content/res/Configuration;)V", "Z", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/res/Configuration;", "getNewConfig", "()Landroid/content/res/Configuration;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PictureInPictureModeChangedInfo {
    private android.content.res.Configuration getHighResolutionOutputSizeshNQ4ISI;
    private final boolean isInPictureInPictureMode;

    public PictureInPictureModeChangedInfo(boolean z) {
        this.isInPictureInPictureMode = z;
    }

    /* renamed from: isInPictureInPictureMode, reason: from getter */
    public final boolean getIsInPictureInPictureMode() {
        return this.isInPictureInPictureMode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PictureInPictureModeChangedInfo(boolean z, android.content.res.Configuration configuration) {
        this(z);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        this.getHighResolutionOutputSizeshNQ4ISI = configuration;
    }

    public final android.content.res.Configuration getNewConfig() {
        android.content.res.Configuration configuration = this.getHighResolutionOutputSizeshNQ4ISI;
        if (configuration != null) {
            return configuration;
        }
        throw new java.lang.IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?".toString());
    }
}

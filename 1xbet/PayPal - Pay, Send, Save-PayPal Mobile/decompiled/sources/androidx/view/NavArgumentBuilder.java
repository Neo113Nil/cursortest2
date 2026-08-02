package androidx.view;

@androidx.view.NavDestinationDsl
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR,\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00148\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR.\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010!\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00148\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001a"}, d2 = {"Landroidx/navigation/NavArgumentBuilder;", "", "<init>", "()V", "Landroidx/navigation/NavArgument;", "build", "()Landroidx/navigation/NavArgument;", "Landroidx/navigation/NavArgument$Builder;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/navigation/NavArgument$Builder;", "getHighSpeedVideoSizes", "Landroidx/navigation/NavType;", "Camera2StreamConfigurationMap", "Landroidx/navigation/NavType;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getType", "()Landroidx/navigation/NavType;", "setType", "(Landroidx/navigation/NavType;)V", "type", "", "nullable", "Z", "getNullable", "()Z", "setNullable", "(Z)V", "defaultValue", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "setDefaultValue", "(Ljava/lang/Object;)V", "unknownDefaultValuePresent", "getUnknownDefaultValuePresent$navigation_common_release", "setUnknownDefaultValuePresent$navigation_common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavArgumentBuilder {
    private androidx.view.NavType<?> Camera2StreamConfigurationMap;
    private java.lang.Object defaultValue;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.navigation.NavArgument.Builder getHighSpeedVideoSizes = new androidx.navigation.NavArgument.Builder();
    private boolean nullable;
    private boolean unknownDefaultValuePresent;

    public final void setType(androidx.view.NavType<?> navType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navType, "");
        this.Camera2StreamConfigurationMap = navType;
        this.getHighSpeedVideoSizes.setType(navType);
    }

    public final androidx.view.NavType<?> getType() {
        androidx.view.NavType<?> navType = this.Camera2StreamConfigurationMap;
        if (navType != null) {
            return navType;
        }
        throw new java.lang.IllegalStateException("NavType has not been set on this builder.");
    }

    public final boolean getNullable() {
        return this.nullable;
    }

    public final void setNullable(boolean z) {
        this.nullable = z;
        this.getHighSpeedVideoSizes.setIsNullable(z);
    }

    public final java.lang.Object getDefaultValue() {
        return this.defaultValue;
    }

    public final void setDefaultValue(java.lang.Object obj) {
        this.defaultValue = obj;
        this.getHighSpeedVideoSizes.setDefaultValue(obj);
    }

    /* renamed from: getUnknownDefaultValuePresent$navigation_common_release, reason: from getter */
    public final boolean getUnknownDefaultValuePresent() {
        return this.unknownDefaultValuePresent;
    }

    public final void setUnknownDefaultValuePresent$navigation_common_release(boolean z) {
        this.unknownDefaultValuePresent = z;
        this.getHighSpeedVideoSizes.setUnknownDefaultValuePresent$navigation_common_release(z);
    }

    public final androidx.view.NavArgument build() {
        return this.getHighSpeedVideoSizes.build();
    }
}

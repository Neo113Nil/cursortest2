package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\b\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR(\u0010\u000b\u001a\u00020\n8\u0007@\u0007X\u0087.¢\u0006\u0018\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/camera/camera2/compat/quirk/DeviceQuirks;", "", "<init>", "()V", "Landroidx/camera/core/impl/Quirk;", "T", "Ljava/lang/Class;", "quirkClass", "get", "(Ljava/lang/Class;)Landroidx/camera/core/impl/Quirk;", "Landroidx/camera/core/impl/Quirks;", "all", "Landroidx/camera/core/impl/Quirks;", "getAll", "()Landroidx/camera/core/impl/Quirks;", "setAll", "(Landroidx/camera/core/impl/Quirks;)V", "getAll$annotations"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeviceQuirks {
    public static final androidx.camera.camera2.compat.quirk.DeviceQuirks INSTANCE = new androidx.camera.camera2.compat.quirk.DeviceQuirks();
    public static volatile androidx.camera.core.impl.Quirks all;

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getAll$annotations() {
    }

    private DeviceQuirks() {
    }

    public static final androidx.camera.core.impl.Quirks getAll() {
        androidx.camera.core.impl.Quirks quirks = all;
        if (quirks != null) {
            return quirks;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public static final void setAll(androidx.camera.core.impl.Quirks quirks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quirks, "");
        all = quirks;
    }

    static {
        androidx.camera.core.impl.QuirkSettingsHolder.instance().observe(androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor(), new androidx.core.util.Consumer() { // from class: androidx.camera.camera2.compat.quirk.DeviceQuirks$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                androidx.camera.camera2.compat.quirk.DeviceQuirks.m70$r8$lambda$HfBMZLZ_UgnnlH0dufyHifpDc((androidx.camera.core.impl.QuirkSettings) obj);
            }
        });
    }

    public final <T extends androidx.camera.core.impl.Quirk> T get(java.lang.Class<T> quirkClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quirkClass, "");
        return (T) getAll().get(quirkClass);
    }

    /* renamed from: $r8$lambda$HfBMZLZ_-UgnnlH0dufyH-ifpDc, reason: not valid java name */
    public static /* synthetic */ void m70$r8$lambda$HfBMZLZ_UgnnlH0dufyHifpDc(androidx.camera.core.impl.QuirkSettings quirkSettings) {
        androidx.camera.camera2.compat.quirk.DeviceQuirksLoader deviceQuirksLoader = androidx.camera.camera2.compat.quirk.DeviceQuirksLoader.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(quirkSettings);
        setAll(new androidx.camera.core.impl.Quirks(deviceQuirksLoader.loadQuirks(quirkSettings)));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("camera2 DeviceQuirks = ");
        sb.append(androidx.camera.core.impl.Quirks.toString(getAll()));
        androidx.camera.core.Logger.d("DeviceQuirks", sb.toString());
    }
}

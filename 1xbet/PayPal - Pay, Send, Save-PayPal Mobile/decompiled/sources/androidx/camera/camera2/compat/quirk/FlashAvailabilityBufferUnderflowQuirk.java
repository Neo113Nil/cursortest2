package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/FlashAvailabilityBufferUnderflowQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "Companion", com.miteksystems.misnap.core.MibiData.KEY_DEVICE_INFO}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FlashAvailabilityBufferUnderflowQuirk implements androidx.camera.core.impl.Quirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.Companion(null);
    private static final java.util.Set<androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.DeviceInfo> Camera2StreamConfigurationMap = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.DeviceInfo[]{androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.DeviceInfo.INSTANCE.invoke("sprd", "lemp"), androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.DeviceInfo.INSTANCE.invoke("sprd", "DM20C")});

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/camera2/compat/quirk/FlashAvailabilityBufferUnderflowQuirk$Companion;", "", "<init>", "()V", "", "isEnabled", "()Z", "", "Landroidx/camera/camera2/compat/quirk/FlashAvailabilityBufferUnderflowQuirk$DeviceInfo;", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            java.util.Set set = androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.Camera2StreamConfigurationMap;
            androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.DeviceInfo.Companion companion = androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.DeviceInfo.INSTANCE;
            java.lang.String str = android.os.Build.MANUFACTURER;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            java.lang.String str2 = android.os.Build.MODEL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
            return set.contains(companion.invoke(str, str2));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bR\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Landroidx/camera/camera2/compat/quirk/FlashAvailabilityBufferUnderflowQuirk$DeviceInfo;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "manufacturer", "model", "copy", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/camera/camera2/compat/quirk/FlashAvailabilityBufferUnderflowQuirk$DeviceInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getManufacturer", "getModel", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeviceInfo {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.DeviceInfo.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.DeviceInfo.Companion(null);
        private final java.lang.String manufacturer;
        private final java.lang.String model;

        private DeviceInfo(java.lang.String str, java.lang.String str2) {
            this.manufacturer = str;
            this.model = str2;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/camera2/compat/quirk/FlashAvailabilityBufferUnderflowQuirk$DeviceInfo$Companion;", "", "<init>", "()V", "", "manufacturer", "model", "Landroidx/camera/camera2/compat/quirk/FlashAvailabilityBufferUnderflowQuirk$DeviceInfo;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/camera/camera2/compat/quirk/FlashAvailabilityBufferUnderflowQuirk$DeviceInfo;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.DeviceInfo invoke(java.lang.String manufacturer, java.lang.String model) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manufacturer, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
                java.util.Locale locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String lowerCase = manufacturer.toLowerCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                java.util.Locale locale2 = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
                java.lang.String lowerCase2 = model.toLowerCase(locale2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                return new androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.DeviceInfo(lowerCase, lowerCase2, null);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String getManufacturer() {
            return this.manufacturer;
        }

        public final java.lang.String getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceInfo(manufacturer=");
            sb.append(this.manufacturer);
            sb.append(", model=");
            sb.append(this.model);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.manufacturer.hashCode() * 31) + this.model.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.DeviceInfo)) {
                return false;
            }
            androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.DeviceInfo deviceInfo = (androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.DeviceInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.manufacturer, deviceInfo.manufacturer) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, deviceInfo.model);
        }

        public final androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.DeviceInfo copy(java.lang.String manufacturer, java.lang.String model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manufacturer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.DeviceInfo(manufacturer, model);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getModel() {
            return this.model;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getManufacturer() {
            return this.manufacturer;
        }

        public static /* synthetic */ androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.DeviceInfo copy$default(androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.DeviceInfo deviceInfo, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deviceInfo.manufacturer;
            }
            if ((i & 2) != 0) {
                str2 = deviceInfo.model;
            }
            return deviceInfo.copy(str, str2);
        }

        public /* synthetic */ DeviceInfo(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }
    }
}

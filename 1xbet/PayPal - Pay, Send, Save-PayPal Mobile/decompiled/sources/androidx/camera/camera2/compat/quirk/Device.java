package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006J\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0006J\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0006J\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006J\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0006J\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0006J\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0006J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0006J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0006J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0006J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0006J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0006J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0006J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0006J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/compat/quirk/Device;", "", "<init>", "()V", "", "isBluDevice", "()Z", "isHuaweiDevice", "isInfinixDevice", "isItelDevice", "isJioDevice", "isGoogleDevice", "isMotorolaDevice", "isNokiaDevice", "isOnePlusDevice", "isOppoDevice", "isPositivoDevice", "isRealmeDevice", "isRedmiDevice", "isSamsungDevice", "isSonyDevice", "isTecnoDevice", "isXiaomiDevice", "isVivoDevice", "isPocoDevice", "", "p0", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Z", "isUniSocChipsetDevice"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Device {
    public static final androidx.camera.camera2.compat.quirk.Device INSTANCE = new androidx.camera.camera2.compat.quirk.Device();

    private Device() {
    }

    public final boolean isBluDevice() {
        return getHighSpeedVideoSizes("Blu");
    }

    public final boolean isHuaweiDevice() {
        return getHighSpeedVideoSizes("Huawei");
    }

    public final boolean isInfinixDevice() {
        return getHighSpeedVideoSizes("Infinix");
    }

    public final boolean isItelDevice() {
        return getHighSpeedVideoSizes("Itel");
    }

    public final boolean isJioDevice() {
        return getHighSpeedVideoSizes("Jio");
    }

    public final boolean isGoogleDevice() {
        return getHighSpeedVideoSizes("Google");
    }

    public final boolean isMotorolaDevice() {
        return getHighSpeedVideoSizes("Motorola");
    }

    public final boolean isNokiaDevice() {
        return getHighSpeedVideoSizes("Nokia");
    }

    public final boolean isOnePlusDevice() {
        return getHighSpeedVideoSizes("OnePlus");
    }

    public final boolean isOppoDevice() {
        return getHighSpeedVideoSizes("Oppo");
    }

    public final boolean isPositivoDevice() {
        return getHighSpeedVideoSizes("Positivo");
    }

    public final boolean isRealmeDevice() {
        return getHighSpeedVideoSizes("Realme");
    }

    public final boolean isRedmiDevice() {
        return getHighSpeedVideoSizes("Redmi");
    }

    public final boolean isSamsungDevice() {
        return getHighSpeedVideoSizes("Samsung");
    }

    public final boolean isSonyDevice() {
        return getHighSpeedVideoSizes("Sony");
    }

    public final boolean isTecnoDevice() {
        return getHighSpeedVideoSizes("Tecno") || getHighSpeedVideoSizes("Tecno-mobile");
    }

    public final boolean isXiaomiDevice() {
        return getHighSpeedVideoSizes("Xiaomi");
    }

    public final boolean isVivoDevice() {
        return getHighSpeedVideoSizes("Vivo");
    }

    public final boolean isPocoDevice() {
        return getHighSpeedVideoSizes("Poco");
    }

    private static boolean getHighSpeedVideoSizes(java.lang.String p0) {
        java.lang.String str = android.os.Build.MANUFACTURER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        if (!kotlin.text.StringsKt.equals(str, p0, true)) {
            java.lang.String str2 = android.os.Build.BRAND;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
            if (!kotlin.text.StringsKt.equals(str2, p0, true)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isUniSocChipsetDevice() {
        if (android.os.Build.VERSION.SDK_INT < 31 || !kotlin.text.StringsKt.equals("Spreadtrum", android.os.Build.SOC_MANUFACTURER, true)) {
            java.lang.String str = android.os.Build.HARDWARE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (!kotlin.text.StringsKt.startsWith$default(lowerCase, "ums", false, 2, (java.lang.Object) null)) {
                if (isItelDevice()) {
                    java.lang.String str2 = android.os.Build.HARDWARE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
                    java.lang.String lowerCase2 = str2.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    if (!kotlin.text.StringsKt.startsWith$default(lowerCase2, "sp", false, 2, (java.lang.Object) null)) {
                    }
                }
                return false;
            }
        }
        return true;
    }
}

package com.google.android.material.internal;

/* loaded from: classes8.dex */
public class ManufacturerUtils {
    private static final java.lang.String LGE = "lge";
    private static final java.lang.String MEIZU = "meizu";
    private static final java.lang.String SAMSUNG = "samsung";

    private ManufacturerUtils() {
    }

    public static boolean isMeizuDevice() {
        return getManufacturer().equals(MEIZU);
    }

    public static boolean isLGEDevice() {
        return getManufacturer().equals(LGE);
    }

    public static boolean isSamsungDevice() {
        return getManufacturer().equals("samsung");
    }

    public static boolean isDateInputKeyboardMissingSeparatorCharacters() {
        return isLGEDevice() || isSamsungDevice();
    }

    private static java.lang.String getManufacturer() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        if (str != null) {
            return str.toLowerCase(java.util.Locale.ENGLISH);
        }
        return "";
    }
}

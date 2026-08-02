package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcoil3/util/Logger;", "logger", "Lcoil3/util/HardwareBitmapService;", "HardwareBitmapService", "(Lcoil3/util/Logger;)Lcoil3/util/HardwareBitmapService;", "", "getHighSpeedVideoFpsRanges", "Z", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HardwareBitmapsKt {
    private static final boolean getHighSpeedVideoFpsRanges;

    public static final coil3.content.HardwareBitmapService HardwareBitmapService(coil3.content.Logger logger) {
        if (getHighSpeedVideoFpsRanges) {
            return new coil3.content.ImmutableHardwareBitmapService(false);
        }
        if (android.os.Build.VERSION.SDK_INT == 26 || android.os.Build.VERSION.SDK_INT == 27) {
            return new coil3.content.LimitedFileDescriptorHardwareBitmapService(logger);
        }
        return new coil3.content.ImmutableHardwareBitmapService(true);
    }

    static {
        java.lang.String str;
        int i = android.os.Build.VERSION.SDK_INT;
        boolean z = false;
        if (i == 26) {
            java.lang.String str2 = android.os.Build.MODEL;
            if (str2 != null) {
                if (kotlin.text.StringsKt.startsWith$default(kotlin.text.StringsKt.removePrefix(str2, (java.lang.CharSequence) "SAMSUNG-"), "SM-", false, 2, (java.lang.Object) null)) {
                    z = true;
                } else {
                    java.lang.String str3 = android.os.Build.DEVICE;
                    if (str3 != null) {
                        z = kotlin.collections.ArraysKt.contains(new java.lang.String[]{"nora", "nora_8917", "nora_8917_n", "james", "rjames_f", "rjames_go", "pettyl", "hannah", "ahannah", "rhannah", "ali", "ali_n", "aljeter", "aljeter_n", "jeter", "evert", "evert_n", "evert_nt", "G3112", "G3116", "G3121", "G3123", "G3125", "G3412", "G3416", "G3421", "G3423", "G3426", "G3212", "G3221", "G3223", "G3226", "BV6800Pro", "CatS41", "Hi9Pro", "manning", "N5702L"}, str3);
                    }
                }
            }
        } else if (i == 27 && (str = android.os.Build.DEVICE) != null) {
            z = kotlin.collections.ArraysKt.contains(new java.lang.String[]{"mcv1s", "mcv3", "mcv5a", "mcv7a", "A30ATMO", "A70AXLTMO", "A3A_8_4G_TMO", "Edison_CKT", "EDISON_TF", "FERMI_TF", "U50A_ATT", "U50A_PLUS_ATT", "U50A_PLUS_TF", "U50APLUSTMO", "U5A_PLUS_4G", "RCT6513W87DK5e", "RCT6873W42BMF9A", "RCT6A03W13", "RCT6B03W12", "RCT6B03W13", "RCT6T06E13", "A3_Pro", "One", "One_Max", "One_Pro", "Z2", "Z2_PRO", "Armor_3", "Armor_6", "Blackview", "BV9500", "BV9500Pro", "A6L-C", "N5002LA", "N5501LA", "Power_2_Pro", "Power_5", "Z9", "V0310WW", "V0330WW", "A3", "ASUS_X018_4", "C210AE", "fireball", "ILA_X1", "Infinix-X605_sprout", "j7maxlte", "KING_KONG_3", "M10500", "S70", "S80Lite", "SGINO6", "st18c10bnn", "TECNO-CA8", "SHIFT6m"}, str);
        }
        getHighSpeedVideoFpsRanges = z;
    }
}

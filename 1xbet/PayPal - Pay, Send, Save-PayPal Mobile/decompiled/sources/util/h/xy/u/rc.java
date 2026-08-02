package util.h.xy.u;

/* loaded from: classes5.dex */
public class rc {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRangesFor = 97;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.lang.String m27549(java.lang.String str) {
        try {
            java.util.Date parse = new java.text.SimpleDateFormat(util.h.xy.al.ra.f514, java.util.Locale.US).parse(str);
            int i = (Camera2StreamConfigurationMap + 107) % 128;
            getHighSpeedVideoFpsRangesFor = i;
            if (parse == null) {
                Camera2StreamConfigurationMap = (i + 27) % 128;
                int i2 = (i & 79) + (i | 79);
                Camera2StreamConfigurationMap = i2 % 128;
                if (i2 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(java.util.Locale.ROOT);
            gregorianCalendar.setFirstDayOfWeek(2);
            gregorianCalendar.setMinimalDaysInFirstWeek(1);
            gregorianCalendar.setTime(parse);
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(util.h.xy.al.ra.f553, java.util.Locale.ROOT);
            simpleDateFormat.setCalendar(gregorianCalendar);
            java.lang.String substring = simpleDateFormat.format(parse).substring(3);
            int i3 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = (((i3 | 119) << 1) - (i3 ^ 119)) % 128;
            return substring;
        } catch (java.text.ParseException e) {
            e.getMessage();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r3 == 12) goto L13;
     */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m27548(java.lang.String str) {
        byte byteValue;
        byte parseByte;
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i | 15) << 1) - (i ^ 15)) % 128;
        byte[] bArr = {0, 0};
        int parseInt = java.lang.Integer.parseInt(str.substring(5, 7));
        try {
            java.lang.String m27549 = m27549(str);
            if (m27549 != null) {
                int i2 = getHighSpeedVideoFpsRangesFor;
                int i3 = (i2 & 113) + (i2 | 113);
                Camera2StreamConfigurationMap = i3 % 128;
                if (i3 % 2 != 0) {
                    byteValue = java.lang.Byte.decode(m27549.substring(1, 0)).byteValue();
                    parseByte = java.lang.Byte.parseByte(m27549.substring(1, 2), 28);
                    if (parseInt == 49) {
                        int i4 = getHighSpeedVideoFpsRangesFor;
                        int i5 = (i4 ^ 37) + ((i4 & 37) << 1);
                        Camera2StreamConfigurationMap = i5 % 128;
                        if (i5 % 2 == 0 ? parseByte == 1 : parseByte == 1) {
                            parseByte = 83;
                        }
                    }
                    bArr = new byte[]{byteValue, parseByte};
                } else {
                    byteValue = java.lang.Byte.decode(m27549.substring(0, 1)).byteValue();
                    parseByte = java.lang.Byte.parseByte(m27549.substring(1, 3), 16);
                }
            }
            int i6 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = ((i6 ^ 9) + ((i6 & 9) << 1)) % 128;
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        util.h.xy.ar.b.m25074(bArr);
        int i7 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i7 | 111) << 1) - (i7 ^ 111)) % 128;
        return bArr;
    }
}

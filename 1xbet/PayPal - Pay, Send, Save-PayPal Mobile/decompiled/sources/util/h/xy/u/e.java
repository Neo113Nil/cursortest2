package util.h.xy.u;

/* loaded from: classes5.dex */
public final class e {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m27525(java.io.File file) {
        java.io.File[] listFiles;
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 13) << 1) - (i ^ 13);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                int length = listFiles.length;
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 31) % 128;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = getHighSpeedVideoFpsRanges;
                    getHighSpeedVideoSizes = (((i4 | 97) << 1) - (i4 ^ 97)) % 128;
                    m27525(listFiles[i3]);
                    i3++;
                    int i5 = getHighSpeedVideoFpsRanges;
                    getHighSpeedVideoSizes = ((i5 & 101) + (i5 | 101)) % 128;
                }
            }
            file.delete();
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 59) % 128;
            return;
        }
        file.isDirectory();
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m27523(android.content.Context context, java.lang.String str) {
        java.io.File file = new java.io.File(context.getFilesDir(), str);
        if (!file.exists()) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 25) % 128;
            file.mkdirs();
            int i = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoSizes = ((i ^ 39) + ((i & 39) << 1)) % 128;
        }
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = (i2 & 93) + (i2 | 93);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m27522(android.content.Context context) {
        java.io.File file = new java.io.File(context.getFilesDir(), util.h.xy.al.ra.f352);
        if (file.exists()) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 27) % 128;
            m27525(file);
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 49) % 128;
        }
        int i = getHighSpeedVideoSizes + 81;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m27524(android.content.Context context, java.lang.String str) {
        java.io.File file = new java.io.File(context.getFilesDir(), str);
        if (file.exists()) {
            int i = getHighSpeedVideoSizes;
            int i2 = (i ^ 57) + ((i & 57) << 1);
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                file.delete();
                int i3 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoSizes = ((i3 & 93) + (i3 | 93)) % 128;
                return;
            }
            file.delete();
            throw null;
        }
    }
}

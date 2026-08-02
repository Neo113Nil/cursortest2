package com.daon.sdk.face;

/* loaded from: classes7.dex */
public class Performance {
    public static final int BAD = 10;
    public static final int FORGET_ABOUT_IT = 5;
    public static final int GOOD = 40;
    public static final int GREAT = 100;
    private final java.util.ArrayList Camera2StreamConfigurationMap;
    private final com.daon.sdk.face.ScoreBuffer getHighResolutionOutputSizeshNQ4ISI = new com.daon.sdk.face.ScoreBuffer(3, 2000);
    private long getHighSpeedVideoFpsRanges;
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    public Performance(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.Camera2StreamConfigurationMap = arrayList;
        this.getHighSpeedVideoFpsRangesFor = context;
        arrayList.add("sp7731");
    }

    public long average() {
        long stop = stop();
        this.getHighResolutionOutputSizeshNQ4ISI.add(java.lang.Long.valueOf(stop), stop);
        return java.lang.Math.round(this.getHighResolutionOutputSizeshNQ4ISI.getAverage());
    }

    public long getAvailableMemory() {
        ((android.app.ActivityManager) this.getHighSpeedVideoFpsRangesFor.getSystemService("activity")).getMemoryInfo(new android.app.ActivityManager.MemoryInfo());
        return java.lang.Math.round((r0.availMem / r0.totalMem) * 100.0d);
    }

    public float getCPUUsage() throws java.io.IOException, java.lang.InterruptedException {
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile("/proc/stat", "r");
        try {
            java.lang.String[] split = randomAccessFile.readLine().split(com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverviewKt.CryptoAdditionalItemSeparator);
            long parseLong = java.lang.Long.parseLong(split[4]);
            long parseLong2 = java.lang.Long.parseLong(split[2]) + java.lang.Long.parseLong(split[3]) + java.lang.Long.parseLong(split[5]) + java.lang.Long.parseLong(split[6]) + java.lang.Long.parseLong(split[7]) + java.lang.Long.parseLong(split[8]);
            java.lang.Thread.sleep(360L);
            randomAccessFile.seek(0L);
            java.lang.String[] split2 = randomAccessFile.readLine().split(com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverviewKt.CryptoAdditionalItemSeparator);
            long parseLong3 = java.lang.Long.parseLong(split2[4]);
            long parseLong4 = java.lang.Long.parseLong(split2[2]);
            long parseLong5 = java.lang.Long.parseLong(split2[3]);
            long parseLong6 = java.lang.Long.parseLong(split2[5]);
            long parseLong7 = parseLong4 + parseLong5 + parseLong6 + java.lang.Long.parseLong(split2[6]) + java.lang.Long.parseLong(split2[7]) + java.lang.Long.parseLong(split2[8]);
            float f = (parseLong7 - parseLong2) / ((parseLong7 + parseLong3) - (parseLong2 + parseLong));
            randomAccessFile.close();
            return f;
        } finally {
        }
    }

    public java.lang.String getChipset() {
        java.lang.String str = android.os.Build.BOARD;
        java.lang.String str2 = android.os.Build.HARDWARE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(str2);
        return sb.toString();
    }

    public void start() {
        this.getHighSpeedVideoFpsRanges = java.lang.System.currentTimeMillis();
    }

    public long stop() {
        return java.lang.System.currentTimeMillis() - this.getHighSpeedVideoFpsRanges;
    }

    private static void getHighSpeedVideoFpsRangesFor(android.graphics.Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        com.daon.sdk.face.YUV yuv = new com.daon.sdk.face.YUV(bitmap);
        byte[] a2 = com.daon.sdk.renderscript.Toolkit.f2846a.a(yuv.getData(), yuv.getWidth(), yuv.getHeight(), com.daon.sdk.renderscript.c.b);
        int[] iArr = new int[a2.length / 4];
        for (int i = 0; i < a2.length; i += 4) {
            byte b = a2[i];
            byte b2 = a2[i + 1];
            byte b3 = a2[i + 2];
            byte b4 = a2[i + 3];
            iArr[i / 4] = ((b & 255) << 16) | (-16777216) | ((b2 & 255) << 8) | (b3 & 255);
        }
        android.graphics.Bitmap.createBitmap(iArr, width, height, bitmap.getConfig());
    }

    public int getScore() {
        float f;
        java.util.Iterator it = this.Camera2StreamConfigurationMap.iterator();
        while (true) {
            if (!it.hasNext()) {
                f = 10.0f;
                break;
            }
            if (android.os.Build.BOARD.startsWith((java.lang.String) it.next())) {
                f = 1.0f;
                break;
            }
        }
        if (com.daon.sdk.face.CameraTools.getHardwareSupportLevel(this.getHighSpeedVideoFpsRangesFor, true).intValue() == 2) {
            f *= 0.5f;
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(640, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, android.graphics.Bitmap.Config.ARGB_8888);
        for (int i = 0; i < 640; i++) {
            for (int i2 = 0; i2 < 480; i2++) {
                createBitmap.setPixel(i, i2, android.graphics.Color.rgb(255, 0, 0));
            }
        }
        getHighSpeedVideoFpsRangesFor(createBitmap);
        start();
        getHighSpeedVideoFpsRangesFor(createBitmap);
        long stop = stop();
        if (stop <= 0) {
            stop = 1;
        }
        return java.lang.Math.round((f / stop) * 100.0f);
    }
}

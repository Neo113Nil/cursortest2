package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public class DyScan {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f3281a;
    public static com.dyneti.android.dyscan.g0 b;
    public static java.nio.ByteBuffer c;
    public static java.nio.ByteBuffer d;
    public static com.dyneti.shared_interfaces.DynetiNFC dynetiNFC;
    public static okhttp3.OkHttpClient e;
    public static android.content.Context f;

    public static void a(android.content.Context context, java.lang.String str) {
        java.nio.MappedByteBuffer mappedByteBuffer;
        f = context;
        f3281a = str;
        e = new okhttp3.OkHttpClient.Builder().addInterceptor(new com.dyneti.android.dyscan.p2()).build();
        new com.dyneti.android.dyscan.h0(context);
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        final android.os.HandlerThread handlerThread = new android.os.HandlerThread("DyScanInit");
        handlerThread.start();
        final android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        handler.post(new java.lang.Runnable() { // from class: com.dyneti.android.dyscan.DyScan$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.dyneti.android.dyscan.DyScan.a(handler, handlerThread);
            }
        });
        b = new com.dyneti.android.dyscan.g0(language.equals("es") ? context.getString(com.dyneti.android.dyscan.R.string.dyscan_scan_your_card_es) : language.equals("pt") ? context.getString(com.dyneti.android.dyscan.R.string.dyscan_scan_your_card_pt) : context.getString(com.dyneti.android.dyscan.R.string.dyscan_scan_your_card_en), new com.dyneti.android.dyscan.f0());
        java.nio.MappedByteBuffer mappedByteBuffer2 = null;
        try {
            android.content.res.AssetFileDescriptor openFd = context.getResources().getAssets().openFd("dyscan_model.jet");
            mappedByteBuffer = com.dyneti.android.dyscan.i0.a(new java.io.FileInputStream(openFd.getFileDescriptor()), openFd);
        } catch (java.io.IOException unused) {
            mappedByteBuffer = null;
        }
        c = mappedByteBuffer;
        try {
            android.content.res.AssetFileDescriptor openFd2 = context.getResources().getAssets().openFd("dyscan_fraud_score_model.tflite");
            com.dyneti.android.dyscan.i0.a(new java.io.FileInputStream(openFd2.getFileDescriptor()), openFd2);
        } catch (java.io.IOException unused2) {
        }
        try {
            android.content.res.AssetFileDescriptor openFd3 = context.getResources().getAssets().openFd("dyscan_orientation_model.tflite");
            mappedByteBuffer2 = com.dyneti.android.dyscan.i0.a(new java.io.FileInputStream(openFd3.getFileDescriptor()), openFd3);
        } catch (java.io.IOException unused3) {
        }
        d = mappedByteBuffer2;
        try {
            com.dyneti.shared_interfaces.DynetiNFC dynetiNFC2 = (com.dyneti.shared_interfaces.DynetiNFC) java.lang.Class.forName("com.dyneti.android.nfc.DynetiNFC").newInstance();
            dynetiNFC = dynetiNFC2;
            dynetiNFC2.dynetiSetLogger(new com.dyneti.android.dyscan.e1(f3281a));
        } catch (java.lang.Exception unused4) {
        }
    }

    public static boolean hasNfcFeature() {
        com.dyneti.shared_interfaces.DynetiNFC dynetiNFC2 = dynetiNFC;
        return dynetiNFC2 != null && dynetiNFC2.isAvailable(f);
    }

    public static void init(android.content.Context context, java.lang.String str) {
        a(context, str);
    }

    public static boolean isDeviceSupported(android.content.Context context) {
        com.dyneti.android.dyscan.t1.a().f = true;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.camera") && packageManager.hasSystemFeature("android.hardware.camera.autofocus");
    }

    public static boolean isEuVersion() {
        return true;
    }

    public static boolean isFraudVersion() {
        return false;
    }

    public static /* synthetic */ void a(android.os.Handler handler, android.os.HandlerThread handlerThread) {
        android.net.TrafficStats.setThreadStatsTag((int) java.lang.Thread.currentThread().getId());
        handler.removeCallbacksAndMessages(null);
        handlerThread.quitSafely();
    }
}

package com.gemalto.mfs.mwsdk.provisioning.push;

/* loaded from: classes3.dex */
public class CPSCommService extends androidx.core.app.JobIntentService {
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static char[] getHighSpeedVideoSizes = null;
    private static int getHighSpeedVideoSizesFor = 0;
    private static com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener getInputFormats = null;
    private static int getInputSizeshNQ4ISI = 1;
    private static android.os.HandlerThread getOutputFormats;
    private static android.os.Handler getOutputMinFrameDuration;
    private int getOutputStallDuration = 59;

    static {
        getHighSpeedVideoFpsRangesFor();
        Camera2StreamConfigurationMap = com.gemalto.mfs.mwsdk.provisioning.push.CPSCommService.class.getName();
        getOutputFormats = null;
        getOutputMinFrameDuration = null;
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 69) % 128;
    }

    public static void enqueueWork(android.content.Context context, android.content.Intent intent) {
        int i = getHighSpeedVideoSizesFor + 11;
        getInputSizeshNQ4ISI = i % 128;
        enqueueWork(context, (java.lang.Class<?>) com.gemalto.mfs.mwsdk.provisioning.push.CPSCommService.class, i % 2 == 0 ? 80 : 100, intent);
        int i2 = getHighSpeedVideoSizesFor + 17;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 63) % 128;
        super.onStartCommand(intent, i, i2);
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 113) % 128;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        if (r9.f2641 == r9.f2636) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c5, code lost:
    
        r9.f2639 = r9.f2641 / r3;
        r9.f2640 = r9.f2641 % r3;
        r9.f2637 = r9.f2636 / r3;
        r9.f2635 = r9.f2636 % r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00dd, code lost:
    
        if (r9.f2640 != r9.f2635) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00df, code lost:
    
        com.gemalto.mfs.mwsdk.provisioning.push.CPSCommService.getHighSpeedVideoFpsRangesFor = (com.gemalto.mfs.mwsdk.provisioning.push.CPSCommService.getHighSpeedVideoFpsRanges + 103) % 128;
        r9.f2639 = ((r9.f2639 + r3) - 1) % r3;
        r9.f2637 = ((r9.f2637 + r3) - 1) % r3;
        r12 = r9.f2639;
        r13 = r9.f2640;
        r14 = r9.f2637;
        r15 = r9.f2635;
        r4[r9.f2638] = r10[(r12 * r3) + r13];
        r4[r9.f2638 + 1] = r10[(r14 * r3) + r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0115, code lost:
    
        if (r9.f2639 != r9.f2637) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0117, code lost:
    
        com.gemalto.mfs.mwsdk.provisioning.push.CPSCommService.getHighSpeedVideoFpsRanges = (com.gemalto.mfs.mwsdk.provisioning.push.CPSCommService.getHighSpeedVideoFpsRangesFor + 15) % 128;
        r9.f2640 = ((r9.f2640 + r3) - 1) % r3;
        r9.f2635 = ((r9.f2635 + r3) - 1) % r3;
        r11 = r9.f2639;
        r12 = r9.f2640;
        r13 = r9.f2637;
        r14 = r9.f2635;
        r4[r9.f2638] = r10[(r11 * r3) + r12];
        r4[r9.f2638 + 1] = r10[(r13 * r3) + r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0149, code lost:
    
        r11 = r9.f2639;
        r12 = r9.f2635;
        r13 = r9.f2637;
        r14 = r9.f2640;
        r4[r9.f2638] = r10[(r11 * r3) + r12];
        r4[r9.f2638 + 1] = r10[(r13 * r3) + r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        r4[r9.f2638] = (char) (r9.f2641 - r5);
        r4[r9.f2638 + 1] = (char) (r9.f2636 - r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
    
        if (r9.f2641 == r9.f2636) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Camera2StreamConfigurationMap(android.content.Intent intent) {
        int i;
        int i2 = getInputSizeshNQ4ISI + 59;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 != 0) {
            intent.getExtras();
            throw null;
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            try {
                byte[] m25814 = util.h.xy.by.ma.f1067.m25814();
                if (m25814 == null || util.h.xy.ar.b.m25070(m25814)) {
                    return;
                }
                new util.h.xy.bv.ra(getInputFormats, intent).mo25679(new java.lang.String(m25814), null);
                getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 1) % 128;
                return;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e.getMessage();
                return;
            }
        }
        java.lang.String string = extras.getString(util.h.xy.al.ra.f627);
        char resolveOpacity = (byte) (65 - android.graphics.drawable.Drawable.resolveOpacity(0, 0));
        int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
        int i3 = 10 - packedPositionGroup;
        char[] charArray = "\u0005\u0006\n\u0002\u000f\t\u000b\u0001\f\u0004".toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getHighSpeedVideoSizes;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                cArr2[i4] = (char) (cArr[i4] ^ 4042185467053315654L);
                i4++;
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 15) % 128;
            }
            cArr = cArr2;
        }
        char c = (char) (getHighResolutionOutputSizeshNQ4ISI ^ 4042185467053315654L);
        char[] cArr3 = new char[i3];
        if (i3 % 2 != 0) {
            i = 9 - packedPositionGroup;
            cArr3[i] = (char) (charArray[i] - resolveOpacity);
        } else {
            i = i3;
        }
        if (i > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i) {
                int i5 = getHighSpeedVideoFpsRanges + 37;
                getHighSpeedVideoFpsRangesFor = i5 % 128;
                if (i5 % 2 == 0) {
                    mcVar.f2641 = charArray[mcVar.f2638];
                    mcVar.f2636 = charArray[mcVar.f2638 + 1];
                } else {
                    mcVar.f2641 = charArray[mcVar.f2638];
                    mcVar.f2636 = charArray[mcVar.f2638 + 1];
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i6 = 0; i6 < i3; i6++) {
            cArr3[i6] = (char) (cArr3[i6] ^ 13722);
        }
        new util.h.xy.bv.ra(getInputFormats, intent).mo25679(string, extras.getString(new java.lang.String(cArr3).intern()));
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onDestroy() {
        int i = getInputSizeshNQ4ISI + 121;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            super.onDestroy();
        } else {
            super.onDestroy();
            throw null;
        }
    }

    public static void setPushServiceListener(com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener) {
        int i = getHighSpeedVideoSizesFor;
        getInputSizeshNQ4ISI = (i + 17) % 128;
        getInputFormats = pushServiceListener;
        getInputSizeshNQ4ISI = (i + 69) % 128;
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(final android.content.Intent intent) {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 79) % 128;
        if (util.h.xy.ag.a.m24556().m24558() == null) {
            int i = getHighSpeedVideoSizesFor + 1;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                util.h.xy.ag.a.m24556().m24559(getApplicationContext());
            } else {
                util.h.xy.ag.a.m24556().m24559(getApplicationContext());
                throw null;
            }
        }
        synchronized (this) {
            android.os.HandlerThread handlerThread = getOutputFormats;
            if (handlerThread == null || !handlerThread.isAlive()) {
                android.os.HandlerThread handlerThread2 = new android.os.HandlerThread(util.h.xy.al.ra.f452);
                getOutputFormats = handlerThread2;
                handlerThread2.start();
                getOutputMinFrameDuration = new android.os.Handler(getOutputFormats.getLooper());
            }
        }
        getOutputMinFrameDuration.post(new java.lang.Runnable() { // from class: com.gemalto.mfs.mwsdk.provisioning.push.CPSCommService$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.gemalto.mfs.mwsdk.provisioning.push.CPSCommService.$r8$lambda$3Fv8_DDEz2Q74quGc5oP0Naz6PE(com.gemalto.mfs.mwsdk.provisioning.push.CPSCommService.this, intent);
            }
        });
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoSizes = new char[]{41912, 41028, 41026, 41906, 41919, 41900, 41903, 41027, 41877, 41913, 41029, 41911, 41031, 41907, 41864, 41030};
        getHighResolutionOutputSizeshNQ4ISI = (char) 38466;
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    public static /* synthetic */ void $r8$lambda$3Fv8_DDEz2Q74quGc5oP0Naz6PE(com.gemalto.mfs.mwsdk.provisioning.push.CPSCommService cPSCommService, android.content.Intent intent) {
        int i = getHighSpeedVideoSizesFor + 55;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            Camera2StreamConfigurationMap(intent);
        } else {
            Camera2StreamConfigurationMap(intent);
            throw new java.lang.ArithmeticException();
        }
    }
}

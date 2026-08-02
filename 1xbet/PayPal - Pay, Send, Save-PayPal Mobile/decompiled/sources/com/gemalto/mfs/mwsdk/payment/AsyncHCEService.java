package com.gemalto.mfs.mwsdk.payment;

/* loaded from: classes8.dex */
public abstract class AsyncHCEService extends util.h.xy.bf.rc {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    @Override // util.h.xy.bf.rc, android.nfc.cardemulation.HostApduService
    public byte[] processCommandApdu(byte[] bArr, android.os.Bundle bundle) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 71) % 128;
        byte[] t_ = super.t_(bArr, bundle);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 103) + ((i & 103) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return t_;
        }
        throw null;
    }

    @Override // util.h.xy.bf.rc
    public boolean onApduResponse(byte[] bArr, android.os.Bundle bundle, byte[] bArr2) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 53) << 1) - (i ^ 53);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        return i2 % 2 == 0;
    }

    @Override // util.h.xy.bf.rc, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // util.h.xy.bf.rc, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}

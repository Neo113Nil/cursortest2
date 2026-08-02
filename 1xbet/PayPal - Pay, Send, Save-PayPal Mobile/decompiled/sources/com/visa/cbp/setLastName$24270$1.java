package com.visa.cbp;

/* loaded from: classes16.dex */
public class setLastName$24270$1 implements java.lang.Runnable {
    public static final byte[] $$a = {124, 14, 33, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -18, 14, com.google.common.base.Ascii.FF, -13, 17};
    public static final int $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    public setLastName$24270$1(java.lang.Object obj, android.content.Context context) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:2:0x0000, B:4:0x0010, B:7:0x0061, B:8:0x0040, B:10:0x0049, B:11:0x005f, B:13:0x0064), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005f A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:2:0x0000, B:4:0x0010, B:7:0x0061, B:8:0x0040, B:10:0x0049, B:11:0x005f, B:13:0x0064), top: B:1:0x0000 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005f -> B:7:0x0061). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        int i;
        int i2;
        int i3;
        try {
            java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(531606895);
            if (obj == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2090 - android.graphics.Color.alpha(0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29);
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[6];
                if (bArr == null) {
                    i2 = 0;
                    i = 6;
                    i3 = 3;
                    byte b = 3;
                    i = (i + b) - 3;
                    bArr2[i2] = (byte) i;
                    i2++;
                    i3++;
                    if (i2 == 6) {
                        java.lang.String str = new java.lang.String(bArr2, 0);
                        java.lang.String str2 = str;
                        obj = cls.getDeclaredMethod(str, null);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(531606895, obj);
                    } else {
                        b = bArr[i3];
                        i = (i + b) - 3;
                        bArr2[i2] = (byte) i;
                        i2++;
                        i3++;
                        if (i2 == 6) {
                        }
                    }
                } else {
                    i = 118;
                    i2 = 0;
                    i3 = 3;
                    bArr2[i2] = (byte) i;
                    i2++;
                    i3++;
                    if (i2 == 6) {
                    }
                }
            }
            if (((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, null)).intValue() == 16476) {
                return;
            }
            com.visa.cbp.CardMetadataUpdateResponse.BuildConfig(this.Camera2StreamConfigurationMap, com.visa.cbp.setDeviceCerts.ReplenishRequest);
            throw new com.visa.cbp.sdk.facade.exception.RootDetectException(com.visa.cbp.setDeviceCerts.ReplenishRequest);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}

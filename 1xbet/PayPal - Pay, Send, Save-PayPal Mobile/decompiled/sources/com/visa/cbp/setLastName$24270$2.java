package com.visa.cbp;

/* loaded from: classes16.dex */
public class setLastName$24270$2 implements com.visa.cbp.setCap$30211$values {
    public static final byte[] $$a = {48, 19, -74, -32, 36, -9, com.visa.cbp.getEncExpo.onUnminimized, -5, 1, -13, -35, com.google.common.base.Ascii.VT, 3, -12, -15, 1, -13, 2, -19, -30, com.google.common.base.Ascii.VT, 4, -4, -24, 6, -7};
    public static final int $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE;
    final /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoSizes;

    public setLastName$24270$2(java.lang.Object obj, android.content.Context context) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r16v3, types: [int] */
    /* JADX WARN: Type inference failed for: r16v6, types: [int] */
    @Override // com.visa.cbp.setCap$30211$values
    public void ReplenishAckRequest(int i, int i2) {
        try {
            java.lang.Object[] objArr = {this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)};
            java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-500660635);
            if (obj == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 2090 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 30);
                byte[] bArr = $$a;
                byte b = bArr[8];
                byte b2 = (byte) (b - 1);
                byte b3 = b2;
                ?? r13 = (b2 * 4) + 67;
                int i3 = ((byte) (-b)) + 4;
                int i4 = b3 * 3;
                byte[] bArr2 = new byte[i4 + 23];
                int i5 = 0;
                byte b4 = r13;
                if (bArr == null) {
                    ?? r16 = r13 + i3 + 8;
                    i3 = i3;
                    b4 = r16;
                }
                while (true) {
                    int i6 = i3 + 1;
                    bArr2[i5] = b4;
                    if (i5 == i4 + 22) {
                        break;
                    }
                    i5++;
                    i3 = i6;
                    b4 = b4 + bArr[i6] + 8;
                }
                java.lang.String str = new java.lang.String(bArr2, 0);
                java.lang.String str2 = str;
                obj = cls.getDeclaredMethod(str, (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.os.Process.myTid() >> 22), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2090, 31 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), android.content.Context.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-500660635, obj);
            }
            ((java.lang.reflect.Method) obj).invoke(null, objArr);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}

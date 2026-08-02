package util.h.xy.bf;

/* loaded from: classes18.dex */
public abstract class rc extends android.nfc.cardemulation.HostApduService implements com.gemalto.mfs.mwsdk.payment.APDUProcessorSetupCallbacks {
    private static int Camera2StreamConfigurationMap = 69;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = "rc";
    private static int getHighSpeedVideoFpsRanges;

    static /* synthetic */ void Camera2StreamConfigurationMap(util.h.xy.bf.rc rcVar, byte[] bArr) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 15) % 128;
        super.sendResponseApdu(bArr);
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 35) << 1) - (i ^ 35);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ byte[] getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bf.rc rcVar, byte[] bArr, android.os.Bundle bundle) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i ^ 15) + ((i & 15) << 1)) % 128;
        byte[] Camera2StreamConfigurationMap2 = rcVar.Camera2StreamConfigurationMap(bArr, bundle);
        int i2 = Camera2StreamConfigurationMap;
        int i3 = (i2 & 79) + (i2 | 79);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw null;
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoSizes() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 101) << 1) - (i ^ 101);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.String str = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i ^ 125) + ((i & 125) << 1)) % 128;
        return str;
    }

    @Override // android.nfc.cardemulation.HostApduService
    public final void onDeactivated(int i) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f654);
        sb.append(util.h.xy.al.ra.f629);
        util.h.xy.am.ma.m25027(str, sb.toString());
        util.h.xy.bf.mb.f938.m25430(i);
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 91) % 128;
    }

    @Override // android.nfc.cardemulation.HostApduService
    @util.h.xy.a.a
    public byte[] processCommandApdu(byte[] bArr, android.os.Bundle bundle) {
        int i = Camera2StreamConfigurationMap + 103;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return Camera2StreamConfigurationMap(bArr, bundle);
        }
        Camera2StreamConfigurationMap(bArr, bundle);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0128 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0129  */
    @util.h.xy.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte[] Camera2StreamConfigurationMap(byte[] bArr, android.os.Bundle bundle) {
        android.content.Context applicationContext;
        int i;
        int i2;
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f654);
        sb.append(util.h.xy.al.ra.f503);
        util.h.xy.am.ma.m25027(str, sb.toString());
        util.h.xy.ar.b.m25074(bArr);
        util.h.xy.bf.c cVar = util.h.xy.bf.c.f934;
        cVar.getHighResolutionOutputSizeshNQ4ISI = this;
        com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener = setupListener();
        if (paymentServiceListener == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            util.h.xy.bf.c.getHighResolutionOutputSizeshNQ4ISI(23 - android.view.View.MeasureSpec.getMode(0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 42, (char) android.view.KeyEvent.getDeadChar(0, 0), objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        if (!(paymentServiceListener instanceof com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            util.h.xy.bf.c.getHighResolutionOutputSizeshNQ4ISI(android.view.View.resolveSizeAndState(0, 0, 0) + 69, 65 - android.graphics.Color.alpha(0), (char) (9338 - android.text.TextUtils.indexOf("", "", 0)), objArr2);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
        }
        cVar.getHighSpeedVideoSizes = (com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) paymentServiceListener;
        java.lang.Object obj = cVar.getHighResolutionOutputSizeshNQ4ISI;
        if (obj instanceof com.gemalto.mfs.mwsdk.payment.ContextResolverInterface) {
            util.h.xy.bf.c.getHighSpeedVideoFpsRangesFor = (util.h.xy.bf.c.Camera2StreamConfigurationMap + 37) % 128;
            applicationContext = ((com.gemalto.mfs.mwsdk.payment.ContextResolverInterface) obj).getContextResolver();
        } else {
            applicationContext = ((android.app.Service) obj).getApplicationContext();
        }
        util.h.xy.ag.a.m24556().m24559(applicationContext);
        util.h.xy.bf.c.getHighSpeedVideoFpsRangesFor = (util.h.xy.bf.c.Camera2StreamConfigurationMap + 21) % 128;
        if (util.h.xy.ag.a.m24556().m24558() == null) {
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                util.h.xy.bf.c.getHighResolutionOutputSizeshNQ4ISI((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 134, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr3);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr3[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        byte[] Camera2StreamConfigurationMap2 = util.h.xy.bf.mb.f938.Camera2StreamConfigurationMap(bArr, bundle);
        if (Camera2StreamConfigurationMap2 != null) {
            int i3 = getHighSpeedVideoFpsRanges + 23;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                int length = Camera2StreamConfigurationMap2.length;
                throw null;
            }
            if (Camera2StreamConfigurationMap2.length > 0) {
                byte[] bArr2 = new byte[1];
                java.lang.System.arraycopy(Camera2StreamConfigurationMap2, 0, bArr2, 0, 1);
                if (java.util.Arrays.equals(bArr2, new byte[]{com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4})) {
                    byte[] bArr3 = new byte[2];
                    int length2 = Camera2StreamConfigurationMap2.length;
                    int identityHashCode = java.lang.System.identityHashCode(this);
                    int i4 = -(-(length2 * 628));
                    int i5 = (i4 & (-1256)) + (i4 | (-1256));
                    int i6 = -(-(((length2 ^ identityHashCode) | (length2 & identityHashCode) | 1) * (-627)));
                    int i7 = ~length2;
                    int i8 = ~((i7 ^ identityHashCode) | (i7 & identityHashCode));
                    int i9 = (i5 ^ i6) + ((i6 & i5) << 1) + (((i8 & (-2)) | (i8 ^ (-2))) * (-627));
                    int i10 = -(-(((~(length2 | (~identityHashCode))) | (~((identityHashCode ^ (-2)) | (identityHashCode & (-2))))) * 627));
                    java.lang.System.arraycopy(Camera2StreamConfigurationMap2, (i9 ^ i10) + ((i10 & i9) << 1), bArr3, 0, 2);
                    util.h.xy.ar.b.m25074(bArr3);
                    java.lang.String str2 = util.h.xy.al.ra.f303;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(util.h.xy.al.ra.f490);
                    sb2.append(util.h.xy.ar.b.m25074(bArr3));
                    util.h.xy.am.ma.m25031(str2, sb2.toString());
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 77) % 128;
                } else {
                    util.h.xy.ar.b.m25074(Camera2StreamConfigurationMap2);
                    util.h.xy.am.ma.m25031(util.h.xy.al.ra.f303, util.h.xy.ar.b.m25074(Camera2StreamConfigurationMap2));
                }
                i = getHighSpeedVideoFpsRanges + 13;
                int i11 = i % 128;
                Camera2StreamConfigurationMap = i11;
                i2 = (i11 & 5) + (i11 | 5);
                getHighSpeedVideoFpsRanges = i2 % 128;
                if (i2 % 2 != 0) {
                    return Camera2StreamConfigurationMap2;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        util.h.xy.am.ma.m25031(util.h.xy.al.ra.f303, util.h.xy.al.ra.f565);
        int i12 = getHighSpeedVideoFpsRanges;
        i = ((i12 | 91) << 1) - (i12 ^ 91);
        int i112 = i % 128;
        Camera2StreamConfigurationMap = i112;
        i2 = (i112 & 5) + (i112 | 5);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
        }
    }

    public byte[] t_(final byte[] bArr, final android.os.Bundle bundle) {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (((i | 29) << 1) - (i ^ 29)) % 128;
        if (util.h.xy.bf.mb.f938.m25426().m25395()) {
            return null;
        }
        java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.bf.rc.5
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int getHighSpeedVideoFpsRangesFor = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = (((i2 | 41) << 1) - (i2 ^ 41)) % 128;
                try {
                    byte[] highResolutionOutputSizeshNQ4ISI = util.h.xy.bf.rc.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bf.rc.this, bArr, bundle);
                    if (!util.h.xy.bf.rc.this.onApduResponse(bArr, bundle, highResolutionOutputSizeshNQ4ISI)) {
                        int i3 = getHighSpeedVideoFpsRangesFor;
                        getHighResolutionOutputSizeshNQ4ISI = ((i3 & 15) + (i3 | 15)) % 128;
                        util.h.xy.bf.rc.Camera2StreamConfigurationMap(util.h.xy.bf.rc.this, highResolutionOutputSizeshNQ4ISI);
                        util.h.xy.bf.rc.getHighSpeedVideoSizes();
                        int i4 = getHighSpeedVideoFpsRangesFor;
                        getHighResolutionOutputSizeshNQ4ISI = (((i4 | 69) << 1) - (i4 ^ 69)) % 128;
                    }
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 121) % 128;
                } catch (java.lang.Throwable th) {
                    util.h.xy.bf.rc.getHighSpeedVideoSizes();
                    th.getMessage();
                    util.h.xy.bf.ma.m25415(util.h.xy.bf.c.f934.m25413(), com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_WRONG_STATE, th.getMessage());
                }
                int i5 = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = (((i5 | 47) << 1) - (i5 ^ 47)) % 128;
            }
        });
        thread.setPriority(10);
        thread.start();
        int i2 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i2 ^ 65) + ((i2 & 65) << 1)) % 128;
        return null;
    }

    public boolean onApduResponse(byte[] bArr, android.os.Bundle bundle, byte[] bArr2) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (i + 13) % 128;
        int i2 = i + 121;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return false;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}

package util.h.xy.aa;

/* loaded from: classes18.dex */
public class b extends androidx.appcompat.app.AppCompatActivity {
    private static boolean Camera2StreamConfigurationMap = false;
    public static final int REQUEST_CODE_KEYGUARD_AUTHENTICATE = 100;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static char[] getHighSpeedVideoFpsRanges = null;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static char[] getHighSpeedVideoSizes = null;
    private static boolean getHighSpeedVideoSizesFor = false;
    private static long getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 0;
    private static int getOutputFormats = 1;
    private static final java.lang.String getOutputMinFrameDuration;
    private static int getOutputStallDurationlomOqCM;
    private java.lang.CharSequence getOutputMinFrameDurationlomOqCM;
    private util.h.xy.aa.ma getOutputSizes;
    private int getOutputSizeshNQ4ISI = -1;
    private java.lang.CharSequence getOutputStallDuration;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getOutputMinFrameDuration = util.h.xy.cb.b.f1091;
        int i = getInputSizeshNQ4ISI + 55;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 127, "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u0086\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        this.getOutputSizes = util.h.xy.aa.ma.getHighResolutionOutputSizeshNQ4ISI;
        android.content.Intent intent = getIntent();
        if (intent != null) {
            getInputSizeshNQ4ISI = (getOutputFormats + 99) % 128;
            int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes(keyCodeFromString + 11, 1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), objArr3);
            this.getOutputStallDuration = intent.getStringExtra(((java.lang.String) objArr3[0]).intern());
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.text.TextUtils.getOffsetAfter("", 0) + 127, "\u0092\u008c\u0083\u008f\u0082\u0083\u0090\u0086\u0084\u008d\u0085\u0091\u008a\u0090\u008f\u008e\u008d", objArr4);
            this.getOutputMinFrameDurationlomOqCM = intent.getStringExtra(((java.lang.String) objArr4[0]).intern());
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.view.View.resolveSize(0, 0) + 127, "\u0085\u0083\u0091\u008a\u0090\u008f\u008e\u008d", objArr5);
            this.getOutputSizeshNQ4ISI = intent.getIntExtra(((java.lang.String) objArr5[0]).intern(), -1);
        }
        if (this.getOutputStallDuration == null) {
            getInputSizeshNQ4ISI = (getOutputFormats + 9) % 128;
            int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoSizes(offsetAfter + 23, 11 - android.graphics.Color.red(0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 55375), objArr6);
            this.getOutputStallDuration = ((java.lang.String) objArr6[0]).intern();
        }
        if (this.getOutputMinFrameDurationlomOqCM == null) {
            int i = getOutputFormats;
            getInputSizeshNQ4ISI = (i + 89) % 128;
            int i2 = (i + 117) % 128;
            getInputSizeshNQ4ISI = i2;
            getOutputFormats = (i2 + 39) % 128;
            try {
                int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue();
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoSizes((intValue >> 22) + 8, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 34, (char) (31898 - android.view.View.MeasureSpec.getSize(0)), objArr7);
                this.getOutputMinFrameDurationlomOqCM = ((java.lang.String) objArr7[0]).intern();
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        getOutputFormats = (getInputSizeshNQ4ISI + 125) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(127 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(126 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0085\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        super.onDestroy();
        getInputSizeshNQ4ISI = (getOutputFormats + 45) % 128;
    }

    private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 7) % 128;
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoFpsRanges[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getInputFormats))) ^ c;
            rbVar.f2651++;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 9) % 128;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 13) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x00a7, code lost:
    
        if (util.h.xy.aa.rb.m24533(getApplicationContext()) == com.gemalto.mfs.mwsdk.cdcvm.DeviceKeyguardSupport.SUPPORTED) goto L11;
     */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStart() {
        getInputSizeshNQ4ISI = (getOutputFormats + 7) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(128 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes(lastIndexOf + 10, 42 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 60406), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        super.onStart();
        getInputSizeshNQ4ISI = (getOutputFormats + 1) % 128;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(126 - android.widget.ExpandableListView.getPackedPositionChild(0L), "\u0084\u0083\u0082\u0081", objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "\u0086\u0086\u008b\u008a\u0089\u0088\u0087\u0086\u0085", objArr4);
        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
        if (util.h.xy.aa.rb.m24534(getApplicationContext()) != com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.SUPPORTED) {
            int i = getOutputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                util.h.xy.aa.rb.m24533(getApplicationContext());
                com.gemalto.mfs.mwsdk.cdcvm.DeviceKeyguardSupport deviceKeyguardSupport = com.gemalto.mfs.mwsdk.cdcvm.DeviceKeyguardSupport.SUPPORTED;
                throw new java.lang.ArithmeticException();
            }
        }
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "\u009a\u0099\u0098\u0097\u0096\u0095\u0094\u0093", objArr5);
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) getSystemService(((java.lang.String) objArr5[0]).intern());
        if (!keyguardManager.isDeviceSecure()) {
            int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoSizes(35 - (maximumFlingVelocity >> 16), android.widget.ExpandableListView.getPackedPositionChild(0L) + 52, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr6);
            throw new util.h.xy.ab.b(((java.lang.String) objArr6[0]).intern());
        }
        startActivityForResult(keyguardManager.createConfirmDeviceCredentialIntent(this.getOutputStallDuration, this.getOutputMinFrameDurationlomOqCM), 100);
        int i2 = getOutputFormats + 107;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        util.h.xy.aa.ma.b bVar;
        getOutputFormats = (getInputSizeshNQ4ISI + 49) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(126 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, "\u0090\u008a\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        super.onActivityResult(i, i2, intent);
        int i3 = getInputSizeshNQ4ISI;
        getOutputFormats = (i3 + 15) % 128;
        if (i == 100) {
            int i4 = this.getOutputSizeshNQ4ISI;
            try {
                util.h.xy.aa.ma maVar = this.getOutputSizes;
                if (i2 == -1) {
                    int i5 = i3 + 63;
                    getOutputFormats = i5 % 128;
                    if (i5 % 2 == 0) {
                        util.h.xy.aa.ma.b bVar2 = util.h.xy.aa.ma.b.Camera2StreamConfigurationMap;
                        throw null;
                    }
                    bVar = util.h.xy.aa.ma.b.Camera2StreamConfigurationMap;
                } else {
                    bVar = util.h.xy.aa.ma.b.getHighSpeedVideoFpsRangesFor;
                }
                maVar.getHighResolutionOutputSizeshNQ4ISI(i4, bVar);
                getOutputFormats = (getInputSizeshNQ4ISI + 33) % 128;
            } catch (java.lang.Exception e) {
                e.getMessage();
            }
            finish();
        }
        int i6 = getOutputFormats + 125;
        getInputSizeshNQ4ISI = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private static void Camera2StreamConfigurationMap(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 45;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getHighSpeedVideoSizes;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = getHighResolutionOutputSizeshNQ4ISI + 25;
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                if (i4 % 2 != 0) {
                    cArr2[i3] = (char) (cArr[i3] ^ (-3299939579226817547L));
                    i3 >>= 1;
                } else {
                    cArr2[i3] = (char) (cArr[i3] ^ (-3299939579226817547L));
                    i3++;
                }
            }
            int i5 = getHighResolutionOutputSizeshNQ4ISI + 11;
            getHighSpeedVideoFpsRangesFor = i5 % 128;
            int i6 = i5 % 2;
            cArr = cArr2;
        }
        int i7 = (int) ((-3299939579226817547L) ^ getOutputStallDurationlomOqCM);
        if (!Camera2StreamConfigurationMap) {
            if (!getHighSpeedVideoSizesFor) {
                throw null;
            }
            throw null;
        }
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 29) % 128;
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i7);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoSizes = new char[]{64197, 64193, 64216, 64194, 64221, 64210, 64207, 64196, 64218, 64208, 64231, 64198, 64220, 64201, 64205, 64195, 64182, 64199, 64186, 64188, 64168, 64190, 64172, 64176, 64163, 64189};
        getOutputStallDurationlomOqCM = -1074857199;
        getHighSpeedVideoSizesFor = true;
        Camera2StreamConfigurationMap = true;
        getHighSpeedVideoFpsRanges = new char[]{40004, 35341, 45309, 57007, 50448, 62458, 6573, 4, 12021, 21689, 17164, 17433, 21118, 26773, 1754, 7545, 11154, 49559, 55418, 63104, 36046, 39797, 45555, 20473, 26210, 31929, 2756, 8554, 16297, 54743, 60417, 64182, 37061, 44803, 57544, 63162, 52305, 41523, 47522, 36683, 25871, 31922, 30642, 25057, 23304, 13639, 12013, 6163, 61984, 60405, 50437, 40021, 35389, 45260, 57053, 50458, 62400, 6528, '*', 11988, 21652, 17211, 27129, 38865, 48694, 42236, 53913, 63797, 59388, 3463, 13402, 8930, 18629, 30544, 40446, 35777, 45659, 55526, 50857, 60689, 7158, 444, 10318, 22260, 31911, 27468};
        getInputFormats = -7363510829903738283L;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}

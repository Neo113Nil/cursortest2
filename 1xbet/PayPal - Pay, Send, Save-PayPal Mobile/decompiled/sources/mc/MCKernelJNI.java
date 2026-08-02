package mc;

/* loaded from: classes17.dex */
public class MCKernelJNI {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = 105 - i;
        byte[] bArr = $$a;
        int i4 = s + 103;
        byte[] bArr2 = new byte[b + 6];
        int i5 = b + 5;
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i4 = (i4 + (-i3)) - 5;
            i3 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            int i8 = i3 + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i2 + 1;
            i6 = i8;
            i3 = bArr[i8];
            i7 = i9;
            i4 = (i4 + (-i3)) - 5;
            i3 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            int i82 = i3 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            int i822 = i3 + 1;
            if (i2 == i5) {
            }
        }
    }

    private static void b(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i = (s * 4) + 103;
        int i2 = s2 * 2;
        byte[] bArr = $$d;
        int i3 = (s3 * 3) + 4;
        byte[] bArr2 = new byte[i2 + 35];
        int i4 = i2 + 34;
        int i5 = -1;
        if (bArr == null) {
            int i6 = i3 + 1;
            int i7 = (i3 + (-i4)) - 3;
            i3 = i6;
            i = i7;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i = (i + (-bArr[i3])) - 3;
        }
    }

    public static native void free(long j);

    public static native void freeTransaction(long j);

    public static native void init();

    public static native long newContext();

    public static native void setup(long j, byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native byte[] start(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, mc.MCKernelCallback mCKernelCallback) throws java.lang.IllegalArgumentException;

    public static native java.lang.String version();

    static {
        byte[] bArr = {com.google.common.base.Ascii.GS, -87, -11, 106, -1, -18, 41, -36, -1, -4, 19, -22, -17, 1, 0, -12, -2, 8, -9, -2, com.google.common.base.Ascii.FS, -41, -2, 1, -8, -2, com.google.common.base.Ascii.RS, -25, -20, 18, -17, 8, com.google.common.base.Ascii.ETB, -6, com.google.common.base.Ascii.SUB, -24, -13, 7};
        $$d = bArr;
        $$e = 57;
        byte[] bArr2 = {62, -20, -102, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, com.google.common.base.Ascii.FF, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -9, -54, -1, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -42, -38, -3, 4, -10, 2, -3, -20, com.google.common.base.Ascii.GS, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, 68};
        $$a = bArr2;
        $$b = 159;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) (bArr2[8] + 1), bArr2[11], (byte) (-bArr2[2]), objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.ClassLoader classLoader = mc.MCKernelJNI.class.getClassLoader();
        try {
            java.lang.Object[] objArr2 = {-1395598504};
            java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 349 - android.widget.ExpandableListView.getPackedPositionType(0L), android.widget.ExpandableListView.getPackedPositionType(0L) + 10, 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr3 = {str, classLoader, false, 1330447321, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), 1330447321};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
            if (Camera2StreamConfigurationMap2 == null) {
                char touchSlop = (char) (45285 - (android.view.ViewConfiguration.getTouchSlop() >> 8));
                int lastIndexOf = 157 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                int modifierMetaStateMask = 2 - ((byte) android.view.KeyEvent.getModifierMetaStateMask());
                byte b = bArr[14];
                byte b2 = b;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(b, b2, b2, objArr4);
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(touchSlop, lastIndexOf, modifierMetaStateMask, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - android.text.TextUtils.getCapsMode("", 0, 0)), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 104, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 33), java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
            if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                java.lang.Object[] objArr6 = {r0, new int[]{r11}, new int[]{r7}, new int[1]};
                int i = ((int[]) objArr5[3])[0];
                int i2 = ((int[]) objArr5[2])[0];
                int i3 = ((int[]) objArr5[1])[0];
                java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                int i4 = i + (((537142272 | r7) * (-196)) - 616024552) + (((~(((int) android.os.SystemClock.elapsedRealtime()) | 556721858)) | 19579586) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr6[3])[0] = i6 ^ (i6 << 5);
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a((byte) (-bArr2[21]), bArr2[24], (byte) 97, objArr7);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a((byte) (159 & 47), bArr2[24], (byte) 81, objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a((byte) (-bArr2[58]), bArr2[24], (byte) (bArr2[0] - 1), objArr9);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    byte b3 = bArr2[9];
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a(b3, (byte) (b3 - 4), bArr2[12], objArr10);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a(bArr2[41], bArr2[24], (byte) 37, objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a((byte) (-bArr2[42]), (byte) (bArr2[8] + 1), (byte) (-bArr2[37]), objArr12);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(mc.MCKernelJNI.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT <= 24) {
                        byte b4 = (byte) (-bArr2[38]);
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a(b4, b4, (byte) (-bArr2[58]), objArr13);
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(invoke, str, invoke2);
                    } else {
                        byte b5 = bArr2[14];
                        byte b6 = (byte) (-bArr2[38]);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a(b5, b6, (byte) (b6 - 5), objArr14);
                        java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls2, cls3);
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(invoke, invoke2, str);
                    }
                    init();
                    return;
                } catch (java.lang.reflect.InvocationTargetException e) {
                    java.lang.Throwable cause = e.getCause();
                    if (cause == null) {
                        throw e;
                    }
                    throw cause;
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String[] strArr2 = (java.lang.String[]) objArr5[0];
            if (strArr2 != null) {
                for (java.lang.String str2 : strArr2) {
                    arrayList.add(str2);
                }
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause2 = th.getCause();
            if (cause2 == null) {
                throw th;
            }
            throw cause2;
        }
    }
}

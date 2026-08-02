package visidon.Lib;

/* loaded from: classes18.dex */
public class VerificationAPI {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;

    private static native int a(int i, int i2, java.lang.String str, int i3, int i4, int i5, int i6, java.lang.Object obj);

    private static native int b();

    private static native int c(byte[] bArr);

    private static native int d(byte[] bArr);

    private static native int dd(byte[] bArr, int i, int i2);

    private static native int[] ddd(byte[] bArr);

    private static native int e();

    private static native int f();

    private static native int[] g();

    private static native int[] gg(int i, int i2);

    private static native int h(java.lang.String str);

    private static native byte[] i();

    private static native int j(byte[] bArr);

    private static native java.lang.String k();

    private static native int l(byte[] bArr);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 105 - i;
        int i5 = 21 - i2;
        int i6 = b + 72;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i6 = (i6 + (-i7)) - 5;
            i4++;
            bArr2[i3] = (byte) i6;
            i3++;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i6 = (i6 + (-i7)) - 5;
            i4++;
            bArr2[i3] = (byte) i6;
            i3++;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            i4++;
            bArr2[i3] = (byte) i6;
            i3++;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void n(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        int i2 = 3 - (b * 4);
        int i3 = b2 * 4;
        byte[] bArr = $$d;
        int i4 = 103 - (b3 * 4);
        byte[] bArr2 = new byte[i3 + 35];
        int i5 = i3 + 34;
        if (bArr == null) {
            int i6 = i5;
            i = 0;
            i4 = (i4 + (-i6)) - 3;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i6 = bArr[i2];
            i4 = (i4 + (-i6)) - 3;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }

    public static java.lang.String getVersion() {
        return k();
    }

    public enum EnrollMode {
        AUTOMATIC(2),
        MANUAL(1);

        private final int Camera2StreamConfigurationMap;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static visidon.Lib.VerificationAPI.EnrollMode[] valuesCustom() {
            visidon.Lib.VerificationAPI.EnrollMode[] valuesCustom = values();
            int length = valuesCustom.length;
            visidon.Lib.VerificationAPI.EnrollMode[] enrollModeArr = new visidon.Lib.VerificationAPI.EnrollMode[length];
            java.lang.System.arraycopy(valuesCustom, 0, enrollModeArr, 0, length);
            return enrollModeArr;
        }

        EnrollMode(int i) {
            this.Camera2StreamConfigurationMap = i;
        }

        public final int getValue() {
            return this.Camera2StreamConfigurationMap;
        }
    }

    public enum LivenessDetection {
        HIGH(55),
        LOW(30),
        OFF(0);

        private final int getHighSpeedVideoFpsRangesFor;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static visidon.Lib.VerificationAPI.LivenessDetection[] valuesCustom() {
            visidon.Lib.VerificationAPI.LivenessDetection[] valuesCustom = values();
            int length = valuesCustom.length;
            visidon.Lib.VerificationAPI.LivenessDetection[] livenessDetectionArr = new visidon.Lib.VerificationAPI.LivenessDetection[length];
            java.lang.System.arraycopy(valuesCustom, 0, livenessDetectionArr, 0, length);
            return livenessDetectionArr;
        }

        LivenessDetection(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        public final int getThreshold() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    public enum SecurityLevel {
        MAXIMUM(100),
        MEDIUM(90),
        LOW(85);

        private final int getHighSpeedVideoFpsRangesFor;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static visidon.Lib.VerificationAPI.SecurityLevel[] valuesCustom() {
            visidon.Lib.VerificationAPI.SecurityLevel[] valuesCustom = values();
            int length = valuesCustom.length;
            visidon.Lib.VerificationAPI.SecurityLevel[] securityLevelArr = new visidon.Lib.VerificationAPI.SecurityLevel[length];
            java.lang.System.arraycopy(valuesCustom, 0, securityLevelArr, 0, length);
            return securityLevelArr;
        }

        SecurityLevel(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        public final int getThreshold() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    public enum InitState {
        OK(0),
        FAILED(1);

        private final int Camera2StreamConfigurationMap;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static visidon.Lib.VerificationAPI.InitState[] valuesCustom() {
            visidon.Lib.VerificationAPI.InitState[] valuesCustom = values();
            int length = valuesCustom.length;
            visidon.Lib.VerificationAPI.InitState[] initStateArr = new visidon.Lib.VerificationAPI.InitState[length];
            java.lang.System.arraycopy(valuesCustom, 0, initStateArr, 0, length);
            return initStateArr;
        }

        InitState(int i) {
            this.Camera2StreamConfigurationMap = i;
        }

        public final int getState() {
            return this.Camera2StreamConfigurationMap;
        }
    }

    public enum AutoEnrollState {
        OK(0),
        FAILED(1);

        private final int getHighSpeedVideoFpsRangesFor;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static visidon.Lib.VerificationAPI.AutoEnrollState[] valuesCustom() {
            visidon.Lib.VerificationAPI.AutoEnrollState[] valuesCustom = values();
            int length = valuesCustom.length;
            visidon.Lib.VerificationAPI.AutoEnrollState[] autoEnrollStateArr = new visidon.Lib.VerificationAPI.AutoEnrollState[length];
            java.lang.System.arraycopy(valuesCustom, 0, autoEnrollStateArr, 0, length);
            return autoEnrollStateArr;
        }

        AutoEnrollState(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        public final int getState() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    public enum ReleaseState {
        OK(0),
        FAILED(1);

        private final int getHighSpeedVideoSizes;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static visidon.Lib.VerificationAPI.ReleaseState[] valuesCustom() {
            visidon.Lib.VerificationAPI.ReleaseState[] valuesCustom = values();
            int length = valuesCustom.length;
            visidon.Lib.VerificationAPI.ReleaseState[] releaseStateArr = new visidon.Lib.VerificationAPI.ReleaseState[length];
            java.lang.System.arraycopy(valuesCustom, 0, releaseStateArr, 0, length);
            return releaseStateArr;
        }

        ReleaseState(int i) {
            this.getHighSpeedVideoSizes = i;
        }

        public final int getState() {
            return this.getHighSpeedVideoSizes;
        }
    }

    public enum VerifyState {
        ALLOW(0),
        DENY(1),
        NO_FACE(2),
        TOO_MANY_FACES(3),
        NO_LANDMARKS(4),
        ERROR(5);

        private final int getHighSpeedVideoFpsRanges;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static visidon.Lib.VerificationAPI.VerifyState[] valuesCustom() {
            visidon.Lib.VerificationAPI.VerifyState[] valuesCustom = values();
            int length = valuesCustom.length;
            visidon.Lib.VerificationAPI.VerifyState[] verifyStateArr = new visidon.Lib.VerificationAPI.VerifyState[length];
            java.lang.System.arraycopy(valuesCustom, 0, verifyStateArr, 0, length);
            return verifyStateArr;
        }

        VerifyState(int i) {
            this.getHighSpeedVideoFpsRanges = i;
        }

        public final int getState() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    public enum EnrollState {
        DONE(0),
        KEEP_STILL(1),
        NO_FACE(2),
        TOO_MANY_FACES(3),
        NO_LANDMARKS(4),
        ERROR(5);

        private final int getHighSpeedVideoFpsRangesFor;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static visidon.Lib.VerificationAPI.EnrollState[] valuesCustom() {
            visidon.Lib.VerificationAPI.EnrollState[] valuesCustom = values();
            int length = valuesCustom.length;
            visidon.Lib.VerificationAPI.EnrollState[] enrollStateArr = new visidon.Lib.VerificationAPI.EnrollState[length];
            java.lang.System.arraycopy(valuesCustom, 0, enrollStateArr, 0, length);
            return enrollStateArr;
        }

        EnrollState(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        public final int getState() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    public enum ResetState {
        OK(0),
        FAILED(1);

        private final int getHighSpeedVideoSizes;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static visidon.Lib.VerificationAPI.ResetState[] valuesCustom() {
            visidon.Lib.VerificationAPI.ResetState[] valuesCustom = values();
            int length = valuesCustom.length;
            visidon.Lib.VerificationAPI.ResetState[] resetStateArr = new visidon.Lib.VerificationAPI.ResetState[length];
            java.lang.System.arraycopy(valuesCustom, 0, resetStateArr, 0, length);
            return resetStateArr;
        }

        ResetState(int i) {
            this.getHighSpeedVideoSizes = i;
        }

        public final int getState() {
            return this.getHighSpeedVideoSizes;
        }
    }

    public enum LoadState {
        OK(0),
        FAILED(1);

        private final int getHighSpeedVideoFpsRanges;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static visidon.Lib.VerificationAPI.LoadState[] valuesCustom() {
            visidon.Lib.VerificationAPI.LoadState[] valuesCustom = values();
            int length = valuesCustom.length;
            visidon.Lib.VerificationAPI.LoadState[] loadStateArr = new visidon.Lib.VerificationAPI.LoadState[length];
            java.lang.System.arraycopy(valuesCustom, 0, loadStateArr, 0, length);
            return loadStateArr;
        }

        LoadState(int i) {
            this.getHighSpeedVideoFpsRanges = i;
        }

        public final int getState() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    public enum DetectionMode {
        STILL(2),
        VIDEO(1);

        private final int getHighSpeedVideoFpsRanges;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static visidon.Lib.VerificationAPI.DetectionMode[] valuesCustom() {
            visidon.Lib.VerificationAPI.DetectionMode[] valuesCustom = values();
            int length = valuesCustom.length;
            visidon.Lib.VerificationAPI.DetectionMode[] detectionModeArr = new visidon.Lib.VerificationAPI.DetectionMode[length];
            java.lang.System.arraycopy(valuesCustom, 0, detectionModeArr, 0, length);
            return detectionModeArr;
        }

        DetectionMode(int i) {
            this.getHighSpeedVideoFpsRanges = i;
        }

        public final int getValue() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    public static visidon.Lib.VerificationAPI.InitState loadLicense(byte[] bArr) {
        if (l(bArr) == 1) {
            return visidon.Lib.VerificationAPI.InitState.OK;
        }
        return visidon.Lib.VerificationAPI.InitState.FAILED;
    }

    public static visidon.Lib.VerificationAPI.InitState initialize(visidon.Lib.Parameters parameters) {
        if (parameters.imageWidth == 0 || parameters.imageHeight == 0) {
            return visidon.Lib.VerificationAPI.InitState.FAILED;
        }
        return visidon.Lib.VerificationAPI.InitState.valuesCustom()[a(parameters.imageWidth, parameters.imageHeight, parameters.databaseLocation, parameters.detectionMode.getValue(), parameters.securityLevel.getThreshold(), parameters.livenessDetection.getThreshold(), parameters.enrollMode.getValue(), parameters.appContext)];
    }

    public static visidon.Lib.VerificationAPI.ReleaseState release() {
        return visidon.Lib.VerificationAPI.ReleaseState.valuesCustom()[b()];
    }

    public static visidon.Lib.VerificationAPI.VerifyState verifyFace(byte[] bArr) {
        return visidon.Lib.VerificationAPI.VerifyState.valuesCustom()[d(bArr)];
    }

    public static visidon.Lib.FaceInfo verifyFaceExtended(byte[] bArr) {
        return new visidon.Lib.FaceInfo(ddd(bArr));
    }

    public static visidon.Lib.VerificationAPI.VerifyState verifyFace(byte[] bArr, int i, int i2) {
        return visidon.Lib.VerificationAPI.VerifyState.valuesCustom()[dd(bArr, i, i2)];
    }

    public static visidon.Lib.VerificationAPI.EnrollState enrollFace(byte[] bArr) {
        return visidon.Lib.VerificationAPI.EnrollState.valuesCustom()[c(bArr)];
    }

    public static byte[] getEnrolledFaceTemplate() {
        return i();
    }

    public static visidon.Lib.VerificationAPI.LoadState loadFaceTemplate(byte[] bArr) {
        return visidon.Lib.VerificationAPI.LoadState.valuesCustom()[j(bArr)];
    }

    public static visidon.Lib.VerificationAPI.ResetState resetDatabase() {
        return visidon.Lib.VerificationAPI.ResetState.valuesCustom()[e()];
    }

    public static int getNbrOfDBItems() {
        return f();
    }

    public static visidon.Lib.FaceInfo getFaceInfo() {
        return new visidon.Lib.FaceInfo(g());
    }

    public static visidon.Lib.FaceInfo getFaceInfo(int i, int i2) {
        return new visidon.Lib.FaceInfo(gg(i, i2));
    }

    public static visidon.Lib.VerificationAPI.AutoEnrollState confirmAutoEnroll(java.lang.String str) {
        return visidon.Lib.VerificationAPI.AutoEnrollState.valuesCustom()[h(str)];
    }

    public static visidon.Lib.VerificationAPI.AutoEnrollState confirmAutoEnroll(android.content.Context context) {
        visidon.Lib.VerificationAPI.AutoEnrollState[] valuesCustom = visidon.Lib.VerificationAPI.AutoEnrollState.valuesCustom();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(context.getFilesDir());
        sb.append("/database.db");
        return valuesCustom[h(sb.toString())];
    }

    public static android.graphics.Bitmap getAutoEnrollFace(android.content.Context context) {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(context.getFilesDir());
            sb.append("/face");
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(sb.toString()));
            byte[] bArr = new byte[78000];
            bufferedInputStream.read(bArr, 0, 78000);
            bufferedInputStream.close();
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(130, 150, android.graphics.Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(java.nio.ByteBuffer.wrap(bArr));
            return createBitmap;
        } catch (java.io.FileNotFoundException | java.io.IOException unused) {
            return null;
        }
    }

    static {
        byte[] bArr = {4, 65, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 39, -1, -18, 41, -36, -1, -4, 19, -22, -17, 1, 0, -12, -2, 8, -9, -2, com.google.common.base.Ascii.FS, -41, -2, 1, -8, -2, com.google.common.base.Ascii.RS, -25, -20, 18, -17, 8, com.google.common.base.Ascii.ETB, -6, com.google.common.base.Ascii.SUB, -24, -13, 7};
        $$d = bArr;
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE;
        byte[] bArr2 = {33, 69, 87, -70, com.google.common.base.Ascii.FF, -2, -52, 43, -5, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -42, -38, -3, 4, -10, 2, -3, -20, com.google.common.base.Ascii.GS, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, 68};
        $$a = bArr2;
        $$b = 205;
        byte b = (byte) 0;
        java.lang.Object[] objArr = new java.lang.Object[1];
        m(b, (byte) (b | 102), (byte) (bArr2[11] - 1), objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.ClassLoader classLoader = visidon.Lib.VerificationAPI.class.getClassLoader();
        try {
            java.lang.Object[] objArr2 = {-1395598504};
            java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 349, android.view.View.resolveSizeAndState(0, 0, 0) + 10, 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr3 = {str, classLoader, false, -2013776813, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), -2013776813};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
            if (Camera2StreamConfigurationMap2 == null) {
                char alpha = (char) (45285 - android.graphics.Color.alpha(0));
                int i = 157 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int minimumFlingVelocity = 3 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte b2 = bArr[14];
                byte b3 = b2;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                n(b2, b3, b3, objArr4);
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(alpha, i, minimumFlingVelocity, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - android.text.TextUtils.getOffsetAfter("", 0)), android.text.TextUtils.indexOf("", "", 0, 0) + 104, 33 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
            if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                java.lang.Object[] objArr6 = {r0, new int[]{r12}, new int[]{r10}, new int[1]};
                int i2 = ((int[]) objArr5[3])[0];
                int i3 = ((int[]) objArr5[2])[0];
                int i4 = ((int[]) objArr5[1])[0];
                java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                int myPid = android.os.Process.myPid();
                int i5 = i2 + 1307707808 + (((~((-372937247) | myPid)) | 102371330) * 336) + (((~(myPid | 647966850)) | (-918532767)) * (-168)) + (((~((~myPid) | 647966850)) | (-372937247)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr6[3])[0] = i7 ^ (i7 << 5);
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    m(bArr2[39], (byte) 97, bArr2[9], objArr7);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    m(bArr2[39], (byte) 81, b, objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    m(bArr2[39], (byte) 61, (byte) (-bArr2[8]), objArr9);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    byte b4 = (byte) 31;
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    m(b4, bArr2[12], (byte) (-bArr2[21]), objArr10);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    byte b5 = bArr2[39];
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    m(b5, (byte) (b5 + 3), bArr2[14], objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    byte b6 = (byte) (-bArr2[37]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    m(b4, b6, (byte) (b6 & com.google.common.base.Ascii.SI), objArr12);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(visidon.Lib.VerificationAPI.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT > 24) {
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        m((byte) 36, b, bArr2[41], objArr13);
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls2, cls3);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(invoke, invoke2, str);
                        return;
                    }
                    byte b7 = (byte) (-bArr2[58]);
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    m((byte) 36, b7, b7, objArr14);
                    java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls3, cls2);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(invoke, str, invoke2);
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

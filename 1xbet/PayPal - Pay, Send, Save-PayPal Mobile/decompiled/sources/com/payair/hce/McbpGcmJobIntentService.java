package com.payair.hce;

/* loaded from: classes10.dex */
public class McbpGcmJobIntentService extends androidx.core.app.JobIntentService {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static boolean getAid;
    private static boolean getProfileVersion;
    private static char[] valueOf;
    private static char values;
    private static long writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 119 - b3;
        byte[] bArr = $$a;
        int i4 = 42 - b2;
        int i5 = b + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            int i7 = i5;
            int i8 = (i6 + i5) - 2;
            i = i2;
            int i9 = i7;
            i3 = i8;
            i5 = i9;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i5 + 1;
            int i11 = i3;
            i7 = i10;
            i5 = bArr[i10];
            i6 = i11;
            int i82 = (i6 + i5) - 2;
            i = i2;
            int i92 = i7;
            i3 = i82;
            i5 = i92;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    private static void d(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2 = i + 65;
        byte[] bArr = $$d;
        int i3 = 473 - s;
        byte[] bArr2 = new byte[46 - b];
        int i4 = -1;
        if (bArr == null) {
            i2 = i3 + (-i2);
            i3 = i3;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == 45 - b) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i5 = i3 + 1;
            i2 += -bArr[i5];
            i3 = i5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4;
        ?? r9 = 118 - b;
        int i5 = (i * 2) + 1;
        byte[] bArr = $$g;
        int i6 = 3 - (s * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            byte b2 = r9;
            i4 = 0;
            int i7 = i6;
            int i8 = i6 + b2;
            i2 = i4;
            int i9 = i7;
            i3 = i8;
            i6 = i9;
            int i10 = i6 + 1;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i3;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b2 = bArr[i10];
            int i11 = i3;
            i7 = i10;
            i6 = i11;
            int i82 = i6 + b2;
            i2 = i4;
            int i92 = i7;
            i3 = i82;
            i6 = i92;
            int i102 = i6 + 1;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i3;
            if (i4 == i5) {
            }
        } else {
            i2 = 0;
            i3 = r9;
            int i1022 = i6 + 1;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i3;
            if (i4 == i5) {
            }
        }
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(android.content.Intent intent) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i ^ 93;
        int i3 = ((((i & 93) | i2) << 1) - (~(-i2))) - 1;
        RecordsJson = i3 % 128;
        java.lang.String str = null;
        if (i3 % 2 != 0) {
            android.os.Bundle extras = intent.getExtras();
            if (extras.containsKey("payload")) {
                str = extras.getString("payload");
                int i4 = SdkCoreAlternateContactlessPaymentDataImpl;
                int i5 = i4 | 121;
                int i6 = i5 << 1;
                int i7 = -((~(i4 & 121)) & i5);
                RecordsJson = ((i6 & i7) + (i7 | i6)) % 128;
            }
            com.payair.hce.setAccessibilityLiveRegion.writeReplace(new java.lang.Object[]{str, getBaseContext()}, -1332113624, 1332113624, (int) java.lang.System.currentTimeMillis());
            int i8 = RecordsJson;
            int i9 = i8 & 71;
            int i10 = -(-((i8 ^ 71) | i9));
            SdkCoreAlternateContactlessPaymentDataImpl = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
            return;
        }
        intent.getExtras().containsKey("payload");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0603 A[Catch: all -> 0x08d0, TryCatch #0 {all -> 0x08d0, blocks: (B:7:0x00ef, B:9:0x0107, B:10:0x013d, B:17:0x02d0, B:19:0x02e5, B:20:0x031c, B:26:0x0525, B:28:0x0542, B:29:0x0581, B:34:0x073e, B:36:0x0758, B:37:0x0798, B:43:0x0845, B:45:0x085f, B:46:0x089e, B:55:0x05df, B:57:0x0603, B:58:0x0659, B:72:0x032a, B:74:0x0340, B:75:0x0379, B:80:0x03fd, B:82:0x0413, B:83:0x0448, B:85:0x01a0, B:87:0x01ba, B:88:0x01ea), top: B:2:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0380  */
    @Override // androidx.core.app.JobIntentService, android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(android.content.Context context) {
        java.lang.Object[] writeReplace$4956fc2a;
        char c;
        int i;
        int i2;
        long j;
        java.lang.Object obj;
        java.lang.Object[] objArr;
        char c2;
        int i3;
        super.attachBaseContext(context);
        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777172) - android.graphics.Color.rgb(0, 0, 0), 922 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
        byte[] bArr = $$a;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(bArr[18], bArr[3], org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, objArr2);
        long j2 = cls.getField((java.lang.String) objArr2[0]).getLong(null);
        try {
            try {
                try {
                    try {
                        if (j2 != -1) {
                            SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 47) % 128;
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            b("鐍녿ⷊ\u0b59뱮⭽⨅풛铻Ḧท\ue3b7軿訋䟇\uea57闚㕏\ue355䌝똠돾", "\u0000\u0000\u0000\u0000", "㛫㏿삵ꗦ", android.view.KeyEvent.normalizeMetaState(0), (char) android.text.TextUtils.getOffsetAfter("", 0), objArr3);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            c(126 - android.view.MotionEvent.axisFromString(""), null, null, "\u0081\u008a\u0089\u0088\u0082\u0083\u0081\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr4);
                            if (j2 + 4611686018427387913L >= ((java.lang.Long) cls2.getDeclaredMethod((java.lang.String) objArr4[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 44, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 922, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                a((byte) (-bArr[16]), bArr[17], bArr[11], objArr5);
                                java.lang.Object[] objArr6 = {cls3.getField((java.lang.String) objArr5[0]).get(null), -723739918, 0};
                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                if (obj2 == null) {
                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 45, 4861 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj2);
                                }
                                writeReplace$4956fc2a = (java.lang.Object[]) ((java.lang.reflect.Method) obj2).invoke(null, objArr6);
                                RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 63) % 128;
                                c = 1;
                                i = ((int[]) writeReplace$4956fc2a[c])[0];
                                i2 = ((int[]) writeReplace$4956fc2a[0])[0];
                                if (i2 != i) {
                                    int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 11;
                                    RecordsJson = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        java.lang.Object[] objArr7 = {writeReplace$4956fc2a, java.lang.Integer.valueOf(((int[]) writeReplace$4956fc2a[2])[0]), 0};
                                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                        if (obj3 == null) {
                                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 46, 4859 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.view.KeyEvent.keyCodeFromString(""))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj3);
                                        }
                                        ((java.lang.reflect.Method) obj3).invoke(null, objArr7);
                                    } else {
                                        java.lang.Object[] objArr8 = {writeReplace$4956fc2a, java.lang.Integer.valueOf(((int[]) writeReplace$4956fc2a[3])[0]), 0};
                                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                        if (obj4 == null) {
                                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 4860, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj4);
                                        }
                                        ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                                    }
                                } else {
                                    new java.util.ArrayList().add((java.lang.String) writeReplace$4956fc2a[2]);
                                    long j3 = i ^ i2;
                                    SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 9) % 128;
                                    try {
                                        java.lang.Object[] objArr9 = {java.lang.Long.valueOf(8348082969222578176L ^ j3), 1943689529L};
                                        byte[] bArr2 = $$d;
                                        byte b = bArr2[126];
                                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                                        d(b, (short) (b | 470), bArr2[147], objArr10);
                                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        d((byte) (-bArr2[472]), (short) 425, bArr2[63], objArr11);
                                        cls4.getMethod((java.lang.String) objArr11[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr9);
                                        java.lang.Object[] objArr12 = {writeReplace$4956fc2a, java.lang.Integer.valueOf(((int[]) writeReplace$4956fc2a[3])[0]), 0};
                                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                        if (obj5 == null) {
                                            obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.text.TextUtils.indexOf("", "", 0, 0), 4860 - android.text.TextUtils.getCapsMode("", 0, 0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj5);
                                        }
                                        ((java.lang.reflect.Method) obj5).invoke(null, objArr12);
                                    } catch (java.lang.Throwable th) {
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 707 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (34284 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)));
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                a((byte) (bArr[3] + 1), (byte) (bArr[17] - 1), bArr[11], objArr13);
                                j = cls5.getField((java.lang.String) objArr13[0]).getLong(null);
                                if (j != -1) {
                                    RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 115) % 128;
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    b("鐍녿ⷊ\u0b59뱮⭽⨅풛铻Ḧท\ue3b7軿訋䟇\uea57闚㕏\ue355䌝똠돾", "\u0000\u0000\u0000\u0000", "㛫㏿삵ꗦ", android.text.TextUtils.getOffsetAfter("", 0), (char) (android.os.Process.myTid() >> 22), objArr14);
                                    java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    c((android.os.Process.myTid() >> 22) + 127, null, null, "\u0081\u008a\u0089\u0088\u0082\u0083\u0081\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr15);
                                    if (j + 1875 >= ((java.lang.Long) cls6.getDeclaredMethod((java.lang.String) objArr15[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 47, 707 - android.view.View.MeasureSpec.getSize(0), (char) (android.view.View.combineMeasuredStates(0, 0) + 34284));
                                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                                        a(com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, bArr[5], objArr16);
                                        java.lang.Object[] objArr17 = {cls7.getField((java.lang.String) objArr16[0]).get(null), 440510433, 0};
                                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                        if (obj6 == null) {
                                            obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 33, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4718, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj6);
                                        }
                                        objArr = (java.lang.Object[]) ((java.lang.reflect.Method) obj6).invoke(null, objArr17);
                                        c2 = 1;
                                        i3 = ((int[]) objArr[c2])[0];
                                        if (((int[]) objArr[0])[0] == i3) {
                                            SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 45) % 128;
                                            java.lang.Object[] objArr18 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[9])[0]), 0};
                                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                            if (obj7 == null) {
                                                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 33, 4718 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj7);
                                            }
                                            ((java.lang.reflect.Method) obj7).invoke(null, objArr18);
                                            return;
                                        }
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        arrayList.add((java.lang.String) objArr[2]);
                                        arrayList.add((java.lang.String) objArr[3]);
                                        arrayList.add((java.lang.String) objArr[4]);
                                        arrayList.add((java.lang.String) objArr[5]);
                                        arrayList.add((java.lang.String) objArr[6]);
                                        arrayList.add((java.lang.String) objArr[7]);
                                        arrayList.add((java.lang.String) objArr[8]);
                                        java.lang.Object[] objArr19 = {java.lang.Long.valueOf((i3 ^ r4) ^ (-1878305063873544192L)), -437326978L};
                                        byte[] bArr3 = $$d;
                                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                                        d(bArr3[29], (short) 406, bArr3[147], objArr20);
                                        java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr20[0]);
                                        byte b2 = bArr3[147];
                                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                                        d(b2, (short) (b2 | 344), (byte) (bArr3[17] - 1), objArr21);
                                        cls8.getMethod((java.lang.String) objArr21[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr19);
                                        java.lang.Object[] objArr22 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[9])[0]), 0};
                                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                        if (obj8 == null) {
                                            obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 34, 4716 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj8);
                                        }
                                        ((java.lang.reflect.Method) obj8).invoke(null, objArr22);
                                        return;
                                    }
                                }
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                c(126 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), null, null, "\u008a\u0081\u0088\u0085\u0091\u0090\u008d\u008f\u008e\u0083\u0082\u008d\u0083\u008c\u0083\u008b", objArr23);
                                java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                b("客ᵎ⧕\udbf3劎乳贖햆쩡焫\udcc0鶞ἲ唅嗚䉯", "\u0000\u0000\u0000\u0000", "垈㒛톣⦜", android.text.TextUtils.indexOf("", ""), (char) (40145 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), objArr24);
                                java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(((java.lang.Integer) cls9.getMethod((java.lang.String) objArr24[0], java.lang.Object.class).invoke(null, this)).intValue()), 0, 440510433};
                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                if (obj == null) {
                                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.KeyEvent.getMaxKeyCode() >> 16) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (34284 - android.text.TextUtils.getCapsMode("", 0, 0)));
                                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                                    a((byte) (bArr[3] + 1), (byte) (bArr[17] - 1), bArr[11], objArr26);
                                    obj = cls10.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1346294939, obj);
                                }
                                objArr = (java.lang.Object[]) ((java.lang.reflect.Method) obj).invoke(null, objArr25);
                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 47, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (34284 - android.graphics.Color.red(0)));
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                a(com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, bArr[5], objArr27);
                                cls11.getField((java.lang.String) objArr27[0]).set(null, objArr);
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                b("鐍녿ⷊ\u0b59뱮⭽⨅풛铻Ḧท\ue3b7軿訋䟇\uea57闚㕏\ue355䌝똠돾", "\u0000\u0000\u0000\u0000", "㛫㏿삵ꗦ", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr28);
                                java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr28[0]);
                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                c(127 - android.view.KeyEvent.normalizeMetaState(0), null, null, "\u0081\u008a\u0089\u0088\u0082\u0083\u0081\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr29);
                                long longValue = ((java.lang.Long) cls12.getDeclaredMethod((java.lang.String) objArr29[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 48, 707 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (34283 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                c2 = 1;
                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                a((byte) (bArr[3] + 1), (byte) (bArr[17] - 1), bArr[11], objArr30);
                                cls13.getField((java.lang.String) objArr30[0]).set(null, java.lang.Long.valueOf(longValue));
                                i3 = ((int[]) objArr[c2])[0];
                                if (((int[]) objArr[0])[0] == i3) {
                                }
                            }
                        }
                        java.lang.Object[] objArr282 = new java.lang.Object[1];
                        b("鐍녿ⷊ\u0b59뱮⭽⨅풛铻Ḧท\ue3b7軿訋䟇\uea57闚㕏\ue355䌝똠돾", "\u0000\u0000\u0000\u0000", "㛫㏿삵ꗦ", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr282);
                        java.lang.Class<?> cls122 = java.lang.Class.forName((java.lang.String) objArr282[0]);
                        java.lang.Object[] objArr292 = new java.lang.Object[1];
                        c(127 - android.view.KeyEvent.normalizeMetaState(0), null, null, "\u0081\u008a\u0089\u0088\u0082\u0083\u0081\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr292);
                        long longValue2 = ((java.lang.Long) cls122.getDeclaredMethod((java.lang.String) objArr292[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Class cls132 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 48, 707 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (34283 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                        c2 = 1;
                        java.lang.Object[] objArr302 = new java.lang.Object[1];
                        a((byte) (bArr[3] + 1), (byte) (bArr[17] - 1), bArr[11], objArr302);
                        cls132.getField((java.lang.String) objArr302[0]).set(null, java.lang.Long.valueOf(longValue2));
                        i3 = ((int[]) objArr[c2])[0];
                        if (((int[]) objArr[0])[0] == i3) {
                        }
                    } catch (java.lang.Exception unused) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    }
                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                    b("鐍녿ⷊ\u0b59뱮⭽⨅풛铻Ḧท\ue3b7軿訋䟇\uea57闚㕏\ue355䌝똠돾", "\u0000\u0000\u0000\u0000", "㛫㏿삵ꗦ", android.view.ViewConfiguration.getEdgeSlop() >> 16, (char) android.view.View.MeasureSpec.getMode(0), objArr31);
                    java.lang.Class<?> cls14 = java.lang.Class.forName((java.lang.String) objArr31[0]);
                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                    c((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, null, null, "\u0081\u008a\u0089\u0088\u0082\u0083\u0081\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr32);
                    long longValue3 = ((java.lang.Long) cls14.getDeclaredMethod((java.lang.String) objArr32[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 44, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 922, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                    a(bArr[18], bArr[3], org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, objArr33);
                    cls15.getField((java.lang.String) objArr33[0]).set(null, java.lang.Long.valueOf(longValue3));
                    c = 1;
                    i = ((int[]) writeReplace$4956fc2a[c])[0];
                    i2 = ((int[]) writeReplace$4956fc2a[0])[0];
                    if (i2 != i) {
                    }
                    java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 707 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (34284 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)));
                    java.lang.Object[] objArr132 = new java.lang.Object[1];
                    a((byte) (bArr[3] + 1), (byte) (bArr[17] - 1), bArr[11], objArr132);
                    j = cls52.getField((java.lang.String) objArr132[0]).getLong(null);
                    if (j != -1) {
                    }
                    java.lang.Object[] objArr232 = new java.lang.Object[1];
                    c(126 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), null, null, "\u008a\u0081\u0088\u0085\u0091\u0090\u008d\u008f\u008e\u0083\u0082\u008d\u0083\u008c\u0083\u008b", objArr232);
                    java.lang.Class<?> cls92 = java.lang.Class.forName((java.lang.String) objArr232[0]);
                    java.lang.Object[] objArr242 = new java.lang.Object[1];
                    b("客ᵎ⧕\udbf3劎乳贖햆쩡焫\udcc0鶞ἲ唅嗚䉯", "\u0000\u0000\u0000\u0000", "垈㒛톣⦜", android.text.TextUtils.indexOf("", ""), (char) (40145 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), objArr242);
                    java.lang.Object[] objArr252 = {java.lang.Integer.valueOf(((java.lang.Integer) cls92.getMethod((java.lang.String) objArr242[0], java.lang.Object.class).invoke(null, this)).intValue()), 0, 440510433};
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                    if (obj == null) {
                    }
                    objArr = (java.lang.Object[]) ((java.lang.reflect.Method) obj).invoke(null, objArr252);
                    java.lang.Class cls112 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 47, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (34284 - android.graphics.Color.red(0)));
                    java.lang.Object[] objArr272 = new java.lang.Object[1];
                    a(com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, bArr[5], objArr272);
                    cls112.getField((java.lang.String) objArr272[0]).set(null, objArr);
                } catch (java.lang.Exception unused2) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            java.lang.Object[] objArr34 = new java.lang.Object[1];
            c(127 - android.view.View.getDefaultSize(0, 0), null, null, "\u008a\u0081\u0088\u0085\u0091\u0090\u008d\u008f\u008e\u0083\u0082\u008d\u0083\u008c\u0083\u008b", objArr34);
            java.lang.Class<?> cls16 = java.lang.Class.forName((java.lang.String) objArr34[0]);
            java.lang.Object[] objArr35 = new java.lang.Object[1];
            b("客ᵎ⧕\udbf3劎乳贖햆쩡焫\udcc0鶞ἲ唅嗚䉯", "\u0000\u0000\u0000\u0000", "垈㒛톣⦜", android.text.TextUtils.indexOf("", "", 0), (char) (android.view.View.MeasureSpec.getMode(0) + 40145), objArr35);
            int intValue = ((java.lang.Integer) cls16.getMethod((java.lang.String) objArr35[0], java.lang.Object.class).invoke(null, this)).intValue();
            java.lang.Object[] objArr36 = {1832703537};
            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
            if (obj9 == null) {
                obj9 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 49, android.graphics.Color.argb(0, 0, 0, 0) + 873, (char) (android.text.TextUtils.getOffsetAfter("", 0) + 15955))).getDeclaredConstructor(java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1647138923, obj9);
            }
            writeReplace$4956fc2a = com.payair.hce.createWindowContext.writeReplace$4956fc2a(intValue, ((java.lang.reflect.Constructor) obj9).newInstance(objArr36));
            java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 922, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
            java.lang.Object[] objArr37 = new java.lang.Object[1];
            a((byte) (-bArr[16]), bArr[17], bArr[11], objArr37);
            cls17.getField((java.lang.String) objArr37[0]).set(null, writeReplace$4956fc2a);
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    private static void b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char c2;
        int i2 = $10 + 107;
        $11 = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            $11 = ($10 + 71) % 128;
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr2 = cArr;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        short s = 0;
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length);
        java.lang.System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr5 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $11 = ($10 + 13) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - android.graphics.drawable.Drawable.resolveOpacity(s, s), android.view.View.getDefaultSize(s, s) + 1179, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    f(s, s, (byte) 16, objArr3);
                    java.lang.String str4 = (java.lang.String) objArr3[s];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[s] = java.lang.Object.class;
                    obj2 = cls.getMethod(str4, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.text.TextUtils.getCapsMode("", s, s), 3443 - android.graphics.Color.green((int) s), (char) (3831 - android.text.TextUtils.getOffsetBefore("", s)));
                    java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                    clsArr2[s] = java.lang.Object.class;
                    obj3 = cls2.getMethod("g", clsArr2);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                char c3 = cArr3[getwalletdata.writeReplace % 4];
                java.lang.Object[] objArr5 = new java.lang.Object[3];
                objArr5[2] = java.lang.Integer.valueOf(cArr4[intValue]);
                objArr5[1] = java.lang.Integer.valueOf(c3 * 32718);
                objArr5[s] = getwalletdata;
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.view.View.resolveSizeAndState(s, s, s), android.text.TextUtils.getTrimmedLength("") + 1864, (char) (41774 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    f(s, s, (byte) 13, objArr6);
                    java.lang.String str5 = (java.lang.String) objArr6[s];
                    java.lang.Class<?>[] clsArr3 = new java.lang.Class[3];
                    clsArr3[s] = java.lang.Object.class;
                    clsArr3[1] = java.lang.Integer.TYPE;
                    clsArr3[2] = java.lang.Integer.TYPE;
                    obj4 = cls3.getMethod(str5, clsArr3);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                char c4 = cArr3[intValue2];
                java.lang.Object[] objArr7 = new java.lang.Object[2];
                objArr7[1] = java.lang.Integer.valueOf(cArr4[intValue]);
                objArr7[s] = java.lang.Integer.valueOf(c4 * 32718);
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777188) - android.graphics.Color.rgb((int) s, (int) s, (int) s), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, s, s) + 3134, (char) (android.util.TypedValue.complexToFraction(s, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(s, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    f(s, s, com.google.common.base.Ascii.FF, objArr8);
                    java.lang.String str6 = (java.lang.String) objArr8[s];
                    c2 = 2;
                    java.lang.Class<?>[] clsArr4 = new java.lang.Class[2];
                    clsArr4[s] = java.lang.Integer.TYPE;
                    clsArr4[1] = java.lang.Integer.TYPE;
                    obj5 = cls4.getMethod(str6, clsArr4);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                } else {
                    c2 = 2;
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                cArr5[getwalletdata.writeReplace] = (char) ((((int) (DigitizedCardProfile ^ 1263759066225628708L)) ^ ((cArr3[intValue2] ^ charArray2[getwalletdata.writeReplace]) ^ (writeReplace ^ 1263759066225628708L))) ^ ((char) (values ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                obj = null;
                s = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    private static void c(int i, java.lang.String str, int[] iArr, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            $11 = ($10 + 9) % 128;
            byte[] bytes = str3.getBytes("ISO-8859-1");
            $11 = ($10 + 115) % 128;
            bArr = bytes;
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = AlternateContactlessPaymentDataJson;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i2 = 0;
            while (i2 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i2])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.util.TypedValue.complexToFloat(0) > f ? 1 : (android.util.TypedValue.complexToFloat(0) == f ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionChild(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 46338))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i2++;
                    f = 0.0f;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 46, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, (char) (46337 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (getProfileVersion) {
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 42, android.text.TextUtils.getTrimmedLength("") + 1629, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    f(0, (short) 0, (byte) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (!getAid) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $11 = ($10 + 115) % 128;
                cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        $11 = ($10 + 35) % 128;
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 44, android.view.View.MeasureSpec.getMode(0) + 1629, (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                f(0, (short) 0, (byte) 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    private static void e(int[] iArr, boolean z, java.lang.String str, java.lang.Object[] objArr) {
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            $10 = ($11 + 45) % 128;
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = valueOf;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 29, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2808, (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        f(0, (short) 0, (byte) 9, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bArr2 != null) {
            char[] cArr4 = new char[i2];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i2) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i6 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777172) - android.graphics.Color.rgb(0, 0, 0), 2836 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.MotionEvent.axisFromString("") + 1));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        f(0, (short) 0, com.google.common.base.Ascii.VT, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr4[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i7 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 43, android.text.TextUtils.indexOf("", "", 0, 0) + 2880, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        f(0, (short) 0, (byte) 7, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr4[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.graphics.Color.argb(0, 0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            int i8 = $11 + 15;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            $11 = ($10 + 61) % 128;
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i10 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i10, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i10);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i2) {
                cArr6[getaccounttype.writeReplace] = cArr3[(i2 - getaccounttype.writeReplace) - 1];
                getaccounttype.writeReplace++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            loop3: while (true) {
                getaccounttype.writeReplace = 0;
                while (getaccounttype.writeReplace < i2) {
                    int i11 = $10 + 81;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        break;
                    }
                    cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                    getaccounttype.writeReplace++;
                }
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] << iArr[3]);
                int i12 = getaccounttype.writeReplace;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x1f90  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x23db  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x244a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x2268  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x2295  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x2322  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x207f  */
    @Override // androidx.core.app.JobIntentService, android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object[] objArr;
        java.lang.Long valueOf2;
        java.lang.Class cls;
        java.lang.Object obj;
        char c;
        java.lang.Object[] objArr2;
        java.lang.String str4;
        int i;
        java.lang.Object obj2;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.Object[] objArr3;
        java.lang.Object[] objArr4;
        java.lang.String str7;
        int i2;
        java.lang.Object[] objArr5;
        char c2;
        java.lang.String str8;
        java.lang.String str9;
        int i3;
        java.lang.Object[] objArr6;
        char c3;
        java.lang.String str10;
        java.lang.String str11;
        int i4;
        java.lang.Object[] objArr7;
        char c4;
        java.lang.reflect.Method method;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.Object[] objArr8;
        int i5;
        long j;
        android.content.Context baseContext;
        java.lang.Object[] objArr9;
        int i6;
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 21) % 128;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        b("鐍녿ⷊ\u0b59뱮⭽⨅풛铻Ḧท\ue3b7軿訋䟇\uea57闚㕏\ue355䌝똠돾", "\u0000\u0000\u0000\u0000", "㛫㏿삵ꗦ", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr10);
        java.lang.String str15 = (java.lang.String) objArr10[0];
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        c(128 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), null, null, "\u0081\u008a\u0089\u0088\u0082\u0083\u0081\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr11);
        java.lang.String str16 = (java.lang.String) objArr11[0];
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        c(127 - android.view.View.MeasureSpec.getSize(0), null, null, "\u008a\u0081\u0088\u0085\u0091\u0090\u008d\u008f\u008e\u0083\u0082\u008d\u0083\u008c\u0083\u008b", objArr12);
        java.lang.String str17 = (java.lang.String) objArr12[0];
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        b("客ᵎ⧕\udbf3劎乳贖햆쩡焫\udcc0鶞ἲ唅嗚䉯", "\u0000\u0000\u0000\u0000", "垈㒛톣⦜", (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.KeyEvent.normalizeMetaState(0) + 40145), objArr13);
        java.lang.String str18 = (java.lang.String) objArr13[0];
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        b("㜡幠⩖\u245a镉\ued0c㊶숟峦\udfee䨈핖ၾ뿁㲿鬔䜭ﬄ뚜ꍍ᷵ᄪ컩슥臘£", "\u0000\u0000\u0000\u0000", "\ueef9檻믩麅", android.widget.ExpandableListView.getPackedPositionChild(0L) + 1, (char) (34236 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr14);
        java.lang.String str19 = (java.lang.String) objArr14[0];
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        c(127 - (android.os.Process.myPid() >> 22), null, null, "\u008e\u0096\u0089\u0088\u0083\u0092\u0089\u0082\u0084\u0084\u0095\u0088\u008e\u0081\u0094\u0094\u0093\u0092", objArr15);
        java.lang.String str20 = (java.lang.String) objArr15[0];
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        e(new int[]{0, 23, 10, 16}, false, "\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001", objArr16);
        java.lang.String str21 = (java.lang.String) objArr16[0];
        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 27, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 430, (char) (31611 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
        byte[] bArr = $$a;
        java.lang.Object[] objArr17 = new java.lang.Object[1];
        a(bArr[18], bArr[3], org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, objArr17);
        long j2 = cls2.getField((java.lang.String) objArr17[0]).getLong(null);
        try {
            if (j2 == -1 || j2 + 4611686018427387833L < ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str16, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                android.content.Context baseContext2 = getBaseContext();
                if (baseContext2 == null) {
                    baseContext2 = (android.content.Context) java.lang.Class.forName(str19).getMethod(str20, new java.lang.Class[0]).invoke(null, null);
                }
                if (baseContext2 != null) {
                    baseContext2 = baseContext2.getApplicationContext();
                }
                int intValue = ((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str18, java.lang.Object.class).invoke(null, this)).intValue();
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                c(127 - android.view.View.getDefaultSize(0, 0), null, null, "\u009f\u0097\u0083\u009b\u0086\u0081¡¡\u0099\u0081 \u009c\u0092\u0097\u0081\u0097\u009d¡\u009c\u009d \u009d\u0086\u0081\u009e \u0092\u0086\u009a\u009a\u0099 \u0086\u0086\u009d\u0098\u0081\u009f\u0092\u009b\u009c\u009b\u009a \u009f\u009e\u0097\u009e\u009c\u009b\u009e\u0083\u0081\u009c\u009d\u009c\u0092\u009b\u009a\u0081\u0099\u0098\u0092\u0097", objArr18);
                java.lang.String str22 = (java.lang.String) objArr18[0];
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                b("処쩈뽫磘〙ꨍ⹑՜쮭᭦母⽕ꗓ硂䏲ꇸ﹔ꬃ\uf49e哂Ꝅ멃羑该Ḹ᠅쁎\udc8a뒣\ue55c牖ѣ\u171d긅븯Ṗケ㑲圵皩皪ᐸ菢鎒\ue603⸩\udd11阄侗媍\ue828抇뼚摹\ue1f7海圕嫑뇰\ued01酏杋\uedfe퍊", "\u0000\u0000\u0000\u0000", "㖑\u2fecꇰރ", android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr19);
                java.lang.String str23 = (java.lang.String) objArr19[0];
                str = str20;
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                str2 = str19;
                c((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, null, " \u009c¢\u009b\u0099\u009e\u0083\u0098\u0086\u0083\u009d\u009d \u0081¡\u009b\u0099\u009a\u009a\u009b¢\u009b\u0083\u0099¡\u0098\u009c\u0086¢\u0099\u0081\u009e\u009e\u0083\u009e\u009c\u0098\u0086\u0081\u0097\u0083 \u0098\u0081\u0098\u0092\u009b\u009d¢\u0097 ¡\u009d\u009a\u009e¡\u0098\u0097¡¢\u0081\u0081\u0097\u0086", objArr20);
                java.lang.String str24 = (java.lang.String) objArr20[0];
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                b("讠љꕶ훪ᛦ\ue05d\udc76䷱Ⱛꝅ魟િ革謩㊉拯ܯ쀣ೡ跊⣟뉺ⱜ䮘ᓟ闲⾑鼵㷹䤒皧俖쇷ȴႠ庙餚㰢ጹỬꍬ\ue485鰬\uda42忑\udb08뼵똙洸곻โ懤ၘ槟眣梑檤櫺ᇻΆﲄ䟃襔퇽", "\u0000\u0000\u0000\u0000", "텽醥궺㘩", (-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr21);
                try {
                    java.lang.Object[] objArr22 = {baseContext2, new java.lang.String[]{str22, str23, str24, (java.lang.String) objArr21[0]}, java.lang.Integer.valueOf(intValue), 0, 1542398658};
                    byte[] bArr2 = $$d;
                    byte b = bArr2[144];
                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                    d(b, (short) (b | 354), bArr2[147], objArr23);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                    byte b2 = bArr2[36];
                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                    d(b2, (short) (b2 | 324), bArr2[126], objArr24);
                    java.lang.Object[] objArr25 = (java.lang.Object[]) cls3.getMethod((java.lang.String) objArr24[0], java.lang.Class.forName(str21), java.lang.String[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr22);
                    int i7 = ((int[]) objArr25[1])[0];
                    int i8 = ((int[]) objArr25[0])[0];
                    if (baseContext2 != null) {
                        int i9 = RecordsJson + 25;
                        SdkCoreAlternateContactlessPaymentDataImpl = i9 % 128;
                        try {
                            if (i9 % 2 != 0) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 430 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (31610 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                a((byte) (-bArr[16]), bArr[17], bArr[11], objArr26);
                                cls4.getField((java.lang.String) objArr26[0]).set(null, objArr25);
                                str3 = str16;
                                valueOf2 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue());
                                cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 28, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 429, (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31610));
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                a(bArr[18], bArr[3], org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, objArr27);
                                obj = objArr27[0];
                            } else {
                                str3 = str16;
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777189) - android.graphics.Color.rgb(0, 0, 0), 428 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 31611));
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                a((byte) (-bArr[16]), bArr[17], bArr[11], objArr28);
                                cls5.getField((java.lang.String) objArr28[0]).set(null, objArr25);
                                valueOf2 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue());
                                cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 27, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 429, (char) (31609 - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                a(bArr[18], bArr[3], org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, objArr29);
                                obj = objArr29[0];
                            }
                            cls.getField((java.lang.String) obj).set(null, valueOf2);
                        } catch (java.lang.Exception unused) {
                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                        }
                    } else {
                        str3 = str16;
                    }
                    objArr = objArr25;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.graphics.Color.red(0), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 429, (char) (31611 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                java.lang.Object[] objArr30 = new java.lang.Object[1];
                a((byte) (-bArr[16]), bArr[17], bArr[11], objArr30);
                try {
                    java.lang.Object[] objArr31 = {cls6.getField((java.lang.String) objArr30[0]).get(null), 1542398658, 0};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33, android.view.View.getDefaultSize(0, 0) + 4618, (char) (android.os.Process.myPid() >> 22))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj3);
                    }
                    objArr = (java.lang.Object[]) ((java.lang.reflect.Method) obj3).invoke(null, objArr31);
                    str2 = str19;
                    str = str20;
                    str3 = str16;
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i10 = ((int[]) objArr[1])[0];
            int i11 = ((int[]) objArr[0])[0];
            if (i11 == i10) {
                java.lang.Object[] objArr32 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[2])[0]), 0};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.widget.ExpandableListView.getPackedPositionType(0L) + 4618, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr32);
            } else {
                long j3 = i10 ^ i11;
                SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 33) % 128;
                try {
                    java.lang.Object[] objArr33 = {java.lang.Long.valueOf(j3 ^ 5901075633508712448L), 1373951302L};
                    byte[] bArr3 = $$d;
                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                    d(bArr3[92], (short) 301, bArr3[147], objArr34);
                    java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr34[0]);
                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                    d((byte) (-bArr3[472]), (short) 425, bArr3[63], objArr35);
                    cls7.getMethod((java.lang.String) objArr35[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr33);
                    java.lang.Object[] objArr36 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[2])[0]), 0};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                    if (obj5 == null) {
                        obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33, android.text.TextUtils.indexOf("", "", 0) + 4618, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj5);
                    }
                    ((java.lang.reflect.Method) obj5).invoke(null, objArr36);
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.os.Process.myTid() >> 22), 707 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (34284 - (android.os.Process.myPid() >> 22)));
            java.lang.Object[] objArr37 = new java.lang.Object[1];
            a((byte) (bArr[3] + 1), (byte) (bArr[17] - 1), bArr[11], objArr37);
            long j4 = cls8.getField((java.lang.String) objArr37[0]).getLong(null);
            if (j4 == -1 || j4 + 1894 < ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str18, java.lang.Object.class).invoke(null, this)).intValue()), 0, 1180382236};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                if (obj6 == null) {
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 48, android.graphics.Color.rgb(0, 0, 0) + 16777923, (char) (34284 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)));
                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                    a((byte) (bArr[3] + 1), (byte) (bArr[17] - 1), bArr[11], objArr39);
                    obj6 = cls9.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1346294939, obj6);
                }
                java.lang.Object[] objArr40 = (java.lang.Object[]) ((java.lang.reflect.Method) obj6).invoke(null, objArr38);
                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 47, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 708, (char) (34284 - android.view.KeyEvent.normalizeMetaState(0)));
                java.lang.Object[] objArr41 = new java.lang.Object[1];
                a(com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, bArr[5], objArr41);
                cls10.getField((java.lang.String) objArr41[0]).set(null, objArr40);
                try {
                    long longValue = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.graphics.Color.green(0) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (android.graphics.Color.blue(0) + 34284));
                    c = 1;
                    objArr2 = objArr40;
                    str4 = str21;
                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                    a((byte) (bArr[3] + 1), (byte) (bArr[17] - 1), bArr[11], objArr42);
                    i = 0;
                    cls11.getField((java.lang.String) objArr42[0]).set(null, java.lang.Long.valueOf(longValue));
                } catch (java.lang.Exception unused2) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
            } else {
                RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 67) % 128;
                java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 47, 707 - android.graphics.Color.red(0), (char) (34284 - android.graphics.Color.green(0)));
                java.lang.Object[] objArr43 = new java.lang.Object[1];
                a(com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, bArr[5], objArr43);
                java.lang.Object[] objArr44 = {cls12.getField((java.lang.String) objArr43[0]).get(null), 1180382236, 0};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                if (obj7 == null) {
                    obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 33, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4718, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj7);
                }
                objArr2 = (java.lang.Object[]) ((java.lang.reflect.Method) obj7).invoke(null, objArr44);
                str4 = str21;
                i = 0;
                c = 1;
            }
            int i12 = ((int[]) objArr2[c])[i];
            if (((int[]) objArr2[i])[i] == i12) {
                int i13 = ((int[]) objArr2[9])[i];
                java.lang.Object[] objArr45 = new java.lang.Object[3];
                objArr45[2] = 0;
                objArr45[1] = java.lang.Integer.valueOf(i13);
                objArr45[i] = objArr2;
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                if (obj8 == null) {
                    obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", i, i) + 33, 4716 - (android.widget.ExpandableListView.getPackedPositionForChild(i, i) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(i, i) == 0L ? 0 : -1)), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(i)))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj8);
                }
                ((java.lang.reflect.Method) obj8).invoke(null, objArr45);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add((java.lang.String) objArr2[2]);
                arrayList.add((java.lang.String) objArr2[3]);
                arrayList.add((java.lang.String) objArr2[4]);
                arrayList.add((java.lang.String) objArr2[5]);
                arrayList.add((java.lang.String) objArr2[6]);
                arrayList.add((java.lang.String) objArr2[7]);
                arrayList.add((java.lang.String) objArr2[8]);
                java.lang.Object[] objArr46 = {java.lang.Long.valueOf((i12 ^ r4) ^ (-1568386752144474112L)), -365168498L};
                byte[] bArr4 = $$d;
                java.lang.Object[] objArr47 = new java.lang.Object[1];
                d(bArr4[28], (short) 262, bArr4[147], objArr47);
                java.lang.Class<?> cls13 = java.lang.Class.forName((java.lang.String) objArr47[0]);
                byte b3 = bArr4[147];
                java.lang.Object[] objArr48 = new java.lang.Object[1];
                d(b3, (short) (b3 | 344), (byte) (bArr4[17] - 1), objArr48);
                cls13.getMethod((java.lang.String) objArr48[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr46);
                java.lang.Object[] objArr49 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[9])[0]), 0};
                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                if (obj9 == null) {
                    obj9 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.View.getDefaultSize(0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4718, (char) (android.os.Process.myTid() >> 22))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj9);
                }
                ((java.lang.reflect.Method) obj9).invoke(null, objArr49);
            }
            java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 754 - android.view.KeyEvent.normalizeMetaState(0), (char) (45560 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)));
            java.lang.Object[] objArr50 = new java.lang.Object[1];
            a((byte) (bArr[4] + 1), (byte) (-bArr[19]), org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, objArr50);
            long j5 = cls14.getField((java.lang.String) objArr50[0]).getLong(null);
            if (j5 == -1 || j5 + 4611686018427387859L < ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                java.lang.Object[] objArr51 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str18, java.lang.Object.class).invoke(null, this)).intValue()), 1684224514};
                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                if (obj10 == null) {
                    java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 47, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 755, (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 45560));
                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                    a(com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, bArr[5], objArr52);
                    obj10 = cls15.getMethod((java.lang.String) objArr52[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(599786096, obj10);
                }
                java.lang.Object invoke = ((java.lang.reflect.Method) obj10).invoke(null, objArr51);
                java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 47, 755 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (45560 - android.graphics.Color.argb(0, 0, 0, 0)));
                java.lang.Object[] objArr53 = new java.lang.Object[1];
                a(com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, bArr[5], objArr53);
                cls16.getField((java.lang.String) objArr53[0]).set(null, invoke);
                try {
                    long longValue2 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 47, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 754, (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45560));
                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                    a((byte) (bArr[4] + 1), (byte) (-bArr[19]), org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, objArr54);
                    cls17.getField((java.lang.String) objArr54[0]).set(null, java.lang.Long.valueOf(longValue2));
                    obj2 = invoke;
                } catch (java.lang.Exception unused3) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
            } else {
                java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 47, 754 - android.view.View.getDefaultSize(0, 0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45561));
                java.lang.Object[] objArr55 = new java.lang.Object[1];
                a(com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, bArr[5], objArr55);
                java.lang.Object[] objArr56 = {cls18.getField((java.lang.String) objArr55[0]).get(null), 1684224514, 0};
                java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                if (obj11 == null) {
                    obj11 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.os.Process.myPid() >> 22) + 4790, (char) (31152 - android.graphics.Color.alpha(0)))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.KeyEvent.keyCodeFromString(""), 4798 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj11);
                }
                obj2 = ((java.lang.reflect.Method) obj11).invoke(null, objArr56);
            }
            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
            if (obj12 == null) {
                obj12 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 4750, (char) (33701 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)))).getMethod("values", null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-273776192, obj12);
            }
            int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(obj2, null)).intValue();
            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
            if (obj13 == null) {
                obj13 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 4750 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (33701 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)))).getMethod("DigitizedCardProfile", null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-712736454, obj13);
            }
            if (((java.lang.Integer) ((java.lang.reflect.Method) obj13).invoke(obj2, null)).intValue() == intValue2) {
                java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                if (obj14 == null) {
                    obj14 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 4750, (char) (33700 - android.view.MotionEvent.axisFromString("")))).getMethod("valueOf", null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj14);
                }
                java.lang.Object[] objArr57 = {obj2, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(obj2, null)).intValue()), 0};
                java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                if (obj15 == null) {
                    obj15 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777256, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4789, (char) (31152 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.green(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 4751, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj15);
                }
                ((java.lang.reflect.Method) obj15).invoke(null, objArr57);
                str5 = str18;
            } else {
                java.lang.Object[] objArr58 = {java.lang.Long.valueOf((intValue2 ^ r4) ^ (-1184063195778646016L)), -275688244L};
                byte[] bArr5 = $$d;
                java.lang.Object[] objArr59 = new java.lang.Object[1];
                d(bArr5[100], (short) 238, bArr5[147], objArr59);
                java.lang.Class<?> cls19 = java.lang.Class.forName((java.lang.String) objArr59[0]);
                byte b4 = bArr5[147];
                str5 = str18;
                java.lang.Object[] objArr60 = new java.lang.Object[1];
                d(b4, (short) (b4 | 344), (byte) (bArr5[17] - 1), objArr60);
                cls19.getMethod((java.lang.String) objArr60[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr58);
                java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                if (obj16 == null) {
                    obj16 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39, 4749 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (33701 - android.graphics.Color.green(0)))).getMethod("valueOf", null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj16);
                }
                java.lang.Object[] objArr61 = {obj2, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(obj2, null)).intValue()), 0};
                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                if (obj17 == null) {
                    obj17 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 4790 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (31152 - android.view.KeyEvent.normalizeMetaState(0)))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 41, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4750, (char) (33701 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj17);
                }
                ((java.lang.reflect.Method) obj17).invoke(null, objArr61);
            }
            java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 49, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1581, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
            java.lang.Object[] objArr62 = new java.lang.Object[1];
            a((byte) (bArr[3] + 1), (byte) (bArr[17] - 1), bArr[11], objArr62);
            long j6 = cls20.getField((java.lang.String) objArr62[0]).getLong(null);
            if (j6 == -1 || j6 + 4611686018427387799L < ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                android.content.Context baseContext3 = getBaseContext();
                if (baseContext3 == null) {
                    str6 = str;
                    baseContext3 = (android.content.Context) java.lang.Class.forName(str2).getMethod(str6, new java.lang.Class[0]).invoke(null, null);
                } else {
                    str6 = str;
                }
                if (baseContext3 != null) {
                    baseContext3 = baseContext3.getApplicationContext();
                }
                java.lang.String str25 = str5;
                java.lang.Object[] objArr63 = {baseContext3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str25, java.lang.Object.class).invoke(null, this)).intValue()), 0, -335263826};
                byte[] bArr6 = $$d;
                byte b5 = bArr6[61];
                str = str6;
                str5 = str25;
                java.lang.Object[] objArr64 = new java.lang.Object[1];
                d(b5, (short) (b5 | com.visa.cbp.getEncExpo.startTransaction), bArr6[147], objArr64);
                java.lang.Class<?> cls21 = java.lang.Class.forName((java.lang.String) objArr64[0]);
                byte b6 = bArr6[147];
                java.lang.Object[] objArr65 = new java.lang.Object[1];
                d(b6, (short) (b6 | 344), (byte) (bArr6[17] - 1), objArr65);
                java.lang.Object[] objArr66 = (java.lang.Object[]) cls21.getMethod((java.lang.String) objArr65[0], java.lang.Class.forName(str4), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr63);
                if (baseContext3 != null) {
                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 48, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1581, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                    java.lang.Object[] objArr67 = new java.lang.Object[1];
                    a(bArr[18], bArr[3], org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, objArr67);
                    cls22.getField((java.lang.String) objArr67[0]).set(null, objArr66);
                    try {
                        long longValue3 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 48, 1581 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) android.view.View.MeasureSpec.getMode(0));
                        objArr3 = objArr66;
                        java.lang.Object[] objArr68 = new java.lang.Object[1];
                        a((byte) (bArr[3] + 1), (byte) (bArr[17] - 1), bArr[11], objArr68);
                        cls23.getField((java.lang.String) objArr68[0]).set(null, java.lang.Long.valueOf(longValue3));
                    } catch (java.lang.Exception unused4) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    }
                } else {
                    objArr3 = objArr66;
                }
                objArr4 = objArr3;
            } else {
                java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 48, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1581, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                java.lang.Object[] objArr69 = new java.lang.Object[1];
                a(bArr[18], bArr[3], org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, objArr69);
                java.lang.Object[] objArr70 = {cls24.getField((java.lang.String) objArr69[0]).get(null), -335263826, 0};
                java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
                if (obj18 == null) {
                    obj18 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.view.View.combineMeasuredStates(0, 0) + 4905, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, obj18);
                }
                objArr4 = (java.lang.Object[]) ((java.lang.reflect.Method) obj18).invoke(null, objArr70);
            }
            if (((int[]) objArr4[0])[0] != ((int[]) objArr4[1])[0]) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add((java.lang.String) objArr4[2]);
                arrayList2.add((java.lang.String) objArr4[3]);
                RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 77) % 128;
            }
            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.graphics.Color.alpha(0) + 922, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
            java.lang.Object[] objArr71 = new java.lang.Object[1];
            a(bArr[18], bArr[3], org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, objArr71);
            long j7 = cls25.getField((java.lang.String) objArr71[0]).getLong(null);
            if (j7 == -1 || j7 + 4611686018427387905L < ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                str7 = str5;
                int intValue3 = ((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str7, java.lang.Object.class).invoke(null, this)).intValue();
                java.lang.Object[] objArr72 = {1025686656};
                java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                if (obj19 == null) {
                    obj19 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 48, 873 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (15955 - (android.view.KeyEvent.getMaxKeyCode() >> 16)))).getDeclaredConstructor(java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1647138923, obj19);
                }
                java.lang.Object[] AlternateContactlessPaymentDataJson$4956fc2a = com.payair.hce.setOnLongClickListener.AlternateContactlessPaymentDataJson$4956fc2a(intValue3, ((java.lang.reflect.Constructor) obj19).newInstance(objArr72));
                java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 922 - android.view.View.MeasureSpec.getMode(0), (char) android.text.TextUtils.indexOf("", "", 0));
                java.lang.Object[] objArr73 = new java.lang.Object[1];
                a((byte) (-bArr[16]), bArr[17], bArr[11], objArr73);
                cls26.getField((java.lang.String) objArr73[0]).set(null, AlternateContactlessPaymentDataJson$4956fc2a);
                try {
                    long longValue4 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 922, (char) android.graphics.Color.alpha(0));
                    java.lang.Object[] objArr74 = new java.lang.Object[1];
                    a(bArr[18], bArr[3], org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, objArr74);
                    i2 = 0;
                    cls27.getField((java.lang.String) objArr74[0]).set(null, java.lang.Long.valueOf(longValue4));
                    objArr5 = AlternateContactlessPaymentDataJson$4956fc2a;
                    c2 = 1;
                } catch (java.lang.Exception unused5) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
            } else {
                SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 101) % 128;
                java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 44, 922 - android.text.TextUtils.indexOf("", ""), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                java.lang.Object[] objArr75 = new java.lang.Object[1];
                a((byte) (-bArr[16]), bArr[17], bArr[11], objArr75);
                java.lang.Object[] objArr76 = {cls28.getField((java.lang.String) objArr75[0]).get(null), 1258591913, 0};
                java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                if (obj20 == null) {
                    obj20 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 45, android.view.MotionEvent.axisFromString("") + 4861, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj20);
                }
                objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) obj20).invoke(null, objArr76);
                str7 = str5;
                c2 = 1;
                i2 = 0;
            }
            int i14 = ((int[]) objArr5[c2])[i2];
            if (((int[]) objArr5[i2])[i2] == i14) {
                int i15 = ((int[]) objArr5[3])[i2];
                java.lang.Object[] objArr77 = new java.lang.Object[3];
                objArr77[2] = 0;
                objArr77[1] = java.lang.Integer.valueOf(i15);
                objArr77[i2] = objArr5;
                java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                if (obj21 == null) {
                    obj21 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(i2) + 45, 4859 - android.view.MotionEvent.axisFromString(""), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj21);
                }
                ((java.lang.reflect.Method) obj21).invoke(null, objArr77);
                str8 = str7;
            } else {
                new java.util.ArrayList().add((java.lang.String) objArr5[2]);
                java.lang.Object[] objArr78 = {java.lang.Long.valueOf((i14 ^ r7) ^ (-2892301680878026752L)), -673416464L};
                byte[] bArr7 = $$d;
                byte b7 = bArr7[126];
                str8 = str7;
                java.lang.Object[] objArr79 = new java.lang.Object[1];
                d(b7, (short) (b7 | 470), bArr7[147], objArr79);
                java.lang.Class<?> cls29 = java.lang.Class.forName((java.lang.String) objArr79[0]);
                java.lang.Object[] objArr80 = new java.lang.Object[1];
                d((byte) (-bArr7[472]), (short) 425, bArr7[63], objArr80);
                cls29.getMethod((java.lang.String) objArr80[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr78);
                java.lang.Object[] objArr81 = {objArr5, java.lang.Integer.valueOf(((int[]) objArr5[3])[0]), 0};
                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                if (obj22 == null) {
                    obj22 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4861, (char) android.view.View.MeasureSpec.getMode(0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj22);
                }
                ((java.lang.reflect.Method) obj22).invoke(null, objArr81);
            }
            java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 51, 584 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 24291));
            java.lang.Object[] objArr82 = new java.lang.Object[1];
            a((byte) (bArr[4] + 1), (byte) (-bArr[19]), org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, objArr82);
            long j8 = cls30.getField((java.lang.String) objArr82[0]).getLong(null);
            if (j8 == -1 || j8 + 1886 < ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                str9 = str8;
                java.lang.Object[] objArr83 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str9, java.lang.Object.class).invoke(null, this)).intValue()), -814138835};
                byte[] bArr8 = $$d;
                byte b8 = bArr8[129];
                java.lang.Object[] objArr84 = new java.lang.Object[1];
                d(b8, (short) (b8 | 179), bArr8[147], objArr84);
                java.lang.Class<?> cls31 = java.lang.Class.forName((java.lang.String) objArr84[0]);
                byte b9 = bArr8[36];
                java.lang.Object[] objArr85 = new java.lang.Object[1];
                d(b9, (short) (b9 | 324), bArr8[126], objArr85);
                java.lang.Object[] objArr86 = (java.lang.Object[]) cls31.getMethod((java.lang.String) objArr85[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr83);
                java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.view.View.combineMeasuredStates(0, 0), android.view.KeyEvent.keyCodeFromString("") + 584, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 24291));
                java.lang.Object[] objArr87 = new java.lang.Object[1];
                a((byte) 74, bArr[5], bArr[17], objArr87);
                cls32.getField((java.lang.String) objArr87[0]).set(null, objArr86);
                try {
                    long longValue5 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.view.View.resolveSizeAndState(0, 0, 0), 584 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 24291));
                    java.lang.Object[] objArr88 = new java.lang.Object[1];
                    a((byte) (bArr[4] + 1), (byte) (-bArr[19]), org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, objArr88);
                    i3 = 0;
                    cls33.getField((java.lang.String) objArr88[0]).set(null, java.lang.Long.valueOf(longValue5));
                    objArr6 = objArr86;
                    c3 = 1;
                } catch (java.lang.Exception unused6) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
            } else {
                java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 52, android.graphics.Color.blue(0) + 584, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 24291));
                java.lang.Object[] objArr89 = new java.lang.Object[1];
                a((byte) 74, bArr[5], bArr[17], objArr89);
                java.lang.Object[] objArr90 = {cls34.getField((java.lang.String) objArr89[0]).get(null), -814138835, 0};
                java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                if (obj23 == null) {
                    obj23 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 4830 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj23);
                }
                objArr6 = (java.lang.Object[]) ((java.lang.reflect.Method) obj23).invoke(null, objArr90);
                str9 = str8;
                c3 = 1;
                i3 = 0;
            }
            int i16 = ((int[]) objArr6[c3])[i3];
            if (((int[]) objArr6[i3])[i3] == i16) {
                int i17 = ((int[]) objArr6[3])[i3];
                java.lang.Object[] objArr91 = new java.lang.Object[3];
                objArr91[2] = 0;
                objArr91[1] = java.lang.Integer.valueOf(i17);
                objArr91[i3] = objArr6;
                java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                if (obj24 == null) {
                    obj24 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.text.TextUtils.getCapsMode("", i3, i3), 4830 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.util.TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj24);
                }
                ((java.lang.reflect.Method) obj24).invoke(null, objArr91);
            } else {
                new java.util.ArrayList().add((java.lang.String) objArr6[2]);
                java.lang.Object[] objArr92 = {java.lang.Long.valueOf((i16 ^ r7) ^ 2860736304067379200L), 666067091L};
                byte[] bArr9 = $$d;
                java.lang.Object[] objArr93 = new java.lang.Object[1];
                d(bArr9[15], (short) 150, bArr9[147], objArr93);
                java.lang.Class<?> cls35 = java.lang.Class.forName((java.lang.String) objArr93[0]);
                java.lang.Object[] objArr94 = new java.lang.Object[1];
                d((byte) (-bArr9[472]), (short) 425, bArr9[63], objArr94);
                cls35.getMethod((java.lang.String) objArr94[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr92);
                java.lang.Object[] objArr95 = {objArr6, java.lang.Integer.valueOf(((int[]) objArr6[3])[0]), 0};
                java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                if (obj25 == null) {
                    obj25 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 30, 4830 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj25);
                }
                ((java.lang.reflect.Method) obj25).invoke(null, objArr95);
            }
            java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 40, android.text.TextUtils.indexOf("", "") + 667, (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40024));
            java.lang.Object[] objArr96 = new java.lang.Object[1];
            a((byte) (bArr[4] + 1), (byte) (-bArr[19]), org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, objArr96);
            long j9 = cls36.getField((java.lang.String) objArr96[0]).getLong(null);
            if (j9 == -1 || j9 + 4611686018427387797L < ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                android.content.Context baseContext4 = getBaseContext();
                if (baseContext4 == null) {
                    int i18 = SdkCoreAlternateContactlessPaymentDataImpl + 95;
                    RecordsJson = i18 % 128;
                    if (i18 % 2 == 0) {
                        str10 = str;
                        method = java.lang.Class.forName(str2).getMethod(str10, new java.lang.Class[1]);
                    } else {
                        str10 = str;
                        method = java.lang.Class.forName(str2).getMethod(str10, new java.lang.Class[0]);
                    }
                    baseContext4 = (android.content.Context) method.invoke(null, null);
                } else {
                    str10 = str;
                }
                if (baseContext4 != null) {
                    baseContext4 = baseContext4.getApplicationContext();
                }
                java.lang.Object[] objArr97 = {baseContext4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str17).getMethod(str9, java.lang.Object.class).invoke(null, this)).intValue()), 0, -731617371};
                byte[] bArr10 = $$d;
                byte b10 = bArr10[5];
                str11 = str9;
                java.lang.Object[] objArr98 = new java.lang.Object[1];
                d(b10, (short) (b10 | 108), bArr10[147], objArr98);
                java.lang.Class<?> cls37 = java.lang.Class.forName((java.lang.String) objArr98[0]);
                byte b11 = bArr10[147];
                java.lang.Object[] objArr99 = new java.lang.Object[1];
                d(b11, (short) (b11 | 344), (byte) (bArr10[17] - 1), objArr99);
                java.lang.Object[] objArr100 = (java.lang.Object[]) cls37.getMethod((java.lang.String) objArr99[0], java.lang.Class.forName(str4), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr97);
                java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 667, (char) (40024 - android.text.TextUtils.getTrimmedLength("")));
                java.lang.Object[] objArr101 = new java.lang.Object[1];
                a((byte) (bArr[3] + 1), (byte) (bArr[17] - 1), bArr[11], objArr101);
                cls38.getField((java.lang.String) objArr101[0]).set(null, objArr100);
                try {
                    long longValue6 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 40, 668 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 39976));
                    java.lang.Object[] objArr102 = new java.lang.Object[1];
                    a((byte) (bArr[4] + 1), (byte) (-bArr[19]), org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, objArr102);
                    i4 = 0;
                    cls39.getField((java.lang.String) objArr102[0]).set(null, java.lang.Long.valueOf(longValue6));
                    objArr7 = objArr100;
                    c4 = 1;
                } catch (java.lang.Exception unused7) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
            } else {
                java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 667 - android.view.View.getDefaultSize(0, 0), (char) (40024 - android.text.TextUtils.getTrimmedLength("")));
                java.lang.Object[] objArr103 = new java.lang.Object[1];
                a((byte) (bArr[3] + 1), (byte) (bArr[17] - 1), bArr[11], objArr103);
                java.lang.Object[] objArr104 = {cls40.getField((java.lang.String) objArr103[0]).get(null), -731617371, 0};
                java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                if (obj26 == null) {
                    obj26 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 33, 4684 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj26);
                }
                objArr7 = (java.lang.Object[]) ((java.lang.reflect.Method) obj26).invoke(null, objArr104);
                str10 = str;
                c4 = 1;
                i4 = 0;
                str11 = str9;
            }
            int i19 = ((int[]) objArr7[c4])[i4];
            if (((int[]) objArr7[i4])[i4] == i19) {
                int i20 = ((int[]) objArr7[4])[i4];
                java.lang.Object[] objArr105 = new java.lang.Object[3];
                objArr105[2] = 0;
                objArr105[1] = java.lang.Integer.valueOf(i20);
                objArr105[i4] = objArr7;
                java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                if (obj27 == null) {
                    obj27 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i4) + 34, 4683 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i4), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj27);
                }
                ((java.lang.reflect.Method) obj27).invoke(null, objArr105);
                str13 = str10;
                str12 = str17;
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.Object[] objArr106 = {objArr7};
                java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1859861882);
                if (obj28 == null) {
                    str12 = str17;
                    obj28 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.View.getDefaultSize(0, 0), (android.os.Process.myTid() >> 22) + 4684, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("values", java.lang.Object[].class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1859861882, obj28);
                } else {
                    str12 = str17;
                }
                arrayList3.add(((java.lang.reflect.Method) obj28).invoke(null, objArr106));
                java.lang.Object[] objArr107 = {objArr7};
                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1831744115);
                if (obj29 == null) {
                    str13 = str10;
                    obj29 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33, android.view.View.MeasureSpec.getMode(0) + 4684, (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))).getMethod("writeReplace", java.lang.Object[].class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1831744115, obj29);
                } else {
                    str13 = str10;
                }
                arrayList3.add(((java.lang.reflect.Method) obj29).invoke(null, objArr107));
                java.lang.Object[] objArr108 = {java.lang.Long.valueOf((i19 ^ r11) ^ 5556597781533032448L), 1293746230L};
                byte[] bArr11 = $$d;
                java.lang.Object[] objArr109 = new java.lang.Object[1];
                d(bArr11[40], (short) (bArr11[13] - 1), bArr11[147], objArr109);
                java.lang.Class<?> cls41 = java.lang.Class.forName((java.lang.String) objArr109[0]);
                byte b12 = bArr11[147];
                java.lang.Object[] objArr110 = new java.lang.Object[1];
                d(b12, (short) (b12 | 344), (byte) (bArr11[17] - 1), objArr110);
                cls41.getMethod((java.lang.String) objArr110[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr108);
                java.lang.Object[] objArr111 = {objArr7, java.lang.Integer.valueOf(((int[]) objArr7[4])[0]), 0};
                java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                if (obj30 == null) {
                    obj30 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 33, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 4684, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj30);
                }
                ((java.lang.reflect.Method) obj30).invoke(null, objArr111);
            }
            java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 51, 584 - android.graphics.Color.argb(0, 0, 0, 0), (char) (24291 - android.view.View.resolveSize(0, 0)));
            java.lang.Object[] objArr112 = new java.lang.Object[1];
            a(bArr[18], bArr[3], org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, objArr112);
            long j10 = cls42.getField((java.lang.String) objArr112[0]).getLong(null);
            if (j10 != -1) {
                RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 41) % 128;
                if (j10 + 1992 >= ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                    java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 51, android.graphics.Color.green(0) + 584, (char) (24291 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                    java.lang.Object[] objArr113 = new java.lang.Object[1];
                    a((byte) (-bArr[16]), bArr[17], bArr[11], objArr113);
                    java.lang.Object[] objArr114 = {cls43.getField((java.lang.String) objArr113[0]).get(null), 650997601, 0};
                    java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                    if (obj31 == null) {
                        obj31 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.widget.ExpandableListView.getPackedPositionChild(0L), 4831 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj31);
                    }
                    objArr8 = (java.lang.Object[]) ((java.lang.reflect.Method) obj31).invoke(null, objArr114);
                    str14 = str13;
                    i5 = ((int[]) objArr8[1])[0];
                    if (((int[]) objArr8[0])[0] != i5) {
                        int i21 = RecordsJson + 69;
                        SdkCoreAlternateContactlessPaymentDataImpl = i21 % 128;
                        if (i21 % 2 != 0) {
                            java.lang.Object[] objArr115 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[4])[0]), 1};
                            java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                            if (obj32 == null) {
                                obj32 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 30, 4830 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj32);
                            }
                            ((java.lang.reflect.Method) obj32).invoke(null, objArr115);
                        } else {
                            java.lang.Object[] objArr116 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[3])[0]), 0};
                            java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                            if (obj33 == null) {
                                obj33 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.text.TextUtils.getOffsetBefore("", 0), 4830 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) android.view.KeyEvent.normalizeMetaState(0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj33);
                            }
                            ((java.lang.reflect.Method) obj33).invoke(null, objArr116);
                        }
                    } else {
                        java.lang.Object[] objArr117 = {java.lang.Long.valueOf((i5 ^ r8) ^ (-3450010112045875200L)), -803268587L};
                        byte[] bArr12 = $$d;
                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                        d(bArr12[15], (short) 150, bArr12[147], objArr118);
                        java.lang.Class<?> cls44 = java.lang.Class.forName((java.lang.String) objArr118[0]);
                        java.lang.Object[] objArr119 = new java.lang.Object[1];
                        d((byte) (-bArr12[472]), (short) 425, bArr12[63], objArr119);
                        cls44.getMethod((java.lang.String) objArr119[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr117);
                        java.lang.Object[] objArr120 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[3])[0]), 0};
                        java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                        if (obj34 == null) {
                            obj34 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777186) - android.graphics.Color.rgb(0, 0, 0), 4830 - android.text.TextUtils.indexOf("", "", 0, 0), (char) android.graphics.Color.argb(0, 0, 0, 0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj34);
                        }
                        ((java.lang.reflect.Method) obj34).invoke(null, objArr120);
                    }
                    super.onCreate();
                    java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 51, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 584, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24290));
                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                    a((byte) (bArr[3] + 1), (byte) (bArr[17] - 1), bArr[11], objArr121);
                    j = cls45.getField((java.lang.String) objArr121[0]).getLong(null);
                    if (j != -1 || j + 1884 < ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                        baseContext = getBaseContext();
                        if (baseContext == null) {
                            int i22 = SdkCoreAlternateContactlessPaymentDataImpl + 29;
                            RecordsJson = i22 % 128;
                            baseContext = (android.content.Context) (i22 % 2 == 0 ? java.lang.Class.forName(str2).getMethod(str14, new java.lang.Class[1]) : java.lang.Class.forName(str2).getMethod(str14, new java.lang.Class[0])).invoke(null, null);
                        }
                        if (baseContext != null) {
                            baseContext = baseContext.getApplicationContext();
                        }
                        java.lang.Object[] objArr122 = {baseContext, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str12).getMethod(str11, java.lang.Object.class).invoke(null, this)).intValue()), -2128582532};
                        byte[] bArr13 = $$d;
                        java.lang.Object[] objArr123 = new java.lang.Object[1];
                        d(bArr13[29], bArr13[126], bArr13[147], objArr123);
                        java.lang.Class<?> cls46 = java.lang.Class.forName((java.lang.String) objArr123[0]);
                        byte b13 = bArr13[147];
                        java.lang.Object[] objArr124 = new java.lang.Object[1];
                        d(b13, (short) (b13 | 344), (byte) (bArr13[17] - 1), objArr124);
                        java.lang.Object[] objArr125 = (java.lang.Object[]) cls46.getMethod((java.lang.String) objArr124[0], java.lang.Class.forName(str4), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr122);
                        if (baseContext != null) {
                            java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 584, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 24291));
                            java.lang.Object[] objArr126 = new java.lang.Object[1];
                            a(com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, bArr[5], objArr126);
                            cls47.getField((java.lang.String) objArr126[0]).set(null, objArr125);
                            try {
                                long longValue7 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 50, android.text.TextUtils.indexOf("", "", 0) + 584, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 24290));
                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                a((byte) (bArr[3] + 1), (byte) (bArr[17] - 1), bArr[11], objArr127);
                                cls48.getField((java.lang.String) objArr127[0]).set(null, java.lang.Long.valueOf(longValue7));
                            } catch (java.lang.Exception unused8) {
                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                            }
                        }
                        objArr9 = objArr125;
                    } else {
                        java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 584 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24290));
                        java.lang.Object[] objArr128 = new java.lang.Object[1];
                        a(com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, bArr[5], objArr128);
                        java.lang.Object[] objArr129 = {cls49.getField((java.lang.String) objArr128[0]).get(null), -2128582532, 0};
                        java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                        if (obj35 == null) {
                            obj35 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.graphics.ImageFormat.getBitsPerPixel(0), android.graphics.Color.rgb(0, 0, 0) + 16782046, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj35);
                        }
                        objArr9 = (java.lang.Object[]) ((java.lang.reflect.Method) obj35).invoke(null, objArr129);
                    }
                    i6 = ((int[]) objArr9[1])[0];
                    if (((int[]) objArr9[0])[0] != i6) {
                        java.lang.Object[] objArr130 = {objArr9, java.lang.Integer.valueOf(((int[]) objArr9[3])[0]), 0};
                        java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                        if (obj36 == null) {
                            obj36 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 30, 4831 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.os.Process.myPid() >> 22))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj36);
                        }
                        ((java.lang.reflect.Method) obj36).invoke(null, objArr130);
                        return;
                    }
                    java.lang.Object[] objArr131 = {java.lang.Long.valueOf((i6 ^ r4) ^ (-3062760355806576640L)), -713104469L};
                    byte[] bArr14 = $$d;
                    java.lang.Object[] objArr132 = new java.lang.Object[1];
                    d(bArr14[15], (short) 150, bArr14[147], objArr132);
                    java.lang.Class<?> cls50 = java.lang.Class.forName((java.lang.String) objArr132[0]);
                    java.lang.Object[] objArr133 = new java.lang.Object[1];
                    d((byte) (-bArr14[472]), (short) 425, bArr14[63], objArr133);
                    cls50.getMethod((java.lang.String) objArr133[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr131);
                    java.lang.Object[] objArr134 = {objArr9, java.lang.Integer.valueOf(((int[]) objArr9[3])[0]), 0};
                    java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                    if (obj37 == null) {
                        obj37 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 30, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 4830, (char) android.text.TextUtils.indexOf("", ""))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj37);
                    }
                    ((java.lang.reflect.Method) obj37).invoke(null, objArr134);
                    return;
                }
            }
            android.content.Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                str14 = str13;
                baseContext5 = (android.content.Context) java.lang.Class.forName(str2).getMethod(str14, new java.lang.Class[0]).invoke(null, null);
            } else {
                str14 = str13;
            }
            if (baseContext5 != null) {
                baseContext5 = baseContext5.getApplicationContext();
            }
            java.lang.String str26 = str11;
            java.lang.Object[] objArr135 = {baseContext5, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str12).getMethod(str26, java.lang.Object.class).invoke(null, this)).intValue()), 650997601};
            byte[] bArr15 = $$d;
            byte b14 = bArr15[36];
            short s = bArr15[147];
            str11 = str26;
            java.lang.Object[] objArr136 = new java.lang.Object[1];
            d(b14, s, (byte) s, objArr136);
            java.lang.Class<?> cls51 = java.lang.Class.forName((java.lang.String) objArr136[0]);
            java.lang.Object[] objArr137 = new java.lang.Object[1];
            d((byte) (-bArr15[472]), (short) 425, bArr15[63], objArr137);
            java.lang.Object[] objArr138 = (java.lang.Object[]) cls51.getMethod((java.lang.String) objArr137[0], java.lang.Class.forName(str4), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr135);
            if (baseContext5 != null) {
                java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.view.KeyEvent.getDeadChar(0, 0), 584 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.View.MeasureSpec.getMode(0) + 24291));
                java.lang.Object[] objArr139 = new java.lang.Object[1];
                a((byte) (-bArr[16]), bArr[17], bArr[11], objArr139);
                cls52.getField((java.lang.String) objArr139[0]).set(null, objArr138);
                try {
                    long longValue8 = ((java.lang.Long) java.lang.Class.forName(str15).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 51, 584 - android.view.View.MeasureSpec.getMode(0), (char) (24290 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                    java.lang.Object[] objArr140 = new java.lang.Object[1];
                    a(bArr[18], bArr[3], org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, objArr140);
                    cls53.getField((java.lang.String) objArr140[0]).set(null, java.lang.Long.valueOf(longValue8));
                } catch (java.lang.Exception unused9) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
            }
            objArr8 = objArr138;
            i5 = ((int[]) objArr8[1])[0];
            if (((int[]) objArr8[0])[0] != i5) {
            }
            super.onCreate();
            java.lang.Class cls452 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 51, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 584, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24290));
            java.lang.Object[] objArr1212 = new java.lang.Object[1];
            a((byte) (bArr[3] + 1), (byte) (bArr[17] - 1), bArr[11], objArr1212);
            j = cls452.getField((java.lang.String) objArr1212[0]).getLong(null);
            if (j != -1) {
            }
            baseContext = getBaseContext();
            if (baseContext == null) {
            }
            if (baseContext != null) {
            }
            java.lang.Object[] objArr1222 = {baseContext, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str12).getMethod(str11, java.lang.Object.class).invoke(null, this)).intValue()), -2128582532};
            byte[] bArr132 = $$d;
            java.lang.Object[] objArr1232 = new java.lang.Object[1];
            d(bArr132[29], bArr132[126], bArr132[147], objArr1232);
            java.lang.Class<?> cls462 = java.lang.Class.forName((java.lang.String) objArr1232[0]);
            byte b132 = bArr132[147];
            java.lang.Object[] objArr1242 = new java.lang.Object[1];
            d(b132, (short) (b132 | 344), (byte) (bArr132[17] - 1), objArr1242);
            java.lang.Object[] objArr1252 = (java.lang.Object[]) cls462.getMethod((java.lang.String) objArr1242[0], java.lang.Class.forName(str4), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1222);
            if (baseContext != null) {
            }
            objArr9 = objArr1252;
            i6 = ((int[]) objArr9[1])[0];
            if (((int[]) objArr9[0])[0] != i6) {
            }
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    static void init$2() {
        $$g = new byte[]{38, -91, 120, 99};
        $$h = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE;
    }

    static void init$1() {
        $$d = new byte[]{57, 59, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 75, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, 14, -15, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -52, 1, 5, com.google.common.base.Ascii.FS, -22, -17, com.google.common.base.Ascii.NAK, 17, -17, -19, 4, 32, -37, 9, com.google.common.base.Ascii.VT, 14, -18, -11, com.google.common.base.Ascii.FF, 36, -33, -1, 5, -20, 9, -8, 1, -37, 2, -2, -11, com.google.common.base.Ascii.VT, -17, com.google.common.base.Ascii.NAK, 1, 33, -30, -17, 14, com.google.common.base.Ascii.DC4, -34, 3, 9, -3, -3, 7, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, 14, -15, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -34, -13, -2, com.google.common.base.Ascii.VT, 3, -3, 6, 2, -19, com.google.common.base.Ascii.SI, 5, 9, -11, com.google.common.base.Ascii.SI, 19, -19, -11, 4, com.google.common.base.Ascii.VT, -2, -2, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, com.google.common.base.Ascii.SI, -7, com.google.common.base.Ascii.ETB, -27, 0, 32, -29, 8, com.google.common.base.Ascii.SYN, -23, 0, 1, 18, -19, -14, 14, -15, -43, -8, com.google.common.base.Ascii.SI, -13, 4, 13, -19, com.google.common.base.Ascii.SI, 34, -44, 1, -6, 19, -2, -17, 8, 7, -14, 0, 35, -17, -24, com.google.common.base.Ascii.FF, 8, -9, -6, 48, -29, -19, 19, com.google.common.base.Ascii.ETB, -41, 4, 1, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, 14, -15, 32, -30, 17, -13, -5, 18, -2, -17, com.google.common.base.Ascii.VT, -6, 1, 43, -47, 13, 1, -1, -9, -6, com.google.common.base.Ascii.VT, 8, -11, -7, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, 14, -15, 36, -34, 13, -14, 0, 14, 1, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, 14, -15, 36, -25, -13, 7, -5, com.google.common.base.Ascii.FS, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -13, -2, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, 14, -15, 36, -25, -13, 7, -5, com.google.common.base.Ascii.FS, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -17, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, com.google.common.base.Ascii.VT, -7, -8, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -45, 0, 3, -3, 46, -37, 8, -11, -3, 8, 33, -44, 17, -6, -6, 8, -9, -6, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -53, -15, 13, 4, -19, com.google.common.base.Ascii.SI, 34, -44, 1, 8, -3, 2, -14, 3, 17, -19, com.google.common.base.Ascii.VT, -6, 1, 43, -44, 1, -6, com.google.common.base.Ascii.SI, -19, 4, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -59, -10, 44, -40, 0, 8, -5, 7, com.google.common.base.Ascii.NAK, -28, com.google.common.base.Ascii.VT, -24, 38, -18, -13, -4, 13, 6, -2, -14, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -53, com.google.common.base.Ascii.NAK, -8, -3, com.google.common.base.Ascii.VT, -1, -10, 7, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -53, -15, 13, 4, -19, com.google.common.base.Ascii.SI, 33, -33, -17, 13, 6, -2, 34, -44, 1, -6, com.google.common.base.Ascii.SI, -19, 4, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, 14, -15, 48, -47, 1, 2, com.google.common.base.Ascii.ESC, -24, 9, 17, -18, -14, 0, 10, -6, 1, 35, -26, -20, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, -1, 5, -1, 42, -41, -3, 13, -2, -11, 3, -6, 7, 10};
        $$e = 205;
    }

    static void writeReplace() {
        writeReplace = 1263759066225628708L;
        DigitizedCardProfile = -804334044;
        values = (char) 41932;
        AlternateContactlessPaymentDataJson = new char[]{11247, 11236, 11243, 11256, 11261, 11244, 11034, 11260, 11235, 11239, 11234, 11262, 11046, 11238, 11233, 11037, 11251, 11245, 11263, 11258, 11019, 11257, 11242, 11070, 11067, 11069, 11068, 11059, 11066, 11057, 11071, 11246, 11064, 11056};
        IccPrivateKeyCrtComponentsJson = -143185080;
        getAid = true;
        getProfileVersion = true;
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        RecordsJson = 1;
        writeReplace();
        valueOf = new char[]{16850, 16796, 16829, 16822, 16821, 16824, 16829, 16821, 16789, 16780, 16813, 16822, 16821, 16824, 16822, 16718, 16826, 16831, 16829, 16827, 16820, 16824, 16830};
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 107;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static void init$0() {
        $$a = new byte[]{114, 106, 82, com.google.common.base.Ascii.SYN, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5, -19, 13, com.google.common.base.Ascii.VT, -14, 16, -19, 13, com.google.common.base.Ascii.VT, -14, -20, com.google.common.base.Ascii.EM, -3, -7, 13, -13, -17, com.google.common.base.Ascii.NAK, 13, -2, -9, 4, 4, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, 19, 9, -38, 46, 5, -11, -34, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -22, 38, 5, -2};
        $$b = 83;
    }
}

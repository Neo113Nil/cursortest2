package com.payair.hce;

/* loaded from: classes4.dex */
public class getPackageManager implements com.payair.hce.setStatusMessage {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int getAid;
    private static final java.lang.Object valueOf;
    private com.payair.hce.checkPermission values;
    private com.payair.hce.accessgetCoroutineScopep writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2 = s2 * 4;
        int i3 = (s * 8) + 65;
        int i4 = (b * 3) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i5 = i2;
            i = 0;
            i4++;
            i3 += i5;
            bArr2[i] = (byte) i3;
            if (i == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i5 = bArr[i4];
            i4++;
            i3 += i5;
            bArr2[i] = (byte) i3;
            if (i == i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i2) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        getAid = 1;
        AlternateContactlessPaymentDataJson();
        valueOf = new java.lang.Object();
        getAid = (IccPrivateKeyCrtComponentsJson + 31) % 128;
    }

    public getPackageManager(com.payair.hce.accessgetCoroutineScopep accessgetcoroutinescopep) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u0011\u001e\u0006\u0007\u0000\u000b", 6 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (byte) (70 - android.widget.ExpandableListView.getPackedPositionType(0L)), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.getPackageManager.class.getName());
        this.values = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        this.writeReplace = accessgetcoroutinescopep;
    }

    @Override // com.payair.hce.setStatusMessage
    public final void valueOf(com.payair.hce.isAutomaticTimeEnabled isautomatictimeenabled, java.lang.String str) throws java.security.GeneralSecurityException {
        isautomatictimeenabled.DigitizedCardProfile();
        com.payair.hce.isSessionAvailable AlternateContactlessPaymentDataJson2 = isautomatictimeenabled.AlternateContactlessPaymentDataJson();
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{AlternateContactlessPaymentDataJson2}, -1877837077, 1877837077, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2)));
        com.payair.hce.isSessionAvailable valueOf2 = isautomatictimeenabled.valueOf();
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{valueOf2}, -1877837077, 1877837077, java.lang.System.identityHashCode(valueOf2)));
        com.payair.hce.isSessionAvailable values = isautomatictimeenabled.values();
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{values}, -1877837077, 1877837077, java.lang.System.identityHashCode(values)));
        synchronized (valueOf) {
            com.payair.hce.accessgetCoroutineScopep accessgetcoroutinescopep = this.writeReplace;
            java.lang.String DigitizedCardProfile2 = isautomatictimeenabled.DigitizedCardProfile();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("!\u0017\t\u001d\t\u0017㗘", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6, (byte) (20 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr);
            accessgetcoroutinescopep.DigitizedCardProfile(DigitizedCardProfile2, ((java.lang.String) objArr[0]).intern(), isautomatictimeenabled.AlternateContactlessPaymentDataJson());
            com.payair.hce.accessgetCoroutineScopep accessgetcoroutinescopep2 = this.writeReplace;
            java.lang.String DigitizedCardProfile3 = isautomatictimeenabled.DigitizedCardProfile();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("#\u0015!\u001a\t\u0017㗯", 7 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 43), objArr2);
            accessgetcoroutinescopep2.DigitizedCardProfile(DigitizedCardProfile3, ((java.lang.String) objArr2[0]).intern(), isautomatictimeenabled.valueOf());
            com.payair.hce.accessgetCoroutineScopep accessgetcoroutinescopep3 = this.writeReplace;
            java.lang.String DigitizedCardProfile4 = isautomatictimeenabled.DigitizedCardProfile();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a("\u0016\"\u0012\u0005\u0012\u001e\"\u0018\u000f\u001c\t\u0017㙀", android.view.View.combineMeasuredStates(0, 0) + 13, (byte) (android.text.TextUtils.getTrimmedLength("") + 125), objArr3);
            accessgetcoroutinescopep3.DigitizedCardProfile(DigitizedCardProfile4, ((java.lang.String) objArr3[0]).intern(), isautomatictimeenabled.values());
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a("\n\b\u0004!㖺㖺\u0014\u000e\r\u0005㗶㗶\u0013\u001e\u000f\b\u000f\u000e\u000b\u000e\r\u000b\u0004!\u001f\r\u0013\b\u001a\u0014\u0010\u0017\u0004\n", android.graphics.Color.red(0) + 34, (byte) (9 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr4);
            if (!java.util.regex.Pattern.matches(((java.lang.String) objArr4[0]).intern(), str)) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                a("\u0007\u0019\u0014\u0013\u0001\u001f㘨㘨", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7, (byte) (android.graphics.ImageFormat.getBitsPerPixel(0) + 116), objArr5);
                str = ((java.lang.String) objArr5[0]).intern().concat(java.lang.String.valueOf(str));
            }
            this.writeReplace.getAid(str);
        }
    }

    @Override // com.payair.hce.setStatusMessage
    public final com.payair.hce.isAutomaticTimeEnabled values() throws java.security.GeneralSecurityException {
        synchronized (valueOf) {
            final java.lang.String valueOf2 = this.writeReplace.valueOf();
            if (android.text.TextUtils.isEmpty(valueOf2)) {
                return null;
            }
            com.payair.hce.accessgetCoroutineScopep accessgetcoroutinescopep = this.writeReplace;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("!\u0017\t\u001d\t\u0017㗘", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7, (byte) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 21), objArr);
            final com.payair.hce.isSessionAvailable valueOf3 = accessgetcoroutinescopep.valueOf(valueOf2, ((java.lang.String) objArr[0]).intern());
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{valueOf3}, -1877837077, 1877837077, java.lang.System.identityHashCode(valueOf3)));
            com.payair.hce.accessgetCoroutineScopep accessgetcoroutinescopep2 = this.writeReplace;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("#\u0015!\u001a\t\u0017㗯", 7 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (android.view.View.MeasureSpec.getSize(0) + 44), objArr2);
            final com.payair.hce.isSessionAvailable valueOf4 = accessgetcoroutinescopep2.valueOf(valueOf2, ((java.lang.String) objArr2[0]).intern());
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{valueOf4}, -1877837077, 1877837077, java.lang.System.identityHashCode(valueOf4)));
            com.payair.hce.accessgetCoroutineScopep accessgetcoroutinescopep3 = this.writeReplace;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a("\u0016\"\u0012\u0005\u0012\u001e\"\u0018\u000f\u001c\t\u0017㙀", 13 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (byte) ((android.os.Process.myPid() >> 22) + 125), objArr3);
            final com.payair.hce.isSessionAvailable valueOf5 = accessgetcoroutinescopep3.valueOf(valueOf2, ((java.lang.String) objArr3[0]).intern());
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{valueOf5}, -1877837077, 1877837077, java.lang.System.identityHashCode(valueOf5)));
            return new com.payair.hce.isAutomaticTimeEnabled() { // from class: com.payair.hce.getPackageManager.3
                private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;
                private static int getProfileVersion;

                public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr4, int i, int i2, int i3) {
                    int i4 = ~i3;
                    int i5 = ~(i4 | i);
                    int i6 = ~((~i) | i2);
                    int i7 = (i * 765) + (i2 * (-1527)) + ((i2 | i5) * 764) + (((~(i4 | i2)) | i6) * (-1528)) + (((~(i | (~i2))) | i6 | i5) * 764);
                    if (i7 == 1) {
                        return writeReplace(objArr4);
                    }
                    if (i7 == 2) {
                        return values(objArr4);
                    }
                    if (i7 == 3) {
                        return valueOf(objArr4);
                    }
                    com.payair.hce.getPackageManager.AnonymousClass3 anonymousClass3 = (com.payair.hce.getPackageManager.AnonymousClass3) objArr4[0];
                    int i8 = (getProfileVersion + 77) % 128;
                    SdkCoreAlternateContactlessPaymentDataImpl = i8;
                    com.payair.hce.isSessionAvailable issessionavailable = valueOf5;
                    int i9 = i8 ^ 101;
                    int i10 = (i8 & 101) << 1;
                    getProfileVersion = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
                    return issessionavailable;
                }

                private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr4) {
                    com.payair.hce.getPackageManager.AnonymousClass3 anonymousClass3 = (com.payair.hce.getPackageManager.AnonymousClass3) objArr4[0];
                    int i = getProfileVersion;
                    int i2 = ((i & (-22)) | ((~i) & 21)) + ((i & 21) << 1);
                    SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
                    java.lang.String str = valueOf2;
                    if (i2 % 2 != 0) {
                        return str;
                    }
                    throw null;
                }

                private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr4) {
                    com.payair.hce.getPackageManager.AnonymousClass3 anonymousClass3 = (com.payair.hce.getPackageManager.AnonymousClass3) objArr4[0];
                    int identityHashCode = java.lang.System.identityHashCode(anonymousClass3);
                    int i = ~identityHashCode;
                    int i2 = i ^ 1477340895;
                    int i3 = 1477340895 & i;
                    int i4 = (i3 ^ i2) | (i3 & i2);
                    int i5 = ~i4;
                    int i6 = (i4 | i5) & i5;
                    int i7 = i6 & (-2042556384);
                    int i8 = (i6 | (-2042556384)) & (~i7);
                    int i9 = (i8 ^ i7) | (i8 & i7);
                    int i10 = i & (-1639369537);
                    int i11 = ((~i) & 1639369536) | i10;
                    int i12 = i & 1639369536;
                    int i13 = (i11 ^ i12) | (i11 & i12);
                    int i14 = ~i13;
                    int i15 = (i13 | i14) & i14;
                    int i16 = i9 & i15;
                    int i17 = (i9 | i15) & (~i16);
                    int i18 = (i17 ^ i16) | (i17 & i16);
                    int i19 = ~(((-1074154049) ^ identityHashCode) | (identityHashCode & (-1074154049)));
                    int i20 = ((i18 ^ i19) | (i18 & i19)) * (-84);
                    int i21 = i20 & 1367585547;
                    int i22 = (i20 | 1367585547) & (~i21);
                    int i23 = i21 << 1;
                    int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
                    int i25 = identityHashCode & 1639369536;
                    int i26 = (identityHashCode | 1639369536) & (~i25);
                    int i27 = (~((i26 ^ i25) | (i26 & i25))) | (-1477340896);
                    int i28 = i ^ (-1639369537);
                    int i29 = (i28 ^ i10) | (i28 & i10);
                    int i30 = ~i29;
                    int i31 = (i29 | i30) & i30;
                    int i32 = ((~i31) & i27) | ((~i27) & i31);
                    int i33 = i27 & i31;
                    int i34 = ((i33 ^ i32) | (i33 & i32)) * (-84);
                    int i35 = (i31 | 1074154048) & (~(i31 & 1074154048));
                    int identityHashCode2 = java.lang.System.identityHashCode(anonymousClass3);
                    int i36 = ~identityHashCode2;
                    int i37 = i36 & (-1054324763);
                    int i38 = (i36 | (-1054324763)) & (~i37);
                    int i39 = (i37 ^ i38) | (i38 & i37);
                    int i40 = ~i39;
                    int i41 = (i39 | i40) & i40;
                    int i42 = i41 & 235278352;
                    int i43 = (i41 | 235278352) & (~i42);
                    int i44 = -(-(((i43 ^ i42) | (i43 & i42)) * (-160)));
                    int i45 = i44 & (-1128853485);
                    int i46 = (((i44 ^ (-1128853485)) | i45) << 1) - ((i44 | (-1128853485)) & (~i45));
                    int i47 = (identityHashCode2 | i36) & i36;
                    int i48 = ((~i47) & 252596913) | ((-252596914) & i47);
                    int i49 = i47 & 252596913;
                    int i50 = ~((i49 ^ i48) | (i49 & i48));
                    int i51 = ((~i50) & (-1054324763)) | (1054324762 & i50);
                    int i52 = i50 & (-1054324763);
                    int i53 = -(-(((i52 ^ i51) | (i52 & i51)) * 160));
                    com.payair.hce.isSessionAvailable issessionavailable = valueOf4;
                    if ((((i24 & i34) + (i34 | i24)) - (~(((i35 & r3) | (i35 ^ r3)) * 84))) - 1 <= ((i46 | i53) << 1) - (i53 ^ i46)) {
                        throw null;
                    }
                    int i54 = SdkCoreAlternateContactlessPaymentDataImpl;
                    int i55 = (i54 & 10) + (i54 | 10);
                    getProfileVersion = ((~i55) + (i55 << 1)) % 128;
                    return issessionavailable;
                }

                private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr4) {
                    com.payair.hce.getPackageManager.AnonymousClass3 anonymousClass3 = (com.payair.hce.getPackageManager.AnonymousClass3) objArr4[0];
                    int i = SdkCoreAlternateContactlessPaymentDataImpl;
                    int i2 = ((i & (-44)) | ((~i) & 43)) + ((i & 43) << 1);
                    getProfileVersion = i2 % 128;
                    com.payair.hce.isSessionAvailable issessionavailable = valueOf3;
                    if (i2 % 2 == 0) {
                        return issessionavailable;
                    }
                    throw new java.lang.ArithmeticException();
                }

                @Override // com.payair.hce.isAutomaticTimeEnabled
                public final com.payair.hce.isSessionAvailable AlternateContactlessPaymentDataJson() {
                    return (com.payair.hce.isSessionAvailable) DigitizedCardProfile(new java.lang.Object[]{this}, -144651084, 144651085, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.isAutomaticTimeEnabled
                public final com.payair.hce.isSessionAvailable values() {
                    return (com.payair.hce.isSessionAvailable) DigitizedCardProfile(new java.lang.Object[]{this}, -1781689522, 1781689522, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.isAutomaticTimeEnabled
                public final com.payair.hce.isSessionAvailable valueOf() {
                    return (com.payair.hce.isSessionAvailable) DigitizedCardProfile(new java.lang.Object[]{this}, -2037615606, 2037615608, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.isAutomaticTimeEnabled
                public final java.lang.String DigitizedCardProfile() {
                    return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1576410887, 1576410890, java.lang.System.identityHashCode(this));
                }
            };
        }
    }

    @Override // com.payair.hce.setStatusMessage
    public final java.lang.String DigitizedCardProfile() {
        int i = getAid + 99;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            return this.writeReplace.writeReplace();
        }
        this.writeReplace.writeReplace();
        throw null;
    }

    @Override // com.payair.hce.setStatusMessage
    public final boolean writeReplace() {
        try {
            com.payair.hce.isAutomaticTimeEnabled values = values();
            if (values == null) {
                return false;
            }
            if (!android.text.TextUtils.isEmpty(values.DigitizedCardProfile())) {
                int i = IccPrivateKeyCrtComponentsJson + 7;
                getAid = i % 128;
                if (i % 2 != 0) {
                    if (values.valueOf() != null && values.values() != null && values.AlternateContactlessPaymentDataJson() != null) {
                        return true;
                    }
                } else {
                    values.valueOf();
                    throw null;
                }
            }
            getAid = (IccPrivateKeyCrtComponentsJson + 107) % 128;
            return false;
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        $10 = ($11 + 77) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = AlternateContactlessPaymentDataJson;
        int i3 = 8;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 49, 2509 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (6802 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((short) 0, (short) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $10 = ($11 + 77) % 128;
            cArr = cArr2;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(DigitizedCardProfile)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.KeyEvent.keyCodeFromString(""), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2508, (char) (android.view.View.getDefaultSize(0, 0) + 6802));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b((short) 0, (short) 0, (byte) 0, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            $10 = ($11 + 17) % 128;
            int i5 = 0;
            while (true) {
                digitizedCardJson12.values = i5;
                if (digitizedCardJson12.values >= i2) {
                    break;
                }
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    $11 = ($10 + 69) % 128;
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    $11 = ($10 + 15) % 128;
                } else {
                    java.lang.Object[] objArr6 = new java.lang.Object[13];
                    objArr6[12] = digitizedCardJson12;
                    objArr6[11] = java.lang.Integer.valueOf(charValue);
                    objArr6[10] = digitizedCardJson12;
                    objArr6[9] = digitizedCardJson12;
                    objArr6[i3] = java.lang.Integer.valueOf(charValue);
                    objArr6[7] = digitizedCardJson12;
                    objArr6[6] = digitizedCardJson12;
                    objArr6[5] = java.lang.Integer.valueOf(charValue);
                    objArr6[4] = digitizedCardJson12;
                    objArr6[3] = digitizedCardJson12;
                    objArr6[2] = java.lang.Integer.valueOf(charValue);
                    objArr6[1] = digitizedCardJson12;
                    objArr6[0] = digitizedCardJson12;
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.View.MeasureSpec.getSize(0), 3596 - (android.view.ViewConfiguration.getWindowTouchSlop() >> i3), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                        java.lang.Class<?>[] clsArr = new java.lang.Class[13];
                        clsArr[0] = java.lang.Object.class;
                        clsArr[1] = java.lang.Object.class;
                        clsArr[2] = java.lang.Integer.TYPE;
                        clsArr[3] = java.lang.Object.class;
                        clsArr[4] = java.lang.Object.class;
                        clsArr[5] = java.lang.Integer.TYPE;
                        clsArr[6] = java.lang.Object.class;
                        clsArr[7] = java.lang.Object.class;
                        clsArr[i3] = java.lang.Integer.TYPE;
                        clsArr[9] = java.lang.Object.class;
                        clsArr[10] = java.lang.Object.class;
                        clsArr[11] = java.lang.Integer.TYPE;
                        clsArr[12] = java.lang.Object.class;
                        obj3 = cls3.getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, clsArr);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = new java.lang.Object[11];
                        objArr7[10] = digitizedCardJson12;
                        objArr7[9] = java.lang.Integer.valueOf(charValue);
                        objArr7[i3] = digitizedCardJson12;
                        objArr7[7] = java.lang.Integer.valueOf(charValue);
                        objArr7[6] = java.lang.Integer.valueOf(charValue);
                        objArr7[5] = digitizedCardJson12;
                        objArr7[4] = digitizedCardJson12;
                        objArr7[3] = java.lang.Integer.valueOf(charValue);
                        objArr7[2] = java.lang.Integer.valueOf(charValue);
                        objArr7[1] = digitizedCardJson12;
                        objArr7[0] = digitizedCardJson12;
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2665, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 18889));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b((short) 1, (short) 0, (byte) 0, objArr8);
                            java.lang.String str2 = (java.lang.String) objArr8[0];
                            java.lang.Class<?>[] clsArr2 = new java.lang.Class[11];
                            clsArr2[0] = java.lang.Object.class;
                            clsArr2[1] = java.lang.Object.class;
                            clsArr2[2] = java.lang.Integer.TYPE;
                            clsArr2[3] = java.lang.Integer.TYPE;
                            clsArr2[4] = java.lang.Object.class;
                            clsArr2[5] = java.lang.Object.class;
                            clsArr2[6] = java.lang.Integer.TYPE;
                            clsArr2[7] = java.lang.Integer.TYPE;
                            clsArr2[i3] = java.lang.Object.class;
                            clsArr2[9] = java.lang.Integer.TYPE;
                            clsArr2[10] = java.lang.Object.class;
                            obj4 = cls4.getMethod(str2, clsArr2);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i6 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i7 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i6 * charValue) + i7];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        $11 = ($10 + 117) % 128;
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i8 = digitizedCardJson12.DigitizedCardProfile;
                        int i9 = digitizedCardJson12.RecordsJson;
                        int i10 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i11 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[(i8 * charValue) + i9];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i10 * charValue) + i11];
                    } else {
                        int i12 = digitizedCardJson12.DigitizedCardProfile;
                        int i13 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i14 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i15 = digitizedCardJson12.RecordsJson;
                        cArr3[digitizedCardJson12.values] = cArr[(i12 * charValue) + i13];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i14 * charValue) + i15];
                    }
                }
                i5 = digitizedCardJson12.values + 2;
                i3 = 8;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            $11 = ($10 + 117) % 128;
            cArr3[i16] = (char) (cArr3[i16] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void AlternateContactlessPaymentDataJson() {
        AlternateContactlessPaymentDataJson = new char[]{12292, 12322, 12300, 12317, 12398, 12342, 12394, 12310, 12323, 12386, 12294, 12289, 12313, 12391, 12405, 12307, 12318, 12387, 12346, 12350, 12389, 12303, 12388, 12299, 12314, 12400, 12298, 12309, 12312, 12296, 12293, 12345, 12297, 12295, 12384, 12302};
        DigitizedCardProfile = (char) 1494;
    }

    static void init$0() {
        $$a = new byte[]{120, 91, -87, 14};
        $$b = 224;
    }
}

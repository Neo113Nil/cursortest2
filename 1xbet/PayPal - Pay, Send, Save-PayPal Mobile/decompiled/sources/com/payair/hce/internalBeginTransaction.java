package com.payair.hce;

/* loaded from: classes4.dex */
public final class internalBeginTransaction extends com.payair.hce.querydefault {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private boolean writeReplace;
    private int[] values = null;
    private int[] valueOf = null;
    private int[] DigitizedCardProfile = null;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2 = 3 - (b2 * 3);
        int i3 = 106 - s;
        int i4 = b * 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i3 = (-i3) + i6;
            i = i7;
            i2++;
            bArr2[i] = (byte) i3;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i + 1;
            i6 = i3;
            i3 = bArr[i2];
            i7 = i8;
            i3 = (-i3) + i6;
            i = i7;
            i2++;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        } else {
            i = 0;
            i2++;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = getAid + 7;
        int i5 = i4 % 128;
        RecordsJson = i5;
        int i6 = i4 % 2 == 0 ? 14 : 8;
        getAid = (i5 + 15) % 128;
        return java.lang.Integer.valueOf(i6);
    }

    @Override // com.payair.hce.querydefault, com.payair.hce.getMDatabaseannotations
    public final void writeReplace(boolean z, com.payair.hce.getMCallbacksannotations getmcallbacksannotations) {
        boolean z2 = true;
        if (!(getmcallbacksannotations instanceof com.payair.hce.getErrorDialog)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            c("\u1975щḒ뱩꽚設仕綤傲쇢ࣿ姮唧輸\uf472䥖儫\ue481툦充ዠ億\ufae7઼柬\uf27f⇅뒜팺\u0896ᒜ䍒\udda5䏆\ue2b2꽟\ue8e0﵁䮮밉仅☛", "滧覷\ufdd2蓱", '0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0000\u0000\u0000\u0000", (char) (61949 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(getmcallbacksannotations.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        com.payair.hce.getErrorDialog geterrordialog = (com.payair.hce.getErrorDialog) getmcallbacksannotations;
        byte[] bArr = (byte[]) com.payair.hce.getErrorDialog.DigitizedCardProfile(new java.lang.Object[]{geterrordialog}, -363040252, 363040252, java.lang.System.identityHashCode(geterrordialog));
        if (bArr.length != 24 && bArr.length != 16) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            c("頳웱ᕧ荺퍈\u2072瘏쯤\uec16솉爷ጏ撄둜탇厐⍙き\uf1bd\ue0f4֡硥\uf3d0㪟\uf215꺅ꞻ憢ꙝ貒ꑘ牎", "뙐潈ލ탺", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1, "\u0000\u0000\u0000\u0000", (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 64007), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        this.writeReplace = z;
        byte[] bArr2 = new byte[8];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, 8);
        this.values = DigitizedCardProfile(z, bArr2);
        byte[] bArr3 = new byte[8];
        java.lang.System.arraycopy(bArr, 8, bArr3, 0, 8);
        if (z) {
            z2 = false;
        } else {
            int i = getAid;
            RecordsJson = (i + 45) % 128;
            RecordsJson = (i + 23) % 128;
        }
        this.valueOf = DigitizedCardProfile(z2, bArr3);
        if (bArr.length == 24) {
            byte[] bArr4 = new byte[8];
            java.lang.System.arraycopy(bArr, 16, bArr4, 0, 8);
            this.DigitizedCardProfile = DigitizedCardProfile(z, bArr4);
            int i2 = RecordsJson + 107;
            getAid = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.DigitizedCardProfile = this.values;
    }

    @Override // com.payair.hce.querydefault, com.payair.hce.getMDatabaseannotations
    public final java.lang.String writeReplace() {
        java.lang.Object obj;
        int i = getAid + 89;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            c("\ud955\uf123ꞕ飦䵗朁", "䭿ᆚ\ud9f1眆", android.view.View.resolveSizeAndState(1, 1, 1), "\u0000\u0000\u0000\u0000", (char) (10570 % (android.view.ViewConfiguration.getMaximumDrawingCacheSize() / 83)), objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            c("\ud955\uf123ꞕ飦䵗朁", "䭿ᆚ\ud9f1眆", android.view.View.resolveSizeAndState(0, 0, 0), "\u0000\u0000\u0000\u0000", (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1753), objArr2);
            obj = objArr2[0];
        }
        return ((java.lang.String) obj).intern();
    }

    @Override // com.payair.hce.querydefault, com.payair.hce.getMDatabaseannotations
    public final int AlternateContactlessPaymentDataJson(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = getAid;
        RecordsJson = (i3 + 41) % 128;
        int[] iArr = this.values;
        if (iArr == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            c("质蘰뽑퍠㫫媓ᘰ芃\uef79ޒ\uf301忸㬯\udf94眫뺼鉦阽싵錸㩞ꎀ\u007f漢橊ﶝ㜱鲢귍", "䋅\uf566岭ⵉ", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 1376426430, "\u0000\u0000\u0000\u0000", (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 18780), objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        if (i + 8 > bArr.length) {
            long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            c("鞜昳頛淁\uf35b憹⎃䷈瘟蒟烦侧䢽㛕ဖ䧍怒个\udeedꩨ\udafdᩁ", "鞊궥ꂝ권", (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)) - 1, "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
            throw new com.payair.hce.getInvalidationTracker(((java.lang.String) objArr2[0]).intern());
        }
        if (i2 + 8 > bArr2.length) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            c("䃝䒣ￌ祅僓ﾬ\uf500蝉쵃쯗ꇑ匕뤒ᨾ뻷㗁\ude5a詙\ufff5௹肉ᐊ\uedd0", "㯝♹ꛘꐺ", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) - 668567237, "\u0000\u0000\u0000\u0000", (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr3);
            throw new com.payair.hce.setAutoMigrationSpecs(((java.lang.String) objArr3[0]).intern());
        }
        byte[] bArr3 = new byte[8];
        if (!this.writeReplace) {
            values(this.DigitizedCardProfile, bArr, i, bArr3, 0);
            values(this.valueOf, bArr3, 0, bArr3, 0);
            values(this.values, bArr3, 0, bArr2, i2);
        } else {
            int i4 = i3 + 67;
            RecordsJson = i4 % 128;
            if (i4 % 2 == 0) {
                values(iArr, bArr, i, bArr3, 1);
                values(this.valueOf, bArr3, 0, bArr3, 1);
                values(this.DigitizedCardProfile, bArr3, 1, bArr2, i2);
            } else {
                values(iArr, bArr, i, bArr3, 0);
                values(this.valueOf, bArr3, 0, bArr3, 0);
                values(this.DigitizedCardProfile, bArr3, 0, bArr2, i2);
            }
        }
        return 8;
    }

    @Override // com.payair.hce.querydefault, com.payair.hce.getMDatabaseannotations
    public final void DigitizedCardProfile() {
        int i = RecordsJson + 17;
        getAid = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void c(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, char c, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $10 + 99;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            $11 = ($10 + 81) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray2.length;
        char[] cArr2 = new char[length];
        int length2 = charArray.length;
        char[] cArr3 = new char[length2];
        byte b = 0;
        java.lang.System.arraycopy(charArray2, 0, cArr2, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c);
        cArr3[2] = (char) (cArr3[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr4 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 1179 - (android.os.Process.myTid() >> 22), (char) android.view.View.getDefaultSize(b, b));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(b, b, (byte) $$d.length, objArr3);
                    java.lang.String str4 = (java.lang.String) objArr3[b];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[b] = java.lang.Object.class;
                    obj = cls.getMethod(str4, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.util.TypedValue.complexToFloat(b) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(b) == 0.0f ? 0 : -1)), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 3443, (char) (android.graphics.Color.alpha((int) b) + 3831));
                    java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                    clsArr2[b] = java.lang.Object.class;
                    obj2 = cls2.getMethod("g", clsArr2);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                char c2 = cArr2[getwalletdata.writeReplace % 4];
                java.lang.Object[] objArr5 = new java.lang.Object[3];
                objArr5[2] = java.lang.Integer.valueOf(cArr3[intValue]);
                objArr5[1] = java.lang.Integer.valueOf(c2 * 32718);
                objArr5[b] = getwalletdata;
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25, ((android.os.Process.getThreadPriority(b) + 20) >> 6) + 1864, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 41774));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d(b, b, (short) 1, objArr6);
                    java.lang.String str5 = (java.lang.String) objArr6[b];
                    java.lang.Class<?>[] clsArr3 = new java.lang.Class[3];
                    clsArr3[b] = java.lang.Object.class;
                    clsArr3[1] = java.lang.Integer.TYPE;
                    clsArr3[2] = java.lang.Integer.TYPE;
                    obj3 = cls3.getMethod(str5, clsArr3);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                char c3 = cArr2[intValue2];
                java.lang.Object[] objArr7 = new java.lang.Object[2];
                objArr7[1] = java.lang.Integer.valueOf(cArr3[intValue]);
                objArr7[b] = java.lang.Integer.valueOf(c3 * 32718);
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(b) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(b) == 0.0d ? 0 : -1)) + 3133, (char) android.graphics.Color.alpha((int) b));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    d(b, b, b, objArr8);
                    java.lang.String str6 = (java.lang.String) objArr8[b];
                    java.lang.Class<?>[] clsArr4 = new java.lang.Class[2];
                    clsArr4[b] = java.lang.Integer.TYPE;
                    clsArr4[1] = java.lang.Integer.TYPE;
                    obj4 = cls4.getMethod(str6, clsArr4);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                }
                cArr3[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr2[intValue2] = getwalletdata.values;
                cArr4[getwalletdata.writeReplace] = (char) ((((int) (IccPrivateKeyCrtComponentsJson ^ 1263759066225628708L)) ^ ((cArr2[intValue2] ^ r3[getwalletdata.writeReplace]) ^ (AlternateContactlessPaymentDataJson ^ 1263759066225628708L))) ^ ((char) (SdkCoreAlternateContactlessPaymentDataImpl ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                b = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        RecordsJson = 1;
        AlternateContactlessPaymentDataJson = 1263759066225628708L;
        IccPrivateKeyCrtComponentsJson = 1379070818;
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 54820;
    }

    static void init$0() {
        $$d = new byte[]{5, -66, -84, -78};
        $$e = 10;
    }

    @Override // com.payair.hce.querydefault, com.payair.hce.getMDatabaseannotations
    public final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, 775147183, -775147183, java.lang.System.identityHashCode(this))).intValue();
    }
}

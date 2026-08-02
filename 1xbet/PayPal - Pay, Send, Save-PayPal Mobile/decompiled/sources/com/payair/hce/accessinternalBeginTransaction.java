package com.payair.hce;

/* loaded from: classes4.dex */
public final class accessinternalBeginTransaction extends com.payair.hce.findFragmentByTag {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static long RecordsJson;
    private static int getAid;
    private com.payair.hce.internalInitInvalidationTracker writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        int i2 = (b2 * 4) + 99;
        int i3 = 4 - (b * 3);
        int i4 = b3 * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[44 - i4];
        if (bArr == null) {
            int i5 = i2;
            int i6 = 0;
            int i7 = i3;
            int i8 = i7 + 1;
            int i9 = (i5 + (-i3)) - 1;
            i = i6;
            i2 = i9;
            i3 = i8;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == 43 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i2;
            i7 = i3;
            i3 = bArr[i3];
            i5 = i10;
            int i82 = i7 + 1;
            int i92 = (i5 + (-i3)) - 1;
            i = i6;
            i2 = i92;
            i3 = i82;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == 43 - i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == 43 - i4) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 4 - (s * 2);
        byte[] bArr = $$g;
        int i5 = i * 2;
        ?? r8 = 119 - (b * 2);
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            byte b2 = r8;
            i2 = 0;
            i3 = i4;
            i4 += -b2;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            b2 = bArr[i3];
            i4 += -b2;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i4;
            i4 = r8;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    private accessinternalBeginTransaction(com.payair.hce.getMDatabaseannotations getmdatabaseannotations, com.payair.hce.internalInitInvalidationTracker internalinitinvalidationtracker) {
        this.AlternateContactlessPaymentDataJson = getmdatabaseannotations;
        this.writeReplace = internalinitinvalidationtracker;
        this.values = new byte[getmdatabaseannotations.AlternateContactlessPaymentDataJson()];
        this.valueOf = 0;
    }

    public accessinternalBeginTransaction(com.payair.hce.getMDatabaseannotations getmdatabaseannotations) {
        this(getmdatabaseannotations, new com.payair.hce.endTransaction());
    }

    private static void d(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 61) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(RecordsJson ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            $11 = ($10 + 7) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(RecordsJson)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 1921, (char) (android.view.MotionEvent.axisFromString("") + 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    e((short) 0, 0, (byte) 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 27, (android.os.Process.myPid() >> 22) + 429, (char) (31610 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    e((short) 0, 0, (byte) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
    }

    @Override // com.payair.hce.findFragmentByTag
    public final void DigitizedCardProfile(boolean z, com.payair.hce.getMCallbacksannotations getmcallbacksannotations) throws java.lang.IllegalArgumentException {
        getAid = (IccPrivateKeyCrtComponentsJson + 41) % 128;
        this.DigitizedCardProfile = z;
        DigitizedCardProfile();
        byte b = (byte) ($$a[5] - 1);
        java.lang.Object[] objArr = new java.lang.Object[1];
        c(b, b, b, objArr);
        if (!java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(getmcallbacksannotations)) {
            this.AlternateContactlessPaymentDataJson.writeReplace(z, getmcallbacksannotations);
            int i = getAid + 55;
            IccPrivateKeyCrtComponentsJson = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            return;
        }
        IccPrivateKeyCrtComponentsJson = (getAid + 83) % 128;
        com.payair.hce.isGooglePlayServicesAvailable isgoogleplayservicesavailable = (com.payair.hce.isGooglePlayServicesAvailable) getmcallbacksannotations;
        isgoogleplayservicesavailable.DigitizedCardProfile();
        this.AlternateContactlessPaymentDataJson.writeReplace(z, isgoogleplayservicesavailable.valueOf());
    }

    @Override // com.payair.hce.findFragmentByTag
    public final int valueOf(int i) {
        int i2;
        int length;
        int i3 = getAid + 77;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 == 0 ? (length = (i2 = i + this.valueOf) % this.values.length) == 0 : (length = this.values.length + (i2 = i + this.valueOf)) == 0) {
            if (!this.DigitizedCardProfile) {
                return i2;
            }
            int length2 = i2 + this.values.length;
            IccPrivateKeyCrtComponentsJson = (getAid + 99) % 128;
            return length2;
        }
        return (i2 - length) + this.values.length;
    }

    @Override // com.payair.hce.findFragmentByTag
    public final int values(int i) {
        int i2;
        int length;
        int i3 = IccPrivateKeyCrtComponentsJson + 75;
        getAid = i3 % 128;
        if (i3 % 2 != 0 ? (length = (i2 = i + this.valueOf) % this.values.length) != 0 : (length = (i2 = i >> this.valueOf) / this.values.length) != 0) {
            IccPrivateKeyCrtComponentsJson = (getAid + 13) % 128;
            return i2 - length;
        }
        return java.lang.Math.max(0, i2 - this.values.length);
    }

    @Override // com.payair.hce.findFragmentByTag
    public final int valueOf(byte[] bArr, int i, int i2, byte[] bArr2) throws com.payair.hce.getInvalidationTracker, java.lang.IllegalStateException {
        int i3 = 0;
        if (i2 < 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            d("꺂껁鄕\uf7b1틮뜁Ἂ荩㗢郬矼䱫飜ඝᲘ\ue97f羞ꥺ膩蚅슳䉴⚹⎀ꦃ＜쮍뢴ಊ顝潼喎鍢㔡ᑲ\uf2d5癖긘뤁", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        int AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson();
        int values = values(i2);
        if (values > 0) {
            getAid = (IccPrivateKeyCrtComponentsJson + 45) % 128;
            if (values > bArr2.length) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                d("Ⓩ⒠屝㫭큫棛ᶕ峤뾮巰甫鏥ኒ샖ṁ㛶\uf581摼茧夀䣰轨\u243cﰓ⏄㈆줏", 1 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr2);
                throw new com.payair.hce.setAutoMigrationSpecs(((java.lang.String) objArr2[0]).intern());
            }
        }
        int length = this.values.length - this.valueOf;
        if (i2 > length) {
            java.lang.System.arraycopy(bArr, 0, this.values, this.valueOf, length);
            int AlternateContactlessPaymentDataJson2 = this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(this.values, 0, bArr2, 0);
            this.valueOf = 0;
            i2 -= length;
            i3 = AlternateContactlessPaymentDataJson2;
            i = length;
            while (i2 > this.values.length) {
                i3 += this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(bArr, i, bArr2, i3);
                i2 -= AlternateContactlessPaymentDataJson;
                i += AlternateContactlessPaymentDataJson;
            }
        }
        java.lang.System.arraycopy(bArr, i, this.values, this.valueOf, i2);
        this.valueOf += i2;
        IccPrivateKeyCrtComponentsJson = (getAid + 113) % 128;
        return i3;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int values;
        int i;
        com.payair.hce.accessinternalBeginTransaction accessinternalbegintransaction = (com.payair.hce.accessinternalBeginTransaction) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        int AlternateContactlessPaymentDataJson = accessinternalbegintransaction.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson();
        if (accessinternalbegintransaction.DigitizedCardProfile) {
            if (accessinternalbegintransaction.valueOf == AlternateContactlessPaymentDataJson) {
                IccPrivateKeyCrtComponentsJson = (getAid + 101) % 128;
                if ((AlternateContactlessPaymentDataJson * 2) + intValue > bArr.length) {
                    accessinternalbegintransaction.DigitizedCardProfile();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    d("Ⓩ⒠屝㫭큫棛ᶕ峤뾮巰甫鏥ኒ샖ṁ㛶\uf581摼茧夀䣰轨\u243cﰓ⏄㈆줏", 1 - android.graphics.Color.green(0), objArr2);
                    throw new com.payair.hce.setAutoMigrationSpecs(((java.lang.String) objArr2[0]).intern());
                }
                i = accessinternalbegintransaction.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(accessinternalbegintransaction.values, 0, bArr, intValue);
                accessinternalbegintransaction.valueOf = 0;
            } else {
                i = 0;
            }
            accessinternalbegintransaction.writeReplace.writeReplace(accessinternalbegintransaction.values, accessinternalbegintransaction.valueOf);
            values = i + accessinternalbegintransaction.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(accessinternalbegintransaction.values, 0, bArr, intValue + i);
            accessinternalbegintransaction.DigitizedCardProfile();
        } else {
            if (accessinternalbegintransaction.valueOf != AlternateContactlessPaymentDataJson) {
                accessinternalbegintransaction.DigitizedCardProfile();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                d("꿃꾯੧泃\uf897䀀㕮琻㓷\u0bdc嶜묷馈雡㛼ḥ纑㈅ꯇ燝쏣\ud91e\u0cd1퓐ꣂ摮\ue1e9俦ඛ̾䔉ꊟ鈽깏㸈֔眊㕭錪", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
                throw new com.payair.hce.getInvalidationTracker(((java.lang.String) objArr3[0]).intern());
            }
            IccPrivateKeyCrtComponentsJson = (getAid + 25) % 128;
            int AlternateContactlessPaymentDataJson2 = accessinternalbegintransaction.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(accessinternalbegintransaction.values, 0, accessinternalbegintransaction.values, 0);
            accessinternalbegintransaction.valueOf = 0;
            int i2 = getAid + 49;
            IccPrivateKeyCrtComponentsJson = i2 % 128;
            int i3 = i2 % 2;
            try {
                values = AlternateContactlessPaymentDataJson2 - accessinternalbegintransaction.writeReplace.values(accessinternalbegintransaction.values);
                java.lang.System.arraycopy(accessinternalbegintransaction.values, 0, bArr, intValue, values);
            } finally {
                accessinternalbegintransaction.DigitizedCardProfile();
            }
        }
        return java.lang.Integer.valueOf(values);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        IccPrivateKeyCrtComponentsJson = 0;
        getAid = 1;
        RecordsJson = -1139484922713206266L;
    }

    static void init$1() {
        $$g = new byte[]{39, 89, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 10};
        $$h = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{92, -25, 4, -11, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -60, -11, 43, -41, -1, 7, -6, 6, com.google.common.base.Ascii.DC4, -29, 10, -25, 37, -19, -14, -5, com.google.common.base.Ascii.FF, 5, -3, -15, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -54, com.google.common.base.Ascii.DC4, -9, -4, 10, -2, -11, 6};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
    }

    @Override // com.payair.hce.findFragmentByTag
    public final int values(byte[] bArr, int i) throws com.payair.hce.getInvalidationTracker, java.lang.IllegalStateException, com.payair.hce.getSuspendingTransactionId {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this, bArr, java.lang.Integer.valueOf(i)}, 622580506, -622580506, i)).intValue();
    }
}

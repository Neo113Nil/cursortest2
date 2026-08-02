package com.payair.hce;

/* loaded from: classes4.dex */
public final class setNextFocusUpId implements com.payair.hce.checkUriPermissions {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int RecordsJson;
    private static int getAid;
    private static long valueOf;
    private static char[] writeReplace;
    private final com.payair.hce.checkPermission values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2 = s * 2;
        int i3 = (b * 2) + 107;
        byte[] bArr = $$a;
        int i4 = 3 - (s2 * 4);
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i5 = i2;
            i = 0;
            i3 += i5;
            i4++;
            bArr2[i] = (byte) i3;
            if (i == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i5 = bArr[i4];
            i3 += i5;
            i4++;
            bArr2[i] = (byte) i3;
            if (i == i2) {
            }
        } else {
            i = 0;
            i4++;
            bArr2[i] = (byte) i3;
            if (i == i2) {
            }
        }
    }

    public setNextFocusUpId() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{0, 20, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 0}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", true, objArr);
        this.values = com.payair.hce.checkPermission.DigitizedCardProfile(DigitizedCardProfile(((java.lang.String) objArr[0]).intern()).intern());
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        char[] cArr;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        short s = 0;
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = writeReplace;
        if (cArr2 != null) {
            $11 = ($10 + 47) % 128;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i3];
                    objArr2[s] = java.lang.Integer.valueOf(cArr2[i7]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.text.TextUtils.indexOf("", "", s, s), android.graphics.drawable.Drawable.resolveOpacity(s, s) + 2807, (char) android.view.View.MeasureSpec.makeMeasureSpec(s, s));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(s, s, (byte) 1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[s], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr3[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i7++;
                    s = 0;
                    i3 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        char c = 0;
        java.lang.System.arraycopy(cArr2, i2, cArr4, 0, i4);
        if (bArr2 != null) {
            int i8 = $10 + 91;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr = new char[i4];
                getaccounttype.writeReplace = 0;
            } else {
                cArr = new char[i4];
                getaccounttype.writeReplace = 0;
                c = 0;
            }
            while (getaccounttype.writeReplace < i4) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i9 = $11 + 9;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = getaccounttype.writeReplace;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 44, 2836 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            b((short) 0, (short) 0, (byte) 0, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                        }
                        cArr[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf("", "", 0, 0) + 2836, (char) android.graphics.Color.alpha(0));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b((short) 0, (short) 0, (byte) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    int i12 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 44, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2880, (char) android.view.View.resolveSize(0, 0));
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        b((short) 0, (short) 0, (byte) 2, objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj4);
                    }
                    cArr[i12] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                }
                c = cArr[getaccounttype.writeReplace];
                java.lang.Object[] objArr10 = {getaccounttype, getaccounttype};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.KeyEvent.keyCodeFromString(""), android.graphics.Color.blue(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.graphics.Color.blue(0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            int i13 = $11 + 27;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                char[] cArr5 = new char[i4];
                i = 0;
                java.lang.System.arraycopy(cArr4, 0, cArr5, 0, i4);
                java.lang.System.arraycopy(cArr5, 0, cArr4, i4 >> i6, i6);
                java.lang.System.arraycopy(cArr5, i6, cArr4, 1, i4 / i6);
            } else {
                i = 0;
                char[] cArr6 = new char[i4];
                java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i4);
                int i14 = i4 - i6;
                java.lang.System.arraycopy(cArr6, 0, cArr4, i14, i6);
                java.lang.System.arraycopy(cArr6, i6, cArr4, 0, i14);
            }
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i4];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i4) {
                    break;
                }
                cArr7[getaccounttype.writeReplace] = cArr4[(i4 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            $10 = ($11 + 19) % 128;
            cArr4 = cArr7;
        }
        if (i5 > 0) {
            $10 = ($11 + 119) % 128;
            int i15 = 0;
            while (true) {
                getaccounttype.writeReplace = i15;
                if (getaccounttype.writeReplace >= i4) {
                    break;
                }
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                i15 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a4, code lost:
    
        com.payair.hce.setNextFocusUpId.getAid = (r7 + 25) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009d, code lost:
    
        com.payair.hce.setNextFocusUpId.getAid = (r7 + 125) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009b, code lost:
    
        if ((r8 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008e, code lost:
    
        if ((r8 << 5) == 0) goto L13;
     */
    @Override // com.payair.hce.checkUriPermissions
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x_(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.content.Context context, com.payair.hce.getDetailedMessage getdetailedmessage) {
        RecordsJson = (getAid + 57) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{20, 30, 155, 3}, null, true, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int i = DigitizedCardProfile + 103;
        AlternateContactlessPaymentDataJson = i % 128;
        try {
            if (i % 2 != 0) {
                DigitizedCardProfile(intern).intern();
                sQLiteDatabase.beginTransaction();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(new int[]{50, 75, 0, 75}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001", true, objArr2);
                sQLiteDatabase.execSQL(DigitizedCardProfile(((java.lang.String) objArr2[0]).intern()).intern());
                sQLiteDatabase.setTransactionSuccessful();
                throw null;
            }
            getAid = (RecordsJson + 81) % 128;
            DigitizedCardProfile(intern).intern();
            sQLiteDatabase.beginTransaction();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(new int[]{50, 75, 0, 75}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001", true, objArr3);
            sQLiteDatabase.execSQL(DigitizedCardProfile(((java.lang.String) objArr3[0]).intern()).intern());
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            DigitizedCardProfile(intern).intern();
            int i2 = RecordsJson;
            getAid = (i2 + 3) % 128;
            int i3 = i2 + 29;
            getAid = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = DigitizedCardProfile / 58;
                AlternateContactlessPaymentDataJson = i4 >> 6032;
            } else {
                int i5 = DigitizedCardProfile + 81;
                AlternateContactlessPaymentDataJson = i5 % 128;
            }
        } finally {
            sQLiteDatabase.endTransaction();
            DigitizedCardProfile(intern).intern();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r6 >= 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        if ((r14 << 4) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
    
        r0 = r0 + 25;
        com.payair.hce.setNextFocusUpId.getAid = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        if ((r14 % 2) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0026, code lost:
    
        com.payair.hce.setNextFocusUpId.getAid = (r1 + 109) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0024, code lost:
    
        if ((r0 % 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if ((r0 - 99) == 0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v18, types: [char[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String DigitizedCardProfile(java.lang.String str) {
        int i = getAid + 43;
        int i2 = i % 128;
        RecordsJson = i2;
        if (i % 2 != 0) {
            int i3 = AlternateContactlessPaymentDataJson;
            DigitizedCardProfile = (i3 - 96) >>> 31351;
        } else {
            int i4 = AlternateContactlessPaymentDataJson + 117;
            DigitizedCardProfile = i4 % 128;
        }
        if (str != 0) {
            int i5 = DigitizedCardProfile + 51;
            AlternateContactlessPaymentDataJson = i5 % 128;
            if (i5 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            RecordsJson = (getAid + 61) % 128;
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        long j = valueOf;
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i6 = 0;
        int i7 = 4;
        for (int i8 = 0; i8 < cArr.length; i8++) {
            int i9 = getAid + 115;
            int i10 = i9 % 128;
            RecordsJson = i10;
            if (i9 % 2 == 0 ? ((j >>> i8) & 1) == 1 : (j >> i8) == 0) {
            }
            if (i7 < length) {
                int i11 = i10 + 3;
                getAid = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr2[i7] = cArr[i8];
                    i7 += 112;
                } else {
                    cArr2[i7] = cArr[i8];
                    i7++;
                }
            }
            cArr2[i6] = cArr[i8];
            i6++;
        }
        int i12 = getAid + 33;
        int i13 = i12 % 128;
        RecordsJson = i13;
        if (i12 % 2 != 0) {
            int i14 = DigitizedCardProfile % 17;
            AlternateContactlessPaymentDataJson = i14 % 10027;
        } else {
            int i15 = DigitizedCardProfile + 39;
            AlternateContactlessPaymentDataJson = i15 % 128;
        }
        for (int i16 = 4; i16 < length; i16++) {
            DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 71) % 128;
            cArr2[i16] = (char) ((cArr2[i16] ^ cArr2[i16 % 4]) ^ ((i16 - 4) * valueOf));
        }
        return new java.lang.String(cArr2, 4, length - 4);
    }

    static void DigitizedCardProfile() {
        writeReplace = new char[]{25969, 14486, 60404, 59406, 36714, 43233, 13224, 24673, 3906, 10414, 50734, 14595, 58032, 32774, 4019, 14492, 36825, 53969, 59431, 41525, 7931, 64631, 64553, 42699, 30675, 30075, 30439, 12992, 58268, 39201, 49743, 20344, 20395, 3279, 24251, 56187, 47213, 45300, 11022, 30383, 9245, 9375, 34603, 56311, 42240, 33523, 36920, 18610, 4906, 51038, 12182, 62326, 8017, 28946, 30412, 28437, 15190, 63685, 9933, 13269, 16277, 26755, 3896, 12286, 56174, 61573, 32457, 13219, 57187, 57682, 45005, 63318, 32156, 26629, 6095, 29522, 8515, 63509, 34780, 63259, 7590, 24648, 11334, 13267, 49581, 62461, 8143, 14211, 56763, 64451, 34761, 13201, 57669, 60401, 30665, 13622, 64405, 62214, 40649, 61795, 32675, 25426, 3789, 29974, 7004, 60165, 63183, 61714, 16131, 31445, 9985, 13784, 15253, 58105, 3800, 3421, 6833, 16106, 57251, 62179, 65226, 50805, 11373, 31666, 23324};
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        getAid = 1;
        DigitizedCardProfile();
        AlternateContactlessPaymentDataJson = 0;
        DigitizedCardProfile = 1;
        valueOf = 6712102578023357194L;
        RecordsJson = (getAid + 87) % 128;
    }

    static void init$0() {
        $$a = new byte[]{117, -82, -100, com.visa.cbp.getEncExpo.onUnminimized};
        $$b = 44;
    }
}

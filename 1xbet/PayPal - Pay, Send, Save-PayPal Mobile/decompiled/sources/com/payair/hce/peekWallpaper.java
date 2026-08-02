package com.payair.hce;

/* loaded from: classes4.dex */
public final class peekWallpaper extends com.payair.hce.deleteDatabase {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char[] getProfileVersion;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = (b2 * 2) + 107;
        int i4 = (b * 4) + 1;
        int i5 = 4 - (i * 4);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            i3 = i5;
            int i6 = i4;
            i2 = 0;
            i5++;
            i3 += -i6;
            bArr2[i2] = (byte) i3;
            i2++;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i5];
            i5++;
            i3 += -i6;
            bArr2[i2] = (byte) i3;
            i2++;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i2++;
            if (i2 == i4) {
            }
        }
    }

    public peekWallpaper(com.payair.hce.sendOrderedBroadcast sendorderedbroadcast, com.payair.hce.getPackageResourcePath getpackageresourcepath, java.lang.String str, com.payair.hce.deleteFile deletefile, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        super(sendorderedbroadcast, getpackageresourcepath, str, deletefile, deletesharedpreferences);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.AlternateContactlessPaymentDataJson);
        sb.append(com.payair.hce.removeStickyBroadcast.IccPrivateKeyCrtComponentsJson);
        this.AlternateContactlessPaymentDataJson = sb.toString();
    }

    @Override // com.payair.hce.deleteDatabase
    final com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest values() {
        int i = RecordsJson + 11;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r0.DigitizedCardProfile() != 200) goto L9;
     */
    @Override // com.payair.hce.deleteDatabase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeReplace() {
        com.payair.hce.equals DigitizedCardProfile;
        boolean z;
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 19;
        RecordsJson = i % 128;
        try {
            if (i % 2 == 0) {
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.valueOf;
                DigitizedCardProfile = ((com.payair.hce.hashCode) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, 905350733, -905350733, java.lang.System.identityHashCode(sendorderedbroadcast))).DigitizedCardProfile(com.payair.hce.component6.valueOf, this.AlternateContactlessPaymentDataJson, null, this.IccPrivateKeyCrtComponentsJson);
                if (DigitizedCardProfile.DigitizedCardProfile() != 3445) {
                    if (DigitizedCardProfile.DigitizedCardProfile() != 204) {
                        z = false;
                    }
                }
                z = true;
            } else {
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.valueOf;
                DigitizedCardProfile = ((com.payair.hce.hashCode) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, 905350733, -905350733, java.lang.System.identityHashCode(sendorderedbroadcast2))).DigitizedCardProfile(com.payair.hce.component6.valueOf, this.AlternateContactlessPaymentDataJson, null, this.IccPrivateKeyCrtComponentsJson);
            }
            if (!z) {
                DigitizedCardProfile(DigitizedCardProfile);
                return;
            }
            SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 35) % 128;
            if (!AlternateContactlessPaymentDataJson(DigitizedCardProfile)) {
                this.DigitizedCardProfile.DigitizedCardProfile(new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getGpoResponse, new com.payair.hce.fileList(null, this.values)));
                int i2 = RecordsJson + 53;
                SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{0, 23, 0, 18}, "\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001", true, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(new int[]{23, 29, 33, 14}, null, true, objArr2);
            this.DigitizedCardProfile.writeReplace(new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getGpoResponse, new com.payair.hce.fileList(this.values, intern, ((java.lang.String) objArr2[0]).intern())), ((java.lang.Integer) com.payair.hce.deleteDatabase.AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -462338634, 462338634, java.lang.System.identityHashCode(this))).intValue());
        } catch (com.payair.hce.VisaReperso e) {
            com.payair.hce.getDatabasePath getdatabasepath = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getGpoResponse, new com.payair.hce.fileList(this.values, e.writeReplace(), e.getMessage()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath, e}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath));
            this.DigitizedCardProfile.writeReplace(getdatabasepath, ((java.lang.Integer) com.payair.hce.deleteDatabase.AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -462338634, 462338634, java.lang.System.identityHashCode(this))).intValue());
        } catch (com.payair.hce.component5 e2) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(new int[]{0, 23, 0, 18}, "\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001", true, objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(new int[]{52, 31, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 6}, "\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001", false, objArr4);
            com.payair.hce.getDatabasePath getdatabasepath2 = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getGpoResponse, new com.payair.hce.fileList(this.values, intern2, ((java.lang.String) objArr4[0]).intern()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath2, e2}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath2));
            this.DigitizedCardProfile.writeReplace(getdatabasepath2, ((java.lang.Integer) com.payair.hce.deleteDatabase.AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -462338634, 462338634, java.lang.System.identityHashCode(this))).intValue());
        }
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        java.lang.String str2 = str;
        int i = 2;
        byte[] bArr = str2;
        if (str2 != null) {
            int i2 = $11 + 17;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        byte b = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = getProfileVersion;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 35;
                $10 = i9 % 128;
                if (i9 % i != 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i4];
                        objArr2[b] = java.lang.Integer.valueOf(cArr[i8]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 2807 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(b, b) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(b, b) == 0L ? 0 : -1))));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            b(b, b, (byte) 1, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[b], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                        }
                        cArr2[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr[i8])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2807 - (android.os.Process.myPid() >> 22), (char) android.view.View.MeasureSpec.getMode(0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(0, (byte) 0, (byte) 1, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj2);
                    }
                    cArr2[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i8++;
                }
                i = 2;
                b = 0;
                i4 = 1;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        java.lang.System.arraycopy(cArr, i3, cArr3, 0, i5);
        if (bArr2 != null) {
            char[] cArr4 = new char[i5];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i5) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 44, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 2836, (char) (android.os.Process.getGidForName("") + 1));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b(0, (byte) 0, (byte) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr4[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2880, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        b(0, (byte) 0, (byte) 2, objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj4);
                    }
                    cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr10 = {getaccounttype, getaccounttype};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 212 - android.view.KeyEvent.normalizeMetaState(0), (char) android.graphics.Color.argb(0, 0, 0, 0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i12 = i5 - i7;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i12, i7);
            java.lang.System.arraycopy(cArr5, i7, cArr3, 0, i12);
        }
        if (z) {
            int i13 = $10 + 61;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr6 = new char[i5];
            int i15 = 0;
            while (true) {
                getaccounttype.writeReplace = i15;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                cArr6[getaccounttype.writeReplace] = cArr3[(i5 - getaccounttype.writeReplace) - 1];
                i15 = getaccounttype.writeReplace + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i16 = 0;
            while (true) {
                getaccounttype.writeReplace = i16;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                i16 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        RecordsJson = 1;
        getProfileVersion = new char[]{16865, 16792, 16768, 16770, 16768, 16772, 16780, 16776, 16773, 16799, 16799, 16771, 16768, 16775, 16799, 16795, 16777, 16773, 16796, 16798, 16798, 16796, 16773, 16712, 16730, 16705, 16734, 16735, 16730, 16712, 16733, 16783, 16811, 16768, 16826, 16800, 16810, 16769, 16724, 16731, 16735, 16704, 16712, 16783, 16730, 16708, 16783, 16716, 16731, 16716, 16715, 16783, 16730, 16613, 16619, 16618, 16613, 16583, 16700, 16581, 16595, 16620, 16622, 16594, 16692, 16588, 16615, 16689, 16692, 16616, 16616, 16594, 16618, 16610, 16618, 16692, 16674, 16584, 16578, 16580, 16702, 16591, 16621};
    }

    static void init$0() {
        $$a = new byte[]{106, 94, -55, -52};
        $$b = 33;
    }
}

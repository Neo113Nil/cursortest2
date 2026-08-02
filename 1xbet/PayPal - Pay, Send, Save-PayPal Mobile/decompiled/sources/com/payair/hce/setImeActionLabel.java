package com.payair.hce;

/* loaded from: classes4.dex */
public final class setImeActionLabel extends com.payair.hce.setEms {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getGpoResponse;
    private static char getProfileVersion;
    private com.payair.hce.setHeight AlternateContactlessPaymentDataJson;
    private com.payair.hce.setEms DigitizedCardProfile;
    private int valueOf;
    private com.payair.hce.setEms values;
    private com.payair.hce.setHorizontallyScrolling writeReplace;

    private static void b(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3 = (b * 2) + 4;
        byte[] bArr = $$a;
        int i4 = 110 - (i2 * 3);
        int i5 = i * 2;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = (-i4) + i5;
            i3++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i4 = (-bArr[i3]) + i4;
            i3++;
            i6 = i7;
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    public setImeActionLabel(com.payair.hce.setHintTextColor sethinttextcolor) {
        int i;
        com.payair.hce.setEms setems = (com.payair.hce.setEms) valueOf(new java.lang.Object[]{sethinttextcolor, 0}, -975105096, 975105096, 0);
        if (setems instanceof com.payair.hce.setHeight) {
            this.AlternateContactlessPaymentDataJson = (com.payair.hce.setHeight) setems;
            setems = (com.payair.hce.setEms) valueOf(new java.lang.Object[]{sethinttextcolor, 1}, -975105096, 975105096, 1);
            i = 1;
        } else {
            i = 0;
        }
        if (setems instanceof com.payair.hce.setHorizontallyScrolling) {
            this.writeReplace = (com.payair.hce.setHorizontallyScrolling) setems;
            i++;
            setems = (com.payair.hce.setEms) valueOf(new java.lang.Object[]{sethinttextcolor, java.lang.Integer.valueOf(i)}, -975105096, 975105096, i);
        }
        if (!(setems instanceof com.payair.hce.setFocusedSearchResultIndex)) {
            this.DigitizedCardProfile = setems;
            i++;
            setems = (com.payair.hce.setEms) valueOf(new java.lang.Object[]{sethinttextcolor, java.lang.Integer.valueOf(i)}, -975105096, 975105096, i);
        }
        if (((java.lang.Integer) com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor}, -1832970438, 1832970438, java.lang.System.identityHashCode(sethinttextcolor))).intValue() != i + 1) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("쬽⤟䀻\ue72b㳴頓毠䢮䒍䴃흈᫃\uf2cb\u17fdభǠ\uef38≑搕啕鼊㇀", 22 - android.view.View.getDefaultSize(0, 0), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (!(setems instanceof com.payair.hce.setFocusedSearchResultIndex)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("鰁Ɒ\uf2cb\u17fd霏蹉鼊㇀⨓\uf19b뵕睝㾹䃚䒍䴃\ude24략荟⠇ｻ䞵狓ʉ翖\ue3ba毠䢮䒍䴃흈᫃ጯ豁℉埀섎瑠䒍䴃貓לꂃ㋃Ṓ⤪mꪚ\ufdce듊㳴頓\ue48f꪿\uf257腩\uf2cb\u17fdꖒ屖\ue45b탎쬽ꔋ믑䧸䅁桧恏또㴨ል᯲\udff8伢ƞ\uea28㏗\ue133蝆", 79 - (android.os.Process.myTid() >> 22), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        com.payair.hce.setFocusedSearchResultIndex setfocusedsearchresultindex = (com.payair.hce.setFocusedSearchResultIndex) setems;
        AlternateContactlessPaymentDataJson(setfocusedsearchresultindex.values());
        this.values = setfocusedsearchresultindex.valueOf();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setHintTextColor sethinttextcolor = (com.payair.hce.setHintTextColor) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i = getGpoResponse + 21;
        getAid = i % 128;
        if (i % 2 == 0) {
            if (((java.lang.Integer) com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor}, -1832970438, 1832970438, java.lang.System.identityHashCode(sethinttextcolor))).intValue() <= intValue) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a("ኅᖹꖒ屖렙湚퐥\ue803뵕睝㾹䃚䒍䴃끽䪣쬽⤟狓ʉ蟿꤉丗\ue8bcꃝ㶢羙䄋ኅᖹ讌\udde5", 31 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
            }
            com.payair.hce.setEms aid = ((com.payair.hce.setShadowLayer) com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, java.lang.Integer.valueOf(intValue)}, 1016755526, -1016755525, intValue)).getAid();
            getAid = (getGpoResponse + 9) % 128;
            return aid;
        }
        throw null;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $10;
        $11 = (i2 + 103) % 128;
        if (str != null) {
            int i3 = i2 + 33;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i4 = 58224;
            for (int i5 = 0; i5 < 16; i5++) {
                $11 = ($10 + 43) % 128;
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (getProfileVersion ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                    int i6 = c2 + i4;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 62, 1336 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                        byte b = (byte) ($$a[2] - 1);
                        byte b2 = b;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b, b2, b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (RecordsJson ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
                    int i7 = charValue + i4;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 1335 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.graphics.Color.alpha(0));
                        byte b3 = (byte) ($$a[2] - 1);
                        byte b4 = b3;
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(b3, b4, b4, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i4 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
            cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.os.Process.myPid() >> 22), 3543 - android.graphics.Color.green(0), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    @Override // com.payair.hce.setGravity
    public final int hashCode() {
        int i;
        com.payair.hce.setHeight setheight = this.AlternateContactlessPaymentDataJson;
        if (setheight != null) {
            getAid = (getGpoResponse + 97) % 128;
            i = setheight.hashCode();
            getGpoResponse = (getAid + 105) % 128;
        } else {
            i = 0;
        }
        com.payair.hce.setHorizontallyScrolling sethorizontallyscrolling = this.writeReplace;
        if (sethorizontallyscrolling != null) {
            int i2 = getGpoResponse + 17;
            getAid = i2 % 128;
            if (i2 % 2 == 0) {
                i ^= sethorizontallyscrolling.hashCode();
            } else {
                sethorizontallyscrolling.hashCode();
                throw null;
            }
        }
        com.payair.hce.setEms setems = this.DigitizedCardProfile;
        if (setems != null) {
            getAid = (getGpoResponse + 105) % 128;
            i ^= setems.hashCode();
        }
        return i ^ this.values.hashCode();
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        int i = getAid;
        getGpoResponse = (i + 89) % 128;
        getGpoResponse = (i + 115) % 128;
        return true;
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() throws java.io.IOException {
        getAid = (getGpoResponse + 17) % 128;
        int length = getProfileVersion().length;
        int i = getAid + 43;
        getGpoResponse = i % 128;
        if (i % 2 != 0) {
            return length;
        }
        throw null;
    }

    @Override // com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        com.payair.hce.setHeight setheight = this.AlternateContactlessPaymentDataJson;
        if (setheight != null) {
            int i = getAid + 15;
            getGpoResponse = i % 128;
            if (i % 2 == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("뿦ﳏ\uf6a1畧", 4 / (android.view.ViewConfiguration.getJumpTapTimeout() - 63), objArr);
                byteArrayOutputStream.write(setheight.values(((java.lang.String) objArr[0]).intern()));
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a("뿦ﳏ\uf6a1畧", 3 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr2);
                byteArrayOutputStream.write(setheight.values(((java.lang.String) objArr2[0]).intern()));
            }
        }
        com.payair.hce.setHorizontallyScrolling sethorizontallyscrolling = this.writeReplace;
        if (sethorizontallyscrolling != null) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a("뿦ﳏ\uf6a1畧", 3 - android.view.KeyEvent.keyCodeFromString(""), objArr3);
            byteArrayOutputStream.write(sethorizontallyscrolling.values(((java.lang.String) objArr3[0]).intern()));
        }
        com.payair.hce.setEms setems = this.DigitizedCardProfile;
        if (setems != null) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a("뿦ﳏ\uf6a1畧", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 3, objArr4);
            byteArrayOutputStream.write(setems.values(((java.lang.String) objArr4[0]).intern()));
            getGpoResponse = (getAid + 17) % 128;
        }
        com.payair.hce.setTitleMarginStart settitlemarginstart = new com.payair.hce.setTitleMarginStart(true, this.valueOf, this.values);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a("뿦ﳏ\uf6a1畧", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 3, objArr5);
        byteArrayOutputStream.write(settitlemarginstart.values(((java.lang.String) objArr5[0]).intern()));
        setmaxlines.DigitizedCardProfile(32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        if (!(setems instanceof com.payair.hce.setImeActionLabel)) {
            return false;
        }
        if (this == setems) {
            return true;
        }
        com.payair.hce.setImeActionLabel setimeactionlabel = (com.payair.hce.setImeActionLabel) setems;
        com.payair.hce.setHeight setheight = this.AlternateContactlessPaymentDataJson;
        if (setheight != null) {
            int i = getAid + 101;
            getGpoResponse = i % 128;
            if (i % 2 == 0) {
                com.payair.hce.setHeight setheight2 = setimeactionlabel.AlternateContactlessPaymentDataJson;
                throw null;
            }
            com.payair.hce.setHeight setheight3 = setimeactionlabel.AlternateContactlessPaymentDataJson;
            if (setheight3 == null || !setheight3.equals(setheight)) {
                return false;
            }
        }
        com.payair.hce.setHorizontallyScrolling sethorizontallyscrolling = this.writeReplace;
        if (sethorizontallyscrolling != null) {
            int i2 = getAid + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getGpoResponse = i2 % 128;
            if (i2 % 2 == 0) {
                com.payair.hce.setHorizontallyScrolling sethorizontallyscrolling2 = setimeactionlabel.writeReplace;
                throw null;
            }
            com.payair.hce.setHorizontallyScrolling sethorizontallyscrolling3 = setimeactionlabel.writeReplace;
            if (sethorizontallyscrolling3 == null || !sethorizontallyscrolling3.equals(sethorizontallyscrolling)) {
                return false;
            }
        }
        com.payair.hce.setEms setems2 = this.DigitizedCardProfile;
        if (setems2 != null) {
            int i3 = getAid + 101;
            getGpoResponse = i3 % 128;
            if (i3 % 2 == 0) {
                com.payair.hce.setEms setems3 = setimeactionlabel.DigitizedCardProfile;
                throw null;
            }
            com.payair.hce.setEms setems4 = setimeactionlabel.DigitizedCardProfile;
            if (setems4 == null || !setems4.equals(setems2)) {
                return false;
            }
        }
        return this.values.equals(setimeactionlabel.values);
    }

    private void AlternateContactlessPaymentDataJson(int i) {
        if (i >= 0) {
            int i2 = getGpoResponse + 71;
            int i3 = i2 % 128;
            getAid = i3;
            if (i2 % 2 == 0 ? i <= 2 : i <= 3) {
                this.valueOf = i;
                getGpoResponse = (i3 + 37) % 128;
                return;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("쬽⤟̏ᧀ苛ꁉ⨓\uf19b笤脹탯덅萓蹁\ua7cfꨏꃝ㶢抲ῒᆛ㺢梄ꉙ", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        getGpoResponse = 1;
        RecordsJson = (char) 7642;
        IccPrivateKeyCrtComponentsJson = (char) 45518;
        getProfileVersion = (char) 13302;
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 19665;
    }

    static void init$0() {
        $$a = new byte[]{8, -42, 1, 71};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE;
    }

    private static com.payair.hce.setEms values(com.payair.hce.setHintTextColor sethinttextcolor, int i) {
        return (com.payair.hce.setEms) valueOf(new java.lang.Object[]{sethinttextcolor, java.lang.Integer.valueOf(i)}, -975105096, 975105096, i);
    }
}

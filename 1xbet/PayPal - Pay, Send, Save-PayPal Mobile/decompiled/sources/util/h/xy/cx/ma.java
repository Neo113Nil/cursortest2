package util.h.xy.cx;

/* loaded from: classes5.dex */
public final class ma extends util.h.xy.cx.ra {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static long getHighSpeedVideoFpsRangesFor = -7356856616536137527L;
    private static int getHighSpeedVideoSizes;

    @Override // util.h.xy.cx.ra
    /* renamed from: ˋ, reason: contains not printable characters */
    public final /* synthetic */ void mo26102() {
        int i = Camera2StreamConfigurationMap + 21;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        super.mo26102();
        if (i % 2 == 0) {
            throw null;
        }
    }

    public ma(java.lang.String str, java.lang.String str2) {
        super(str, str2);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m26098() throws util.h.xy.da.b {
        int i = getHighResolutionOutputSizeshNQ4ISI + 9;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            m26106();
        } else {
            m26106();
            throw null;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m26099() throws util.h.xy.da.b {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 69) % 128;
        m26109();
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 59) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m26104(byte[] bArr, byte[] bArr2) throws util.h.xy.da.b {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("忢徧쩼儿岹鋴\ue089噲㰃⻣\uf5ef㠺预赸顣螶甈ᆹ㲾挲톇瑷\udf7b캱긗\ud8f3䎾ꨨટ㽹\ue636\u09bb\ue70d莩誾锾䏢\ue790ⴆ烁′䨈퇏\udc5a벸껝琍믌ᤢക", android.view.Gravity.getAbsoluteGravity(0, 0) + 1, objArr);
            throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern(), 10301);
        }
        if (!Camera2StreamConfigurationMap()) {
            Z_(aa_());
        }
        synchronized (this) {
            try {
                java.lang.String str = new java.lang.String(util.h.xy.fa.mb.m26810(bArr));
                android.database.sqlite.SQLiteDatabase aa_ = aa_();
                if (!Camera2StreamConfigurationMap(bArr)) {
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put(m26108(), str);
                    contentValues.put(m26111(), bArr2);
                    aa_.insert(m26110(), null, contentValues);
                } else {
                    android.content.ContentValues contentValues2 = new android.content.ContentValues();
                    contentValues2.put(m26111(), bArr2);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(m26108());
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("릆릻䖿ᵡၳ함", '1' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                    sb.append(((java.lang.String) objArr2[0]).intern());
                    aa_.update(m26110(), contentValues2, sb.toString(), new java.lang.String[]{str});
                }
            } catch (java.lang.Exception unused) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("拍抈㝪霮欣濹⚞懯Ļ펼㎯ྠꖬ灼帱끤䠮\uece4蝹咮\uecb4襦ᤫ拾錨◹薭鶪㞬쉩\u202a㸳\uda7e绰䲲ꊱ纃\u1a8b\ueb1d䝏ᴝ뜕ព\uebcf臅厣눥豨␈\uf000\ude95む좙沉紘핝漛ऍ馛秝Ꮫ", 1 - android.text.TextUtils.indexOf("", "", 0, 0), objArr3);
                throw new util.h.xy.da.b(((java.lang.String) objArr3[0]).intern(), 10803);
            }
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRanges + 111;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoFpsRangesFor ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 99) % 128;
        while (aVar.f2623 < m27721.length) {
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoFpsRangesFor ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    private boolean Camera2StreamConfigurationMap(byte[] bArr) throws util.h.xy.da.b {
        android.database.Cursor cursor;
        java.lang.String str = m26108();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("릆릻䖿ᵡၳ함", 1 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        java.lang.String obj = sb.toString();
        java.lang.String str2 = new java.lang.String(util.h.xy.fa.mb.m26810(bArr));
        try {
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("ｺｋ쀃哇彤", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '/', objArr2);
                cursor = aa_().query(m26110(), new java.lang.String[]{str}, obj, new java.lang.String[]{str2}, null, null, null, ((java.lang.String) objArr2[0]).intern());
                if (cursor != null) {
                    int i = Camera2StreamConfigurationMap + 115;
                    getHighResolutionOutputSizeshNQ4ISI = i % 128;
                    try {
                        if (i % 2 == 0) {
                            cursor.getCount();
                            throw new java.lang.ArithmeticException();
                        }
                        if (cursor.getCount() > 0) {
                            cursor.moveToPosition(0);
                            if (str2.equals(cursor.getString(cursor.getColumnIndex(str)))) {
                                cursor.close();
                                getHighResolutionOutputSizeshNQ4ISI(cursor);
                                int i2 = getHighResolutionOutputSizeshNQ4ISI + 111;
                                Camera2StreamConfigurationMap = i2 % 128;
                                if (i2 % 2 == 0) {
                                    return true;
                                }
                                throw null;
                            }
                        }
                    } catch (android.database.sqlite.SQLiteException unused) {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("拍抈㝪霮欣濹⚞懯Ļ펼㎯ྠꖬ灼帱끤䠮\uece4蝹咮\uecb4襦ᤫ拾錨◹薭鶪㞬쉩\u202a㸳\uda7e绰䲲ꊱ纃\u1a8b\ueb1d䝏ᴝ뜕ព\uebcf臅厣눥豨␈\uf000\ude95む좙沉紘핝漛ऍ馛秝Ꮫ", 1 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr3);
                        throw new util.h.xy.da.b(((java.lang.String) objArr3[0]).intern(), 10804);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        getHighResolutionOutputSizeshNQ4ISI(cursor);
                        throw th;
                    }
                }
                getHighResolutionOutputSizeshNQ4ISI(cursor);
                int i3 = getHighResolutionOutputSizeshNQ4ISI + 91;
                Camera2StreamConfigurationMap = i3 % 128;
                return i3 % 2 != 0;
            } catch (java.lang.Throwable th2) {
                th = th2;
                cursor = null;
            }
        } catch (android.database.sqlite.SQLiteException unused2) {
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m26097() throws util.h.xy.da.b {
        java.lang.Object obj;
        synchronized (this) {
            android.database.Cursor cursor = null;
            try {
                try {
                    if (Camera2StreamConfigurationMap()) {
                        android.database.sqlite.SQLiteDatabase aa_ = aa_();
                        int i = Camera2StreamConfigurationMap + 23;
                        getHighResolutionOutputSizeshNQ4ISI = i % 128;
                        if (i % 2 == 0) {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("滊溚쓏ꝰ㍁鱼ᛳ㦥ഃ⁘Ε埱ꦧ菶湌\ue87c䐣\u1f4e쫙೯\ue0b6竨⥕ꅳ齣홒뗑엠㮧㇠ၴ春", -android.text.TextUtils.indexOf("", com.google.common.base.Ascii.MAX, 1), objArr);
                            obj = objArr[0];
                        } else {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("滊溚쓏ꝰ㍁鱼ᛳ㦥ഃ⁘Ε埱ꦧ菶湌\ue87c䐣\u1f4e쫙೯\ue0b6竨⥕ꅳ齣홒뗑엠㮧㇠ၴ春", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr2);
                            obj = objArr2[0];
                        }
                        cursor = aa_.rawQuery(((java.lang.String) obj).intern(), null);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("❣✧㷵꽒ᑱ敆ởẂ䓇\ud977\u0bd8烧\ue027竪昵콠ඩ\ue60b싔⯵ꤺ菤⅙虢훗", 1 - android.view.KeyEvent.keyCodeFromString(""), objArr3);
                        sb.append(((java.lang.String) objArr3[0]).intern());
                        sb.append(m26110());
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("뮂뮹뤡朘닪", 1 - android.view.KeyEvent.normalizeMetaState(0), objArr4);
                        sb.append(((java.lang.String) objArr4[0]).intern());
                        aa_.execSQL(sb.toString());
                        cursor.close();
                    }
                } catch (android.database.sqlite.SQLiteException unused) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("拍抈㝪霮欣濹⚞懯Ļ펼㎯ྠꖬ灼帱끤䠮\uece4蝹咮\uecb4襦ᤫ拾錨◹薭鶪㞬쉩\u202a㸳\uda7e绰䲲ꊱ纃\u1a8b\ueb1d䝏ᴝ뜕ព\uebcf臅厣눥豨␈\uf000\ude95む좙沉紘핝漛ऍ馛秝Ꮫ", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr5);
                    throw new util.h.xy.da.b(((java.lang.String) objArr5[0]).intern(), 10806);
                }
            } finally {
                getHighResolutionOutputSizeshNQ4ISI(cursor);
            }
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public final java.util.List<byte[]> m26100() throws util.h.xy.da.b {
        int count;
        synchronized (this) {
            android.database.Cursor cursor = null;
            if (Camera2StreamConfigurationMap()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                try {
                    try {
                        cursor = aa_().query(m26110(), new java.lang.String[]{m26108()}, null, null, null, null, null);
                        if (cursor != null && (count = cursor.getCount()) > 0) {
                            int i = 0;
                            while (i < count) {
                                cursor.moveToPosition(i);
                                arrayList.add(util.h.xy.fa.mb.m26811(cursor.getString(cursor.getColumnIndex(m26108())).getBytes()));
                                i++;
                                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 107) % 128;
                            }
                        }
                        getHighResolutionOutputSizeshNQ4ISI(cursor);
                        int i2 = Camera2StreamConfigurationMap + 83;
                        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                        if (i2 % 2 != 0) {
                            return arrayList;
                        }
                        throw new java.lang.ArithmeticException();
                    } catch (android.database.sqlite.SQLiteException unused) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("拍抈㝪霮欣濹⚞懯Ļ펼㎯ྠꖬ灼帱끤䠮\uece4蝹咮\uecb4襦ᤫ拾錨◹薭鶪㞬쉩\u202a㸳\uda7e绰䲲ꊱ纃\u1a8b\ueb1d䝏ᴝ뜕ព\uebcf臅厣눥豨␈\uf000\ude95む좙沉紘핝漛ऍ馛秝Ꮫ", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr);
                        throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern(), 10807);
                    }
                } catch (java.lang.Throwable th) {
                    getHighResolutionOutputSizeshNQ4ISI(cursor);
                    throw th;
                }
            }
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 91) % 128;
            return null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m26101(byte[] bArr) throws util.h.xy.da.b {
        android.database.Cursor cursor;
        int i = getHighResolutionOutputSizeshNQ4ISI + 101;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            android.database.Cursor cursor2 = null;
            if (bArr == null || bArr.length == 0 || !Camera2StreamConfigurationMap()) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m26108());
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("릆릻䖿ᵡၳ함", 1 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            java.lang.String obj = sb.toString();
            java.lang.String str = new java.lang.String(util.h.xy.fa.mb.m26810(bArr));
            try {
                try {
                    android.database.sqlite.SQLiteDatabase aa_ = aa_();
                    java.lang.String str2 = m26110();
                    java.lang.String[] strArr = {m26111()};
                    java.lang.String[] strArr2 = {str};
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("ｺｋ쀃哇彤", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr2);
                    cursor = aa_.query(true, str2, strArr, obj, strArr2, null, null, null, ((java.lang.String) objArr2[0]).intern());
                    if (cursor != null) {
                        int i2 = getHighResolutionOutputSizeshNQ4ISI + 31;
                        Camera2StreamConfigurationMap = i2 % 128;
                        try {
                            if (i2 % 2 == 0) {
                                if (cursor.getCount() > 0) {
                                    cursor.moveToFirst();
                                    byte[] blob = cursor.getBlob(0);
                                    cursor.close();
                                    getHighResolutionOutputSizeshNQ4ISI(cursor);
                                    return blob;
                                }
                            } else {
                                cursor.getCount();
                                throw new java.lang.NullPointerException();
                            }
                        } catch (android.database.sqlite.SQLiteException unused) {
                            cursor2 = cursor;
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("拍抈㝪霮欣濹⚞懯Ļ펼㎯ྠꖬ灼帱끤䠮\uece4蝹咮\uecb4襦ᤫ拾錨◹薭鶪㞬쉩\u202a㸳\uda7e绰䲲ꊱ纃\u1a8b\ueb1d䝏ᴝ뜕ព\uebcf臅厣눥豨␈\uf000\ude95む좙沉紘핝漛ऍ馛秝Ꮫ", 1 - android.view.KeyEvent.normalizeMetaState(0), objArr3);
                            throw new util.h.xy.da.b(((java.lang.String) objArr3[0]).intern(), 10808);
                        } catch (java.lang.Throwable th) {
                            th = th;
                            getHighResolutionOutputSizeshNQ4ISI(cursor);
                            throw th;
                        }
                    }
                    getHighResolutionOutputSizeshNQ4ISI(cursor);
                    return null;
                } catch (android.database.sqlite.SQLiteException unused2) {
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                cursor = cursor2;
            }
        } else {
            throw new java.lang.ArithmeticException();
        }
    }

    private boolean Camera2StreamConfigurationMap() throws util.h.xy.da.b {
        if (aa_() != null) {
            try {
                try {
                    java.lang.String str = m26110();
                    android.database.sqlite.SQLiteDatabase aa_ = aa_();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("鏒鎁儳\uf20a䪩গ䎄䁏\uf015떦团⸆咻ᘓ㬫釄뤘誨龅甭ᷢ\uef15簧\ud890戯䎖\ue0b7밧욧ꐏ䔭ᾀ⬫ᢘ⧺茧辺糓踴曉\uec56텦犛쩸炟㖣흉귰픟陸뮆ᅥ㧅દᠷ\uf4d2鸢漢ﲜ塹\ue287쏫慃㮫", -android.widget.ExpandableListView.getPackedPositionChild(0L), objArr);
                    android.database.Cursor rawQuery = aa_.rawQuery(((java.lang.String) objArr[0]).intern(), new java.lang.String[]{str});
                    if (rawQuery != null) {
                        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 107) % 128;
                        int count = rawQuery.getCount();
                        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 5) % 128;
                        for (int i = 0; i < count; i++) {
                            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 83) % 128;
                            rawQuery.moveToPosition(i);
                            java.lang.String string = rawQuery.getString(0);
                            if (string != null && string.equals(str)) {
                                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 109) % 128;
                                getHighResolutionOutputSizeshNQ4ISI(rawQuery);
                                return true;
                            }
                        }
                    }
                    getHighResolutionOutputSizeshNQ4ISI(rawQuery);
                } catch (android.database.sqlite.SQLiteException unused) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("拍抈㝪霮欣濹⚞懯Ļ펼㎯ྠꖬ灼帱끤䠮\uece4蝹咮\uecb4襦ᤫ拾錨◹薭鶪㞬쉩\u202a㸳\uda7e绰䲲ꊱ纃\u1a8b\ueb1d䝏ᴝ뜕ព\uebcf臅厣눥豨␈\uf000\ude95む좙沉紘핝漛ऍ馛秝Ꮫ", 1 - android.text.TextUtils.getTrimmedLength(""), objArr2);
                    throw new util.h.xy.da.b(((java.lang.String) objArr2[0]).intern(), 10809);
                }
            } catch (java.lang.Throwable th) {
                getHighResolutionOutputSizeshNQ4ISI((android.database.Cursor) null);
                throw th;
            }
        }
        return false;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m26103(byte[] bArr) throws util.h.xy.da.b {
        if (bArr == null || !Camera2StreamConfigurationMap()) {
            return;
        }
        try {
            synchronized (this) {
                byte[] m26101 = m26101(bArr);
                if (m26101 != null && m26101.length > 0) {
                    byte[] bArr2 = new byte[m26101.length];
                    util.h.xy.cy.ma.m26113(bArr2);
                    m26104(bArr, bArr2);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(m26108());
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("릆릻䖿ᵡၳ함", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr);
                    sb.append(((java.lang.String) objArr[0]).intern());
                    aa_().delete(m26110(), sb.toString(), new java.lang.String[]{new java.lang.String(util.h.xy.fa.mb.m26810(bArr))});
                }
            }
        } catch (android.database.sqlite.SQLiteException unused) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("拍抈㝪霮欣濹⚞懯Ļ펼㎯ྠꖬ灼帱끤䠮\uece4蝹咮\uecb4襦ᤫ拾錨◹薭鶪㞬쉩\u202a㸳\uda7e绰䲲ꊱ纃\u1a8b\ueb1d䝏ᴝ뜕ព\uebcf臅厣눥豨␈\uf000\ude95む좙沉紘핝漛ऍ馛秝Ꮫ", 1 - android.view.KeyEvent.keyCodeFromString(""), objArr2);
            throw new util.h.xy.da.b(((java.lang.String) objArr2[0]).intern(), 10810);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final boolean m26105(android.content.Context context) throws util.h.xy.da.b {
        if (m26107(context)) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 33) % 128;
            m26106();
            boolean Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
            mo26102();
            return Camera2StreamConfigurationMap2;
        }
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
        return false;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(android.database.Cursor cursor) {
        if (cursor != null) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 19) % 128;
            if (cursor.isClosed()) {
                return;
            }
            cursor.close();
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
        }
    }
}

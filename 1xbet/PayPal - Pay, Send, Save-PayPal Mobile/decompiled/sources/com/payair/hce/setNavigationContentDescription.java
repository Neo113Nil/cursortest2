package com.payair.hce;

/* loaded from: classes4.dex */
final class setNavigationContentDescription extends com.payair.hce.setNavigationOnClickListener {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static final byte[] AlternateContactlessPaymentDataJson;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static long valueOf;
    private final int DigitizedCardProfile;
    private int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (b * 2) + 117;
        byte[] bArr = $$d;
        int i5 = 1 - (b2 * 4);
        int i6 = 4 - (i * 3);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i4;
            i4 = i5;
            i3 = 0;
            i6++;
            i4 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i6];
            i6++;
            i4 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        writeReplace();
        AlternateContactlessPaymentDataJson = new byte[0];
        RecordsJson = (IccPrivateKeyCrtComponentsJson + 85) % 128;
    }

    setNavigationContentDescription(java.io.InputStream inputStream, int i) {
        super(inputStream, i);
        if (i < 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("⬝ꯘ㹙\u07ba⭳ⱍ㇞逋㒩ఁᆏ끏ᒽ泄煜킄琺䲜儑\uf0d9吽굆냖ᄞ뗽贉邕ㅆ闲\ueddf\uf05c冎", android.text.TextUtils.indexOf("", "", 0), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        this.DigitizedCardProfile = i;
        this.writeReplace = i;
        if (i == 0) {
            AlternateContactlessPaymentDataJson();
        }
    }

    @Override // com.payair.hce.setNavigationOnClickListener
    final int values() {
        int i = (RecordsJson + 59) % 128;
        IccPrivateKeyCrtComponentsJson = i;
        int i2 = this.writeReplace;
        int i3 = i + 19;
        RecordsJson = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(valueOf ^ (-3824242241614154557L), charArray, i);
        getcardholdervalidator.valueOf = 4;
        $11 = ($10 + 103) % 128;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            $10 = ($11 + 109) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(valueOf)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '\b', 1920 - android.os.Process.getGidForName(""), (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, (byte) 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 27, 430 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 31610));
                    byte b = (byte) ($$e & 7);
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(b, b2, b2, objArr5);
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

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        IccPrivateKeyCrtComponentsJson = (RecordsJson + 107) % 128;
        if (this.writeReplace == 0) {
            return -1;
        }
        int read = this.values.read();
        if (read < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("巈\uf381쵭䅹嶌琴싋횉䉤呔\ue2a3\uf68e戼㒙舭", android.view.View.resolveSizeAndState(0, 0, 0), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(this.DigitizedCardProfile);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("筘ꚓ昞솤筸ℌ榜嘞擽ŀ䧊瘔䒬憑⤋ᚚ⑻䇂ॊ㛑мꁃ\ue89c휍\ue5b8", (-1) - android.os.Process.getGidForName(""), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(this.writeReplace);
            throw new java.io.EOFException(sb.toString());
        }
        int i = this.writeReplace - 1;
        this.writeReplace = i;
        if (i != 0) {
            return read;
        }
        int i2 = IccPrivateKeyCrtComponentsJson + 9;
        RecordsJson = i2 % 128;
        if (i2 % 2 == 0) {
            AlternateContactlessPaymentDataJson();
            return read;
        }
        AlternateContactlessPaymentDataJson();
        throw null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        RecordsJson = (IccPrivateKeyCrtComponentsJson + 117) % 128;
        int i3 = this.writeReplace;
        if (i3 == 0) {
            return -1;
        }
        int read = this.values.read(bArr, i, java.lang.Math.min(i2, i3));
        if (read < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("巈\uf381쵭䅹嶌琴싋횉䉤呔\ue2a3\uf68e戼㒙舭", (-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(this.DigitizedCardProfile);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("筘ꚓ昞솤筸ℌ榜嘞擽ŀ䧊瘔䒬憑⤋ᚚ⑻䇂ॊ㛑мꁃ\ue89c휍\ue5b8", android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(this.writeReplace);
            throw new java.io.EOFException(sb.toString());
        }
        int i4 = this.writeReplace - read;
        this.writeReplace = i4;
        if (i4 == 0) {
            AlternateContactlessPaymentDataJson();
            RecordsJson = (IccPrivateKeyCrtComponentsJson + 113) % 128;
        }
        return read;
    }

    final byte[] DigitizedCardProfile() throws java.io.IOException {
        int i = IccPrivateKeyCrtComponentsJson + 47;
        int i2 = i % 128;
        RecordsJson = i2;
        if (i % 2 == 0) {
            int i3 = this.writeReplace;
            if (i3 != 0) {
                byte[] bArr = new byte[i3];
                int intValue = i3 - ((java.lang.Integer) com.payair.hce.handleIntentOnMainThread.AlternateContactlessPaymentDataJson(new java.lang.Object[]{this.values, bArr}, -2008715526, 2008715529, (int) java.lang.System.currentTimeMillis())).intValue();
                this.writeReplace = intValue;
                if (intValue != 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a("巈\uf381쵭䅹嶌琴싋횉䉤呔\ue2a3\uf68e戼㒙舭", android.view.View.resolveSizeAndState(0, 0, 0), objArr);
                    sb.append(((java.lang.String) objArr[0]).intern());
                    sb.append(this.DigitizedCardProfile);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a("筘ꚓ昞솤筸ℌ榜嘞擽ŀ䧊瘔䒬憑⤋ᚚ⑻䇂ॊ㛑мꁃ\ue89c휍\ue5b8", android.text.TextUtils.indexOf("", "", 0, 0), objArr2);
                    sb.append(((java.lang.String) objArr2[0]).intern());
                    sb.append(this.writeReplace);
                    throw new java.io.EOFException(sb.toString());
                }
                AlternateContactlessPaymentDataJson();
                IccPrivateKeyCrtComponentsJson = (RecordsJson + 25) % 128;
                return bArr;
            }
            int i4 = i2 + 99;
            IccPrivateKeyCrtComponentsJson = i4 % 128;
            if (i4 % 2 != 0) {
                return AlternateContactlessPaymentDataJson;
            }
            throw null;
        }
        throw new java.lang.ArithmeticException();
    }

    static void init$0() {
        $$d = new byte[]{108, -62, 108, 66};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE;
    }

    static void writeReplace() {
        valueOf = -4974144714917153997L;
    }
}

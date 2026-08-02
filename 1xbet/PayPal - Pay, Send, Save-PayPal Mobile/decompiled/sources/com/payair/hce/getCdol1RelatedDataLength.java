package com.payair.hce;

/* loaded from: classes4.dex */
public final class getCdol1RelatedDataLength {
    static final java.lang.reflect.Type[] valueOf = new java.lang.reflect.Type[0];

    private static java.lang.reflect.WildcardType getProfileVersion(java.lang.reflect.Type type) {
        java.lang.reflect.Type[] typeArr;
        if (type instanceof java.lang.reflect.WildcardType) {
            typeArr = ((java.lang.reflect.WildcardType) type).getUpperBounds();
        } else {
            typeArr = new java.lang.reflect.Type[]{type};
        }
        return new com.payair.hce.getCdol1RelatedDataLength.DigitizedCardProfile(typeArr, valueOf);
    }

    private static java.lang.reflect.WildcardType IccPrivateKeyCrtComponentsJson(java.lang.reflect.Type type) {
        java.lang.reflect.Type[] typeArr;
        if (type instanceof java.lang.reflect.WildcardType) {
            typeArr = ((java.lang.reflect.WildcardType) type).getLowerBounds();
        } else {
            typeArr = new java.lang.reflect.Type[]{type};
        }
        return new com.payair.hce.getCdol1RelatedDataLength.DigitizedCardProfile(new java.lang.reflect.Type[]{java.lang.Object.class}, typeArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.payair.hce.getCdol1RelatedDataLength$AlternateContactlessPaymentDataJson] */
    public static java.lang.reflect.Type writeReplace(java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) type;
            if (cls.isArray()) {
                cls = new com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(writeReplace(cls.getComponentType()));
            }
            return cls;
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
            return new com.payair.hce.getCdol1RelatedDataLength.valueOf(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return new com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(((java.lang.reflect.GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof java.lang.reflect.WildcardType)) {
            return type;
        }
        java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
        return new com.payair.hce.getCdol1RelatedDataLength.DigitizedCardProfile(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static final class DigitizedCardProfile implements java.io.Serializable, java.lang.reflect.WildcardType {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char AlternateContactlessPaymentDataJson;
        private static char RecordsJson;
        private static int getAid;
        private static int getProfileVersion;
        private static char valueOf;
        private static char writeReplace;
        private final java.lang.reflect.Type DigitizedCardProfile;
        private final java.lang.reflect.Type values;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(byte b, int i, short s, java.lang.Object[] objArr) {
            int i2;
            int i3;
            int i4 = s + 4;
            int i5 = 718 - (b * 653);
            byte[] bArr = $$a;
            int i6 = (i * 34) + 1;
            char[] cArr = new char[i6];
            if (bArr == null) {
                int i7 = i4;
                i3 = 0;
                i5 = (i5 + (-i4)) - 2;
                i4 = i7;
                i2 = i3;
                int i8 = i4 + 1;
                i3 = i2 + 1;
                cArr[i2] = (char) i5;
                if (i3 == i6) {
                    objArr[0] = new java.lang.String(cArr);
                    return;
                }
                i7 = i8;
                i4 = bArr[i8];
                i5 = (i5 + (-i4)) - 2;
                i4 = i7;
                i2 = i3;
                int i82 = i4 + 1;
                i3 = i2 + 1;
                cArr[i2] = (char) i5;
                if (i3 == i6) {
                }
            } else {
                i2 = 0;
                int i822 = i4 + 1;
                i3 = i2 + 1;
                cArr[i2] = (char) i5;
                if (i3 == i6) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(byte b, short s, byte b2, java.lang.Object[] objArr) {
            int i;
            int i2 = b2 * 3;
            int i3 = 3 - (b * 3);
            int i4 = 110 - (s * 3);
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[i2 + 1];
            if (bArr == null) {
                int i5 = i2;
                i = 0;
                i4 += i5;
                i3++;
                bArr2[i] = (byte) i4;
                if (i == i2) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i5 = bArr[i3];
                i++;
                i4 += i5;
                i3++;
                bArr2[i] = (byte) i4;
                if (i == i2) {
                }
            } else {
                i = 0;
                i3++;
                bArr2[i] = (byte) i4;
                if (i == i2) {
                }
            }
        }

        public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
            return values(objArr);
        }

        private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
            int i2 = $10 + 101;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            char[] charArray = str != null ? str.toCharArray() : str;
            com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
            char[] cArr = new char[charArray.length];
            getproducttype.AlternateContactlessPaymentDataJson = 0;
            char[] cArr2 = new char[2];
            while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
                $10 = ($11 + 121) % 128;
                cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
                cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
                int i3 = 58224;
                for (int i4 = 0; i4 < 16; i4++) {
                    $11 = ($10 + 35) % 128;
                    char c = cArr2[1];
                    char c2 = cArr2[0];
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (writeReplace ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(RecordsJson)};
                        int i5 = c2 + i3;
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1334 - android.os.Process.getGidForName(""), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            c((byte) 0, (short) 0, (byte) 0, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                        }
                        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        cArr2[1] = charValue;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (AlternateContactlessPaymentDataJson ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(valueOf)};
                        int i6 = charValue + i3;
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - android.text.TextUtils.getCapsMode("", 0, 0), android.graphics.Color.blue(0) + 1335, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            c((byte) 0, (short) 0, (byte) 0, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                        }
                        cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                        i3 -= 40503;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
                cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
                java.lang.Object[] objArr6 = {getproducttype, getproducttype};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 53, 3543 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            }
            objArr[0] = new java.lang.String(cArr, 0, i);
        }

        public DigitizedCardProfile(java.lang.reflect.Type[] typeArr, java.lang.reflect.Type[] typeArr2) {
            if (typeArr2.length <= 1) {
                if (typeArr.length == 1) {
                    if (typeArr2.length == 1) {
                        com.payair.hce.getCdol1RelatedDataLength.DigitizedCardProfile(typeArr2[0]);
                        if (typeArr[0] == java.lang.Object.class) {
                            this.DigitizedCardProfile = com.payair.hce.getCdol1RelatedDataLength.writeReplace(typeArr2[0]);
                            this.values = java.lang.Object.class;
                            return;
                        }
                        throw new java.lang.IllegalArgumentException();
                    }
                    com.payair.hce.getCdol1RelatedDataLength.DigitizedCardProfile(typeArr[0]);
                    this.DigitizedCardProfile = null;
                    this.values = com.payair.hce.getCdol1RelatedDataLength.writeReplace(typeArr[0]);
                    return;
                }
                throw new java.lang.IllegalArgumentException();
            }
            throw new java.lang.IllegalArgumentException();
        }

        @Override // java.lang.reflect.WildcardType
        public final java.lang.reflect.Type[] getUpperBounds() {
            java.lang.reflect.Type[] typeArr;
            int i = getProfileVersion + 67;
            int i2 = i % 128;
            getAid = i2;
            if (i % 2 != 0) {
                typeArr = new java.lang.reflect.Type[1];
                typeArr[1] = this.values;
            } else {
                typeArr = new java.lang.reflect.Type[]{this.values};
            }
            int i3 = i2 + 59;
            getProfileVersion = i3 % 128;
            if (i3 % 2 != 0) {
                return typeArr;
            }
            throw null;
        }

        @Override // java.lang.reflect.WildcardType
        public final java.lang.reflect.Type[] getLowerBounds() {
            int i = getAid;
            getProfileVersion = (i + 9) % 128;
            java.lang.reflect.Type type = this.DigitizedCardProfile;
            if (type == null) {
                java.lang.reflect.Type[] typeArr = com.payair.hce.getCdol1RelatedDataLength.valueOf;
                int i2 = getProfileVersion + 11;
                getAid = i2 % 128;
                if (i2 % 2 == 0) {
                    return typeArr;
                }
                throw null;
            }
            int i3 = i + 65;
            getProfileVersion = i3 % 128;
            if (i3 % 2 != 0) {
                return new java.lang.reflect.Type[]{type};
            }
            java.lang.reflect.Type[] typeArr2 = new java.lang.reflect.Type[0];
            typeArr2[1] = type;
            return typeArr2;
        }

        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
            com.payair.hce.getCdol1RelatedDataLength.DigitizedCardProfile digitizedCardProfile = (com.payair.hce.getCdol1RelatedDataLength.DigitizedCardProfile) objArr[0];
            java.lang.Object obj = objArr[1];
            if (obj instanceof java.lang.reflect.WildcardType) {
                int i = getAid + 1;
                getProfileVersion = i % 128;
                java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) obj;
                if (i % 2 == 0) {
                    com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(digitizedCardProfile, wildcardType);
                    throw null;
                }
                if (com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(digitizedCardProfile, wildcardType)) {
                    getProfileVersion = (getAid + 5) % 128;
                    return java.lang.Boolean.TRUE;
                }
            }
            return java.lang.Boolean.FALSE;
        }

        public final int hashCode() {
            int i;
            int i2 = getAid + 5;
            getProfileVersion = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            java.lang.reflect.Type type = this.DigitizedCardProfile;
            if (type != null) {
                i = type.hashCode() + 31;
                getProfileVersion = (getAid + 21) % 128;
            } else {
                i = 1;
            }
            return i ^ (this.values.hashCode() + 31);
        }

        public final java.lang.String toString() {
            int i = getAid + 43;
            getProfileVersion = i % 128;
            if (i % 2 != 0) {
                if (this.DigitizedCardProfile != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("? super ");
                    sb.append(com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(this.DigitizedCardProfile));
                    java.lang.String obj = sb.toString();
                    getProfileVersion = (getAid + 33) % 128;
                    return obj;
                }
                if (this.values == java.lang.Object.class) {
                    return com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION;
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("? extends ");
                sb2.append(com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(this.values));
                return sb2.toString();
            }
            throw new java.lang.ArithmeticException();
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getAid = 0;
            getProfileVersion = 1;
            AlternateContactlessPaymentDataJson = (char) 21046;
            valueOf = (char) 56137;
            writeReplace = (char) 40136;
            RecordsJson = (char) 16045;
        }

        static void init$1() {
            $$d = new byte[]{76, 91, 9, -2};
            $$e = 110;
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x067c, code lost:
        
            if ((r4 % 2) != 0) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x06bb, code lost:
        
            if (r5 != false) goto L88;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0335 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0336 A[Catch: all -> 0x08f6, TRY_ENTER, TryCatch #2 {all -> 0x08f6, blocks: (B:23:0x0336, B:25:0x0345, B:26:0x0389, B:30:0x0438, B:32:0x0479, B:33:0x04c9, B:67:0x077e, B:69:0x07c7, B:70:0x0816, B:49:0x0856, B:51:0x089c, B:52:0x08e2, B:104:0x04f1, B:106:0x052c, B:107:0x0579, B:136:0x027f, B:138:0x02d1, B:139:0x031b, B:3:0x000e, B:7:0x0047, B:12:0x00b5, B:18:0x016f, B:111:0x0178, B:113:0x017e, B:114:0x017f, B:9:0x0180, B:116:0x0190, B:123:0x0252, B:126:0x025b, B:128:0x0261, B:129:0x0262), top: B:2:0x000e, inners: #8 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0670  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x089c A[Catch: all -> 0x08f6, TryCatch #2 {all -> 0x08f6, blocks: (B:23:0x0336, B:25:0x0345, B:26:0x0389, B:30:0x0438, B:32:0x0479, B:33:0x04c9, B:67:0x077e, B:69:0x07c7, B:70:0x0816, B:49:0x0856, B:51:0x089c, B:52:0x08e2, B:104:0x04f1, B:106:0x052c, B:107:0x0579, B:136:0x027f, B:138:0x02d1, B:139:0x031b, B:3:0x000e, B:7:0x0047, B:12:0x00b5, B:18:0x016f, B:111:0x0178, B:113:0x017e, B:114:0x017f, B:9:0x0180, B:116:0x0190, B:123:0x0252, B:126:0x025b, B:128:0x0261, B:129:0x0262), top: B:2:0x000e, inners: #8 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x06e2  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x06ec A[Catch: Exception -> 0x083c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x083c, blocks: (B:44:0x064d, B:55:0x06bd, B:58:0x06ec, B:61:0x074d, B:77:0x082d, B:78:0x0833, B:79:0x067f, B:82:0x06a9, B:87:0x0835, B:88:0x083b, B:81:0x0689, B:60:0x06f6), top: B:43:0x064d, inners: #0, #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x067f A[Catch: Exception -> 0x083c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x083c, blocks: (B:44:0x064d, B:55:0x06bd, B:58:0x06ec, B:61:0x074d, B:77:0x082d, B:78:0x0833, B:79:0x067f, B:82:0x06a9, B:87:0x0835, B:88:0x083b, B:81:0x0689, B:60:0x06f6), top: B:43:0x064d, inners: #0, #6 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] writeReplace(int i, int i2) {
            java.lang.Object[] objArr;
            java.lang.Object[] objArr2;
            java.lang.String str;
            java.lang.Object obj;
            java.io.File file;
            java.io.File file2;
            java.io.File file3;
            java.lang.String[] strArr;
            int i3;
            int i4;
            int i5 = 16;
            try {
                try {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a("\udf3f漨⾄拝깩롪곸뙹⿍萃Ꮀ\uedc1瑔พ廃脸渉ⓨ謾\ued81", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19, objArr3);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a("뗎㈲\ud958枚=玣\ud8c9⭼⒡ټ⾄拝깩롪곸뙹⿍萃", 18 - (~(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))), objArr4);
                    strArr = new java.lang.String[]{(java.lang.String) objArr3[0], (java.lang.String) objArr4[0]};
                    i3 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (java.lang.Exception unused) {
                objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 2}, null, new int[1]};
                int i6 = ~(437640086 | (~i));
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((((~(r3 | (-437640087))) | ((~((-567288899) | r3)) | 1048578)) | (~(1003880406 | i))) * (-84)) - 480382280) + (((~(i | (-437640087))) | 567288898 | i6) * (-84)) + ((i6 | (-1003880407)) * 84))};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.MotionEvent.axisFromString(""), 2713 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    byte b = $$a[1];
                    byte b2 = (byte) (-b);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(b2, b2, b, objArr6);
                    obj2 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr5)).intValue();
            }
            try {
                while (i3 < 2) {
                    getAid = (getProfileVersion + 115) % 128;
                    java.lang.String str2 = strArr[i3];
                    int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout() >> i5;
                    int i7 = jumpTapTimeout * 881;
                    int i8 = ~jumpTapTimeout;
                    int i9 = (i7 ^ 14096) + ((i7 & 14096) << 1) + (((~((i8 ^ i) | (i8 & i))) | (~(i8 | (-17))) | (~((i ^ (-17)) | (i & (-17))))) * (-880));
                    int i10 = ~i;
                    int i11 = (~((i8 & i10) | (i8 ^ i10))) | i5;
                    int i12 = ~((jumpTapTimeout ^ i) | (jumpTapTimeout & i));
                    int i13 = -(-(((i11 & i12) | (i11 ^ i12)) * (-880)));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a("\ud991꺹鷡咗ﮦ\udc9e䟨듘\ua7cb飥솿➵뭛菑稩丅", (i9 ^ i13) + ((i13 & i9) << 1) + (i12 * 880), objArr7);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    if (((java.lang.Boolean) cls2.getMethod(str2, new java.lang.Class[0]).invoke(cls2, null)).booleanValue()) {
                        getProfileVersion = (getAid + 91) % 128;
                        objArr = new java.lang.Object[]{new int[]{i}, new int[]{(~(i & 1)) & (i | 1)}, null, new int[1]};
                        try {
                            java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-404609303) | i10)) | (~(600319682 | i))) * com.visa.cbp.getCertUsage.getODAData) + 1751976417 + (((~((-404609303) | i)) | (~(i10 | 600319682))) * com.visa.cbp.getCertUsage.getODAData))};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj3 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 50, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2713, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                byte b3 = $$a[1];
                                byte b4 = (byte) (-b3);
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                b(b4, b4, b3, objArr9);
                                obj3 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                            }
                            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr8)).intValue();
                            if (i == ((int[]) objArr[1])[0]) {
                                return objArr;
                            }
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(218021890);
                            if (obj4 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.view.View.resolveSizeAndState(0, 0, 0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2391, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29419));
                                byte b5 = (byte) ($$a[1] + 1);
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                b(b5, b5, r3[23], objArr10);
                                obj4 = cls4.getMethod((java.lang.String) objArr10[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(218021890, obj4);
                            }
                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, null)).longValue();
                            long j = ~longValue;
                            long j2 = i;
                            long j3 = (longValue * 965) + 51368276663L + (((~(j | j2)) | 53341928) * (-964)) + (((~(j | (~j2))) | (~((-53341929) | j))) * (-964)) + 335426025;
                            int i14 = ~i;
                            int i15 = ((int) (j3 >> 32)) & (((((~((-1658300228) | i14)) | r7) * 1150) - 334238508) + (((~(221073816 | i)) | (~((-221073817) | i14))) * (-575)) + (((~((-1658300228) | i)) | (~(1658300227 | i14))) * 575));
                            int i16 = ((int) j3) & ((((~((-48417620) | i14)) | (-1485644030)) * 226) + 2055568080 + (((~(1485644029 | i)) | (-1525672960) | (~((-8388690) | i14))) * (-113)) + ((~((-48417620) | i)) * 113));
                            if (((i15 ^ i16) | (i16 & i15)) == 1) {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{(~(i & 10)) & (i | 10)}, null, new int[1]};
                                java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-159538054) | i14)) | 159406980 | (~(845390931 | i14))) * (-397)) + 444214446 + ((1004666838 | i) * 397))};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj5 == null) {
                                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 50, 2712 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                    byte b6 = $$a[1];
                                    byte b7 = (byte) (-b6);
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    b(b7, b7, b6, objArr12);
                                    obj5 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                }
                                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr11)).intValue();
                            } else {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                                java.lang.Object[] objArr13 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((i14 | (-474)) * (-490)) + 1600905540) + (((~((-440499678) | i)) | 440499204) * 490)) - 1692453976)};
                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj6 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 2713 - android.view.View.MeasureSpec.getMode(0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                    byte b8 = $$a[1];
                                    byte b9 = (byte) (-b8);
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    b(b9, b9, b8, objArr14);
                                    obj6 = cls6.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                                }
                                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr13)).intValue();
                            }
                            if (i != ((int[]) objArr2[1])[0]) {
                                return objArr2;
                            }
                            try {
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                a("䍌疣旓룞\ue079\ue246⿍萃納쩁Ꮖ\uda0e럂慝깩롪\uf32d\ueeb0崭艴ୗꪵ=玣\uf32d\ueeb0㹜綰⠰檛༆뙋\u137f㪟崭艴ୗꪵ⿍萃", 39 - (~(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr15);
                                file3 = new java.io.File((java.lang.String) objArr15[0]);
                            } catch (java.lang.Exception unused2) {
                            }
                            if (file3.canRead()) {
                                java.io.FileReader fileReader = new java.io.FileReader(file3);
                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                                try {
                                    str = bufferedReader.readLine();
                                    int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                                    int i17 = combineMeasuredStates * 471;
                                    int i18 = (~((i ^ (-4)) | (i & (-4)))) | (~((~combineMeasuredStates) | (-4)));
                                    int i19 = (i14 ^ combineMeasuredStates) | (i14 & combineMeasuredStates);
                                    int i20 = ~((i19 ^ 3) | (i19 & 3));
                                    int i21 = (((i17 | 1413) << 1) - (i17 ^ 1413)) + ((combineMeasuredStates | 3) * (-470)) + (((i18 ^ i20) | (i18 & i20)) * (-470));
                                    int i22 = (combineMeasuredStates & (-4)) | (combineMeasuredStates ^ (-4));
                                    int i23 = ~((i22 ^ i) | (i22 & i));
                                    int i24 = combineMeasuredStates | i14;
                                    int i25 = ~((i24 ^ 3) | (i24 & 3));
                                    int i26 = -(-(((i25 ^ i23) | (i23 & i25)) * 470));
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    a("⑂\uea00䲤\uf028", ((i21 | i26) << 1) - (i26 ^ i21), objArr16);
                                    if (!str.equals((java.lang.String) objArr16[0])) {
                                        int i27 = getAid;
                                        getProfileVersion = (((i27 | 59) << 1) - (i27 ^ 59)) % 128;
                                        int i28 = -(-android.widget.ExpandableListView.getPackedPositionChild(0L));
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        a("ᎆꐋ렪⇧龎볆뱞氿卛⬎硤㉸\uf37a꼾俯䏩헖嗉崭艴ୗꪵ䟂㰚༆뙋춼羕냐亂謾\ued81", ((i28 | 32) << 1) - (i28 ^ 32), objArr17);
                                        file = new java.io.File((java.lang.String) objArr17[0]);
                                        if (file.canRead()) {
                                        }
                                        int i29 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                                        a("䍌疣旓룞\ue079\ue246⿍萃納쩁Ꮖ\uda0e럂慝깩롪\uf32d\ueeb0崭艴ୗꪵ=玣\uf32d\ueeb0崭艴ୗꪵ=玣\ueb9c࣊ﵟ\ue0b1", (i29 ^ 37) + ((i29 & 37) << 1), objArr18);
                                        file2 = new java.io.File((java.lang.String) objArr18[0]);
                                        if (file2.canRead()) {
                                        }
                                        java.lang.Object[] objArr19 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                        java.lang.Object[] objArr20 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-637737278) | i14)) | r3) * 1150) - 1303619152) + (((~((-367191708) | i)) | (~(367191707 | i14))) * (-575)) + (((~(i | (-637737278))) | (~(637737277 | i14))) * 575))};
                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj == null) {
                                        }
                                        ((int[]) objArr19[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr20)).intValue();
                                        return objArr19;
                                    }
                                    fileReader.close();
                                    bufferedReader.close();
                                    int i30 = getProfileVersion + 95;
                                    getAid = i30 % 128;
                                    int i31 = i30 % 2;
                                    str = null;
                                    int i282 = -(-android.widget.ExpandableListView.getPackedPositionChild(0L));
                                    java.lang.Object[] objArr172 = new java.lang.Object[1];
                                    a("ᎆꐋ렪⇧龎볆뱞氿卛⬎硤㉸\uf37a꼾俯䏩헖嗉崭艴ୗꪵ䟂㰚༆뙋춼羕냐亂謾\ued81", ((i282 | 32) << 1) - (i282 ^ 32), objArr172);
                                    file = new java.io.File((java.lang.String) objArr172[0]);
                                    if (file.canRead()) {
                                    }
                                    int i292 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    java.lang.Object[] objArr182 = new java.lang.Object[1];
                                    a("䍌疣旓룞\ue079\ue246⿍萃納쩁Ꮖ\uda0e럂慝깩롪\uf32d\ueeb0崭艴ୗꪵ=玣\uf32d\ueeb0崭艴ୗꪵ=玣\ueb9c࣊ﵟ\ue0b1", (i292 ^ 37) + ((i292 & 37) << 1), objArr182);
                                    file2 = new java.io.File((java.lang.String) objArr182[0]);
                                    if (file2.canRead()) {
                                    }
                                    java.lang.Object[] objArr192 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                    java.lang.Object[] objArr202 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-637737278) | i14)) | r3) * 1150) - 1303619152) + (((~((-367191708) | i)) | (~(367191707 | i14))) * (-575)) + (((~(i | (-637737278))) | (~(637737277 | i14))) * 575))};
                                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj == null) {
                                    }
                                    ((int[]) objArr192[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr202)).intValue();
                                    return objArr192;
                                } finally {
                                }
                            }
                            str = null;
                            try {
                                int i2822 = -(-android.widget.ExpandableListView.getPackedPositionChild(0L));
                                java.lang.Object[] objArr1722 = new java.lang.Object[1];
                                a("ᎆꐋ렪⇧龎볆뱞氿卛⬎硤㉸\uf37a꼾俯䏩헖嗉崭艴ୗꪵ䟂㰚༆뙋춼羕냐亂謾\ued81", ((i2822 | 32) << 1) - (i2822 ^ 32), objArr1722);
                                file = new java.io.File((java.lang.String) objArr1722[0]);
                                if (file.canRead()) {
                                    try {
                                        java.lang.String readLine = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                        int i32 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                                        a("믕ﳨ", (i32 ^ 1) + ((i32 & 1) << 1), objArr21);
                                        boolean equals = readLine.equals((java.lang.String) objArr21[0]);
                                        int i33 = getAid;
                                        getProfileVersion = (((i33 | 5) << 1) - (i33 ^ 5)) % 128;
                                    } finally {
                                    }
                                } else {
                                    int i34 = getProfileVersion;
                                    int i35 = (i34 & 51) + (i34 | 51);
                                    getAid = i35 % 128;
                                }
                                int i2922 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                java.lang.Object[] objArr1822 = new java.lang.Object[1];
                                a("䍌疣旓룞\ue079\ue246⿍萃納쩁Ꮖ\uda0e럂慝깩롪\uf32d\ueeb0崭艴ୗꪵ=玣\uf32d\ueeb0崭艴ୗꪵ=玣\ueb9c࣊ﵟ\ue0b1", (i2922 ^ 37) + ((i2922 & 37) << 1), objArr1822);
                                file2 = new java.io.File((java.lang.String) objArr1822[0]);
                                if (file2.canRead()) {
                                    try {
                                        java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file2)).readLine();
                                        int i36 = -android.view.View.MeasureSpec.getMode(0);
                                        int i37 = ((i36 * 495) - 493) + (((i36 ^ (-2)) | (i36 & (-2))) * (-988));
                                        int i38 = ~i36;
                                        int i39 = (i38 ^ 1) | (i38 & 1);
                                        int i40 = ((i39 & i14) | (i39 ^ i14)) * 494;
                                        int i41 = ((i37 | i40) << 1) - (i37 ^ i40);
                                        int i42 = ~((i38 & (-2)) | (i38 ^ (-2)));
                                        int i43 = ~((i14 ^ 1) | (i14 & 1));
                                        int i44 = (i42 & i43) | (i42 ^ i43);
                                        int i45 = ~((i36 ^ 1) | (i36 & 1));
                                        int i46 = -(-(((i45 ^ i44) | (i44 & i45)) * 494));
                                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                                        a("믕ﳨ", (i41 ^ i46) + ((i46 & i41) << 1), objArr22);
                                        if (readLine2.equals((java.lang.String) objArr22[0])) {
                                            int i47 = getProfileVersion;
                                            int i48 = (i47 & 35) + (i47 | 35);
                                            getAid = i48 % 128;
                                            if (i48 % 2 != 0) {
                                                throw null;
                                            }
                                            if (str != null) {
                                                java.lang.Object[] objArr23 = {new int[]{i}, new int[]{(i & (-21)) | (i14 & 20)}, str, new int[1]};
                                                java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((~((-843092889) | i)) * 623) + 313868464 + ((159476800 | i14) * (-623)) + (((~(i | 160656448)) | (~((-844272537) | i)) | 843092888) * 623))};
                                                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj7 == null) {
                                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2713, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                                    byte b10 = $$a[1];
                                                    byte b11 = (byte) (-b10);
                                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                    b(b11, b11, b10, objArr25);
                                                    obj7 = cls7.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                                }
                                                ((int[]) objArr23[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr24)).intValue();
                                                return objArr23;
                                            }
                                        }
                                    } finally {
                                    }
                                } else {
                                    getAid = (getProfileVersion + 63) % 128;
                                }
                            } catch (java.lang.Exception unused3) {
                            }
                            java.lang.Object[] objArr1922 = {new int[]{i}, new int[]{i}, null, new int[1]};
                            java.lang.Object[] objArr2022 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-637737278) | i14)) | r3) * 1150) - 1303619152) + (((~((-367191708) | i)) | (~(367191707 | i14))) * (-575)) + (((~(i | (-637737278))) | (~(637737277 | i14))) * 575))};
                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj == null) {
                                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 50, 2712 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.view.MotionEvent.axisFromString("") + 1));
                                byte b12 = $$a[1];
                                byte b13 = (byte) (-b12);
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                b(b13, b13, b12, objArr26);
                                obj = cls8.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                            }
                            ((int[]) objArr1922[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2022)).intValue();
                            return objArr1922;
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    }
                    int i49 = (i3 & (-93)) - 93;
                    i3 = (i49 | 94) + (i49 & 94);
                    i5 = 16;
                }
                java.lang.Object[] objArr27 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((((~(r3 | (-496358364))) | ((~((-508570622) | r3)) | 470811609)) | (~(534117375 | i))) * (-84)) - 480382280) + (((~((-496358364) | i)) | 508570621 | i4) * (-84)) + ((i4 | (-534117376)) * 84))};
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj8 == null) {
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 50, android.graphics.Color.red(0) + 2713, (char) android.text.TextUtils.indexOf("", "", 0, 0));
                    byte b14 = $$a[1];
                    byte b15 = (byte) (-b14);
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    b(b15, b15, b14, objArr28);
                    obj8 = cls9.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr27)).intValue();
                if (i == ((int[]) objArr[1])[0]) {
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
            i4 = ~(496358363 | (~i));
        }

        static void init$0() {
            $$a = new byte[]{18, -1, 36, -56, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
            $$b = 100;
        }

        public final boolean equals(java.lang.Object obj) {
            return ((java.lang.Boolean) values(new java.lang.Object[]{this, obj}, 399296971, -399296971, java.lang.System.identityHashCode(this))).booleanValue();
        }
    }

    public static final class AlternateContactlessPaymentDataJson implements java.io.Serializable, java.lang.reflect.GenericArrayType {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char[] AlternateContactlessPaymentDataJson;
        private static char DigitizedCardProfile;
        private static int getAid;
        private static int getProfileVersion;
        private static int valueOf;
        private static long writeReplace;
        private final java.lang.reflect.Type values;

        private static void a(int i, short s, byte b, java.lang.Object[] objArr) {
            int i2 = (i * 2) + 4;
            int i3 = 718 - s;
            byte[] bArr = $$a;
            int i4 = b * 2;
            char[] cArr = new char[35 - i4];
            int i5 = 34 - i4;
            int i6 = -1;
            if (bArr == null) {
                i2++;
                i3 = (i2 + i5) - 2;
            }
            while (true) {
                int i7 = i3;
                int i8 = i2;
                i6++;
                cArr[i6] = (char) i7;
                if (i6 == i5) {
                    objArr[0] = new java.lang.String(cArr);
                    return;
                } else {
                    i2 = i8 + 1;
                    i3 = (i7 + bArr[i8]) - 2;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void d(int i, short s, short s2, java.lang.Object[] objArr) {
            int i2;
            int i3;
            byte[] bArr = $$d;
            int i4 = i * 3;
            int i5 = (s2 * 3) + 4;
            byte[] bArr2 = new byte[1 - i4];
            int i6 = 0 - i4;
            if (bArr == null) {
                int i7 = i6;
                i3 = i5;
                i2 = 0;
                i5 += -i7;
                i3++;
                bArr2[i2] = (byte) i5;
                if (i2 == i6) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i2++;
                i7 = bArr[i3];
                i5 += -i7;
                i3++;
                bArr2[i2] = (byte) i5;
                if (i2 == i6) {
                }
            } else {
                i2 = 0;
                i5 = 111 - s;
                i3 = i5;
                bArr2[i2] = (byte) i5;
                if (i2 == i6) {
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static void b(java.lang.String str, char c, java.lang.String str2, java.lang.String str3, int i, java.lang.Object[] objArr) {
            char[] cArr;
            char c2;
            $10 = ($11 + 43) % 128;
            char[] charArray = str3 != null ? str3.toCharArray() : str3;
            if (str2 != 0) {
                cArr = str2.toCharArray();
                $10 = ($11 + 37) % 128;
            } else {
                cArr = str2;
            }
            char[] cArr2 = cArr;
            char[] charArray2 = str != null ? str.toCharArray() : str;
            com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
            int length = charArray2.length;
            char[] cArr3 = new char[length];
            int length2 = charArray.length;
            char[] cArr4 = new char[length2];
            java.lang.System.arraycopy(charArray2, 0, cArr3, 0, length);
            java.lang.System.arraycopy(charArray, 0, cArr4, 0, length2);
            cArr3[0] = (char) (cArr3[0] ^ c);
            char c3 = 2;
            cArr4[2] = (char) (cArr4[2] + ((char) i));
            int length3 = cArr2.length;
            char[] cArr5 = new char[length3];
            getwalletdata.writeReplace = 0;
            while (getwalletdata.writeReplace < length3) {
                $11 = ($10 + 81) % 128;
                try {
                    java.lang.Object[] objArr2 = {getwalletdata};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 72, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1178, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(0, $$d[c3], (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    java.lang.Object[] objArr4 = {getwalletdata};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 30, android.view.MotionEvent.axisFromString("") + 3444, (char) (3831 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)))).getMethod("g", java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                    java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr3[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                    if (obj3 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.view.View.resolveSize(0, 0), android.view.KeyEvent.getDeadChar(0, 0) + 1864, (char) (41774 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        d(0, (short) 6, (short) 0, objArr6);
                        obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                    java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                    if (obj4 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 28, 3134 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) android.text.TextUtils.indexOf("", ""));
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        d(0, (short) 5, (short) 0, objArr8);
                        c2 = 2;
                        obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                    } else {
                        c2 = 2;
                    }
                    cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                    cArr3[intValue2] = getwalletdata.values;
                    cArr5[getwalletdata.writeReplace] = (char) ((((cArr3[intValue2] ^ cArr2[getwalletdata.writeReplace]) ^ (writeReplace ^ 1263759066225628708L)) ^ ((int) (valueOf ^ 1263759066225628708L))) ^ ((char) (DigitizedCardProfile ^ 1263759066225628708L)));
                    getwalletdata.writeReplace++;
                    c3 = c2;
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

        /* JADX WARN: Code restructure failed: missing block: B:58:0x00ec, code lost:
        
            if (r0[r1.writeReplace] == 1) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01ec A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:13:0x0038, B:15:0x004f, B:16:0x0093, B:38:0x00f5, B:40:0x0112, B:41:0x0155, B:44:0x01d9, B:46:0x01ec, B:48:0x0227, B:52:0x016c, B:54:0x018a, B:55:0x01c6), top: B:12:0x0038 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0227 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(java.lang.String str, boolean z, int[] iArr, java.lang.Object[] objArr) {
            char c;
            java.lang.Object obj;
            int length;
            char[] cArr;
            char[] cArr2;
            java.lang.String str2 = str;
            byte[] bArr = str2;
            if (str2 != null) {
                bArr = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
            int i = iArr[0];
            int i2 = 1;
            int i3 = iArr[1];
            int i4 = iArr[2];
            char c2 = 3;
            int i5 = iArr[3];
            char[] cArr3 = AlternateContactlessPaymentDataJson;
            if (cArr3 != null) {
                int i6 = $11 + 53;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    length = cArr3.length;
                    cArr = new char[length];
                } else {
                    length = cArr3.length;
                    cArr = new char[length];
                }
                int i7 = 0;
                while (i7 < length) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i2];
                        objArr2[0] = java.lang.Integer.valueOf(cArr3[i7]);
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                        if (obj2 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 29, android.view.View.resolveSizeAndState(0, 0, 0) + 2807, (char) android.view.View.resolveSize(0, 0));
                            byte b = (byte) (-$$d[c2]);
                            cArr2 = cArr3;
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            d(0, b, (byte) (b - 2), objArr3);
                            obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj2);
                        } else {
                            cArr2 = cArr3;
                        }
                        cArr[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).charValue();
                        i7++;
                        cArr3 = cArr2;
                        i2 = 1;
                        c2 = 3;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                $10 = ($11 + 37) % 128;
                cArr3 = cArr;
            }
            char[] cArr4 = new char[i3];
            java.lang.System.arraycopy(cArr3, i, cArr4, 0, i3);
            if (bArr2 != null) {
                $11 = ($10 + 11) % 128;
                char[] cArr5 = new char[i3];
                getaccounttype.writeReplace = 0;
                char c3 = 0;
                while (getaccounttype.writeReplace < i3) {
                    int i8 = $11 + 75;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        if (bArr2[getaccounttype.writeReplace] == 0) {
                            c = 1;
                            int i9 = getaccounttype.writeReplace;
                            char c4 = cArr4[getaccounttype.writeReplace];
                            java.lang.Object[] objArr4 = new java.lang.Object[2];
                            objArr4[c] = java.lang.Integer.valueOf(c3);
                            objArr4[0] = java.lang.Integer.valueOf(c4);
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                            if (obj3 == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('\\' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2884 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                byte length2 = (byte) $$d.length;
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                d(0, length2, (byte) (length2 - 4), objArr5);
                                obj3 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                            }
                            cArr5[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).charValue();
                            c3 = cArr5[getaccounttype.writeReplace];
                            java.lang.Object[] objArr6 = {getaccounttype, getaccounttype};
                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                            if (obj != null) {
                                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 212 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj);
                            }
                            ((java.lang.reflect.Method) obj).invoke(null, objArr6);
                        }
                        int i10 = getaccounttype.writeReplace;
                        java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c3)};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 43, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2880, (char) android.view.View.MeasureSpec.getMode(0));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            d(0, (short) 0, (short) 0, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj4);
                        }
                        cArr5[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                        c3 = cArr5[getaccounttype.writeReplace];
                        java.lang.Object[] objArr62 = {getaccounttype, getaccounttype};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                        if (obj != null) {
                        }
                        ((java.lang.reflect.Method) obj).invoke(null, objArr62);
                    } else {
                        c = 1;
                    }
                }
                cArr4 = cArr5;
            }
            if (i5 > 0) {
                char[] cArr6 = new char[i3];
                java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i3);
                int i11 = i3 - i5;
                java.lang.System.arraycopy(cArr6, 0, cArr4, i11, i5);
                java.lang.System.arraycopy(cArr6, i5, cArr4, 0, i11);
            }
            if (z) {
                $10 = ($11 + 51) % 128;
                char[] cArr7 = new char[i3];
                getaccounttype.writeReplace = 0;
                while (getaccounttype.writeReplace < i3) {
                    cArr7[getaccounttype.writeReplace] = cArr4[(i3 - getaccounttype.writeReplace) - 1];
                    getaccounttype.writeReplace++;
                    int i12 = $11 + 61;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 5 / 3;
                    }
                }
                cArr4 = cArr7;
            }
            if (i4 > 0) {
                $11 = ($10 + 27) % 128;
                getaccounttype.writeReplace = 0;
                while (getaccounttype.writeReplace < i3) {
                    cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                    getaccounttype.writeReplace++;
                }
            }
            objArr[0] = new java.lang.String(cArr4);
        }

        public AlternateContactlessPaymentDataJson(java.lang.reflect.Type type) {
            this.values = com.payair.hce.getCdol1RelatedDataLength.writeReplace(type);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final java.lang.reflect.Type getGenericComponentType() {
            int i = (getAid + 115) % 128;
            getProfileVersion = i;
            java.lang.reflect.Type type = this.values;
            int i2 = i + 69;
            getAid = i2 % 128;
            if (i2 % 2 != 0) {
                return type;
            }
            throw new java.lang.ArithmeticException();
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof java.lang.reflect.GenericArrayType)) {
                return false;
            }
            int i = getProfileVersion + 29;
            getAid = i % 128;
            java.lang.reflect.GenericArrayType genericArrayType = (java.lang.reflect.GenericArrayType) obj;
            if (i % 2 != 0) {
                if (!com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(this, genericArrayType)) {
                    return false;
                }
                int i2 = getAid;
                getProfileVersion = (i2 + 97) % 128;
                int i3 = i2 + 43;
                getProfileVersion = i3 % 128;
                if (i3 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(this, genericArrayType);
            throw null;
        }

        public final int hashCode() {
            getAid = (getProfileVersion + 89) % 128;
            int hashCode = this.values.hashCode();
            getProfileVersion = (getAid + 21) % 128;
            return hashCode;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(this.values));
            sb.append(okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            java.lang.String obj = sb.toString();
            getAid = (getProfileVersion + 23) % 128;
            return obj;
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getProfileVersion = 0;
            getAid = 1;
            writeReplace = -5679015549812391976L;
            valueOf = -804334044;
            DigitizedCardProfile = (char) 54820;
            AlternateContactlessPaymentDataJson = new char[]{16854, 16783, 16714, 16715, 16716, 16713, 16708, 16735, 16726, 16776, 16730, 16730, 16731, 16723, 16724, 16735, 16893, 16811, 16813, 16804, 16802, 16805, 16826, 16803, 16805, 16886, 16801, 16831, 16831, 16802, 16717, 16576, 16882, 16824, 16788, 16815, 16821, 16822, 16816, 16818, 16816, 16821, 16886, 16831, 16830, 16804, 16810, 16807, 16803, 16802, 16806, 16810, 16805, 16802, 16888, 16802, 16806, 16810, 16805, 16805, 16805, 16830, 16800, 16831, 16830, 16804, 16810, 16807, 16782, 16820, 16822, 16718, 16817, 16826, 16827, 16706, 16600, 16576, 16581, 16583, 16581, 16578, 16576, 16604, 16580, 16582, 16605, 16605, 16603, 16606, 16576, 16598, 16576, 16577, 16598, 16887, 16826, 16731, 16620, 16593, 16621, 16616, 16616, 16615, 16617, 16621, 16585, 16582, 16613, 16620, 16620, 16610, 16610, 16853, 16769, 16800, 16804, 16806, 16804, 16810, 16812, 16807, 16829, 16821, 16699, 16677, 16682, 16680, 16675, 16700, 16698, 16696, 16672, 16641, 16792, 16742, 16743, 16745, 16748, 16750, 16726, 16721, 16748, 16723, 16724, 16725, 16748, 16751, 16751, 16887, 16807, 16815, 16807, 16805, 16830, 16828, 16831, 16826, 16801, 16803, 16806, 16809, 16829, 16705, 16621, 16615, 16621, 16595, 16589, 16580, 16609, 16609, 16580, 16589, 16619, 16580, 16580, 16619, 16623, 16621, 16618, 16612, 16609, 16578, 16589, 16620, 16811, 16676, 16578, 16581, 16586, 16682, 16674, 16585, 16589, 16586, 16683, 16674, 16576, 16587, 16587, 16577, 16577, 16857, 16775, 16810, 16803, 16857, 16799, 16824, 16824, 16829, 16802, 16807, 16768, 16774, 16811, 16805, 16782, 16748, 16757, 16760, 16754, 16721, 16748, 16649, 16649, 16650, 16755, 16756, 16890, 16811, 16803, 16797, 16768, 16807, 16802, 16829, 16824, 16824, 16799, 16768, 16889, 16807, 16807, 16807, 16803, 16796, 16768, 16805, 16811, 16774, 16798, 16857, 16799, 16804, 16811, 16805, 16742, 16658, 16675, 16656, 16894, 16809, 16800, 16805, 16808, 16807, 16803, 16800, 16807, 16813, 16800, 16893, 16804, 16805, 16805, 16800, 16831, 16829, 16892, 16802, 16829, 16831, 16804, 16805, 16828, 16800, 16800, 16829, 16799, 16798, 16824, 16824, 16798, 16798, 16830, 16801, 16831, 16807, 16814, 16812, 16813, 16793, 16640, 16677, 16683, 16675, 16669, 16643, 16680, 16684, 16679, 16675, 16643, 16646, 16676, 16676, 16684, 16647, 16786, 16728, 16826, 16733, 16766, 16740, 16889, 16768, 16772, 16813, 16811, 16804, 16801, 16804, 16813, 16811, 16772, 16865, 16799, 16824, 16824, 16829, 16802, 16807, 16768, 16774, 16811, 16882, 16724, 16753, 16753, 16754, 16763, 16764, 16729, 16724, 16762, 16732, 16722, 16760, 16736, 16762, 16729, 16807, 16700, 16577, 16583, 16607, 16697, 16700, 16579, 16606, 16601, 16596, 16596, 16699, 16857, 16768, 16805, 16811, 16774, 16796, 16826, 16799, 16887, 16829, 16831, 16831, 16828, 16800, 16768, 16772, 16807, 16806, 16802, 16799, 16775, 16807, 16830, 16831, 16769, 16777, 16706, 16710, 16734, 16824, 16829, 16726, 16726, 16829, 16802, 16704, 16829, 16829, 16704, 16708, 16706, 16707, 16733, 16726, 16827, 16831, 16735, 16891, 16811, 16805, 16805, 16777, 16771, 16808, 16809, 16804, 16772, 16783, 16784, 16803, 16805, 16813, 16812, 16827, 16679, 16657, 16686, 16679};
        }

        static void init$1() {
            $$d = new byte[]{76, 91, 9, -2};
            $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE;
        }

        static void init$0() {
            $$a = new byte[]{69, -73, 121, 3, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10};
            $$b = 161;
        }

        /* JADX WARN: Code restructure failed: missing block: B:126:0x1561, code lost:
        
            if (((r2 ^ r5) | (r5 & r2)) != 477111747) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x1679, code lost:
        
            r2 = r7;
            r3 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x167d, code lost:
        
            if (r2 >= 28) goto L622;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x167f, code lost:
        
            r5 = r30[r2];
            r10 = (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
            r6 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1));
            r8 = (int) java.lang.System.currentTimeMillis();
            r9 = r6 * lib.android.paypal.com.magnessdk.g.e;
            r11 = (r9 & 407) + (r9 | 407);
            r9 = ~((r8 ^ (-2)) | (r8 & (-2)));
            r12 = ~r8;
            r13 = (r12 ^ r6) | (r12 & r6);
            r13 = ~((r13 & 1) | (r13 ^ 1));
            r9 = -(-(((r9 & r13) | (r9 ^ r13)) * (-406)));
            r13 = (r11 ^ r9) + ((r9 & r11) << 1);
            r9 = (r12 ^ (-2)) | (r12 & (-2));
            r9 = (~((r9 & r6) | (r9 ^ r6))) * (-406);
            r15 = new java.lang.Object[1];
            b("\u2d2e\uea0e탬뷖", r10, "Ｂ\uf56a奆沴뮉됄⋸ᔮ䄈멮⨍▸", "\ue9fc\ue78d퍞ꂹ", ((((r13 | r9) << 1) - (r9 ^ r13)) - (~(-(-(((~((~r6) | r8)) | (~(r12 | 1))) * 406))))) - 1, r15);
         */
        /* JADX WARN: Code restructure failed: missing block: B:131:0x16fd, code lost:
        
            r5 = new java.lang.Object[]{((java.lang.String) r15[r7]).concat(java.lang.String.valueOf(r5))};
            r6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
         */
        /* JADX WARN: Code restructure failed: missing block: B:132:0x170e, code lost:
        
            if (r6 != null) goto L141;
         */
        /* JADX WARN: Code restructure failed: missing block: B:133:0x1710, code lost:
        
            r6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(r7) + 20) >> 6) + 36, 3161 - android.text.TextUtils.getCapsMode("", r7, r7), (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33099));
            r11 = new java.lang.Object[1];
            a((byte) (-com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson.$$a[16]), 612, r8[21], r11);
            r8 = (java.lang.String) r11[r7];
            r9 = new java.lang.Class[1];
            r9[r7] = java.lang.String.class;
            r6 = r6.getMethod(r8, r9);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:134:0x1761, code lost:
        
            r5 = ((java.lang.Long) ((java.lang.reflect.Method) r6).invoke(null, r5)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:135:0x176e, code lost:
        
            r8 = (int) java.lang.System.currentTimeMillis();
            r9 = ~r5;
            r11 = r8;
            r13 = ~r11;
            r5 = (((((r5 * (-864)) - 683233153378L) + (((~(r13 | 788952832)) | r9) * (-865))) + ((~((-788952833) | r11)) * 865)) + (((~((-788952833) | r13)) | (~(r9 | r13))) * 865)) + 1784387736;
            r8 = (int) java.lang.System.currentTimeMillis();
            r9 = ~r8;
            r8 = ~(r8 | (-174436951));
            r7 = ((int) (r5 >> 32)) & ((((((~(199735030 | r9)) | 1611663361) | r8) * (-252)) - 445499738) + ((r8 | (~(r9 | 1811398391))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE));
            r6 = (int) java.lang.System.currentTimeMillis();
            r5 = ((int) r5) & ((((((~(527391578 | r6)) | (-2139093855)) * (-140)) + 215763035) + ((~((-1611702277) | r6)) * 70)) + (((~(r6 | (-1964617989))) | (-1786178143)) * 70));
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x17fe, code lost:
        
            if (((r5 ^ r7) | (r5 & r7)) != 0) goto L145;
         */
        /* JADX WARN: Code restructure failed: missing block: B:137:0x1800, code lost:
        
            r5 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x1803, code lost:
        
            r6 = (int) java.lang.System.currentTimeMillis();
            r7 = r5 * (-501);
            r8 = r3 * 503;
            r9 = (r7 & r8) + (r7 | r8);
            r7 = ~r3;
            r8 = ~(r7 | r6);
            r3 = ~((r3 & r5) | (r5 ^ r3));
            r3 = -(-(((r3 ^ r8) | (r8 & r3)) * (-502)));
            r8 = (r9 & r3) + (r3 | r9);
            r3 = (~r6) | r7;
            r3 = -(-((~((r3 ^ r5) | (r3 & r5))) * (-502)));
            r5 = ~r5;
            r3 = (((~((r5 ^ r6) | (r5 & r6))) | r7) * 502) + (((r8 | r3) << 1) - (r3 ^ r8));
            r5 = ((r2 | 27) << 1) - (r2 ^ 27);
            r2 = ((r5 | (-26)) << 1) - (r5 ^ (-26));
            r7 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:140:0x1802, code lost:
        
            r5 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:144:0x1858, code lost:
        
            if (r3 < 25.2d) goto L159;
         */
        /* JADX WARN: Code restructure failed: missing block: B:145:0x185a, code lost:
        
            r1 = new java.lang.Object[]{new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, null, new int[1]};
            r2 = (int) java.lang.System.currentTimeMillis();
            r3 = ~r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:146:0x187a, code lost:
        
            r5 = new java.lang.Object[]{-2062849474, 16, java.lang.Integer.valueOf((((((~((-62883975) | r3)) | 33982470) * (-108)) + 1955467239) + (((~(r3 | 772209494)) | ((~((-772209495) | r2)) | (-801110999))) * 54)) + ((r2 | (-801110999)) * 54))};
            r2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
         */
        /* JADX WARN: Code restructure failed: missing block: B:147:0x18cb, code lost:
        
            if (r2 != null) goto L153;
         */
        /* JADX WARN: Code restructure failed: missing block: B:148:0x18cd, code lost:
        
            r2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 50, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2713, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
            r3 = (byte) (com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson.$$a[14] - 1);
            r7 = new java.lang.Object[1];
            a(r3, (short) (r3 | 653), r3, r7);
            r2 = r2.getMethod((java.lang.String) r7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:150:0x192f, code lost:
        
            ((int[]) r1[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r2).invoke(null, r5)).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:151:0x1937, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:159:0x1677, code lost:
        
            if (((r2 ^ r3) | (r3 & r2)) == 477111747) goto L134;
         */
        /* JADX WARN: Code restructure failed: missing block: B:322:0x2f8d, code lost:
        
            com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson.getAid = (r5 + 77) % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:324:0x2f96, code lost:
        
            r3 = (int) java.lang.System.currentTimeMillis();
            r5 = r1 * (-667);
            r1 = ~r1;
            r7 = ~((r1 ^ r3) | (r1 & r3));
            r8 = (((r5 ^ (-1335)) + ((r5 & (-1335)) << 1)) + (((~(r3 | 1)) | r1) * (-668))) + (((r7 & 1) | (r7 ^ 1)) * 1336);
            r3 = (r3 ^ 1) | (r3 & 1);
            r1 = ((r1 ^ r3) | (r3 & r1)) * 668;
            r3 = ((r8 | r1) << 1) - (r1 ^ r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:326:0x2fc4, code lost:
        
            r4.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0680, code lost:
        
            if (((r2 ^ r8) | (r8 & r2)) != 477111747) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0a01, code lost:
        
            if (android.os.Build.VERSION.SDK_INT <= 33) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0a03, code lost:
        
            r2 = (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1));
            r3 = (int) java.lang.System.currentTimeMillis();
            r5 = ((r2 * 141) - 6466104) + (((r3 ^ 23176) | (r3 & 23176)) * 140);
            r6 = ~r2;
            r8 = ~(r6 | 23176);
            r9 = ~r3;
            r10 = ~((r9 & 23176) | (r9 ^ 23176));
            r8 = -(-(((r8 ^ r10) | (r8 & r10)) * (-280)));
            r10 = (r5 & r8) + (r5 | r8);
            r2 = (~((r2 ^ r9) | (r9 & r2))) | (~((r2 & (-23177)) | (r2 ^ (-23177))));
            r5 = (r6 & 23176) | (r6 ^ 23176);
            r3 = ~((r3 ^ r5) | (r5 & r3));
            r2 = -(-(((r2 ^ r3) | (r3 & r2)) * 140));
            r5 = new java.lang.Object[1];
            b("䛘\uda00袈腚", (char) ((r10 & r2) + (r2 | r10)), "뀲\uf0f3丳扝돵힃\uef00ೇ귱ท⻧걄䡾爛\u1af8絰\u1976▦퓎誛Ⓚ\uf69eꣿÇ寈ꯥ饵챈", "\ue9fc\ue78d퍞ꂹ", android.text.TextUtils.indexOf("", ""), r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0a70, code lost:
        
            r3 = new java.lang.Object[]{(java.lang.String) r5[0]};
            r5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0a81, code lost:
        
            if (r5 != null) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0a83, code lost:
        
            r5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 36, android.graphics.Color.alpha(0) + 3161, (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 33099));
            r6 = com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson.$$a;
            r8 = (byte) (r6[14] - 1);
            r11 = new java.lang.Object[1];
            a(r8, r8, (byte) (-r6[16]), r11);
            r5 = r5.getMethod((java.lang.String) r11[0], java.lang.String.class);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:538:0x2fe6, code lost:
        
            if (r4 == null) goto L385;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0ad1, code lost:
        
            r5 = ((java.lang.Long) ((java.lang.reflect.Method) r5).invoke(null, r3)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0ade, code lost:
        
            r3 = (int) java.lang.System.currentTimeMillis();
            r8 = ~r5;
            r10 = r3;
            r13 = ~r10;
            r2 = ((((((-97) * r5) - 17528281350L) + (((~(r8 | r13)) | (~(r8 | (-350565627)))) * 98)) + ((((~(r13 | 350565626)) | r8) | (~((-350565627) | r10))) * (-49))) + (((~((-350565627) | r5)) | (~(r8 | r10))) * 49)) - 987102481;
            r6 = (int) java.lang.System.currentTimeMillis();
            r8 = ~r6;
            r5 = ((int) (r2 >> 32)) & ((((((~(1828362125 | r8)) | (-1029378760)) * (-602)) - 354682524) + ((((~(r6 | 1828362125)) | (-2113640400)) | (~((-744100486) | r8))) * (-301))) + ((~((-1029378760) | r8)) * 301));
            r3 = (int) java.lang.System.currentTimeMillis();
            r6 = ~r3;
            r8 = ~(1884286234 | r3);
            r2 = ((int) r2) & ((((((~((-447059825) | r6)) | r8) * 1150) + 334239082) + ((r8 | (~((-1884286235) | r6))) * (-575))) + (((~(r3 | (-447059825))) | (~(r6 | 447059824))) * 575));
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0b91, code lost:
        
            if (((r2 ^ r5) | (r5 & r2)) != 1) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0c3e, code lost:
        
            com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson.getAid = (com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson.getProfileVersion + 111) % 128;
            r3 = new java.lang.Object[]{new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE}, null, new int[1]};
            r1 = (int) java.lang.System.currentTimeMillis();
            r4 = ~r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0c66, code lost:
        
            r6 = new java.lang.Object[]{-2062849474, 16, java.lang.Integer.valueOf(((((r1 | 606565007) * 614) + 1524176437) + ((((~((-120991785) | r4)) | 69611528) | (~(588333735 | r4))) * (-1228))) + (((~(r4 | (-51380257))) | (~(657945263 | r4))) * 614))};
            r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0cb8, code lost:
        
            if (r1 != null) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0cba, code lost:
        
            r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 2712, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
            r2 = (byte) (com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson.$$a[14] - 1);
            r8 = new java.lang.Object[1];
            a(r2, (short) (r2 | 653), r2, r8);
            r1 = r1.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0d1d, code lost:
        
            ((int[]) r3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r6)).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0d24, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0b95, code lost:
        
            r2 = android.text.TextUtils.getOffsetAfter("", 0);
            r9 = (char) (((33574 | r2) << 1) - (r2 ^ 33574));
            r2 = -android.view.KeyEvent.keyCodeFromString("");
            r3 = new java.lang.Object[1];
            b("\ua7d4ღ⛎嶃", r9, "粽Π硇䝭ꏌ䶎짢肫瞻觸ን镰殺", "\ue9fc\ue78d퍞ꂹ", ((-837753177) ^ r2) + ((r2 & (-837753177)) << 1), r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0bc5, code lost:
        
            r3 = new java.lang.Object[]{(java.lang.String) r3[0]};
            r5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0bd6, code lost:
        
            if (r5 != null) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0bd8, code lost:
        
            r5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 40, 1921 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0));
            r6 = com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson.$$a;
            r8 = (byte) (r6[14] - 1);
            r11 = new java.lang.Object[1];
            a(r8, r8, (byte) (-r6[16]), r11);
            r5 = r5.getMethod((java.lang.String) r11[0], java.lang.String.class);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0c21, code lost:
        
            r3 = ((java.lang.reflect.Method) r5).invoke(null, r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0c28, code lost:
        
            r8 = new java.lang.Object[1];
            c("\u0001", true, new int[]{0, 1, 0, 0}, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0c3c, code lost:
        
            if (r3.equals((java.lang.String) r8[0]) == false) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x07b4, code lost:
        
            if (((r2 & (((((~(1333351850 | r8)) | 103874560) * (-756)) - 334668894) + (((~r8) | 1333351850) * 756))) | (((int) r5) & ((((((~((-319407361) | r6)) | (~((-67117141) | r9))) * 920) - 2038855459) + (((~(1823750910 | r9)) | 319407360) * 920)) + ((((~(r6 | 2143158270)) | (~(r9 | (-319407361)))) | (~((-67117141) | r6))) * 920)))) != 477111747) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x08d4, code lost:
        
            if (((r2 ^ r3) | (r2 & r3)) != (-1032769152)) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x09fb, code lost:
        
            if (((r2 ^ r3) | (r2 & r3)) == 542074309) goto L69;
         */
        /* JADX WARN: Removed duplicated region for block: B:258:0x286e  */
        /* JADX WARN: Removed duplicated region for block: B:265:0x2946  */
        /* JADX WARN: Removed duplicated region for block: B:331:0x2fef  */
        /* JADX WARN: Removed duplicated region for block: B:338:0x30bf  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] writeReplace$466995e3(java.lang.Object obj) {
            int i;
            int i2;
            int i3;
            java.lang.Throwable th;
            java.io.BufferedInputStream bufferedInputStream;
            int i4;
            long j;
            int i5;
            int i6;
            java.lang.Object invoke;
            java.lang.Object[] objArr;
            java.lang.String[] strArr;
            java.lang.Object obj2;
            try {
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
                int i7 = 0;
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.graphics.Color.green(0), 1838 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    byte[] bArr = $$a;
                    byte b = (byte) (bArr[14] - 1);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(b, b, (byte) (-bArr[16]), objArr2);
                    obj3 = cls.getMethod((java.lang.String) objArr2[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, obj3);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, null)).longValue();
                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                long j2 = ~longValue;
                long j3 = currentTimeMillis;
                long j4 = 195489732 | longValue;
                long j5 = (longValue * (-751)) + 146812789483L + (((~(j2 | 195489732)) | (~(j3 | 195489732))) * 1504) + ((~(j4 | j3)) * (-1504)) + (((~((-195489733) | j2)) | (~j4)) * 752) + 1035568678;
                int i8 = ~(((int) java.lang.System.currentTimeMillis()) | (-1994935034));
                int i9 = ((int) (j5 >> 32)) & ((((17110274 | i8) * (-196)) - 280238046) + ((i8 | (-2012045308)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE));
                int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                int i10 = ((int) j5) & ((((135332225 | r8) * (-476)) - 1448488127) + ((~(currentTimeMillis2 | (-10277))) * 952) + ((~((~currentTimeMillis2) | (-10277))) * 476));
                float f = 0.0f;
                int i11 = 2;
                if (((i9 ^ i10) | (i9 & i10)) != 0) {
                    java.lang.Object[] objArr3 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, null, new int[1]};
                    int i12 = ~(((int) java.lang.System.currentTimeMillis()) | 210854946);
                    java.lang.Object[] objArr4 = {-2062849474, 16, java.lang.Integer.valueOf((((90114 | i12) * (-196)) - 1928213545) + ((i12 | 210764832) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj4 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 2713 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.os.Process.myTid() >> 22));
                        byte b2 = (byte) ($$a[14] - 1);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        a(b2, (short) (b2 | 653), b2, objArr5);
                        obj4 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                    }
                    ((int[]) objArr3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr4)).intValue();
                    return objArr3;
                }
                char c = (char) ((-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)) - 1);
                int i13 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                int i14 = i13 * 755;
                int i15 = (i14 & 1764367612) + (i14 | 1764367612);
                int i16 = ~i13;
                int i17 = ~(i16 | (-595539132));
                int i18 = ~(i16 | currentTimeMillis3);
                int i19 = (i17 ^ i18) | (i18 & i17);
                int i20 = ~(((-595539132) ^ currentTimeMillis3) | (currentTimeMillis3 & (-595539132)));
                int i21 = ((i19 ^ i20) | (i19 & i20)) * (-754);
                int i22 = ((-595539132) ^ i16) | (i16 & (-595539132));
                int i23 = ~((i22 ^ currentTimeMillis3) | (i22 & currentTimeMillis3));
                int i24 = ~currentTimeMillis3;
                int i25 = (i24 ^ i13) | (i13 & i24);
                int i26 = ~((i25 & (-595539132)) | (i25 ^ (-595539132)));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b("䌱胋䫜픲", c, "줕\uea84丠鯙\ue5f1罕踈ո搇ᙈᎼ", "\ue9fc\ue78d퍞ꂹ", (((i15 | i21) << 1) - (i15 ^ i21)) + (((i23 & i26) | (i23 ^ i26)) * (-754)) + ((i24 | i16) * 754), objArr6);
                java.lang.Object[] objArr7 = {(java.lang.String) objArr6[0]};
                int i27 = 609763459;
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1921, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    byte[] bArr2 = $$a;
                    byte b3 = (byte) (bArr2[14] - 1);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a(b3, b3, (byte) (-bArr2[16]), objArr8);
                    obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj5);
                }
                java.lang.String str = (java.lang.String) ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
                int i28 = 128;
                if (str != null) {
                    int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout() >> 16;
                    int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                    int i29 = jumpTapTimeout * 71;
                    int i30 = ((-2551965) & i29) + (i29 | (-2551965));
                    int i31 = ~jumpTapTimeout;
                    int i32 = ((~((i31 ^ 36985) | (i31 & 36985))) | (~((currentTimeMillis4 ^ 36985) | (currentTimeMillis4 & 36985)))) * (-140);
                    int i33 = (36985 ^ jumpTapTimeout) | (jumpTapTimeout & 36985);
                    int i34 = ((((i30 | i32) << 1) - (i32 ^ i30)) - (~(-(-((~((i33 ^ currentTimeMillis4) | (i33 & currentTimeMillis4))) * 70))))) - 1;
                    int i35 = (~(36985 | i31)) | (~(((-36986) ^ jumpTapTimeout) | ((-36986) & jumpTapTimeout)));
                    int i36 = ~((jumpTapTimeout ^ currentTimeMillis4) | (jumpTapTimeout & currentTimeMillis4));
                    int i37 = -(-(((i36 ^ i35) | (i35 & i36)) * 70));
                    int i38 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b("輜\udb85礝䖐", (char) ((i34 & i37) + (i37 | i34)), "\ua8df\ud9c4췫ꗽ説窦", "\ue9fc\ue78d퍞ꂹ", (i38 ^ 48) + ((i38 & 48) << 1), objArr9);
                    java.lang.String str2 = (java.lang.String) objArr9[0];
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    b("臝ှ\udb74溍", (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), "\ude91甆㠬診\ude08擢Ⱒ䁻", "\ue9fc\ue78d퍞ꂹ", android.os.Process.myTid() >> 22, objArr10);
                    java.lang.String[] strArr2 = {str2, (java.lang.String) objArr10[0]};
                    int i39 = 0;
                    while (true) {
                        if (i39 >= i11) {
                            break;
                        }
                        if (str.contains(strArr2[i39])) {
                            int i40 = getProfileVersion;
                            getAid = (((i40 | 85) << 1) - (i40 ^ 85)) % i28;
                            char red = (char) android.graphics.Color.red(0);
                            int threadPriority = android.os.Process.getThreadPriority(0);
                            int i41 = -(((threadPriority ^ 20) + ((threadPriority & 20) << 1)) >> 6);
                            int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                            int i42 = i41 * 70;
                            int i43 = (((-519826580) | i42) << 1) - ((-519826580) ^ i42);
                            int i44 = ~i41;
                            int i45 = ~((-955063766) | i44 | currentTimeMillis5);
                            int i46 = (955063765 ^ i41) | (i41 & 955063765);
                            int i47 = ~((i46 ^ currentTimeMillis5) | (i46 & currentTimeMillis5));
                            int i48 = -(-(((i45 ^ i47) | (i45 & i47)) * 69));
                            int i49 = (i43 ^ i48) + ((i48 & i43) << 1);
                            int i50 = (~((i44 & 955063765) | (955063765 ^ i44))) | (~(i44 | currentTimeMillis5));
                            int i51 = ~((currentTimeMillis5 ^ 955063765) | (955063765 & currentTimeMillis5));
                            int i52 = ((i51 ^ i50) | (i51 & i50)) * (-69);
                            int i53 = (i49 ^ i52) + ((i52 & i49) << 1);
                            int i54 = (~((i41 ^ (-955063766)) | ((-955063766) & i41))) * 69;
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            b("핕\ued1dꜸ휏", red, "\ud895ﮆﳟ鸓뷧濯踩톭팻瓞臱㒓䙚鏿篷彺ꮶ\uedd7णᑍ滑왔ᤅ", "\ue9fc\ue78d퍞ꂹ", ((i53 | i54) << 1) - (i54 ^ i53), objArr11);
                            java.lang.Object[] objArr12 = {(java.lang.String) objArr11[0]};
                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(java.lang.Integer.valueOf(i27));
                            if (obj6 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.view.ViewConfiguration.getScrollFriction() > f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == f ? 0 : -1)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1921, (char) (android.util.TypedValue.complexToFraction(0, f, f) > f ? 1 : (android.util.TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)));
                                byte[] bArr3 = $$a;
                                byte b4 = (byte) (bArr3[14] - 1);
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                a(b4, b4, (byte) (-bArr3[16]), objArr13);
                                obj6 = cls4.getMethod((java.lang.String) objArr13[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(java.lang.Integer.valueOf(i27), obj6);
                            }
                            java.lang.Object invoke2 = ((java.lang.reflect.Method) obj6).invoke(null, objArr12);
                            int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
                            int currentTimeMillis6 = (int) java.lang.System.currentTimeMillis();
                            int i55 = doubleTapTimeout * (-496);
                            int i56 = ~doubleTapTimeout;
                            int i57 = ((-12423808) & i55) + (i55 | (-12423808)) + ((~((i56 ^ (-25049)) | (i56 & (-25049)))) * 497);
                            int i58 = i56 | (-25049);
                            int i59 = ~((i58 ^ currentTimeMillis6) | (i58 & currentTimeMillis6));
                            int i60 = ~currentTimeMillis6;
                            int i61 = (i60 ^ (-25049)) | (i60 & (-25049));
                            int i62 = ~((i61 & doubleTapTimeout) | (i61 ^ doubleTapTimeout));
                            int i63 = -(-(((i62 & i59) | (i59 ^ i62)) * 497));
                            int i64 = ~((i56 & i60) | (i56 ^ i60));
                            int i65 = ~((i56 ^ 25048) | (i56 & 25048));
                            int i66 = (doubleTapTimeout ^ (-25049)) | (doubleTapTimeout & (-25049));
                            char c2 = (char) (((((i57 | i63) << 1) - (i63 ^ i57)) - (~(((~((i66 ^ currentTimeMillis6) | (i66 & currentTimeMillis6))) | ((i64 & i65) | (i64 ^ i65))) * 497))) - 1);
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            b("ꈨ緘\u4c361", c2, "᧞\uf3b9蚒⺡뒤Ა\ue02e\uda50檳ꑘᨀ串\ue79e\uf5bd\ude25훦জ⫞꽩ꂁ脩彐ퟲ説ꃸ쪩䒵萡༅䳧", "\ue9fc\ue78d퍞ꂹ", (-2) - (~(-(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))), objArr14);
                            java.lang.Object[] objArr15 = {(java.lang.String) objArr14[0]};
                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(java.lang.Integer.valueOf(i27));
                            if (obj7 == null) {
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39, 1921 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) android.graphics.Color.alpha(0));
                                byte[] bArr4 = $$a;
                                byte b5 = (byte) (bArr4[14] - 1);
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                a(b5, b5, (byte) (-bArr4[16]), objArr16);
                                obj7 = cls5.getMethod((java.lang.String) objArr16[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(java.lang.Integer.valueOf(i27), obj7);
                            }
                            java.lang.Object invoke3 = ((java.lang.reflect.Method) obj7).invoke(null, objArr15);
                            if (invoke2 != null) {
                                java.lang.Object[] objArr17 = new java.lang.Object[i11];
                                objArr17[1] = 42;
                                objArr17[0] = invoke2;
                                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj8 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 28, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2594, (char) android.graphics.Color.green(0));
                                    byte[] bArr5 = $$a;
                                    byte b6 = (byte) (bArr5[14] - 1);
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    a(b6, b6, (byte) (-bArr5[16]), objArr18);
                                    java.lang.String str3 = (java.lang.String) objArr18[0];
                                    java.lang.Class<?>[] clsArr = new java.lang.Class[i11];
                                    clsArr[0] = java.lang.String.class;
                                    clsArr[1] = java.lang.Integer.TYPE;
                                    obj8 = cls6.getMethod(str3, clsArr);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj8);
                                }
                                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj8).invoke(null, objArr17)).longValue();
                                long j6 = (~((int) java.lang.System.currentTimeMillis())) | 644971915;
                                long j7 = (((-494) * longValue2) - 318616126010L) + ((~(longValue2 | 644971915)) * (-495)) + (495 * j6) + (((~((~longValue2) | (-644971916))) | (~j6)) * 495) + 612128609;
                                int currentTimeMillis7 = (int) java.lang.System.currentTimeMillis();
                                int i67 = ~currentTimeMillis7;
                                int i68 = ((int) (j7 >> 32)) & (((1426670848 | currentTimeMillis7) * 988) + 835693766 + (((~((-717632173) | i67)) | 4194308) * (-1976)) + (((~(currentTimeMillis7 | 2140108712)) | 1426670848 | (~(i67 | (-2140108713)))) * 988));
                                int currentTimeMillis8 = (int) java.lang.System.currentTimeMillis();
                                int i69 = ~((-160299470) | currentTimeMillis8);
                                int i70 = ((int) j7) & (((25272321 | i69) * (-814)) + 179301118 + ((i69 | (~((~currentTimeMillis8) | 1276926940)) | 1141899792) * 407) + (((~(currentTimeMillis8 | 160299469)) | 1141899792 | (~((-1276926941) | currentTimeMillis8))) * 407));
                            }
                            if (invoke3 != null) {
                                int i71 = getAid;
                                getProfileVersion = (((i71 | 45) << 1) - (i71 ^ 45)) % 128;
                                java.lang.Object[] objArr19 = new java.lang.Object[i11];
                                objArr19[1] = 42;
                                objArr19[0] = invoke3;
                                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj9 == null) {
                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.widget.ExpandableListView.getPackedPositionType(0L), 2594 - android.graphics.Color.blue(0), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                                    byte[] bArr6 = $$a;
                                    byte b7 = (byte) (bArr6[14] - 1);
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    a(b7, b7, (byte) (-bArr6[16]), objArr20);
                                    java.lang.String str4 = (java.lang.String) objArr20[0];
                                    java.lang.Class<?>[] clsArr2 = new java.lang.Class[i11];
                                    clsArr2[0] = java.lang.String.class;
                                    clsArr2[1] = java.lang.Integer.TYPE;
                                    obj9 = cls7.getMethod(str4, clsArr2);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj9);
                                }
                                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, objArr19)).longValue();
                                int currentTimeMillis9 = (int) java.lang.System.currentTimeMillis();
                                long j8 = ~longValue3;
                                long j9 = ~currentTimeMillis9;
                                obj2 = invoke3;
                                long j10 = ((-493) * longValue3) + 405577999530L + ((j8 | 819349494) * (-988)) + ((longValue3 | (-819349495) | j9) * 494) + (((~(longValue3 | 819349494)) | (~(longValue3 | j9)) | (~(j8 | (-819349495)))) * 494) + 437751030;
                                int i72 = (int) (j10 >> 32);
                                int currentTimeMillis10 = (int) java.lang.System.currentTimeMillis();
                                int currentTimeMillis11 = (int) java.lang.System.currentTimeMillis();
                                int i73 = ~currentTimeMillis11;
                            } else {
                                obj2 = invoke3;
                            }
                            if (invoke2 != null) {
                                int i74 = getProfileVersion;
                                getAid = ((i74 ^ 15) + ((i74 & 15) << 1)) % 128;
                                java.lang.Object[] objArr21 = new java.lang.Object[i11];
                                objArr21[1] = 42;
                                objArr21[0] = invoke2;
                                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj10 == null) {
                                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 28, 2593 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                    byte[] bArr7 = $$a;
                                    byte b8 = (byte) (bArr7[14] - 1);
                                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                                    a(b8, b8, (byte) (-bArr7[16]), objArr22);
                                    java.lang.String str5 = (java.lang.String) objArr22[0];
                                    java.lang.Class<?>[] clsArr3 = new java.lang.Class[i11];
                                    clsArr3[0] = java.lang.String.class;
                                    clsArr3[1] = java.lang.Integer.TYPE;
                                    obj10 = cls8.getMethod(str5, clsArr3);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj10);
                                }
                                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj10).invoke(null, objArr21)).longValue();
                                long currentTimeMillis12 = (int) java.lang.System.currentTimeMillis();
                                long j11 = ~longValue4;
                                long j12 = ((302 * longValue4) - 52644372600L) + ((~(longValue4 | 175481242 | currentTimeMillis12)) * (-301)) + (((~((~currentTimeMillis12) | 175481242)) | (~(j11 | currentTimeMillis12))) * (-301)) + (((~((-175481243) | currentTimeMillis12)) | j11) * 301) + 1081619282;
                                int currentTimeMillis13 = (int) java.lang.System.currentTimeMillis();
                                int i75 = ((int) (j12 >> 32)) & (((((~(729352298 | r5)) | (~((-2128388587) | currentTimeMillis13))) * com.visa.cbp.getCertUsage.getODAData) - 585389193) + (((~(currentTimeMillis13 | 729352298)) | (~((~currentTimeMillis13) | (-2128388587)))) * com.visa.cbp.getCertUsage.getODAData));
                                int currentTimeMillis14 = (int) java.lang.System.currentTimeMillis();
                                int i76 = ((int) j12) & (((((~(2002694151 | currentTimeMillis14)) | 855046734) * 56) - 1486935747) + (((~((~currentTimeMillis14) | 855046734)) | 2002694151) * 56));
                            }
                            if (obj2 != null) {
                                java.lang.Object[] objArr23 = new java.lang.Object[i11];
                                objArr23[1] = 42;
                                objArr23[0] = obj2;
                                java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj11 == null) {
                                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.text.TextUtils.getOffsetBefore("", 0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2594, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                                    byte[] bArr8 = $$a;
                                    byte b9 = (byte) (bArr8[14] - 1);
                                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                                    a(b9, b9, (byte) (-bArr8[16]), objArr24);
                                    java.lang.String str6 = (java.lang.String) objArr24[0];
                                    java.lang.Class<?>[] clsArr4 = new java.lang.Class[i11];
                                    clsArr4[0] = java.lang.String.class;
                                    clsArr4[1] = java.lang.Integer.TYPE;
                                    obj11 = cls9.getMethod(str6, clsArr4);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj11);
                                }
                                long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj11).invoke(null, objArr23)).longValue();
                                long currentTimeMillis15 = (int) java.lang.System.currentTimeMillis();
                                long j13 = ~currentTimeMillis15;
                                long j14 = ((561 * longValue5) - 636012165542L) + ((~(j13 | 1137767738)) * (-560)) + ((~((~longValue5) | 1137767738 | currentTimeMillis15)) * (-560)) + (((~(j13 | longValue5)) | (~(longValue5 | (-1137767739)))) * 560) + 119332786;
                                int currentTimeMillis16 = (int) java.lang.System.currentTimeMillis();
                                int i77 = ~currentTimeMillis16;
                                int i78 = ~((-640818786) | i77);
                                int i79 = ((int) (j14 >> 32)) & ((((~(i77 | 640818785)) | (~((-2078045197) | i77)) | 1506566156 | (~((-69339746) | currentTimeMillis16))) * (-84)) + 1905160562 + (((~(currentTimeMillis16 | 640818785)) | 2078045196 | i78) * (-84)) + ((69339745 | i78) * 84));
                                int currentTimeMillis17 = (int) java.lang.System.currentTimeMillis();
                                int i80 = ((int) j14) & ((((~((-602896201) | currentTimeMillis17)) | 40252168) * 576) + 1771465493 + (((~((~currentTimeMillis17) | (-562644033))) | (-2080374779)) * 576) + 1710412288);
                            }
                        } else {
                            i39 = (i39 | 1) + (i39 & 1);
                            i27 = 609763459;
                            f = 0.0f;
                            i28 = 128;
                            i11 = 2;
                        }
                    }
                }
                java.lang.Object[] objArr25 = new java.lang.Object[1];
                c("\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000", false, new int[]{1, 8, 34, 0}, objArr25);
                java.lang.String str7 = (java.lang.String) objArr25[0];
                java.lang.Object[] objArr26 = new java.lang.Object[1];
                b("苊㉮☫\ueb83", (char) (33574 - (~(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))), "鶡峋\uf612盩澁\uf56f", "\ue9fc\ue78d퍞ꂹ", android.widget.ExpandableListView.getPackedPositionType(0L), objArr26);
                java.lang.String str8 = (java.lang.String) objArr26[0];
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                c("\u0001\u0000\u0001\u0000\u0000\u0000\u0001", true, new int[]{9, 7, 41, 0}, objArr27);
                java.lang.String str9 = (java.lang.String) objArr27[0];
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                c("\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", false, new int[]{16, 9, 0, 0}, objArr28);
                java.lang.String str10 = (java.lang.String) objArr28[0];
                java.lang.Object[] objArr29 = new java.lang.Object[1];
                b("ᨃꚧ홧왊", (char) (19157 - (~android.graphics.drawable.Drawable.resolveOpacity(0, 0))), "宊䀌\udad7讍䥛ܽ", "\ue9fc\ue78d퍞ꂹ", android.view.KeyEvent.getDeadChar(0, 0), objArr29);
                java.lang.String str11 = (java.lang.String) objArr29[0];
                int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
                int currentTimeMillis18 = (int) java.lang.System.currentTimeMillis();
                int i81 = -(-(offsetBefore * 530));
                int i82 = ~((~currentTimeMillis18) | offsetBefore);
                int i83 = ~((59979 ^ offsetBefore) | (59979 & offsetBefore));
                int i84 = ~((offsetBefore ^ currentTimeMillis18) | (offsetBefore & currentTimeMillis18));
                char c3 = (char) (((((((i81 ^ org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO) + ((i81 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO) << 1)) + 31788870) - (~(-(-(((i82 ^ i83) | (i82 & i83)) * 529))))) - 1) - (~(-(-(((i84 ^ (-59980)) | ((-59980) & i84)) * 529))))) - 1);
                int i85 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                java.lang.Object[] objArr30 = new java.lang.Object[1];
                b("↓漵䮋\udcea", c3, "瞆蓧ꏃ켲鉓ڣ倿\uaaff뢷빷᧲京죯", "\ue9fc\ue78d퍞ꂹ", ((-1955646174) & i85) + (i85 | (-1955646174)), objArr30);
                java.lang.String str12 = (java.lang.String) objArr30[0];
                java.lang.Object[] objArr31 = new java.lang.Object[1];
                c("\u0000\u0001\u0001\u0001\u0000", true, new int[]{25, 5, 0, 5}, objArr31);
                java.lang.String str13 = (java.lang.String) objArr31[0];
                int i86 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                java.lang.Object[] objArr32 = new java.lang.Object[1];
                b("\ue615橶횟꯫", (char) ((60374 ^ i86) + ((i86 & 60374) << 1)), "䎲噣\uef6e⟴⟐闠", "\ue9fc\ue78d퍞ꂹ", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, objArr32);
                java.lang.String str14 = (java.lang.String) objArr32[0];
                java.lang.Object[] objArr33 = new java.lang.Object[1];
                c("\u0001\u0000", false, new int[]{30, 2, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 2}, objArr33);
                java.lang.String str15 = (java.lang.String) objArr33[0];
                int i87 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                int currentTimeMillis19 = (int) java.lang.System.currentTimeMillis();
                int i88 = i87 * 980;
                int i89 = ((-8059698) & i88) + (i88 | (-8059698));
                int i90 = ~currentTimeMillis19;
                int i91 = (~((i90 ^ (-8242)) | (i90 & (-8242)))) * 979;
                int i92 = ((i89 | i91) << 1) - (i89 ^ i91);
                int i93 = (i87 | currentTimeMillis19) * (-979);
                int i94 = ((i92 | i93) << 1) - (i93 ^ i92);
                int i95 = ~((currentTimeMillis19 ^ (-8242)) | (currentTimeMillis19 & (-8242)));
                int i96 = ~((i87 ^ i90) | (i87 & i90));
                int i97 = -(-(((i96 ^ i95) | (i96 & i95)) * 979));
                char c4 = (char) ((i94 & i97) + (i97 | i94));
                int i98 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int currentTimeMillis20 = (int) java.lang.System.currentTimeMillis();
                int i99 = i98 * 868;
                int i100 = ~i98;
                int i101 = ~currentTimeMillis20;
                int i102 = ~((i100 ^ i101) | (i100 & i101));
                int i103 = ~((i101 & (-2)) | (i101 ^ (-2)));
                int i104 = (i100 ^ (-2)) | (i100 & (-2));
                int i105 = ~i104;
                int i106 = ~((i100 ^ currentTimeMillis20) | (i100 & currentTimeMillis20));
                int i107 = (((i99 | 868) << 1) - (i99 ^ 868)) + (((i103 & i102) | (i102 ^ i103)) * (-867)) + (((i106 ^ i105) | (i105 & i106) | (~((currentTimeMillis20 ^ (-2)) | (currentTimeMillis20 & (-2))))) * (-1734));
                int i108 = ~((i104 & i101) | (i104 ^ i101));
                int i109 = (i100 & 1) | (i100 ^ 1);
                int i110 = ~((i109 ^ currentTimeMillis20) | (i109 & currentTimeMillis20));
                int i111 = (i108 ^ i110) | (i110 & i108);
                int i112 = (i98 ^ (-2)) | (i98 & (-2));
                int i113 = ~((i112 ^ currentTimeMillis20) | (i112 & currentTimeMillis20));
                int i114 = ((i111 ^ i113) | (i113 & i111)) * 867;
                java.lang.Object[] objArr34 = new java.lang.Object[1];
                b("눊懏ㅔ琠", c4, "\ue54a㧳嚢崦⑾攱邊\ue6b0䪧榵ㅋ妀刢ة嵳쬗", "\ue9fc\ue78d퍞ꂹ", ((i107 | i114) << 1) - (i114 ^ i107), objArr34);
                java.lang.String str16 = (java.lang.String) objArr34[0];
                java.lang.Object[] objArr35 = new java.lang.Object[1];
                c("\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001", false, new int[]{32, 10, 17, 5}, objArr35);
                java.lang.String str17 = (java.lang.String) objArr35[0];
                int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                int currentTimeMillis21 = (int) java.lang.System.currentTimeMillis();
                int i115 = (lastIndexOf * (-244)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE;
                int i116 = ~currentTimeMillis21;
                int i117 = ~((i116 ^ (-2)) | (i116 & (-2)));
                int i118 = ~((lastIndexOf ^ (-2)) | (lastIndexOf & (-2)));
                int i119 = -(-(((i117 ^ i118) | (i117 & i118)) * (-245)));
                int i120 = (i115 & i119) + (i115 | i119);
                int i121 = ~(currentTimeMillis21 | (-2));
                int i122 = -(-(i121 * (-245)));
                char c5 = (char) ((((i120 | i122) << 1) - (i122 ^ i120)) + ((i121 | lastIndexOf) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
                java.lang.Object[] objArr36 = new java.lang.Object[1];
                b("技衑䝞惨", c5, "⸇봐跡윘⺍ḝ䊉\udf7d", "\ue9fc\ue78d퍞ꂹ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr36);
                java.lang.String str18 = (java.lang.String) objArr36[0];
                java.lang.Object[] objArr37 = new java.lang.Object[1];
                c("\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", false, new int[]{42, 12, 0, 0}, objArr37);
                java.lang.String str19 = (java.lang.String) objArr37[0];
                java.lang.Object[] objArr38 = new java.lang.Object[1];
                c("\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000", false, new int[]{54, 14, 0, 8}, objArr38);
                java.lang.String str20 = (java.lang.String) objArr38[0];
                char c6 = (char) (0 - (~(-(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)))));
                int i123 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                java.lang.Object[] objArr39 = new java.lang.Object[1];
                b("뤪뫈ݨ苛", c6, "⟚쨝т鹉찬̕൴", "\ue9fc\ue78d퍞ꂹ", (1757071545 ^ i123) + ((i123 & 1757071545) << 1), objArr39);
                java.lang.String str21 = (java.lang.String) objArr39[0];
                java.lang.Object[] objArr40 = new java.lang.Object[1];
                c("\u0000\u0001\u0001\u0000\u0000\u0000\u0001", false, new int[]{68, 7, 13, 0}, objArr40);
                java.lang.String str22 = (java.lang.String) objArr40[0];
                char scrollBarFadeDuration = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i124 = -android.graphics.Color.red(0);
                java.lang.Object[] objArr41 = new java.lang.Object[1];
                b("閽㤨⩛ꖏ", scrollBarFadeDuration, "湄곬现댻썞鿤瀣", "\ue9fc\ue78d퍞ꂹ", (1530472597 & i124) + (i124 | 1530472597), objArr41);
                java.lang.String str23 = (java.lang.String) objArr41[0];
                int i125 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                char c7 = (char) (((47631 | i125) << 1) - (i125 ^ 47631));
                int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                int currentTimeMillis22 = (int) java.lang.System.currentTimeMillis();
                int i126 = (indexOf * 483) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE;
                int i127 = ~indexOf;
                int i128 = ~currentTimeMillis22;
                int i129 = (i128 ^ i127) | (i127 & i128);
                int i130 = -(-(((~((i127 & (-2)) | (i127 ^ (-2)))) | (~i129)) * (-241)));
                java.lang.Object[] objArr42 = new java.lang.Object[1];
                b("∸\ue4e8ၹ窺", c7, "踊Ꮂ", "\ue9fc\ue78d퍞ꂹ", (((~((i129 ^ 1) | (i129 & 1))) | (~((indexOf & (-2)) | (indexOf ^ (-2))))) * 241) + (i126 ^ i130) + ((i126 & i130) << 1) + (((indexOf ^ 1) | (indexOf & 1)) * (-482)), objArr42);
                java.lang.String str24 = (java.lang.String) objArr42[0];
                java.lang.Object[] objArr43 = new java.lang.Object[1];
                c("\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001", true, new int[]{75, 20, 165, 0}, objArr43);
                java.lang.String str25 = (java.lang.String) objArr43[0];
                java.lang.Object[] objArr44 = new java.lang.Object[1];
                b("鑮픈鲟♵", (char) (30107 - (~(-(-android.widget.ExpandableListView.getPackedPositionType(0L))))), "쭧ࡵ乾䏥\uf205燽", "\ue9fc\ue78d퍞ꂹ", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr44);
                java.lang.String str26 = (java.lang.String) objArr44[0];
                java.lang.Object[] objArr45 = new java.lang.Object[1];
                c("\u0001\u0000", false, new int[]{95, 2, 0, 2}, objArr45);
                java.lang.String str27 = (java.lang.String) objArr45[0];
                java.lang.Object[] objArr46 = new java.lang.Object[1];
                c("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000", false, new int[]{97, 16, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 0}, objArr46);
                java.lang.String str28 = (java.lang.String) objArr46[0];
                java.lang.Object[] objArr47 = new java.lang.Object[1];
                b("敛㻿혊⍝", (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), "借諃☝唃廽퓌僙᠖澩", "\ue9fc\ue78d퍞ꂹ", 171900773 - android.graphics.Color.green(0), objArr47);
                java.lang.String str29 = (java.lang.String) objArr47[0];
                java.lang.Object[] objArr48 = new java.lang.Object[1];
                c("\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000", true, new int[]{113, 10, 0, 0}, objArr48);
                java.lang.String str30 = (java.lang.String) objArr48[0];
                java.lang.Object[] objArr49 = new java.lang.Object[1];
                c("\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001", false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 11, 130, 0}, objArr49);
                java.lang.String str31 = (java.lang.String) objArr49[0];
                int i131 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                java.lang.Object[] objArr50 = new java.lang.Object[1];
                b("吤視⌅敔", (char) ((~i131) + (i131 << 1)), "촥繨ഉ쓲䜔୦\uedcf媟\udbf0閤㭒", "\ue9fc\ue78d퍞ꂹ", 92902994 - (~(-(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))), objArr50);
                java.lang.String str32 = (java.lang.String) objArr50[0];
                java.lang.Object[] objArr51 = new java.lang.Object[1];
                c("\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001", false, new int[]{134, 15, 55, 0}, objArr51);
                java.lang.String str33 = (java.lang.String) objArr51[0];
                java.lang.Object[] objArr52 = new java.lang.Object[1];
                c("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000", true, new int[]{149, 14, 0, 8}, objArr52);
                java.lang.String[] strArr3 = {str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, (java.lang.String) objArr52[0]};
                java.lang.Object[] objArr53 = new java.lang.Object[1];
                b("䌱胋䫜픲", (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "줕\uea84丠鯙\ue5f1罕踈ո搇ᙈᎼ", "\ue9fc\ue78d퍞ꂹ", (-595539134) - (~(-android.text.TextUtils.getOffsetBefore("", 0))), objArr53);
                java.lang.Object[] objArr54 = {(java.lang.String) objArr53[0]};
                java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj12 == null) {
                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 40, android.view.Gravity.getAbsoluteGravity(0, 0) + 1921, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    byte[] bArr9 = $$a;
                    byte b10 = (byte) (bArr9[14] - 1);
                    java.lang.Object[] objArr55 = new java.lang.Object[1];
                    a(b10, b10, (byte) (-bArr9[16]), objArr55);
                    obj12 = cls10.getMethod((java.lang.String) objArr55[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj12);
                }
                java.lang.String str34 = (java.lang.String) ((java.lang.reflect.Method) obj12).invoke(null, objArr54);
                if (str34 != null) {
                    int i132 = getProfileVersion;
                    getAid = (((i132 | 33) << 1) - (i132 ^ 33)) % 128;
                    java.lang.Object[] objArr56 = new java.lang.Object[1];
                    b("輜\udb85礝䖐", (char) (36984 - (~(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))), "\ua8df\ud9c4췫ꗽ説窦", "\ue9fc\ue78d퍞ꂹ", android.view.View.resolveSizeAndState(0, 0, 0), objArr56);
                    java.lang.String str35 = (java.lang.String) objArr56[0];
                    char maxKeyCode = (char) (android.view.KeyEvent.getMaxKeyCode() >> 16);
                    int i133 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                    b("臝ှ\udb74溍", maxKeyCode, "\ude91甆㠬診\ude08擢Ⱒ䁻", "\ue9fc\ue78d퍞ꂹ", (~i133) + (i133 << 1), objArr57);
                    java.lang.String[] strArr4 = {str35, (java.lang.String) objArr57[0]};
                    int i134 = 0;
                    while (true) {
                        if (i134 >= 2) {
                            break;
                        }
                        int i135 = getProfileVersion;
                        int i136 = (i135 ^ 83) + ((i135 & 83) << 1);
                        getAid = i136 % 128;
                        if (i136 % 2 == 0) {
                            str34.contains(strArr4[i134]);
                            throw new java.lang.ArithmeticException();
                        }
                        if (str34.contains(strArr4[i134])) {
                            char indexOf2 = (char) android.text.TextUtils.indexOf("", "", i7);
                            int i137 = -(-(android.widget.ExpandableListView.getPackedPositionForGroup(i7) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i7) == 0L ? 0 : -1)));
                            java.lang.Object[] objArr58 = new java.lang.Object[1];
                            b("핕\ued1dꜸ휏", indexOf2, "\ud895ﮆﳟ鸓뷧濯踩톭팻瓞臱㒓䙚鏿篷彺ꮶ\uedd7णᑍ滑왔ᤅ", "\ue9fc\ue78d퍞ꂹ", (955063765 & i137) + (i137 | 955063765), objArr58);
                            java.lang.Object[] objArr59 = {(java.lang.String) objArr58[i7]};
                            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj13 == null) {
                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.red(i7), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1921, (char) (android.graphics.Color.rgb(i7, i7, i7) + 16777216));
                                byte[] bArr10 = $$a;
                                byte b11 = (byte) (bArr10[14] - 1);
                                java.lang.Object[] objArr60 = new java.lang.Object[1];
                                a(b11, b11, (byte) (-bArr10[16]), objArr60);
                                java.lang.String str36 = (java.lang.String) objArr60[i7];
                                java.lang.Class<?>[] clsArr5 = new java.lang.Class[1];
                                clsArr5[i7] = java.lang.String.class;
                                obj13 = cls11.getMethod(str36, clsArr5);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj13);
                            }
                            java.lang.Object invoke4 = ((java.lang.reflect.Method) obj13).invoke(null, objArr59);
                            int i138 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int currentTimeMillis23 = (int) java.lang.System.currentTimeMillis();
                            int i139 = ~i138;
                            int i140 = ~((i139 & 25047) | (i139 ^ 25047));
                            int i141 = ~((currentTimeMillis23 ^ 25047) | (currentTimeMillis23 & 25047));
                            int i142 = ((((i138 * 71) - 1728243) - (~(-(-(((i141 ^ i140) | (i140 & i141)) * (-140)))))) - 1) + ((~((i138 ^ 25047) | (i138 & 25047) | currentTimeMillis23)) * 70);
                            int i143 = ~((i138 & (-25048)) | (i138 ^ (-25048)));
                            int i144 = (i140 ^ i143) | (i140 & i143);
                            int i145 = ~((i138 ^ currentTimeMillis23) | (i138 & currentTimeMillis23));
                            int i146 = -(-(((i145 ^ i144) | (i145 & i144)) * 70));
                            char c8 = (char) ((i142 & i146) + (i146 | i142));
                            int i147 = -(-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i7, i7));
                            java.lang.Object[] objArr61 = new java.lang.Object[1];
                            b("ꈨ緘\u4c361", c8, "᧞\uf3b9蚒⺡뒤Ა\ue02e\uda50檳ꑘᨀ串\ue79e\uf5bd\ude25훦জ⫞꽩ꂁ脩彐ퟲ説ꃸ쪩䒵萡༅䳧", "\ue9fc\ue78d퍞ꂹ", (i147 ^ 1) + ((i147 & 1) << 1), objArr61);
                            java.lang.Object[] objArr62 = {(java.lang.String) objArr61[i7]};
                            java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj14 == null) {
                                java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.KeyEvent.keyCodeFromString(""), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1921, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                byte[] bArr11 = $$a;
                                byte b12 = (byte) (bArr11[14] - 1);
                                java.lang.Object[] objArr63 = new java.lang.Object[1];
                                a(b12, b12, (byte) (-bArr11[16]), objArr63);
                                java.lang.String str37 = (java.lang.String) objArr63[i7];
                                java.lang.Class<?>[] clsArr6 = new java.lang.Class[1];
                                clsArr6[i7] = java.lang.String.class;
                                obj14 = cls12.getMethod(str37, clsArr6);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj14);
                            }
                            java.lang.Object invoke5 = ((java.lang.reflect.Method) obj14).invoke(null, objArr62);
                            if (invoke4 != null) {
                                java.lang.Object[] objArr64 = new java.lang.Object[2];
                                objArr64[1] = 42;
                                objArr64[i7] = invoke4;
                                java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj15 == null) {
                                    java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 28, 2594 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i7, i7)));
                                    byte[] bArr12 = $$a;
                                    byte b13 = (byte) (bArr12[14] - 1);
                                    java.lang.Object[] objArr65 = new java.lang.Object[1];
                                    a(b13, b13, (byte) (-bArr12[16]), objArr65);
                                    java.lang.String str38 = (java.lang.String) objArr65[i7];
                                    java.lang.Class<?>[] clsArr7 = new java.lang.Class[2];
                                    clsArr7[i7] = java.lang.String.class;
                                    clsArr7[1] = java.lang.Integer.TYPE;
                                    obj15 = cls13.getMethod(str38, clsArr7);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj15);
                                }
                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj15).invoke(null, objArr64)).longValue();
                                long currentTimeMillis24 = (int) java.lang.System.currentTimeMillis();
                                long j15 = ~currentTimeMillis24;
                                strArr = strArr3;
                                long j16 = ((-219) * longValue6) + 190191864733L + (((~((~longValue6) | (-860596674))) | (~(j15 | 860596673 | longValue6))) * 220) + (((~(j15 | longValue6)) | 860596673) * (-440)) + ((860596673 | longValue6 | currentTimeMillis24) * 220) + 396503851;
                                int currentTimeMillis25 = (int) java.lang.System.currentTimeMillis();
                                int i148 = ((int) (j16 >> 32)) & ((((~((~currentTimeMillis25) | (-152043529))) * 433) - 2092093630) + (((~(431117470 | currentTimeMillis25)) | (-1868343882)) * (-433)) + (((~(currentTimeMillis25 | (-1868343882))) | 279073942) * 433));
                                int currentTimeMillis26 = (int) java.lang.System.currentTimeMillis();
                                int i149 = ((int) j16) & ((((~(1774156351 | currentTimeMillis26)) | 1083584534) * (-756)) + 476490049 + (((~currentTimeMillis26) | 1774156351) * 756));
                            } else {
                                strArr = strArr3;
                            }
                            if (invoke5 != null) {
                                java.lang.Object[] objArr66 = new java.lang.Object[2];
                                objArr66[1] = 42;
                                objArr66[i7] = invoke5;
                                java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj16 == null) {
                                    java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(i7, i7) + 28, android.view.Gravity.getAbsoluteGravity(i7, i7) + 2594, (char) (android.view.MotionEvent.axisFromString("") + 1));
                                    byte[] bArr13 = $$a;
                                    byte b14 = (byte) (bArr13[14] - 1);
                                    java.lang.Object[] objArr67 = new java.lang.Object[1];
                                    a(b14, b14, (byte) (-bArr13[16]), objArr67);
                                    java.lang.String str39 = (java.lang.String) objArr67[i7];
                                    java.lang.Class<?>[] clsArr8 = new java.lang.Class[2];
                                    clsArr8[i7] = java.lang.String.class;
                                    clsArr8[1] = java.lang.Integer.TYPE;
                                    obj16 = cls14.getMethod(str39, clsArr8);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj16);
                                }
                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj16).invoke(null, objArr66)).longValue();
                                long j17 = 845401079 | longValue7;
                                long currentTimeMillis27 = (int) java.lang.System.currentTimeMillis();
                                long j18 = (-845401080) | (~currentTimeMillis27);
                                long j19 = ~(currentTimeMillis27 | j17);
                                long j20 = (503 * longValue7) + 425236742737L + (j17 * (-502)) + (((~((~longValue7) | (-845401080))) | (~j18) | j19) * (-502)) + (((~(longValue7 | j18)) | j19) * 502) + 411699445;
                                int currentTimeMillis28 = (int) java.lang.System.currentTimeMillis();
                                int i150 = ~currentTimeMillis28;
                                int i151 = ((int) (j20 >> 32)) & (((((~(620020096 | i150)) | r6) * 1150) - 334238508) + (((~((-2057246508) | currentTimeMillis28)) | (~(2057246507 | i150))) * (-575)) + (((~(currentTimeMillis28 | 620020096)) | (~(i150 | (-620020097)))) * 575));
                                int currentTimeMillis29 = (int) java.lang.System.currentTimeMillis();
                                int i152 = ((int) j20) & (((((~((-1970713179) | currentTimeMillis29)) | 1101546913) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) - 1255367507) + (((~((~currentTimeMillis29) | (-1970713179))) | 1101546913) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                            }
                        } else {
                            java.lang.String[] strArr5 = strArr3;
                            i134++;
                            int i153 = getProfileVersion;
                            getAid = (((i153 | 31) << 1) - (i153 ^ 31)) % 128;
                            strArr3 = strArr5;
                            i7 = 0;
                        }
                    }
                }
                java.lang.Object[] objArr68 = new java.lang.Object[1];
                c("\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{163, 23, 185, 5}, objArr68);
                java.lang.Object[] objArr69 = {(java.lang.String) objArr68[0]};
                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj17 == null) {
                    java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 2807 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) android.text.TextUtils.indexOf("", "", 0, 0));
                    byte[] bArr14 = $$a;
                    byte b15 = (byte) (bArr14[14] - 1);
                    java.lang.Object[] objArr70 = new java.lang.Object[1];
                    a(b15, b15, (byte) (-bArr14[16]), objArr70);
                    obj17 = cls15.getMethod((java.lang.String) objArr70[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj17);
                }
                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj17).invoke(null, objArr69)).longValue();
                int currentTimeMillis30 = (int) java.lang.System.currentTimeMillis();
                long j21 = ~longValue8;
                long j22 = currentTimeMillis30;
                long j23 = ((319 * longValue8) - 336923584725L) + (((~((~j22) | 1062850425 | longValue8)) | (~((-1062850426) | j21 | j22))) * (-318)) + (((~(1062850425 | j21)) | (~(1062850425 | j22))) * (-318)) + (((~((-1062850426) | j22)) | j21) * 318) + 227689642;
                int currentTimeMillis31 = (int) java.lang.System.currentTimeMillis();
                int currentTimeMillis32 = (int) java.lang.System.currentTimeMillis();
                int i154 = ~currentTimeMillis32;
                long j24 = (((int) (j23 >> 32)) & ((((((~((-1804151652) | currentTimeMillis31)) | 1778461251) * 576) - 1771464918) + (((~((~currentTimeMillis31) | (-25690401))) | (-2145386492)) * 576)) - 2103503168)) | ((((8389633 | currentTimeMillis32) * 988) + 915092501 + (((~(82360087 | i154)) | (-1593556952)) * (-1976)) + (((~(currentTimeMillis32 | 1519586497)) | 8389633 | (~(i154 | (-1519586498)))) * 988)) & ((int) j23));
                java.lang.Object[] objArr71 = new java.lang.Object[1];
                c("\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", false, new int[]{186, 17, 155, 0}, objArr71);
                java.lang.Object[] objArr72 = {(java.lang.String) objArr71[0]};
                java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj18 == null) {
                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.View.resolveSizeAndState(0, 0, 0), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2759, (char) android.text.TextUtils.getTrimmedLength(""));
                    byte[] bArr15 = $$a;
                    byte b16 = (byte) (bArr15[14] - 1);
                    java.lang.Object[] objArr73 = new java.lang.Object[1];
                    a(b16, b16, (byte) (-bArr15[16]), objArr73);
                    obj18 = cls16.getMethod((java.lang.String) objArr73[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj18);
                }
                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj18).invoke(null, objArr72)).longValue();
                int currentTimeMillis33 = (int) java.lang.System.currentTimeMillis();
                long j25 = ~longValue9;
                long j26 = currentTimeMillis33;
                long j27 = ~j26;
                long j28 = ~(j26 | 332791832);
                long j29 = ((521 * longValue9) - 172718960808L) + (((~(j25 | (-332791833) | j27)) | (~(longValue9 | j26))) * 520) + (((~(j25 | j27)) | j28) * (-1040)) + ((j28 | (~((-332791833) | j27)) | (~(332791832 | j25))) * 520) + 957748235;
                int currentTimeMillis34 = (int) java.lang.System.currentTimeMillis();
                int i155 = ((int) (j29 >> 32)) & ((((((~currentTimeMillis34) | (-1159998033)) * 1444) - 1153123274) + ((((~(currentTimeMillis34 | (-2006508051))) | 848871426) | (~((-851232835) | currentTimeMillis34))) * (-1444))) - 43616);
                int currentTimeMillis35 = (int) java.lang.System.currentTimeMillis();
                int i156 = ((int) j29) & (((((~(1594708916 | currentTimeMillis35)) | 6466570) * 336) - 501357939) + (((~(157482506 | currentTimeMillis35)) | 1443692980) * (-168)) + (((~((~currentTimeMillis35) | 157482506)) | 1594708916) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                long j30 = (i156 ^ i155) | (i155 & i156);
                if (j24 > 0 && j30 > 0 && j30 - 3 < j24) {
                    getAid = (getProfileVersion + 93) % 128;
                    java.lang.Object[] objArr74 = {new int[]{0}, new int[]{247}, null, new int[1]};
                    int currentTimeMillis36 = (int) java.lang.System.currentTimeMillis();
                    java.lang.Object[] objArr75 = {-2062849474, 16, java.lang.Integer.valueOf((-107078859) + (((~((-184551761) | currentTimeMillis36)) | (~((~currentTimeMillis36) | 524773759))) * (-318)) + (((~(524773745 | currentTimeMillis36)) | 14) * (-318)) + (((~(currentTimeMillis36 | (-524773746))) | (-184551775)) * 318))};
                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj19 == null) {
                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSizeAndState(0, 0, 0), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2713, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                        byte b17 = (byte) ($$a[14] - 1);
                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                        a(b17, (short) (b17 | 653), b17, objArr76);
                        obj19 = cls17.getMethod((java.lang.String) objArr76[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj19);
                    }
                    ((int[]) objArr74[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(null, objArr75)).intValue();
                    return objArr74;
                }
                java.lang.Object[] objArr77 = new java.lang.Object[1];
                c("\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{163, 23, 185, 5}, objArr77);
                java.lang.Object[] objArr78 = {(java.lang.String) objArr77[0]};
                java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj20 == null) {
                    java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 29, (android.os.Process.myPid() >> 22) + 2807, (char) android.view.View.resolveSize(0, 0));
                    byte[] bArr16 = $$a;
                    byte b18 = (byte) (bArr16[14] - 1);
                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                    a(b18, b18, (byte) (-bArr16[16]), objArr79);
                    obj20 = cls18.getMethod((java.lang.String) objArr79[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj20);
                }
                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, objArr78)).longValue();
                long currentTimeMillis37 = (int) java.lang.System.currentTimeMillis();
                long j31 = ~((-807176186) | currentTimeMillis37);
                long j32 = ~longValue10;
                long j33 = ~currentTimeMillis37;
                long j34 = ((-139) * longValue10) + 113811842085L + (((~(longValue10 | (-807176186))) | j31) * (-280)) + (((~(j32 | currentTimeMillis37)) | j31) * 140) + (((~((-807176186) | j32 | currentTimeMillis37)) | (~(longValue10 | (-807176186) | j33)) | (~(807176185 | j32 | j33))) * 140) + 483363882;
                int currentTimeMillis38 = (int) java.lang.System.currentTimeMillis();
                int i157 = ((int) (j34 >> 32)) & ((((~((~currentTimeMillis38) | (-67125249))) | (~((-847917673) | currentTimeMillis38))) * (-302)) + 323048434 + ((~((-67125249) | currentTimeMillis38)) * (-604)) + (((~(currentTimeMillis38 | (-915042921))) | 1094780292) * 302));
                int i158 = ~(((int) java.lang.System.currentTimeMillis()) | (-936338010));
                int i159 = ((int) j34) & ((((135303424 | i158) * (-196)) - 1099235523) + ((i158 | (-1071641434)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE));
                long j35 = (i157 ^ i159) | (i157 & i159);
                java.lang.Object[] objArr80 = new java.lang.Object[1];
                c("\u0001\u0001\u0001\u0001", false, new int[]{203, 4, 0, 0}, objArr80);
                java.lang.Object[] objArr81 = {(java.lang.String) objArr80[0]};
                java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj21 == null) {
                    java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 30, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2808, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    byte[] bArr17 = $$a;
                    byte b19 = (byte) (bArr17[14] - 1);
                    java.lang.Object[] objArr82 = new java.lang.Object[1];
                    a(b19, b19, (byte) (-bArr17[16]), objArr82);
                    obj21 = cls19.getMethod((java.lang.String) objArr82[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj21);
                }
                long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, objArr81)).longValue();
                long currentTimeMillis39 = (int) java.lang.System.currentTimeMillis();
                long j36 = ~currentTimeMillis39;
                long j37 = ~(690575714 | longValue11);
                long j38 = (~longValue11) | (-690575715);
                long j39 = ((1435 * longValue11) - 494452211224L) + ((longValue11 | (-690575715)) * (-1434)) + (((~(j36 | longValue11)) | j37 | (~(j38 | currentTimeMillis39))) * 717) + (((~(j38 | j36)) | j37 | (~(longValue11 | currentTimeMillis39))) * 717) + 599964353;
                int currentTimeMillis40 = (int) java.lang.System.currentTimeMillis();
                int i160 = ~currentTimeMillis40;
                int i161 = ((int) (j39 >> 32)) & ((((~((-33220) | currentTimeMillis40)) | (~((-277368865) | i160))) * 920) + 2038856378 + (((~((-1159824328) | i160)) | 33219) * 920) + (((~(currentTimeMillis40 | (-1159791109))) | (~(i160 | (-33220))) | (~((-277368865) | currentTimeMillis40))) * 920));
                int currentTimeMillis41 = (int) java.lang.System.currentTimeMillis();
                int i162 = ~currentTimeMillis41;
                int i163 = ((int) j39) & (((~(847889337 | i162)) * (-560)) + 721550053 + ((~(currentTimeMillis41 | (-1161962501))) * (-560)) + (((~(2009851548 | i162)) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE) * 560));
                long j40 = (i161 ^ i163) | (i161 & i163);
                if (j35 > 0 && j40 > 0) {
                    int i164 = getAid;
                    int i165 = (i164 & 73) + (i164 | 73);
                    getProfileVersion = i165 % 128;
                    if (i165 % 2 == 0 ? j40 + 100 < j35 : (j40 ^ 100) < j35) {
                        java.lang.Object[] objArr83 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                        int currentTimeMillis42 = (int) java.lang.System.currentTimeMillis();
                        java.lang.Object[] objArr84 = {-2062849474, 16, java.lang.Integer.valueOf(((((~(114091161 | currentTimeMillis42)) | 823137120) * 104) - 46084425) + ((~((~currentTimeMillis42) | (-113811601))) * (-104)) + ((currentTimeMillis42 | 823416681) * 104))};
                        java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj22 == null) {
                            java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.keyCodeFromString(""), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2714, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                            byte b20 = (byte) ($$a[14] - 1);
                            java.lang.Object[] objArr85 = new java.lang.Object[1];
                            a(b20, (short) (b20 | 653), b20, objArr85);
                            obj22 = cls20.getMethod((java.lang.String) objArr85[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj22);
                        }
                        ((int[]) objArr83[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr84)).intValue();
                        return objArr83;
                    }
                }
                char c9 = (char) ((-(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)))) - 1);
                int myTid = android.os.Process.myTid() >> 22;
                java.lang.Object[] objArr86 = new java.lang.Object[1];
                b("蟻蟡漤쫚", c9, "\u0011皥⿒朗餶猢ﻋ", "\ue9fc\ue78d퍞ꂹ", ((612884871 | myTid) << 1) - (myTid ^ 612884871), objArr86);
                java.lang.String str40 = (java.lang.String) objArr86[0];
                java.lang.Object[] objArr87 = new java.lang.Object[1];
                c("\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001", false, new int[]{207, 11, 0, 0}, objArr87);
                java.lang.String str41 = (java.lang.String) objArr87[0];
                java.lang.Object[] objArr88 = new java.lang.Object[1];
                c("\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000", false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE, 12, 81, 5}, objArr88);
                java.lang.String str42 = (java.lang.String) objArr88[0];
                java.lang.Object[] objArr89 = new java.lang.Object[1];
                c("\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001", true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 12, 0, 11}, objArr89);
                java.lang.String str43 = (java.lang.String) objArr89[0];
                java.lang.Object[] objArr90 = new java.lang.Object[1];
                c("\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, 11, 0, 6}, objArr90);
                java.lang.String str44 = (java.lang.String) objArr90[0];
                java.lang.Object[] objArr91 = new java.lang.Object[1];
                c("\u0001\u0000\u0001\u0001\u0001", false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, 5, 0, 0}, objArr91);
                java.lang.String str45 = (java.lang.String) objArr91[0];
                java.lang.Object[] objArr92 = new java.lang.Object[1];
                c(null, true, new int[]{258, 4, 121, 1}, objArr92);
                java.lang.String[] strArr6 = {str40, str41, str42, str43, str44, str45, (java.lang.String) objArr92[0]};
                int i166 = 0;
                while (true) {
                    if (i166 >= 7) {
                        i = 0;
                        break;
                    }
                    int i167 = getProfileVersion;
                    getAid = ((i167 ^ 29) + ((i167 & 29) << 1)) % 128;
                    java.lang.Object[] objArr93 = {strArr6[i166]};
                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                    if (obj23 == null) {
                        java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 28, android.view.View.resolveSize(0, 0) + 1672, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 47939));
                        byte[] bArr18 = $$a;
                        byte b21 = (byte) (bArr18[14] - 1);
                        java.lang.Object[] objArr94 = new java.lang.Object[1];
                        a(b21, b21, (byte) (-bArr18[16]), objArr94);
                        obj23 = cls21.getMethod((java.lang.String) objArr94[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj23);
                    }
                    long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj23).invoke(null, objArr93)).longValue();
                    int currentTimeMillis43 = (int) java.lang.System.currentTimeMillis();
                    long j41 = ~longValue12;
                    long j42 = currentTimeMillis43;
                    long j43 = ~j42;
                    int i168 = i166;
                    long j44 = (((((832 * longValue12) + 336686102810L) + (((~(j41 | j43)) | (~((longValue12 | (-405645907)) | j42))) * (-831))) + ((~(((-405645907) | j41) | j42)) * (-1662))) + (((~(longValue12 | j42)) | ((~(405645906 | j43)) | (~((-405645907) | j42)))) * 831)) - 1219884275;
                    int currentTimeMillis44 = (int) java.lang.System.currentTimeMillis();
                    int i169 = ~currentTimeMillis44;
                    int i170 = ((int) (j44 >> 32)) & ((((~((-507392633) | i169)) | (~((-929833779) | currentTimeMillis44)) | (~(929833778 | i169))) * 959) + 1180059545 + (((~(currentTimeMillis44 | (-507392633))) | (~(i169 | (-929833779))) | (~(929833778 | currentTimeMillis44))) * 959));
                    int i171 = ~((int) java.lang.System.currentTimeMillis());
                    int i172 = ((int) j44) & ((((r3 | 557982121) * 614) - 1303181185) + (((~((-1166664823) | i171)) | 16785440 | (~(1691076063 | i171))) * (-1228)) + (((~(i171 | (-1149879383))) | (~(1707861503 | i171))) * 614));
                    if (((i172 ^ i170) | (i170 & i172)) != 0) {
                        int currentTimeMillis45 = (int) java.lang.System.currentTimeMillis();
                        int i173 = 48757 - (~(-(-(i168 * 530))));
                        int i174 = ~currentTimeMillis45;
                        int i175 = ~((i174 ^ 90) | (i174 & 90));
                        int i176 = ~(i168 | 90);
                        int i177 = -(-(((i175 ^ i176) | (i175 & i176)) * 529));
                        int i178 = (i173 & i177) + (i177 | i173);
                        int i179 = ~i168;
                        int i180 = ~((currentTimeMillis45 ^ 90) | (currentTimeMillis45 & 90));
                        int i181 = -(-(((i180 ^ i179) | (i180 & i179)) * 529));
                        i = (i181 ^ i178) + ((i181 & i178) << 1);
                        break;
                    }
                    i166 = i168 + 1;
                }
                if (i != 0) {
                    java.lang.Object[] objArr95 = {new int[]{0}, new int[]{i}, null, new int[1]};
                    int currentTimeMillis46 = (int) java.lang.System.currentTimeMillis();
                    int i182 = ~currentTimeMillis46;
                    java.lang.Object[] objArr96 = {-2062849474, 16, java.lang.Integer.valueOf(((((-1404943) | currentTimeMillis46) * (-676)) - 277552517) + (((~(363463073 | i182)) | 1404942) * 676) + (((~(currentTimeMillis46 | 364868015)) | (~(i182 | (-345862447))) | 344457504) * 676))};
                    java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj24 == null) {
                        java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getOffsetBefore("", 0), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2713, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                        byte b22 = (byte) ($$a[14] - 1);
                        java.lang.Object[] objArr97 = new java.lang.Object[1];
                        a(b22, (short) (b22 | 653), b22, objArr97);
                        obj24 = cls22.getMethod((java.lang.String) objArr97[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj24);
                    }
                    ((int[]) objArr95[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr96)).intValue();
                    return objArr95;
                }
                try {
                    int i183 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    java.lang.Object[] objArr98 = new java.lang.Object[1];
                    b("\uefa8䩡㻅\u0efe", (char) ((65086 ^ i183) + ((i183 & 65086) << 1)), "❆찿豱샐㼅ꦱﾢ弙䑎짹뱢郇羋", "\ue9fc\ue78d퍞ꂹ", (-984981010) - (~(-(android.view.ViewConfiguration.getTapTimeout() >> 16))), objArr98);
                    try {
                        java.lang.Object[] objArr99 = {(java.lang.String) objArr98[0]};
                        java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj25 == null) {
                            java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 40, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1921, (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                            byte[] bArr19 = $$a;
                            byte b23 = (byte) (bArr19[14] - 1);
                            java.lang.Object[] objArr100 = new java.lang.Object[1];
                            a(b23, b23, (byte) (-bArr19[16]), objArr100);
                            obj25 = cls23.getMethod((java.lang.String) objArr100[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj25);
                        }
                        invoke = ((java.lang.reflect.Method) obj25).invoke(null, objArr99);
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    }
                } catch (java.lang.Exception unused) {
                }
                try {
                    if (invoke != null) {
                        int i184 = getProfileVersion;
                        int i185 = ((i184 | 13) << 1) - (i184 ^ 13);
                        getAid = i185 % 128;
                        if (i185 % 2 == 0) {
                            java.lang.String[] strArr7 = new java.lang.String[1];
                            java.lang.Object[] objArr101 = new java.lang.Object[1];
                            c("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000", false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 11, 0, 9}, objArr101);
                            strArr7[1] = (java.lang.String) objArr101[0];
                            try {
                                java.lang.Object[] objArr102 = {invoke, strArr7};
                                java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                if (obj26 == null) {
                                    java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 44, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2881, (char) android.graphics.Color.green(0));
                                    byte[] bArr20 = $$a;
                                    byte b24 = (byte) (bArr20[14] - 1);
                                    java.lang.Object[] objArr103 = new java.lang.Object[1];
                                    a(b24, b24, (byte) (-bArr20[16]), objArr103);
                                    obj26 = cls24.getMethod((java.lang.String) objArr103[0], java.lang.String.class, java.lang.String[].class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj26);
                                }
                                long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr102)).longValue();
                                long currentTimeMillis47 = (int) java.lang.System.currentTimeMillis();
                                long j45 = ~currentTimeMillis47;
                                long j46 = ~(1668774030 | longValue13);
                                long j47 = ((((((-396) * longValue13) - 664172064338L) + ((((~(j45 | 1668774030)) | j46) | (~(j45 | longValue13))) * (-397))) + ((-397) * j46)) + (((~((~longValue13) | (-1668774031))) | (currentTimeMillis47 | j46)) * 397)) - 359937748;
                                int currentTimeMillis48 = (int) java.lang.System.currentTimeMillis();
                                int i186 = ~currentTimeMillis48;
                                int currentTimeMillis49 = (int) java.lang.System.currentTimeMillis();
                                int i187 = ~currentTimeMillis49;
                                if (((((int) (j47 << 30)) & ((((~((-54875247) | i186)) | (~((-1382351165) | currentTimeMillis48))) * 1900) + 1871737038 + (((~(1382351164 | i186)) | (~(54875246 | currentTimeMillis48))) * (-950)) + (((~(currentTimeMillis48 | 1382351164)) | (~(i186 | 54875246))) * 950))) | (((((~(224602916 | i187)) | (~(1661829326 | i187)) | (-1869589487)) * 464) + 1988973253 + (((-207760161) | currentTimeMillis49) * (-464)) + (((~(224602916 | currentTimeMillis49)) | (-1869589487)) * 464)) & ((int) j47))) == 0) {
                                    i2 = 0;
                                }
                            } catch (java.lang.Throwable th3) {
                                java.lang.Throwable cause2 = th3.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th3;
                            }
                        } else {
                            java.lang.Object[] objArr104 = new java.lang.Object[1];
                            c("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000", false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 11, 0, 9}, objArr104);
                            try {
                                java.lang.Object[] objArr105 = {invoke, new java.lang.String[]{(java.lang.String) objArr104[0]}};
                                java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                if (obj27 == null) {
                                    java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 2880 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                    byte[] bArr21 = $$a;
                                    byte b25 = (byte) (bArr21[14] - 1);
                                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                                    a(b25, b25, (byte) (-bArr21[16]), objArr106);
                                    obj27 = cls25.getMethod((java.lang.String) objArr106[0], java.lang.String.class, java.lang.String[].class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj27);
                                }
                                long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr105)).longValue();
                                int currentTimeMillis50 = (int) java.lang.System.currentTimeMillis();
                                long j48 = ~longValue14;
                                long j49 = currentTimeMillis50;
                                long j50 = ~j49;
                                long j51 = ~((-914941254) | longValue14);
                                long j52 = (((((longValue14 * 371) - 339443205234L) + (((~(j48 | j50)) | (~(914941253 | j49))) * (-370))) + ((((~(914941253 | j50)) | (~(j48 | j49))) | j51) * (-370))) + (j51 * 370)) - 1113770525;
                                int currentTimeMillis51 = (int) java.lang.System.currentTimeMillis();
                                int currentTimeMillis52 = (int) java.lang.System.currentTimeMillis();
                                if (((((int) (j52 >> 32)) & ((((~((~currentTimeMillis51) | (-2091247364))) | (-654020953)) * (-235)) + 806915077 + (((~((-2091247364) | currentTimeMillis51)) | (-654020953)) * (-470)) + (((~(currentTimeMillis51 | (-614564097))) | (-2130704220)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))) | (((((((~((-2033991417) | r7)) | (~((-823749470) | currentTimeMillis52))) * (-370)) - 635053777) + ((((~(currentTimeMillis52 | (-2033991417))) | (~((~currentTimeMillis52) | (-823749470)))) | (-2034073598)) * (-370))) - 987954460) & ((int) j52))) == 0) {
                                    i2 = 0;
                                }
                            } catch (java.lang.Throwable th4) {
                                java.lang.Throwable cause3 = th4.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th4;
                            }
                        }
                        if (i2 != 0) {
                            java.lang.Object[] objArr107 = {new int[]{0}, new int[]{i2}, null, new int[1]};
                            int currentTimeMillis53 = (int) java.lang.System.currentTimeMillis();
                            java.lang.Object[] objArr108 = {-2062849474, 16, java.lang.Integer.valueOf(((((-289425932) | currentTimeMillis53) * (-627)) - 1220172852) + (((~((-209953989) | currentTimeMillis53)) | 499371531) * (-627)) + (((~((~currentTimeMillis53) | 209953988)) | (~(499371531 | currentTimeMillis53))) * 627))};
                            java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj28 == null) {
                                java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.combineMeasuredStates(0, 0), 2713 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                byte b26 = (byte) ($$a[14] - 1);
                                java.lang.Object[] objArr109 = new java.lang.Object[1];
                                a(b26, (short) (b26 | 653), b26, objArr109);
                                obj28 = cls26.getMethod((java.lang.String) objArr109[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj28);
                            }
                            ((int[]) objArr107[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr108)).intValue();
                            return objArr107;
                        }
                        int indexOf3 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        int currentTimeMillis54 = (int) java.lang.System.currentTimeMillis();
                        int i188 = ~indexOf3;
                        int i189 = ~(((-65088) & i188) | ((-65088) ^ i188));
                        int i190 = ~currentTimeMillis54;
                        int i191 = (i190 ^ i188) | (i190 & i188);
                        int i192 = ~i191;
                        int i193 = (((indexOf3 * 483) + 15751054) - (~(-(-(((i192 ^ i189) | (i189 & i192)) * (-241)))))) - 1;
                        int i194 = (65087 | indexOf3) * (-482);
                        int i195 = (i193 ^ i194) + ((i194 & i193) << 1);
                        int i196 = ~(((-65088) & indexOf3) | (indexOf3 ^ (-65088)));
                        int i197 = ~(i191 | 65087);
                        int i198 = ((i197 ^ i196) | (i196 & i197)) * 241;
                        char c10 = (char) ((i195 ^ i198) + ((i198 & i195) << 1));
                        int i199 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                        int currentTimeMillis55 = (int) java.lang.System.currentTimeMillis();
                        int i200 = i199 * (-575);
                        int i201 = ((-571602897) & i200) + (i200 | (-571602897));
                        int i202 = ~i199;
                        int i203 = ~((984981008 & i202) | (984981008 ^ i202));
                        int i204 = ~((984981008 & currentTimeMillis55) | (984981008 ^ currentTimeMillis55));
                        int i205 = ((i204 ^ i203) | (i203 & i204)) * 576;
                        int i206 = ((i201 | i205) << 1) - (i201 ^ i205);
                        int i207 = ~(i202 | (-984981009));
                        int i208 = ~currentTimeMillis55;
                        int i209 = ~(i199 | (i208 ^ 984981008) | (984981008 & i208));
                        int i210 = -(-(((i209 ^ i207) | (i209 & i207)) * 576));
                        java.lang.Object[] objArr110 = new java.lang.Object[1];
                        b("\uefa8䩡㻅\u0efe", c10, "❆찿豱샐㼅ꦱﾢ弙䑎짹뱢郇羋", "\ue9fc\ue78d퍞ꂹ", (i206 & i210) + (i210 | i206) + (i203 * 576), objArr110);
                        java.lang.Object[] objArr111 = {(java.lang.String) objArr110[0]};
                        java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj29 == null) {
                            java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.widget.ExpandableListView.getPackedPositionChild(0L), 1921 - android.view.View.MeasureSpec.getMode(0), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                            byte[] bArr22 = $$a;
                            byte b27 = (byte) (bArr22[14] - 1);
                            java.lang.Object[] objArr112 = new java.lang.Object[1];
                            a(b27, b27, (byte) (-bArr22[16]), objArr112);
                            obj29 = cls27.getMethod((java.lang.String) objArr112[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj29);
                        }
                        java.lang.String str46 = (java.lang.String) ((java.lang.reflect.Method) obj29).invoke(null, objArr111);
                        if (str46 != null) {
                            java.lang.Object[] objArr113 = new java.lang.Object[1];
                            c("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000", false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 11, 0, 9}, objArr113);
                            java.lang.String[] strArr8 = {(java.lang.String) objArr113[0]};
                            int i211 = 0;
                            while (true) {
                                if (i211 > 0) {
                                    int i212 = getProfileVersion;
                                    getAid = ((i212 ^ 13) + ((i212 & 13) << 1)) % 128;
                                    java.lang.Object[] objArr114 = new java.lang.Object[1];
                                    b("ઈ㪤怘젟", (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "⏃\ue4b0餖\ue28f䴧져贤랋\u1f16テ㚨\uef4a", "\ue9fc\ue78d퍞ꂹ", android.view.KeyEvent.normalizeMetaState(0), objArr114);
                                    java.lang.String str47 = (java.lang.String) objArr114[0];
                                    int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                                    int currentTimeMillis56 = (int) java.lang.System.currentTimeMillis();
                                    int i213 = ~currentTimeMillis56;
                                    int i214 = (i213 ^ (-1431)) | (i213 & (-1431));
                                    int i215 = (packedPositionChild * (-129)) + 187330 + ((~((i214 ^ packedPositionChild) | (i214 & packedPositionChild))) * 130);
                                    int i216 = (packedPositionChild ^ (-1431)) | (packedPositionChild & (-1431));
                                    int i217 = i215 + ((~i216) * (-260));
                                    int i218 = ~packedPositionChild;
                                    int i219 = ~((i218 ^ 1430) | (i218 & 1430));
                                    int i220 = ~((currentTimeMillis56 ^ i216) | (i216 & currentTimeMillis56));
                                    int i221 = -(-(((i219 ^ i220) | (i220 & i219)) * 130));
                                    java.lang.Object[] objArr115 = new java.lang.Object[1];
                                    b("兪쨴镒\uf605", (char) ((i217 & i221) + (i221 | i217)), "ਬ蠆ꍪ❰菱髑숰磥쏄ⰵ\uf16d賵梨⦡㩒㖯", "\ue9fc\ue78d퍞ꂹ", android.widget.ExpandableListView.getPackedPositionType(0L), objArr115);
                                    java.lang.String str48 = (java.lang.String) objArr115[0];
                                    java.lang.Object[] objArr116 = new java.lang.Object[1];
                                    c("\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", true, new int[]{303, 17, 128, 0}, objArr116);
                                    java.lang.String str49 = (java.lang.String) objArr116[0];
                                    java.lang.Object[] objArr117 = new java.lang.Object[1];
                                    c("\u0000\u0000\u0000\u0001\u0001\u0001", true, new int[]{320, 6, 69, 2}, objArr117);
                                    java.lang.String str50 = (java.lang.String) objArr117[0];
                                    java.lang.Object[] objArr118 = new java.lang.Object[1];
                                    b("\u2d2e\uea0e탬뷖", (char) ((-2) - (~(-(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))))), "Ｂ\uf56a奆沴뮉됄⋸ᔮ䄈멮⨍▸", "\ue9fc\ue78d퍞ꂹ", (-(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))) - 1, objArr118);
                                    java.lang.String str51 = (java.lang.String) objArr118[0];
                                    char c11 = (char) (29819 - (~(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)))));
                                    int i222 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                                    int currentTimeMillis57 = (int) java.lang.System.currentTimeMillis();
                                    int i223 = (i222 * 51) + 707510109;
                                    int i224 = ((i222 ^ currentTimeMillis57) | (i222 & currentTimeMillis57)) * (-50);
                                    int i225 = (i223 & i224) + (i223 | i224);
                                    int i226 = ~((~i222) | 365048556 | currentTimeMillis57);
                                    int i227 = ~currentTimeMillis57;
                                    int i228 = (365048556 & i227) | (365048556 ^ i227);
                                    int i229 = ~(i228 | i222);
                                    int i230 = -(-(((i226 ^ i229) | (i226 & i229)) * 50));
                                    int i231 = (i225 & i230) + (i230 | i225);
                                    int i232 = ~i228;
                                    int i233 = ~(365048556 | i222);
                                    int i234 = (i232 ^ i233) | (i232 & i233);
                                    int i235 = ~(i222 | i227);
                                    int i236 = -(-(((i235 ^ i234) | (i235 & i234)) * 50));
                                    java.lang.Object[] objArr119 = new java.lang.Object[1];
                                    b("ጱ㷍篪빴", c11, "九ɪ퐿克쥠趺刪⠽雸ꨵ寁労ꒆ귲貰貲䬂", "\ue9fc\ue78d퍞ꂹ", (i231 & i236) + (i236 | i231), objArr119);
                                    java.lang.String str52 = (java.lang.String) objArr119[0];
                                    java.lang.Object[] objArr120 = new java.lang.Object[1];
                                    c("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001", false, new int[]{326, 21, 0, 11}, objArr120);
                                    java.lang.String str53 = (java.lang.String) objArr120[0];
                                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                                    c("\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", false, new int[]{347, 16, 73, 0}, objArr121);
                                    java.lang.String str54 = (java.lang.String) objArr121[0];
                                    char windowTouchSlop = (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                                    int alpha = android.graphics.Color.alpha(0);
                                    int currentTimeMillis58 = (int) java.lang.System.currentTimeMillis();
                                    int i237 = alpha * 1773;
                                    int i238 = ((810873536 | i237) << 1) - (i237 ^ 810873536);
                                    int i239 = ~alpha;
                                    int i240 = ~((i239 ^ 1549045695) | (1549045695 & i239));
                                    int i241 = ~((1549045695 ^ currentTimeMillis58) | (1549045695 & currentTimeMillis58));
                                    int i242 = ~currentTimeMillis58;
                                    int i243 = (i240 ^ i241) | (i240 & i241);
                                    int i244 = (i242 & alpha) | (i242 ^ alpha);
                                    int i245 = -(-((i243 | (~((-1549045696) | i244))) * 886));
                                    int i246 = ((i238 | i245) << 1) - (i245 ^ i238);
                                    int i247 = -(-(((~(i242 | (-1549045696))) | alpha) * (-1772)));
                                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                                    b("䂺ꭰ뮣킄", windowTouchSlop, "噉ꡟ놢ꂥ䩠㶕ኼ鍕춅\ua9ff兒泞\u2efd뫈\u0fdc⍀侪蹽ᡍ☌꜖麗毩꿀⍙", "\ue9fc\ue78d퍞ꂹ", ((~i244) * 886) + (i246 ^ i247) + ((i247 & i246) << 1), objArr122);
                                    java.lang.String str55 = (java.lang.String) objArr122[0];
                                    java.lang.Object[] objArr123 = new java.lang.Object[1];
                                    c("\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true, new int[]{363, 13, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 0}, objArr123);
                                    java.lang.String str56 = (java.lang.String) objArr123[0];
                                    char indexOf4 = (char) android.text.TextUtils.indexOf("", "");
                                    int i248 = -(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                    java.lang.Object[] objArr124 = new java.lang.Object[1];
                                    b("稹뫼ឍ\ufff5", indexOf4, "䑨빢욲갞戓巸凫\uf848ꤍ", "\ue9fc\ue78d퍞ꂹ", ((-1917125510) & i248) + (i248 | (-1917125510)), objArr124);
                                    java.lang.String str57 = (java.lang.String) objArr124[0];
                                    java.lang.Object[] objArr125 = new java.lang.Object[1];
                                    c("\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000", true, new int[]{376, 8, 0, 0}, objArr125);
                                    java.lang.String[] strArr9 = {str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, (java.lang.String) objArr125[0]};
                                    int i249 = 0;
                                    while (i249 < 12) {
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        sb.append(strArr9[i249]);
                                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                                        c("\u0001\u0000", false, new int[]{95, 2, 0, 2}, objArr126);
                                        sb.append((java.lang.String) objArr126[0]);
                                        java.lang.Object[] objArr127 = {sb.toString()};
                                        java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                        if (obj30 == null) {
                                            java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 36, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 33099));
                                            byte[] bArr23 = $$a;
                                            java.lang.Object[] objArr128 = new java.lang.Object[1];
                                            a((byte) (bArr23[18] - 1), (short) 618, (byte) (-bArr23[16]), objArr128);
                                            obj30 = cls28.getMethod((java.lang.String) objArr128[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj30);
                                        }
                                        long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr127)).longValue();
                                        int currentTimeMillis59 = (int) java.lang.System.currentTimeMillis();
                                        long j53 = ~longValue15;
                                        long j54 = currentTimeMillis59;
                                        long j55 = ~j54;
                                        int i250 = i249;
                                        long j56 = (~(j53 | j55)) | (~(j53 | 793546468)) | (~(793546468 | j55));
                                        long j57 = ((591 * longValue15) - 467398869652L) + (((~(longValue15 | (-793546469) | j54)) | j56) * 590) + (j56 * (-1180)) + (((~(j55 | longValue15)) | (~((-793546469) | j55))) * 590) + 113924270;
                                        int i251 = ((int) (j57 >> 32)) & (((((-151539717) | r3) * (-381)) - 2063056970) + (((~((~((int) java.lang.System.currentTimeMillis())) | 1181844179)) | (-1229541381)) * 381) + 1902056948);
                                        int i252 = (int) j57;
                                        int currentTimeMillis60 = (int) java.lang.System.currentTimeMillis();
                                        int i253 = ~((-700020555) | currentTimeMillis60);
                                        int i254 = ~currentTimeMillis60;
                                        int i255 = i252 & (((690046016 | i253) * (-280)) + 643235017 + ((i253 | (~(2137246964 | currentTimeMillis60))) * 140) + (((~(currentTimeMillis60 | (-9974539))) | (~(i254 | (-690046017))) | (~(2147221502 | i254))) * 140));
                                        if (((i251 ^ i255) | (i255 & i251)) != 0) {
                                            i3 = (i250 ^ 110) + ((i250 & 110) << 1);
                                            break;
                                        }
                                        int i256 = (i250 & (-78)) + (i250 | (-78));
                                        i249 = (i256 ^ 79) + ((i256 & 79) << 1);
                                    }
                                } else {
                                    if (str46.contains(strArr8[i211])) {
                                        break;
                                    }
                                    int i257 = (i211 & 7) + (i211 | 7);
                                    i211 = (i257 ^ (-6)) + ((i257 & (-6)) << 1);
                                }
                            }
                        }
                        i3 = 0;
                        if (i3 != 0) {
                            java.lang.Object[] objArr129 = {new int[]{0}, new int[]{i3}, null, new int[1]};
                            int i258 = ~((int) java.lang.System.currentTimeMillis());
                            java.lang.Object[] objArr130 = {-2062849474, 16, java.lang.Integer.valueOf((((-4325642) | i258) * 494) + 567717725 + (((~(i258 | (-175809290))) | 1052292816) * 494))};
                            java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj31 == null) {
                                java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 51, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2713, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                byte b28 = (byte) ($$a[14] - 1);
                                java.lang.Object[] objArr131 = new java.lang.Object[1];
                                a(b28, (short) (b28 | 653), b28, objArr131);
                                obj31 = cls29.getMethod((java.lang.String) objArr131[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj31);
                            }
                            ((int[]) objArr129[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr130)).intValue();
                            return objArr129;
                        }
                        long[] jArr = {472001035};
                        java.lang.Object[] objArr132 = new java.lang.Object[1];
                        c("\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001", true, new int[]{384, 17, 0, 0}, objArr132);
                        try {
                            bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream((java.lang.String) objArr132[0]));
                            j = 0;
                        } catch (java.io.IOException unused2) {
                            bufferedInputStream = null;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            bufferedInputStream = null;
                        }
                        loop6: while (true) {
                            try {
                                int read = bufferedInputStream.read();
                                if (read != -1) {
                                    int i259 = getProfileVersion;
                                    int i260 = ((i259 | 7) << 1) - (i259 ^ 7);
                                    getAid = i260 % 128;
                                    if (i260 % 2 == 0) {
                                        j = ((j >>> 5) & read) / kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                                        i5 = 1;
                                    } else {
                                        j = ((j << 5) ^ read) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                                        i5 = 0;
                                    }
                                    while (i5 <= 0) {
                                        int i261 = getProfileVersion;
                                        getAid = ((i261 & 31) + (i261 | 31)) % 128;
                                        if (j == jArr[i5]) {
                                            break loop6;
                                        }
                                        int i262 = (i5 & (-55)) + (i5 | (-55));
                                        i5 = ((i262 & 56) << 1) + (i262 ^ 56);
                                    }
                                }
                            } catch (java.io.IOException unused3) {
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                if (bufferedInputStream == null) {
                                    throw th;
                                }
                                try {
                                    bufferedInputStream.close();
                                    throw th;
                                } catch (java.lang.Exception unused4) {
                                    throw th;
                                }
                            }
                            try {
                                bufferedInputStream.close();
                                break;
                            } catch (java.lang.Exception unused5) {
                            }
                        }
                        i4 = 0;
                        if (i4 != 0) {
                            java.lang.Object[] objArr133 = {new int[]{0}, new int[]{i4}, null, new int[1]};
                            int currentTimeMillis61 = (int) java.lang.System.currentTimeMillis();
                            int i263 = ~((-913878918) | (~currentTimeMillis61));
                            java.lang.Object[] objArr134 = {-2062849474, 16, java.lang.Integer.valueOf((((((-1048166326) | i263) | (~(913878917 | currentTimeMillis61))) * (-338)) - 1383574397) + (((~(currentTimeMillis61 | (-134287409))) | i263) * 338))};
                            java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj32 == null) {
                                java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, android.graphics.Color.alpha(0) + 2713, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                byte b29 = (byte) ($$a[14] - 1);
                                java.lang.Object[] objArr135 = new java.lang.Object[1];
                                a(b29, (short) (b29 | 653), b29, objArr135);
                                obj32 = cls30.getMethod((java.lang.String) objArr135[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj32);
                            }
                            ((int[]) objArr133[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr134)).intValue();
                            return objArr133;
                        }
                        long[] jArr2 = {472001035};
                        java.lang.Object[] objArr136 = new java.lang.Object[1];
                        c("\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", false, new int[]{401, 22, 34, 4}, objArr136);
                        java.lang.Object[] objArr137 = {(java.lang.String) objArr136[0], 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr2};
                        java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                        if (obj33 == null) {
                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 3096 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                            byte[] bArr24 = $$a;
                            byte b30 = (byte) (bArr24[14] - 1);
                            java.lang.Object[] objArr138 = new java.lang.Object[1];
                            a(b30, b30, (byte) (-bArr24[16]), objArr138);
                            obj33 = cls31.getMethod((java.lang.String) objArr138[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj33);
                        }
                        long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj33).invoke(null, objArr137)).longValue();
                        int currentTimeMillis62 = (int) java.lang.System.currentTimeMillis();
                        long j58 = ~longValue16;
                        long j59 = ~((~currentTimeMillis62) | longValue16);
                        long j60 = (((((971 * longValue16) + 3688560789718L) + (((~((-1902300562) | j58)) | j59) * (-970))) + ((~(longValue16 | 1902300561)) * 1940)) + (((~(1902300561 | j58)) | j59) * 970)) - 8347348;
                        int currentTimeMillis63 = (int) java.lang.System.currentTimeMillis();
                        int i264 = ~currentTimeMillis63;
                        int i265 = ((int) (j60 >> 32)) & (((1979448301 | currentTimeMillis63) * (-676)) + 987794466 + (((~(1709427084 | i264)) | (-1979448302)) * 676) + (((~(currentTimeMillis63 | (-270021218))) | (~(i264 | 272200673)) | 1707247628) * 676));
                        int currentTimeMillis64 = (int) java.lang.System.currentTimeMillis();
                        int i266 = ~currentTimeMillis64;
                        int i267 = ((int) j60) & ((((~(1053370311 | i266)) | (~(383856098 | currentTimeMillis64))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1422304331 + (((~(currentTimeMillis64 | (-2099233))) | (~(i266 | (-671613446)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                        if (((i265 ^ i267) | (i265 & i267)) != 0) {
                            getAid = (getProfileVersion + 13) % 128;
                            java.lang.Object[] objArr139 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, null, new int[1]};
                            int currentTimeMillis65 = (int) java.lang.System.currentTimeMillis();
                            int i268 = ~currentTimeMillis65;
                            java.lang.Object[] objArr140 = {-2062849474, 16, java.lang.Integer.valueOf((((~((-136742393) | i268)) | (-572583128)) * (-865)) + 1664211792 + ((~(currentTimeMillis65 | 136742392)) * 865) + (((~((-572583128) | i268)) | (~(i268 | 136742392))) * 865))};
                            java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj34 == null) {
                                java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 50, android.graphics.Color.blue(0) + 2713, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                byte b31 = (byte) ($$a[14] - 1);
                                java.lang.Object[] objArr141 = new java.lang.Object[1];
                                a(b31, (short) (b31 | 653), b31, objArr141);
                                obj34 = cls32.getMethod((java.lang.String) objArr141[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj34);
                            }
                            ((int[]) objArr139[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr140)).intValue();
                            return objArr139;
                        }
                        java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(724989957);
                        if (obj35 == null) {
                            java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.view.KeyEvent.normalizeMetaState(0), 1890 - android.view.View.resolveSize(0, 0), (char) ((android.os.Process.myTid() >> 22) + 3600));
                            byte[] bArr25 = $$a;
                            byte b32 = (byte) (bArr25[14] - 1);
                            java.lang.Object[] objArr142 = new java.lang.Object[1];
                            a(b32, b32, (byte) (-bArr25[16]), objArr142);
                            obj35 = cls33.getMethod((java.lang.String) objArr142[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(724989957, obj35);
                        }
                        long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj35).invoke(null, null)).longValue();
                        int currentTimeMillis66 = (int) java.lang.System.currentTimeMillis();
                        long j61 = ~longValue17;
                        long j62 = ~currentTimeMillis66;
                        long j63 = ((((((-493) * longValue17) - 464676559380L) + (((-938740524) | j61) * (-988))) + (((938740523 | longValue17) | j62) * 494)) + ((((~(longValue17 | j62)) | (~(j61 | 938740523))) | (~((-938740524) | longValue17))) * 494)) - 940507856;
                        int i269 = ~((int) java.lang.System.currentTimeMillis());
                        int i270 = ((int) (j63 >> 32)) & ((((~(r4 | (-1723409749))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 1249702198) + (((-606150741) | i269) * (-216)) + (((~(i269 | (-1723409749))) | (-1134331137)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
                        int currentTimeMillis67 = (int) java.lang.System.currentTimeMillis();
                        int i271 = ~currentTimeMillis67;
                        int i272 = ((int) j63) & (((((~((-268575785) | i271)) | (~((-549722177) | currentTimeMillis67))) * 988) - 1780904435) + (((~(currentTimeMillis67 | 618928449)) | (-887504234) | (~(i271 | (-549722177)))) * 988));
                        if (((i270 ^ i272) | (i270 & i272)) != 0) {
                            java.lang.Object[] objArr143 = {new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i4}, null, new int[1]};
                            int currentTimeMillis68 = (int) java.lang.System.currentTimeMillis();
                            java.lang.Object[] objArr144 = {-2062849474, 16, java.lang.Integer.valueOf(((((~(96713997 | currentTimeMillis68)) | 96505856) * (-502)) - 1501372931) + ((~((~currentTimeMillis68) | 902545373)) * (-502)) + (((~(currentTimeMillis68 | (-806039518))) | 96713997) * 502))};
                            java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj36 == null) {
                                java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49, 2713 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                byte b33 = (byte) ($$a[14] - 1);
                                java.lang.Object[] objArr145 = new java.lang.Object[1];
                                a(b33, (short) (b33 | 653), b33, objArr145);
                                obj36 = cls34.getMethod((java.lang.String) objArr145[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                            }
                            ((int[]) objArr143[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr144)).intValue();
                            return objArr143;
                        }
                        java.lang.Object[] objArr146 = {2};
                        java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                        if (obj37 == null) {
                            java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2364, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                            byte[] bArr26 = $$a;
                            byte b34 = (byte) (bArr26[14] - 1);
                            java.lang.Object[] objArr147 = new java.lang.Object[1];
                            a(b34, b34, (byte) (-bArr26[16]), objArr147);
                            obj37 = cls35.getMethod((java.lang.String) objArr147[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj37);
                        }
                        long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj37).invoke(null, objArr146)).longValue();
                        int currentTimeMillis69 = (int) java.lang.System.currentTimeMillis();
                        long j64 = ~longValue18;
                        long j65 = currentTimeMillis69;
                        long j66 = ~j65;
                        long j67 = ~(j66 | longValue18);
                        long j68 = (517 * longValue18) + 341577176295L + (((~(j64 | j65)) | (~((-663256653) | j66)) | j67) * (-516)) + (((~(663256652 | j64 | j65)) | (~(663256652 | j66 | longValue18))) * 516) + (((~(longValue18 | 663256652)) | j67) * 516) + 2071166852;
                        int currentTimeMillis70 = (int) java.lang.System.currentTimeMillis();
                        int i273 = ((int) (j68 >> 32)) & (((((~(1906608788 | r7)) | (-951132097)) * 226) - 2055567968) + (((~((~currentTimeMillis70) | (-135337281))) | (~(951132096 | currentTimeMillis70)) | 1090813972) * (-113)) + ((~(currentTimeMillis70 | 1906608788)) * 113));
                        int currentTimeMillis71 = (int) java.lang.System.currentTimeMillis();
                        int i274 = ~currentTimeMillis71;
                        int i275 = ((int) j68) & ((((1243742281 | r7) * (-712)) - 662547107) + (((~(currentTimeMillis71 | 2050746191)) | (~(i274 | (-1243742282)))) * (-712)) + (((-2050736976) | (~(807003910 | i274))) * 712));
                        if (((i275 ^ i273) | (i273 & i275)) == 2) {
                            java.lang.Object[] objArr148 = {new int[]{0}, new int[]{270}, null, new int[1]};
                            int currentTimeMillis72 = (int) java.lang.System.currentTimeMillis();
                            int i276 = ~(1002807798 | currentTimeMillis72);
                            java.lang.Object[] objArr149 = {-2062849474, 16, java.lang.Integer.valueOf((((-1006612471) | i276) * (-814)) + 1279360922 + ((i276 | (~((~currentTimeMillis72) | 293482278)) | 289677606) * 407) + (((~(currentTimeMillis72 | (-1002807799))) | 289677606 | (~((-293482279) | currentTimeMillis72))) * 407))};
                            java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj38 == null) {
                                java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2713, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                                byte b35 = (byte) ($$a[14] - 1);
                                java.lang.Object[] objArr150 = new java.lang.Object[1];
                                a(b35, (short) (b35 | 653), b35, objArr150);
                                obj38 = cls36.getMethod((java.lang.String) objArr150[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                            }
                            ((int[]) objArr148[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr149)).intValue();
                            return objArr148;
                        }
                        java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1411285061);
                        if (obj39 == null) {
                            java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 40, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 3197, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                            java.lang.Object[] objArr151 = new java.lang.Object[1];
                            a((byte) (-$$a[16]), (short) 612, r3[21], objArr151);
                            obj39 = cls37.getMethod((java.lang.String) objArr151[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1411285061, obj39);
                        }
                        long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) obj39).invoke(null, null)).longValue();
                        long currentTimeMillis73 = (int) java.lang.System.currentTimeMillis();
                        long j69 = ~((-1361061920) | longValue19);
                        long j70 = ((-375) * longValue19) + 510398220000L + (((~((~longValue19) | 1361061919)) | currentTimeMillis73 | j69) * 376) + (((~((~currentTimeMillis73) | (-1361061920))) | j69) * (-376)) + (((~(1361061919 | currentTimeMillis73)) | longValue19) * 376) + 1457307281;
                        int currentTimeMillis74 = (int) java.lang.System.currentTimeMillis();
                        int i277 = ~currentTimeMillis74;
                        int currentTimeMillis75 = (int) java.lang.System.currentTimeMillis();
                        if (((((int) (j70 >> 32)) & (((((~(171530463 | i277)) | 1608756874) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 1453938172) + (((~(i277 | 1610350303)) | (~((-1593430) | currentTimeMillis74))) * (-519)) + (((~(currentTimeMillis74 | 1608756874)) | (-171530464)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))) | ((((((~((-1194007872) | currentTimeMillis75)) | 1126829334) * 336) - 501357939) + (((~(1663733014 | currentTimeMillis75)) | (-1730911552)) * (-168)) + (((~((~currentTimeMillis75) | 1663733014)) | (-1194007872)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)) & ((int) j70))) != 0) {
                            java.lang.Object[] objArr152 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, null, new int[1]};
                            int currentTimeMillis76 = (int) java.lang.System.currentTimeMillis();
                            java.lang.Object[] objArr153 = {-2062849474, 16, java.lang.Integer.valueOf((((~((~currentTimeMillis76) | (-539443783))) * 130) - 1035516495) + (((~(currentTimeMillis76 | (-539443783))) | 167780489) * 130))};
                            java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj40 == null) {
                                java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2712, (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                byte b36 = (byte) ($$a[14] - 1);
                                java.lang.Object[] objArr154 = new java.lang.Object[1];
                                a(b36, (short) (b36 | 653), b36, objArr154);
                                obj40 = cls38.getMethod((java.lang.String) objArr154[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj40);
                            }
                            ((int[]) objArr152[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr153)).intValue();
                            return objArr152;
                        }
                        java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(502613909);
                        if (obj41 == null) {
                            java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 41, android.view.View.MeasureSpec.getMode(0) + 3197, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            byte[] bArr27 = $$a;
                            byte b37 = (byte) (bArr27[14] - 1);
                            java.lang.Object[] objArr155 = new java.lang.Object[1];
                            a(b37, b37, (byte) (-bArr27[16]), objArr155);
                            obj41 = cls39.getMethod((java.lang.String) objArr155[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(502613909, obj41);
                        }
                        long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) obj41).invoke(null, null)).longValue();
                        int currentTimeMillis77 = (int) java.lang.System.currentTimeMillis();
                        long j71 = ~longValue20;
                        long j72 = currentTimeMillis77;
                        long j73 = ~j72;
                        long j74 = ~(j73 | longValue20);
                        long j75 = ((517 * longValue20) - 9946806305L) + (((~(j71 | j72)) | (~(19314187 | j73)) | j74) * (-516)) + (((~((-19314188) | j71 | j72)) | (~((-19314188) | j73 | longValue20))) * 516) + (((~(longValue20 | (-19314188))) | j74) * 516) + 933555703;
                        int currentTimeMillis78 = (int) java.lang.System.currentTimeMillis();
                        int i278 = ~currentTimeMillis78;
                        int i279 = ~(currentTimeMillis78 | (-524585));
                        int i280 = ~(((int) java.lang.System.currentTimeMillis()) | 217236599);
                        if (((((int) j75) & ((((9437217 | i280) * (-196)) - 1661505087) + ((i280 | 207799382) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))) | (((int) (j75 >> 32)) & ((((((~(207489982 | i278)) | (-1851681792)) | i279) * (-713)) - 630959806) + (i279 * 1426) + ((~((-1644716394) | i278)) * 713)))) != 0) {
                            java.lang.Object[] objArr156 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, null, new int[1]};
                            int currentTimeMillis79 = (int) java.lang.System.currentTimeMillis();
                            int i281 = ~currentTimeMillis79;
                            java.lang.Object[] objArr157 = {-2062849474, 16, java.lang.Integer.valueOf((((1331852 | currentTimeMillis79) * 988) - 658810301) + (((~(354276012 | i281)) | 2105347) * (-1976)) + (((~(currentTimeMillis79 | (-355049508))) | 1331852 | (~(i281 | 355049507))) * 988))};
                            java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj42 == null) {
                                java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 50, 2713 - android.text.TextUtils.getOffsetAfter("", 0), (char) android.text.TextUtils.indexOf("", ""));
                                byte b38 = (byte) ($$a[14] - 1);
                                java.lang.Object[] objArr158 = new java.lang.Object[1];
                                a(b38, (short) (b38 | 653), b38, objArr158);
                                obj42 = cls40.getMethod((java.lang.String) objArr158[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj42);
                            }
                            ((int[]) objArr156[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj42).invoke(null, objArr157)).intValue();
                            return objArr156;
                        }
                        java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1293945309);
                        if (obj43 == null) {
                            java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 2836 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                            byte[] bArr28 = $$a;
                            byte b39 = (byte) (bArr28[14] - 1);
                            java.lang.Object[] objArr159 = new java.lang.Object[1];
                            a(b39, b39, (byte) (-bArr28[16]), objArr159);
                            obj43 = cls41.getMethod((java.lang.String) objArr159[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1293945309, obj43);
                        }
                        long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) obj43).invoke(null, null)).longValue();
                        int currentTimeMillis80 = (int) java.lang.System.currentTimeMillis();
                        long j76 = ~longValue21;
                        long j77 = currentTimeMillis80;
                        long j78 = ~j77;
                        long j79 = ~((-636108122) | j78);
                        long j80 = (((((713 * longValue21) + 452272874742L) + (((~(j76 | (-636108122))) | j79) * (-712))) + (((~((j76 | j78) | (-636108122))) | (~((longValue21 | (-636108122)) | j77))) * (-712))) + ((j76 | j79) * 712)) - 170186633;
                        int currentTimeMillis81 = (int) java.lang.System.currentTimeMillis();
                        int i282 = ~currentTimeMillis81;
                        int i283 = ((int) (j80 >> 32)) & ((((~(139497731 | i282)) | (~((-1576724143) | i282))) * (-867)) + 1972008040 + (((~(139497731 | currentTimeMillis81)) | 1437230764 | (~((-1576724143) | currentTimeMillis81))) * (-1734)) + (((~(currentTimeMillis81 | 1576728495)) | (~(i282 | (-1437230765))) | (~((-139493379) | currentTimeMillis81))) * 867));
                        int i284 = ((int) j80) & (((((~((-363861707) | r2)) | (-1073364704)) * (-756)) - 950580143) + (((~((int) java.lang.System.currentTimeMillis())) | (-363861707)) * 756));
                        if (((i284 ^ i283) | (i283 & i284)) != 0) {
                            java.lang.Object[] objArr160 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, null, new int[1]};
                            int currentTimeMillis82 = (int) java.lang.System.currentTimeMillis();
                            java.lang.Object[] objArr161 = {-2062849474, 16, java.lang.Integer.valueOf(((((~(3217972 | r3)) | 712543492) * (-90)) - 1730764494) + (((~(3217972 | currentTimeMillis82)) | 70192) * (-45)) + (((~(currentTimeMillis82 | (-712543493))) | 3217972 | (~((~currentTimeMillis82) | 712543492))) * 45))};
                            java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj44 == null) {
                                java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, android.graphics.Color.red(0) + 2713, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                byte b40 = (byte) ($$a[14] - 1);
                                java.lang.Object[] objArr162 = new java.lang.Object[1];
                                a(b40, (short) (b40 | 653), b40, objArr162);
                                obj44 = cls42.getMethod((java.lang.String) objArr162[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj44);
                            }
                            ((int[]) objArr160[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj44).invoke(null, objArr161)).intValue();
                            return objArr160;
                        }
                        long[] jArr3 = {624887784092251L};
                        java.lang.Object[] objArr163 = new java.lang.Object[1];
                        c("\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001", true, new int[]{384, 17, 0, 0}, objArr163);
                        java.lang.Object[] objArr164 = {(java.lang.String) objArr163[0], 3, 2251799813685247L, jArr3};
                        java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                        if (obj45 == null) {
                            java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36, android.widget.ExpandableListView.getPackedPositionChild(0L) + 3097, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                            byte[] bArr29 = $$a;
                            byte b41 = (byte) (bArr29[14] - 1);
                            java.lang.Object[] objArr165 = new java.lang.Object[1];
                            a(b41, b41, (byte) (-bArr29[16]), objArr165);
                            obj45 = cls43.getMethod((java.lang.String) objArr165[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj45);
                        }
                        long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) obj45).invoke(null, objArr164)).longValue();
                        int currentTimeMillis83 = (int) java.lang.System.currentTimeMillis();
                        long j81 = ~longValue22;
                        long j82 = currentTimeMillis83;
                        long j83 = ~j82;
                        long j84 = ((((((-97) * longValue22) - 12605984100L) + (((~(j81 | j83)) | (~((-252119682) | j81))) * 98)) + ((((~(252119681 | j83)) | j81) | (~((-252119682) | j82))) * (-49))) + (((~(longValue22 | (-252119682))) | (~(j81 | j82))) * 49)) - 1658528228;
                        int currentTimeMillis84 = (int) java.lang.System.currentTimeMillis();
                        int i285 = ((int) (j84 >> 32)) & (((((~((~currentTimeMillis84) | (-136945995))) | (~((-1075184262) | currentTimeMillis84))) * (-302)) - 624827658) + ((~((-136945995) | currentTimeMillis84)) * (-604)) + (((~(currentTimeMillis84 | (-1212130256))) | 570426368) * 302));
                        int currentTimeMillis85 = (int) java.lang.System.currentTimeMillis();
                        int i286 = ((int) j84) & ((((~(1559213810 | currentTimeMillis85)) | 50348296) * 345) + 484646344 + (((~(1559213810 | (~currentTimeMillis85))) | 71639104) * 345) + ((~(currentTimeMillis85 | (-50348297))) * 345));
                        if (((i285 ^ i286) | (i285 & i286)) != 0) {
                            java.lang.Object[] objArr166 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, null, new int[1]};
                            int currentTimeMillis86 = (int) java.lang.System.currentTimeMillis();
                            java.lang.Object[] objArr167 = {-2062849474, 16, java.lang.Integer.valueOf((((672140292 | r3) * (-476)) - 1761783605) + ((~((-27672780) | currentTimeMillis86)) * 952) + ((~((~currentTimeMillis86) | (-27672780))) * 476))};
                            java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj46 == null) {
                                java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 50, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                byte b42 = (byte) ($$a[14] - 1);
                                java.lang.Object[] objArr168 = new java.lang.Object[1];
                                a(b42, (short) (b42 | 653), b42, objArr168);
                                obj46 = cls44.getMethod((java.lang.String) objArr168[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj46);
                            }
                            ((int[]) objArr166[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj46).invoke(null, objArr167)).intValue();
                            return objArr166;
                        }
                        java.lang.Object[] objArr169 = new java.lang.Object[1];
                        b("芣畨脾曷", (char) android.view.KeyEvent.keyCodeFromString(""), "邑阬\uaa3b⇈曌섯潒Ჲ\ueed0嵈씸", "\ue9fc\ue78d퍞ꂹ", 1047881857 - (~(-(-(android.view.ViewConfiguration.getTouchSlop() >> 8)))), objArr169);
                        java.lang.Object[] objArr170 = {(java.lang.String) objArr169[0]};
                        java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                        if (obj47 == null) {
                            java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.KeyEvent.normalizeMetaState(0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3160, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33099));
                            byte[] bArr30 = $$a;
                            byte b43 = (byte) (bArr30[14] - 1);
                            java.lang.Object[] objArr171 = new java.lang.Object[1];
                            a(b43, b43, (byte) (-bArr30[16]), objArr171);
                            obj47 = cls45.getMethod((java.lang.String) objArr171[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj47);
                        }
                        long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) obj47).invoke(null, objArr170)).longValue();
                        int currentTimeMillis87 = (int) java.lang.System.currentTimeMillis();
                        long j85 = ~longValue23;
                        long j86 = currentTimeMillis87;
                        long j87 = (((((319 * longValue23) + 186868310980L) + (((~(((~j86) | (-589489940)) | longValue23)) | (~((589489939 | j85) | j86))) * (-318))) + (((~((-589489940) | j85)) | (~((-589489940) | j86))) * (-318))) + (((~(589489939 | j86)) | j85) * 318)) - 748178168;
                        int currentTimeMillis88 = (int) java.lang.System.currentTimeMillis();
                        int i287 = ((int) (j87 >> 32)) & ((((~((-1207967811) | currentTimeMillis88)) | 38340880) * 449) + 155187144 + (((~((~currentTimeMillis88) | (-1207967811))) | 38340880) * 449));
                        int currentTimeMillis89 = (int) java.lang.System.currentTimeMillis();
                        int i288 = ~currentTimeMillis89;
                        int i289 = ((int) j87) & (((((~((-227143676) | i288)) | (~(1664370085 | currentTimeMillis89))) * 1900) - 1871736089) + (((~((-1664370086) | i288)) | (~(227143675 | currentTimeMillis89))) * (-950)) + (((~(currentTimeMillis89 | (-1664370086))) | (~(i288 | 227143675))) * 950));
                        if (((i287 ^ i289) | (i287 & i289)) != 0) {
                            int i290 = getProfileVersion;
                            getAid = (((i290 | 119) << 1) - (i290 ^ 119)) % 128;
                            java.lang.Object[] objArr172 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, null, new int[1]};
                            int currentTimeMillis90 = (int) java.lang.System.currentTimeMillis();
                            java.lang.Object[] objArr173 = {-2062849474, 16, java.lang.Integer.valueOf(((((-67373710) | currentTimeMillis90) * (-627)) - 1220172852) + (((~(202247101 | currentTimeMillis90)) | 911572621) * (-627)) + (((~((~currentTimeMillis90) | (-202247102))) | (~(911572621 | currentTimeMillis90))) * 627))};
                            java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj48 == null) {
                                java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777166) - android.graphics.Color.rgb(0, 0, 0), 2713 - android.graphics.Color.alpha(0), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                byte b44 = (byte) ($$a[14] - 1);
                                java.lang.Object[] objArr174 = new java.lang.Object[1];
                                a(b44, (short) (b44 | 653), b44, objArr174);
                                obj48 = cls46.getMethod((java.lang.String) objArr174[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj48);
                            }
                            ((int[]) objArr172[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj48).invoke(null, objArr173)).intValue();
                            return objArr172;
                        }
                        getProfileVersion = (getAid + 21) % 128;
                        java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                        if (obj49 == null) {
                            java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2185, (char) (59514 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                            byte[] bArr31 = $$a;
                            byte b45 = (byte) (bArr31[14] - 1);
                            java.lang.Object[] objArr175 = new java.lang.Object[1];
                            a(b45, b45, (byte) (-bArr31[16]), objArr175);
                            obj49 = cls47.getMethod((java.lang.String) objArr175[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj49);
                        }
                        long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) obj49).invoke(null, null)).longValue();
                        long j88 = ~((int) java.lang.System.currentTimeMillis());
                        long j89 = ((((((-782) * longValue24) - 8719160352L) + ((~longValue24) * (-783))) + ((~((11121377 | j88) | longValue24)) * (-783))) + (((~(longValue24 | j88)) | 11121377) * 783)) - 860969208;
                        int currentTimeMillis91 = (int) java.lang.System.currentTimeMillis();
                        int i291 = ~currentTimeMillis91;
                        int i292 = ((int) (j89 >> 32)) & ((((-1941583097) | currentTimeMillis91) * 140) + 206575398 + (((~((-1941583097) | i291)) | 1092616352) * (-280)) + (((~(currentTimeMillis91 | (-1092616353))) | (~(i291 | (-916157789))) | 67191044) * 140));
                        int currentTimeMillis92 = (int) java.lang.System.currentTimeMillis();
                        int i293 = ((int) j89) & (((((~((-844857583) | r5)) | (~(2012981743 | currentTimeMillis92))) * (-831)) - 1403991666) + ((~((-98441) | currentTimeMillis92)) * (-1662)) + (((~(currentTimeMillis92 | 2012883303)) | (~((~currentTimeMillis92) | (-2012883304))) | (~(844857582 | currentTimeMillis92))) * 831));
                        if (((i292 ^ i293) | (i292 & i293)) != 0) {
                            java.lang.Object[] objArr176 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, null, new int[1]};
                            int currentTimeMillis93 = (int) java.lang.System.currentTimeMillis();
                            int i294 = ~currentTimeMillis93;
                            java.lang.Object[] objArr177 = {-2062849474, 16, java.lang.Integer.valueOf((((648345178 | currentTimeMillis93) * (-859)) - 1550420426) + (((~(currentTimeMillis93 | (-44069969))) | (~(648345178 | i294))) * 859) + (((~((-60980342) | i294)) | 16910373) * 859))};
                            java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj50 == null) {
                                java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 2713 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) android.view.View.getDefaultSize(0, 0));
                                byte b46 = (byte) ($$a[14] - 1);
                                java.lang.Object[] objArr178 = new java.lang.Object[1];
                                a(b46, (short) (b46 | 653), b46, objArr178);
                                obj50 = cls48.getMethod((java.lang.String) objArr178[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj50);
                            }
                            ((int[]) objArr176[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj50).invoke(null, objArr177)).intValue();
                            return objArr176;
                        }
                        java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1050293330);
                        if (obj51 == null) {
                            java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2971 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                            byte[] bArr32 = $$a;
                            byte b47 = (byte) (bArr32[14] - 1);
                            java.lang.Object[] objArr179 = new java.lang.Object[1];
                            a(b47, b47, (byte) (-bArr32[16]), objArr179);
                            obj51 = cls49.getMethod((java.lang.String) objArr179[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1050293330, obj51);
                        }
                        long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) obj51).invoke(null, null)).longValue();
                        int currentTimeMillis94 = (int) java.lang.System.currentTimeMillis();
                        long j90 = ~longValue25;
                        long j91 = currentTimeMillis94;
                        long j92 = ~j91;
                        long j93 = ~((-1549303763) | longValue25);
                        long j94 = (((((longValue25 * 371) - 574791696073L) + (((~(j90 | j92)) | (~(1549303762 | j91))) * (-370))) + ((((~(1549303762 | j92)) | (~(j90 | j91))) | j93) * (-370))) + (j93 * 370)) - 303398001;
                        int i295 = ~(((int) java.lang.System.currentTimeMillis()) | (-2012258173));
                        int i296 = ((int) (j94 >> 32)) & (((((845482712 | i295) * (-220)) + 1940944690) + ((i295 | 845154904) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) - 431600520);
                        int i297 = (int) j94;
                        int currentTimeMillis95 = (int) java.lang.System.currentTimeMillis();
                        int i298 = ~currentTimeMillis95;
                        int i299 = i297 & ((((-269551649) | currentTimeMillis95) * (-676)) + 1044777737 + (((~(1306812957 | i298)) | 269551648) * 676) + (((~(currentTimeMillis95 | 1576364605)) | (~(i298 | (-1550927929))) | 1281376280) * 676));
                        if (((i296 ^ i299) | (i296 & i299)) != 0) {
                            java.lang.Object[] objArr180 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, null, new int[1]};
                            int currentTimeMillis96 = (int) java.lang.System.currentTimeMillis();
                            int i300 = ~currentTimeMillis96;
                            int i301 = ~((-39863032) | i300);
                            java.lang.Object[] objArr181 = {-2062849474, 16, java.lang.Integer.valueOf((((~(39863031 | currentTimeMillis96)) | (~(749188551 | i300)) | i301) * (-516)) + 1580601811 + (((~(currentTimeMillis96 | (-747091201))) | (~(i300 | (-2097352)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((2097351 | i301) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))};
                            java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj52 == null) {
                                java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 2713 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                byte b48 = (byte) ($$a[14] - 1);
                                java.lang.Object[] objArr182 = new java.lang.Object[1];
                                a(b48, (short) (b48 | 653), b48, objArr182);
                                obj52 = cls50.getMethod((java.lang.String) objArr182[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj52);
                            }
                            ((int[]) objArr180[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj52).invoke(null, objArr181)).intValue();
                            return objArr180;
                        }
                        java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1827153043);
                        if (obj53 == null) {
                            java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.view.KeyEvent.normalizeMetaState(0), 2160 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (56400 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)));
                            byte[] bArr33 = $$a;
                            byte b49 = (byte) (bArr33[14] - 1);
                            java.lang.Object[] objArr183 = new java.lang.Object[1];
                            a(b49, b49, (byte) (-bArr33[16]), objArr183);
                            obj53 = cls51.getMethod((java.lang.String) objArr183[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1827153043, obj53);
                        }
                        long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) obj53).invoke(null, null)).longValue();
                        long currentTimeMillis97 = (int) java.lang.System.currentTimeMillis();
                        long j95 = ~currentTimeMillis97;
                        long j96 = ~longValue26;
                        long j97 = ((((((-163) * longValue26) + 60545269620L) + (((~(j95 | longValue26)) | 366941028) * (-328))) + ((366941028 | currentTimeMillis97) * 164)) + (((~((366941028 | j95) | longValue26)) | ((~((-366941029) | j96)) | (~(currentTimeMillis97 | j96)))) * 164)) - 932759048;
                        int currentTimeMillis98 = (int) java.lang.System.currentTimeMillis();
                        int i302 = ((int) (j97 >> 32)) & ((((((~currentTimeMillis98) | (-2144692692)) * 1324) - 818884594) + (((~(currentTimeMillis98 | (-1791254674))) | (~((-1066486212) | currentTimeMillis98))) * (-1324))) - 1439114740);
                        int currentTimeMillis99 = (int) java.lang.System.currentTimeMillis();
                        int i303 = ((int) j97) & ((((((~(556586387 | currentTimeMillis99)) | (-897439128)) * 576) + 1771465493) + (((~((~currentTimeMillis99) | (-340852741))) | 16799105) * 576)) - 1528862208);
                        if (((i302 ^ i303) | (i302 & i303)) != 0) {
                            java.lang.Object[] objArr184 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, null, new int[1]};
                            int currentTimeMillis100 = (int) java.lang.System.currentTimeMillis();
                            java.lang.Object[] objArr185 = {-2062849474, 16, java.lang.Integer.valueOf((((~((-134489649) | currentTimeMillis100)) | 843815168) * (-756)) + 1573392259 + (((~currentTimeMillis100) | (-134489649)) * 756))};
                            java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj54 == null) {
                                java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 50, 2713 - android.text.TextUtils.getOffsetBefore("", 0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                byte b50 = (byte) ($$a[14] - 1);
                                java.lang.Object[] objArr186 = new java.lang.Object[1];
                                a(b50, (short) (b50 | 653), b50, objArr186);
                                obj54 = cls52.getMethod((java.lang.String) objArr186[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj54);
                            }
                            ((int[]) objArr184[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj54).invoke(null, objArr185)).intValue();
                            return objArr184;
                        }
                        java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(887063382);
                        if (obj55 == null) {
                            java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 35, android.view.View.resolveSizeAndState(0, 0, 0) + 838, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                            byte[] bArr34 = $$a;
                            byte b51 = (byte) (bArr34[14] - 1);
                            java.lang.Object[] objArr187 = new java.lang.Object[1];
                            a(b51, b51, (byte) (-bArr34[16]), objArr187);
                            obj55 = cls53.getMethod((java.lang.String) objArr187[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(887063382, obj55);
                        }
                        long longValue27 = ((java.lang.Long) ((java.lang.reflect.Method) obj55).invoke(null, null)).longValue();
                        long currentTimeMillis101 = (int) java.lang.System.currentTimeMillis();
                        long j98 = (628 * longValue27) + 404857544732L + ((longValue27 | currentTimeMillis101 | (-644677620)) * (-627)) + (((~((~longValue27) | currentTimeMillis101)) | 644677619) * (-627)) + (((~(longValue27 | (~currentTimeMillis101))) | (~(644677619 | currentTimeMillis101))) * 627) + 1316075283;
                        int i304 = ((int) (j98 >> 32)) & (((((-1074795521) | r3) * 494) - 513176602) + (((~((~((int) java.lang.System.currentTimeMillis())) | 193929469)) | (-1100223569)) * 494));
                        int currentTimeMillis102 = (int) java.lang.System.currentTimeMillis();
                        int i305 = ((int) j98) & ((((((~currentTimeMillis102) | 1582716394) * 1444) + 1153123995) + ((((~(currentTimeMillis102 | 634825264)) | 1509971402) | (~((-2072051675) | currentTimeMillis102))) * (-1444))) - 259936454);
                        int i306 = ((i304 ^ i305) | (i304 & i305)) != 0 ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : 0;
                        if (i306 != 0) {
                            java.lang.Object[] objArr188 = {new int[]{0}, new int[]{i306}, null, new int[1]};
                            int currentTimeMillis103 = (int) java.lang.System.currentTimeMillis();
                            int i307 = ~currentTimeMillis103;
                            java.lang.Object[] objArr189 = {-2062849474, 16, java.lang.Integer.valueOf((((~((-38273761) | currentTimeMillis103)) | (~((-20335617) | i307))) * 920) + 964877031 + (((~((-650716144) | i307)) | 38273760) * 920) + (((~(currentTimeMillis103 | (-612442384))) | (~(i307 | (-38273761))) | (~((-20335617) | currentTimeMillis103))) * 920))};
                            java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj56 == null) {
                                java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2712, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                                byte b52 = (byte) ($$a[14] - 1);
                                java.lang.Object[] objArr190 = new java.lang.Object[1];
                                a(b52, (short) (b52 | 653), b52, objArr190);
                                obj56 = cls54.getMethod((java.lang.String) objArr190[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj56);
                            }
                            ((int[]) objArr188[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj56).invoke(null, objArr189)).intValue();
                            java.lang.Object[] objArr191 = {objArr188};
                            java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(712501173);
                            if (obj57 == null) {
                                java.lang.Class cls55 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 52, 3237 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.view.KeyEvent.normalizeMetaState(0));
                                byte b53 = (byte) ($$a[14] - 1);
                                java.lang.Object[] objArr192 = new java.lang.Object[1];
                                a(b53, (short) (b53 | 653), b53, objArr192);
                                obj57 = cls55.getMethod((java.lang.String) objArr192[0], java.lang.Object[].class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(712501173, obj57);
                            }
                            ((java.lang.reflect.Method) obj57).invoke(obj, objArr191);
                            return objArr188;
                        }
                        java.lang.Object[] objArr193 = {0, obj, -2062849474, 0};
                        java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(97317038);
                        if (obj58 == null) {
                            obj58 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.view.KeyEvent.getDeadChar(0, 0), android.text.TextUtils.indexOf("", "") + 3289, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1))).getDeclaredConstructor(java.lang.Integer.TYPE, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 52, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3236, (char) android.graphics.Color.green(0)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(97317038, obj58);
                        }
                        java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj58).newInstance(objArr193);
                        getProfileVersion = (getAid + 11) % 128;
                        try {
                            java.lang.Object[] objArr194 = new java.lang.Object[1];
                            c("\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001", false, new int[]{androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD, 16, 0, 16}, objArr194);
                            java.lang.Class<?> cls56 = java.lang.Class.forName((java.lang.String) objArr194[0]);
                            java.lang.Object[] objArr195 = new java.lang.Object[1];
                            c("\u0000\u0000\u0001\u0001\u0001", true, new int[]{439, 5, 118, 0}, objArr195);
                            cls56.getMethod((java.lang.String) objArr195[0], null).invoke(newInstance, null);
                            java.lang.Object[] objArr196 = {new int[]{0}, new int[]{0}, null, new int[1]};
                            int currentTimeMillis104 = (int) java.lang.System.currentTimeMillis();
                            java.lang.Object[] objArr197 = {-2062849474, 0, java.lang.Integer.valueOf((((83903117 | r4) * (-814)) - 1159266450) + (((~(449027122 | currentTimeMillis104)) | (~((~currentTimeMillis104) | (-260298398))) | 272631842) * 407) + (((~(currentTimeMillis104 | (-449027123))) | 272631842 | (~(260298397 | currentTimeMillis104))) * 407))};
                            java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj59 == null) {
                                java.lang.Class cls57 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 50, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2714, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                byte b54 = (byte) ($$a[14] - 1);
                                java.lang.Object[] objArr198 = new java.lang.Object[1];
                                a(b54, (short) (b54 | 653), b54, objArr198);
                                obj59 = cls57.getMethod((java.lang.String) objArr198[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj59);
                            }
                            ((int[]) objArr196[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj59).invoke(null, objArr197)).intValue();
                            return objArr196;
                        } catch (java.lang.Throwable th7) {
                            java.lang.Throwable cause4 = th7.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th7;
                        }
                    }
                    java.lang.Object[] objArr199 = {(java.lang.String) objArr[0]};
                    java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj60 == null) {
                        java.lang.Class cls58 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 40, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1921, (char) ((-1) - android.os.Process.getGidForName("")));
                        byte[] bArr35 = $$a;
                        byte b55 = (byte) (bArr35[14] - 1);
                        java.lang.Object[] objArr200 = new java.lang.Object[1];
                        a(b55, b55, (byte) (-bArr35[16]), objArr200);
                        obj60 = cls58.getMethod((java.lang.String) objArr200[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj60);
                    }
                    java.lang.Object invoke6 = ((java.lang.reflect.Method) obj60).invoke(null, objArr199);
                    if (invoke6 != null) {
                        java.lang.Object[] objArr201 = new java.lang.Object[1];
                        c("\u0001\u0001\u0001\u0001\u0000\u0001\u0001", true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 7, 0, 0}, objArr201);
                        if (invoke6.equals((java.lang.String) objArr201[0])) {
                            java.lang.Object[] objArr202 = new java.lang.Object[1];
                            c("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000", false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, 23, 0, 3}, objArr202);
                            try {
                                java.lang.Object[] objArr203 = {(java.lang.String) objArr202[0]};
                                java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj61 == null) {
                                    java.lang.Class cls59 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 40, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1921, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                    byte[] bArr36 = $$a;
                                    byte b56 = (byte) (bArr36[14] - 1);
                                    java.lang.Object[] objArr204 = new java.lang.Object[1];
                                    a(b56, b56, (byte) (-bArr36[16]), objArr204);
                                    obj61 = cls59.getMethod((java.lang.String) objArr204[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj61);
                                }
                                java.lang.String str58 = (java.lang.String) ((java.lang.reflect.Method) obj61).invoke(null, objArr203);
                                if (str58 != null) {
                                    int currentTimeMillis105 = (int) java.lang.System.currentTimeMillis();
                                    int i308 = ~currentTimeMillis105;
                                    int i309 = (i308 ^ 1001805545) | (1001805545 & i308);
                                    int i310 = ~i309;
                                    int i311 = (i310 ^ (-2075655934)) | ((-2075655934) & i310);
                                    int i312 = ~(((-429015241) ^ currentTimeMillis105) | ((-429015241) & currentTimeMillis105));
                                    int i313 = -(-(((i311 ^ i312) | (i311 & i312)) * (-502)));
                                    int i314 = (((-806897115) | i313) << 1) - (i313 ^ (-806897115));
                                    int i315 = -(-(((~(currentTimeMillis105 | (-429015241))) | (~((i309 ^ (-1502865629)) | ((-1502865629) & i309)))) * 502));
                                    int currentTimeMillis106 = (int) java.lang.System.currentTimeMillis();
                                    int i316 = (~currentTimeMillis106) | 1090601123;
                                    int i317 = (-318252463) - (~(((i316 ^ 542119508) | (542119508 & i316)) * 1444));
                                    int i318 = ~(((-552875861) & currentTimeMillis106) | ((-552875861) ^ currentTimeMillis106));
                                    int i319 = -(-(((~((currentTimeMillis106 ^ 1101357475) | (1101357475 & currentTimeMillis106))) | (i318 ^ 542119508) | (542119508 & i318)) * (-1444)));
                                    int i320 = (i317 & i319) + (i319 | i317);
                                    if ((i314 ^ i315) + ((i315 & i314) << 1) <= ((-2003257200) ^ i320) + ((i320 & (-2003257200)) << 1)) {
                                        java.lang.Integer.parseInt(str58);
                                        throw null;
                                    }
                                    int parseInt = java.lang.Integer.parseInt(str58);
                                    if (parseInt != 0) {
                                        int currentTimeMillis107 = (int) java.lang.System.currentTimeMillis();
                                        int i321 = ~parseInt;
                                        int i322 = ~(i321 | (-171));
                                        int i323 = ~(currentTimeMillis107 | (-171));
                                        int i324 = (i322 ^ i323) | (i322 & i323);
                                        int i325 = ~(i321 | currentTimeMillis107);
                                        int i326 = (parseInt * 881) + 149770 + (((i325 ^ i324) | (i324 & i325)) * (-880));
                                        int i327 = ~currentTimeMillis107;
                                        int i328 = parseInt | (~((i327 ^ (-171)) | (i327 & (-171))));
                                        int i329 = ~(currentTimeMillis107 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
                                        int i330 = -(-(((i328 ^ i329) | (i328 & i329)) * (-880)));
                                        int i331 = (i326 & i330) + (i330 | i326);
                                        int i332 = -(-((~((currentTimeMillis107 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) | (currentTimeMillis107 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE))) * 880));
                                        i2 = (i332 ^ i331) + ((i332 & i331) << 1);
                                        if (i2 != 0) {
                                        }
                                    }
                                }
                            } catch (java.lang.Throwable th8) {
                                java.lang.Throwable cause5 = th8.getCause();
                                if (cause5 != null) {
                                    throw cause5;
                                }
                                throw th8;
                            }
                        }
                    }
                    i2 = 0;
                    if (i2 != 0) {
                    }
                } catch (java.lang.Throwable th9) {
                    java.lang.Throwable cause6 = th9.getCause();
                    if (cause6 != null) {
                        throw cause6;
                    }
                    throw th9;
                }
                int i333 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                objArr = new java.lang.Object[1];
                b("\ue108ºᢜຜ", (char) ((39960 & i333) + (i333 | 39960)), "䴻\u0ac6闕섐ﺍꈰ熘킺ܔ䶝炔짗譴뉦\ue2ec숭⺊鏒", "\ue9fc\ue78d퍞ꂹ", android.os.Process.myTid() >> 22, objArr);
                if (i6 != 0) {
                    i4 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                    if (i4 != 0) {
                    }
                }
                i4 = 0;
                if (i4 != 0) {
                }
            } catch (java.lang.Throwable th10) {
                java.lang.Throwable cause7 = th10.getCause();
                if (cause7 != null) {
                    throw cause7;
                }
                throw th10;
            }
        }
    }

    public static java.lang.Class<?> valueOf(java.lang.reflect.Type type) {
        while (!(type instanceof java.lang.Class)) {
            if (type instanceof java.lang.reflect.ParameterizedType) {
                java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) type).getRawType();
                if (rawType instanceof java.lang.Class) {
                    return (java.lang.Class) rawType;
                }
                throw new java.lang.IllegalArgumentException();
            }
            if (type instanceof java.lang.reflect.GenericArrayType) {
                return java.lang.reflect.Array.newInstance(valueOf(((java.lang.reflect.GenericArrayType) type).getGenericComponentType()), 0).getClass();
            }
            if (type instanceof java.lang.reflect.TypeVariable) {
                return java.lang.Object.class;
            }
            if (type instanceof java.lang.reflect.WildcardType) {
                type = ((java.lang.reflect.WildcardType) type).getUpperBounds()[0];
            } else {
                java.lang.String name2 = type == null ? "null" : type.getClass().getName();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                sb.append(type);
                sb.append("> is of type ");
                sb.append(name2);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        return (java.lang.Class) type;
    }

    public static boolean AlternateContactlessPaymentDataJson(java.lang.reflect.Type type, java.lang.reflect.Type type2) {
        while (type != type2) {
            if (type instanceof java.lang.Class) {
                return type.equals(type2);
            }
            if (type instanceof java.lang.reflect.ParameterizedType) {
                if (!(type2 instanceof java.lang.reflect.ParameterizedType)) {
                    return false;
                }
                java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
                java.lang.reflect.ParameterizedType parameterizedType2 = (java.lang.reflect.ParameterizedType) type2;
                java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
                java.lang.reflect.Type ownerType2 = parameterizedType2.getOwnerType();
                return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && java.util.Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            if (type instanceof java.lang.reflect.GenericArrayType) {
                if (!(type2 instanceof java.lang.reflect.GenericArrayType)) {
                    return false;
                }
                type = ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
                type2 = ((java.lang.reflect.GenericArrayType) type2).getGenericComponentType();
            } else {
                if (type instanceof java.lang.reflect.WildcardType) {
                    if (!(type2 instanceof java.lang.reflect.WildcardType)) {
                        return false;
                    }
                    java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
                    java.lang.reflect.WildcardType wildcardType2 = (java.lang.reflect.WildcardType) type2;
                    return java.util.Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && java.util.Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
                }
                if (!(type instanceof java.lang.reflect.TypeVariable) || !(type2 instanceof java.lang.reflect.TypeVariable)) {
                    return false;
                }
                java.lang.reflect.TypeVariable typeVariable = (java.lang.reflect.TypeVariable) type;
                java.lang.reflect.TypeVariable typeVariable2 = (java.lang.reflect.TypeVariable) type2;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
            }
        }
        return true;
    }

    static int DigitizedCardProfile(java.lang.Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static java.lang.String AlternateContactlessPaymentDataJson(java.lang.reflect.Type type) {
        return type instanceof java.lang.Class ? ((java.lang.Class) type).getName() : type.toString();
    }

    private static java.lang.reflect.Type DigitizedCardProfile(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        java.lang.Class<?> superclass;
        java.lang.reflect.Type genericSuperclass;
        while (cls2 != cls) {
            if (cls2.isInterface()) {
                java.lang.Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                for (int i = 0; i < length; i++) {
                    java.lang.Class<?> cls3 = interfaces[i];
                    if (cls3 == cls2) {
                        return cls.getGenericInterfaces()[i];
                    }
                    if (cls2.isAssignableFrom(cls3)) {
                        genericSuperclass = cls.getGenericInterfaces()[i];
                        superclass = interfaces[i];
                        break;
                    }
                }
            }
            if (!cls.isInterface()) {
                while (cls != java.lang.Object.class) {
                    superclass = cls.getSuperclass();
                    if (superclass == cls2) {
                        return cls.getGenericSuperclass();
                    }
                    if (cls2.isAssignableFrom(superclass)) {
                        genericSuperclass = cls.getGenericSuperclass();
                        java.lang.reflect.Type type2 = genericSuperclass;
                        cls = superclass;
                        type = type2;
                    } else {
                        cls = superclass;
                    }
                }
            }
            return cls2;
        }
        return type;
    }

    private static java.lang.reflect.Type AlternateContactlessPaymentDataJson(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        if (type instanceof java.lang.reflect.WildcardType) {
            type = ((java.lang.reflect.WildcardType) type).getUpperBounds()[0];
        }
        if (!cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException();
        }
        return AlternateContactlessPaymentDataJson(type, cls, DigitizedCardProfile(type, cls, cls2), new java.util.HashSet());
    }

    public static java.lang.reflect.Type values(java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
        }
        return ((java.lang.Class) type).getComponentType();
    }

    public static java.lang.reflect.Type writeReplace(java.lang.reflect.Type type, java.lang.Class<?> cls) {
        java.lang.reflect.Type AlternateContactlessPaymentDataJson2 = AlternateContactlessPaymentDataJson(type, cls, java.util.Collection.class);
        if (AlternateContactlessPaymentDataJson2 instanceof java.lang.reflect.WildcardType) {
            AlternateContactlessPaymentDataJson2 = ((java.lang.reflect.WildcardType) AlternateContactlessPaymentDataJson2).getUpperBounds()[0];
        }
        if (AlternateContactlessPaymentDataJson2 instanceof java.lang.reflect.ParameterizedType) {
            return ((java.lang.reflect.ParameterizedType) AlternateContactlessPaymentDataJson2).getActualTypeArguments()[0];
        }
        return java.lang.Object.class;
    }

    public static java.lang.reflect.Type[] values(java.lang.reflect.Type type, java.lang.Class<?> cls) {
        if (type == java.util.Properties.class) {
            return new java.lang.reflect.Type[]{java.lang.String.class, java.lang.String.class};
        }
        java.lang.reflect.Type AlternateContactlessPaymentDataJson2 = AlternateContactlessPaymentDataJson(type, cls, java.util.Map.class);
        if (AlternateContactlessPaymentDataJson2 instanceof java.lang.reflect.ParameterizedType) {
            return ((java.lang.reflect.ParameterizedType) AlternateContactlessPaymentDataJson2).getActualTypeArguments();
        }
        return new java.lang.reflect.Type[]{java.lang.Object.class, java.lang.Object.class};
    }

    public static java.lang.reflect.Type valueOf(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type type2) {
        return AlternateContactlessPaymentDataJson(type, cls, type2, new java.util.HashSet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.reflect.Type] */
    private static java.lang.reflect.Type AlternateContactlessPaymentDataJson(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type type2, java.util.Collection<java.lang.reflect.TypeVariable> collection) {
        java.lang.reflect.Type AlternateContactlessPaymentDataJson2;
        java.lang.reflect.TypeVariable typeVariable;
        do {
            if (type2 instanceof java.lang.reflect.TypeVariable) {
                typeVariable = type2;
                if (!collection.contains(typeVariable)) {
                    collection.add(typeVariable);
                    type2 = DigitizedCardProfile(type, cls, (java.lang.reflect.TypeVariable<?>) typeVariable);
                }
            } else {
                if (type2 instanceof java.lang.Class) {
                    java.lang.Class cls2 = type2;
                    if (cls2.isArray()) {
                        java.lang.Class<?> componentType = cls2.getComponentType();
                        java.lang.reflect.Type AlternateContactlessPaymentDataJson3 = AlternateContactlessPaymentDataJson(type, cls, componentType, collection);
                        return componentType == AlternateContactlessPaymentDataJson3 ? cls2 : new com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson3);
                    }
                }
                if (type2 instanceof java.lang.reflect.GenericArrayType) {
                    java.lang.reflect.GenericArrayType genericArrayType = (java.lang.reflect.GenericArrayType) type2;
                    java.lang.reflect.Type genericComponentType = genericArrayType.getGenericComponentType();
                    java.lang.reflect.Type AlternateContactlessPaymentDataJson4 = AlternateContactlessPaymentDataJson(type, cls, genericComponentType, collection);
                    return genericComponentType == AlternateContactlessPaymentDataJson4 ? genericArrayType : new com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson4);
                }
                if (type2 instanceof java.lang.reflect.ParameterizedType) {
                    java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type2;
                    java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
                    java.lang.reflect.Type AlternateContactlessPaymentDataJson5 = AlternateContactlessPaymentDataJson(type, cls, ownerType, collection);
                    boolean z = AlternateContactlessPaymentDataJson5 != ownerType;
                    java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    for (int i = 0; i < length; i++) {
                        java.lang.reflect.Type AlternateContactlessPaymentDataJson6 = AlternateContactlessPaymentDataJson(type, cls, actualTypeArguments[i], collection);
                        if (AlternateContactlessPaymentDataJson6 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (java.lang.reflect.Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = AlternateContactlessPaymentDataJson6;
                        }
                    }
                    return z ? new com.payair.hce.getCdol1RelatedDataLength.valueOf(AlternateContactlessPaymentDataJson5, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type2 instanceof java.lang.reflect.WildcardType) {
                    type2 = (java.lang.reflect.WildcardType) type2;
                    java.lang.reflect.Type[] lowerBounds = type2.getLowerBounds();
                    java.lang.reflect.Type[] upperBounds = type2.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        java.lang.reflect.Type AlternateContactlessPaymentDataJson7 = AlternateContactlessPaymentDataJson(type, cls, lowerBounds[0], collection);
                        if (AlternateContactlessPaymentDataJson7 != lowerBounds[0]) {
                            return IccPrivateKeyCrtComponentsJson(AlternateContactlessPaymentDataJson7);
                        }
                    } else if (upperBounds.length == 1 && (AlternateContactlessPaymentDataJson2 = AlternateContactlessPaymentDataJson(type, cls, upperBounds[0], collection)) != upperBounds[0]) {
                        return getProfileVersion(AlternateContactlessPaymentDataJson2);
                    }
                }
            }
            return type2;
        } while (type2 != typeVariable);
        return type2;
    }

    private static int writeReplace(java.lang.Object[] objArr, java.lang.Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    static void DigitizedCardProfile(java.lang.reflect.Type type) {
        if ((type instanceof java.lang.Class) && ((java.lang.Class) type).isPrimitive()) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    static final class valueOf implements java.io.Serializable, java.lang.reflect.ParameterizedType {
        private final java.lang.reflect.Type[] AlternateContactlessPaymentDataJson;
        private final java.lang.reflect.Type DigitizedCardProfile;
        private final java.lang.reflect.Type values;

        public valueOf(java.lang.reflect.Type type, java.lang.reflect.Type type2, java.lang.reflect.Type... typeArr) {
            if (type2 instanceof java.lang.Class) {
                java.lang.Class cls = (java.lang.Class) type2;
                boolean z = java.lang.reflect.Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z) {
                    throw new java.lang.IllegalArgumentException();
                }
            }
            this.DigitizedCardProfile = type == null ? null : com.payair.hce.getCdol1RelatedDataLength.writeReplace(type);
            this.values = com.payair.hce.getCdol1RelatedDataLength.writeReplace(type2);
            java.lang.reflect.Type[] typeArr2 = (java.lang.reflect.Type[]) typeArr.clone();
            this.AlternateContactlessPaymentDataJson = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                com.payair.hce.getCdol1RelatedDataLength.DigitizedCardProfile(this.AlternateContactlessPaymentDataJson[i]);
                java.lang.reflect.Type[] typeArr3 = this.AlternateContactlessPaymentDataJson;
                typeArr3[i] = com.payair.hce.getCdol1RelatedDataLength.writeReplace(typeArr3[i]);
            }
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type[] getActualTypeArguments() {
            return (java.lang.reflect.Type[]) this.AlternateContactlessPaymentDataJson.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type getRawType() {
            return this.values;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type getOwnerType() {
            return this.DigitizedCardProfile;
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.ParameterizedType) && com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(this, (java.lang.reflect.ParameterizedType) obj);
        }

        public final int hashCode() {
            return (java.util.Arrays.hashCode(this.AlternateContactlessPaymentDataJson) ^ this.values.hashCode()) ^ com.payair.hce.getCdol1RelatedDataLength.DigitizedCardProfile((java.lang.Object) this.DigitizedCardProfile);
        }

        public final java.lang.String toString() {
            int length = this.AlternateContactlessPaymentDataJson.length;
            if (length == 0) {
                return com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(this.values);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder((length + 1) * 30);
            sb.append(com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(this.values));
            sb.append("<");
            sb.append(com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(this.AlternateContactlessPaymentDataJson[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(this.AlternateContactlessPaymentDataJson[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    private static java.lang.reflect.Type DigitizedCardProfile(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.TypeVariable<?> typeVariable) {
        java.lang.Object genericDeclaration = typeVariable.getGenericDeclaration();
        java.lang.Class cls2 = genericDeclaration instanceof java.lang.Class ? (java.lang.Class) genericDeclaration : null;
        if (cls2 != null) {
            java.lang.reflect.Type DigitizedCardProfile2 = DigitizedCardProfile(type, cls, (java.lang.Class<?>) cls2);
            if (DigitizedCardProfile2 instanceof java.lang.reflect.ParameterizedType) {
                return ((java.lang.reflect.ParameterizedType) DigitizedCardProfile2).getActualTypeArguments()[writeReplace(cls2.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }
}

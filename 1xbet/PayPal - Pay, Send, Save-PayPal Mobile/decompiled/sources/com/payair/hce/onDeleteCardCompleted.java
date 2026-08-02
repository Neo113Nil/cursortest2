package com.payair.hce;

/* loaded from: classes4.dex */
public final class onDeleteCardCompleted extends com.payair.hce.onTransactionStopped {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static boolean IccPrivateKeyCrtComponentsJson;
    private static char[] RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static boolean getAid;
    private static int getCvrMaskAnd;
    private static int getGpoResponse;
    private static int valueOf;
    private com.payair.hce.access000 DigitizedCardProfile;
    private com.payair.hce.ignoreFailedTransaction getProfileVersion;
    private com.payair.hce.onDeleteCardCompleted.valueOf values = com.payair.hce.onDeleteCardCompleted.valueOf.DigitizedCardProfile;
    private com.payair.hce.setPinIvCvc3Track2 writeReplace = com.payair.hce.setMaximumPinTry.valueOf();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = 1 - (i2 * 3);
        int i6 = (b * 3) + 118;
        int i7 = 3 - (i * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            i6 += -i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            i7++;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i7];
            i6 += -i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            i7++;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            i7++;
            if (i4 == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return valueOf(objArr);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DigitizedCardProfile' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class valueOf {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static final /* synthetic */ com.payair.hce.onDeleteCardCompleted.valueOf[] AlternateContactlessPaymentDataJson;
        public static final com.payair.hce.onDeleteCardCompleted.valueOf DigitizedCardProfile;
        private static int IccPrivateKeyCrtComponentsJson;
        private static char SdkCoreAlternateContactlessPaymentDataImpl;
        private static int getAid;
        private static int getProfileVersion;
        private static long valueOf;
        public static final com.payair.hce.onDeleteCardCompleted.valueOf values;
        public static final com.payair.hce.onDeleteCardCompleted.valueOf writeReplace;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Type inference failed for: r8v1, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(int i, short s, short s2, java.lang.Object[] objArr) {
            int i2;
            int i3;
            int i4 = s + 4;
            int i5 = i * 4;
            byte[] bArr = $$a;
            ?? r8 = s2 + 102;
            byte[] bArr2 = new byte[1 - i5];
            if (bArr == null) {
                byte b = r8;
                i2 = 0;
                int i6 = i4;
                int i7 = i6;
                i3 = i4 + (-b);
                i4 = i7;
                int i8 = i4 + 1;
                bArr2[i2] = (byte) i3;
                if (i2 == 0 - i5) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                b = bArr[i8];
                i2++;
                int i9 = i3;
                i6 = i8;
                i4 = i9;
                int i72 = i6;
                i3 = i4 + (-b);
                i4 = i72;
                int i82 = i4 + 1;
                bArr2[i2] = (byte) i3;
                if (i2 == 0 - i5) {
                }
            } else {
                i2 = 0;
                i3 = r8;
                int i822 = i4 + 1;
                bArr2[i2] = (byte) i3;
                if (i2 == 0 - i5) {
                }
            }
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getAid = 0;
            getProfileVersion = 1;
            valueOf();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), "链鯧\uea68⒀", "홤ⶑ嶙\ue252\u0c71ⵢ䣪䅱彵▋銫鈔", "醛왊즯ℸ", android.view.View.combineMeasuredStates(0, 0), objArr);
            com.payair.hce.onDeleteCardCompleted.valueOf valueof = new com.payair.hce.onDeleteCardCompleted.valueOf(((java.lang.String) objArr[0]).intern(), 0);
            DigitizedCardProfile = valueof;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a((char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), "链鯧\uea68⒀", "⋦㢀ᮬ픽ｹ㨳㸽\ue442", "艘ɖ狉㿒", android.view.ViewConfiguration.getJumpTapTimeout() >> 16, objArr2);
            com.payair.hce.onDeleteCardCompleted.valueOf valueof2 = new com.payair.hce.onDeleteCardCompleted.valueOf(((java.lang.String) objArr2[0]).intern(), 1);
            writeReplace = valueof2;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a((char) android.view.View.resolveSize(0, 0), "链鯧\uea68⒀", "嶚栗࣫⽸纛밸롎鋚錘", "柩䑶覆猹", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 2042333593, objArr3);
            com.payair.hce.onDeleteCardCompleted.valueOf valueof3 = new com.payair.hce.onDeleteCardCompleted.valueOf(((java.lang.String) objArr3[0]).intern(), 2);
            values = valueof3;
            AlternateContactlessPaymentDataJson = new com.payair.hce.onDeleteCardCompleted.valueOf[]{valueof, valueof2, valueof3};
            int i = getProfileVersion + 105;
            getAid = i % 128;
            if (i % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        }

        private valueOf(java.lang.String str, int i) {
        }

        public static com.payair.hce.onDeleteCardCompleted.valueOf valueOf(java.lang.String str) {
            int i = getAid + 29;
            getProfileVersion = i % 128;
            com.payair.hce.onDeleteCardCompleted.valueOf valueof = (com.payair.hce.onDeleteCardCompleted.valueOf) java.lang.Enum.valueOf(com.payair.hce.onDeleteCardCompleted.valueOf.class, str);
            if (i % 2 != 0) {
                return valueof;
            }
            throw null;
        }

        public static com.payair.hce.onDeleteCardCompleted.valueOf[] values() {
            int i = getProfileVersion + 47;
            getAid = i % 128;
            com.payair.hce.onDeleteCardCompleted.valueOf[] valueofArr = AlternateContactlessPaymentDataJson;
            if (i % 2 == 0) {
                return (com.payair.hce.onDeleteCardCompleted.valueOf[]) valueofArr.clone();
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static void a(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object[] objArr) {
            char[] cArr;
            char[] cArr2;
            if (str3 != null) {
                cArr = str3.toCharArray();
                $11 = ($10 + 75) % 128;
            } else {
                cArr = str3;
            }
            char[] cArr3 = cArr;
            char[] charArray = str2 != 0 ? str2.toCharArray() : str2;
            java.lang.Object obj = null;
            if (str != null) {
                int i2 = $11 + 7;
                $10 = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                cArr2 = str.toCharArray();
            } else {
                cArr2 = str;
            }
            char[] cArr4 = cArr2;
            com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
            int length = cArr3.length;
            char[] cArr5 = new char[length];
            int length2 = cArr4.length;
            char[] cArr6 = new char[length2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, length);
            java.lang.System.arraycopy(cArr4, 0, cArr6, 0, length2);
            cArr5[0] = (char) (cArr5[0] ^ c);
            cArr6[2] = (char) (cArr6[2] + ((char) i));
            int length3 = charArray.length;
            char[] cArr7 = new char[length3];
            getwalletdata.writeReplace = 0;
            while (getwalletdata.writeReplace < length3) {
                try {
                    java.lang.Object[] objArr2 = {getwalletdata};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 71, 1179 - android.view.View.MeasureSpec.getMode(0), (char) ((-1) - android.view.MotionEvent.axisFromString("")));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(0, (short) -1, (short) 0, objArr3);
                        obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                    java.lang.Object[] objArr4 = {getwalletdata};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 3443 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.View.combineMeasuredStates(0, 0) + 3831))).getMethod("g", java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                    java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                    if (obj4 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 26, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1864, (char) (android.text.TextUtils.getOffsetAfter("", 0) + 41775));
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        b(0, (short) -1, (short) 3, objArr6);
                        obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                    java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                    if (obj5 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29, 3132 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.graphics.Color.green(0));
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        b(0, (short) -1, (byte) $$a.length, objArr8);
                        obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                    }
                    cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                    cArr5[intValue2] = getwalletdata.values;
                    cArr7[getwalletdata.writeReplace] = (char) ((((cArr5[intValue2] ^ charArray[getwalletdata.writeReplace]) ^ (valueOf ^ 1263759066225628708L)) ^ ((int) (IccPrivateKeyCrtComponentsJson ^ 1263759066225628708L))) ^ ((char) (SdkCoreAlternateContactlessPaymentDataImpl ^ 1263759066225628708L)));
                    getwalletdata.writeReplace++;
                    obj = null;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new java.lang.String(cArr7);
        }

        static void init$0() {
            $$a = new byte[]{32, 19, -11, 104};
            $$b = 99;
        }

        static void valueOf() {
            valueOf = 3821634430643552986L;
            IccPrivateKeyCrtComponentsJson = -804334044;
            SdkCoreAlternateContactlessPaymentDataImpl = (char) 54820;
        }
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.onDeleteCardCompleted ondeletecardcompleted = (com.payair.hce.onDeleteCardCompleted) objArr[0];
        int i = getGpoResponse;
        int i2 = i + 121;
        getCvrMaskAnd = i2 % 128;
        com.payair.hce.access000 access000Var = ondeletecardcompleted.DigitizedCardProfile;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getCvrMaskAnd = i3 % 128;
        if (i3 % 2 != 0) {
            return access000Var;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getGpoResponse = 0;
        getCvrMaskAnd = 1;
        writeReplace();
        valueOf = 2000;
        AlternateContactlessPaymentDataJson = 1000L;
        int i = getCvrMaskAnd + 37;
        getGpoResponse = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public onDeleteCardCompleted(com.payair.hce.access202 access202Var) {
        this.DigitizedCardProfile = (com.payair.hce.access000) access202Var;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, null, null, "\u008d\u0082\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0082\u0084\u0083\u0082\u0081", objArr);
        this.getProfileVersion = new com.payair.hce.ignoreFailedTransaction(((java.lang.String) objArr[0]).intern(), valueOf, AlternateContactlessPaymentDataJson, new com.payair.hce.ignoreFailedTransaction.values() { // from class: com.payair.hce.onDeleteCardCompleted.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static int $10;
            private static int $11;
            private static byte[] AlternateContactlessPaymentDataJson;
            private static int DigitizedCardProfile;
            private static int IccPrivateKeyCrtComponentsJson;
            private static int[] RecordsJson;
            private static short[] SdkCoreAlternateContactlessPaymentDataImpl;
            private static int getProfileVersion;
            private static int valueOf;
            private static int writeReplace;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0025). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(byte b, short s, byte b2, java.lang.Object[] objArr2) {
                int i;
                int i2 = s + 65;
                byte[] bArr = $$a;
                int i3 = (b2 * 2) + 4;
                char[] cArr = new char[b + 1];
                if (bArr == null) {
                    byte b3 = b;
                    i2 = i3;
                    int i4 = 0;
                    i3++;
                    i2 = (i2 + b3) - 2;
                    i = i4;
                    cArr[i] = (char) i2;
                    int i5 = i + 1;
                    if (i == b) {
                        objArr2[0] = new java.lang.String(cArr);
                        return;
                    }
                    b3 = bArr[i3];
                    i4 = i5;
                    i3++;
                    i2 = (i2 + b3) - 2;
                    i = i4;
                    cArr[i] = (char) i2;
                    int i52 = i + 1;
                    if (i == b) {
                    }
                } else {
                    i = 0;
                    cArr[i] = (char) i2;
                    int i522 = i + 1;
                    if (i == b) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void d(byte b, int i, int i2, java.lang.Object[] objArr2) {
                int i3;
                int i4;
                int i5 = 104 - (i2 * 38);
                int i6 = i + 4;
                int i7 = (b * 3) + 1;
                byte[] bArr = $$d;
                byte[] bArr2 = new byte[i7];
                if (bArr == null) {
                    int i8 = i7;
                    int i9 = i6;
                    i4 = 0;
                    int i10 = i6 + (-i8);
                    i3 = i4;
                    int i11 = i9;
                    i5 = i10;
                    i6 = i11;
                    i4 = i3 + 1;
                    int i12 = i6 + 1;
                    bArr2[i3] = (byte) i5;
                    if (i4 == i7) {
                        objArr2[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i8 = bArr[i12];
                    int i13 = i5;
                    i9 = i12;
                    i6 = i13;
                    int i102 = i6 + (-i8);
                    i3 = i4;
                    int i112 = i9;
                    i5 = i102;
                    i6 = i112;
                    i4 = i3 + 1;
                    int i122 = i6 + 1;
                    bArr2[i3] = (byte) i5;
                    if (i4 == i7) {
                    }
                } else {
                    i3 = 0;
                    i4 = i3 + 1;
                    int i1222 = i6 + 1;
                    bArr2[i3] = (byte) i5;
                    if (i4 == i7) {
                    }
                }
            }

            @Override // com.payair.hce.ignoreFailedTransaction.values
            public final void writeReplace() {
                int i = getProfileVersion + 69;
                IccPrivateKeyCrtComponentsJson = i % 128;
                if (i % 2 == 0) {
                    com.payair.hce.access000 access000Var = (com.payair.hce.access000) com.payair.hce.onDeleteCardCompleted.writeReplace(new java.lang.Object[]{com.payair.hce.onDeleteCardCompleted.this}, -866179959, 866179959, (int) java.lang.System.currentTimeMillis());
                    ((com.payair.hce.onShowAuthenticateScreen) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var}, 1571618569, -1571618562, java.lang.System.identityHashCode(access000Var))).writeReplace();
                    getProfileVersion = (IccPrivateKeyCrtComponentsJson + 65) % 128;
                } else {
                    com.payair.hce.access000 access000Var2 = (com.payair.hce.access000) com.payair.hce.onDeleteCardCompleted.writeReplace(new java.lang.Object[]{com.payair.hce.onDeleteCardCompleted.this}, -866179959, 866179959, (int) java.lang.System.currentTimeMillis());
                    ((com.payair.hce.onShowAuthenticateScreen) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var2}, 1571618569, -1571618562, java.lang.System.identityHashCode(access000Var2))).writeReplace();
                    throw null;
                }
            }

            private static void a(int[] iArr, int i, java.lang.Object[] objArr2) {
                int i2;
                int[] iArr2;
                com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = RecordsJson;
                int i3 = 1;
                if (iArr3 != null) {
                    $10 = ($11 + 15) % 128;
                    int length = iArr3.length;
                    int[] iArr4 = new int[length];
                    int i4 = 0;
                    while (i4 < length) {
                        $11 = ($10 + 31) % 128;
                        try {
                            java.lang.Object[] objArr3 = new java.lang.Object[i3];
                            objArr3[0] = java.lang.Integer.valueOf(iArr3[i4]);
                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                            if (obj == null) {
                                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 28, (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod("z", java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                            }
                            iArr4[i4] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).intValue();
                            i4++;
                            i3 = 1;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr3 = iArr4;
                }
                int length2 = iArr3.length;
                int[] iArr5 = new int[length2];
                int[] iArr6 = RecordsJson;
                if (iArr6 != null) {
                    int length3 = iArr6.length;
                    int[] iArr7 = new int[length3];
                    int i5 = 0;
                    while (i5 < length3) {
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(iArr6[i5])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                        if (obj2 == null) {
                            iArr2 = iArr6;
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 27, android.text.TextUtils.indexOf("", "", 0, 0) + 29, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("z", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                        } else {
                            iArr2 = iArr6;
                        }
                        iArr7[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                        i5++;
                        iArr6 = iArr2;
                    }
                    $11 = ($10 + 45) % 128;
                    iArr6 = iArr7;
                    i2 = 0;
                } else {
                    i2 = 0;
                }
                java.lang.System.arraycopy(iArr6, i2, iArr5, i2, length2);
                istransitsupported.valueOf = i2;
                while (istransitsupported.valueOf < iArr.length) {
                    cArr[i2] = (char) (iArr[istransitsupported.valueOf] >> 16);
                    cArr[1] = (char) iArr[istransitsupported.valueOf];
                    cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
                    cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
                    istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
                    istransitsupported.values = (cArr[2] << 16) + cArr[3];
                    com.payair.hce.isTransitSupported.values(iArr5);
                    int i6 = 0;
                    for (int i7 = 16; i6 < i7; i7 = 16) {
                        istransitsupported.DigitizedCardProfile ^= iArr5[i6];
                        java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 31, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 5087, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr5)).intValue();
                        istransitsupported.DigitizedCardProfile = istransitsupported.values;
                        istransitsupported.values = intValue;
                        i6++;
                    }
                    int i8 = istransitsupported.DigitizedCardProfile;
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = i8;
                    istransitsupported.values ^= iArr5[16];
                    istransitsupported.DigitizedCardProfile ^= iArr5[17];
                    int i9 = istransitsupported.DigitizedCardProfile;
                    int i10 = istransitsupported.values;
                    cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
                    cArr[1] = (char) istransitsupported.DigitizedCardProfile;
                    cArr[2] = (char) (istransitsupported.values >>> 16);
                    cArr[3] = (char) istransitsupported.values;
                    com.payair.hce.isTransitSupported.values(iArr5);
                    cArr2[istransitsupported.valueOf * 2] = cArr[0];
                    cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
                    cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
                    cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
                    java.lang.Object[] objArr6 = {istransitsupported, istransitsupported};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
                    if (obj4 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 49, android.graphics.Color.alpha(0) + 2923, (char) (3037 - android.view.KeyEvent.keyCodeFromString("")));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        d((byte) 0, -1, 1, objArr7);
                        obj4 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                    $11 = ($10 + 93) % 128;
                    i2 = 0;
                }
                objArr2[0] = new java.lang.String(cArr2, 0, i);
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x0187  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr2) {
                long j;
                boolean z;
                com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                try {
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(valueOf)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.graphics.Color.argb(0, 0, 0, 0) + 29, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).intValue();
                    int i4 = intValue == -1 ? 1 : 0;
                    if (i4 != 0) {
                        byte[] bArr = AlternateContactlessPaymentDataJson;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            for (int i5 = 0; i5 < length; i5++) {
                                java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(bArr[i5])};
                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                                if (obj2 == null) {
                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 32, (-16772128) - android.graphics.Color.rgb(0, 0, 0), (char) android.text.TextUtils.getOffsetAfter("", 0))).getMethod("e", java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                                }
                                bArr2[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).byteValue();
                            }
                            bArr = bArr2;
                        }
                        if (bArr == null) {
                            j = -4897270311952305750L;
                            intValue = (short) (((short) (SdkCoreAlternateContactlessPaymentDataImpl[i2 + ((int) (writeReplace ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (valueOf ^ (-4897270311952305750L))));
                            if (intValue > 0) {
                                gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + ((int) (writeReplace ^ j)) + i4;
                                java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(DigitizedCardProfile), sb};
                                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                                if (obj3 == null) {
                                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 2364 - (android.os.Process.myPid() >> 22), (char) android.view.View.getDefaultSize(0, 0));
                                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                                    d((byte) 0, -1, 0, objArr6);
                                    obj3 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj3);
                                }
                                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj3).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                byte[] bArr3 = AlternateContactlessPaymentDataJson;
                                if (bArr3 != null) {
                                    int length2 = bArr3.length;
                                    byte[] bArr4 = new byte[length2];
                                    int i6 = 0;
                                    while (i6 < length2) {
                                        bArr4[i6] = (byte) (bArr3[i6] ^ (-4897270311952305750L));
                                        i6++;
                                        $10 = ($11 + 43) % 128;
                                    }
                                    bArr3 = bArr4;
                                }
                                if (bArr3 != null) {
                                    $11 = ($10 + 5) % 128;
                                    z = true;
                                } else {
                                    $11 = ($10 + 117) % 128;
                                    z = false;
                                }
                                gettrack2constructiondata.DigitizedCardProfile = 1;
                                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                                    if (z) {
                                        byte[] bArr5 = AlternateContactlessPaymentDataJson;
                                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr5[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                                    } else {
                                        short[] sArr = SdkCoreAlternateContactlessPaymentDataImpl;
                                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                                    }
                                    sb.append(gettrack2constructiondata.values);
                                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                    gettrack2constructiondata.DigitizedCardProfile++;
                                }
                            }
                            objArr2[0] = sb.toString();
                        }
                        $10 = ($11 + 81) % 128;
                        byte[] bArr6 = AlternateContactlessPaymentDataJson;
                        java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(writeReplace)};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                        if (obj4 == null) {
                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 27, 28 - android.os.Process.getGidForName(""), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                        }
                        intValue = (byte) (((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue()] ^ (-4897270311952305750L))) + ((int) (valueOf ^ (-4897270311952305750L))));
                    }
                    j = -4897270311952305750L;
                    if (intValue > 0) {
                    }
                    objArr2[0] = sb.toString();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                IccPrivateKeyCrtComponentsJson = 0;
                getProfileVersion = 1;
                writeReplace = 1799130159;
                valueOf = 520368622;
                DigitizedCardProfile = 1302441578;
                AlternateContactlessPaymentDataJson = new byte[]{-71, 72, -107, 70, -76, 107, -79, -66, 64, -66, -120, -2, 17, -13, 4, -3, 46, com.google.common.base.Ascii.ETB, -72, 4, com.google.common.base.Ascii.VT, -13, 4, -3, 14, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -56, -7, -8, -1, com.google.common.base.Ascii.FF, -12, com.google.common.base.Ascii.SI, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 92, -102, -108, 106, -124, 32, -36, -92, 91, 84, -83, -77, -127, com.visa.cbp.getEncExpo.IResultReceiver2, 94, -86, 82, com.visa.cbp.getEncExpo.registerForActivityResult, 106, 76, -78, 80, -1, 19, 6, com.google.common.base.Ascii.VT, 125, -32, com.google.common.base.Ascii.SUB, -8, -118, -127, 120, 120, -102, 101, -102, -78, -125, -126, -123, 118, -114, 117, 75, -71, -122, 116, 81, -83, -122, 126, -114, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 122, -119, -98, -75, 77, -67, 67, 73, -70, 120, Byte.MIN_VALUE, -119, 126, com.visa.cbp.getEncExpo.IResultReceiver, 104, -100, 114, -117, 123, Byte.MIN_VALUE, 92, -91, 117, -124, -56, 59, -61, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -56, -47, 17, -45, 63, 56, 56, -38, 46, -57, 63, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -44, -28, -45, 5, com.visa.cbp.getEncExpo.startTransaction, 57, -52, -58, -10, 123, -59, -54, -10, com.google.common.base.Ascii.SI, 62, 63, 56, -53, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -56, 115, 115, -118, Byte.MAX_VALUE, 85, -86, com.visa.cbp.getEncExpo.registerForActivityResult, 123, -125, 103, 84, -69, 121, -120, 113, -123, -102, 83, -113, Byte.MIN_VALUE, 126, 118, 118, -118, com.visa.cbp.getEncExpo.IResultReceiver, -91, -100, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -113, Byte.MIN_VALUE, 120, -113, 118, -123, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 67, 114, 115, 116, -121, Byte.MAX_VALUE, -124, 89, 118, -106, 84, -82, -82, 113, -77, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -82, -92, 123, -124, 83, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86};
                RecordsJson = new int[]{384970780, -412824737, 751639001, 63987691, -1421562924, -687125123, -247305254, 1263226884, -1934739706, -1785778078, -401752381, -1006570653, -407410711, -1277098235, -1640983880, 1080267701, 1029957902, 1981950851};
            }

            static void init$1() {
                $$d = new byte[]{73, 117, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 43};
                $$e = 200;
            }

            static void init$0() {
                $$a = new byte[]{70, 56, kotlin.io.encoding.Base64.padSymbol, 63, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5};
                $$b = 166;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:123:0x1a22 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:124:0x1a23  */
            /* JADX WARN: Removed duplicated region for block: B:168:0x2024 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:489:0x18df A[Catch: Exception -> 0x1917, all -> 0x193d, IOException -> 0x1941, TryCatch #15 {IOException -> 0x1941, blocks: (B:443:0x185d, B:444:0x1860, B:455:0x1917, B:456:0x193c, B:466:0x1896, B:468:0x18a5, B:469:0x18a6, B:472:0x18b8, B:474:0x18bf, B:475:0x18c0, B:487:0x18d9, B:489:0x18df, B:490:0x18e0, B:513:0x18fa, B:515:0x1900, B:516:0x1901), top: B:305:0x1131 }] */
            /* JADX WARN: Removed duplicated region for block: B:490:0x18e0 A[Catch: Exception -> 0x1917, all -> 0x193d, IOException -> 0x1941, TryCatch #15 {IOException -> 0x1941, blocks: (B:443:0x185d, B:444:0x1860, B:455:0x1917, B:456:0x193c, B:466:0x1896, B:468:0x18a5, B:469:0x18a6, B:472:0x18b8, B:474:0x18bf, B:475:0x18c0, B:487:0x18d9, B:489:0x18df, B:490:0x18e0, B:513:0x18fa, B:515:0x1900, B:516:0x1901), top: B:305:0x1131 }] */
            /* JADX WARN: Removed duplicated region for block: B:515:0x1900 A[Catch: Exception -> 0x1917, all -> 0x193d, IOException -> 0x1941, TryCatch #15 {IOException -> 0x1941, blocks: (B:443:0x185d, B:444:0x1860, B:455:0x1917, B:456:0x193c, B:466:0x1896, B:468:0x18a5, B:469:0x18a6, B:472:0x18b8, B:474:0x18bf, B:475:0x18c0, B:487:0x18d9, B:489:0x18df, B:490:0x18e0, B:513:0x18fa, B:515:0x1900, B:516:0x1901), top: B:305:0x1131 }] */
            /* JADX WARN: Removed duplicated region for block: B:516:0x1901 A[Catch: Exception -> 0x1917, all -> 0x193d, IOException -> 0x1941, TRY_LEAVE, TryCatch #15 {IOException -> 0x1941, blocks: (B:443:0x185d, B:444:0x1860, B:455:0x1917, B:456:0x193c, B:466:0x1896, B:468:0x18a5, B:469:0x18a6, B:472:0x18b8, B:474:0x18bf, B:475:0x18c0, B:487:0x18d9, B:489:0x18df, B:490:0x18e0, B:513:0x18fa, B:515:0x1900, B:516:0x1901), top: B:305:0x1131 }] */
            /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r10v26 */
            /* JADX WARN: Type inference failed for: r10v27 */
            /* JADX WARN: Type inference failed for: r10v28 */
            /* JADX WARN: Type inference failed for: r10v29 */
            /* JADX WARN: Type inference failed for: r10v38 */
            /* JADX WARN: Type inference failed for: r10v40 */
            /* JADX WARN: Type inference failed for: r10v42 */
            /* JADX WARN: Type inference failed for: r14v105 */
            /* JADX WARN: Type inference failed for: r14v23, types: [byte] */
            /* JADX WARN: Type inference failed for: r14v24 */
            /* JADX WARN: Type inference failed for: r14v25 */
            /* JADX WARN: Type inference failed for: r14v28 */
            /* JADX WARN: Type inference failed for: r14v29 */
            /* JADX WARN: Type inference failed for: r14v51 */
            /* JADX WARN: Type inference failed for: r14v62 */
            /* JADX WARN: Type inference failed for: r14v66 */
            /* JADX WARN: Type inference failed for: r14v68 */
            /* JADX WARN: Type inference failed for: r15v39 */
            /* JADX WARN: Type inference failed for: r15v40 */
            /* JADX WARN: Type inference failed for: r15v41 */
            /* JADX WARN: Type inference failed for: r15v42 */
            /* JADX WARN: Type inference failed for: r15v43 */
            /* JADX WARN: Type inference failed for: r15v62 */
            /* JADX WARN: Type inference failed for: r15v65 */
            /* JADX WARN: Type inference failed for: r15v67 */
            /* JADX WARN: Type inference failed for: r1v376 */
            /* JADX WARN: Type inference failed for: r1v383 */
            /* JADX WARN: Type inference failed for: r1v492, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v540, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v587, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v633, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v663, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v693, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v720, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v749, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v762 */
            /* JADX WARN: Type inference failed for: r2v164, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v201, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r32v19 */
            /* JADX WARN: Type inference failed for: r32v33 */
            /* JADX WARN: Type inference failed for: r32v46, types: [long] */
            /* JADX WARN: Type inference failed for: r32v47 */
            /* JADX WARN: Type inference failed for: r32v48 */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Integer, java.lang.Object] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] valueOf(android.content.Context context, int i, int i2, int i3) {
                int i4;
                java.lang.String str;
                java.lang.Integer num;
                char c;
                java.lang.Object[] objArr2;
                int i5;
                java.lang.String str2;
                long j;
                java.lang.Object[] objArr3;
                int i6;
                java.lang.Object[] objArr4;
                char c2;
                java.lang.Object[] objArr5;
                int i7;
                char c3;
                java.lang.Object[] objArr6;
                ?? r32;
                java.lang.String str3;
                int i8;
                int i9;
                int i10;
                java.lang.String intern;
                java.lang.Process exec;
                java.lang.Throwable th;
                java.lang.Throwable cause;
                java.lang.Object newInstance;
                java.lang.Throwable th2;
                java.lang.Throwable cause2;
                java.lang.String str4;
                java.lang.Object obj;
                java.lang.String str5;
                java.lang.Throwable th3;
                java.lang.String str6;
                java.lang.String str7;
                java.lang.String str8;
                java.lang.String str9;
                java.lang.Object[] objArr7;
                int i11;
                java.lang.Object[] objArr8;
                int i12;
                java.lang.Object[] objArr9;
                int i13;
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(new int[]{1966875895, -1027579668, -1298723539, -2111975784, -388586113, -2048038439, -1134997850, 838363600, -1886944970, 645793479, 631508665, 1773677524, -1893090759, -280427709, -785324360, 866720033, 1659346919, -1704524552}, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 34, objArr10);
                java.lang.String intern2 = ((java.lang.String) objArr10[0]).intern();
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b((android.view.ViewConfiguration.getScrollBarSize() >> 8) - 1386585948, (-1949875557) - android.graphics.ImageFormat.getBitsPerPixel(0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 62, (byte) (android.view.View.combineMeasuredStates(0, 0) - 45), (short) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), objArr11);
                java.lang.String intern3 = ((java.lang.String) objArr11[0]).intern();
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                b((-1386585942) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.view.KeyEvent.keyCodeFromString("") - 1949875548, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 52, (byte) (android.view.View.resolveSize(0, 0) + 13), (short) android.view.KeyEvent.normalizeMetaState(0), objArr12);
                java.lang.String intern4 = ((java.lang.String) objArr12[0]).intern();
                try {
                    if (context == null) {
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        b((-1386586001) - (android.os.Process.myTid() >> 22), (-1949875589) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.os.Process.myPid() >> 22) - 56, (byte) (26 - android.view.View.getDefaultSize(0, 0)), (short) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr13);
                        java.lang.Object[] objArr14 = {((java.lang.String) objArr13[0]).intern()};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                        if (obj2 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.text.TextUtils.getCapsMode("", 0, 0) + 3161, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 33098));
                            byte b = $$a[41];
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            c(b, (short) (b | 35), b, objArr15);
                            obj2 = cls.getMethod((java.lang.String) objArr15[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj2);
                        }
                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr14)).longValue();
                        long j2 = i;
                        long j3 = ~j2;
                        long j4 = ~longValue;
                        long j5 = j3 | 32044899;
                        long j6 = ((-903) * longValue) + 29000633595L + (((~(j3 | longValue)) | (~(j2 | (-32044900)))) * (-1808)) + (((~((-32044900) | j4 | j2)) | (~(j5 | longValue))) * 904) + (((~((-32044900) | longValue)) | (~(j4 | j2)) | (~j5)) * 904) + 875425839;
                        int i14 = ~i;
                        if (((((int) j6) & ((((~(1332546928 | i14)) | (-1609407990) | (~((-1248332897) | i))) * 717) + 1708986608 + (((~(1332546928 | i)) | (~((-1248332897) | i14)) | (-1609407990)) * 717))) | (((int) (j6 >> 32)) & (((((~((-1147115407) | i14)) | 1146491526) * (-160)) - 952851766) + (((~(1710625478 | i14)) | (-1147115407)) * 160)))) != 0) {
                            objArr7 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 50}, null, null, new int[1]};
                            java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-587977145) | i)) | 553718056) * (-283)) - 1181444160) + ((~((-34259089) | i)) * 283))};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj3 == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 2713 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                byte b2 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                short s = $$a[41];
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                c(b2, s, (byte) s, objArr17);
                                obj3 = cls2.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                            }
                            i11 = 0;
                            ((int[]) objArr7[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr16)).intValue();
                        } else {
                            objArr7 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                            java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-857688513) | i)) | 962076424) * 398) - 937461464) + (((~((-857688513) | i14)) | 962076424) * 398))};
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj4 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 2713 - android.view.KeyEvent.normalizeMetaState(0), (char) android.view.View.MeasureSpec.getMode(0));
                                byte b3 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                short s2 = $$a[41];
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                c(b3, s2, (byte) s2, objArr19);
                                obj4 = cls3.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                            }
                            i11 = 0;
                            ((int[]) objArr7[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr18)).intValue();
                        }
                        if (((int[]) objArr7[1])[i11] != i) {
                            return objArr7;
                        }
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        a(new int[]{-1135883113, 1394425802, -2129589510, -1920138003, 443377263, 499904695, -557718594, -604676051, -183184367, -211729211}, 20 - android.view.KeyEvent.normalizeMetaState(i11), objArr20);
                        java.lang.Object[] objArr21 = {((java.lang.String) objArr20[i11]).intern()};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                        if (obj5 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - ((android.os.Process.getThreadPriority(i11) + 20) >> 6), 3161 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 33051));
                            byte b4 = $$a[41];
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            c(b4, (short) (b4 | 35), b4, objArr22);
                            obj5 = cls4.getMethod((java.lang.String) objArr22[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj5);
                        }
                        long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr21)).longValue();
                        long j7 = ~longValue2;
                        long j8 = ~((-69215790) | j2);
                        long j9 = ~(longValue2 | 69215789);
                        long j10 = (408 * longValue2) + 56272437270L + (((~(j7 | (-69215790))) | j8) * (-814)) + (((~(j7 | j3)) | j9 | j8) * 407) + (((~(longValue2 | j2)) | (~(69215789 | j2)) | j9) * 407) + 976686528;
                        if (((((int) j10) & (((((-1592524799) | r2) * (-476)) - 777486479) + ((~((-138512977) | i)) * 952) + ((~(i14 | (-138512977))) * 476))) | (((int) (j10 >> 32)) & ((((~(i14 | 768898296)) | (-2088842589)) * (-90)) + 1687905420 + (((~(768898296 | i)) | 746599512) * (-45)) + (((~(2088842588 | i)) | 768898296 | (~(i14 | (-2088842589)))) * 45)))) != 0) {
                            objArr8 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 60}, null, null, new int[1]};
                            int i15 = ~(937295871 | i);
                            java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~(i14 | (-631088346))) | 92840073) | i15) * (-252)) - 1343969436) + ((i15 | (~(i14 | (-538248273)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))};
                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj6 == null) {
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.red(0), 2713 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.view.View.resolveSize(0, 0));
                                byte b5 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                short s3 = $$a[41];
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                c(b5, s3, (byte) s3, objArr24);
                                obj6 = cls5.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                            }
                            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr23)).intValue();
                            i12 = 0;
                            ((int[]) objArr8[4])[0] = intValue;
                        } else {
                            objArr8 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                            java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((((~(i14 | (-805581134))) | 805572676) | r1) * (-713)) - 1309924182) + ((~((-224546355) | i)) * 1426) + ((~(i14 | (-224554812))) * 713))};
                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj7 == null) {
                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 50, 2713 - android.view.KeyEvent.normalizeMetaState(0), (char) android.text.TextUtils.getOffsetAfter("", 0));
                                byte b6 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                short s4 = $$a[41];
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                c(b6, s4, (byte) s4, objArr26);
                                obj7 = cls6.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                            }
                            int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr25)).intValue();
                            i12 = 0;
                            ((int[]) objArr8[4])[0] = intValue2;
                        }
                        if (((int[]) objArr8[1])[i12] != i) {
                            return objArr8;
                        }
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        a(new int[]{-308634845, -253596754, 1693835943, -591282344, 1266011155, 1280823676, 144926785, 1993080494, 1251501706, -1324394152, 1966875895, -1027579668, -1880217184, -38539218, 1956952964, -921245712, 694338981, -690931026}, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 36, objArr27);
                        java.lang.Object[] objArr28 = {((java.lang.String) objArr27[i12]).intern()};
                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                        if (obj8 == null) {
                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - ((android.os.Process.getThreadPriority(i12) + 20) >> 6), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i12) + 3162, (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33099));
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            c(r3[22], (short) ($$b >>> 2), (byte) (-$$a[16]), objArr29);
                            obj8 = cls7.getMethod((java.lang.String) objArr29[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj8);
                        }
                        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj8).invoke(null, objArr28)).longValue();
                        long j11 = ~longValue3;
                        long j12 = (longValue3 * 965) + 510359756984L + (((~(j11 | j2)) | 529968595) * (-964)) + (((~(j11 | j3)) | (~((-529968596) | j11))) * (-964)) + 1525403499;
                        if (((((int) j12) & ((((~((-1651430432) | i)) | (~(i14 | 1206310454))) * (-1808)) + 1519274269 + (((~((-1114035223) | i)) | (~(i14 | 1743705663))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~((-1206310455) | i)) | 537395209 | (~(i14 | 1651430431))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))) | (((((~((-1101799535) | i)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 131076786) + (((~(i14 | (-1101799535))) | (-1772988911)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING)) & ((int) (j12 >> 32)))) != 0) {
                            objArr9 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 80}, null, null, new int[1]};
                            java.lang.Object[] objArr30 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i14 | (-129917606))) | (~((-900218340) | i)) | (~(i14 | 900218339))) * 959) + 211052840 + (((~((-129917606) | i)) | (~(i14 | (-900218340))) | (~(900218339 | i))) * 959))};
                            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj9 == null) {
                                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                byte b7 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                short s5 = $$a[41];
                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                c(b7, s5, (byte) s5, objArr31);
                                obj9 = cls8.getMethod((java.lang.String) objArr31[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj9);
                            }
                            i13 = 0;
                            ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr30)).intValue();
                        } else {
                            objArr9 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                            java.lang.Object[] objArr32 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-314149722) | i)) | 44630281) * 345) + 2115520832 + (((~(i14 | (-314149722))) | 671355942) * 345) + ((~((-44630282) | i)) * 345))};
                            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj10 == null) {
                                java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.getMode(0), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2714, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                byte b8 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                short s6 = $$a[41];
                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                c(b8, s6, (byte) s6, objArr33);
                                obj10 = cls9.getMethod((java.lang.String) objArr33[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
                            }
                            i13 = 0;
                            ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr32)).intValue();
                        }
                        if (((int[]) objArr9[1])[i13] != i) {
                            return objArr9;
                        }
                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                        a(new int[]{-308634845, -253596754, 1693835943, -591282344, 1266011155, 1280823676, -1514358030, 582113869, 1843236961, -93669912, -1217276938, 1829139054, -1704353433, -1197563064, -2114996758, 1129274708, 110075995, -475133485, 1476896516, 690237481, -1916440573, -1737066889}, android.view.View.combineMeasuredStates(i13, i13) + 42, objArr34);
                        java.lang.Object[] objArr35 = {((java.lang.String) objArr34[i13]).intern()};
                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                        if (obj11 == null) {
                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 36, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3162, (char) (33099 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)));
                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                            c(r3[22], (short) ($$b >>> 2), (byte) (-$$a[16]), objArr36);
                            obj11 = cls10.getMethod((java.lang.String) objArr36[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj11);
                        }
                        long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj11).invoke(null, objArr35)).longValue();
                        long j13 = ~(121746325 | j3);
                        long j14 = ~((-121746326) | longValue4);
                        long j15 = ((-1527) * longValue4) + 93135938625L + ((longValue4 | j13) * 764) + (((~(j3 | longValue4)) | j14) * (-1528)) + (((~((~longValue4) | 121746325)) | j14 | j13) * 764) + 873688578;
                        if (((((int) (j15 >> 32)) & (((((~(i14 | (-1091110145))) | (~((-882264706) | i))) * (-302)) - 394593554) + ((~((-1091110145) | i)) * (-604)) + (((~((-1973374850) | i)) | 2101330) * 302))) | (((int) j15) & ((((~(i14 | 2091560901)) | (-2141913056) | (~(i14 | 654334491))) * 464) + 1347916325 + (((-50352155) | i) * (-464)) + (((~(654334491 | i)) | (-2141913056)) * 464)))) != 0) {
                            java.lang.Object[] objArr37 = {new int[]{i}, new int[]{i ^ 90}, null, null, new int[1]};
                            java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~(i14 | (-52058004))) | (~((-978077942) | i))) | (~(i14 | 978077941))) * 959) - 1602435816) + (((~(i | 978077941)) | (~((-52058004) | i)) | (~(i14 | (-978077942)))) * 959))};
                            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj12 == null) {
                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 49, 2713 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                byte b9 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                short s7 = $$a[41];
                                java.lang.Object[] objArr39 = new java.lang.Object[1];
                                c(b9, s7, (byte) s7, objArr39);
                                obj12 = cls11.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj12);
                            }
                            ((int[]) objArr37[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr38)).intValue();
                            return objArr37;
                        }
                        java.lang.Object[] objArr40 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                        int i16 = ~(i14 | (-407489612));
                        java.lang.Object[] objArr41 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((622071860 | i16 | (~(407489611 | i))) * (-338)) + 837027120 + ((i16 | (~(i | 1029561471))) * 338))};
                        java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj13 == null) {
                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), android.view.MotionEvent.axisFromString("") + 2714, (char) android.view.KeyEvent.normalizeMetaState(0));
                            byte b10 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                            short s8 = $$a[41];
                            java.lang.Object[] objArr42 = new java.lang.Object[1];
                            c(b10, s8, (byte) s8, objArr42);
                            obj13 = cls12.getMethod((java.lang.String) objArr42[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj13);
                        }
                        ((int[]) objArr40[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj13).invoke(null, objArr41)).intValue();
                        return objArr40;
                    }
                    int i17 = i;
                    java.lang.Integer num2 = -604620973;
                    try {
                        java.lang.Object[] objArr43 = new java.lang.Object[1];
                        b(android.view.MotionEvent.axisFromString("") - 1386585950, (android.view.KeyEvent.getMaxKeyCode() >> 16) - 1949875578, (-45) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (android.os.Process.getGidForName("") - 87), (short) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr43);
                        java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr43[0]).intern());
                        java.lang.Object[] objArr44 = new java.lang.Object[1];
                        a(new int[]{59693583, -127724350, -592385729, -840272299, 130115393, -674894848, 1611332455, 1280159546}, 14 - android.text.TextUtils.indexOf("", "", 0), objArr44);
                        java.lang.String str10 = (java.lang.String) cls13.getMethod(((java.lang.String) objArr44[0]).intern(), null).invoke(context, null);
                        java.lang.Object[] objArr45 = new java.lang.Object[1];
                        b((-1386585951) - android.view.View.MeasureSpec.getSize(0), android.text.TextUtils.getCapsMode("", 0, 0) - 1949875578, (-46) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) (android.view.View.resolveSizeAndState(0, 0, 0) - 88), (short) android.text.TextUtils.getOffsetAfter("", 0), objArr45);
                        java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr45[0]).intern());
                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                        a(new int[]{355021994, -1541058355, 631508665, 1773677524, -1893090759, -280427709, -785324360, 866720033, 1659346919, -1704524552}, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17, objArr46);
                        java.lang.Object invoke = cls14.getMethod(((java.lang.String) objArr46[0]).intern(), null).invoke(context, null);
                        int indexOf = ((java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke)).indexOf(str10);
                        if (indexOf > 0) {
                            java.lang.String str11 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                            if (str11.length() >= 16) {
                                int i18 = 0;
                                for (int i19 = 16; i18 <= str11.length() - i19; i19 = 16) {
                                    java.lang.Object[] objArr47 = {str11.substring(i18, i18 + 16), 931995};
                                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                    if (obj14 == null) {
                                        str9 = str11;
                                        java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.view.KeyEvent.getDeadChar(0, 0), 2594 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) android.graphics.Color.green(0));
                                        byte[] bArr = $$a;
                                        byte b11 = bArr[41];
                                        num = num2;
                                        java.lang.Object[] objArr48 = new java.lang.Object[1];
                                        c(b11, (short) (b11 | 653), (byte) (-bArr[52]), objArr48);
                                        obj14 = cls15.getMethod((java.lang.String) objArr48[0], java.lang.String.class, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj14);
                                    } else {
                                        str9 = str11;
                                        num = num2;
                                    }
                                    long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj14).invoke(null, objArr47)).longValue();
                                    long j16 = i17;
                                    java.lang.String str12 = intern4;
                                    long j17 = ~j16;
                                    int i20 = indexOf;
                                    int i21 = i18;
                                    r32 = (565 * longValue5) + 260872070722L + (((~((~longValue5) | j17)) | 463360693 | (~(longValue5 | j16))) * (-564)) + ((~(463360693 | longValue5 | j16)) * 1128) + (((~(463360693 | j17)) | (~((-463360694) | longValue5))) * 564);
                                    long j18 = r32 + 1720461218;
                                    int i22 = ~i17;
                                    if (((((int) j18) & ((((1158709392 | i17) * 988) - 449847391) + (((~((-273644304) | i22)) | 268771589) * (-1976)) + (((~(1163582106 | i17)) | 1158709392 | (~((-1163582107) | i22))) * 988))) | (((int) (j18 >> 32)) & ((((~(73643703 | i17)) | 1510737984) * 336) + 501358106 + (((~(1510870114 | i17)) | 73511573) * (-168)) + (((~(1510870114 | i22)) | 73643703) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)))) == -725904754) {
                                        objArr2 = new java.lang.Object[]{new int[1], new int[1], null, r3, new int[1]};
                                        java.lang.String str13 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                                        ((int[]) objArr2[0])[0] = i17;
                                        ((int[]) objArr2[1])[0] = i17 ^ 20;
                                        java.lang.Object[] objArr49 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-519113476) | i22)) | 510722305) * 446) + 1151005592 + (((~((-8391171) | i17)) | 300164) * 446) + 148881342)};
                                        java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj15 == null) {
                                            java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.ImageFormat.getBitsPerPixel(0), 2712 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                            byte b12 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                            short s9 = $$a[41];
                                            java.lang.Object[] objArr50 = new java.lang.Object[1];
                                            c(b12, s9, (byte) s9, objArr50);
                                            obj15 = cls16.getMethod((java.lang.String) objArr50[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj15);
                                        }
                                        ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr49)).intValue();
                                        i4 = i17;
                                        str = -1347122530;
                                        i5 = 1;
                                        c = 0;
                                        if (((int[]) objArr2[i5])[c] == i4) {
                                            return objArr2;
                                        }
                                        int[] iArr = new int[i5];
                                        int[] iArr2 = new int[i5];
                                        iArr[c] = i4;
                                        iArr2[c] = i4;
                                        java.lang.Object[] objArr51 = {iArr, iArr2, null, null, new int[i5]};
                                        int i23 = ~i4;
                                        java.lang.Object[] objArr52 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((34342 | i4) * 988) + 772721468 + (((~(11634351 | i23)) | 1006901584) * (-1976)) + (((~((-1018501594) | i4)) | 34342 | (~(1018501593 | i23))) * 988))};
                                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str);
                                        if (obj16 == null) {
                                            java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2714 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                            byte b13 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                            short s10 = $$a[41];
                                            java.lang.Object[] objArr53 = new java.lang.Object[1];
                                            c(b13, s10, (byte) s10, objArr53);
                                            obj16 = cls17.getMethod((java.lang.String) objArr53[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str, obj16);
                                        }
                                        ((int[]) objArr51[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr52)).intValue();
                                        if (((int[]) objArr51[1])[0] != i4) {
                                            return objArr51;
                                        }
                                        if ((i2 & 1) == 0) {
                                            java.lang.Object[] objArr54 = new java.lang.Object[1];
                                            a(new int[]{-1425710591, 1059729618, 1615149790, 1554228418, 1594476188, 1013879186, -451137261, 1255492751}, 13 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr54);
                                            try {
                                                java.lang.Object[] objArr55 = {((java.lang.String) objArr54[0]).intern()};
                                                java.lang.Object[] objArr56 = new java.lang.Object[1];
                                                b((android.view.ViewConfiguration.getScrollBarSize() >> 8) - 1386585951, (-1949875578) - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (-45) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) - 88), (short) android.view.KeyEvent.keyCodeFromString(""), objArr56);
                                                java.lang.Class<?> cls18 = java.lang.Class.forName(((java.lang.String) objArr56[0]).intern());
                                                java.lang.Object[] objArr57 = new java.lang.Object[1];
                                                b((-1386585945) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-1949875492) - android.view.View.combineMeasuredStates(0, 0), (-52) - android.view.View.getDefaultSize(0, 0), (byte) ((-49) - android.graphics.ImageFormat.getBitsPerPixel(0)), (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), objArr57);
                                                java.lang.Object invoke2 = cls18.getMethod(((java.lang.String) objArr57[0]).intern(), java.lang.String.class).invoke(context, objArr55);
                                                if (invoke2 != null) {
                                                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                                                    b((android.view.ViewConfiguration.getEdgeSlop() >> 16) - 1386585951, android.graphics.Color.argb(0, 0, 0, 0) - 1949875477, android.graphics.Color.green(0) - 31, (byte) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 111), (short) (android.view.MotionEvent.axisFromString("") + 1), objArr58);
                                                    java.lang.Class<?> cls19 = java.lang.Class.forName(((java.lang.String) objArr58[0]).intern());
                                                    java.lang.Object[] objArr59 = new java.lang.Object[1];
                                                    b((-1386585946) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.text.TextUtils.getTrimmedLength("") - 1949875441, ((android.os.Process.getThreadPriority(0) + 20) >> 6) - 53, (byte) ((android.view.ViewConfiguration.getTapTimeout() >> 16) - 36), (short) android.view.View.getDefaultSize(0, 0), objArr59);
                                                    java.util.List list = (java.util.List) cls19.getMethod(((java.lang.String) objArr59[0]).intern(), null).invoke(invoke2, null);
                                                    if (list != null) {
                                                        java.util.Iterator it = list.iterator();
                                                        while (it.hasNext()) {
                                                            java.lang.Object next = it.next();
                                                            java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                            b(android.text.TextUtils.getOffsetAfter("", 0) - 1386585951, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 1949875427, android.view.Gravity.getAbsoluteGravity(0, 0) - 39, (byte) (36 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (short) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr60);
                                                            java.lang.Class<?> cls20 = java.lang.Class.forName(((java.lang.String) objArr60[0]).intern());
                                                            java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                            a(new int[]{59693583, -127724350, -592385729, -840272299, 130115393, -674894848, 1611332455, 1280159546}, 14 - android.text.TextUtils.indexOf("", ""), objArr61);
                                                            java.lang.String str14 = (java.lang.String) cls20.getMethod(((java.lang.String) objArr61[0]).intern(), null).invoke(next, null);
                                                            java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                            b(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 1386585950, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1949875478, (android.view.ViewConfiguration.getTouchSlop() >> 8) - 31, (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 111), (short) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr62);
                                                            java.lang.Class<?> cls21 = java.lang.Class.forName(((java.lang.String) objArr62[0]).intern());
                                                            java.util.Iterator it2 = it;
                                                            java.lang.String str15 = str;
                                                            java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                            b((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1386585943, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1949875400, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 51, (byte) ((-13) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), (short) android.text.TextUtils.getOffsetBefore("", 0), objArr63);
                                                            if (((java.lang.Boolean) cls21.getMethod(((java.lang.String) objArr63[0]).intern(), java.lang.String.class).invoke(invoke2, str14)).booleanValue()) {
                                                                int i24 = 20;
                                                                if (str14.length() >= 20) {
                                                                    int i25 = 0;
                                                                    while (i25 <= str14.length() - i24) {
                                                                        java.lang.Object[] objArr64 = {str14.substring(i25, i25 + 20), 931995};
                                                                        java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                                        if (obj17 == null) {
                                                                            java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 28, 2594 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                                            byte[] bArr2 = $$a;
                                                                            byte b14 = bArr2[41];
                                                                            java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                                            c(b14, (short) (b14 | 653), (byte) (-bArr2[52]), objArr65);
                                                                            obj17 = cls22.getMethod((java.lang.String) objArr65[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj17);
                                                                        }
                                                                        long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj17).invoke(null, objArr64)).longValue();
                                                                        long j19 = ~longValue6;
                                                                        long j20 = i4;
                                                                        long j21 = ~j20;
                                                                        int i26 = i25;
                                                                        java.lang.String str16 = str14;
                                                                        long j22 = (46 * longValue6) + 43853489166L + (((~(j19 | j21)) | 953336721) * (-90)) + (((~(j19 | j20)) | (~(longValue6 | 953336721))) * (-45)) + (((~((-953336722) | j20)) | j19 | (~(953336721 | j21))) * 45) + 303763803;
                                                                        int i27 = 1875450252 | i23;
                                                                        if (((((int) j22) & ((i27 * 495) + 1832760652 + (((~i27) | 713560200) * 495))) | (((int) (j22 >> 32)) & (((((~((-733211838) | i4)) | 17973288) * (-140)) - 1465697778) + ((~((-715238550) | i4)) * 70) + (((~((-2124529048) | i4)) | 1427263786) * 70)))) == 1245577864) {
                                                                            objArr6 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 70}, null, null, new int[1]};
                                                                            int i28 = ~(122374813 | i4);
                                                                            java.lang.Object[] objArr66 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-101400714) | i23)) | (~(907761131 | i4))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 1409128184 + (((~((-907761132) | i23)) | i28) * (-1040)) + ((i28 | (~((-122374814) | i23)) | 806360418) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))};
                                                                            str2 = str15;
                                                                            java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                                            if (obj18 == null) {
                                                                                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 50, 2713 - android.graphics.Color.alpha(0), (char) android.text.TextUtils.indexOf("", "", 0));
                                                                                byte b15 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                                                                short s11 = $$a[41];
                                                                                java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                                                c(b15, s11, (byte) s11, objArr67);
                                                                                obj18 = cls23.getMethod((java.lang.String) objArr67[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj18);
                                                                            }
                                                                            c3 = 0;
                                                                            ((int[]) objArr6[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr66)).intValue();
                                                                            if (((int[]) objArr6[1])[c3] != i4) {
                                                                                return objArr6;
                                                                            }
                                                                        } else {
                                                                            i25 = i26 + 1;
                                                                            i24 = 20;
                                                                            str14 = str16;
                                                                        }
                                                                    }
                                                                } else {
                                                                    continue;
                                                                }
                                                            }
                                                            it = it2;
                                                            str = str15;
                                                        }
                                                    }
                                                }
                                                str2 = str;
                                                java.lang.Object[] objArr68 = {new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                                int i29 = ~(711989307 | i4);
                                                java.lang.Object[] objArr69 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-40896522) | i23)) | (~(318146637 | i4))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 1904589544) + (((~((-318146638) | i23)) | i29) * (-1040)) + ((i29 | (~((-711989308) | i23)) | 277250116) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))};
                                                java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                if (obj19 == null) {
                                                    java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.ImageFormat.getBitsPerPixel(0), 2761 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.View.MeasureSpec.getSize(0));
                                                    byte b16 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                                    short s12 = $$a[41];
                                                    java.lang.Object[] objArr70 = new java.lang.Object[1];
                                                    c(b16, s12, (byte) s12, objArr70);
                                                    obj19 = cls24.getMethod((java.lang.String) objArr70[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj19);
                                                }
                                                int intValue3 = ((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(null, objArr69)).intValue();
                                                c3 = 0;
                                                ((int[]) objArr68[4])[0] = intValue3;
                                                objArr6 = objArr68;
                                                if (((int[]) objArr6[1])[c3] != i4) {
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                java.lang.Throwable cause3 = th4.getCause();
                                                if (cause3 != null) {
                                                    throw cause3;
                                                }
                                                throw th4;
                                            }
                                        } else {
                                            str2 = str;
                                        }
                                        java.lang.Object[] objArr71 = new java.lang.Object[1];
                                        b((-1386586002) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (-1949875590) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (-57) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) (android.view.Gravity.getAbsoluteGravity(0, 0) + 26), (short) android.graphics.Color.red(0), objArr71);
                                        java.lang.Object[] objArr72 = {((java.lang.String) objArr71[0]).intern()};
                                        java.lang.Integer num3 = num;
                                        java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                                        if (obj20 == null) {
                                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 36, 3161 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 33099));
                                            byte b17 = $$a[41];
                                            java.lang.Object[] objArr73 = new java.lang.Object[1];
                                            c(b17, (short) (b17 | 35), b17, objArr73);
                                            obj20 = cls25.getMethod((java.lang.String) objArr73[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj20);
                                        }
                                        long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, objArr72)).longValue();
                                        long j23 = ~longValue7;
                                        long j24 = i4;
                                        long j25 = ~j24;
                                        long j26 = (984 * longValue7) + 2208699751950L + ((j23 | (-1124020230)) * 983) + (((~(j23 | j25)) | 1124020229) * (-983)) + (((~(longValue7 | 1124020229)) | (~(1124020229 | j25))) * 983) + 2031490968;
                                        if (((((int) (j26 >> 32)) & (((((~((-1529844617) | i4)) | 17109384) * (-566)) - 1763764134) + ((~((-1512735233) | i4)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))) | (((int) j26) & ((((~(1188595760 | i4)) | 1669145125) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 1267125577 + (((~(1188595760 | i23)) | 556081669) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE)))) != 0) {
                                            objArr3 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 50}, null, null, new int[1]};
                                            java.lang.Object[] objArr74 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-606601385) | i23)) | 423534560) * 226) + 588891264 + (((~((-423534561) | i4)) | 420912960 | (~((-603979785) | i23))) * (-113)) + ((~((-606601385) | i4)) * 113))};
                                            java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                            if (obj21 == null) {
                                                j = j25;
                                                java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 50, 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.os.Process.myPid() >> 22));
                                                byte b18 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                                short s13 = $$a[41];
                                                java.lang.Object[] objArr75 = new java.lang.Object[1];
                                                c(b18, s13, (byte) s13, objArr75);
                                                obj21 = cls26.getMethod((java.lang.String) objArr75[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj21);
                                            } else {
                                                j = j25;
                                            }
                                            i6 = 0;
                                            ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr74)).intValue();
                                        } else {
                                            j = j25;
                                            objArr3 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                            java.lang.Object[] objArr76 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-907286665) | i23)) | 805572744 | (~(122849280 | i23))) * (-397)) + 1229332616 + ((826708104 | i4) * 397))};
                                            java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                            if (obj22 == null) {
                                                java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 50, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2713, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                                byte b19 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                                short s14 = $$a[41];
                                                java.lang.Object[] objArr77 = new java.lang.Object[1];
                                                c(b19, s14, (byte) s14, objArr77);
                                                obj22 = cls27.getMethod((java.lang.String) objArr77[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj22);
                                            }
                                            i6 = 0;
                                            ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr76)).intValue();
                                        }
                                        if (((int[]) objArr3[1])[i6] != i4) {
                                            return objArr3;
                                        }
                                        java.lang.Object[] objArr78 = new java.lang.Object[1];
                                        a(new int[]{-1135883113, 1394425802, -2129589510, -1920138003, 443377263, 499904695, -557718594, -604676051, -183184367, -211729211}, 20 - android.graphics.Color.green(i6), objArr78);
                                        java.lang.Object[] objArr79 = {((java.lang.String) objArr78[i6]).intern()};
                                        java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                                        if (obj23 == null) {
                                            java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i6) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i6) == 0.0d ? 0 : -1)) + 36, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 3161, (char) (33099 - android.text.TextUtils.indexOf("", "", 0, 0)));
                                            byte b20 = $$a[41];
                                            java.lang.Object[] objArr80 = new java.lang.Object[1];
                                            c(b20, (short) (b20 | 35), b20, objArr80);
                                            obj23 = cls28.getMethod((java.lang.String) objArr80[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj23);
                                        }
                                        long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj23).invoke(null, objArr79)).longValue();
                                        long j27 = ~longValue8;
                                        long j28 = ((-103) * longValue8) + 47220635619L + (((~(j27 | j24)) | (~(j27 | 458452772))) * 104) + ((~(longValue8 | j | (-458452773))) * (-104)) + (((-458452773) | j24) * 104) + 1365923511;
                                        if (((((int) (j28 >> 32)) & ((((~((-1566905968) | i23)) | (-129679557)) * (-90)) + 1687905420 + (((~((-1566905968) | i4)) | 43696256) * (-45)) + (((~(129679556 | i4)) | (-1566905968) | (~((-129679557) | i23))) * 45))) | (((int) j28) & ((((~((-907524323) | i23)) | 33687680) * 98) + 891034324 + (((~((-1950216564) | i23)) | (-907524323) | (~(1950216563 | i4))) * (-49)) + (((~((-907524323) | i4)) | (-1983904244)) * 49)))) != 0) {
                                            objArr4 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 60}, null, null, new int[1]};
                                            int i30 = 186391898 | i23;
                                            java.lang.Object[] objArr81 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((i30 * 495) + 1340907553 + (((~i30) | 34078986) * 495))};
                                            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                            if (obj24 == null) {
                                                java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.ImageFormat.getBitsPerPixel(0), 2713 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) android.view.KeyEvent.normalizeMetaState(0));
                                                byte b21 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                                short s15 = $$a[41];
                                                java.lang.Object[] objArr82 = new java.lang.Object[1];
                                                c(b21, s15, (byte) s15, objArr82);
                                                obj24 = cls29.getMethod((java.lang.String) objArr82[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj24);
                                            }
                                            int intValue4 = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr81)).intValue();
                                            c2 = 0;
                                            ((int[]) objArr4[4])[0] = intValue4;
                                        } else {
                                            objArr4 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                            java.lang.Object[] objArr83 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-7414082) | i23)) | (~(1022721863 | i4))) * (-272)) + 2034975400 + (((~((-209003846) | i4)) | 201589764) * (-272)) + (((~(209003845 | i4)) | 821132099) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))};
                                            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                            if (obj25 == null) {
                                                java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 50, 2713 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                byte b22 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                                short s16 = $$a[41];
                                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                c(b22, s16, (byte) s16, objArr84);
                                                obj25 = cls30.getMethod((java.lang.String) objArr84[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj25);
                                            }
                                            c2 = 0;
                                            ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr83)).intValue();
                                        }
                                        if (((int[]) objArr4[1])[c2] != i4) {
                                            return objArr4;
                                        }
                                        java.lang.Object[] objArr85 = new java.lang.Object[1];
                                        a(new int[]{-308634845, -253596754, 1693835943, -591282344, 1266011155, 1280823676, 144926785, 1993080494, 1251501706, -1324394152, 1966875895, -1027579668, -1880217184, -38539218, 1956952964, -921245712, 694338981, -690931026}, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 35, objArr85);
                                        java.lang.Object[] objArr86 = {((java.lang.String) objArr85[0]).intern()};
                                        java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                        if (obj26 == null) {
                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 37, 3161 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (33099 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)));
                                            java.lang.Object[] objArr87 = new java.lang.Object[1];
                                            c(r6[22], (short) ($$b >>> 2), (byte) (-$$a[16]), objArr87);
                                            obj26 = cls31.getMethod((java.lang.String) objArr87[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj26);
                                        }
                                        long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr86)).longValue();
                                        long j29 = ~longValue9;
                                        long j30 = 1040494487 + (((-565) * longValue9) - 25548784128L) + (((~(longValue9 | 45059583)) | (~(j24 | 45059583))) * (-566)) + ((~((-45059584) | j29)) * 566) + ((~(45059583 | j29 | j24)) * 566);
                                        if (((((int) (j30 >> 32)) & (((((~(1475591105 | i4)) | (-1382149780)) * (-366)) - 1764584302) + (((~(i4 | (-17427))) | 93458752) * 366))) | (((int) j30) & (((((~(1178799547 | i4)) | (~((-258426863) | i23))) * (-1808)) - 230478227) + (((~(1332170751 | i4)) | (~((-105055659) | i23))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(258426862 | i4)) | 153371204 | (~((-1178799548) | i23))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)))) != 0) {
                                            objArr5 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 80}, null, null, new int[1]};
                                            java.lang.Object[] objArr88 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-435922896) | i23)) | (~(1006370815 | i4))) * (-831)) - 1659963150) + ((~((-412157767) | i4)) * (-1662)) + (((~((-594213050) | i23)) | (~(594213049 | i4)) | (~(435922895 | i4))) * 831))};
                                            java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                            if (obj27 == null) {
                                                java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 50, 2713 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                                                byte b23 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                                short s17 = $$a[41];
                                                java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                c(b23, s17, (byte) s17, objArr89);
                                                obj27 = cls32.getMethod((java.lang.String) objArr89[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj27);
                                            }
                                            i7 = 0;
                                            ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj27).invoke(null, objArr88)).intValue();
                                        } else {
                                            objArr5 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                            java.lang.Object[] objArr90 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-880529683) | i23)) | 149606262) * (-602)) - 349745618) + (((~((-880529683) | i4)) | 6996242 | (~(1023139702 | i23))) * (-301)) + ((~(149606262 | i23)) * 301))};
                                            java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                            if (obj28 == null) {
                                                java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getTrimmedLength(""), 2713 - android.view.View.getDefaultSize(0, 0), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                                                byte b24 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                                short s18 = $$a[41];
                                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                c(b24, s18, (byte) s18, objArr91);
                                                obj28 = cls33.getMethod((java.lang.String) objArr91[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj28);
                                            }
                                            i7 = 0;
                                            ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr90)).intValue();
                                        }
                                        if (((int[]) objArr5[1])[i7] != i4) {
                                            return objArr5;
                                        }
                                        java.lang.Object[] objArr92 = new java.lang.Object[1];
                                        a(new int[]{-308634845, -253596754, 1693835943, -591282344, 1266011155, 1280823676, -1514358030, 582113869, 1843236961, -93669912, -1217276938, 1829139054, -1704353433, -1197563064, -2114996758, 1129274708, 110075995, -475133485, 1476896516, 690237481, -1916440573, -1737066889}, android.view.KeyEvent.keyCodeFromString("") + 42, objArr92);
                                        java.lang.Object[] objArr93 = {((java.lang.String) objArr92[i7]).intern()};
                                        java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                        if (obj29 == null) {
                                            java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(i7) + 36, (android.util.TypedValue.complexToFraction(i7, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i7, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3161, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 33100));
                                            java.lang.Object[] objArr94 = new java.lang.Object[1];
                                            c(r5[22], (short) ($$b >>> 2), (byte) (-$$a[16]), objArr94);
                                            obj29 = cls34.getMethod((java.lang.String) objArr94[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj29);
                                        }
                                        long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr93)).longValue();
                                        long j31 = ~longValue10;
                                        long j32 = j31 | (-947168083);
                                        java.lang.String str17 = str2;
                                        long j33 = 48266821 + (868 * longValue10) + 822141895176L + (((~(j | (-947168083))) | (~(j31 | j))) * (-867)) + (((~j32) | (~(j24 | (-947168083))) | (~(j31 | j24))) * (-1734)) + (((~(j32 | j)) | (~(longValue10 | (-947168083) | j24)) | (~(947168082 | j31 | j24))) * 867);
                                        if (((((int) (j33 >> 32)) & ((((((~((-1946664083) | i23)) | 1610782736) | r5) * (-502)) - 1698659062) + (((~((-173556326) | i4)) | (~((-335881347) | i23))) * 502))) | (((int) j33) & (((~((-1578458245) | i23)) * 979) + 2022601676 + ((1279282641 | i4) * (-979)) + (((~((-1578458245) | i4)) | (~(1279282641 | i23))) * 979)))) != 0) {
                                            java.lang.Object[] objArr95 = {new int[]{i4}, new int[]{i4 ^ 90}, null, null, new int[1]};
                                            java.lang.Object[] objArr96 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(620953156 | i4)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 235040212) + (((~(i23 | 620953156)) | 172612) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))};
                                            java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str17);
                                            if (obj30 == null) {
                                                java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 50, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2713, (char) android.text.TextUtils.indexOf("", "", 0));
                                                byte b25 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                                short s19 = $$a[41];
                                                java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                c(b25, s19, (byte) s19, objArr97);
                                                obj30 = cls35.getMethod((java.lang.String) objArr97[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str17, obj30);
                                            }
                                            ((int[]) objArr95[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr96)).intValue();
                                            return objArr95;
                                        }
                                        java.lang.Object[] objArr98 = {new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                        java.lang.Object[] objArr99 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-777250688) | i4)) | (~(252885257 | i23))) * (-1808)) - 1684885192) + (((~((-236101898) | i4)) | (~(794034047 | i23))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(i23 | 777250687)) | (~((-252885258) | i4)) | 541148790) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))};
                                        java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str17);
                                        if (obj31 == null) {
                                            java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.getSize(0), 2713 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) android.view.View.MeasureSpec.getMode(0));
                                            byte b26 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                            short s20 = $$a[41];
                                            java.lang.Object[] objArr100 = new java.lang.Object[1];
                                            c(b26, s20, (byte) s20, objArr100);
                                            obj31 = cls36.getMethod((java.lang.String) objArr100[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str17, obj31);
                                        }
                                        ((int[]) objArr98[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr99)).intValue();
                                        return objArr98;
                                    }
                                    i18 = i21 + 1;
                                    str11 = str9;
                                    num2 = num;
                                    intern4 = str12;
                                    indexOf = i20;
                                }
                            }
                            int i31 = indexOf;
                            java.lang.String str18 = intern4;
                            num = num2;
                            java.lang.String str19 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                            int i32 = 6;
                            if (str19.length() >= 6) {
                                int i33 = 0;
                                r32 = r32;
                                while (i33 <= str19.length() - i32) {
                                    java.lang.Object[] objArr101 = {str19.substring(i33, i33 + 6), 931995};
                                    java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                    if (obj32 == null) {
                                        java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2594, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                                        byte[] bArr3 = $$a;
                                        byte b27 = bArr3[41];
                                        java.lang.Object[] objArr102 = new java.lang.Object[1];
                                        c(b27, (short) (b27 | 653), (byte) (-bArr3[52]), objArr102);
                                        obj32 = cls37.getMethod((java.lang.String) objArr102[0], java.lang.String.class, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj32);
                                    }
                                    long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj32).invoke(null, objArr101)).longValue();
                                    long j34 = ~longValue11;
                                    long j35 = i17;
                                    long j36 = ~j35;
                                    java.lang.String str20 = str19;
                                    int i34 = i33;
                                    java.lang.Object obj33 = invoke;
                                    java.lang.String str21 = intern3;
                                    long j37 = (((-209) * longValue11) - 42068035812L) + ((~(j34 | (-201282469))) * 210) + (((~(j34 | j36)) | (~(j35 | (-201282469)))) * 210) + (((~(201282468 | j34 | j35)) | (~((-201282469) | j36 | longValue11))) * 210);
                                    long j38 = j37 + 1055818056;
                                    int i35 = (int) (j38 >> 32);
                                    int i36 = ~i17;
                                    int i37 = ~(674524780 | i17);
                                    if (((((int) j38) & (((r2 * 992) - 1537497691) + (((~((-827232485) | i17)) | 822480992 | (~(2035259893 | i36))) * (-496)) + ((2030508401 | i17) * 496))) | ((((((~((-2111751192) | i36)) | i37) * 1150) - 334238508) + ((i37 | (~((-674524781) | i36))) * (-575)) + (((~((-2111751192) | i17)) | (~(2111751191 | i36))) * 575)) & i35)) == -2096167706) {
                                        objArr2 = new java.lang.Object[]{new int[1], new int[1], null, r3, new int[1]};
                                        java.lang.String str22 = (java.lang.String) java.lang.Class.forName(intern2).getField(str21).get(obj33);
                                        ((int[]) objArr2[0])[0] = i17;
                                        ((int[]) objArr2[1])[0] = i17 ^ 20;
                                        java.lang.Object[] objArr103 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(26278320 | i36)) | 1046938121) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 234010808) + ((~((-1046938122) | i17)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~((-1056414266) | i36)) | 9476144 | (~(1073216441 | i17))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                                        java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj34 == null) {
                                            java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 51, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2713, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                                            byte b28 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                            short s21 = $$a[41];
                                            java.lang.Object[] objArr104 = new java.lang.Object[1];
                                            c(b28, s21, (byte) s21, objArr104);
                                            obj34 = cls38.getMethod((java.lang.String) objArr104[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj34);
                                        }
                                        ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr103)).intValue();
                                        i4 = i17;
                                        str = -1347122530;
                                        i5 = 1;
                                        c = 0;
                                        if (((int[]) objArr2[i5])[c] == i4) {
                                        }
                                    } else {
                                        i33 = i34 + 1;
                                        intern3 = str21;
                                        invoke = obj33;
                                        str19 = str20;
                                        i32 = 6;
                                        r32 = j37;
                                    }
                                }
                            }
                            java.lang.Object obj35 = invoke;
                            java.lang.String str23 = intern3;
                            int i38 = 0;
                            java.lang.String substring = ((java.lang.String) java.lang.Class.forName(intern2).getField(str23).get(obj35)).substring(0, i31);
                            java.lang.Object[] objArr105 = new java.lang.Object[1];
                            a(new int[]{-628942064, 90859180}, 1 - android.view.View.MeasureSpec.getSize(0), objArr105);
                            java.lang.String[] split = substring.split(((java.lang.String) objArr105[0]).intern());
                            int length = split.length;
                            int i39 = 0;
                            ?? r1 = split;
                            java.lang.String str24 = -1347122530;
                            int i40 = r32;
                            while (i39 < length) {
                                ?? r10 = r1[i39];
                                ?? indexOf2 = (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i38, i38) - 90);
                                java.lang.Object obj36 = r1;
                                java.lang.Object[] objArr106 = new java.lang.Object[1];
                                ?? r15 = 1386585957;
                                b((android.util.TypedValue.complexToFloat(i38) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(i38) == 0.0f ? 0 : -1)) - 1386585957, android.view.KeyEvent.keyCodeFromString("") - 1949875550, android.view.KeyEvent.getDeadChar(i38, i38) - 65, indexOf2, (short) ((-16777216) - android.graphics.Color.rgb(i38, i38, i38)), objArr106);
                                if (r10.split(((java.lang.String) objArr106[0]).intern()).length > 1) {
                                    synchronized (((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 48, 1582 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1))))) {
                                        try {
                                            try {
                                                java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                a(new int[]{570868336, -87984957, 143623426, 2039630075, -1244286755, -999684413, 1642262159, 1001248439}, android.graphics.Color.alpha(0) + 16, objArr107);
                                                intern = ((java.lang.String) objArr107[0]).intern();
                                                try {
                                                    try {
                                                        java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
                                                        java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                        a(new int[]{1867696228, -1149583474}, 1 - android.view.MotionEvent.axisFromString(""), objArr108);
                                                        exec = runtime.exec(((java.lang.String) objArr108[0]).intern(), (java.lang.String[]) null, (java.io.File) null);
                                                        try {
                                                            java.lang.Object[] objArr109 = {exec.getInputStream()};
                                                            java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                            if (obj37 == null) {
                                                                try {
                                                                    i40 = length;
                                                                    try {
                                                                        obj37 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 44, android.graphics.Color.argb(0, 0, 0, 0) + 1507, (char) android.text.TextUtils.getOffsetBefore("", 0))).getDeclaredConstructor(java.io.InputStream.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, obj37);
                                                                    } catch (java.lang.Throwable th5) {
                                                                        th = th5;
                                                                        th = th;
                                                                        cause = th.getCause();
                                                                        if (cause == null) {
                                                                        }
                                                                    }
                                                                } catch (java.lang.Throwable th6) {
                                                                    th = th6;
                                                                }
                                                            } else {
                                                                i40 = length;
                                                            }
                                                            try {
                                                                newInstance = ((java.lang.reflect.Constructor) obj37).newInstance(objArr109);
                                                            } catch (java.lang.Throwable th7) {
                                                                th = th7;
                                                                th = th;
                                                                cause = th.getCause();
                                                                if (cause == null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (java.lang.Throwable th8) {
                                                            th = th8;
                                                        }
                                                    } catch (java.lang.Exception unused) {
                                                    }
                                                } catch (java.lang.Exception unused2) {
                                                }
                                            } catch (java.io.IOException unused3) {
                                            }
                                        } catch (java.io.IOException unused4) {
                                            str3 = intern2;
                                            i9 = i17;
                                            i10 = length;
                                        }
                                        try {
                                            try {
                                                java.lang.Object[] objArr110 = {exec.getErrorStream()};
                                                java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                if (obj38 == null) {
                                                    try {
                                                        i8 = i39;
                                                        try {
                                                            obj38 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.KeyEvent.keyCodeFromString(""), 1507 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1))).getDeclaredConstructor(java.io.InputStream.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, obj38);
                                                        } catch (java.lang.Throwable th9) {
                                                            th = th9;
                                                            th2 = th;
                                                            cause2 = th2.getCause();
                                                            if (cause2 == null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        }
                                                    } catch (java.lang.Throwable th10) {
                                                        th = th10;
                                                    }
                                                } else {
                                                    i8 = i39;
                                                }
                                                try {
                                                    java.lang.Object newInstance2 = ((java.lang.reflect.Constructor) obj38).newInstance(objArr110);
                                                    try {
                                                        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(exec.getOutputStream());
                                                        try {
                                                            java.lang.Class<?> cls39 = java.lang.Class.forName(str18);
                                                            str4 = str24;
                                                            try {
                                                                java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                a(new int[]{-499864183, -1059096806, 1077980035, 1080448918}, android.widget.ExpandableListView.getPackedPositionChild(0L) + 6, objArr111);
                                                                cls39.getMethod(((java.lang.String) objArr111[0]).intern(), null).invoke(newInstance, null);
                                                                try {
                                                                    java.lang.Class<?> cls40 = java.lang.Class.forName(str18);
                                                                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                    a(new int[]{-499864183, -1059096806, 1077980035, 1080448918}, 5 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr112);
                                                                    cls40.getMethod(((java.lang.String) objArr112[0]).intern(), null).invoke(newInstance2, null);
                                                                    try {
                                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                        sb.append(intern);
                                                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                        a(new int[]{-22171101, -1634802818}, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1, objArr113);
                                                                        sb.append(((java.lang.String) objArr113[0]).intern());
                                                                        java.lang.String obj39 = sb.toString();
                                                                        obj = obj35;
                                                                        try {
                                                                            str3 = intern2;
                                                                            str5 = str23;
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                                        b((-1386585964) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-1949875533) - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (-63) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (94 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), (short) android.text.TextUtils.getTrimmedLength(""), objArr114);
                                                                                        dataOutputStream.write(obj39.getBytes(((java.lang.String) objArr114[0]).intern()));
                                                                                        dataOutputStream.flush();
                                                                                        java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                                        b((-1386585947) - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-1949875529) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 63, (byte) (65 - android.text.TextUtils.indexOf("", "", 0, 0)), (short) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), objArr115);
                                                                                        java.lang.String intern5 = ((java.lang.String) objArr115[0]).intern();
                                                                                        java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                                        b((android.view.ViewConfiguration.getScrollBarSize() >> 8) - 1386585963, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1949875533, (android.os.Process.myPid() >> 22) - 63, (byte) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 93), (short) android.graphics.Color.blue(0), objArr116);
                                                                                        dataOutputStream.write(intern5.getBytes(((java.lang.String) objArr116[0]).intern()));
                                                                                        dataOutputStream.flush();
                                                                                    } catch (java.lang.Exception unused5) {
                                                                                        java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                                                        a(new int[]{-1846422445, -755366341, -1075807818, -1230987764, -1884845800, -1547135804, 363074190, -1559184847, -868504234, 1851000875, 1795593760, -1011887005, 1740663668, 689250056}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 28, objArr117);
                                                                                        throw new java.io.IOException(((java.lang.String) objArr117[0]).intern());
                                                                                    }
                                                                                } catch (java.io.IOException unused6) {
                                                                                }
                                                                            } catch (java.lang.Throwable th11) {
                                                                                th = th11;
                                                                            }
                                                                            try {
                                                                                long nanoTime = java.lang.System.nanoTime();
                                                                                long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                java.lang.String str25 = r10;
                                                                                while (true) {
                                                                                    try {
                                                                                        try {
                                                                                            exec.exitValue();
                                                                                            str6 = str25;
                                                                                            break;
                                                                                        } catch (java.lang.IllegalThreadStateException unused7) {
                                                                                            if (nanos > 0) {
                                                                                                try {
                                                                                                    java.lang.Object[] objArr118 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                    java.lang.Class<?> cls41 = java.lang.Class.forName(str18);
                                                                                                    str6 = str25;
                                                                                                    java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                                                    b((-1386585933) - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.view.KeyEvent.normalizeMetaState(0) - 1949875525, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 64, (byte) (android.graphics.ImageFormat.getBitsPerPixel(0) + 44), (short) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr119);
                                                                                                    cls41.getMethod(((java.lang.String) objArr119[0]).intern(), java.lang.Long.TYPE).invoke(null, objArr118);
                                                                                                } catch (java.lang.Throwable th12) {
                                                                                                    java.lang.Throwable cause4 = th12.getCause();
                                                                                                    if (cause4 != null) {
                                                                                                        throw cause4;
                                                                                                    }
                                                                                                    throw th12;
                                                                                                }
                                                                                            } else {
                                                                                                str6 = str25;
                                                                                            }
                                                                                            nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - nanoTime);
                                                                                            if (nanos > 0) {
                                                                                                str25 = str6;
                                                                                            }
                                                                                        }
                                                                                    } catch (java.lang.InterruptedException e) {
                                                                                        throw e;
                                                                                    } catch (java.lang.Throwable th13) {
                                                                                        th3 = th13;
                                                                                        try {
                                                                                            exec.destroy();
                                                                                            throw th3;
                                                                                        } catch (java.lang.Exception unused8) {
                                                                                            throw th3;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    dataOutputStream.close();
                                                                                } catch (java.io.IOException unused9) {
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        java.lang.Class<?> cls42 = java.lang.Class.forName(str18);
                                                                                        java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                                                        b((-1386585942) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.view.View.MeasureSpec.getSize(0) - 1949875521, android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 64, (byte) (53 - android.graphics.Color.argb(0, 0, 0, 0)), (short) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr120);
                                                                                        cls42.getMethod(((java.lang.String) objArr120[0]).intern(), java.lang.Long.TYPE).invoke(newInstance, 100L);
                                                                                        try {
                                                                                            java.lang.Class<?> cls43 = java.lang.Class.forName(str18);
                                                                                            java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                                            b((-1386585942) - android.text.TextUtils.getOffsetBefore("", 0), (-1966652737) - android.graphics.Color.rgb(0, 0, 0), (-64) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) (54 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (short) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr121);
                                                                                            cls43.getMethod(((java.lang.String) objArr121[0]).intern(), java.lang.Long.TYPE).invoke(newInstance2, 10L);
                                                                                            try {
                                                                                                exec.destroy();
                                                                                            } catch (java.lang.Exception unused10) {
                                                                                            }
                                                                                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                                                            java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 1507 - android.text.TextUtils.indexOf("", ""), (char) android.text.TextUtils.indexOf("", ""));
                                                                                            byte[] bArr4 = $$a;
                                                                                            byte b29 = bArr4[18];
                                                                                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                                            c(b29, (short) (b29 & com.google.common.base.Ascii.SI), (byte) (-bArr4[52]), objArr122);
                                                                                            sb2.append(cls44.getField((java.lang.String) objArr122[0]).get(newInstance).toString());
                                                                                            java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1507, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                                                                            byte b30 = bArr4[18];
                                                                                            java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                                            c(b30, (short) (b30 & com.google.common.base.Ascii.SI), (byte) (-bArr4[52]), objArr123);
                                                                                            sb2.append(cls45.getField((java.lang.String) objArr123[0]).get(newInstance2).toString());
                                                                                            java.lang.String obj40 = sb2.toString();
                                                                                            java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                                            a(new int[]{-22171101, -1634802818}, android.view.KeyEvent.normalizeMetaState(0) + 1, objArr124);
                                                                                            java.lang.String[] split2 = obj40.split(((java.lang.String) objArr124[0]).intern());
                                                                                            int length2 = split2.length;
                                                                                            int i41 = 0;
                                                                                            while (i41 < length2) {
                                                                                                java.lang.String str26 = split2[i41];
                                                                                                java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                                                a(new int[]{-1244286755, -999684413, -1933459559, -1561431605, -1275720948, 1733064002, -1733636228, 1224993336, 913593600, 2040962429}, 19 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr125);
                                                                                                if (!str26.startsWith(((java.lang.String) objArr125[0]).intern())) {
                                                                                                    java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                                                    b((-1386585936) - android.text.TextUtils.getTrimmedLength(""), (-1949875518) - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (-48) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 46), (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr126);
                                                                                                    if (!str26.startsWith(((java.lang.String) objArr126[0]).intern())) {
                                                                                                        java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                                                        b((-1386585936) - android.view.KeyEvent.keyCodeFromString(""), (-1949875499) - android.graphics.Color.red(0), android.view.View.combineMeasuredStates(0, 0) - 60, (byte) ((-30) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (short) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr127);
                                                                                                        if (str26.startsWith(((java.lang.String) objArr127[0]).intern())) {
                                                                                                            java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                                                                            b((-1386585990) - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1949875492, (-67) - android.view.View.resolveSize(0, 0), (byte) (android.text.TextUtils.indexOf("", "", 0, 0) - 83), (short) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr128);
                                                                                                            java.lang.String[] split3 = str26.split(((java.lang.String) objArr128[0]).intern());
                                                                                                            if (split3.length > 1) {
                                                                                                                str8 = str6;
                                                                                                                if (!split3[1].equalsIgnoreCase(str8)) {
                                                                                                                    str7 = str4;
                                                                                                                    i41++;
                                                                                                                    str6 = str8;
                                                                                                                    str5 = str5;
                                                                                                                    obj = obj;
                                                                                                                    str4 = str7;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                str7 = str4;
                                                                                                str8 = str6;
                                                                                                i41++;
                                                                                                str6 = str8;
                                                                                                str5 = str5;
                                                                                                obj = obj;
                                                                                                str4 = str7;
                                                                                            }
                                                                                            indexOf2 = i;
                                                                                            r15 = str4;
                                                                                            r10 = obj;
                                                                                            str24 = str5;
                                                                                        } catch (java.lang.Throwable th14) {
                                                                                            java.lang.Throwable cause5 = th14.getCause();
                                                                                            if (cause5 != null) {
                                                                                                throw cause5;
                                                                                            }
                                                                                            throw th14;
                                                                                        }
                                                                                    } catch (java.lang.Throwable th15) {
                                                                                        java.lang.Throwable cause6 = th15.getCause();
                                                                                        if (cause6 != null) {
                                                                                            throw cause6;
                                                                                        }
                                                                                        throw th15;
                                                                                    }
                                                                                } catch (java.lang.InterruptedException e2) {
                                                                                    e = e2;
                                                                                    throw e;
                                                                                }
                                                                            } catch (java.lang.InterruptedException e3) {
                                                                                e = e3;
                                                                            } catch (java.lang.Throwable th16) {
                                                                                th = th16;
                                                                                th3 = th;
                                                                                exec.destroy();
                                                                                throw th3;
                                                                            }
                                                                        } catch (java.io.IOException unused11) {
                                                                            indexOf2 = i;
                                                                            str3 = intern2;
                                                                            str24 = str23;
                                                                            r15 = str4;
                                                                            r10 = obj;
                                                                        } catch (java.lang.Exception unused12) {
                                                                        }
                                                                    } catch (java.io.IOException unused13) {
                                                                        indexOf2 = i;
                                                                        str3 = intern2;
                                                                        str24 = str23;
                                                                        r10 = obj35;
                                                                        r15 = str4;
                                                                    } catch (java.lang.Exception unused14) {
                                                                    }
                                                                } catch (java.lang.Throwable th17) {
                                                                    java.lang.Throwable cause7 = th17.getCause();
                                                                    if (cause7 != null) {
                                                                        throw cause7;
                                                                    }
                                                                    throw th17;
                                                                }
                                                            } catch (java.lang.Throwable th18) {
                                                                th = th18;
                                                                java.lang.Throwable th19 = th;
                                                                java.lang.Throwable cause8 = th19.getCause();
                                                                if (cause8 != null) {
                                                                    throw cause8;
                                                                }
                                                                throw th19;
                                                            }
                                                        } catch (java.lang.Throwable th20) {
                                                            th = th20;
                                                        }
                                                    } catch (java.io.IOException unused15) {
                                                        str3 = intern2;
                                                        indexOf2 = i17;
                                                        i40 = i40;
                                                        r10 = obj35;
                                                        r15 = str24;
                                                        str24 = str23;
                                                        i39 = i8 + 1;
                                                        str23 = str24;
                                                        obj35 = r10;
                                                        i17 = indexOf2;
                                                        str24 = r15;
                                                        r1 = obj36;
                                                        length = i40;
                                                        intern2 = str3;
                                                        i38 = 0;
                                                        i40 = i40;
                                                    } catch (java.lang.Exception unused16) {
                                                        java.lang.Object[] objArr1172 = new java.lang.Object[1];
                                                        a(new int[]{-1846422445, -755366341, -1075807818, -1230987764, -1884845800, -1547135804, 363074190, -1559184847, -868504234, 1851000875, 1795593760, -1011887005, 1740663668, 689250056}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 28, objArr1172);
                                                        throw new java.io.IOException(((java.lang.String) objArr1172[0]).intern());
                                                    }
                                                } catch (java.lang.Throwable th21) {
                                                    th = th21;
                                                    th2 = th;
                                                    cause2 = th2.getCause();
                                                    if (cause2 == null) {
                                                    }
                                                }
                                            } catch (java.lang.Throwable th22) {
                                                th = th22;
                                            }
                                        } catch (java.io.IOException unused17) {
                                            str3 = intern2;
                                            i9 = i17;
                                            i10 = i40;
                                            i8 = i39;
                                            indexOf2 = i9;
                                            i40 = i10;
                                            r10 = obj35;
                                            r15 = str24;
                                            str24 = str23;
                                            i39 = i8 + 1;
                                            str23 = str24;
                                            obj35 = r10;
                                            i17 = indexOf2;
                                            str24 = r15;
                                            r1 = obj36;
                                            length = i40;
                                            intern2 = str3;
                                            i38 = 0;
                                            i40 = i40;
                                        } catch (java.lang.Exception unused18) {
                                            java.lang.Object[] objArr11722 = new java.lang.Object[1];
                                            a(new int[]{-1846422445, -755366341, -1075807818, -1230987764, -1884845800, -1547135804, 363074190, -1559184847, -868504234, 1851000875, 1795593760, -1011887005, 1740663668, 689250056}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 28, objArr11722);
                                            throw new java.io.IOException(((java.lang.String) objArr11722[0]).intern());
                                        }
                                    }
                                    objArr2 = new java.lang.Object[]{new int[1], new int[1], null, r2, new int[1]};
                                    java.lang.String str27 = (java.lang.String) java.lang.Class.forName(str3).getField(str5).get(obj);
                                    i4 = i;
                                    ((int[]) objArr2[0])[0] = i4;
                                    ((int[]) objArr2[1])[0] = i4 ^ 20;
                                    java.lang.Object[] objArr129 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((-25706762) | (~i4)) * (-490)) + 2028515948) + (((~((-597318992) | i4)) | 571612230) * 490)) - 1626909956)};
                                    str = str4;
                                    java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str);
                                    if (obj41 == null) {
                                        java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 50, 2713 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) android.view.KeyEvent.normalizeMetaState(0));
                                        byte b31 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                        short s22 = $$a[41];
                                        java.lang.Object[] objArr130 = new java.lang.Object[1];
                                        c(b31, s22, (byte) s22, objArr130);
                                        obj41 = cls46.getMethod((java.lang.String) objArr130[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str, obj41);
                                    }
                                    ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj41).invoke(null, objArr129)).intValue();
                                    i5 = 1;
                                    c = 0;
                                    if (((int[]) objArr2[i5])[c] == i4) {
                                    }
                                } else {
                                    str3 = intern2;
                                    indexOf2 = i17;
                                    i40 = length;
                                    i8 = i39;
                                    r10 = obj35;
                                    r15 = str24;
                                    str24 = str23;
                                }
                                i39 = i8 + 1;
                                str23 = str24;
                                obj35 = r10;
                                i17 = indexOf2;
                                str24 = r15;
                                r1 = obj36;
                                length = i40;
                                intern2 = str3;
                                i38 = 0;
                                i40 = i40;
                            }
                            i4 = i17;
                            str = str24;
                        } else {
                            i4 = i17;
                            str = -1347122530;
                            num = -604620973;
                        }
                        java.lang.Object[] objArr131 = {new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                        java.lang.Object[] objArr132 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-467558831) | i4)) | 25698442) * 104) + 1270180168 + ((~((~i4) | 1004437502)) * (-104)) + ((562577114 | i4) * 104))};
                        java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str);
                        if (obj42 == null) {
                            java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 51, 2714 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1));
                            byte b32 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                            short s23 = $$a[41];
                            java.lang.Object[] objArr133 = new java.lang.Object[1];
                            c(b32, s23, (byte) s23, objArr133);
                            obj42 = cls47.getMethod((java.lang.String) objArr133[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str, obj42);
                        }
                        c = 0;
                        ((int[]) objArr131[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj42).invoke(null, objArr132)).intValue();
                        objArr2 = objArr131;
                        i5 = 1;
                        if (((int[]) objArr2[i5])[c] == i4) {
                        }
                    } catch (java.lang.Throwable th23) {
                        java.lang.Throwable cause9 = th23.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th23;
                    }
                } catch (java.lang.Throwable th24) {
                    java.lang.Throwable cause10 = th24.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th24;
                }
            }
        });
    }

    @Override // com.payair.hce.onTransactionStopped
    public final boolean DigitizedCardProfile() {
        int i = getGpoResponse + 11;
        getCvrMaskAnd = i % 128;
        return i % 2 != 0;
    }

    public final byte[] writeReplace(byte[] bArr) throws com.payair.hce.getAtcCount {
        com.payair.hce.ignoreFailedTransaction ignorefailedtransaction = this.getProfileVersion;
        if (ignorefailedtransaction != null) {
            getGpoResponse = (getCvrMaskAnd + 67) % 128;
            com.payair.hce.ignoreFailedTransaction.AlternateContactlessPaymentDataJson(new java.lang.Object[]{ignorefailedtransaction}, 1658163184, -1658163183, java.lang.System.identityHashCode(ignorefailedtransaction));
        }
        com.payair.hce.getContactlessSupported IccPrivateKeyCrtComponentsJson2 = com.payair.hce.setRecords.AlternateContactlessPaymentDataJson(bArr, new com.payair.hce.setMaximumPinTry(this.DigitizedCardProfile, this)).IccPrivateKeyCrtComponentsJson();
        com.payair.hce.ignoreFailedTransaction ignorefailedtransaction2 = this.getProfileVersion;
        if (ignorefailedtransaction2 != null) {
            int i = getCvrMaskAnd + 43;
            getGpoResponse = i % 128;
            if (i % 2 == 0) {
                com.payair.hce.ignoreFailedTransaction.AlternateContactlessPaymentDataJson(new java.lang.Object[]{ignorefailedtransaction2}, 1024361596, -1024361596, java.lang.System.identityHashCode(ignorefailedtransaction2));
            } else {
                com.payair.hce.ignoreFailedTransaction.AlternateContactlessPaymentDataJson(new java.lang.Object[]{ignorefailedtransaction2}, 1024361596, -1024361596, java.lang.System.identityHashCode(ignorefailedtransaction2));
                throw null;
            }
        }
        return IccPrivateKeyCrtComponentsJson2.DigitizedCardProfile();
    }

    public final com.payair.hce.onDeleteCardCompleted.valueOf valueOf() {
        int i = getCvrMaskAnd;
        getGpoResponse = (i + 59) % 128;
        com.payair.hce.onDeleteCardCompleted.valueOf valueof = this.values;
        getGpoResponse = (i + 25) % 128;
        return valueof;
    }

    public final void writeReplace(com.payair.hce.onDeleteCardCompleted.valueOf valueof) {
        int i = getGpoResponse + 5;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            this.values = valueof;
            android.widget.ExpandableListView.getPackedPositionForChild(0, 1);
        } else {
            this.values = valueof;
            android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
        }
        new java.lang.Object[]{valueof.toString()};
        int i2 = getCvrMaskAnd + 115;
        getGpoResponse = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.payair.hce.onTransactionStopped
    public final void values() {
        getGpoResponse = (getCvrMaskAnd + 59) % 128;
        super.values();
        com.payair.hce.ignoreFailedTransaction ignorefailedtransaction = this.getProfileVersion;
        if (ignorefailedtransaction != null) {
            getGpoResponse = (getCvrMaskAnd + 79) % 128;
            com.payair.hce.ignoreFailedTransaction.AlternateContactlessPaymentDataJson(new java.lang.Object[]{ignorefailedtransaction}, 1658163184, -1658163183, java.lang.System.identityHashCode(ignorefailedtransaction));
            this.getProfileVersion = null;
        }
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        $11 = ($10 + 21) % 128;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = RecordsJson;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i2 = 0;
            while (i2 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i2])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 46, android.text.TextUtils.indexOf("", c, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) (android.text.TextUtils.lastIndexOf("", c, 0) + 46338))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i2++;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $11 = ($10 + 25) % 128;
            cArr = cArr2;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) (46337 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (getAid) {
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 43, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1629, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(0, (byte) 0, 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (!IccPrivateKeyCrtComponentsJson) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            $11 = ($10 + 125) % 128;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $10 = ($11 + 87) % 128;
                cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            java.lang.String str4 = new java.lang.String(cArr4);
            int i3 = $11 + 33;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            objArr[0] = str4;
            return;
        }
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.getOffsetAfter("", 0), 1629 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) android.text.TextUtils.indexOf("", "", 0, 0));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(0, (byte) 0, 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static void writeReplace() {
        RecordsJson = new char[]{10767, 10976, 10993, 10994, 11003, 10764, 11005, 10977, 10992, 10769, 10980, 11000, 11007, 10782, 10797, 10978, 11006, 10988, 10807, 10784};
        SdkCoreAlternateContactlessPaymentDataImpl = -143185331;
        IccPrivateKeyCrtComponentsJson = true;
        getAid = true;
    }

    static void init$0() {
        $$a = new byte[]{16, 76, 17, 34};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE;
    }

    static /* synthetic */ com.payair.hce.access000 writeReplace(com.payair.hce.onDeleteCardCompleted ondeletecardcompleted) {
        return (com.payair.hce.access000) writeReplace(new java.lang.Object[]{ondeletecardcompleted}, -866179959, 866179959, (int) java.lang.System.currentTimeMillis());
    }
}

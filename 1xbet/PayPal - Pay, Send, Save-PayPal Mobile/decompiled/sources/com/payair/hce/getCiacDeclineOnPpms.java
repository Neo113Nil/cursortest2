package com.payair.hce;

/* loaded from: classes4.dex */
public final class getCiacDeclineOnPpms<K, V> extends java.util.AbstractMap<K, V> implements java.io.Serializable {
    private static final java.util.Comparator<java.lang.Comparable> DigitizedCardProfile = new java.util.Comparator<java.lang.Comparable>() { // from class: com.payair.hce.getCiacDeclineOnPpms.2
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    private static /* synthetic */ boolean IccPrivateKeyCrtComponentsJson = true;
    int AlternateContactlessPaymentDataJson;
    private com.payair.hce.getCiacDeclineOnPpms<K, V>.values RecordsJson;
    private com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.getCiacDeclineOnPpms<K, V>.writeReplace getProfileVersion;
    int valueOf;
    final com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> values;
    private java.util.Comparator<? super K> writeReplace;

    public getCiacDeclineOnPpms() {
        this(DigitizedCardProfile);
    }

    private getCiacDeclineOnPpms(java.util.Comparator<? super K> comparator) {
        this.AlternateContactlessPaymentDataJson = 0;
        this.valueOf = 0;
        this.values = new com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<>();
        this.writeReplace = comparator == null ? DigitizedCardProfile : comparator;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.AlternateContactlessPaymentDataJson;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(java.lang.Object obj) {
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> valueOf = valueOf(obj);
        if (valueOf != null) {
            return valueOf.getProfileVersion;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return valueOf(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> writeReplace2 = writeReplace(k, true);
        V v2 = writeReplace2.getProfileVersion;
        writeReplace2.getProfileVersion = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.SdkCoreAlternateContactlessPaymentDataImpl = null;
        this.AlternateContactlessPaymentDataJson = 0;
        this.valueOf++;
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson = this.values;
        alternateContactlessPaymentDataJson.values = alternateContactlessPaymentDataJson;
        alternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson = alternateContactlessPaymentDataJson;
    }

    private com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> writeReplace(K k, boolean z) {
        int i;
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson;
        java.util.Comparator<? super K> comparator = this.writeReplace;
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson2 = this.SdkCoreAlternateContactlessPaymentDataImpl;
        if (alternateContactlessPaymentDataJson2 != null) {
            java.lang.Comparable comparable = comparator == DigitizedCardProfile ? (java.lang.Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(alternateContactlessPaymentDataJson2.SdkCoreAlternateContactlessPaymentDataImpl);
                } else {
                    i = comparator.compare(k, alternateContactlessPaymentDataJson2.SdkCoreAlternateContactlessPaymentDataImpl);
                }
                if (i != 0) {
                    com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson3 = i < 0 ? alternateContactlessPaymentDataJson2.valueOf : alternateContactlessPaymentDataJson2.DigitizedCardProfile;
                    if (alternateContactlessPaymentDataJson3 == null) {
                        break;
                    }
                    alternateContactlessPaymentDataJson2 = alternateContactlessPaymentDataJson3;
                } else {
                    return alternateContactlessPaymentDataJson2;
                }
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson4 = this.values;
        if (alternateContactlessPaymentDataJson2 == null) {
            if (comparator == DigitizedCardProfile && !(k instanceof java.lang.Comparable)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(k.getClass().getName());
                sb.append(" is not Comparable");
                throw new java.lang.ClassCastException(sb.toString());
            }
            alternateContactlessPaymentDataJson = new com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<>(alternateContactlessPaymentDataJson2, k, alternateContactlessPaymentDataJson4, alternateContactlessPaymentDataJson4.values);
            this.SdkCoreAlternateContactlessPaymentDataImpl = alternateContactlessPaymentDataJson;
        } else {
            alternateContactlessPaymentDataJson = new com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<>(alternateContactlessPaymentDataJson2, k, alternateContactlessPaymentDataJson4, alternateContactlessPaymentDataJson4.values);
            if (i < 0) {
                alternateContactlessPaymentDataJson2.valueOf = alternateContactlessPaymentDataJson;
            } else {
                alternateContactlessPaymentDataJson2.DigitizedCardProfile = alternateContactlessPaymentDataJson;
            }
            AlternateContactlessPaymentDataJson(alternateContactlessPaymentDataJson2, true);
        }
        this.AlternateContactlessPaymentDataJson++;
        this.valueOf++;
        return alternateContactlessPaymentDataJson;
    }

    public class values extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int AlternateContactlessPaymentDataJson;
        private static int values;
        private static int writeReplace;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(short s, short s2, int i, java.lang.Object[] objArr) {
            int i2;
            int i3 = 718 - (s2 * 653);
            int i4 = i * 34;
            int i5 = (s * 34) + 4;
            byte[] bArr = $$a;
            char[] cArr = new char[i4 + 1];
            if (bArr == null) {
                int i6 = i3;
                int i7 = 0;
                int i8 = i5;
                int i9 = i8 + 1;
                int i10 = (i6 + (-i5)) - 2;
                i2 = i7;
                i3 = i10;
                i5 = i9;
                cArr[i2] = (char) i3;
                if (i2 == i4) {
                    objArr[0] = new java.lang.String(cArr);
                    return;
                }
                int i11 = i3;
                i8 = i5;
                i5 = bArr[i5];
                i7 = i2 + 1;
                i6 = i11;
                int i92 = i8 + 1;
                int i102 = (i6 + (-i5)) - 2;
                i2 = i7;
                i3 = i102;
                i5 = i92;
                cArr[i2] = (char) i3;
                if (i2 == i4) {
                }
            } else {
                i2 = 0;
                cArr[i2] = (char) i3;
                if (i2 == i4) {
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Type inference failed for: r7v2, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(byte b, byte b2, short s, java.lang.Object[] objArr) {
            int i;
            int i2;
            ?? r7 = (b2 * 4) + 115;
            int i3 = s * 2;
            byte[] bArr = $$d;
            int i4 = b + 4;
            byte[] bArr2 = new byte[i3 + 1];
            if (bArr == null) {
                byte b3 = r7;
                i = 0;
                int i5 = i4;
                int i6 = i5;
                i2 = i4 + (-b3);
                i4 = i6;
                int i7 = i4 + 1;
                bArr2[i] = (byte) i2;
                if (i == i3) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i++;
                b3 = bArr[i7];
                int i8 = i2;
                i5 = i7;
                i4 = i8;
                int i62 = i5;
                i2 = i4 + (-b3);
                i4 = i62;
                int i72 = i4 + 1;
                bArr2[i] = (byte) i2;
                if (i == i3) {
                }
            } else {
                i = 0;
                i2 = r7;
                int i722 = i4 + 1;
                bArr2[i] = (byte) i2;
                if (i == i3) {
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static void a(int i, int i2, java.lang.String str, boolean z, int i3, java.lang.Object[] objArr) {
            char[] cArr;
            if (str != null) {
                $10 = ($11 + 19) % 128;
                cArr = str.toCharArray();
            } else {
                cArr = str;
            }
            char[] cArr2 = cArr;
            com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
            char[] cArr3 = new char[i2];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i2) {
                digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
                cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
                int i4 = digitizedCardJson11.DigitizedCardProfile;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4]), java.lang.Integer.valueOf(writeReplace)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2073, (char) (60036 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((byte) -1, (byte) 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                    }
                    cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(54 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + 3543, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
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
            if (i3 > 0) {
                $11 = ($10 + 117) % 128;
                digitizedCardJson11.AlternateContactlessPaymentDataJson = i3;
                char[] cArr4 = new char[i2];
                java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i2);
                java.lang.System.arraycopy(cArr4, 0, cArr3, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
                java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
            }
            if (z) {
                $10 = ($11 + 97) % 128;
                char[] cArr5 = new char[i2];
                digitizedCardJson11.DigitizedCardProfile = 0;
                while (digitizedCardJson11.DigitizedCardProfile < i2) {
                    cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i2 - digitizedCardJson11.DigitizedCardProfile) - 1];
                    java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 52, (-16773673) - android.graphics.Color.rgb(0, 0, 0), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                }
                cArr3 = cArr5;
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            AlternateContactlessPaymentDataJson = (values + 85) % 128;
            int i = com.payair.hce.getCiacDeclineOnPpms.this.AlternateContactlessPaymentDataJson;
            values = (AlternateContactlessPaymentDataJson + 111) % 128;
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            com.payair.hce.getCiacDeclineOnPpms<K, V>.DigitizedCardProfile<java.util.Map.Entry<K, V>> digitizedCardProfile = new com.payair.hce.getCiacDeclineOnPpms<K, V>.DigitizedCardProfile<java.util.Map.Entry<K, V>>() { // from class: com.payair.hce.getCiacDeclineOnPpms.values.4
                {
                    com.payair.hce.getCiacDeclineOnPpms getciacdeclineonppms = com.payair.hce.getCiacDeclineOnPpms.this;
                }

                @Override // java.util.Iterator
                public final /* synthetic */ java.lang.Object next() {
                    return DigitizedCardProfile();
                }
            };
            int i = values + 47;
            AlternateContactlessPaymentDataJson = i % 128;
            if (i % 2 != 0) {
                return digitizedCardProfile;
            }
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            if (obj instanceof java.util.Map.Entry) {
                int i = values + 17;
                AlternateContactlessPaymentDataJson = i % 128;
                if (i % 2 == 0) {
                    com.payair.hce.getCiacDeclineOnPpms.this.AlternateContactlessPaymentDataJson((java.util.Map.Entry) obj);
                    throw null;
                }
                if (com.payair.hce.getCiacDeclineOnPpms.this.AlternateContactlessPaymentDataJson((java.util.Map.Entry) obj) != null) {
                    return true;
                }
            }
            int i2 = AlternateContactlessPaymentDataJson + 67;
            values = i2 % 128;
            if (i2 % 2 == 0) {
                return false;
            }
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            int i = (values + 3) % 128;
            AlternateContactlessPaymentDataJson = i;
            if (obj instanceof java.util.Map.Entry) {
                com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> AlternateContactlessPaymentDataJson2 = com.payair.hce.getCiacDeclineOnPpms.this.AlternateContactlessPaymentDataJson((java.util.Map.Entry) obj);
                if (AlternateContactlessPaymentDataJson2 != null) {
                    com.payair.hce.getCiacDeclineOnPpms.this.values((com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson) AlternateContactlessPaymentDataJson2, true);
                    return true;
                }
                values = (AlternateContactlessPaymentDataJson + 125) % 128;
                return false;
            }
            int i2 = i + 45;
            values = i2 % 128;
            if (i2 % 2 == 0) {
                return false;
            }
            throw new java.lang.ArithmeticException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            int i = values + 37;
            AlternateContactlessPaymentDataJson = i % 128;
            if (i % 2 != 0) {
                com.payair.hce.getCiacDeclineOnPpms.this.clear();
                int i2 = AlternateContactlessPaymentDataJson + 85;
                values = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            com.payair.hce.getCiacDeclineOnPpms.this.clear();
            throw new java.lang.ArithmeticException();
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            values = 0;
            AlternateContactlessPaymentDataJson = 1;
            writeReplace = 1889207122;
        }

        static void init$1() {
            $$d = new byte[]{com.google.common.base.Ascii.ETB, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 16, 123};
            $$e = 126;
        }

        static void init$0() {
            $$a = new byte[]{com.google.common.base.Ascii.ETB, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 16, 123, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
            $$b = 134;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:(2:42|43)|(1:45)(4:97|98|99|(11:101|102|47|48|(1:50)(6:61|62|63|64|65|(4:67|(1:69)(4:83|84|85|86)|71|(1:(6:74|75|(1:77)|78|79|80))(2:81|82)))|51|52|(1:54)|55|56|(1:58)(2:59|60))(1:103))|46|47|48|(0)(0)|51|52|(0)|55|56|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x096e, code lost:
        
            if ((r5 % 2) != 0) goto L100;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0a43, code lost:
        
            if (r7.equals((java.lang.String) r13[0]) != false) goto L100;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0428  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0431 A[Catch: all -> 0x0ca2, TRY_ENTER, TryCatch #1 {all -> 0x0ca2, blocks: (B:26:0x0431, B:28:0x0440, B:29:0x0483, B:33:0x0536, B:35:0x057b, B:36:0x05cb, B:75:0x0b07, B:77:0x0b50, B:78:0x0ba6, B:52:0x0be5, B:54:0x0c2d, B:55:0x0c7b, B:110:0x0600, B:112:0x063a, B:113:0x068a, B:144:0x037f, B:146:0x03c0, B:147:0x040c, B:3:0x0018, B:7:0x0118, B:12:0x01ac, B:20:0x0275, B:117:0x027e, B:119:0x0284, B:120:0x0285, B:123:0x029d, B:131:0x0352, B:134:0x035b, B:136:0x0361, B:137:0x0362), top: B:2:0x0018, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x089f  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0c2d A[Catch: all -> 0x0ca2, TryCatch #1 {all -> 0x0ca2, blocks: (B:26:0x0431, B:28:0x0440, B:29:0x0483, B:33:0x0536, B:35:0x057b, B:36:0x05cb, B:75:0x0b07, B:77:0x0b50, B:78:0x0ba6, B:52:0x0be5, B:54:0x0c2d, B:55:0x0c7b, B:110:0x0600, B:112:0x063a, B:113:0x068a, B:144:0x037f, B:146:0x03c0, B:147:0x040c, B:3:0x0018, B:7:0x0118, B:12:0x01ac, B:20:0x0275, B:117:0x027e, B:119:0x0284, B:120:0x0285, B:123:0x029d, B:131:0x0352, B:134:0x035b, B:136:0x0361, B:137:0x0362), top: B:2:0x0018, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0c9f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0ca0  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x08a1 A[Catch: Exception -> 0x0bce, TRY_LEAVE, TryCatch #0 {Exception -> 0x0bce, blocks: (B:48:0x07f8, B:61:0x08a1, B:64:0x08e1, B:67:0x08f1, B:83:0x0972, B:86:0x0a3d, B:90:0x0bbf, B:91:0x0bc5, B:94:0x0bc7, B:95:0x0bcd, B:63:0x08ab, B:85:0x097c), top: B:47:0x07f8, inners: #2, #7 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] valueOf(int i, int i2) {
            java.lang.Object[] objArr;
            java.lang.Object[] objArr2;
            java.lang.String str;
            java.lang.Object obj;
            int i3;
            java.io.File file;
            java.io.File file2;
            java.lang.String[] strArr;
            int i4;
            int i5;
            int i6 = AlternateContactlessPaymentDataJson;
            values = (((i6 | 35) << 1) - (i6 ^ 35)) % 128;
            try {
                try {
                    int i7 = -android.graphics.Color.rgb(0, 0, 0);
                    int i8 = i7 * (-755);
                    int i9 = ~i7;
                    int i10 = (i8 ^ (-218219323)) + ((i8 & (-218219323)) << 1);
                    int i11 = ~((16777062 ^ i9) | (i9 & 16777062));
                    int i12 = i10 + (i11 * 1512);
                    int i13 = (i7 & (-16777063)) | ((-16777063) ^ i7);
                    int i14 = ~((i13 ^ i) | (i13 & i));
                    int i15 = ((i11 ^ i14) | (i11 & i14)) * (-756);
                    int i16 = (i12 & i15) + (i12 | i15);
                    i4 = ~i;
                    int i17 = ((i13 ^ i4) | (i13 & i4)) * 756;
                    int i18 = -android.graphics.Color.alpha(0);
                    int i19 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(((i16 | i17) << 1) - (i17 ^ i16), ((i18 | 19) << 1) - (i18 ^ 19), "\uffff\ufffe\u0003\r\uffde\uffff￼\u000f\u0001\u0001\uffff\f\uffdd\t\b\b\uffff�\u000e", false, (i19 & 2) + (i19 | 2), objArr3);
                    int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                    int i20 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                    int i21 = i20 * 399;
                    int i22 = (i21 ^ 7182) + ((i21 & 7182) << 1);
                    int i23 = ~i20;
                    int i24 = ~((i23 & 18) | (i23 ^ 18));
                    int i25 = ~((i20 ^ (-19)) | (i20 & (-19)));
                    int i26 = ((i24 ^ i25) | (i25 & i24) | (~((i ^ (-19)) | (i & (-19))))) * 398;
                    int i27 = (i22 & i26) + (i26 | i22);
                    int i28 = -(-(((i20 & 18) | (i20 ^ 18)) * (-1194)));
                    int i29 = (i27 & i28) + (i28 | i27);
                    int i30 = ~(i4 | (-19));
                    int i31 = (i30 ^ i24) | (i24 & i30);
                    int i32 = -(-(((i31 ^ i25) | (i31 & i25)) * 398));
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(capsMode + 154, ((i29 | i32) << 1) - (i32 ^ i29), "\u000e\u0000\u0000\ufffe\u000b\u0010\ufffa\u0002\r\u0002\u0007\u0000\uffdf\b\u000b\uffdd\ufffe\ufffb", false, 3 - (~(-(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))))), objArr4);
                    strArr = new java.lang.String[]{(java.lang.String) objArr3[0], (java.lang.String) objArr4[0]};
                    i5 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (java.lang.Exception unused) {
                objArr = new java.lang.Object[]{new int[]{i}, new int[]{(i & (-3)) | ((~i) & 2)}, null, new int[1]};
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-391444978) | i)) | 68157921) * 1504) + 1212577112 + ((~((-323287057) | i)) * (-1504)) + 362053792)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getTrimmedLength(""), android.view.MotionEvent.axisFromString("") + 2714, (char) android.view.KeyEvent.keyCodeFromString(""));
                    byte b = $$a[14];
                    byte b2 = (byte) (b + 1);
                    byte b3 = (byte) (-b);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(b2, b3, b3, objArr6);
                    obj2 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr5)).intValue();
            }
            try {
                for (int i33 = 2; i5 < i33; i33 = 2) {
                    AlternateContactlessPaymentDataJson = (values + 119) % 128;
                    java.lang.String str2 = strArr[i5];
                    int i34 = -(android.os.Process.myTid() >> 22);
                    int i35 = (i34 * 765) - 224469;
                    int i36 = ~((i4 & i34) | (i4 ^ i34));
                    int i37 = ((i36 ^ 147) | (i36 & 147)) * 764;
                    int i38 = ((i35 | i37) << 1) - (i35 ^ i37);
                    int i39 = ~i34;
                    int i40 = ~((i39 ^ 147) | (i39 & 147));
                    int i41 = ~(i4 | 147);
                    int i42 = ((i40 ^ i41) | (i41 & i40)) * (-1528);
                    int i43 = ~((i34 & (-148)) | (i34 ^ (-148)));
                    int i44 = (i43 & i40) | (i40 ^ i43);
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    int i45 = -(-android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a((((i38 & i42) + (i42 | i38)) - (~(((i44 ^ i36) | (i36 & i44)) * 764))) - 1, (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)) + 15, "\u0012\u000f\t\u0004ￎ\u000f\u0013ￎ￤\u0005\u0002\u0015\u0007\u0001\u000e\u0004", false, ((i45 | 13) << 1) - (i45 ^ 13), objArr7);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    if (((java.lang.Boolean) cls2.getMethod(str2, new java.lang.Class[0]).invoke(cls2, null)).booleanValue()) {
                        int i46 = values;
                        AlternateContactlessPaymentDataJson = ((i46 ^ 9) + ((i46 & 9) << 1)) % 128;
                        objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                        try {
                            java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-272980033) | i4)) | (~((-595634055) | i4))) * (-184)) + 781589656 + (((~((-663791504) | i4)) | 68157449 | (~((-341137482) | i4))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 567270600)};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj3 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", "", 0, 0), android.graphics.Color.green(0) + 2713, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                byte b4 = $$a[14];
                                byte b5 = (byte) (b4 + 1);
                                byte b6 = (byte) (-b4);
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                b(b5, b6, b6, objArr9);
                                obj3 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                            }
                            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr8)).intValue();
                            if (i == ((int[]) objArr[1])[0]) {
                                values = (AlternateContactlessPaymentDataJson + 119) % 128;
                                return objArr;
                            }
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(218021890);
                            if (obj4 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 28, 2391 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (29420 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)));
                                byte b7 = (byte) (-$$a[14]);
                                byte b8 = (byte) (b7 - 1);
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                b(b7, b8, b8, objArr10);
                                obj4 = cls4.getMethod((java.lang.String) objArr10[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(218021890, obj4);
                            }
                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, null)).longValue();
                            long j = ~i;
                            long j2 = ~((-1300959638) | j);
                            long j3 = ~(longValue | 1300959637);
                            long j4 = (((-1527) * longValue) - 995234123070L) + ((longValue | j2) * 764) + (((~(j | longValue)) | j3) * (-1528)) + ((j3 | (~((~longValue) | (-1300959638))) | j2) * 764) + 1583043734;
                            int i47 = ~i;
                            int i48 = ((int) (j4 >> 32)) & ((((~((-730846326) | i47)) | 713413717) * (-160)) + 590599306 + (((~(2126894559 | i47)) | (-730846326)) * 160));
                            int i49 = ((int) j4) & ((((((-765968104) | i47) * 1324) + 818885255) + (((~((-688297704) | i)) | (~((-748928707) | i))) * (-1324))) - 1726623826);
                            if (((i48 ^ i49) | (i48 & i49)) == 1) {
                                values = (AlternateContactlessPaymentDataJson + 25) % 128;
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{(i & (-11)) | (i47 & 10)}, null, new int[1]};
                                java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-916357569) | i47)) | (~((-88571417) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1713774760 + (((~((-21069337) | i47)) | (~((-848855489) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj5 == null) {
                                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2714, (char) android.view.View.getDefaultSize(0, 0));
                                    byte b9 = $$a[14];
                                    byte b10 = (byte) (b9 + 1);
                                    byte b11 = (byte) (-b9);
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    b(b10, b11, b11, objArr12);
                                    obj5 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                }
                                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr11)).intValue();
                            } else {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                                int i50 = (~((-462314662) | i)) | 393249;
                                java.lang.Object[] objArr13 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((i50 * 992) + 776359256 + ((i50 | (~(1004535735 | i47))) * (-496)) + ((542614323 | i) * 496))};
                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj6 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 50, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2713, (char) android.text.TextUtils.getOffsetAfter("", 0));
                                    byte b12 = $$a[14];
                                    byte b13 = (byte) (b12 + 1);
                                    byte b14 = (byte) (-b12);
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    b(b13, b14, b14, objArr14);
                                    obj6 = cls6.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                                }
                                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr13)).intValue();
                            }
                            if (i != ((int[]) objArr2[1])[0]) {
                                int i51 = values;
                                AlternateContactlessPaymentDataJson = ((i51 ^ 93) + ((i51 & 93) << 1)) % 128;
                                return objArr2;
                            }
                            try {
                                int i52 = -android.text.TextUtils.indexOf("", "", 0, 0);
                                int i53 = i52 * 302;
                                int i54 = ((90450 | i53) << 1) - (i53 ^ 90450);
                                int i55 = ~i52;
                                int i56 = ~((i55 ^ i47) | (i55 & i47));
                                int i57 = -(-(((i56 ^ 150) | (i56 & 150)) * (-602)));
                                int i58 = ~((i55 & (-151)) | (i55 ^ (-151)));
                                int i59 = ~((i55 ^ i) | (i55 & i));
                                int i60 = (i59 ^ i58) | (i59 & i58);
                                int i61 = (i52 ^ i47) | (i52 & i47);
                                int i62 = ~((i61 ^ 150) | (i61 & 150));
                                int i63 = (((i54 & i57) + (i54 | i57)) - (~(-(-(((i62 ^ i60) | (i62 & i60)) * (-301)))))) - 1;
                                int i64 = (~((i47 ^ 150) | (i47 & 150))) * 301;
                                int i65 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                int i66 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                a((i63 ^ i64) + ((i64 & i63) << 1), (i65 ^ 40) + ((i65 & 40) << 1), "ￌ\t\u0002\u000b\u000f\u0002\bￌ\u0010\u0016\u0010ￌ\u000f\u0002\u0000\ufffe\u000f\u0011￼\u0011\u000b\u0002\u000f\u000f\u0012\u0000ￌ\u0004\u000b\u0006\u0000\ufffe\u000f\u0011ￌ\u0004\u0012\uffff\u0002\u0001", true, (i66 ^ 11) + ((i66 & 11) << 1), objArr15);
                                file2 = new java.io.File((java.lang.String) objArr15[0]);
                            } catch (java.lang.Exception unused2) {
                            }
                            if (file2.canRead()) {
                                java.io.FileReader fileReader = new java.io.FileReader(file2);
                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                                try {
                                    str = bufferedReader.readLine();
                                    int edgeSlop = android.view.ViewConfiguration.getEdgeSlop() >> 16;
                                    int i67 = edgeSlop * (-464);
                                    int i68 = (((-150498) | i67) << 1) - (i67 ^ (-150498));
                                    int i69 = ~edgeSlop;
                                    int i70 = (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE) | (i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE);
                                    int i71 = ((~i70) | i69) * (-465);
                                    int i72 = (i68 & i71) + (i68 | i71);
                                    int i73 = ~(i69 | i);
                                    int i74 = ((i73 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE) | (i73 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE)) * 930;
                                    int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
                                    int i75 = absoluteGravity * 530;
                                    int i76 = (i75 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO) + (i75 | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO);
                                    int i77 = ~((i47 ^ absoluteGravity) | (i47 & absoluteGravity));
                                    int i78 = ~(absoluteGravity | 3);
                                    int i79 = ((((i76 | 1590) << 1) - (i76 ^ 1590)) - (~(((i78 ^ i77) | (i77 & i78)) * 529))) - 1;
                                    int i80 = ~((absoluteGravity & i) | (absoluteGravity ^ i));
                                    int i81 = ((i80 ^ (-4)) | (i80 & (-4))) * 529;
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    a((i72 ^ i74) + ((i74 & i72) << 1) + (((i69 ^ i70) | (i69 & i70)) * 465), (i79 & i81) + (i81 | i79), "\uffff\u0001\u0000", true, -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr16);
                                    if (!str.equals((java.lang.String) objArr16[0])) {
                                        AlternateContactlessPaymentDataJson = (values + 81) % 128;
                                        fileReader.close();
                                        bufferedReader.close();
                                        int i82 = -android.os.Process.getGidForName("");
                                        int i83 = (i82 * 46) + 6808;
                                        int i84 = ~(i47 | (-149));
                                        int i85 = ((i84 ^ i82) | (i84 & i82)) * (-90);
                                        int i86 = (i83 ^ i85) + ((i83 & i85) << 1);
                                        int i87 = ~((i ^ (-149)) | (i & (-149)));
                                        int i88 = ~((i82 ^ 148) | (i82 & 148));
                                        int i89 = ((i87 ^ i88) | (i87 & i88)) * (-45);
                                        int i90 = ((i86 | i89) << 1) - (i89 ^ i86);
                                        int i91 = ~((~i82) | i);
                                        int i92 = (i91 ^ (-149)) | (i91 & (-149));
                                        int i93 = ~((i82 ^ i47) | (i82 & i47));
                                        int i94 = -(-(((i93 ^ i92) | (i93 & i92)) * 45));
                                        int axisFromString = android.view.MotionEvent.axisFromString("");
                                        int i95 = -android.text.TextUtils.getOffsetAfter("", 0);
                                        int i96 = (i95 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) - 6450;
                                        int i97 = (~((i95 ^ i) | (i95 & i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                                        int i98 = (i96 & i97) + (i96 | i97);
                                        int i99 = (i95 ^ (-31)) | (i95 & (-31));
                                        int i100 = ((i99 ^ i47) | (i99 & i47)) * (-216);
                                        int i101 = (i98 ^ i100) + ((i100 & i98) << 1);
                                        int i102 = ~((i95 ^ i47) | (i95 & i47));
                                        int i103 = ((i102 ^ 30) | (i102 & 30)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        a((i90 & i94) + (i94 | i90), ((axisFromString | 32) << 1) - (axisFromString ^ 32), "\u0003\n\u0000\uffff\f\u0003�\u0003\u0001\uffff\u0010\u0012\u0004ￍ\n\u0003\f\u0010\u0003\tￍ\u0011\u0017\u0011ￍ\u0001\r\u0010\u000eￍ\u0002", true, ((i101 | i103) << 1) - (i103 ^ i101), objArr17);
                                        file = new java.io.File((java.lang.String) objArr17[0]);
                                        if (!file.canRead()) {
                                            try {
                                                java.lang.String readLine = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                a(99 - (~(-(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0000", true, -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr18);
                                                boolean equals = readLine.equals((java.lang.String) objArr18[0]);
                                                values = (AlternateContactlessPaymentDataJson + 81) % 128;
                                                if (equals) {
                                                    int i104 = -(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                    int i105 = -android.graphics.Color.alpha(0);
                                                    int capsMode2 = android.text.TextUtils.getCapsMode("", 0, 0);
                                                    int i106 = capsMode2 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE;
                                                    int i107 = ~capsMode2;
                                                    int i108 = ~((i107 & 9) | (i107 ^ 9));
                                                    int i109 = ~((i107 ^ i) | (i107 & i));
                                                    int i110 = (i106 & (-2538)) + (i106 | (-2538)) + (((i108 & i109) | (i108 ^ i109)) * (-283));
                                                    int i111 = (~(capsMode2 | (-10))) * 283;
                                                    int i112 = (i107 ^ (-10)) | (i107 & (-10));
                                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                    a(((i104 | 150) << 1) - (i104 ^ 150), (i105 ^ 36) + ((i105 & 36) << 1), "\u0010\uffff\u0001\u0007\f\u0005�\r\fￍ\u0011\u0017\u0011ￍ\t\u0003\u0010\f\u0003\nￍ\u0002\u0003\u0000\u0013\u0005ￍ\u0012\u0010\uffff\u0001\u0007\f\u0005ￍ\u0012", false, (((i110 & i111) + (i111 | i110)) - (~(-(-((~((i112 ^ i) | (i112 & i))) * 283))))) - 1, objArr19);
                                                    java.io.File file3 = new java.io.File((java.lang.String) objArr19[0]);
                                                    if (file3.canRead()) {
                                                        try {
                                                            java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                                            int i113 = -android.view.KeyEvent.normalizeMetaState(0);
                                                            int i114 = (i47 ^ i113) | (i47 & i113);
                                                            int i115 = (((i113 * (-51)) + 5300) - (~(-(-((~((i114 & 100) | (i114 ^ 100))) * 52))))) - 1;
                                                            int i116 = ~((i47 & (-101)) | (i47 ^ (-101)));
                                                            int i117 = ~((i113 & (-101)) | (i113 ^ (-101)));
                                                            int i118 = (i116 ^ i117) | (i116 & i117);
                                                            int i119 = ~i114;
                                                            int i120 = ((i119 ^ i118) | (i118 & i119)) * (-52);
                                                            int i121 = ((i115 | i120) << 1) - (i120 ^ i115);
                                                            int i122 = ~i113;
                                                            int i123 = ~((i122 & i47) | (i122 ^ i47));
                                                            int i124 = ~((i122 ^ 100) | (i122 & 100));
                                                            int i125 = -(-(((i124 ^ i123) | (i124 & i123)) * 52));
                                                            long uptimeMillis = android.os.SystemClock.uptimeMillis();
                                                            int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength() >> 16;
                                                            int i126 = fadingEdgeLength * 69;
                                                            int i127 = (i126 ^ (-67)) + ((i126 & (-67)) << 1);
                                                            int i128 = ~fadingEdgeLength;
                                                            int i129 = (i128 ^ (-2)) | (i128 & (-2));
                                                            int i130 = ~((i129 & i47) | (i129 ^ i47));
                                                            int i131 = ~((fadingEdgeLength & 1) | (fadingEdgeLength ^ 1));
                                                            int i132 = (i131 & i130) | (i131 ^ i130);
                                                            int i133 = ~(i | 1);
                                                            int i134 = ((i132 & i133) | (i132 ^ i133)) * (-68);
                                                            int i135 = ((((i127 | i134) << 1) - (i134 ^ i127)) - (~((~((i128 | i47) | 1)) * (-68)))) - 1;
                                                            int i136 = ~(i47 | (-2));
                                                            int i137 = ((i136 ^ i128) | (i136 & i128)) * 68;
                                                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                            a((i121 & i125) + (i125 | i121), (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)), "\u0000", true, ((i135 | i137) << 1) - (i137 ^ i135), objArr20);
                                                        } finally {
                                                        }
                                                    } else {
                                                        int i138 = AlternateContactlessPaymentDataJson + 45;
                                                        values = i138 % 128;
                                                    }
                                                    int i139 = (((-124846753) & i47) | ((-124846753) ^ i47)) * (-369);
                                                    int i140 = 662549220 | i47;
                                                    int i141 = ~i140;
                                                    int i142 = ((-551971360) ^ i139) + ((i139 & (-551971360)) << 1) + (((i141 ^ 1879899477) | (i141 & 1879899477)) * (-369));
                                                    int i143 = ~(((-662549221) & i) | ((-662549221) ^ i));
                                                    int i144 = -(-(((~((1879899477 ^ i140) | (i140 & 1879899477))) | (537702468 & i143) | (i143 ^ 537702468)) * 369));
                                                    int i145 = ~(976045086 | i47);
                                                    int i146 = (i145 ^ (-1061113760)) | (i145 & (-1061113760));
                                                    int i147 = ~((1026952079 ^ i47) | (1026952079 & i47));
                                                    int i148 = (-601414549) - (~((((i146 ^ i147) | (i146 & i147)) | (~((-941883407) | i))) * 590));
                                                    int i149 = ~((976045086 & i47) | (976045086 ^ i47));
                                                    int i150 = (i149 ^ (-1061113760)) | (i149 & (-1061113760));
                                                    int i151 = -(-(((i150 ^ i147) | (i150 & i147)) * (-1180)));
                                                    int i152 = ~(((-1026952080) & i47) | ((-1026952080) ^ i47));
                                                    int i153 = ~(((-976045087) & i47) | ((-976045087) ^ i47));
                                                    if (((i142 | i144) << 1) - (i144 ^ i142) <= (i148 ^ i151) + ((i151 & i148) << 1) + (((i152 & i153) | (i152 ^ i153)) * 590)) {
                                                        throw null;
                                                    }
                                                    if (str != null) {
                                                        java.lang.Object[] objArr21 = {new int[]{i}, new int[]{(i & (-21)) | (i47 & 20)}, str, new int[1]};
                                                        java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~((-1018724344) | i)) | 1009287137) * 345) - 2098186816) + (((~(i47 | (-1018724344))) | (-1023082496)) * 345) + ((~(i | (-1009287138))) * 345))};
                                                        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj7 == null) {
                                                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2713 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                            byte b15 = $$a[14];
                                                            byte b16 = (byte) (b15 + 1);
                                                            byte b17 = (byte) (-b15);
                                                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                            b(b16, b17, b17, objArr23);
                                                            obj7 = cls7.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                                        }
                                                        ((int[]) objArr21[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr22)).intValue();
                                                        return objArr21;
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        java.lang.Object[] objArr24 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                        java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-849945564) | i)) | (-1002306560)) * (-502)) + 1983573292 + ((~(i47 | (-847323139))) * (-502)) + (((~(i | (-154983422))) | (-849945564)) * 502))};
                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj == null) {
                                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 50, android.text.TextUtils.indexOf("", "") + 2713, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1));
                                            byte b18 = $$a[14];
                                            byte b19 = (byte) (b18 + 1);
                                            byte b20 = (byte) (-b18);
                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                            b(b19, b20, b20, objArr26);
                                            obj = cls8.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                                        }
                                        ((int[]) objArr24[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr25)).intValue();
                                        int i154 = AlternateContactlessPaymentDataJson;
                                        i3 = (i154 ^ 1) + ((i154 & 1) << 1);
                                        values = i3 % 128;
                                        if (i3 % 2 != 0) {
                                            return objArr24;
                                        }
                                        throw null;
                                    }
                                    fileReader.close();
                                    bufferedReader.close();
                                } finally {
                                }
                            }
                            str = null;
                            int i822 = -android.os.Process.getGidForName("");
                            int i832 = (i822 * 46) + 6808;
                            int i842 = ~(i47 | (-149));
                            int i852 = ((i842 ^ i822) | (i842 & i822)) * (-90);
                            int i862 = (i832 ^ i852) + ((i832 & i852) << 1);
                            int i872 = ~((i ^ (-149)) | (i & (-149)));
                            int i882 = ~((i822 ^ 148) | (i822 & 148));
                            int i892 = ((i872 ^ i882) | (i872 & i882)) * (-45);
                            int i902 = ((i862 | i892) << 1) - (i892 ^ i862);
                            int i912 = ~((~i822) | i);
                            int i922 = (i912 ^ (-149)) | (i912 & (-149));
                            int i932 = ~((i822 ^ i47) | (i822 & i47));
                            int i942 = -(-(((i932 ^ i922) | (i932 & i922)) * 45));
                            int axisFromString2 = android.view.MotionEvent.axisFromString("");
                            int i952 = -android.text.TextUtils.getOffsetAfter("", 0);
                            int i962 = (i952 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) - 6450;
                            int i972 = (~((i952 ^ i) | (i952 & i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                            int i982 = (i962 & i972) + (i962 | i972);
                            int i992 = (i952 ^ (-31)) | (i952 & (-31));
                            int i1002 = ((i992 ^ i47) | (i992 & i47)) * (-216);
                            int i1012 = (i982 ^ i1002) + ((i1002 & i982) << 1);
                            int i1022 = ~((i952 ^ i47) | (i952 & i47));
                            int i1032 = ((i1022 ^ 30) | (i1022 & 30)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                            java.lang.Object[] objArr172 = new java.lang.Object[1];
                            a((i902 & i942) + (i942 | i902), ((axisFromString2 | 32) << 1) - (axisFromString2 ^ 32), "\u0003\n\u0000\uffff\f\u0003�\u0003\u0001\uffff\u0010\u0012\u0004ￍ\n\u0003\f\u0010\u0003\tￍ\u0011\u0017\u0011ￍ\u0001\r\u0010\u000eￍ\u0002", true, ((i1012 | i1032) << 1) - (i1032 ^ i1012), objArr172);
                            file = new java.io.File((java.lang.String) objArr172[0]);
                            if (!file.canRead()) {
                            }
                            java.lang.Object[] objArr242 = {new int[]{i}, new int[]{i}, null, new int[1]};
                            java.lang.Object[] objArr252 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-849945564) | i)) | (-1002306560)) * (-502)) + 1983573292 + ((~(i47 | (-847323139))) * (-502)) + (((~(i | (-154983422))) | (-849945564)) * 502))};
                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj == null) {
                            }
                            ((int[]) objArr242[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr252)).intValue();
                            int i1542 = AlternateContactlessPaymentDataJson;
                            i3 = (i1542 ^ 1) + ((i1542 & 1) << 1);
                            values = i3 % 128;
                            if (i3 % 2 != 0) {
                            }
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    } else {
                        i5 = (i5 ^ 1) + ((i5 & 1) << 1);
                        int i155 = values;
                        AlternateContactlessPaymentDataJson = ((i155 ^ 125) + ((i155 & 125) << 1)) % 128;
                    }
                }
                java.lang.Object[] objArr27 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-468189227) | i4)) | (-536739759)) * (-591)) - 853729764) + (((-468189227) | i) * 591))};
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj8 == null) {
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 2712 - android.view.MotionEvent.axisFromString(""), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    byte b21 = $$a[14];
                    byte b22 = (byte) (b21 + 1);
                    byte b23 = (byte) (-b21);
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    b(b22, b23, b23, objArr28);
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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> valueOf(java.lang.Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return writeReplace(obj, false);
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }

    final com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> AlternateContactlessPaymentDataJson(java.util.Map.Entry<?, ?> entry) {
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> valueOf = valueOf(entry.getKey());
        if (valueOf == null) {
            return null;
        }
        V v = valueOf.getProfileVersion;
        java.lang.Object value = entry.getValue();
        if (v == value || (v != null && v.equals(value))) {
            return valueOf;
        }
        return null;
    }

    final void values(com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson, boolean z) {
        int i;
        if (z) {
            alternateContactlessPaymentDataJson.values.AlternateContactlessPaymentDataJson = alternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson;
            alternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson.values = alternateContactlessPaymentDataJson.values;
        }
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson2 = alternateContactlessPaymentDataJson.valueOf;
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson3 = alternateContactlessPaymentDataJson.DigitizedCardProfile;
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson4 = alternateContactlessPaymentDataJson.writeReplace;
        int i2 = 0;
        if (alternateContactlessPaymentDataJson2 != null && alternateContactlessPaymentDataJson3 != null) {
            if (alternateContactlessPaymentDataJson2.getAid > alternateContactlessPaymentDataJson3.getAid) {
                com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson5 = alternateContactlessPaymentDataJson2.DigitizedCardProfile;
                while (alternateContactlessPaymentDataJson5 != null) {
                    com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson6 = alternateContactlessPaymentDataJson5;
                    alternateContactlessPaymentDataJson5 = alternateContactlessPaymentDataJson5.DigitizedCardProfile;
                    alternateContactlessPaymentDataJson2 = alternateContactlessPaymentDataJson6;
                }
            } else {
                while (true) {
                    com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson7 = alternateContactlessPaymentDataJson3.valueOf;
                    if (alternateContactlessPaymentDataJson7 == null) {
                        break;
                    } else {
                        alternateContactlessPaymentDataJson3 = alternateContactlessPaymentDataJson7;
                    }
                }
                alternateContactlessPaymentDataJson2 = alternateContactlessPaymentDataJson3;
            }
            values((com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson) alternateContactlessPaymentDataJson2, false);
            com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson8 = alternateContactlessPaymentDataJson.valueOf;
            if (alternateContactlessPaymentDataJson8 != null) {
                i = alternateContactlessPaymentDataJson8.getAid;
                alternateContactlessPaymentDataJson2.valueOf = alternateContactlessPaymentDataJson8;
                alternateContactlessPaymentDataJson8.writeReplace = alternateContactlessPaymentDataJson2;
                alternateContactlessPaymentDataJson.valueOf = null;
            } else {
                i = 0;
            }
            com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson9 = alternateContactlessPaymentDataJson.DigitizedCardProfile;
            if (alternateContactlessPaymentDataJson9 != null) {
                i2 = alternateContactlessPaymentDataJson9.getAid;
                alternateContactlessPaymentDataJson2.DigitizedCardProfile = alternateContactlessPaymentDataJson9;
                alternateContactlessPaymentDataJson9.writeReplace = alternateContactlessPaymentDataJson2;
                alternateContactlessPaymentDataJson.DigitizedCardProfile = null;
            }
            alternateContactlessPaymentDataJson2.getAid = java.lang.Math.max(i, i2) + 1;
            values(alternateContactlessPaymentDataJson, alternateContactlessPaymentDataJson2);
            return;
        }
        if (alternateContactlessPaymentDataJson2 != null) {
            values(alternateContactlessPaymentDataJson, alternateContactlessPaymentDataJson2);
            alternateContactlessPaymentDataJson.valueOf = null;
        } else if (alternateContactlessPaymentDataJson3 != null) {
            values(alternateContactlessPaymentDataJson, alternateContactlessPaymentDataJson3);
            alternateContactlessPaymentDataJson.DigitizedCardProfile = null;
        } else {
            values(alternateContactlessPaymentDataJson, (com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson) null);
        }
        AlternateContactlessPaymentDataJson(alternateContactlessPaymentDataJson4, false);
        this.AlternateContactlessPaymentDataJson--;
        this.valueOf++;
    }

    private void values(com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson, com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson2) {
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson3 = alternateContactlessPaymentDataJson.writeReplace;
        alternateContactlessPaymentDataJson.writeReplace = null;
        if (alternateContactlessPaymentDataJson2 != null) {
            alternateContactlessPaymentDataJson2.writeReplace = alternateContactlessPaymentDataJson3;
        }
        if (alternateContactlessPaymentDataJson3 != null) {
            if (alternateContactlessPaymentDataJson3.valueOf == alternateContactlessPaymentDataJson) {
                alternateContactlessPaymentDataJson3.valueOf = alternateContactlessPaymentDataJson2;
                return;
            } else {
                if (!IccPrivateKeyCrtComponentsJson && alternateContactlessPaymentDataJson3.DigitizedCardProfile != alternateContactlessPaymentDataJson) {
                    throw new java.lang.AssertionError();
                }
                alternateContactlessPaymentDataJson3.DigitizedCardProfile = alternateContactlessPaymentDataJson2;
                return;
            }
        }
        this.SdkCoreAlternateContactlessPaymentDataImpl = alternateContactlessPaymentDataJson2;
    }

    private void AlternateContactlessPaymentDataJson(com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson, boolean z) {
        while (alternateContactlessPaymentDataJson != null) {
            com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson2 = alternateContactlessPaymentDataJson.valueOf;
            com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson3 = alternateContactlessPaymentDataJson.DigitizedCardProfile;
            int i = alternateContactlessPaymentDataJson2 != null ? alternateContactlessPaymentDataJson2.getAid : 0;
            int i2 = alternateContactlessPaymentDataJson3 != null ? alternateContactlessPaymentDataJson3.getAid : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson4 = alternateContactlessPaymentDataJson3.valueOf;
                com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson5 = alternateContactlessPaymentDataJson3.DigitizedCardProfile;
                int i4 = (alternateContactlessPaymentDataJson4 != null ? alternateContactlessPaymentDataJson4.getAid : 0) - (alternateContactlessPaymentDataJson5 != null ? alternateContactlessPaymentDataJson5.getAid : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    if (!IccPrivateKeyCrtComponentsJson && i4 != 1) {
                        throw new java.lang.AssertionError();
                    }
                    values(alternateContactlessPaymentDataJson3);
                }
                valueOf((com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson) alternateContactlessPaymentDataJson);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson6 = alternateContactlessPaymentDataJson2.valueOf;
                com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson7 = alternateContactlessPaymentDataJson2.DigitizedCardProfile;
                int i5 = (alternateContactlessPaymentDataJson6 != null ? alternateContactlessPaymentDataJson6.getAid : 0) - (alternateContactlessPaymentDataJson7 != null ? alternateContactlessPaymentDataJson7.getAid : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    if (!IccPrivateKeyCrtComponentsJson && i5 != -1) {
                        throw new java.lang.AssertionError();
                    }
                    valueOf((com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson) alternateContactlessPaymentDataJson2);
                }
                values(alternateContactlessPaymentDataJson);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                alternateContactlessPaymentDataJson.getAid = i + 1;
                if (z) {
                    return;
                }
            } else {
                if (!IccPrivateKeyCrtComponentsJson && i3 != -1 && i3 != 1) {
                    throw new java.lang.AssertionError();
                }
                alternateContactlessPaymentDataJson.getAid = java.lang.Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            alternateContactlessPaymentDataJson = alternateContactlessPaymentDataJson.writeReplace;
        }
    }

    private void valueOf(com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson) {
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson2 = alternateContactlessPaymentDataJson.valueOf;
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson3 = alternateContactlessPaymentDataJson.DigitizedCardProfile;
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson4 = alternateContactlessPaymentDataJson3.valueOf;
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson5 = alternateContactlessPaymentDataJson3.DigitizedCardProfile;
        alternateContactlessPaymentDataJson.DigitizedCardProfile = alternateContactlessPaymentDataJson4;
        if (alternateContactlessPaymentDataJson4 != null) {
            alternateContactlessPaymentDataJson4.writeReplace = alternateContactlessPaymentDataJson;
        }
        values(alternateContactlessPaymentDataJson, alternateContactlessPaymentDataJson3);
        alternateContactlessPaymentDataJson3.valueOf = alternateContactlessPaymentDataJson;
        alternateContactlessPaymentDataJson.writeReplace = alternateContactlessPaymentDataJson3;
        alternateContactlessPaymentDataJson.getAid = java.lang.Math.max(alternateContactlessPaymentDataJson2 != null ? alternateContactlessPaymentDataJson2.getAid : 0, alternateContactlessPaymentDataJson4 != null ? alternateContactlessPaymentDataJson4.getAid : 0) + 1;
        alternateContactlessPaymentDataJson3.getAid = java.lang.Math.max(alternateContactlessPaymentDataJson.getAid, alternateContactlessPaymentDataJson5 != null ? alternateContactlessPaymentDataJson5.getAid : 0) + 1;
    }

    private void values(com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson) {
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson2 = alternateContactlessPaymentDataJson.valueOf;
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson3 = alternateContactlessPaymentDataJson.DigitizedCardProfile;
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson4 = alternateContactlessPaymentDataJson2.valueOf;
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson5 = alternateContactlessPaymentDataJson2.DigitizedCardProfile;
        alternateContactlessPaymentDataJson.valueOf = alternateContactlessPaymentDataJson5;
        if (alternateContactlessPaymentDataJson5 != null) {
            alternateContactlessPaymentDataJson5.writeReplace = alternateContactlessPaymentDataJson;
        }
        values(alternateContactlessPaymentDataJson, alternateContactlessPaymentDataJson2);
        alternateContactlessPaymentDataJson2.DigitizedCardProfile = alternateContactlessPaymentDataJson;
        alternateContactlessPaymentDataJson.writeReplace = alternateContactlessPaymentDataJson2;
        alternateContactlessPaymentDataJson.getAid = java.lang.Math.max(alternateContactlessPaymentDataJson3 != null ? alternateContactlessPaymentDataJson3.getAid : 0, alternateContactlessPaymentDataJson5 != null ? alternateContactlessPaymentDataJson5.getAid : 0) + 1;
        alternateContactlessPaymentDataJson2.getAid = java.lang.Math.max(alternateContactlessPaymentDataJson.getAid, alternateContactlessPaymentDataJson4 != null ? alternateContactlessPaymentDataJson4.getAid : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        com.payair.hce.getCiacDeclineOnPpms<K, V>.values valuesVar = this.RecordsJson;
        if (valuesVar != null) {
            return valuesVar;
        }
        com.payair.hce.getCiacDeclineOnPpms<K, V>.values valuesVar2 = new com.payair.hce.getCiacDeclineOnPpms.values();
        this.RecordsJson = valuesVar2;
        return valuesVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<K> keySet() {
        com.payair.hce.getCiacDeclineOnPpms<K, V>.writeReplace writereplace = this.getProfileVersion;
        if (writereplace != null) {
            return writereplace;
        }
        com.payair.hce.getCiacDeclineOnPpms<K, V>.writeReplace writereplace2 = new com.payair.hce.getCiacDeclineOnPpms.writeReplace();
        this.getProfileVersion = writereplace2;
        return writereplace2;
    }

    static final class AlternateContactlessPaymentDataJson<K, V> implements java.util.Map.Entry<K, V> {
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> AlternateContactlessPaymentDataJson;
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> DigitizedCardProfile;
        final K SdkCoreAlternateContactlessPaymentDataImpl;
        int getAid;
        V getProfileVersion;
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> valueOf;
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> values;
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> writeReplace;

        AlternateContactlessPaymentDataJson() {
            this.SdkCoreAlternateContactlessPaymentDataImpl = null;
            this.values = this;
            this.AlternateContactlessPaymentDataJson = this;
        }

        AlternateContactlessPaymentDataJson(com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson, K k, com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson2, com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson3) {
            this.writeReplace = alternateContactlessPaymentDataJson;
            this.SdkCoreAlternateContactlessPaymentDataImpl = k;
            this.getAid = 1;
            this.AlternateContactlessPaymentDataJson = alternateContactlessPaymentDataJson2;
            this.values = alternateContactlessPaymentDataJson3;
            alternateContactlessPaymentDataJson3.AlternateContactlessPaymentDataJson = this;
            alternateContactlessPaymentDataJson2.values = this;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.SdkCoreAlternateContactlessPaymentDataImpl;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.getProfileVersion;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.getProfileVersion;
            this.getProfileVersion = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            K k = this.SdkCoreAlternateContactlessPaymentDataImpl;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.getProfileVersion;
            return v == null ? entry.getValue() == null : v.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.SdkCoreAlternateContactlessPaymentDataImpl;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.getProfileVersion;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.SdkCoreAlternateContactlessPaymentDataImpl);
            sb.append("=");
            sb.append(this.getProfileVersion);
            return sb.toString();
        }
    }

    abstract class DigitizedCardProfile<T> implements java.util.Iterator<T> {
        private int valueOf;
        private com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> values = null;
        private com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> writeReplace;

        DigitizedCardProfile() {
            this.writeReplace = com.payair.hce.getCiacDeclineOnPpms.this.values.AlternateContactlessPaymentDataJson;
            this.valueOf = com.payair.hce.getCiacDeclineOnPpms.this.valueOf;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.writeReplace != com.payair.hce.getCiacDeclineOnPpms.this.values;
        }

        final com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> DigitizedCardProfile() {
            com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson = this.writeReplace;
            if (alternateContactlessPaymentDataJson == com.payair.hce.getCiacDeclineOnPpms.this.values) {
                throw new java.util.NoSuchElementException();
            }
            if (com.payair.hce.getCiacDeclineOnPpms.this.valueOf != this.valueOf) {
                throw new java.util.ConcurrentModificationException();
            }
            this.writeReplace = alternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson;
            this.values = alternateContactlessPaymentDataJson;
            return alternateContactlessPaymentDataJson;
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> alternateContactlessPaymentDataJson = this.values;
            if (alternateContactlessPaymentDataJson == null) {
                throw new java.lang.IllegalStateException();
            }
            com.payair.hce.getCiacDeclineOnPpms.this.values((com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson) alternateContactlessPaymentDataJson, true);
            this.values = null;
            this.valueOf = com.payair.hce.getCiacDeclineOnPpms.this.valueOf;
        }
    }

    final class writeReplace extends java.util.AbstractSet<K> {
        writeReplace() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return com.payair.hce.getCiacDeclineOnPpms.this.AlternateContactlessPaymentDataJson;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<K> iterator() {
            return new com.payair.hce.getCiacDeclineOnPpms<K, V>.DigitizedCardProfile<K>() { // from class: com.payair.hce.getCiacDeclineOnPpms.writeReplace.2
                {
                    com.payair.hce.getCiacDeclineOnPpms getciacdeclineonppms = com.payair.hce.getCiacDeclineOnPpms.this;
                }

                @Override // java.util.Iterator
                public final K next() {
                    return DigitizedCardProfile().SdkCoreAlternateContactlessPaymentDataImpl;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return com.payair.hce.getCiacDeclineOnPpms.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            com.payair.hce.getCiacDeclineOnPpms getciacdeclineonppms = com.payair.hce.getCiacDeclineOnPpms.this;
            com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> valueOf = getciacdeclineonppms.valueOf(obj);
            if (valueOf != null) {
                getciacdeclineonppms.values((com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson) valueOf, true);
            }
            return valueOf != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            com.payair.hce.getCiacDeclineOnPpms.this.clear();
        }
    }

    private java.lang.Object writeReplace() throws java.io.ObjectStreamException {
        return new java.util.LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson<K, V> valueOf = valueOf(obj);
        if (valueOf != null) {
            values((com.payair.hce.getCiacDeclineOnPpms.AlternateContactlessPaymentDataJson) valueOf, true);
        }
        if (valueOf != null) {
            return valueOf.getProfileVersion;
        }
        return null;
    }
}

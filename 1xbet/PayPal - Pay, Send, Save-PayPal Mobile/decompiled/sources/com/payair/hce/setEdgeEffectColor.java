package com.payair.hce;

/* loaded from: classes4.dex */
public final class setEdgeEffectColor implements java.util.Set {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int[] AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int writeReplace;
    private java.util.Set valueOf = new java.util.HashSet();
    private java.util.Set values;

    private static void b(short s, short s2, byte b, java.lang.Object[] objArr) {
        byte[] bArr = $$a;
        int i = (s2 * 2) + 4;
        int i2 = (s * 3) + 66;
        int i3 = b * 3;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = i3 + i2;
            i++;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i2 += bArr[i];
                i++;
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        if ((i * (-380)) + (i2 * 382) + ((i2 | i3 | i4) * (-381)) + (((~(i | i2)) | (~((~i3) | i2)) | (~((~i2) | i4))) * 381) + ((~(i4 | i2)) * 381) == 1) {
            return values(objArr);
        }
        com.payair.hce.setEdgeEffectColor setedgeeffectcolor = (com.payair.hce.setEdgeEffectColor) objArr[0];
        com.payair.hce.setRemoteViewsAdapter setremoteviewsadapter = new com.payair.hce.setRemoteViewsAdapter(setedgeeffectcolor.valueOf, setedgeeffectcolor.values);
        writeReplace = (DigitizedCardProfile + 69) % 128;
        return setremoteviewsadapter;
    }

    public setEdgeEffectColor(java.util.Set set) {
        this.values = set;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        int i = DigitizedCardProfile + 53;
        writeReplace = i % 128;
        int size = i % 2 == 0 ? this.valueOf.size() * this.values.size() : this.valueOf.size() + this.values.size();
        int i2 = writeReplace + 107;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            return size;
        }
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        int i = writeReplace + 49;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            this.valueOf.isEmpty();
            throw null;
        }
        if (this.valueOf.isEmpty() && this.values.isEmpty()) {
            DigitizedCardProfile = (writeReplace + 101) % 128;
            return true;
        }
        DigitizedCardProfile = (writeReplace + 89) % 128;
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        DigitizedCardProfile = (writeReplace + 11) % 128;
        if (!this.valueOf.contains(obj)) {
            DigitizedCardProfile = (writeReplace + 77) % 128;
            if (!this.values.contains(obj)) {
                return false;
            }
        }
        int i = writeReplace + 1;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            return true;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        java.lang.Object[] objArr;
        int i = writeReplace + 125;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] array = this.valueOf.toArray();
            java.lang.Object[] array2 = this.values.toArray();
            objArr = new java.lang.Object[array.length % array2.length];
            java.lang.System.arraycopy(array, 1, objArr, 1, array.length);
            java.lang.System.arraycopy(array2, 0, objArr, array.length, array2.length);
        } else {
            java.lang.Object[] array3 = this.valueOf.toArray();
            java.lang.Object[] array4 = this.values.toArray();
            objArr = new java.lang.Object[array3.length + array4.length];
            java.lang.System.arraycopy(array3, 0, objArr, 0, array3.length);
            java.lang.System.arraycopy(array4, 0, objArr, array3.length, array4.length);
        }
        int i2 = writeReplace + 117;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            return objArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{706161399, 960358096, 350786755, -746210701, 2039525469, -986187848, -684717179, -467720257}, 16 - android.view.View.resolveSize(0, 0), objArr2);
        throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        int i = writeReplace + 43;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            this.valueOf.add(obj);
            throw new java.lang.ArithmeticException();
        }
        boolean add = this.valueOf.add(obj);
        writeReplace = (DigitizedCardProfile + 39) % 128;
        return add;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        writeReplace = (DigitizedCardProfile + 25) % 128;
        boolean remove = this.valueOf.remove(obj);
        int i = writeReplace + 103;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            return remove;
        }
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        DigitizedCardProfile = (writeReplace + 77) % 128;
        if (!this.valueOf.containsAll(collection)) {
            DigitizedCardProfile = (writeReplace + 89) % 128;
            if (!this.values.containsAll(collection)) {
                return false;
            }
        }
        int i = writeReplace + 7;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            return true;
        }
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        int i = writeReplace + 53;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            this.valueOf.addAll(collection);
            throw null;
        }
        boolean addAll = this.valueOf.addAll(collection);
        int i2 = DigitizedCardProfile + 45;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            return addAll;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        DigitizedCardProfile = (writeReplace + 39) % 128;
        boolean retainAll = this.valueOf.retainAll(collection);
        DigitizedCardProfile = (writeReplace + 101) % 128;
        return retainAll;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setEdgeEffectColor setedgeeffectcolor = (com.payair.hce.setEdgeEffectColor) objArr[0];
        java.util.Collection<?> collection = (java.util.Collection) objArr[1];
        DigitizedCardProfile = (writeReplace + 41) % 128;
        boolean removeAll = setedgeeffectcolor.valueOf.removeAll(collection);
        int i = DigitizedCardProfile + 17;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            return java.lang.Boolean.valueOf(removeAll);
        }
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        writeReplace = (DigitizedCardProfile + 115) % 128;
        this.valueOf.clear();
        int i = writeReplace + 79;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final java.util.Set valueOf() {
        int i = writeReplace + 115;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            return this.values;
        }
        throw null;
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        int i2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AlternateContactlessPaymentDataJson;
        long j = 0;
        int i3 = 1;
        int i4 = 0;
        if (iArr3 != null) {
            int i5 = ($10 + 45) % 128;
            $11 = i5;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            $10 = (i5 + 113) % 128;
            int i6 = 0;
            while (i6 < length2) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr3[i6])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 29, (char) android.graphics.Color.red(0))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr4[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i6++;
                    j = 0;
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
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = AlternateContactlessPaymentDataJson;
        if (iArr6 != null) {
            int i7 = $10 + 69;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                java.lang.Object[] objArr3 = new java.lang.Object[i3];
                objArr3[i4] = java.lang.Integer.valueOf(iArr6[i2]);
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i4, i4), 28 - android.graphics.ImageFormat.getBitsPerPixel(i4), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                }
                iArr2[i2] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i2++;
                i3 = 1;
                i4 = 0;
            }
            iArr6 = iArr2;
        }
        int i8 = i4;
        java.lang.System.arraycopy(iArr6, i8, iArr5, i8, length3);
        istransitsupported.valueOf = i8;
        while (istransitsupported.valueOf < iArr.length) {
            $10 = ($11 + 79) % 128;
            cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            int i9 = 0;
            for (int i10 = 16; i9 < i10; i10 = 16) {
                istransitsupported.DigitizedCardProfile ^= iArr5[i9];
                java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.graphics.Color.blue(0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5088, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i9++;
            }
            int i11 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i11;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i12 = istransitsupported.DigitizedCardProfile;
            int i13 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {istransitsupported, istransitsupported};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj4 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.widget.ExpandableListView.getPackedPositionType(0L), 2923 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 3038));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b((short) 0, (short) 0, (byte) 0, objArr6);
                obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        writeReplace = 1;
        AlternateContactlessPaymentDataJson = new int[]{-1703132446, 1964112780, -2071877809, -1748049332, 1762404473, -1021318301, 252796232, -461788798, -363855828, -247731278, -124032482, 1266559768, -646718794, -328742246, -479016930, -77873569, 1240048300, 1517286301};
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this, collection}, -1968600328, 1968600329, java.lang.System.identityHashCode(this))).booleanValue();
    }

    static void init$0() {
        $$a = new byte[]{57, -61, -44, -120};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return (java.util.Iterator) writeReplace(new java.lang.Object[]{this}, -639295108, 639295108, java.lang.System.identityHashCode(this));
    }
}

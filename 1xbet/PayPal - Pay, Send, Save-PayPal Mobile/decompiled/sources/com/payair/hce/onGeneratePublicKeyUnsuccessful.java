package com.payair.hce;

/* loaded from: classes4.dex */
public final class onGeneratePublicKeyUnsuccessful {
    private static int DigitizedCardProfile = 1;
    private static int writeReplace;
    private java.util.concurrent.atomic.AtomicBoolean valueOf;
    private final java.util.concurrent.CopyOnWriteArrayList<com.payair.hce.registerPayair> values;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = ~(i5 | i2);
        int i7 = ~i;
        return ((((i * (-515)) + (i2 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CERTIFICATE)) + ((((~(i | i5)) | (~(i4 | i3))) | i6) * (-516))) + (((~((i4 | i7) | i3)) | (~((i7 | i5) | i2))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)) + (((~(i7 | i2)) | i6) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) != 1 ? DigitizedCardProfile(objArr) : valueOf(objArr);
    }

    public onGeneratePublicKeyUnsuccessful() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
        this.valueOf = atomicBoolean;
        atomicBoolean.set(true);
        this.values = new java.util.concurrent.CopyOnWriteArrayList<>();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.onGeneratePublicKeyUnsuccessful ongeneratepublickeyunsuccessful = (com.payair.hce.onGeneratePublicKeyUnsuccessful) objArr[0];
        DigitizedCardProfile = (writeReplace + 37) % 128;
        ongeneratepublickeyunsuccessful.valueOf.set(true);
        int i = writeReplace;
        int i2 = ((i & 92) + (i | 92)) - 1;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        r3.valueOf.set(false);
        r4 = com.payair.hce.onGeneratePublicKeyUnsuccessful.writeReplace;
        r0 = (((r4 ^ 73) | (r4 & 73)) << 1) - ((r4 & (-74)) | ((~r4) & 73));
        com.payair.hce.onGeneratePublicKeyUnsuccessful.DigitizedCardProfile = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if ((r0 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf(java.util.List<com.payair.hce.registerPayair> list) {
        synchronized (this) {
            int i = writeReplace + 119;
            DigitizedCardProfile = i % 128;
            if (i % 2 == 0) {
                this.values.clear();
                list.iterator();
                throw new java.lang.NullPointerException();
            }
            this.values.clear();
            java.util.Iterator<com.payair.hce.registerPayair> it = list.iterator();
            int i2 = DigitizedCardProfile;
            int i3 = (i2 & (-20)) | ((~i2) & 19);
            int i4 = (i2 & 19) << 1;
            writeReplace = ((i3 & i4) + (i4 | i3)) % 128;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i5 = writeReplace + 103;
                DigitizedCardProfile = i5 % 128;
                if (i5 % 2 == 0) {
                    this.values.add(it.next());
                    throw new java.lang.NullPointerException();
                }
                this.values.add(it.next());
            }
        }
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.onGeneratePublicKeyUnsuccessful ongeneratepublickeyunsuccessful = (com.payair.hce.onGeneratePublicKeyUnsuccessful) objArr[0];
        int i = writeReplace;
        int i2 = i & 7;
        int i3 = -(-((i ^ 7) | i2));
        DigitizedCardProfile = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        boolean z = ongeneratepublickeyunsuccessful.valueOf.get();
        int i4 = writeReplace;
        int i5 = (i4 & 27) + (i4 | 27);
        DigitizedCardProfile = i5 % 128;
        if (i5 % 2 != 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    public final com.payair.hce.registerPayair writeReplace(java.lang.String str) {
        synchronized (this) {
            int i = DigitizedCardProfile;
            int i2 = ((i ^ 75) | (i & 75)) << 1;
            int i3 = -((i & (-76)) | ((~i) & 75));
            int i4 = (i2 & i3) + (i3 | i2);
            writeReplace = i4 % 128;
            if (i4 % 2 != 0) {
                this.values.iterator();
                throw new java.lang.NullPointerException();
            }
            java.util.Iterator<com.payair.hce.registerPayair> it = this.values.iterator();
            int i5 = DigitizedCardProfile;
            int i6 = (i5 & (-38)) | ((~i5) & 37);
            int i7 = (i5 & 37) << 1;
            writeReplace = ((i6 & i7) + (i7 | i6)) % 128;
            while (it.hasNext()) {
                int i8 = DigitizedCardProfile;
                int i9 = i8 & 33;
                int i10 = i9 + ((i8 ^ 33) | i9);
                writeReplace = i10 % 128;
                if (i10 % 2 != 0) {
                    com.payair.hce.registerPayair next = it.next();
                    throw new java.lang.NullPointerException();
                }
                com.payair.hce.registerPayair next2 = it.next();
                if (((java.lang.String) com.payair.hce.registerPayair.values(new java.lang.Object[]{next2}, 1662831895, -1662831892, java.lang.System.identityHashCode(next2))).compareTo(str) == 0) {
                    int i11 = writeReplace;
                    int i12 = i11 & 61;
                    int i13 = (i11 ^ 61) | i12;
                    int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                    DigitizedCardProfile = i14 % 128;
                    if (i14 % 2 != 0) {
                        return next2;
                    }
                    throw null;
                }
                int i15 = writeReplace;
                int i16 = i15 & 81;
                int i17 = ((i15 ^ 81) | i16) << 1;
                int i18 = -((i15 | 81) & (~i16));
                DigitizedCardProfile = ((i17 & i18) + (i18 | i17)) % 128;
            }
            int i19 = writeReplace;
            DigitizedCardProfile = (((i19 & (-122)) | ((~i19) & 121)) + ((i19 & 121) << 1)) % 128;
            return null;
        }
    }

    public final java.util.List<com.payair.hce.registerPayair> AlternateContactlessPaymentDataJson() {
        java.util.concurrent.CopyOnWriteArrayList<com.payair.hce.registerPayair> copyOnWriteArrayList;
        synchronized (this) {
            int i = writeReplace;
            int i2 = (i & (-2)) | ((~i) & 1);
            int i3 = (i & 1) << 1;
            int i4 = (i2 & i3) + (i2 | i3);
            DigitizedCardProfile = i4 % 128;
            if (i4 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            copyOnWriteArrayList = this.values;
            int i5 = i & 75;
            int i6 = i5 + ((i ^ 75) | i5);
            DigitizedCardProfile = i6 % 128;
            if (i6 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        return copyOnWriteArrayList;
    }

    public static int a(java.lang.Object obj, int i, java.lang.Object obj2, java.lang.Object obj3) {
        try {
            java.lang.Object[] objArr = {obj, java.lang.Integer.valueOf(i), obj2, obj3};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 5088, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
            }
            return ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr)).intValue();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final boolean values() {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, 544213311, -544213311, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final void valueOf() {
        values(new java.lang.Object[]{this}, 1257172694, -1257172693, java.lang.System.identityHashCode(this));
    }
}

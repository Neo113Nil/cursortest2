package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class setDigitizedCardId {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int valueOf;
    private java.util.List<com.payair.hce.Record> values = new java.util.ArrayList();
    private java.util.List<com.payair.hce.Record> writeReplace = new java.util.ArrayList();

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = (i * 592) + (i2 * (-590)) + ((~(i4 | i2)) * (-1182)) + (((~(i | i2)) | (~(i4 | i5 | (~i3)))) * (-591)) + ((i3 | i4 | i5) * 591);
        if (i6 == 1) {
            return writeReplace(objArr);
        }
        if (i6 == 2) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i6 != 3) {
            return i6 != 4 ? valueOf(objArr) : DigitizedCardProfile(objArr);
        }
        com.payair.hce.setDigitizedCardId setdigitizedcardid = (com.payair.hce.setDigitizedCardId) objArr[0];
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[1];
        int i7 = valueOf;
        AlternateContactlessPaymentDataJson = (((i7 | 15) << 1) - ((i7 & (-16)) | ((~i7) & 15))) % 128;
        java.util.List list = (java.util.List) DigitizedCardProfile(new java.lang.Object[]{setdigitizedcardid.values, access202Var}, 625250376, -625250374, (int) java.lang.System.currentTimeMillis());
        int i8 = valueOf;
        AlternateContactlessPaymentDataJson = (((i8 | 43) << 1) - (i8 ^ 43)) % 128;
        return list;
    }

    setDigitizedCardId() {
        this.writeReplace.add(new com.payair.hce.getCardId());
        this.writeReplace.add(new com.payair.hce.IccPrivateKeyCrtComponents());
        this.writeReplace.add(new com.payair.hce.setBusinessLogicModule());
        this.writeReplace.add(new com.payair.hce.setQ());
        this.writeReplace.add(new com.payair.hce.setDp());
        this.writeReplace.add(new com.payair.hce.setP());
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setDigitizedCardId setdigitizedcardid = (com.payair.hce.setDigitizedCardId) objArr[0];
        com.payair.hce.Record record = (com.payair.hce.Record) objArr[1];
        int i = AlternateContactlessPaymentDataJson + 125;
        valueOf = i % 128;
        if (i % 2 == 0) {
            setdigitizedcardid.values.add(record);
            return null;
        }
        setdigitizedcardid.values.add(record);
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setDigitizedCardId setdigitizedcardid = (com.payair.hce.setDigitizedCardId) objArr[0];
        com.payair.hce.Record record = (com.payair.hce.Record) objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        valueOf = (((i & 70) + (i | 70)) - 1) % 128;
        setdigitizedcardid.writeReplace.add(record);
        int i2 = valueOf;
        int i3 = (((i2 | 113) << 1) - (~(-(i2 ^ 113)))) - 1;
        AlternateContactlessPaymentDataJson = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setDigitizedCardId setdigitizedcardid = (com.payair.hce.setDigitizedCardId) objArr[0];
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[1];
        int i = valueOf;
        int i2 = ((i | 119) << 1) - (i ^ 119);
        AlternateContactlessPaymentDataJson = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object[] objArr2 = {setdigitizedcardid.writeReplace, access202Var};
        if (i3 != 0) {
            return (java.util.List) DigitizedCardProfile(objArr2, 625250376, -625250374, (int) java.lang.System.currentTimeMillis());
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.util.List list = (java.util.List) objArr[0];
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[1];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        int i = valueOf;
        int i2 = (i & (-92)) | ((~i) & 91);
        int i3 = (i & 91) << 1;
        AlternateContactlessPaymentDataJson = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        while (it.hasNext()) {
            int i4 = valueOf;
            int i5 = i4 & 51;
            int i6 = i4 | 51;
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            AlternateContactlessPaymentDataJson = i7 % 128;
            if (i7 % 2 == 0) {
                ((com.payair.hce.Record) it.next()).valueOf(access202Var).iterator();
                throw new java.lang.ArithmeticException();
            }
            java.util.Iterator<com.payair.hce.resetAuthenticationReferences> it2 = ((com.payair.hce.Record) it.next()).valueOf(access202Var).iterator();
            while (it2.hasNext()) {
                int i8 = AlternateContactlessPaymentDataJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                valueOf = i8 % 128;
                if (i8 % 2 != 0) {
                    arrayList.contains(it2.next());
                    throw new java.lang.ArithmeticException();
                }
                com.payair.hce.resetAuthenticationReferences next = it2.next();
                if (!arrayList.contains(next)) {
                    int i9 = AlternateContactlessPaymentDataJson;
                    int i10 = (((i9 | 10) << 1) - (i9 ^ 10)) - 1;
                    valueOf = i10 % 128;
                    if (i10 % 2 != 0) {
                        arrayList.add(next);
                        throw null;
                    }
                    arrayList.add(next);
                }
                int i11 = AlternateContactlessPaymentDataJson;
                int i12 = i11 & 73;
                valueOf = (i12 + ((i11 ^ 73) | i12)) % 128;
            }
            int i13 = valueOf;
            AlternateContactlessPaymentDataJson = ((i13 & 109) + (i13 | 109)) % 128;
        }
        int i14 = AlternateContactlessPaymentDataJson;
        int i15 = i14 & 45;
        int i16 = ((i14 | 45) & (~i15)) + (i15 << 1);
        valueOf = i16 % 128;
        if (i16 % 2 == 0) {
            return arrayList;
        }
        throw new java.lang.ArithmeticException();
    }

    private static java.util.List<com.payair.hce.resetAuthenticationReferences> valueOf(java.util.List<com.payair.hce.Record> list, com.payair.hce.access202 access202Var) throws com.payair.hce.getAtcCount {
        return (java.util.List) DigitizedCardProfile(new java.lang.Object[]{list, access202Var}, 625250376, -625250374, (int) java.lang.System.currentTimeMillis());
    }

    public final java.util.List<com.payair.hce.resetAuthenticationReferences> valueOf(com.payair.hce.access202 access202Var) throws com.payair.hce.getAtcCount {
        return (java.util.List) DigitizedCardProfile(new java.lang.Object[]{this, access202Var}, -376858347, 376858351, java.lang.System.identityHashCode(this));
    }

    public final java.util.List<com.payair.hce.resetAuthenticationReferences> DigitizedCardProfile(com.payair.hce.access202 access202Var) throws com.payair.hce.getAtcCount {
        return (java.util.List) DigitizedCardProfile(new java.lang.Object[]{this, access202Var}, -691510, 691513, java.lang.System.identityHashCode(this));
    }

    final void valueOf(com.payair.hce.Record record) {
        DigitizedCardProfile(new java.lang.Object[]{this, record}, 2060983491, -2060983491, java.lang.System.identityHashCode(this));
    }

    final void writeReplace(com.payair.hce.Record record) {
        DigitizedCardProfile(new java.lang.Object[]{this, record}, 542669273, -542669272, java.lang.System.identityHashCode(this));
    }
}

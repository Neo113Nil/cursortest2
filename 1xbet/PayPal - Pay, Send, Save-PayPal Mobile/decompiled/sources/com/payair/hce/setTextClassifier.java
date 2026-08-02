package com.payair.hce;

/* loaded from: classes10.dex */
public final class setTextClassifier extends com.payair.hce.getMagstripeCvmIssuerOptions<java.util.List<? extends java.lang.String>> {
    private static int valueOf = 1;
    private static int values;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = i4 | i2;
        int i6 = ~i3;
        int i7 = (i * 755) + (i2 * (-753)) + (((~i5) | (~(i4 | i3)) | (~(i2 | i3))) * (-754)) + (((~(i | i6 | i2)) | (~(i5 | i3))) * (-754)) + ((i4 | i6) * 754);
        if (i7 == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i7 == 2) {
            return writeReplace(objArr);
        }
        if (i7 == 3) {
            return DigitizedCardProfile(objArr);
        }
        com.payair.hce.getRemotePaymentData getremotepaymentdata = (com.payair.hce.getRemotePaymentData) objArr[0];
        java.util.List list = (java.util.List) objArr[1];
        int i8 = valueOf;
        int i9 = (i8 + 77) % 128;
        values = i9;
        if (getremotepaymentdata == null) {
            values = ((i8 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i8 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
            return null;
        }
        valueOf = ((i9 ^ 47) + ((i9 & 47) << 1)) % 128;
        getremotepaymentdata.AlternateContactlessPaymentDataJson(java.lang.String.valueOf(list));
        int i10 = values;
        valueOf = (((i10 & 24) + (i10 | 24)) - 1) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication = (com.payair.hce.getAckAutomaticallyResetByApplication) objArr[1];
        int i = valueOf + 41;
        values = i % 128;
        java.lang.Object[] objArr2 = {getackautomaticallyresetbyapplication};
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        java.util.List list = (java.util.List) valueOf(objArr2, 669163458, -669163455, (int) currentTimeMillis);
        int i2 = valueOf;
        int i3 = i2 & 107;
        values = ((((i2 | 107) & (~i3)) - (~(i3 << 1))) - 1) % 128;
        return list;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.getRemotePaymentData getremotepaymentdata = (com.payair.hce.getRemotePaymentData) objArr[1];
        java.lang.Object obj = objArr[2];
        int i = values + 82;
        int i2 = (~i) + (i << 1);
        valueOf = i2 % 128;
        java.lang.Object[] objArr2 = {getremotepaymentdata, (java.util.List) obj};
        if (i2 % 2 == 0) {
            valueOf(objArr2, 1901119988, -1901119988, (int) java.lang.System.currentTimeMillis());
            throw null;
        }
        valueOf(objArr2, 1901119988, -1901119988, (int) java.lang.System.currentTimeMillis());
        int i3 = valueOf;
        int i4 = i3 & 83;
        int i5 = -(-((i3 ^ 83) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        values = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.getAid writeReplace = com.payair.hce.getCardLayoutDescription.AlternateContactlessPaymentDataJson((com.payair.hce.getAckAutomaticallyResetByApplication) objArr[0]).writeReplace();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(writeReplace, "");
        com.payair.hce.getAid getaid = writeReplace;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(getaid, 10));
        java.util.Iterator<com.payair.hce.getCiacDecline> it = getaid.iterator();
        values = (valueOf + 65) % 128;
        while (it.hasNext()) {
            int i = values;
            int i2 = (i & (-52)) | ((~i) & 51);
            int i3 = (i & 51) << 1;
            int i4 = (i2 & i3) + (i3 | i2);
            valueOf = i4 % 128;
            if (i4 % 2 == 0) {
                arrayList.add(it.next().toString());
                throw new java.lang.ArithmeticException();
            }
            arrayList.add(it.next().toString());
            int i5 = valueOf;
            int i6 = i5 & 45;
            int i7 = (i5 | 45) & (~i6);
            int i8 = i6 << 1;
            values = ((i7 ^ i8) + ((i7 & i8) << 1)) % 128;
        }
        java.util.ArrayList arrayList2 = arrayList;
        int i9 = valueOf;
        int i10 = ((i9 & (-34)) | ((~i9) & 33)) + ((i9 & 33) << 1);
        values = i10 % 128;
        if (i10 % 2 == 0) {
            return arrayList2;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final /* synthetic */ java.util.List<? extends java.lang.String> AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) {
        ?? valueOf2 = valueOf(new java.lang.Object[]{this, getackautomaticallyresetbyapplication}, 6565992, -6565991, java.lang.System.identityHashCode(this));
        return valueOf2;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final /* synthetic */ void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.util.List<? extends java.lang.String> list) {
        valueOf(new java.lang.Object[]{this, getremotepaymentdata, list}, 1139992259, -1139992257, java.lang.System.identityHashCode(this));
    }

    private static java.util.List<java.lang.String> valueOf(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) {
        return (java.util.List) valueOf(new java.lang.Object[]{getackautomaticallyresetbyapplication}, 669163458, -669163455, (int) java.lang.System.currentTimeMillis());
    }

    private static void valueOf(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.util.List<java.lang.String> list) {
        valueOf(new java.lang.Object[]{getremotepaymentdata, list}, 1901119988, -1901119988, (int) java.lang.System.currentTimeMillis());
    }
}

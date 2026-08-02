package com.payair.hce;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/payair/hce/setSelected;", "Lcom/payair/hce/communication/JsonResponse;", "", "Lcom/payair/hce/setMinimumWidth;", "p0", "<init>", "(Ljava/util/List;)V", "DigitizedCardProfile", "()Ljava/util/List;", "AlternateContactlessPaymentDataJson", "(Ljava/util/List;)Lcom/payair/hce/setSelected;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "writeReplace", "Ljava/util/List;", "values"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class setSelected extends com.payair.hce.communication.JsonResponse {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;

    /* renamed from: writeReplace, reason: from kotlin metadata */
    private final java.util.List<com.payair.hce.setMinimumWidth> DigitizedCardProfile;

    public /* synthetic */ setSelected(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setSelected setselected = (com.payair.hce.setSelected) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = ((i ^ 87) | (i & 87)) << 1;
        int i3 = -((i & (-88)) | ((~i) & 87));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        values = i4;
        java.util.List<com.payair.hce.setMinimumWidth> list = setselected.DigitizedCardProfile;
        int i5 = i4 ^ 21;
        int i6 = ((((i4 & 21) | i5) << 1) - (~(-i5))) - 1;
        DigitizedCardProfile = i6 % 128;
        if (i6 % 2 == 0) {
            return list;
        }
        throw new java.lang.ArithmeticException();
    }

    public setSelected(java.util.List<com.payair.hce.setMinimumWidth> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.DigitizedCardProfile = list;
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = ~i2;
        int i6 = ~(i | i5);
        int i7 = (i * (-523)) + (i2 * 263) + ((i4 | i6 | (~(i5 | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + (i6 * (-786)) + (((~((~i3) | i5)) | i4 | i6) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
        if (i7 == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i7 == 2) {
            return DigitizedCardProfile(objArr);
        }
        if (i7 == 3) {
            return values(objArr);
        }
        if (i7 == 4) {
            return valueOf(objArr);
        }
        if (i7 == 5) {
            return writeReplace(objArr);
        }
        java.util.List list = (java.util.List) objArr[1];
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        com.payair.hce.setSelected setselected = new com.payair.hce.setSelected(list);
        int i8 = DigitizedCardProfile;
        values = ((((i8 | 40) << 1) - (i8 ^ 40)) - 1) % 128;
        return setselected;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setSelected setselected = (com.payair.hce.setSelected) objArr[0];
        java.util.List<com.payair.hce.setMinimumWidth> list = (java.util.List) objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        java.lang.Object obj = objArr[3];
        int i = DigitizedCardProfile;
        int i2 = ((i ^ 87) | (i & 87)) << 1;
        int i3 = -((i & (-88)) | ((~i) & 87));
        values = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
        if ((intValue & 1) != 0) {
            int i4 = i & 79;
            int i5 = -(-((i ^ 79) | i4));
            values = (((i4 | i5) << 1) - (i4 ^ i5)) % 128;
            list = setselected.DigitizedCardProfile;
            values = ((i ^ 121) + ((i & 121) << 1)) % 128;
        }
        com.payair.hce.setSelected setselected2 = (com.payair.hce.setSelected) valueOf(new java.lang.Object[]{setselected, list}, -1480665876, 1480665876, java.lang.System.identityHashCode(setselected));
        int i6 = DigitizedCardProfile;
        int i7 = ((((i6 ^ 45) | (i6 & 45)) << 1) - (~(-((i6 & (-46)) | ((~i6) & 45))))) - 1;
        values = i7 % 128;
        if (i7 % 2 != 0) {
            return setselected2;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setSelected setselected = (com.payair.hce.setSelected) objArr[0];
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.lang.Object obj = objArr[1];
        int i = values;
        int i2 = i ^ 91;
        int i3 = -(-((i & 91) << 1));
        DigitizedCardProfile = ((i2 & i3) + (i2 | i3)) % 128;
        if (setselected == obj) {
            int i4 = (i + 119) % 128;
            DigitizedCardProfile = i4;
            int i5 = (((i4 | 14) << 1) - (i4 ^ 14)) - 1;
            values = i5 % 128;
            if (i5 % 2 != 0) {
                return bool2;
            }
            throw null;
        }
        if (!(obj instanceof com.payair.hce.setSelected)) {
            int i6 = ((((i & (-46)) | ((~i) & 45)) - (~((i & 45) << 1))) - 1) % 128;
            DigitizedCardProfile = i6;
            int i7 = ((i6 ^ 97) | (i6 & 97)) << 1;
            int i8 = -((i6 & (-98)) | ((~i6) & 97));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            values = i9 % 128;
            if (i9 % 2 != 0) {
                return bool;
            }
            throw null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(setselected.DigitizedCardProfile, ((com.payair.hce.setSelected) obj).DigitizedCardProfile)) {
            int i10 = (-2) - (~(DigitizedCardProfile + 70));
            values = i10 % 128;
            if (i10 % 2 != 0) {
                return bool2;
            }
            throw null;
        }
        int i11 = DigitizedCardProfile;
        values = (i11 + 111) % 128;
        int i12 = i11 & 33;
        int i13 = (i12 - (~(-(-((i11 ^ 33) | i12))))) - 1;
        values = i13 % 128;
        if (i13 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int hashCode = ((com.payair.hce.setSelected) objArr[0]).DigitizedCardProfile.hashCode();
        int i = values;
        int i2 = i ^ 13;
        int i3 = ((((i & 13) | i2) << 1) - (~(-i2))) - 1;
        DigitizedCardProfile = i3 % 128;
        if (i3 % 2 == 0) {
            return java.lang.Integer.valueOf(hashCode);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setSelected setselected = (com.payair.hce.setSelected) objArr[0];
        int i = values;
        int i2 = i ^ 33;
        int i3 = ((i & 33) | i2) << 1;
        int i4 = -i2;
        int i5 = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        DigitizedCardProfile = i5;
        java.util.List<com.payair.hce.setMinimumWidth> list = setselected.DigitizedCardProfile;
        int i6 = (i5 & (-6)) | ((~i5) & 5);
        int i7 = (i5 & 5) << 1;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        values = i8 % 128;
        if (i8 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setSelected() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(java.lang.Object p0) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, p0}, 525577962, -525577958, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, -1970726671, 1970726674, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final java.lang.String toString() {
        int i = values;
        DigitizedCardProfile = ((i ^ 7) + ((i & 7) << 1)) % 128;
        java.util.List<com.payair.hce.setMinimumWidth> list = this.DigitizedCardProfile;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RetrieveConfigurationVtsPkCertResponse(visaCertificateList=");
        sb.append(list);
        sb.append(")");
        java.lang.String obj = sb.toString();
        int i2 = values + 67;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    public static /* synthetic */ com.payair.hce.setSelected AlternateContactlessPaymentDataJson$default(com.payair.hce.setSelected setselected, java.util.List list, int i, java.lang.Object obj) {
        return (com.payair.hce.setSelected) valueOf(new java.lang.Object[]{setselected, list, java.lang.Integer.valueOf(i), obj}, -1286128269, 1286128274, i);
    }

    public final com.payair.hce.setSelected AlternateContactlessPaymentDataJson(java.util.List<com.payair.hce.setMinimumWidth> p0) {
        return (com.payair.hce.setSelected) valueOf(new java.lang.Object[]{this, p0}, -1480665876, 1480665876, java.lang.System.identityHashCode(this));
    }

    public final java.util.List<com.payair.hce.setMinimumWidth> DigitizedCardProfile() {
        return (java.util.List) valueOf(new java.lang.Object[]{this}, 1743629809, -1743629808, java.lang.System.identityHashCode(this));
    }

    public final java.util.List<com.payair.hce.setMinimumWidth> values() {
        return (java.util.List) valueOf(new java.lang.Object[]{this}, -1705615549, 1705615551, java.lang.System.identityHashCode(this));
    }
}

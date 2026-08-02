package com.payair.hce.visa.tokenization;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/payair/hce/visa/tokenization/ExpirationDate;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/payair/hce/visa/tokenization/ExpirationDate;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "month", "Ljava/lang/String;", "getMonth", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "getYear"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ExpirationDate {
    private static int DigitizedCardProfile = 1;
    private static int valueOf;
    private final java.lang.String month;
    private final java.lang.String year;

    public ExpirationDate(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.month = str;
        this.year = str2;
    }

    public final java.lang.String getMonth() {
        int i = (valueOf + 65) % 128;
        DigitizedCardProfile = i;
        java.lang.String str = this.month;
        int i2 = i & 13;
        int i3 = (i | 13) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        valueOf = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String getYear() {
        int i = valueOf;
        int i2 = ((i ^ 107) + ((i & 107) << 1)) % 128;
        DigitizedCardProfile = i2;
        java.lang.String str = this.year;
        int i3 = (i2 & 70) + (i2 | 70);
        int i4 = (~i3) + (i3 << 1);
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(java.lang.Object p0) {
        int i = valueOf;
        int i2 = ((((i & (-124)) | ((~i) & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) - (~(-(-((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1))))) - 1) % 128;
        DigitizedCardProfile = i2;
        if (this == p0) {
            int i3 = i & 21;
            int i4 = i | 21;
            DigitizedCardProfile = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
            int i5 = i & 101;
            int i6 = -(-((i ^ 101) | i5));
            int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
            DigitizedCardProfile = i7 % 128;
            if (i7 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(p0 instanceof com.payair.hce.visa.tokenization.ExpirationDate)) {
            int i8 = i2 & 53;
            valueOf = (i8 + ((i2 ^ 53) | i8)) % 128;
            valueOf = (i2 + 35) % 128;
            return false;
        }
        com.payair.hce.visa.tokenization.ExpirationDate expirationDate = (com.payair.hce.visa.tokenization.ExpirationDate) p0;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.month, expirationDate.month)) {
            int i9 = DigitizedCardProfile;
            int i10 = (((i9 | 6) << 1) - (i9 ^ 6)) - 1;
            valueOf = i10 % 128;
            boolean z = i10 % 2 != 0;
            int i11 = i9 & 63;
            int i12 = i9 | 63;
            valueOf = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
            return z;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.year, expirationDate.year)) {
            int i13 = DigitizedCardProfile;
            valueOf = ((-2) - (~((i13 ^ 8) + ((i13 & 8) << 1)))) % 128;
            return false;
        }
        int i14 = DigitizedCardProfile;
        int i15 = ((i14 ^ 64) + ((i14 & 64) << 1)) - 1;
        valueOf = i15 % 128;
        if (i15 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = DigitizedCardProfile;
        int i3 = i2 & 19;
        int i4 = (((i2 | 19) & (~i3)) - (~(i3 << 1))) - 1;
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            int hashCode = this.month.hashCode() >> 73;
            int i5 = -this.year.hashCode();
            int i6 = ((hashCode ^ i5) | (hashCode & i5)) << 1;
            int i7 = -((hashCode & (~i5)) | ((~hashCode) & i5));
            i = (i6 & i7) + (i7 | i6);
        } else {
            int hashCode2 = this.month.hashCode() * 31;
            int hashCode3 = this.year.hashCode();
            i = ((hashCode2 | hashCode3) << 1) - (hashCode2 ^ hashCode3);
        }
        int i8 = DigitizedCardProfile;
        int i9 = (i8 | 49) << 1;
        int i10 = -(i8 ^ 49);
        valueOf = ((i9 & i10) + (i10 | i9)) % 128;
        return i;
    }

    public final java.lang.String toString() {
        int i = valueOf;
        int i2 = i & 11;
        int i3 = i | 11;
        DigitizedCardProfile = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        java.lang.String str = this.month;
        java.lang.String str2 = this.year;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExpirationDate(month=");
        sb.append(str);
        sb.append(", year=");
        sb.append(str2);
        sb.append(")");
        java.lang.String obj = sb.toString();
        int i4 = valueOf;
        int i5 = ((i4 | 43) << 1) - (i4 ^ 43);
        DigitizedCardProfile = i5 % 128;
        if (i5 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    public static /* synthetic */ com.payair.hce.visa.tokenization.ExpirationDate copy$default(com.payair.hce.visa.tokenization.ExpirationDate expirationDate, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        int i2 = DigitizedCardProfile;
        int i3 = ((i2 | 65) << 1) - (i2 ^ 65);
        valueOf = i3 % 128;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = expirationDate.month;
            valueOf = (i2 + 107) % 128;
        }
        if ((i & 2) != 0) {
            int i4 = i2 & 45;
            valueOf = (((i2 & (-46)) | ((~i2) & 45)) + (i4 << 1)) % 128;
            str2 = expirationDate.year;
            valueOf = (i4 + (i2 | 45)) % 128;
        }
        com.payair.hce.visa.tokenization.ExpirationDate copy = expirationDate.copy(str, str2);
        int i5 = DigitizedCardProfile;
        int i6 = (i5 ^ 43) + ((i5 & 43) << 1);
        valueOf = i6 % 128;
        if (i6 % 2 == 0) {
            return copy;
        }
        throw null;
    }

    public final com.payair.hce.visa.tokenization.ExpirationDate copy(java.lang.String p0, java.lang.String p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        com.payair.hce.visa.tokenization.ExpirationDate expirationDate = new com.payair.hce.visa.tokenization.ExpirationDate(p0, p1);
        int i = valueOf + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            return expirationDate;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String component2() {
        int i = DigitizedCardProfile;
        int i2 = i | 91;
        int i3 = ((i2 << 1) - ((~(i & 91)) & i2)) % 128;
        valueOf = i3;
        java.lang.String str = this.year;
        int i4 = (i3 & (-58)) | ((~i3) & 57);
        int i5 = (i3 & 57) << 1;
        DigitizedCardProfile = (((i4 | i5) << 1) - (i4 ^ i5)) % 128;
        return str;
    }

    public final java.lang.String component1() {
        int i = DigitizedCardProfile + 24;
        int i2 = (~i) + (i << 1);
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return this.month;
        }
        throw null;
    }
}

package com.izettle.android.auth.dto;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/izettle/android/auth/dto/RevisitDto;", "", "", "transactionConfigHash", "productLibraryHash", "userInfoHash", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/izettle/android/auth/dto/RevisitDto;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getProductLibraryHash", "getTransactionConfigHash", "getUserInfoHash"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RevisitDto {
    private final java.lang.String productLibraryHash;
    private final java.lang.String transactionConfigHash;
    private final java.lang.String userInfoHash;

    public RevisitDto(@com.izettle.android.serialization.annotations.JsonDeserialize("TRANSACTION_CONFIG_HASH") java.lang.String str, @com.izettle.android.serialization.annotations.JsonDeserialize("PRODUCT_LIBRARY_HASH") java.lang.String str2, @com.izettle.android.serialization.annotations.JsonDeserialize("USER_INFO_HASH") java.lang.String str3) {
        this.transactionConfigHash = str;
        this.productLibraryHash = str2;
        this.userInfoHash = str3;
    }

    public final java.lang.String getTransactionConfigHash() {
        return this.transactionConfigHash;
    }

    public final java.lang.String getProductLibraryHash() {
        return this.productLibraryHash;
    }

    public final java.lang.String getUserInfoHash() {
        return this.userInfoHash;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.transactionConfigHash;
        java.lang.String str2 = this.productLibraryHash;
        java.lang.String str3 = this.userInfoHash;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevisitDto(transactionConfigHash=");
        sb.append(str);
        sb.append(", productLibraryHash=");
        sb.append(str2);
        sb.append(", userInfoHash=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.transactionConfigHash;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.productLibraryHash;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.userInfoHash;
        return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.izettle.android.auth.dto.RevisitDto)) {
            return false;
        }
        com.izettle.android.auth.dto.RevisitDto revisitDto = (com.izettle.android.auth.dto.RevisitDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionConfigHash, revisitDto.transactionConfigHash) && kotlin.jvm.internal.Intrinsics.areEqual(this.productLibraryHash, revisitDto.productLibraryHash) && kotlin.jvm.internal.Intrinsics.areEqual(this.userInfoHash, revisitDto.userInfoHash);
    }

    public final com.izettle.android.auth.dto.RevisitDto copy(@com.izettle.android.serialization.annotations.JsonDeserialize("TRANSACTION_CONFIG_HASH") java.lang.String transactionConfigHash, @com.izettle.android.serialization.annotations.JsonDeserialize("PRODUCT_LIBRARY_HASH") java.lang.String productLibraryHash, @com.izettle.android.serialization.annotations.JsonDeserialize("USER_INFO_HASH") java.lang.String userInfoHash) {
        return new com.izettle.android.auth.dto.RevisitDto(transactionConfigHash, productLibraryHash, userInfoHash);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getUserInfoHash() {
        return this.userInfoHash;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getProductLibraryHash() {
        return this.productLibraryHash;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTransactionConfigHash() {
        return this.transactionConfigHash;
    }

    public static /* synthetic */ com.izettle.android.auth.dto.RevisitDto copy$default(com.izettle.android.auth.dto.RevisitDto revisitDto, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = revisitDto.transactionConfigHash;
        }
        if ((i & 2) != 0) {
            str2 = revisitDto.productLibraryHash;
        }
        if ((i & 4) != 0) {
            str3 = revisitDto.userInfoHash;
        }
        return revisitDto.copy(str, str2, str3);
    }
}

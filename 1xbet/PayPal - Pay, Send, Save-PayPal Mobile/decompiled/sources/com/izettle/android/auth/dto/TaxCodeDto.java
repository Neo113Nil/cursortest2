package com.izettle.android.auth.dto;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010"}, d2 = {"Lcom/izettle/android/auth/dto/TaxCodeDto;", "", "", "code", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "getLabel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TaxCodeDto {

    @com.izettle.android.serialization.annotations.JsonSerialize("code")
    private final java.lang.String code;

    @com.izettle.android.serialization.annotations.JsonSerialize("label")
    private final java.lang.String label;

    public TaxCodeDto(@com.izettle.android.serialization.annotations.JsonDeserialize("code") java.lang.String str, @com.izettle.android.serialization.annotations.JsonDeserialize("label") java.lang.String str2) {
        this.code = str;
        this.label = str2;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof com.izettle.android.auth.dto.TaxCodeDto)) {
            return false;
        }
        com.izettle.android.auth.dto.TaxCodeDto taxCodeDto = (com.izettle.android.auth.dto.TaxCodeDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(taxCodeDto.code, this.code) && kotlin.jvm.internal.Intrinsics.areEqual(taxCodeDto.label, this.label);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.code, this.label);
    }
}

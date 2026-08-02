package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/zettle/android/entities/TaxCodeImpl;", "Lcom/zettle/android/entities/TaxCode;", "", "code", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/zettle/android/entities/TaxCodeImpl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCode", "getLabel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class TaxCodeImpl implements com.zettle.android.entities.TaxCode {
    private final java.lang.String code;
    private final java.lang.String label;

    public TaxCodeImpl(java.lang.String str, java.lang.String str2) {
        this.code = str;
        this.label = str2;
    }

    @Override // com.zettle.android.entities.TaxCode
    public final java.lang.String getCode() {
        return this.code;
    }

    @Override // com.zettle.android.entities.TaxCode
    public final java.lang.String getLabel() {
        return this.label;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.code;
        java.lang.String str2 = this.label;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxCodeImpl(code=");
        sb.append(str);
        sb.append(", label=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.code;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.label;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.android.entities.TaxCodeImpl)) {
            return false;
        }
        com.zettle.android.entities.TaxCodeImpl taxCodeImpl = (com.zettle.android.entities.TaxCodeImpl) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.code, taxCodeImpl.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, taxCodeImpl.label);
    }

    public final com.zettle.android.entities.TaxCodeImpl copy(java.lang.String code, java.lang.String label) {
        return new com.zettle.android.entities.TaxCodeImpl(code, label);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCode() {
        return this.code;
    }

    public static /* synthetic */ com.zettle.android.entities.TaxCodeImpl copy$default(com.zettle.android.entities.TaxCodeImpl taxCodeImpl, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = taxCodeImpl.code;
        }
        if ((i & 2) != 0) {
            str2 = taxCodeImpl.label;
        }
        return taxCodeImpl.copy(str, str2);
    }
}

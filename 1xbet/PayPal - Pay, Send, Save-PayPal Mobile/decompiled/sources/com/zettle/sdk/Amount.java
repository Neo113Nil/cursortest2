package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\t"}, d2 = {"Lcom/zettle/sdk/Amount;", "Landroid/os/Parcelable;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/util/Currency;", "currency", "<init>", "(JLjava/util/Currency;)V", "component1", "()J", "component2", "()Ljava/util/Currency;", "copy", "(JLjava/util/Currency;)Lcom/zettle/sdk/Amount;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Currency;", "getCurrency", "J", "getValue"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class Amount implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.zettle.sdk.Amount> CREATOR = new com.zettle.sdk.Amount.Creator();
    private final java.util.Currency currency;
    private final long value;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Amount(long j, java.util.Currency currency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        this.value = j;
        this.currency = currency;
    }

    public final long getValue() {
        return this.value;
    }

    public final java.util.Currency getCurrency() {
        return this.currency;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.value);
        parcel.writeSerializable(this.currency);
    }

    public final java.lang.String toString() {
        long j = this.value;
        java.util.Currency currency = this.currency;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(value=");
        sb.append(j);
        sb.append(", currency=");
        sb.append(currency);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Long.hashCode(this.value) * 31) + this.currency.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.Amount)) {
            return false;
        }
        com.zettle.sdk.Amount amount = (com.zettle.sdk.Amount) other;
        return this.value == amount.value && kotlin.jvm.internal.Intrinsics.areEqual(this.currency, amount.currency);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.Amount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.Amount[] newArray(int i) {
            return new com.zettle.sdk.Amount[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.Amount createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.zettle.sdk.Amount(parcel.readLong(), (java.util.Currency) parcel.readSerializable());
        }
    }

    public final com.zettle.sdk.Amount copy(long value, java.util.Currency currency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        return new com.zettle.sdk.Amount(value, currency);
    }

    /* renamed from: component2, reason: from getter */
    public final java.util.Currency getCurrency() {
        return this.currency;
    }

    /* renamed from: component1, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public static /* synthetic */ com.zettle.sdk.Amount copy$default(com.zettle.sdk.Amount amount, long j, java.util.Currency currency, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = amount.value;
        }
        if ((i & 2) != 0) {
            currency = amount.currency;
        }
        return amount.copy(j, currency);
    }
}

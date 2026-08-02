package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\tJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\t"}, d2 = {"Lcom/zettle/sdk/CardReaderTippingPercentageOptions;", "Landroid/os/Parcelable;", "", "option1", "option2", "option3", "<init>", "(III)V", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/zettle/sdk/CardReaderTippingPercentageOptions;", "describeContents", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "maxPercentage", "", "getOptions", "(I)Ljava/util/List;", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", com.visa.cbp.getEncExpo.warmup, "getOption1", "getOption2", "getOption3"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CardReaderTippingPercentageOptions implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.zettle.sdk.CardReaderTippingPercentageOptions> CREATOR = new com.zettle.sdk.CardReaderTippingPercentageOptions.Creator();
    private final int option1;
    private final int option2;
    private final int option3;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CardReaderTippingPercentageOptions(int i, int i2, int i3) {
        this.option1 = i;
        this.option2 = i2;
        this.option3 = i3;
    }

    public final int getOption1() {
        return this.option1;
    }

    public final int getOption2() {
        return this.option2;
    }

    public final int getOption3() {
        return this.option3;
    }

    public final java.util.List<java.lang.Integer> getOptions(int maxPercentage) {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(kotlin.ranges.RangesKt.coerceIn(this.option1, 1, maxPercentage)), java.lang.Integer.valueOf(kotlin.ranges.RangesKt.coerceIn(this.option2, 1, maxPercentage)), java.lang.Integer.valueOf(kotlin.ranges.RangesKt.coerceIn(this.option3, 1, maxPercentage))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.option1);
        parcel.writeInt(this.option2);
        parcel.writeInt(this.option3);
    }

    public final java.lang.String toString() {
        int i = this.option1;
        int i2 = this.option2;
        int i3 = this.option3;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardReaderTippingPercentageOptions(option1=");
        sb.append(i);
        sb.append(", option2=");
        sb.append(i2);
        sb.append(", option3=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.option1) * 31) + java.lang.Integer.hashCode(this.option2)) * 31) + java.lang.Integer.hashCode(this.option3);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.CardReaderTippingPercentageOptions)) {
            return false;
        }
        com.zettle.sdk.CardReaderTippingPercentageOptions cardReaderTippingPercentageOptions = (com.zettle.sdk.CardReaderTippingPercentageOptions) other;
        return this.option1 == cardReaderTippingPercentageOptions.option1 && this.option2 == cardReaderTippingPercentageOptions.option2 && this.option3 == cardReaderTippingPercentageOptions.option3;
    }

    public final com.zettle.sdk.CardReaderTippingPercentageOptions copy(int option1, int option2, int option3) {
        return new com.zettle.sdk.CardReaderTippingPercentageOptions(option1, option2, option3);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.CardReaderTippingPercentageOptions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.CardReaderTippingPercentageOptions[] newArray(int i) {
            return new com.zettle.sdk.CardReaderTippingPercentageOptions[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.CardReaderTippingPercentageOptions createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.zettle.sdk.CardReaderTippingPercentageOptions(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    }

    /* renamed from: component3, reason: from getter */
    public final int getOption3() {
        return this.option3;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOption2() {
        return this.option2;
    }

    /* renamed from: component1, reason: from getter */
    public final int getOption1() {
        return this.option1;
    }

    public static /* synthetic */ com.zettle.sdk.CardReaderTippingPercentageOptions copy$default(com.zettle.sdk.CardReaderTippingPercentageOptions cardReaderTippingPercentageOptions, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = cardReaderTippingPercentageOptions.option1;
        }
        if ((i4 & 2) != 0) {
            i2 = cardReaderTippingPercentageOptions.option2;
        }
        if ((i4 & 4) != 0) {
            i3 = cardReaderTippingPercentageOptions.option3;
        }
        return cardReaderTippingPercentageOptions.copy(i, i2, i3);
    }
}

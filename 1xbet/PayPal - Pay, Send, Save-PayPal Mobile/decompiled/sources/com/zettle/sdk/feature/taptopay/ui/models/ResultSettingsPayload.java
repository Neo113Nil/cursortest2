package com.zettle.sdk.feature.taptopay.ui.models;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/ResultSettingsPayload;", "Landroid/os/Parcelable;", "Lkotlin/Pair;", "Ljava/util/Currency;", "", "minAmountAllowed", "<init>", "(Lkotlin/Pair;)V", "component1", "()Lkotlin/Pair;", "copy", "(Lkotlin/Pair;)Lcom/zettle/sdk/feature/taptopay/ui/models/ResultSettingsPayload;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lkotlin/Pair;", "getMinAmountAllowed"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ResultSettingsPayload implements android.os.Parcelable {
    public static final int $stable = 8;
    public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.ResultSettingsPayload> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.ResultSettingsPayload.Creator();
    private final kotlin.Pair<java.util.Currency, java.lang.Long> minAmountAllowed;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ResultSettingsPayload(kotlin.Pair<java.util.Currency, java.lang.Long> pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        this.minAmountAllowed = pair;
    }

    public final kotlin.Pair<java.util.Currency, java.lang.Long> getMinAmountAllowed() {
        return this.minAmountAllowed;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeSerializable(this.minAmountAllowed);
    }

    public final java.lang.String toString() {
        kotlin.Pair<java.util.Currency, java.lang.Long> pair = this.minAmountAllowed;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResultSettingsPayload(minAmountAllowed=");
        sb.append(pair);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.minAmountAllowed.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.zettle.sdk.feature.taptopay.ui.models.ResultSettingsPayload) && kotlin.jvm.internal.Intrinsics.areEqual(this.minAmountAllowed, ((com.zettle.sdk.feature.taptopay.ui.models.ResultSettingsPayload) other).minAmountAllowed);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.ResultSettingsPayload> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.ui.models.ResultSettingsPayload[] newArray(int i) {
            return new com.zettle.sdk.feature.taptopay.ui.models.ResultSettingsPayload[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.ui.models.ResultSettingsPayload createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.zettle.sdk.feature.taptopay.ui.models.ResultSettingsPayload((kotlin.Pair) parcel.readSerializable());
        }
    }

    public final com.zettle.sdk.feature.taptopay.ui.models.ResultSettingsPayload copy(kotlin.Pair<java.util.Currency, java.lang.Long> minAmountAllowed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minAmountAllowed, "");
        return new com.zettle.sdk.feature.taptopay.ui.models.ResultSettingsPayload(minAmountAllowed);
    }

    public final kotlin.Pair<java.util.Currency, java.lang.Long> component1() {
        return this.minAmountAllowed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.models.ResultSettingsPayload copy$default(com.zettle.sdk.feature.taptopay.ui.models.ResultSettingsPayload resultSettingsPayload, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pair = resultSettingsPayload.minAmountAllowed;
        }
        return resultSettingsPayload.copy(pair);
    }
}

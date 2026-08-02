package com.zettle.sdk.feature.taptopay.ui.models;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/GratuityPreference;", "Landroid/os/Parcelable;", "Fixed", "ShowScreenWithOptions", "Lcom/zettle/sdk/feature/taptopay/ui/models/GratuityPreference$Fixed;", "Lcom/zettle/sdk/feature/taptopay/ui/models/GratuityPreference$ShowScreenWithOptions;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface GratuityPreference extends android.os.Parcelable {

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/GratuityPreference$Fixed;", "Lcom/zettle/sdk/feature/taptopay/ui/models/GratuityPreference;", "", com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_GRATUTITY_AMOUNT, "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/zettle/sdk/feature/taptopay/ui/models/GratuityPreference$Fixed;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getGratuityAmount"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Fixed implements com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.Fixed> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.Fixed.Creator();
        private final long gratuityAmount;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public Fixed(long j) {
            this.gratuityAmount = j;
        }

        public final long getGratuityAmount() {
            return this.gratuityAmount;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeLong(this.gratuityAmount);
        }

        public final java.lang.String toString() {
            long j = this.gratuityAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fixed(gratuityAmount=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.gratuityAmount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.Fixed) && this.gratuityAmount == ((com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.Fixed) other).gratuityAmount;
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.Fixed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.Fixed[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.Fixed[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.Fixed createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.Fixed(parcel.readLong());
            }
        }

        public final com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.Fixed copy(long gratuityAmount) {
            return new com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.Fixed(gratuityAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final long getGratuityAmount() {
            return this.gratuityAmount;
        }

        public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.Fixed copy$default(com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.Fixed fixed, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = fixed.gratuityAmount;
            }
            return fixed.copy(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/GratuityPreference$ShowScreenWithOptions;", "Lcom/zettle/sdk/feature/taptopay/ui/models/GratuityPreference;", "", "", "percentageOptions", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/zettle/sdk/feature/taptopay/ui/models/GratuityPreference$ShowScreenWithOptions;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getPercentageOptions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ShowScreenWithOptions implements com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference {
        public static final int $stable = 8;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.ShowScreenWithOptions> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.ShowScreenWithOptions.Creator();
        private final java.util.List<java.lang.Float> percentageOptions;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public ShowScreenWithOptions(java.util.List<java.lang.Float> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.percentageOptions = list;
        }

        public final java.util.List<java.lang.Float> getPercentageOptions() {
            return this.percentageOptions;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            java.util.List<java.lang.Float> list = this.percentageOptions;
            parcel.writeInt(list.size());
            java.util.Iterator<java.lang.Float> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeFloat(it.next().floatValue());
            }
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.Float> list = this.percentageOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowScreenWithOptions(percentageOptions=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.percentageOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.ShowScreenWithOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.percentageOptions, ((com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.ShowScreenWithOptions) other).percentageOptions);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.ShowScreenWithOptions> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.ShowScreenWithOptions[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.ShowScreenWithOptions[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.ShowScreenWithOptions createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                int readInt = parcel.readInt();
                java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(java.lang.Float.valueOf(parcel.readFloat()));
                }
                return new com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.ShowScreenWithOptions(arrayList);
            }
        }

        public final com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.ShowScreenWithOptions copy(java.util.List<java.lang.Float> percentageOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percentageOptions, "");
            return new com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.ShowScreenWithOptions(percentageOptions);
        }

        public final java.util.List<java.lang.Float> component1() {
            return this.percentageOptions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.ShowScreenWithOptions copy$default(com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.ShowScreenWithOptions showScreenWithOptions, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = showScreenWithOptions.percentageOptions;
            }
            return showScreenWithOptions.copy(list);
        }
    }
}

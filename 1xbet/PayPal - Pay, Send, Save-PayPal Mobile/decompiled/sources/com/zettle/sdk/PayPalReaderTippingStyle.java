package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/zettle/sdk/PayPalReaderTippingStyle;", "Landroid/os/Parcelable;", "<init>", "()V", "CustomAmount", "Default", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "PredefinedPercentage", "SDKConfigured", "Lcom/zettle/sdk/PayPalReaderTippingStyle$CustomAmount;", "Lcom/zettle/sdk/PayPalReaderTippingStyle$Default;", "Lcom/zettle/sdk/PayPalReaderTippingStyle$None;", "Lcom/zettle/sdk/PayPalReaderTippingStyle$PredefinedPercentage;", "Lcom/zettle/sdk/PayPalReaderTippingStyle$SDKConfigured;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class PayPalReaderTippingStyle implements android.os.Parcelable {
    private PayPalReaderTippingStyle() {
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/PayPalReaderTippingStyle$None;", "Lcom/zettle/sdk/PayPalReaderTippingStyle;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class None extends com.zettle.sdk.PayPalReaderTippingStyle {
        public static final com.zettle.sdk.PayPalReaderTippingStyle.None INSTANCE = new com.zettle.sdk.PayPalReaderTippingStyle.None();
        public static final android.os.Parcelable.Creator<com.zettle.sdk.PayPalReaderTippingStyle.None> CREATOR = new com.zettle.sdk.PayPalReaderTippingStyle.None.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private None() {
            super(null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.PayPalReaderTippingStyle.None> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.PayPalReaderTippingStyle.None[] newArray(int i) {
                return new com.zettle.sdk.PayPalReaderTippingStyle.None[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.PayPalReaderTippingStyle.None createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.zettle.sdk.PayPalReaderTippingStyle.None.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/PayPalReaderTippingStyle$Default;", "Lcom/zettle/sdk/PayPalReaderTippingStyle;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Default extends com.zettle.sdk.PayPalReaderTippingStyle {
        public static final com.zettle.sdk.PayPalReaderTippingStyle.Default INSTANCE = new com.zettle.sdk.PayPalReaderTippingStyle.Default();
        public static final android.os.Parcelable.Creator<com.zettle.sdk.PayPalReaderTippingStyle.Default> CREATOR = new com.zettle.sdk.PayPalReaderTippingStyle.Default.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private Default() {
            super(null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.PayPalReaderTippingStyle.Default> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.PayPalReaderTippingStyle.Default[] newArray(int i) {
                return new com.zettle.sdk.PayPalReaderTippingStyle.Default[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.PayPalReaderTippingStyle.Default createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.zettle.sdk.PayPalReaderTippingStyle.Default.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/PayPalReaderTippingStyle$CustomAmount;", "Lcom/zettle/sdk/PayPalReaderTippingStyle;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CustomAmount extends com.zettle.sdk.PayPalReaderTippingStyle {
        public static final com.zettle.sdk.PayPalReaderTippingStyle.CustomAmount INSTANCE = new com.zettle.sdk.PayPalReaderTippingStyle.CustomAmount();
        public static final android.os.Parcelable.Creator<com.zettle.sdk.PayPalReaderTippingStyle.CustomAmount> CREATOR = new com.zettle.sdk.PayPalReaderTippingStyle.CustomAmount.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private CustomAmount() {
            super(null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.PayPalReaderTippingStyle.CustomAmount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.PayPalReaderTippingStyle.CustomAmount[] newArray(int i) {
                return new com.zettle.sdk.PayPalReaderTippingStyle.CustomAmount[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.PayPalReaderTippingStyle.CustomAmount createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.zettle.sdk.PayPalReaderTippingStyle.CustomAmount.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PayPalReaderTippingStyle$PredefinedPercentage;", "Lcom/zettle/sdk/PayPalReaderTippingStyle;", "Lcom/zettle/sdk/CardReaderTippingPercentageOptions;", "options", "<init>", "(Lcom/zettle/sdk/CardReaderTippingPercentageOptions;)V", "component1", "()Lcom/zettle/sdk/CardReaderTippingPercentageOptions;", "copy", "(Lcom/zettle/sdk/CardReaderTippingPercentageOptions;)Lcom/zettle/sdk/PayPalReaderTippingStyle$PredefinedPercentage;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/zettle/sdk/CardReaderTippingPercentageOptions;", "getOptions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PredefinedPercentage extends com.zettle.sdk.PayPalReaderTippingStyle {
        public static final android.os.Parcelable.Creator<com.zettle.sdk.PayPalReaderTippingStyle.PredefinedPercentage> CREATOR = new com.zettle.sdk.PayPalReaderTippingStyle.PredefinedPercentage.Creator();
        private final com.zettle.sdk.CardReaderTippingPercentageOptions options;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public PredefinedPercentage(com.zettle.sdk.CardReaderTippingPercentageOptions cardReaderTippingPercentageOptions) {
            super(null);
            this.options = cardReaderTippingPercentageOptions;
        }

        public /* synthetic */ PredefinedPercentage(com.zettle.sdk.CardReaderTippingPercentageOptions cardReaderTippingPercentageOptions, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cardReaderTippingPercentageOptions);
        }

        public final com.zettle.sdk.CardReaderTippingPercentageOptions getOptions() {
            return this.options;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            com.zettle.sdk.CardReaderTippingPercentageOptions cardReaderTippingPercentageOptions = this.options;
            if (cardReaderTippingPercentageOptions == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                cardReaderTippingPercentageOptions.writeToParcel(parcel, flags);
            }
        }

        public final java.lang.String toString() {
            com.zettle.sdk.CardReaderTippingPercentageOptions cardReaderTippingPercentageOptions = this.options;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PredefinedPercentage(options=");
            sb.append(cardReaderTippingPercentageOptions);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.zettle.sdk.CardReaderTippingPercentageOptions cardReaderTippingPercentageOptions = this.options;
            if (cardReaderTippingPercentageOptions == null) {
                return 0;
            }
            return cardReaderTippingPercentageOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.PayPalReaderTippingStyle.PredefinedPercentage) && kotlin.jvm.internal.Intrinsics.areEqual(this.options, ((com.zettle.sdk.PayPalReaderTippingStyle.PredefinedPercentage) other).options);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.PayPalReaderTippingStyle.PredefinedPercentage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.PayPalReaderTippingStyle.PredefinedPercentage[] newArray(int i) {
                return new com.zettle.sdk.PayPalReaderTippingStyle.PredefinedPercentage[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.PayPalReaderTippingStyle.PredefinedPercentage createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.PayPalReaderTippingStyle.PredefinedPercentage(parcel.readInt() == 0 ? null : com.zettle.sdk.CardReaderTippingPercentageOptions.CREATOR.createFromParcel(parcel));
            }
        }

        public final com.zettle.sdk.PayPalReaderTippingStyle.PredefinedPercentage copy(com.zettle.sdk.CardReaderTippingPercentageOptions options) {
            return new com.zettle.sdk.PayPalReaderTippingStyle.PredefinedPercentage(options);
        }

        /* renamed from: component1, reason: from getter */
        public final com.zettle.sdk.CardReaderTippingPercentageOptions getOptions() {
            return this.options;
        }

        public static /* synthetic */ com.zettle.sdk.PayPalReaderTippingStyle.PredefinedPercentage copy$default(com.zettle.sdk.PayPalReaderTippingStyle.PredefinedPercentage predefinedPercentage, com.zettle.sdk.CardReaderTippingPercentageOptions cardReaderTippingPercentageOptions, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardReaderTippingPercentageOptions = predefinedPercentage.options;
            }
            return predefinedPercentage.copy(cardReaderTippingPercentageOptions);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PredefinedPercentage() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/PayPalReaderTippingStyle$SDKConfigured;", "Lcom/zettle/sdk/PayPalReaderTippingStyle;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SDKConfigured extends com.zettle.sdk.PayPalReaderTippingStyle {
        public static final com.zettle.sdk.PayPalReaderTippingStyle.SDKConfigured INSTANCE = new com.zettle.sdk.PayPalReaderTippingStyle.SDKConfigured();
        public static final android.os.Parcelable.Creator<com.zettle.sdk.PayPalReaderTippingStyle.SDKConfigured> CREATOR = new com.zettle.sdk.PayPalReaderTippingStyle.SDKConfigured.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private SDKConfigured() {
            super(null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.PayPalReaderTippingStyle.SDKConfigured> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.PayPalReaderTippingStyle.SDKConfigured[] newArray(int i) {
                return new com.zettle.sdk.PayPalReaderTippingStyle.SDKConfigured[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.PayPalReaderTippingStyle.SDKConfigured createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.zettle.sdk.PayPalReaderTippingStyle.SDKConfigured.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ PayPalReaderTippingStyle(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

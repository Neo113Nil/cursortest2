package com.zettle.sdk.feature.taptopay.ui.models;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB!\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentProperties;", "Landroid/os/Parcelable;", "", "p0", "Lcom/zettle/sdk/feature/taptopay/ui/models/GratuityPreference;", "p1", "<init>", "(Ljava/lang/String;Lcom/zettle/sdk/feature/taptopay/ui/models/GratuityPreference;)V", "", "describeContents", "()I", "Lkotlin/Result;", "", "validate-d1pmJ48", "()Ljava/lang/Object;", "validate", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "gratuityPreference", "Lcom/zettle/sdk/feature/taptopay/ui/models/GratuityPreference;", "getGratuityPreference", "()Lcom/zettle/sdk/feature/taptopay/ui/models/GratuityPreference;", "payeePricingTierId", "Ljava/lang/String;", "getPayeePricingTierId", "()Ljava/lang/String;", "Companion", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TapToPayPaymentProperties implements android.os.Parcelable {
    private final com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference gratuityPreference;
    private final java.lang.String payeePricingTierId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties.Companion INSTANCE = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties.Companion(null);
    public static final int $stable = 8;
    public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties.Creator();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private TapToPayPaymentProperties(java.lang.String str, com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference gratuityPreference) {
        this.payeePricingTierId = str;
        this.gratuityPreference = gratuityPreference;
    }

    /* synthetic */ TapToPayPaymentProperties(java.lang.String str, com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference gratuityPreference, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : gratuityPreference);
    }

    public final java.lang.String getPayeePricingTierId() {
        return this.payeePricingTierId;
    }

    public final com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference getGratuityPreference() {
        return this.gratuityPreference;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentProperties$Builder;", "", "<init>", "()V", "Lcom/zettle/sdk/feature/taptopay/ui/models/GratuityPreference;", "gratuityPreference", "addGratuityPreference", "(Lcom/zettle/sdk/feature/taptopay/ui/models/GratuityPreference;)Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentProperties$Builder;", "", "id", "addPayeePricingTierId", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentProperties$Builder;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentProperties;", "build", "()Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentProperties;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/feature/taptopay/ui/models/GratuityPreference;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private java.lang.String Camera2StreamConfigurationMap;

        public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties.Builder addPayeePricingTierId(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            this.Camera2StreamConfigurationMap = id;
            return this;
        }

        public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties.Builder addGratuityPreference(com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference gratuityPreference) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gratuityPreference, "");
            this.getHighResolutionOutputSizeshNQ4ISI = gratuityPreference;
            return this;
        }

        public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties build() {
            return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, null);
        }
    }

    /* renamed from: validate-d1pmJ48, reason: not valid java name */
    public final java.lang.Object m23172validated1pmJ48() {
        com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference gratuityPreference = this.gratuityPreference;
        if ((gratuityPreference instanceof com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.Fixed) || gratuityPreference == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
        }
        if (!(gratuityPreference instanceof com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.ShowScreenWithOptions)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.List<java.lang.Float> percentageOptions = ((com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.ShowScreenWithOptions) gratuityPreference).getPercentageOptions();
        if (!percentageOptions.isEmpty() && percentageOptions.size() != 3) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalArgumentException("If percentage options are provided for the tipping screen, there must be exactly 3 options.")));
        }
        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
        return kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentProperties$Companion;", "", "<init>", "()V", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentProperties;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "()Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentProperties;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: default, reason: not valid java name */
        public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties m23173default() {
            return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties[] newArray(int i) {
            return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties(parcel.readString(), (com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference) parcel.readParcelable(com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties.class.getClassLoader()), null);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.payeePricingTierId);
        parcel.writeParcelable(this.gratuityPreference, flags);
    }

    public /* synthetic */ TapToPayPaymentProperties(java.lang.String str, com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference gratuityPreference, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, gratuityPreference);
    }
}

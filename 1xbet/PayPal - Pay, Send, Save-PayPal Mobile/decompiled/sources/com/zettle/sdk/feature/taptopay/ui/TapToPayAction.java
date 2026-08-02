package com.zettle.sdk.feature.taptopay.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \t2\u00020\u0001:\u0005\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction;", "Lcom/zettle/sdk/features/Action;", "<init>", "()V", "", "featureId", "Ljava/lang/String;", "getFeatureId", "()Ljava/lang/String;", "Companion", "Payment", "Refund", "Settings", "Transaction", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction$Payment;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction$Refund;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction$Settings;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction$Transaction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class TapToPayAction implements com.zettle.sdk.features.Action {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Companion INSTANCE = new com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Companion(null);
    private final java.lang.String featureId;

    private TapToPayAction() {
        this.featureId = "TapToPay";
    }

    @Override // com.zettle.sdk.features.Action
    /* renamed from: validate-d1pmJ48, reason: not valid java name */
    public java.lang.Object mo23170validated1pmJ48() {
        return com.zettle.sdk.features.Action.DefaultImpls.m23187validated1pmJ48(this);
    }

    @Override // com.zettle.sdk.features.Action
    public java.lang.String getFeatureId() {
        return this.featureId;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction$Settings;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction;", "Lcom/zettle/sdk/features/Information;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Settings extends com.zettle.sdk.feature.taptopay.ui.TapToPayAction implements com.zettle.sdk.features.Information {
        public static final int $stable = 0;
        public static final com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Settings INSTANCE = new com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Settings();
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Settings> CREATOR = new com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Settings.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private Settings() {
            super(null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Settings> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Settings[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Settings[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Settings createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Settings.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B-\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\u0012\u0006\u0010\u0004\u001a\u00020\f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\rJ\u0010\u0010\u000e\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J \u0010)\u001a\u00020\"2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction$Payment;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction;", "Lcom/zettle/sdk/features/Payment;", "", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "", "amount", "paypalPartnerAttributionId", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentProperties;", "paymentProperties", "<init>", "(Ljava/lang/String;JLjava/lang/String;Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentProperties;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;JLcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentProperties;)V", "component1", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "component2", "()J", "component3", "()Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentProperties;", "copy", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;JLcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentProperties;)Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction$Payment;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Lkotlin/Result;", "", "validate-d1pmJ48", "()Ljava/lang/Object;", "validate", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getAmount", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentProperties;", "getPaymentProperties", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "getReference"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Payment extends com.zettle.sdk.feature.taptopay.ui.TapToPayAction implements com.zettle.sdk.features.Payment {
        public static final int $stable = 8;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment> CREATOR = new com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment.Creator();
        private final long amount;
        private final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties paymentProperties;
        private final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference reference;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference getReference() {
            return this.reference;
        }

        public final long getAmount() {
            return this.amount;
        }

        public /* synthetic */ Payment(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference tapToPayReference, long j, com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties tapToPayPaymentProperties, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(tapToPayReference, j, (i & 4) != 0 ? com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties.INSTANCE.m23173default() : tapToPayPaymentProperties);
        }

        public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties getPaymentProperties() {
            return this.paymentProperties;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Payment(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference tapToPayReference, long j, com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties tapToPayPaymentProperties) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPayReference, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPayPaymentProperties, "");
            this.reference = tapToPayReference;
            this.amount = j;
            this.paymentProperties = tapToPayPaymentProperties;
        }

        public /* synthetic */ Payment(java.lang.String str, long j, java.lang.String str2, com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties tapToPayPaymentProperties, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, (i & 4) != 0 ? null : str2, tapToPayPaymentProperties);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Payment(java.lang.String str, long j, java.lang.String str2, com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties tapToPayPaymentProperties) {
            this(com.zettle.sdk.feature.taptopay.ui.PaymentUtilsKt.createTapToPayReference$default(str, str2, null, 4, null), j, tapToPayPaymentProperties);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPayPaymentProperties, "");
        }

        @Override // com.zettle.sdk.feature.taptopay.ui.TapToPayAction, com.zettle.sdk.features.Action
        /* renamed from: validate-d1pmJ48 */
        public final java.lang.Object mo23170validated1pmJ48() {
            if (this.amount <= 0) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalArgumentException("amount can't be zero or negative")));
            }
            return this.paymentProperties.m23172validated1pmJ48();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeParcelable(this.reference, flags);
            parcel.writeLong(this.amount);
            this.paymentProperties.writeToParcel(parcel, flags);
        }

        public final java.lang.String toString() {
            com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference tapToPayReference = this.reference;
            long j = this.amount;
            com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties tapToPayPaymentProperties = this.paymentProperties;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Payment(reference=");
            sb.append(tapToPayReference);
            sb.append(", amount=");
            sb.append(j);
            sb.append(", paymentProperties=");
            sb.append(tapToPayPaymentProperties);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.reference.hashCode() * 31) + java.lang.Long.hashCode(this.amount)) * 31) + this.paymentProperties.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment)) {
                return false;
            }
            com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment payment = (com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.reference, payment.reference) && this.amount == payment.amount && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentProperties, payment.paymentProperties);
        }

        public final com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment copy(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference reference, long amount, com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties paymentProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reference, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentProperties, "");
            return new com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment(reference, amount, paymentProperties);
        }

        /* renamed from: component3, reason: from getter */
        public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties getPaymentProperties() {
            return this.paymentProperties;
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment((com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference) parcel.readParcelable(com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment.class.getClassLoader()), parcel.readLong(), com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties.CREATOR.createFromParcel(parcel));
            }
        }

        /* renamed from: component2, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference getReference() {
            return this.reference;
        }

        public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment copy$default(com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment payment, com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference tapToPayReference, long j, com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties tapToPayPaymentProperties, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                tapToPayReference = payment.reference;
            }
            if ((i & 2) != 0) {
                j = payment.amount;
            }
            if ((i & 4) != 0) {
                tapToPayPaymentProperties = payment.paymentProperties;
            }
            return payment.copy(tapToPayReference, j, tapToPayPaymentProperties);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Payment(java.lang.String str, long j, com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties tapToPayPaymentProperties) {
            this(str, j, null, tapToPayPaymentProperties, 4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPayPaymentProperties, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ2\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b%\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction$Refund;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction;", "Lcom/zettle/sdk/features/Refund;", "", "paymentReferenceId", "", "amount", "refundReferenceId", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction$Refund;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getAmount", "Ljava/lang/String;", "getPaymentReferenceId", "getRefundReferenceId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Refund extends com.zettle.sdk.feature.taptopay.ui.TapToPayAction implements com.zettle.sdk.features.Refund {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund> CREATOR = new com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund.Creator();
        private final java.lang.Long amount;
        private final java.lang.String paymentReferenceId;
        private final java.lang.String refundReferenceId;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public /* synthetic */ Refund(java.lang.String str, java.lang.Long l, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2);
        }

        public final java.lang.String getPaymentReferenceId() {
            return this.paymentReferenceId;
        }

        public final java.lang.Long getAmount() {
            return this.amount;
        }

        public final java.lang.String getRefundReferenceId() {
            return this.refundReferenceId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Refund(java.lang.String str, java.lang.Long l, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.paymentReferenceId = str;
            this.amount = l;
            this.refundReferenceId = str2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.paymentReferenceId);
            java.lang.Long l = this.amount;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            parcel.writeString(this.refundReferenceId);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.paymentReferenceId;
            java.lang.Long l = this.amount;
            java.lang.String str2 = this.refundReferenceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Refund(paymentReferenceId=");
            sb.append(str);
            sb.append(", amount=");
            sb.append(l);
            sb.append(", refundReferenceId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.paymentReferenceId.hashCode();
            java.lang.Long l = this.amount;
            int hashCode2 = l == null ? 0 : l.hashCode();
            java.lang.String str = this.refundReferenceId;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund)) {
                return false;
            }
            com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund refund = (com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentReferenceId, refund.paymentReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, refund.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.refundReferenceId, refund.refundReferenceId);
        }

        public final com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund copy(java.lang.String paymentReferenceId, java.lang.Long amount, java.lang.String refundReferenceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReferenceId, "");
            return new com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund(paymentReferenceId, amount, refundReferenceId);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund(parcel.readString(), parcel.readInt() == 0 ? null : java.lang.Long.valueOf(parcel.readLong()), parcel.readString());
            }
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getRefundReferenceId() {
            return this.refundReferenceId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Long getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPaymentReferenceId() {
            return this.paymentReferenceId;
        }

        public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund copy$default(com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund refund, java.lang.String str, java.lang.Long l, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = refund.paymentReferenceId;
            }
            if ((i & 2) != 0) {
                l = refund.amount;
            }
            if ((i & 4) != 0) {
                str2 = refund.refundReferenceId;
            }
            return refund.copy(str, l, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction$Transaction;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction;", "Lcom/zettle/sdk/features/Headless;", "", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction$Transaction;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getReference"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Transaction extends com.zettle.sdk.feature.taptopay.ui.TapToPayAction implements com.zettle.sdk.features.Headless {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Transaction> CREATOR = new com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Transaction.Creator();
        private final java.lang.String reference;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Transaction(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reference = str;
        }

        public final java.lang.String getReference() {
            return this.reference;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.reference);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reference;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Transaction(reference=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reference.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Transaction) && kotlin.jvm.internal.Intrinsics.areEqual(this.reference, ((com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Transaction) other).reference);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Transaction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Transaction[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Transaction[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Transaction createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Transaction(parcel.readString());
            }
        }

        public final com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Transaction copy(java.lang.String reference) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reference, "");
            return new com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Transaction(reference);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReference() {
            return this.reference;
        }

        public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Transaction copy$default(com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Transaction transaction, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = transaction.reference;
            }
            return transaction.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction$Companion;", "", "<init>", "()V", "Lcom/zettle/sdk/ui/ZettleResult$Completed;", "result", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentResult$Completed;", "fromPaymentResult", "(Lcom/zettle/sdk/ui/ZettleResult$Completed;)Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentResult$Completed;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayRefundResult$Completed;", "fromRefundResult", "(Lcom/zettle/sdk/ui/ZettleResult$Completed;)Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayRefundResult$Completed;", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayRetrieveTransactionResult$Completed;", "fromRetrieveTransactionResult", "(Lcom/zettle/sdk/ui/ZettleResult$Completed;)Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayRetrieveTransactionResult$Completed;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPaySettingsResult$Completed;", "fromSettingsResult", "(Lcom/zettle/sdk/ui/ZettleResult$Completed;)Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPaySettingsResult$Completed;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Completed fromPaymentResult(com.zettle.sdk.ui.ZettleResult.Completed<?> result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Completed completed = result instanceof com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Completed ? (com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Completed) result : null;
            if (completed != null) {
                return completed;
            }
            throw new java.lang.IllegalArgumentException("Payload is not TapToPayPaymentResult.Completed");
        }

        @kotlin.jvm.JvmStatic
        public final com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Completed fromSettingsResult(com.zettle.sdk.ui.ZettleResult.Completed<?> result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Completed completed = result instanceof com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Completed ? (com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Completed) result : null;
            if (completed != null) {
                return completed;
            }
            throw new java.lang.IllegalArgumentException("Payload is not TapToPaySettingsResult.Completed");
        }

        @kotlin.jvm.JvmStatic
        public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundResult.Completed fromRefundResult(com.zettle.sdk.ui.ZettleResult.Completed<?> result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundResult.Completed completed = result instanceof com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundResult.Completed ? (com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundResult.Completed) result : null;
            if (completed != null) {
                return completed;
            }
            throw new java.lang.IllegalArgumentException("Payload is not TapToPayRefundResult.Completed");
        }

        @kotlin.jvm.JvmStatic
        public final com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed fromRetrieveTransactionResult(com.zettle.sdk.ui.ZettleResult.Completed<?> result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed completed = result instanceof com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed ? (com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed) result : null;
            if (completed != null) {
                return completed;
            }
            throw new java.lang.IllegalArgumentException("Payload is not TapToPayRetrieveTransactionResult.Completed");
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Completed fromSettingsResult(com.zettle.sdk.ui.ZettleResult.Completed<?> completed) {
        return INSTANCE.fromSettingsResult(completed);
    }

    @kotlin.jvm.JvmStatic
    public static final com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed fromRetrieveTransactionResult(com.zettle.sdk.ui.ZettleResult.Completed<?> completed) {
        return INSTANCE.fromRetrieveTransactionResult(completed);
    }

    @kotlin.jvm.JvmStatic
    public static final com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundResult.Completed fromRefundResult(com.zettle.sdk.ui.ZettleResult.Completed<?> completed) {
        return INSTANCE.fromRefundResult(completed);
    }

    @kotlin.jvm.JvmStatic
    public static final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Completed fromPaymentResult(com.zettle.sdk.ui.ZettleResult.Completed<?> completed) {
        return INSTANCE.fromPaymentResult(completed);
    }

    public /* synthetic */ TapToPayAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

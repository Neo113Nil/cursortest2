package com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionExternalDestination;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "()Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;", "creditProductIdentifier", "DirectApplication", "ApplicationBilling", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination$ApplicationBilling;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination$DirectApplication;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CBMCAcquisitionExternalDestination extends com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionExternalDestination {

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier getCreditProductIdentifier(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination cBMCAcquisitionExternalDestination) {
            return com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.super.getCreditProductIdentifier();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0002.-B'\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ#\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J4\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010\u0014J'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b,\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination$DirectApplication;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination;", "Landroidx/navigation3/runtime/NavKey;", "", "url", "track", "present", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionDestinationVisitor;", "visitor", "accept", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionDestinationVisitor;)Ljava/lang/Object;", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination$DirectApplication;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_acquisition_api_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination$DirectApplication;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getUrl", "getTrack", "getPresent", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class DirectApplication implements com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination, androidx.navigation3.runtime.NavKey {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication.Companion(null);
        private final java.lang.String present;
        private final java.lang.String track;
        private final java.lang.String url;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination$DirectApplication$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination$DirectApplication;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication> serializer() {
                return com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination$DirectApplication$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ DirectApplication(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (6 != (i & 6)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 6, com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination$DirectApplication$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.url = null;
            } else {
                this.url = str;
            }
            this.track = str2;
            this.present = str3;
        }

        public DirectApplication(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.url = str;
            this.track = str2;
            this.present = str3;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$revolvingcredit_acquisition_api_prodRelease(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.getUrl() != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getUrl());
            }
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getTrack());
            output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getPresent());
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination, com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionExternalDestination
        public final /* bridge */ com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return super.getCreditProductIdentifier();
        }

        public /* synthetic */ DirectApplication(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, str3);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionExternalDestination
        public final java.lang.String getUrl() {
            return this.url;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionExternalDestination
        public final java.lang.String getTrack() {
            return this.track;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionExternalDestination
        public final java.lang.String getPresent() {
            return this.present;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionDestination
        public final <R> R accept(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionDestinationVisitor<R> visitor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visitor, "");
            return visitor.visit(this);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.String str2 = this.track;
            java.lang.String str3 = this.present;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DirectApplication(url=");
            sb.append(str);
            sb.append(", track=");
            sb.append(str2);
            sb.append(", present=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.url;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.track;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.present;
            return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication directApplication = (com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, directApplication.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.track, directApplication.track) && kotlin.jvm.internal.Intrinsics.areEqual(this.present, directApplication.present);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication copy(java.lang.String url, java.lang.String track, java.lang.String present) {
            return new com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication(url, track, present);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPresent() {
            return this.present;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTrack() {
            return this.track;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication directApplication, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = directApplication.url;
            }
            if ((i & 2) != 0) {
                str2 = directApplication.track;
            }
            if ((i & 4) != 0) {
                str3 = directApplication.present;
            }
            return directApplication.copy(str, str2, str3);
        }
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionExternalDestination
    default com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier getCreditProductIdentifier() {
        return com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US;
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0002.-B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ#\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J4\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010\u0014J'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b,\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination$ApplicationBilling;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination;", "Landroidx/navigation3/runtime/NavKey;", "", "url", "track", "present", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionDestinationVisitor;", "visitor", "accept", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionDestinationVisitor;)Ljava/lang/Object;", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination$ApplicationBilling;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_acquisition_api_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination$ApplicationBilling;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getUrl", "getTrack", "getPresent", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class ApplicationBilling implements com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination, androidx.navigation3.runtime.NavKey {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling.Companion(null);
        private final java.lang.String present;
        private final java.lang.String track;
        private final java.lang.String url;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination$ApplicationBilling$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination$ApplicationBilling;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling> serializer() {
                return com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination$ApplicationBilling$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ApplicationBilling(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.url = null;
            } else {
                this.url = str;
            }
            if ((i & 2) == 0) {
                this.track = null;
            } else {
                this.track = str2;
            }
            if ((i & 4) == 0) {
                this.present = null;
            } else {
                this.present = str3;
            }
        }

        public ApplicationBilling(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.url = str;
            this.track = str2;
            this.present = str3;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$revolvingcredit_acquisition_api_prodRelease(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.getUrl() != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getUrl());
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.getTrack() != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getTrack());
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.getPresent() != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getPresent());
            }
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination, com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionExternalDestination
        public final /* bridge */ com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return super.getCreditProductIdentifier();
        }

        public /* synthetic */ ApplicationBilling(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionExternalDestination
        public final java.lang.String getUrl() {
            return this.url;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionExternalDestination
        public final java.lang.String getTrack() {
            return this.track;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionExternalDestination
        public final java.lang.String getPresent() {
            return this.present;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionDestination
        public final <R> R accept(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionDestinationVisitor<R> visitor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visitor, "");
            return visitor.visit(this);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.String str2 = this.track;
            java.lang.String str3 = this.present;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ApplicationBilling(url=");
            sb.append(str);
            sb.append(", track=");
            sb.append(str2);
            sb.append(", present=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.url;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.track;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.present;
            return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling applicationBilling = (com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, applicationBilling.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.track, applicationBilling.track) && kotlin.jvm.internal.Intrinsics.areEqual(this.present, applicationBilling.present);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling copy(java.lang.String url, java.lang.String track, java.lang.String present) {
            return new com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling(url, track, present);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPresent() {
            return this.present;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTrack() {
            return this.track;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling applicationBilling, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = applicationBilling.url;
            }
            if ((i & 2) != 0) {
                str2 = applicationBilling.track;
            }
            if ((i & 4) != 0) {
                str3 = applicationBilling.present;
            }
            return applicationBilling.copy(str, str2, str3);
        }

        public ApplicationBilling() {
            this((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }
}

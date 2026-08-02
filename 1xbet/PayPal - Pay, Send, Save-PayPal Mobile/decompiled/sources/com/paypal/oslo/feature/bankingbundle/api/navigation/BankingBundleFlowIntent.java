package com.paypal.oslo.feature.bankingbundle.api.navigation;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0004\u0012\u0013\u0014\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Standalone", "AcceptMoney", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.NAME, "Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent$AcceptMoney;", "Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent$Custom;", "Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent$Standalone;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class BankingBundleFlowIntent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Companion INSTANCE = new com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.$r8$lambda$ZkOwXzgTrmOGsglDgiQzAqxzW1c();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private BankingBundleFlowIntent() {
    }

    public /* synthetic */ BankingBundleFlowIntent(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent$Standalone;", "Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes11.dex */
    public static final /* data */ class Standalone extends com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent {
        public static final com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Standalone INSTANCE = new com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Standalone();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent$Standalone$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Standalone.$r8$lambda$QX7AwaV34cUEk6Rn3bwZb3a0B7k();
            }
        });

        public final int hashCode() {
            return -107723568;
        }

        private Standalone() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$QX7AwaV34cUEk6Rn3bwZb3a0B7k() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Standalone", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Standalone> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "Standalone";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Standalone)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent$AcceptMoney;", "Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes11.dex */
    public static final /* data */ class AcceptMoney extends com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent {
        public static final com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.AcceptMoney INSTANCE = new com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.AcceptMoney();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent$AcceptMoney$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.AcceptMoney.m12199$r8$lambda$tAgzK2kBesuRAinh34kuhUe6FM();
            }
        });

        public final int hashCode() {
            return -1558213267;
        }

        private AcceptMoney() {
            super(null);
        }

        /* renamed from: $r8$lambda$tAgzK2kBesuRAinh34kuhUe6-FM, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m12199$r8$lambda$tAgzK2kBesuRAinh34kuhUe6FM() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.AcceptMoney", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.AcceptMoney> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "AcceptMoney";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.AcceptMoney)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent$Custom;", "Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent;", "", "skipLanding", "skipSuccess", "<init>", "(ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent$Custom;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$banking_bundle_api_prodRelease", "(Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent$Custom;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "getSkipLanding", "getSkipSuccess", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Custom extends com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Custom.Companion INSTANCE = new com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Custom.Companion(null);
        private final boolean skipLanding;
        private final boolean skipSuccess;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent$Custom$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent$Custom;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Custom> serializer() {
                return com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent$Custom$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Custom(int i, boolean z, boolean z2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if ((i & 1) == 0) {
                this.skipLanding = false;
            } else {
                this.skipLanding = z;
            }
            if ((i & 2) == 0) {
                this.skipSuccess = false;
            } else {
                this.skipSuccess = z2;
            }
        }

        public Custom(boolean z, boolean z2) {
            super(null);
            this.skipLanding = z;
            this.skipSuccess = z2;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$banking_bundle_api_prodRelease(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Custom self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.write$Self(self, output, serialDesc);
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.skipLanding) {
                output.encodeBooleanElement(serialDesc, 0, self.skipLanding);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.skipSuccess) {
                output.encodeBooleanElement(serialDesc, 1, self.skipSuccess);
            }
        }

        public /* synthetic */ Custom(boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public final boolean getSkipLanding() {
            return this.skipLanding;
        }

        public final boolean getSkipSuccess() {
            return this.skipSuccess;
        }

        public final java.lang.String toString() {
            boolean z = this.skipLanding;
            boolean z2 = this.skipSuccess;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Custom(skipLanding=");
            sb.append(z);
            sb.append(", skipSuccess=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.skipLanding) * 31) + java.lang.Boolean.hashCode(this.skipSuccess);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Custom)) {
                return false;
            }
            com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Custom custom = (com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Custom) other;
            return this.skipLanding == custom.skipLanding && this.skipSuccess == custom.skipSuccess;
        }

        public final com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Custom copy(boolean skipLanding, boolean skipSuccess) {
            return new com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Custom(skipLanding, skipSuccess);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSkipSuccess() {
            return this.skipSuccess;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSkipLanding() {
            return this.skipLanding;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Custom copy$default(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Custom custom, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = custom.skipLanding;
            }
            if ((i & 2) != 0) {
                z2 = custom.skipSuccess;
            }
            return custom.copy(z, z2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Custom() {
            this(r2, r2, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            boolean z = false;
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$ZkOwXzgTrmOGsglDgiQzAqxzW1c() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.AcceptMoney.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Custom.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Standalone.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.AcceptMoney", com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.AcceptMoney.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent$Custom$$serializer.INSTANCE, new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Standalone", com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Standalone.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ BankingBundleFlowIntent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

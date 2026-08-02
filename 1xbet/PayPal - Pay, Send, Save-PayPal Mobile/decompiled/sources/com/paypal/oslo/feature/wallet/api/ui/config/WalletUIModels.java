package com.paypal.oslo.feature.wallet.api.ui.config;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels;", "", "<init>", "()V", "", "MAX_PROGRESS", com.visa.cbp.getEncExpo.warmup, "Progress", com.google.common.net.HttpHeaders.RANGE, "NavAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WalletUIModels {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels();
    public static final int MAX_PROGRESS = 100;

    private WalletUIModels() {
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Continuous", "Segmented", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress$Continuous;", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress$Segmented;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static abstract class Progress {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels$Progress$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.m20765$r8$lambda$9V7nJImvqXYrKgWvMJw4NTfyWY();
            }
        });

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress> serializer() {
                return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.$cachedSerializer$delegate.getValue();
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private Progress() {
        }

        public /* synthetic */ Progress(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress$Continuous;", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress;", "", "currentProgress", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Range;", "range", "<init>", "(ILcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Range;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Range;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "()Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Range;", "copy", "(ILcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Range;)Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress$Continuous;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress$Continuous;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", com.visa.cbp.getEncExpo.warmup, "getCurrentProgress", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Range;", "getRange", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Continuous extends com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Continuous.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Continuous.Companion(null);
            private final int currentProgress;
            private final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range range;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress$Continuous$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress$Continuous;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Continuous> serializer() {
                    return com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels$Progress$Continuous$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Continuous(int i, int i2, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range range, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                super(i, serializationConstructorMarker);
                if (3 != (i & 3)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels$Progress$Continuous$$serializer.INSTANCE.getDescriptor());
                }
                this.currentProgress = i2;
                this.range = range;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Continuous(int i, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range range) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
                this.currentProgress = i;
                this.range = range;
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Continuous self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.write$Self(self, output, serialDesc);
                output.encodeIntElement(serialDesc, 0, self.currentProgress);
                output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels$Range$$serializer.INSTANCE, self.range);
            }

            public final int getCurrentProgress() {
                return this.currentProgress;
            }

            public final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range getRange() {
                return this.range;
            }

            public final java.lang.String toString() {
                int i = this.currentProgress;
                com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range range = this.range;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Continuous(currentProgress=");
                sb.append(i);
                sb.append(", range=");
                sb.append(range);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (java.lang.Integer.hashCode(this.currentProgress) * 31) + this.range.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Continuous)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Continuous continuous = (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Continuous) other;
                return this.currentProgress == continuous.currentProgress && kotlin.jvm.internal.Intrinsics.areEqual(this.range, continuous.range);
            }

            public final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Continuous copy(int currentProgress, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range range) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
                return new com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Continuous(currentProgress, range);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range getRange() {
                return this.range;
            }

            /* renamed from: component1, reason: from getter */
            public final int getCurrentProgress() {
                return this.currentProgress;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Continuous copy$default(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Continuous continuous, int i, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range range, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = continuous.currentProgress;
                }
                if ((i2 & 2) != 0) {
                    range = continuous.range;
                }
                return continuous.copy(i, range);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress$Segmented;", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress;", "", "currentSegment", "totalSegments", "currentProgress", "<init>", "(III)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress$Segmented;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress$Segmented;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", com.visa.cbp.getEncExpo.warmup, "getCurrentSegment", "getTotalSegments", "getCurrentProgress", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Segmented extends com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Segmented.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Segmented.Companion(null);
            private final int currentProgress;
            private final int currentSegment;
            private final int totalSegments;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress$Segmented$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress$Segmented;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Segmented> serializer() {
                    return com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels$Progress$Segmented$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public Segmented(int i, int i2, int i3) {
                super(null);
                this.currentSegment = i;
                this.totalSegments = i2;
                this.currentProgress = i3;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Segmented(int i, int i2, int i3, int i4, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                super(i, serializationConstructorMarker);
                if (3 != (i & 3)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels$Progress$Segmented$$serializer.INSTANCE.getDescriptor());
                }
                this.currentSegment = i2;
                this.totalSegments = i3;
                if ((i & 4) == 0) {
                    this.currentProgress = 100;
                } else {
                    this.currentProgress = i4;
                }
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Segmented self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.write$Self(self, output, serialDesc);
                output.encodeIntElement(serialDesc, 0, self.currentSegment);
                output.encodeIntElement(serialDesc, 1, self.totalSegments);
                if (output.shouldEncodeElementDefault(serialDesc, 2) || self.currentProgress != 100) {
                    output.encodeIntElement(serialDesc, 2, self.currentProgress);
                }
            }

            public /* synthetic */ Segmented(int i, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(i, i2, (i4 & 4) != 0 ? 100 : i3);
            }

            public final int getCurrentSegment() {
                return this.currentSegment;
            }

            public final int getTotalSegments() {
                return this.totalSegments;
            }

            public final int getCurrentProgress() {
                return this.currentProgress;
            }

            public final java.lang.String toString() {
                int i = this.currentSegment;
                int i2 = this.totalSegments;
                int i3 = this.currentProgress;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Segmented(currentSegment=");
                sb.append(i);
                sb.append(", totalSegments=");
                sb.append(i2);
                sb.append(", currentProgress=");
                sb.append(i3);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (((java.lang.Integer.hashCode(this.currentSegment) * 31) + java.lang.Integer.hashCode(this.totalSegments)) * 31) + java.lang.Integer.hashCode(this.currentProgress);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Segmented)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Segmented segmented = (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Segmented) other;
                return this.currentSegment == segmented.currentSegment && this.totalSegments == segmented.totalSegments && this.currentProgress == segmented.currentProgress;
            }

            public final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Segmented copy(int currentSegment, int totalSegments, int currentProgress) {
                return new com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Segmented(currentSegment, totalSegments, currentProgress);
            }

            /* renamed from: component3, reason: from getter */
            public final int getCurrentProgress() {
                return this.currentProgress;
            }

            /* renamed from: component2, reason: from getter */
            public final int getTotalSegments() {
                return this.totalSegments;
            }

            /* renamed from: component1, reason: from getter */
            public final int getCurrentSegment() {
                return this.currentSegment;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Segmented copy$default(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Segmented segmented, int i, int i2, int i3, int i4, java.lang.Object obj) {
                if ((i4 & 1) != 0) {
                    i = segmented.currentSegment;
                }
                if ((i4 & 2) != 0) {
                    i2 = segmented.totalSegments;
                }
                if ((i4 & 4) != 0) {
                    i3 = segmented.currentProgress;
                }
                return segmented.copy(i, i2, i3);
            }
        }

        /* renamed from: $r8$lambda$9V7nJImvqXYrKgWvMJw4NTfy-WY, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m20765$r8$lambda$9V7nJImvqXYrKgWvMJw4NTfyWY() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Continuous.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Segmented.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels$Progress$Continuous$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels$Progress$Segmented$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }

        public /* synthetic */ Progress(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Range;", "", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "<init>", "(II)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Range;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Range;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", com.visa.cbp.getEncExpo.warmup, "getStart", "getEnd", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Range {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range.Companion(null);
        private final int end;
        private final int start;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Range$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Range;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range> serializer() {
                return com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels$Range$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Range(int i, int i2) {
            this.start = i;
            this.end = i2;
        }

        public /* synthetic */ Range(int i, int i2, int i3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels$Range$$serializer.INSTANCE.getDescriptor());
            }
            this.start = i2;
            this.end = i3;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeIntElement(serialDesc, 0, self.start);
            output.encodeIntElement(serialDesc, 1, self.end);
        }

        public final int getStart() {
            return this.start;
        }

        public final int getEnd() {
            return this.end;
        }

        public final java.lang.String toString() {
            int i = this.start;
            int i2 = this.end;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Range(start=");
            sb.append(i);
            sb.append(", end=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.start) * 31) + java.lang.Integer.hashCode(this.end);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range range = (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range) other;
            return this.start == range.start && this.end == range.end;
        }

        public final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range copy(int start, int end) {
            return new com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range(start, end);
        }

        /* renamed from: component2, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* renamed from: component1, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range copy$default(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range range, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = range.start;
            }
            if ((i3 & 2) != 0) {
                i2 = range.end;
            }
            return range.copy(i, i2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;", "", "<init>", "(Ljava/lang/String;I)V", com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.BACK, com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, "SKIP"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NavAction {
        public static final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction BACK;
        public static final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction CLOSE;
        public static final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction SKIP;
        private static final /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction[] getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        private NavAction(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction = new com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction(com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.BACK, 0);
            BACK = navAction;
            com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction2 = new com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction(com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, 1);
            CLOSE = navAction2;
            com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction3 = new com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction("SKIP", 2);
            SKIP = navAction3;
            com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction[] navActionArr = {navAction, navAction2, navAction3};
            getHighResolutionOutputSizeshNQ4ISI = navActionArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(navActionArr);
        }

        public static com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction[] values() {
            return (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction> getEntries() {
            return getHighSpeedVideoSizes;
        }
    }
}

package com.paypal.oslo.feature.balance.api.models.autoreload;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0005\u0012\u0013\u0014\u0015\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "LowBalanceReload", "ScheduledReload", "Cancelled", "Dismissed", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$Cancelled;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$Dismissed;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$LowBalanceReload;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$ScheduledReload;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class AutoReloadTransferSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Companion INSTANCE = new com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.$r8$lambda$dBEWTN4Ugh86bcJsWCNiWSClWEw();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$LowBalanceReload;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/ThresholdData;", "settings", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadChange;", "autoReloadChange", "<init>", "(Lcom/paypal/oslo/feature/balance/api/models/autoreload/ThresholdData;Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadChange;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/balance/api/models/autoreload/ThresholdData;Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadChange;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/balance/api/models/autoreload/ThresholdData;", "component2", "()Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadChange;", "copy", "(Lcom/paypal/oslo/feature/balance/api/models/autoreload/ThresholdData;Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadChange;)Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$LowBalanceReload;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$balance_api_prodRelease", "(Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$LowBalanceReload;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/ThresholdData;", "getSettings", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadChange;", "getAutoReloadChange", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class LowBalanceReload extends com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings {
        private final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange autoReloadChange;
        private final com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData settings;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.LowBalanceReload.Companion INSTANCE = new com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.LowBalanceReload.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings$LowBalanceReload$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange.INSTANCE.serializer();
                return serializer;
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$LowBalanceReload$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$LowBalanceReload;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.LowBalanceReload> serializer() {
                return com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings$LowBalanceReload$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LowBalanceReload(int i, com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData thresholdData, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange autoReloadChange, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings$LowBalanceReload$$serializer.INSTANCE.getDescriptor());
            }
            this.settings = thresholdData;
            this.autoReloadChange = autoReloadChange;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LowBalanceReload(com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData thresholdData, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange autoReloadChange) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thresholdData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadChange, "");
            this.settings = thresholdData;
            this.autoReloadChange = autoReloadChange;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$balance_api_prodRelease(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.LowBalanceReload self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData$$serializer.INSTANCE, self.settings);
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.autoReloadChange);
        }

        public final com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData getSettings() {
            return this.settings;
        }

        public final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange getAutoReloadChange() {
            return this.autoReloadChange;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData thresholdData = this.settings;
            com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange autoReloadChange = this.autoReloadChange;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LowBalanceReload(settings=");
            sb.append(thresholdData);
            sb.append(", autoReloadChange=");
            sb.append(autoReloadChange);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.settings.hashCode() * 31) + this.autoReloadChange.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.LowBalanceReload)) {
                return false;
            }
            com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.LowBalanceReload lowBalanceReload = (com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.LowBalanceReload) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.settings, lowBalanceReload.settings) && this.autoReloadChange == lowBalanceReload.autoReloadChange;
        }

        public final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.LowBalanceReload copy(com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData settings, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange autoReloadChange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadChange, "");
            return new com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.LowBalanceReload(settings, autoReloadChange);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange getAutoReloadChange() {
            return this.autoReloadChange;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData getSettings() {
            return this.settings;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.LowBalanceReload copy$default(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.LowBalanceReload lowBalanceReload, com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData thresholdData, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange autoReloadChange, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                thresholdData = lowBalanceReload.settings;
            }
            if ((i & 2) != 0) {
                autoReloadChange = lowBalanceReload.autoReloadChange;
            }
            return lowBalanceReload.copy(thresholdData, autoReloadChange);
        }
    }

    private AutoReloadTransferSettings() {
    }

    public /* synthetic */ AutoReloadTransferSettings(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$ScheduledReload;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/FrequencyData;", "settings", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadChange;", "autoReloadChange", "<init>", "(Lcom/paypal/oslo/feature/balance/api/models/autoreload/FrequencyData;Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadChange;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/balance/api/models/autoreload/FrequencyData;Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadChange;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/balance/api/models/autoreload/FrequencyData;", "component2", "()Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadChange;", "copy", "(Lcom/paypal/oslo/feature/balance/api/models/autoreload/FrequencyData;Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadChange;)Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$ScheduledReload;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$balance_api_prodRelease", "(Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$ScheduledReload;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/FrequencyData;", "getSettings", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadChange;", "getAutoReloadChange", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class ScheduledReload extends com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings {
        private final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange autoReloadChange;
        private final com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData settings;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.ScheduledReload.Companion INSTANCE = new com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.ScheduledReload.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings$ScheduledReload$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange.INSTANCE.serializer();
                return serializer;
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$ScheduledReload$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$ScheduledReload;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.ScheduledReload> serializer() {
                return com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings$ScheduledReload$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ScheduledReload(int i, com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData frequencyData, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange autoReloadChange, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings$ScheduledReload$$serializer.INSTANCE.getDescriptor());
            }
            this.settings = frequencyData;
            this.autoReloadChange = autoReloadChange;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScheduledReload(com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData frequencyData, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange autoReloadChange) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencyData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadChange, "");
            this.settings = frequencyData;
            this.autoReloadChange = autoReloadChange;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$balance_api_prodRelease(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.ScheduledReload self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData$$serializer.INSTANCE, self.settings);
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.autoReloadChange);
        }

        public final com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData getSettings() {
            return this.settings;
        }

        public final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange getAutoReloadChange() {
            return this.autoReloadChange;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData frequencyData = this.settings;
            com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange autoReloadChange = this.autoReloadChange;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScheduledReload(settings=");
            sb.append(frequencyData);
            sb.append(", autoReloadChange=");
            sb.append(autoReloadChange);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.settings.hashCode() * 31) + this.autoReloadChange.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.ScheduledReload)) {
                return false;
            }
            com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.ScheduledReload scheduledReload = (com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.ScheduledReload) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.settings, scheduledReload.settings) && this.autoReloadChange == scheduledReload.autoReloadChange;
        }

        public final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.ScheduledReload copy(com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData settings, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange autoReloadChange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadChange, "");
            return new com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.ScheduledReload(settings, autoReloadChange);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange getAutoReloadChange() {
            return this.autoReloadChange;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData getSettings() {
            return this.settings;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.ScheduledReload copy$default(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.ScheduledReload scheduledReload, com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData frequencyData, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange autoReloadChange, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                frequencyData = scheduledReload.settings;
            }
            if ((i & 2) != 0) {
                autoReloadChange = scheduledReload.autoReloadChange;
            }
            return scheduledReload.copy(frequencyData, autoReloadChange);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$Cancelled;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;", "intent", "<init>", "(Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;", "copy", "(Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;)Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$Cancelled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$balance_api_prodRelease", "(Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$Cancelled;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;", "getIntent", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Cancelled extends com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings {
        private final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent intent;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Cancelled.Companion INSTANCE = new com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Cancelled.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings$Cancelled$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.INSTANCE.serializer();
                return serializer;
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$Cancelled$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$Cancelled;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Cancelled> serializer() {
                return com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings$Cancelled$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Cancelled(int i, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent autoReloadFlowIntent, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings$Cancelled$$serializer.INSTANCE.getDescriptor());
            }
            this.intent = autoReloadFlowIntent;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cancelled(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent autoReloadFlowIntent) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFlowIntent, "");
            this.intent = autoReloadFlowIntent;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$balance_api_prodRelease(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Cancelled self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.intent);
        }

        public final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent getIntent() {
            return this.intent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent autoReloadFlowIntent = this.intent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cancelled(intent=");
            sb.append(autoReloadFlowIntent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.intent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Cancelled) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, ((com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Cancelled) other).intent);
        }

        public final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Cancelled copy(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            return new com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Cancelled(intent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent getIntent() {
            return this.intent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Cancelled copy$default(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Cancelled cancelled, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent autoReloadFlowIntent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                autoReloadFlowIntent = cancelled.intent;
            }
            return cancelled.copy(autoReloadFlowIntent);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings$Dismissed;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadTransferSettings;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes11.dex */
    public static final /* data */ class Dismissed extends com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings {
        public static final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Dismissed INSTANCE = new com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Dismissed();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings$Dismissed$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Dismissed.$r8$lambda$85AoKVz6KP9aCWR_gGu2CgUyJ9w();
            }
        });

        public final int hashCode() {
            return -424816790;
        }

        private Dismissed() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$85AoKVz6KP9aCWR_gGu2CgUyJ9w() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Dismissed", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Dismissed> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "Dismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Dismissed)) {
                return false;
            }
            return true;
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$dBEWTN4Ugh86bcJsWCNiWSClWEw() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Cancelled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Dismissed.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.LowBalanceReload.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.ScheduledReload.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings$Cancelled$$serializer.INSTANCE, new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Dismissed", com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Dismissed.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings$LowBalanceReload$$serializer.INSTANCE, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings$ScheduledReload$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ AutoReloadTransferSettings(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

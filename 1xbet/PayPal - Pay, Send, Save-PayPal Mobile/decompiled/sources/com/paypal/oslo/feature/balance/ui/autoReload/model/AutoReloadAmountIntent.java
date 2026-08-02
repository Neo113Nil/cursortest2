package com.paypal.oslo.feature.balance.ui.autoReload.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00062\u00020\u0001:\u0004\u0007\b\t\u0006R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\n\u000b\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;", "", "", "getCurrentAmount", "()Ljava/lang/String;", "currentAmount", "Companion", "LowBalanceThreshold", "LowBalanceRecharge", "ScheduledRecharge", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$LowBalanceRecharge;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$LowBalanceThreshold;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$ScheduledRecharge;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface AutoReloadAmountIntent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.Companion INSTANCE = com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.Companion.getHighSpeedVideoFpsRanges;

    java.lang.String getCurrentAmount();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.Companion getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceThreshold.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.ScheduledRecharge.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent$LowBalanceRecharge$$serializer.INSTANCE, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent$LowBalanceThreshold$$serializer.INSTANCE, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent$ScheduledRecharge$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$LowBalanceThreshold;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;", "", "currentAmount", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$LowBalanceThreshold;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$balance_prodRelease", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$LowBalanceThreshold;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCurrentAmount", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class LowBalanceThreshold implements com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceThreshold.Companion INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceThreshold.Companion(null);
        private final java.lang.String currentAmount;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$LowBalanceThreshold$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$LowBalanceThreshold;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceThreshold> serializer() {
                return com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent$LowBalanceThreshold$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ LowBalanceThreshold(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent$LowBalanceThreshold$$serializer.INSTANCE.getDescriptor());
            }
            this.currentAmount = str;
        }

        public LowBalanceThreshold(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currentAmount = str;
        }

        @Override // com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent
        public final java.lang.String getCurrentAmount() {
            return this.currentAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.currentAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LowBalanceThreshold(currentAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.currentAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceThreshold) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentAmount, ((com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceThreshold) other).currentAmount);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceThreshold copy(java.lang.String currentAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAmount, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceThreshold(currentAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCurrentAmount() {
            return this.currentAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceThreshold copy$default(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceThreshold lowBalanceThreshold, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = lowBalanceThreshold.currentAmount;
            }
            return lowBalanceThreshold.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$LowBalanceRecharge;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;", "", "currentAmount", "thresholdAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$LowBalanceRecharge;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$balance_prodRelease", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$LowBalanceRecharge;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCurrentAmount", "getThresholdAmount", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class LowBalanceRecharge implements com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge.Companion INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge.Companion(null);
        private final java.lang.String currentAmount;
        private final java.lang.String thresholdAmount;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$LowBalanceRecharge$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$LowBalanceRecharge;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge> serializer() {
                return com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent$LowBalanceRecharge$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ LowBalanceRecharge(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent$LowBalanceRecharge$$serializer.INSTANCE.getDescriptor());
            }
            this.currentAmount = str;
            this.thresholdAmount = str2;
        }

        public LowBalanceRecharge(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.currentAmount = str;
            this.thresholdAmount = str2;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$balance_prodRelease(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.getCurrentAmount());
            output.encodeStringElement(serialDesc, 1, self.thresholdAmount);
        }

        @Override // com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent
        public final java.lang.String getCurrentAmount() {
            return this.currentAmount;
        }

        public final java.lang.String getThresholdAmount() {
            return this.thresholdAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.currentAmount;
            java.lang.String str2 = this.thresholdAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LowBalanceRecharge(currentAmount=");
            sb.append(str);
            sb.append(", thresholdAmount=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currentAmount.hashCode() * 31) + this.thresholdAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge lowBalanceRecharge = (com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currentAmount, lowBalanceRecharge.currentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.thresholdAmount, lowBalanceRecharge.thresholdAmount);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge copy(java.lang.String currentAmount, java.lang.String thresholdAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thresholdAmount, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge(currentAmount, thresholdAmount);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getThresholdAmount() {
            return this.thresholdAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCurrentAmount() {
            return this.currentAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge copy$default(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge lowBalanceRecharge, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = lowBalanceRecharge.currentAmount;
            }
            if ((i & 2) != 0) {
                str2 = lowBalanceRecharge.thresholdAmount;
            }
            return lowBalanceRecharge.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$ScheduledRecharge;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;", "", "currentAmount", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$ScheduledRecharge;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$balance_prodRelease", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$ScheduledRecharge;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCurrentAmount", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class ScheduledRecharge implements com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.ScheduledRecharge.Companion INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.ScheduledRecharge.Companion(null);
        private final java.lang.String currentAmount;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$ScheduledRecharge$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent$ScheduledRecharge;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.ScheduledRecharge> serializer() {
                return com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent$ScheduledRecharge$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ScheduledRecharge(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent$ScheduledRecharge$$serializer.INSTANCE.getDescriptor());
            }
            this.currentAmount = str;
        }

        public ScheduledRecharge(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currentAmount = str;
        }

        @Override // com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent
        public final java.lang.String getCurrentAmount() {
            return this.currentAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.currentAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScheduledRecharge(currentAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.currentAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.ScheduledRecharge) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentAmount, ((com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.ScheduledRecharge) other).currentAmount);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.ScheduledRecharge copy(java.lang.String currentAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAmount, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.ScheduledRecharge(currentAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCurrentAmount() {
            return this.currentAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.ScheduledRecharge copy$default(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.ScheduledRecharge scheduledRecharge, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = scheduledRecharge.currentAmount;
            }
            return scheduledRecharge.copy(str);
        }
    }
}

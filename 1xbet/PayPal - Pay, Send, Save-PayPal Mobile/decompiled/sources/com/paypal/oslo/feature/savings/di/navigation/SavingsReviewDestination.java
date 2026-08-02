package com.paypal.oslo.feature.savings.di.navigation;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0081\b\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0002A@BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fBa\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019JZ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b,\u0010\u0019J'\u00103\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b6\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010\u001dR\u001a\u0010\t\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b;\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b>\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b?\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/savings/di/navigation/SavingsReviewDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "", "amount", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "frequencyText", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "frequency", "startDate", "preselectedFiType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "component3", "()Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", "component4", "component5", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "component6", "component7", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/di/navigation/SavingsReviewDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$savings_prodRelease", "(Lcom/paypal/oslo/feature/savings/di/navigation/SavingsReviewDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAmount", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal", "Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", "getFlowType", "getFrequencyText", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "getFrequency", "getStartDate", "getPreselectedFiType", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class SavingsReviewDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {
    public static final int $stable = 0;
    private final java.lang.String amount;
    private final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType flowType;
    private final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequency;
    private final java.lang.String frequencyText;
    private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;
    private final java.lang.String preselectedFiType;
    private final java.lang.String startDate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination.Companion INSTANCE = new com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.INSTANCE.serializer();
            return serializer;
        }
    }), null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.INSTANCE.serializer();
            return serializer;
        }
    }), null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/di/navigation/SavingsReviewDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/savings/di/navigation/SavingsReviewDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination> serializer() {
            return com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SavingsReviewDestination(int i, java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.lang.String str3, java.lang.String str4, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.amount = str;
        this.goal = goalSummaryDTO;
        this.flowType = moneyManagementFlowType;
        if ((i & 8) == 0) {
            this.frequencyText = "";
        } else {
            this.frequencyText = str2;
        }
        if ((i & 16) == 0) {
            this.frequency = com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.ONE_TIME;
        } else {
            this.frequency = frequencyType;
        }
        if ((i & 32) == 0) {
            this.startDate = null;
        } else {
            this.startDate = str3;
        }
        if ((i & 64) == 0) {
            this.preselectedFiType = null;
        } else {
            this.preselectedFiType = str4;
        }
    }

    public SavingsReviewDestination(java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyManagementFlowType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencyType, "");
        this.amount = str;
        this.goal = goalSummaryDTO;
        this.flowType = moneyManagementFlowType;
        this.frequencyText = str2;
        this.frequency = frequencyType;
        this.startDate = str3;
        this.preselectedFiType = str4;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$savings_prodRelease(com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.amount);
        output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO$$serializer.INSTANCE, self.goal);
        output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.flowType);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !kotlin.jvm.internal.Intrinsics.areEqual(self.frequencyText, "")) {
            output.encodeStringElement(serialDesc, 3, self.frequencyText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.frequency != com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.ONE_TIME) {
            output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.frequency);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.startDate != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.startDate);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.preselectedFiType != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.preselectedFiType);
        }
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
        return this.goal;
    }

    public final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType getFlowType() {
        return this.flowType;
    }

    public /* synthetic */ SavingsReviewDestination(java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, goalSummaryDTO, moneyManagementFlowType, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.ONE_TIME : frequencyType, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }

    public final java.lang.String getFrequencyText() {
        return this.frequencyText;
    }

    public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType getFrequency() {
        return this.frequency;
    }

    public final java.lang.String getStartDate() {
        return this.startDate;
    }

    public final java.lang.String getPreselectedFiType() {
        return this.preselectedFiType;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        java.lang.String str;
        int i = com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination.WhenMappings.$EnumSwitchMapping$0[this.flowType.ordinal()];
        if (i == 1) {
            str = "savings_add_money";
        } else if (i == 2) {
            str = com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.MoneyTransfer.SCREEN_ID;
        } else if (i == 3) {
            str = com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AutoSave.SCREEN_SETUP;
        } else if (i == 4) {
            str = com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.CreateGoal.SCREEN_ID;
        } else {
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.GoalDetails.SCREEN_ID;
        }
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor(str, new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("savings", "savings", "view"), null, 4, null);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.amount;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
        com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType = this.flowType;
        java.lang.String str2 = this.frequencyText;
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType = this.frequency;
        java.lang.String str3 = this.startDate;
        java.lang.String str4 = this.preselectedFiType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsReviewDestination(amount=");
        sb.append(str);
        sb.append(", goal=");
        sb.append(goalSummaryDTO);
        sb.append(", flowType=");
        sb.append(moneyManagementFlowType);
        sb.append(", frequencyText=");
        sb.append(str2);
        sb.append(", frequency=");
        sb.append(frequencyType);
        sb.append(", startDate=");
        sb.append(str3);
        sb.append(", preselectedFiType=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.amount.hashCode();
        int hashCode2 = this.goal.hashCode();
        int hashCode3 = this.flowType.hashCode();
        int hashCode4 = this.frequencyText.hashCode();
        int hashCode5 = this.frequency.hashCode();
        java.lang.String str = this.startDate;
        int hashCode6 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.preselectedFiType;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination)) {
            return false;
        }
        com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination savingsReviewDestination = (com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, savingsReviewDestination.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.goal, savingsReviewDestination.goal) && this.flowType == savingsReviewDestination.flowType && kotlin.jvm.internal.Intrinsics.areEqual(this.frequencyText, savingsReviewDestination.frequencyText) && this.frequency == savingsReviewDestination.frequency && kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, savingsReviewDestination.startDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.preselectedFiType, savingsReviewDestination.preselectedFiType);
    }

    public final com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination copy(java.lang.String amount, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType flowType, java.lang.String frequencyText, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequency, java.lang.String startDate, java.lang.String preselectedFiType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencyText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequency, "");
        return new com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination(amount, goal, flowType, frequencyText, frequency, startDate, preselectedFiType);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getPreselectedFiType() {
        return this.preselectedFiType;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getStartDate() {
        return this.startDate;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType getFrequency() {
        return this.frequency;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFrequencyText() {
        return this.frequencyText;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType getFlowType() {
        return this.flowType;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
        return this.goal;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.ADD_MONEY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.TRANSFER_MONEY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.CREATE_GOAL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.DELETE_GOAL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination copy$default(com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination savingsReviewDestination, java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = savingsReviewDestination.amount;
        }
        if ((i & 2) != 0) {
            goalSummaryDTO = savingsReviewDestination.goal;
        }
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2 = goalSummaryDTO;
        if ((i & 4) != 0) {
            moneyManagementFlowType = savingsReviewDestination.flowType;
        }
        com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType2 = moneyManagementFlowType;
        if ((i & 8) != 0) {
            str2 = savingsReviewDestination.frequencyText;
        }
        java.lang.String str5 = str2;
        if ((i & 16) != 0) {
            frequencyType = savingsReviewDestination.frequency;
        }
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType2 = frequencyType;
        if ((i & 32) != 0) {
            str3 = savingsReviewDestination.startDate;
        }
        java.lang.String str6 = str3;
        if ((i & 64) != 0) {
            str4 = savingsReviewDestination.preselectedFiType;
        }
        return savingsReviewDestination.copy(str, goalSummaryDTO2, moneyManagementFlowType2, str5, frequencyType2, str6, str4);
    }
}

package com.paypal.oslo.feature.qrc.domain.model.session;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b1\u0018\u0000 \u00152\u00020\u0001:\u0004\u0016\u0017\u0018\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0003\u0019\u001a\u001b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;", "getActionType", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, "Companion", "PollingAction", "ErrorAction", "BasicAction", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction$BasicAction;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction$ErrorAction;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction$PollingAction;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class QrcSessionRequiredAction {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.Companion INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.$r8$lambda$96jJGbZqfhXv3h1yNMmqs8s4yLo();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    public abstract com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType getActionType();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private QrcSessionRequiredAction() {
    }

    public /* synthetic */ QrcSessionRequiredAction(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction$PollingAction;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, "", "maximumPollingInterval", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;Ljava/lang/Integer;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;", "component2", "()Ljava/lang/Integer;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction$PollingAction;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;", "getActionType", "Ljava/lang/Integer;", "getMaximumPollingInterval"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* data */ class PollingAction extends com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType actionType;
        private final java.lang.Integer maximumPollingInterval;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PollingAction(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType qrcSessionActionType, java.lang.Integer num) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionActionType, "");
            this.actionType = qrcSessionActionType;
            this.maximumPollingInterval = num;
        }

        @Override // com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction
        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType getActionType() {
            return this.actionType;
        }

        public final java.lang.Integer getMaximumPollingInterval() {
            return this.maximumPollingInterval;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType qrcSessionActionType = this.actionType;
            java.lang.Integer num = this.maximumPollingInterval;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PollingAction(actionType=");
            sb.append(qrcSessionActionType);
            sb.append(", maximumPollingInterval=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.actionType.hashCode();
            java.lang.Integer num = this.maximumPollingInterval;
            return (hashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.PollingAction)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.PollingAction pollingAction = (com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.PollingAction) other;
            return this.actionType == pollingAction.actionType && kotlin.jvm.internal.Intrinsics.areEqual(this.maximumPollingInterval, pollingAction.maximumPollingInterval);
        }

        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.PollingAction copy(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType actionType, java.lang.Integer maximumPollingInterval) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
            return new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.PollingAction(actionType, maximumPollingInterval);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getMaximumPollingInterval() {
            return this.maximumPollingInterval;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType getActionType() {
            return this.actionType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.PollingAction copy$default(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.PollingAction pollingAction, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType qrcSessionActionType, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qrcSessionActionType = pollingAction.actionType;
            }
            if ((i & 2) != 0) {
                num = pollingAction.maximumPollingInterval;
            }
            return pollingAction.copy(qrcSessionActionType, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction$ErrorAction;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorReason;", "errorReason", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorIssue;", com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE, "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorReason;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorIssue;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;", "component2", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorReason;", "component3", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorIssue;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorReason;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorIssue;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction$ErrorAction;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;", "getActionType", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorReason;", "getErrorReason", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorIssue;", "getIssue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* data */ class ErrorAction extends com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType actionType;
        private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason errorReason;
        private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue issue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorAction(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType qrcSessionActionType, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason qrcSessionErrorReason, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue qrcSessionErrorIssue) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionActionType, "");
            this.actionType = qrcSessionActionType;
            this.errorReason = qrcSessionErrorReason;
            this.issue = qrcSessionErrorIssue;
        }

        @Override // com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction
        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType getActionType() {
            return this.actionType;
        }

        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason getErrorReason() {
            return this.errorReason;
        }

        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue getIssue() {
            return this.issue;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType qrcSessionActionType = this.actionType;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason qrcSessionErrorReason = this.errorReason;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue qrcSessionErrorIssue = this.issue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorAction(actionType=");
            sb.append(qrcSessionActionType);
            sb.append(", errorReason=");
            sb.append(qrcSessionErrorReason);
            sb.append(", issue=");
            sb.append(qrcSessionErrorIssue);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.actionType.hashCode();
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason qrcSessionErrorReason = this.errorReason;
            int hashCode2 = qrcSessionErrorReason == null ? 0 : qrcSessionErrorReason.hashCode();
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue qrcSessionErrorIssue = this.issue;
            return (((hashCode * 31) + hashCode2) * 31) + (qrcSessionErrorIssue != null ? qrcSessionErrorIssue.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.ErrorAction)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.ErrorAction errorAction = (com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.ErrorAction) other;
            return this.actionType == errorAction.actionType && this.errorReason == errorAction.errorReason && this.issue == errorAction.issue;
        }

        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.ErrorAction copy(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType actionType, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason errorReason, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue issue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
            return new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.ErrorAction(actionType, errorReason, issue);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue getIssue() {
            return this.issue;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason getErrorReason() {
            return this.errorReason;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType getActionType() {
            return this.actionType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.ErrorAction copy$default(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.ErrorAction errorAction, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType qrcSessionActionType, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason qrcSessionErrorReason, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue qrcSessionErrorIssue, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qrcSessionActionType = errorAction.actionType;
            }
            if ((i & 2) != 0) {
                qrcSessionErrorReason = errorAction.errorReason;
            }
            if ((i & 4) != 0) {
                qrcSessionErrorIssue = errorAction.issue;
            }
            return errorAction.copy(qrcSessionActionType, qrcSessionErrorReason, qrcSessionErrorIssue);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction$BasicAction;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction$BasicAction;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;", "getActionType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* data */ class BasicAction extends com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType actionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BasicAction(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType qrcSessionActionType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionActionType, "");
            this.actionType = qrcSessionActionType;
        }

        @Override // com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction
        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType getActionType() {
            return this.actionType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType qrcSessionActionType = this.actionType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BasicAction(actionType=");
            sb.append(qrcSessionActionType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.actionType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.BasicAction) && this.actionType == ((com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.BasicAction) other).actionType;
        }

        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.BasicAction copy(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType actionType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
            return new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.BasicAction(actionType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType getActionType() {
            return this.actionType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.BasicAction copy$default(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.BasicAction basicAction, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType qrcSessionActionType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qrcSessionActionType = basicAction.actionType;
            }
            return basicAction.copy(qrcSessionActionType);
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$96jJGbZqfhXv3h1yNMmqs8s4yLo() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.class), new kotlin.reflect.KClass[0], new kotlinx.serialization.KSerializer[0], new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ QrcSessionRequiredAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

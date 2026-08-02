package com.paypal.oslo.feature.qrc.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$Data;", "Lcom/paypal/oslo/feature/qrc/graphql/type/EnrollConsumerPresentedQRCodeInput;", "input", "<init>", "(Lcom/paypal/oslo/feature/qrc/graphql/type/EnrollConsumerPresentedQRCodeInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/feature/qrc/graphql/type/EnrollConsumerPresentedQRCodeInput;", "copy", "(Lcom/paypal/oslo/feature/qrc/graphql/type/EnrollConsumerPresentedQRCodeInput;)Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/qrc/graphql/type/EnrollConsumerPresentedQRCodeInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class EnrollConsumerPresentedQrCodeMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.Data> {
    public static final java.lang.String OPERATION_ID = "c1fc0fd6fdf988be3b2bc536618fe85cb2e890637b63bfce1e5b7c3685eee858";
    public static final java.lang.String OPERATION_NAME = "EnrollConsumerPresentedQrCode";
    private final com.paypal.oslo.feature.qrc.graphql.type.EnrollConsumerPresentedQRCodeInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.Companion INSTANCE = new com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.Companion(null);
    public static final int $stable = 8;

    public EnrollConsumerPresentedQrCodeMutation(com.paypal.oslo.feature.qrc.graphql.type.EnrollConsumerPresentedQRCodeInput enrollConsumerPresentedQRCodeInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollConsumerPresentedQRCodeInput, "");
        this.input = enrollConsumerPresentedQRCodeInput;
    }

    public final com.paypal.oslo.feature.qrc.graphql.type.EnrollConsumerPresentedQRCodeInput getInput() {
        return this.input;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String id() {
        return OPERATION_ID;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.paypal.oslo.feature.qrc.graphql.adapter.EnrollConsumerPresentedQrCodeMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.adapter.EnrollConsumerPresentedQrCodeMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.feature.qrc.graphql.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.qrc.graphql.selections.EnrollConsumerPresentedQrCodeMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$EnrollConsumerPresentedQrCode;", "enrollConsumerPresentedQrCode", "<init>", "(Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$EnrollConsumerPresentedQrCode;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$EnrollConsumerPresentedQrCode;", "copy", "(Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$EnrollConsumerPresentedQrCode;)Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$EnrollConsumerPresentedQrCode;", "getEnrollConsumerPresentedQrCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode enrollConsumerPresentedQrCode;

        public Data(com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode enrollConsumerPresentedQrCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollConsumerPresentedQrCode, "");
            this.enrollConsumerPresentedQrCode = enrollConsumerPresentedQrCode;
        }

        public final com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode getEnrollConsumerPresentedQrCode() {
            return this.enrollConsumerPresentedQrCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode enrollConsumerPresentedQrCode = this.enrollConsumerPresentedQrCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(enrollConsumerPresentedQrCode=");
            sb.append(enrollConsumerPresentedQrCode);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.enrollConsumerPresentedQrCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.enrollConsumerPresentedQrCode, ((com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.Data) other).enrollConsumerPresentedQrCode);
        }

        public final com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.Data copy(com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode enrollConsumerPresentedQrCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollConsumerPresentedQrCode, "");
            return new com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.Data(enrollConsumerPresentedQrCode);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode getEnrollConsumerPresentedQrCode() {
            return this.enrollConsumerPresentedQrCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.Data copy$default(com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.Data data, com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode enrollConsumerPresentedQrCode, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                enrollConsumerPresentedQrCode = data.enrollConsumerPresentedQrCode;
            }
            return data.copy(enrollConsumerPresentedQrCode);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012JJ\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b(\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$EnrollConsumerPresentedQrCode;", "", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;", "qrCodeType", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEnrollmentStatus;", "status", "", "deniedReason", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEnrollmentNextAction;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.NEXT_ACTION, "stepupAuthContextId", "<init>", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEnrollmentStatus;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEnrollmentNextAction;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;", "component2", "()Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEnrollmentStatus;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEnrollmentNextAction;", "component5", "copy", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEnrollmentStatus;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEnrollmentNextAction;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$EnrollConsumerPresentedQrCode;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;", "getQrCodeType", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEnrollmentStatus;", "getStatus", "Ljava/lang/String;", "getDeniedReason", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEnrollmentNextAction;", "getNextAction", "getStepupAuthContextId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EnrollConsumerPresentedQrCode {
        public static final int $stable = 0;
        private final java.lang.String deniedReason;
        private final com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentNextAction nextAction;
        private final com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qrCodeType;
        private final com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentStatus status;
        private final java.lang.String stepupAuthContextId;

        public EnrollConsumerPresentedQrCode(com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qRCodeType, com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentStatus qRCodeEnrollmentStatus, java.lang.String str, com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentNextAction qRCodeEnrollmentNextAction, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qRCodeEnrollmentStatus, "");
            this.qrCodeType = qRCodeType;
            this.status = qRCodeEnrollmentStatus;
            this.deniedReason = str;
            this.nextAction = qRCodeEnrollmentNextAction;
            this.stepupAuthContextId = str2;
        }

        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeType getQrCodeType() {
            return this.qrCodeType;
        }

        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentStatus getStatus() {
            return this.status;
        }

        public final java.lang.String getDeniedReason() {
            return this.deniedReason;
        }

        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentNextAction getNextAction() {
            return this.nextAction;
        }

        public final java.lang.String getStepupAuthContextId() {
            return this.stepupAuthContextId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qRCodeType = this.qrCodeType;
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentStatus qRCodeEnrollmentStatus = this.status;
            java.lang.String str = this.deniedReason;
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentNextAction qRCodeEnrollmentNextAction = this.nextAction;
            java.lang.String str2 = this.stepupAuthContextId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EnrollConsumerPresentedQrCode(qrCodeType=");
            sb.append(qRCodeType);
            sb.append(", status=");
            sb.append(qRCodeEnrollmentStatus);
            sb.append(", deniedReason=");
            sb.append(str);
            sb.append(", nextAction=");
            sb.append(qRCodeEnrollmentNextAction);
            sb.append(", stepupAuthContextId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qRCodeType = this.qrCodeType;
            int hashCode = qRCodeType == null ? 0 : qRCodeType.hashCode();
            int hashCode2 = this.status.hashCode();
            java.lang.String str = this.deniedReason;
            int hashCode3 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentNextAction qRCodeEnrollmentNextAction = this.nextAction;
            int hashCode4 = qRCodeEnrollmentNextAction == null ? 0 : qRCodeEnrollmentNextAction.hashCode();
            java.lang.String str2 = this.stepupAuthContextId;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode enrollConsumerPresentedQrCode = (com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode) other;
            return this.qrCodeType == enrollConsumerPresentedQrCode.qrCodeType && this.status == enrollConsumerPresentedQrCode.status && kotlin.jvm.internal.Intrinsics.areEqual(this.deniedReason, enrollConsumerPresentedQrCode.deniedReason) && this.nextAction == enrollConsumerPresentedQrCode.nextAction && kotlin.jvm.internal.Intrinsics.areEqual(this.stepupAuthContextId, enrollConsumerPresentedQrCode.stepupAuthContextId);
        }

        public final com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode copy(com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qrCodeType, com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentStatus status, java.lang.String deniedReason, com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentNextAction nextAction, java.lang.String stepupAuthContextId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode(qrCodeType, status, deniedReason, nextAction, stepupAuthContextId);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getStepupAuthContextId() {
            return this.stepupAuthContextId;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentNextAction getNextAction() {
            return this.nextAction;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDeniedReason() {
            return this.deniedReason;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeType getQrCodeType() {
            return this.qrCodeType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode copy$default(com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode enrollConsumerPresentedQrCode, com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qRCodeType, com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentStatus qRCodeEnrollmentStatus, java.lang.String str, com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentNextAction qRCodeEnrollmentNextAction, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qRCodeType = enrollConsumerPresentedQrCode.qrCodeType;
            }
            if ((i & 2) != 0) {
                qRCodeEnrollmentStatus = enrollConsumerPresentedQrCode.status;
            }
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentStatus qRCodeEnrollmentStatus2 = qRCodeEnrollmentStatus;
            if ((i & 4) != 0) {
                str = enrollConsumerPresentedQrCode.deniedReason;
            }
            java.lang.String str3 = str;
            if ((i & 8) != 0) {
                qRCodeEnrollmentNextAction = enrollConsumerPresentedQrCode.nextAction;
            }
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentNextAction qRCodeEnrollmentNextAction2 = qRCodeEnrollmentNextAction;
            if ((i & 16) != 0) {
                str2 = enrollConsumerPresentedQrCode.stepupAuthContextId;
            }
            return enrollConsumerPresentedQrCode.copy(qRCodeType, qRCodeEnrollmentStatus2, str3, qRCodeEnrollmentNextAction2, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation EnrollConsumerPresentedQrCode($input: EnrollConsumerPresentedQRCodeInput!) { enrollConsumerPresentedQrCode(input: $input) { qrCodeType status deniedReason nextAction stepupAuthContextId } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.graphql.type.EnrollConsumerPresentedQRCodeInput enrollConsumerPresentedQRCodeInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EnrollConsumerPresentedQrCodeMutation(input=");
        sb.append(enrollConsumerPresentedQRCodeInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.input.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation) other).input);
    }

    public final com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation copy(com.paypal.oslo.feature.qrc.graphql.type.EnrollConsumerPresentedQRCodeInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.qrc.graphql.type.EnrollConsumerPresentedQRCodeInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation copy$default(com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation enrollConsumerPresentedQrCodeMutation, com.paypal.oslo.feature.qrc.graphql.type.EnrollConsumerPresentedQRCodeInput enrollConsumerPresentedQRCodeInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            enrollConsumerPresentedQRCodeInput = enrollConsumerPresentedQrCodeMutation.input;
        }
        return enrollConsumerPresentedQrCodeMutation.copy(enrollConsumerPresentedQRCodeInput);
    }
}

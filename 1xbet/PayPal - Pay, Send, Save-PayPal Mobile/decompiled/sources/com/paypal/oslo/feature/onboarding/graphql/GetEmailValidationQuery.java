package com.paypal.oslo.feature.onboarding.graphql;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005)*+,(B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$Data;", "", "email", "<init>", "(Ljava/lang/Object;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getEmail", "Companion", "Data", "PublicCredentialMetadata", "OnboardingEmailStatus", "Actor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GetEmailValidationQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Data> {
    public static final java.lang.String OPERATION_ID = "91826f4d54419a99e77840c21528d357f5c3adb3c087fdb7d6d255bb43d6fd30";
    public static final java.lang.String OPERATION_NAME = "GetEmailValidation";
    private final java.lang.Object email;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Companion(null);
    public static final int $stable = 8;

    public GetEmailValidationQuery(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.email = obj;
    }

    public final java.lang.Object getEmail() {
        return this.email;
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
        com.paypal.oslo.feature.onboarding.graphql.adapter.GetEmailValidationQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.onboarding.graphql.adapter.GetEmailValidationQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.onboarding.graphql.selections.GetEmailValidationQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$PublicCredentialMetadata;", "publicCredentialMetadata", "<init>", "(Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$PublicCredentialMetadata;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$PublicCredentialMetadata;", "copy", "(Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$PublicCredentialMetadata;)Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$PublicCredentialMetadata;", "getPublicCredentialMetadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.PublicCredentialMetadata publicCredentialMetadata;

        public Data(com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.PublicCredentialMetadata publicCredentialMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredentialMetadata, "");
            this.publicCredentialMetadata = publicCredentialMetadata;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.PublicCredentialMetadata getPublicCredentialMetadata() {
            return this.publicCredentialMetadata;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.PublicCredentialMetadata publicCredentialMetadata = this.publicCredentialMetadata;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(publicCredentialMetadata=");
            sb.append(publicCredentialMetadata);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.publicCredentialMetadata.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredentialMetadata, ((com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Data) other).publicCredentialMetadata);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Data copy(com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.PublicCredentialMetadata publicCredentialMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredentialMetadata, "");
            return new com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Data(publicCredentialMetadata);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.PublicCredentialMetadata getPublicCredentialMetadata() {
            return this.publicCredentialMetadata;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Data copy$default(com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Data data, com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.PublicCredentialMetadata publicCredentialMetadata, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                publicCredentialMetadata = data.publicCredentialMetadata;
            }
            return data.copy(publicCredentialMetadata);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$PublicCredentialMetadata;", "", "Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$OnboardingEmailStatus;", "onboardingEmailStatus", "Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$Actor;", "actor", "<init>", "(Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$OnboardingEmailStatus;Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$Actor;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$OnboardingEmailStatus;", "component2", "()Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$Actor;", "copy", "(Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$OnboardingEmailStatus;Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$Actor;)Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$PublicCredentialMetadata;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$OnboardingEmailStatus;", "getOnboardingEmailStatus", "Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$Actor;", "getActor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PublicCredentialMetadata {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Actor actor;
        private final com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.OnboardingEmailStatus onboardingEmailStatus;

        public PublicCredentialMetadata(com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.OnboardingEmailStatus onboardingEmailStatus, com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Actor actor) {
            this.onboardingEmailStatus = onboardingEmailStatus;
            this.actor = actor;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.OnboardingEmailStatus getOnboardingEmailStatus() {
            return this.onboardingEmailStatus;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Actor getActor() {
            return this.actor;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.OnboardingEmailStatus onboardingEmailStatus = this.onboardingEmailStatus;
            com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Actor actor = this.actor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PublicCredentialMetadata(onboardingEmailStatus=");
            sb.append(onboardingEmailStatus);
            sb.append(", actor=");
            sb.append(actor);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.OnboardingEmailStatus onboardingEmailStatus = this.onboardingEmailStatus;
            int hashCode = onboardingEmailStatus == null ? 0 : onboardingEmailStatus.hashCode();
            com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Actor actor = this.actor;
            return (hashCode * 31) + (actor != null ? actor.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.PublicCredentialMetadata)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.PublicCredentialMetadata publicCredentialMetadata = (com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.PublicCredentialMetadata) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.onboardingEmailStatus, publicCredentialMetadata.onboardingEmailStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.actor, publicCredentialMetadata.actor);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.PublicCredentialMetadata copy(com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.OnboardingEmailStatus onboardingEmailStatus, com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Actor actor) {
            return new com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.PublicCredentialMetadata(onboardingEmailStatus, actor);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Actor getActor() {
            return this.actor;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.OnboardingEmailStatus getOnboardingEmailStatus() {
            return this.onboardingEmailStatus;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.PublicCredentialMetadata copy$default(com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.PublicCredentialMetadata publicCredentialMetadata, com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.OnboardingEmailStatus onboardingEmailStatus, com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Actor actor, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                onboardingEmailStatus = publicCredentialMetadata.onboardingEmailStatus;
            }
            if ((i & 2) != 0) {
                actor = publicCredentialMetadata.actor;
            }
            return publicCredentialMetadata.copy(onboardingEmailStatus, actor);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$OnboardingEmailStatus;", "", "Lcom/paypal/oslo/api/graphql/schema/type/EmailValidityStatus;", "validity", "", "suggestions", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/EmailValidityStatus;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/EmailValidityStatus;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/EmailValidityStatus;Ljava/util/List;)Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$OnboardingEmailStatus;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/EmailValidityStatus;", "getValidity", "Ljava/util/List;", "getSuggestions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnboardingEmailStatus {
        public static final int $stable = 8;
        private final java.util.List<java.lang.Object> suggestions;
        private final com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus validity;

        public OnboardingEmailStatus(com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus emailValidityStatus, java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailValidityStatus, "");
            this.validity = emailValidityStatus;
            this.suggestions = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus getValidity() {
            return this.validity;
        }

        public final java.util.List<java.lang.Object> getSuggestions() {
            return this.suggestions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus emailValidityStatus = this.validity;
            java.util.List<java.lang.Object> list = this.suggestions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardingEmailStatus(validity=");
            sb.append(emailValidityStatus);
            sb.append(", suggestions=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.validity.hashCode();
            java.util.List<java.lang.Object> list = this.suggestions;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.OnboardingEmailStatus)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.OnboardingEmailStatus onboardingEmailStatus = (com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.OnboardingEmailStatus) other;
            return this.validity == onboardingEmailStatus.validity && kotlin.jvm.internal.Intrinsics.areEqual(this.suggestions, onboardingEmailStatus.suggestions);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.OnboardingEmailStatus copy(com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus validity, java.util.List<? extends java.lang.Object> suggestions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validity, "");
            return new com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.OnboardingEmailStatus(validity, suggestions);
        }

        public final java.util.List<java.lang.Object> component2() {
            return this.suggestions;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus getValidity() {
            return this.validity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.OnboardingEmailStatus copy$default(com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.OnboardingEmailStatus onboardingEmailStatus, com.paypal.oslo.api.graphql.schema.type.EmailValidityStatus emailValidityStatus, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailValidityStatus = onboardingEmailStatus.validity;
            }
            if ((i & 2) != 0) {
                list = onboardingEmailStatus.suggestions;
            }
            return onboardingEmailStatus.copy(emailValidityStatus, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$Actor;", "", "publicCredential", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$Actor;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getPublicCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Actor {
        public static final int $stable = 8;
        private final java.lang.Object publicCredential;

        public Actor(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.publicCredential = obj;
        }

        public final java.lang.Object getPublicCredential() {
            return this.publicCredential;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.publicCredential;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Actor(publicCredential=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.publicCredential.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Actor) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, ((com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Actor) other).publicCredential);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Actor copy(java.lang.Object publicCredential) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            return new com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Actor(publicCredential);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getPublicCredential() {
            return this.publicCredential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Actor copy$default(com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery.Actor actor, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = actor.publicCredential;
            }
            return actor.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetEmailValidationQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetEmailValidation($email: EmailAddress!) { publicCredentialMetadata(input: $email) { onboardingEmailStatus { validity suggestions } actor { publicCredential } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.email;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetEmailValidationQuery(email=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.email.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, ((com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery) other).email);
    }

    public final com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery copy(java.lang.Object email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        return new com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery(email);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getEmail() {
        return this.email;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery copy$default(com.paypal.oslo.feature.onboarding.graphql.GetEmailValidationQuery getEmailValidationQuery, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = getEmailValidationQuery.email;
        }
        return getEmailValidationQuery.copy(obj);
    }
}

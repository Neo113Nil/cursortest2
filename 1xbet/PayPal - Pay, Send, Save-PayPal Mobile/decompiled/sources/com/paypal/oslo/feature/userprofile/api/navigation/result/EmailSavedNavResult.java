package com.paypal.oslo.feature.userprofile.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailSavedNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "email", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailAction;", "action", "<init>", "(Lcom/paypal/oslo/core/userstore/model/ProfileEmail;Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailAction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/core/userstore/model/ProfileEmail;Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "component2", "()Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailAction;", "copy", "(Lcom/paypal/oslo/core/userstore/model/ProfileEmail;Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailAction;)Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailSavedNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$user_profile_api_prodRelease", "(Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailSavedNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "getEmail", "getEmail$annotations", "()V", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailAction;", "getAction", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class EmailSavedNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction action;
    private final com.paypal.oslo.core.userstore.model.ProfileEmail email;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult.Companion INSTANCE = new com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult.$r8$lambda$iAVRRDPl22RLGiEHj1vrE9JGBCg();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.INSTANCE.serializer();
            return serializer;
        }
    })};

    public static /* synthetic */ void getEmail$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailSavedNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailSavedNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult> serializer() {
            return com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ EmailSavedNavResult(int i, com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction emailAction, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.email = profileEmail;
        if ((i & 2) == 0) {
            this.action = com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.ADD;
        } else {
            this.action = emailAction;
        }
    }

    public EmailSavedNavResult(com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction emailAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileEmail, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailAction, "");
        this.email = profileEmail;
        this.action = emailAction;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$user_profile_api_prodRelease(com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.email);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.action != com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.ADD) {
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.action);
        }
    }

    public final com.paypal.oslo.core.userstore.model.ProfileEmail getEmail() {
        return this.email;
    }

    public /* synthetic */ EmailSavedNavResult(com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction emailAction, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(profileEmail, (i & 2) != 0 ? com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.ADD : emailAction);
    }

    public final com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction getAction() {
        return this.action;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$iAVRRDPl22RLGiEHj1vrE9JGBCg() {
        return new kotlinx.serialization.ContextualSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.userstore.model.ProfileEmail.class), null, new kotlinx.serialization.KSerializer[0]);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail = this.email;
        com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction emailAction = this.action;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailSavedNavResult(email=");
        sb.append(profileEmail);
        sb.append(", action=");
        sb.append(emailAction);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.email.hashCode() * 31) + this.action.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult)) {
            return false;
        }
        com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult emailSavedNavResult = (com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.email, emailSavedNavResult.email) && this.action == emailSavedNavResult.action;
    }

    public final com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult copy(com.paypal.oslo.core.userstore.model.ProfileEmail email, com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return new com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult(email, action);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction getAction() {
        return this.action;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.userstore.model.ProfileEmail getEmail() {
        return this.email;
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult copy$default(com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult emailSavedNavResult, com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction emailAction, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            profileEmail = emailSavedNavResult.email;
        }
        if ((i & 2) != 0) {
            emailAction = emailSavedNavResult.action;
        }
        return emailSavedNavResult.copy(profileEmail, emailAction);
    }
}

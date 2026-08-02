package com.paypal.oslo.feature.userprofile.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailConfirmedNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "email", "<init>", "(Lcom/paypal/oslo/core/userstore/model/ProfileEmail;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/core/userstore/model/ProfileEmail;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "copy", "(Lcom/paypal/oslo/core/userstore/model/ProfileEmail;)Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailConfirmedNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$user_profile_api_prodRelease", "(Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailConfirmedNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "getEmail", "getEmail$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class EmailConfirmedNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.core.userstore.model.ProfileEmail email;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult.Companion INSTANCE = new com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult.$r8$lambda$zBe4euSYs6ZQFxzSQPbJ7ZDKmYc();
        }
    })};

    public static /* synthetic */ void getEmail$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailConfirmedNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailConfirmedNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult> serializer() {
            return com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ EmailConfirmedNavResult(int i, com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.email = profileEmail;
    }

    public EmailConfirmedNavResult(com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileEmail, "");
        this.email = profileEmail;
    }

    public final com.paypal.oslo.core.userstore.model.ProfileEmail getEmail() {
        return this.email;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$zBe4euSYs6ZQFxzSQPbJ7ZDKmYc() {
        return new kotlinx.serialization.ContextualSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.userstore.model.ProfileEmail.class), null, new kotlinx.serialization.KSerializer[0]);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail = this.email;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailConfirmedNavResult(email=");
        sb.append(profileEmail);
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
        return (other instanceof com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, ((com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult) other).email);
    }

    public final com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult copy(com.paypal.oslo.core.userstore.model.ProfileEmail email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        return new com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult(email);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.userstore.model.ProfileEmail getEmail() {
        return this.email;
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult copy$default(com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult emailConfirmedNavResult, com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            profileEmail = emailConfirmedNavResult.email;
        }
        return emailConfirmedNavResult.copy(profileEmail);
    }
}

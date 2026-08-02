package com.paypal.oslo.core.network.graphql;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0004\u0012\u0013\u0014\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/AuthType;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/core/network/graphql/AuthType;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "User", "Client", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Lcom/paypal/oslo/core/network/graphql/AuthType$Client;", "Lcom/paypal/oslo/core/network/graphql/AuthType$None;", "Lcom/paypal/oslo/core/network/graphql/AuthType$User;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class AuthType {
    public static final java.lang.String AUTH_TYPE_HEADER = "X-Auth-Type";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.network.graphql.AuthType.Companion INSTANCE = new com.paypal.oslo.core.network.graphql.AuthType.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.network.graphql.AuthType$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.network.graphql.AuthType.m11653$r8$lambda$vZ6Fa7AQJ14Jj8Za_wNPuNWmjw();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.core.network.graphql.AuthType self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    private AuthType() {
    }

    public /* synthetic */ AuthType(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/AuthType$User;", "Lcom/paypal/oslo/core/network/graphql/AuthType;", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "authenticationContext", "<init>", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "copy", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;)Lcom/paypal/oslo/core/network/graphql/AuthType$User;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$graphql_release", "(Lcom/paypal/oslo/core/network/graphql/AuthType$User;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "getAuthenticationContext", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class User extends com.paypal.oslo.core.network.graphql.AuthType {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.core.network.graphql.AuthType.User.Companion INSTANCE = new com.paypal.oslo.core.network.graphql.AuthType.User.Companion(null);
        private final com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/AuthType$User$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/network/graphql/AuthType$User;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.network.graphql.AuthType.User> serializer() {
                return com.paypal.oslo.core.network.graphql.AuthType$User$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ User(int i, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.core.network.graphql.AuthType$User$$serializer.INSTANCE.getDescriptor());
            }
            this.authenticationContext = authenticationContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public User(com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContext, "");
            this.authenticationContext = authenticationContext;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$graphql_release(com.paypal.oslo.core.network.graphql.AuthType.User self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.core.network.graphql.AuthType.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.core.identity.domain.model.AuthenticationContext$$serializer.INSTANCE, self.authenticationContext);
        }

        public final com.paypal.oslo.core.identity.domain.model.AuthenticationContext getAuthenticationContext() {
            return this.authenticationContext;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext = this.authenticationContext;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("User(authenticationContext=");
            sb.append(authenticationContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.authenticationContext.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.network.graphql.AuthType.User) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationContext, ((com.paypal.oslo.core.network.graphql.AuthType.User) other).authenticationContext);
        }

        public final com.paypal.oslo.core.network.graphql.AuthType.User copy(com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContext, "");
            return new com.paypal.oslo.core.network.graphql.AuthType.User(authenticationContext);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.identity.domain.model.AuthenticationContext getAuthenticationContext() {
            return this.authenticationContext;
        }

        public static /* synthetic */ com.paypal.oslo.core.network.graphql.AuthType.User copy$default(com.paypal.oslo.core.network.graphql.AuthType.User user, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                authenticationContext = user.authenticationContext;
            }
            return user.copy(authenticationContext);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/AuthType$Client;", "Lcom/paypal/oslo/core/network/graphql/AuthType;", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;", "authenticationFlowInfo", "<init>", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;", "copy", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;)Lcom/paypal/oslo/core/network/graphql/AuthType$Client;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$graphql_release", "(Lcom/paypal/oslo/core/network/graphql/AuthType$Client;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;", "getAuthenticationFlowInfo", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Client extends com.paypal.oslo.core.network.graphql.AuthType {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.core.network.graphql.AuthType.Client.Companion INSTANCE = new com.paypal.oslo.core.network.graphql.AuthType.Client.Companion(null);
        private final com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/AuthType$Client$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/network/graphql/AuthType$Client;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.network.graphql.AuthType.Client> serializer() {
                return com.paypal.oslo.core.network.graphql.AuthType$Client$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Client(int i, com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.core.network.graphql.AuthType$Client$$serializer.INSTANCE.getDescriptor());
            }
            this.authenticationFlowInfo = authenticationFlowInfo;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Client(com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationFlowInfo, "");
            this.authenticationFlowInfo = authenticationFlowInfo;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$graphql_release(com.paypal.oslo.core.network.graphql.AuthType.Client self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.core.network.graphql.AuthType.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo$$serializer.INSTANCE, self.authenticationFlowInfo);
        }

        public final com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo getAuthenticationFlowInfo() {
            return this.authenticationFlowInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo = this.authenticationFlowInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Client(authenticationFlowInfo=");
            sb.append(authenticationFlowInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.authenticationFlowInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.network.graphql.AuthType.Client) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationFlowInfo, ((com.paypal.oslo.core.network.graphql.AuthType.Client) other).authenticationFlowInfo);
        }

        public final com.paypal.oslo.core.network.graphql.AuthType.Client copy(com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationFlowInfo, "");
            return new com.paypal.oslo.core.network.graphql.AuthType.Client(authenticationFlowInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo getAuthenticationFlowInfo() {
            return this.authenticationFlowInfo;
        }

        public static /* synthetic */ com.paypal.oslo.core.network.graphql.AuthType.Client copy$default(com.paypal.oslo.core.network.graphql.AuthType.Client client, com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                authenticationFlowInfo = client.authenticationFlowInfo;
            }
            return client.copy(authenticationFlowInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/AuthType$None;", "Lcom/paypal/oslo/core/network/graphql/AuthType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes4.dex */
    public static final /* data */ class None extends com.paypal.oslo.core.network.graphql.AuthType {
        public static final com.paypal.oslo.core.network.graphql.AuthType.None INSTANCE = new com.paypal.oslo.core.network.graphql.AuthType.None();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.network.graphql.AuthType$None$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.core.network.graphql.AuthType.None.m11654$r8$lambda$kBuLOE1jgffuoPmOkPPU6nZnw();
            }
        });

        public final int hashCode() {
            return -711950711;
        }

        private None() {
            super(null);
        }

        /* renamed from: $r8$lambda$kBuLOE1jgffuoPmOk-PPU6nZ-nw, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m11654$r8$lambda$kBuLOE1jgffuoPmOkPPU6nZnw() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.core.network.graphql.AuthType.None", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.network.graphql.AuthType.None> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.network.graphql.AuthType.None)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/AuthType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/network/graphql/AuthType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "AUTH_TYPE_HEADER", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.network.graphql.AuthType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.core.network.graphql.AuthType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$v-Z6Fa7AQJ14Jj8Za_wNPuNWmjw, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m11653$r8$lambda$vZ6Fa7AQJ14Jj8Za_wNPuNWmjw() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.core.network.graphql.AuthType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.network.graphql.AuthType.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.network.graphql.AuthType.Client.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.network.graphql.AuthType.None.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.network.graphql.AuthType.User.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.core.network.graphql.AuthType$Client$$serializer.INSTANCE, new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.core.network.graphql.AuthType.None", com.paypal.oslo.core.network.graphql.AuthType.None.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.core.network.graphql.AuthType$User$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ AuthType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

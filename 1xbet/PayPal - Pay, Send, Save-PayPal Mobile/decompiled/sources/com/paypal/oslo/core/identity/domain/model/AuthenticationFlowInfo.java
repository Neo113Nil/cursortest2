package com.paypal.oslo.core.identity.domain.model;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;", "", "", "source", "", "additionalParameters", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_release", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getSource", "Ljava/util/Map;", "getAdditionalParameters", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AuthenticationFlowInfo {
    private final java.util.Map<java.lang.String, java.lang.String> additionalParameters;
    private final java.lang.String source;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo.Companion INSTANCE = new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo.m11571$r8$lambda$yr5uGBiOpCIwl5UqPgLIQadk3M();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo> serializer() {
            return com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AuthenticationFlowInfo(int i, java.lang.String str, java.util.Map map, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.source = str;
        if ((i & 2) == 0) {
            this.additionalParameters = kotlin.collections.MapsKt.emptyMap();
        } else {
            this.additionalParameters = map;
        }
    }

    public AuthenticationFlowInfo(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.source = str;
        this.additionalParameters = map;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$identity_release(com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.source);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(self.additionalParameters, kotlin.collections.MapsKt.emptyMap())) {
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.additionalParameters);
        }
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public /* synthetic */ AuthenticationFlowInfo(java.lang.String str, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<java.lang.String, java.lang.String> getAdditionalParameters() {
        return this.additionalParameters;
    }

    /* renamed from: $r8$lambda$yr5-uGBiOpCIwl5UqPgLIQadk3M, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m11571$r8$lambda$yr5uGBiOpCIwl5UqPgLIQadk3M() {
        return new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.source;
        java.util.Map<java.lang.String, java.lang.String> map = this.additionalParameters;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationFlowInfo(source=");
        sb.append(str);
        sb.append(", additionalParameters=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.source.hashCode() * 31) + this.additionalParameters.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo)) {
            return false;
        }
        com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo = (com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.source, authenticationFlowInfo.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalParameters, authenticationFlowInfo.additionalParameters);
    }

    public final com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo copy(java.lang.String source, java.util.Map<java.lang.String, java.lang.String> additionalParameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalParameters, "");
        return new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(source, additionalParameters);
    }

    public final java.util.Map<java.lang.String, java.lang.String> component2() {
        return this.additionalParameters;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo copy$default(com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = authenticationFlowInfo.source;
        }
        if ((i & 2) != 0) {
            map = authenticationFlowInfo.additionalParameters;
        }
        return authenticationFlowInfo.copy(str, map);
    }
}

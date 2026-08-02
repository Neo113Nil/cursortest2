package com.paypal.oslo.app.contextheader;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)"}, d2 = {"Lcom/paypal/oslo/app/contextheader/SessionInfoHeader;", "Lcom/paypal/oslo/app/contextheader/ContextHeader;", "", "sessionID", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lcom/paypal/oslo/app/contextheader/ContextHeaderKey;", "headerKey", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/app/contextheader/ContextHeaderKey;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Larrow/core/Either;", "Lkotlinx/serialization/SerializationException;", "jsonValue", "()Larrow/core/Either;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/app/contextheader/SessionInfoHeader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app_prodRelease", "(Lcom/paypal/oslo/app/contextheader/SessionInfoHeader;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getSessionID", "Lcom/paypal/oslo/app/contextheader/ContextHeaderKey;", "getHeaderKey", "()Lcom/paypal/oslo/app/contextheader/ContextHeaderKey;", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class SessionInfoHeader implements com.paypal.oslo.app.contextheader.ContextHeader {
    public static final int $stable = 0;
    private final com.paypal.oslo.app.contextheader.ContextHeaderKey headerKey;
    private final java.lang.String sessionID;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.app.contextheader.SessionInfoHeader.Companion INSTANCE = new com.paypal.oslo.app.contextheader.SessionInfoHeader.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.contextheader.SessionInfoHeader$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.app.contextheader.ContextHeaderKey", com.paypal.oslo.app.contextheader.ContextHeaderKey.values());
            return createSimpleEnumSerializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/app/contextheader/SessionInfoHeader$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/app/contextheader/SessionInfoHeader;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.app.contextheader.SessionInfoHeader> serializer() {
            return com.paypal.oslo.app.contextheader.SessionInfoHeader$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SessionInfoHeader(int i, java.lang.String str, com.paypal.oslo.app.contextheader.ContextHeaderKey contextHeaderKey, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.app.contextheader.SessionInfoHeader$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionID = str;
        if ((i & 2) == 0) {
            this.headerKey = com.paypal.oslo.app.contextheader.ContextHeaderKey.SESSION_INFO;
        } else {
            this.headerKey = contextHeaderKey;
        }
    }

    public SessionInfoHeader(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.sessionID = str;
        this.headerKey = com.paypal.oslo.app.contextheader.ContextHeaderKey.SESSION_INFO;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$app_prodRelease(com.paypal.oslo.app.contextheader.SessionInfoHeader self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.sessionID);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.getHeaderKey() != com.paypal.oslo.app.contextheader.ContextHeaderKey.SESSION_INFO) {
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.getHeaderKey());
        }
    }

    public final java.lang.String getSessionID() {
        return this.sessionID;
    }

    @Override // com.paypal.oslo.app.contextheader.ContextHeader
    public final com.paypal.oslo.app.contextheader.ContextHeaderKey getHeaderKey() {
        return this.headerKey;
    }

    @Override // com.paypal.oslo.app.contextheader.ContextHeader
    public final arrow.core.Either<kotlinx.serialization.SerializationException, java.lang.String> jsonValue() {
        try {
            kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
            companion.getSerializersModule();
            return arrow.core.EitherKt.right(companion.encodeToString(INSTANCE.serializer(), this));
        } catch (kotlinx.serialization.SerializationException e) {
            return arrow.core.EitherKt.left(e);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.sessionID;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SessionInfoHeader(sessionID=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.sessionID.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.app.contextheader.SessionInfoHeader) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionID, ((com.paypal.oslo.app.contextheader.SessionInfoHeader) other).sessionID);
    }

    public final com.paypal.oslo.app.contextheader.SessionInfoHeader copy(java.lang.String sessionID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionID, "");
        return new com.paypal.oslo.app.contextheader.SessionInfoHeader(sessionID);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSessionID() {
        return this.sessionID;
    }

    public static /* synthetic */ com.paypal.oslo.app.contextheader.SessionInfoHeader copy$default(com.paypal.oslo.app.contextheader.SessionInfoHeader sessionInfoHeader, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = sessionInfoHeader.sessionID;
        }
        return sessionInfoHeader.copy(str);
    }
}

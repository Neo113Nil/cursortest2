package com.paypal.oslo.feature.searchandintelligence.api.domain;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b&\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;", "", "Lkotlinx/serialization/json/JsonObject;", "actionInfo", "payload", "<init>", "(Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lkotlinx/serialization/json/JsonObject;", "component2", "copy", "(Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;)Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$search_and_intelligence_api_prodRelease", "(Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lkotlinx/serialization/json/JsonObject;", "getActionInfo", "getActionInfo$annotations", "()V", "getPayload", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ActionContent {
    private final kotlinx.serialization.json.JsonObject actionInfo;
    private final kotlinx.serialization.json.JsonObject payload;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent.Companion INSTANCE = new com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent.Companion(null);
    public static final int $stable = 8;

    @kotlinx.serialization.SerialName("action_info")
    public static /* synthetic */ void getActionInfo$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent> serializer() {
            return com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ActionContent(int i, kotlinx.serialization.json.JsonObject jsonObject, kotlinx.serialization.json.JsonObject jsonObject2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent$$serializer.INSTANCE.getDescriptor());
        }
        this.actionInfo = jsonObject;
        if ((i & 2) == 0) {
            this.payload = new kotlinx.serialization.json.JsonObject(kotlin.collections.MapsKt.emptyMap());
        } else {
            this.payload = jsonObject2;
        }
    }

    public ActionContent(kotlinx.serialization.json.JsonObject jsonObject, kotlinx.serialization.json.JsonObject jsonObject2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject2, "");
        this.actionInfo = jsonObject;
        this.payload = jsonObject2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$search_and_intelligence_api_prodRelease(com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, kotlinx.serialization.json.JsonObjectSerializer.INSTANCE, self.actionInfo);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(self.payload, new kotlinx.serialization.json.JsonObject(kotlin.collections.MapsKt.emptyMap()))) {
            output.encodeSerializableElement(serialDesc, 1, kotlinx.serialization.json.JsonObjectSerializer.INSTANCE, self.payload);
        }
    }

    public final kotlinx.serialization.json.JsonObject getActionInfo() {
        return this.actionInfo;
    }

    public /* synthetic */ ActionContent(kotlinx.serialization.json.JsonObject jsonObject, kotlinx.serialization.json.JsonObject jsonObject2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonObject, (i & 2) != 0 ? new kotlinx.serialization.json.JsonObject(kotlin.collections.MapsKt.emptyMap()) : jsonObject2);
    }

    public final kotlinx.serialization.json.JsonObject getPayload() {
        return this.payload;
    }

    public final java.lang.String toString() {
        kotlinx.serialization.json.JsonObject jsonObject = this.actionInfo;
        kotlinx.serialization.json.JsonObject jsonObject2 = this.payload;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActionContent(actionInfo=");
        sb.append(jsonObject);
        sb.append(", payload=");
        sb.append(jsonObject2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.actionInfo.hashCode() * 31) + this.payload.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent)) {
            return false;
        }
        com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent = (com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.actionInfo, actionContent.actionInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.payload, actionContent.payload);
    }

    public final com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent copy(kotlinx.serialization.json.JsonObject actionInfo, kotlinx.serialization.json.JsonObject payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
        return new com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent(actionInfo, payload);
    }

    /* renamed from: component2, reason: from getter */
    public final kotlinx.serialization.json.JsonObject getPayload() {
        return this.payload;
    }

    /* renamed from: component1, reason: from getter */
    public final kotlinx.serialization.json.JsonObject getActionInfo() {
        return this.actionInfo;
    }

    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent copy$default(com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent, kotlinx.serialization.json.JsonObject jsonObject, kotlinx.serialization.json.JsonObject jsonObject2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            jsonObject = actionContent.actionInfo;
        }
        if ((i & 2) != 0) {
            jsonObject2 = actionContent.payload;
        }
        return actionContent.copy(jsonObject, jsonObject2);
    }
}

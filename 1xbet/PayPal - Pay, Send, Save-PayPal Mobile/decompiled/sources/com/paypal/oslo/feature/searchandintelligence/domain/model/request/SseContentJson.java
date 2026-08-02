package com.paypal.oslo.feature.searchandintelligence.domain.model.request;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bq\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/SseContentJson;", "", "Companion", "Text", "Action", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/SseContentJson$Action;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/SseContentJson$Text;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface SseContentJson {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Companion INSTANCE = com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Companion.Camera2StreamConfigurationMap;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/SseContentJson$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/SseContentJson;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Action.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Text.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson$Action$$serializer.INSTANCE, com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson$Text$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/SseContentJson$Text;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/SseContentJson;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/TextContentJson;", "textContent", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/TextContentJson;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/searchandintelligence/domain/model/request/TextContentJson;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/TextContentJson;", "copy", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/TextContentJson;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/SseContentJson$Text;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$search_and_intelligence_prodRelease", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/SseContentJson$Text;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/TextContentJson;", "getTextContent", "getTextContent$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    @kotlinx.serialization.SerialName("TEXT")
    public static final /* data */ class Text implements com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Text.Companion INSTANCE = new com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Text.Companion(null);
        private final com.paypal.oslo.feature.searchandintelligence.domain.model.request.TextContentJson textContent;

        @kotlinx.serialization.SerialName("text_content")
        public static /* synthetic */ void getTextContent$annotations() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/SseContentJson$Text$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/SseContentJson$Text;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Text> serializer() {
                return com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson$Text$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Text(int i, com.paypal.oslo.feature.searchandintelligence.domain.model.request.TextContentJson textContentJson, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson$Text$$serializer.INSTANCE.getDescriptor());
            }
            this.textContent = textContentJson;
        }

        public Text(com.paypal.oslo.feature.searchandintelligence.domain.model.request.TextContentJson textContentJson) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textContentJson, "");
            this.textContent = textContentJson;
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.model.request.TextContentJson getTextContent() {
            return this.textContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.searchandintelligence.domain.model.request.TextContentJson textContentJson = this.textContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Text(textContent=");
            sb.append(textContentJson);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.textContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Text) && kotlin.jvm.internal.Intrinsics.areEqual(this.textContent, ((com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Text) other).textContent);
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Text copy(com.paypal.oslo.feature.searchandintelligence.domain.model.request.TextContentJson textContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textContent, "");
            return new com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Text(textContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.domain.model.request.TextContentJson getTextContent() {
            return this.textContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Text copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Text text, com.paypal.oslo.feature.searchandintelligence.domain.model.request.TextContentJson textContentJson, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                textContentJson = text.textContent;
            }
            return text.copy(textContentJson);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/SseContentJson$Action;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/SseContentJson;", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_CONTENT_KEY, "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;", "copy", "(Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/SseContentJson$Action;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$search_and_intelligence_prodRelease", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/SseContentJson$Action;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;", "getActionContent", "getActionContent$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    @kotlinx.serialization.SerialName("ACTION")
    public static final /* data */ class Action implements com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson {
        private final com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Action.Companion INSTANCE = new com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Action.Companion(null);
        public static final int $stable = com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent.$stable;

        @kotlinx.serialization.SerialName("action_content")
        public static /* synthetic */ void getActionContent$annotations() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/SseContentJson$Action$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/request/SseContentJson$Action;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Action> serializer() {
                return com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson$Action$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Action(int i, com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson$Action$$serializer.INSTANCE.getDescriptor());
            }
            this.actionContent = actionContent;
        }

        public Action(com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionContent, "");
            this.actionContent = actionContent;
        }

        public final com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent getActionContent() {
            return this.actionContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent = this.actionContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Action(actionContent=");
            sb.append(actionContent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.actionContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Action) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionContent, ((com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Action) other).actionContent);
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Action copy(com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionContent, "");
            return new com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Action(actionContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent getActionContent() {
            return this.actionContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Action copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Action action, com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                actionContent = action.actionContent;
            }
            return action.copy(actionContent);
        }
    }
}

package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002('B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR$\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrlComponents;", "", "", "path", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrlQueryParameter;", "queryParameters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrlComponents;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrlComponents;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getPath", "Ljava/util/List;", "getQueryParameters", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ContentUrlComponents {
    private final java.lang.String path;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlQueryParameter> queryParameters;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents.$r8$lambda$2s03HJyfupAYQZdV2578Uh7qNWo();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrlComponents$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrlComponents;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ContentUrlComponents(int i, java.lang.String str, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents$$serializer.INSTANCE.getDescriptor());
        }
        this.path = str;
        this.queryParameters = list;
    }

    public ContentUrlComponents(java.lang.String str, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlQueryParameter> list) {
        this.path = str;
        this.queryParameters = list;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.path);
        output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.queryParameters);
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlQueryParameter> getQueryParameters() {
        return this.queryParameters;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$2s03HJyfupAYQZdV2578Uh7qNWo() {
        return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlQueryParameter$$serializer.INSTANCE));
    }

    public final java.lang.String toString() {
        java.lang.String str = this.path;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlQueryParameter> list = this.queryParameters;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentUrlComponents(path=");
        sb.append(str);
        sb.append(", queryParameters=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.path;
        int hashCode = str == null ? 0 : str.hashCode();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlQueryParameter> list = this.queryParameters;
        return (hashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents contentUrlComponents = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.path, contentUrlComponents.path) && kotlin.jvm.internal.Intrinsics.areEqual(this.queryParameters, contentUrlComponents.queryParameters);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents copy(java.lang.String path, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlQueryParameter> queryParameters) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents(path, queryParameters);
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlQueryParameter> component2() {
        return this.queryParameters;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents contentUrlComponents, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = contentUrlComponents.path;
        }
        if ((i & 2) != 0) {
            list = contentUrlComponents.queryParameters;
        }
        return contentUrlComponents.copy(str, list);
    }
}

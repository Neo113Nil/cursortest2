package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f"}, d2 = {"Lcom/apollographql/apollo/api/InterfaceType;", "Lcom/apollographql/apollo/api/CompiledNamedType;", "", "name", "", "keyFields", "implements", "embeddedFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Lcom/apollographql/apollo/api/InterfaceType$Builder;", "newBuilder", "()Lcom/apollographql/apollo/api/InterfaceType$Builder;", "Ljava/util/List;", "getKeyFields", "()Ljava/util/List;", "getImplements", "getEmbeddedFields", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InterfaceType extends com.apollographql.apollo.api.CompiledNamedType {
    private final java.util.List<java.lang.String> embeddedFields;
    private final java.util.List<com.apollographql.apollo.api.InterfaceType> implements;
    private final java.util.List<java.lang.String> keyFields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterfaceType(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<com.apollographql.apollo.api.InterfaceType> list2, java.util.List<java.lang.String> list3) {
        super(str, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.keyFields = list;
        this.implements = list2;
        this.embeddedFields = list3;
    }

    public final java.util.List<java.lang.String> getKeyFields() {
        return this.keyFields;
    }

    public final java.util.List<com.apollographql.apollo.api.InterfaceType> getImplements() {
        return this.implements;
    }

    public final java.util.List<java.lang.String> getEmbeddedFields() {
        return this.embeddedFields;
    }

    public final com.apollographql.apollo.api.InterfaceType.Builder newBuilder() {
        return new com.apollographql.apollo.api.InterfaceType.Builder(this);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001b\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\r\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015"}, d2 = {"Lcom/apollographql/apollo/api/InterfaceType$Builder;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Lcom/apollographql/apollo/api/InterfaceType;", "interfaceType", "(Lcom/apollographql/apollo/api/InterfaceType;)V", "", "keyFields", "(Ljava/util/List;)Lcom/apollographql/apollo/api/InterfaceType$Builder;", "implements", "interfaces", "embeddedFields", "build", "()Lcom/apollographql/apollo/api/InterfaceType;", "Ljava/lang/String;", "getName$apollo_api", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Builder {
        private java.util.List<com.apollographql.apollo.api.InterfaceType> Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private java.util.List<java.lang.String> getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor;
        private final java.lang.String name;

        public Builder(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
            this.getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.emptyList();
            this.Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.emptyList();
            this.getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.emptyList();
        }

        /* renamed from: getName$apollo_api, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(com.apollographql.apollo.api.InterfaceType interfaceType) {
            this(interfaceType.getName());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceType, "");
            this.getHighSpeedVideoFpsRangesFor = interfaceType.getKeyFields();
            this.Camera2StreamConfigurationMap = interfaceType.getImplements();
            this.getHighSpeedVideoSizes = interfaceType.getEmbeddedFields();
        }

        public final com.apollographql.apollo.api.InterfaceType.Builder keyFields(java.util.List<java.lang.String> keyFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyFields, "");
            this.getHighSpeedVideoFpsRangesFor = keyFields;
            return this;
        }

        public final com.apollographql.apollo.api.InterfaceType.Builder interfaces(java.util.List<com.apollographql.apollo.api.InterfaceType> r2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "");
            this.Camera2StreamConfigurationMap = r2;
            return this;
        }

        public final com.apollographql.apollo.api.InterfaceType.Builder embeddedFields(java.util.List<java.lang.String> embeddedFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddedFields, "");
            this.getHighSpeedVideoSizes = embeddedFields;
            return this;
        }

        public final com.apollographql.apollo.api.InterfaceType build() {
            return new com.apollographql.apollo.api.InterfaceType(this.name, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        }
    }
}

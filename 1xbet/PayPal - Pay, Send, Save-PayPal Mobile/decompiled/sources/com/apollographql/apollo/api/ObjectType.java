package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0013B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010"}, d2 = {"Lcom/apollographql/apollo/api/ObjectType;", "Lcom/apollographql/apollo/api/CompiledNamedType;", "", "name", "", "keyFields", "Lcom/apollographql/apollo/api/InterfaceType;", "implements", "embeddedFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Lcom/apollographql/apollo/api/ObjectType$Builder;", "newBuilder", "()Lcom/apollographql/apollo/api/ObjectType$Builder;", "Ljava/util/List;", "getKeyFields", "()Ljava/util/List;", "getImplements", "getEmbeddedFields", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ObjectType extends com.apollographql.apollo.api.CompiledNamedType {
    private final java.util.List<java.lang.String> embeddedFields;
    private final java.util.List<com.apollographql.apollo.api.InterfaceType> implements;
    private final java.util.List<java.lang.String> keyFields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObjectType(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<com.apollographql.apollo.api.InterfaceType> list2, java.util.List<java.lang.String> list3) {
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

    public final com.apollographql.apollo.api.ObjectType.Builder newBuilder() {
        return new com.apollographql.apollo.api.ObjectType.Builder(this);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001b\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u000e\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016"}, d2 = {"Lcom/apollographql/apollo/api/ObjectType$Builder;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Lcom/apollographql/apollo/api/ObjectType;", "objectType", "(Lcom/apollographql/apollo/api/ObjectType;)V", "", "keyFields", "(Ljava/util/List;)Lcom/apollographql/apollo/api/ObjectType$Builder;", "Lcom/apollographql/apollo/api/InterfaceType;", "implements", "interfaces", "embeddedFields", "build", "()Lcom/apollographql/apollo/api/ObjectType;", "Ljava/lang/String;", "getName$apollo_api", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private java.util.List<com.apollographql.apollo.api.InterfaceType> getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private java.util.List<java.lang.String> getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor;
        private final java.lang.String name;

        public Builder(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
            this.getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.emptyList();
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.emptyList();
            this.getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.emptyList();
        }

        /* renamed from: getName$apollo_api, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(com.apollographql.apollo.api.ObjectType objectType) {
            this(objectType.getName());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectType, "");
            this.getHighSpeedVideoFpsRanges = objectType.getKeyFields();
            this.getHighResolutionOutputSizeshNQ4ISI = objectType.getImplements();
            this.getHighSpeedVideoFpsRangesFor = objectType.getEmbeddedFields();
        }

        public final com.apollographql.apollo.api.ObjectType.Builder keyFields(java.util.List<java.lang.String> keyFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyFields, "");
            this.getHighSpeedVideoFpsRanges = keyFields;
            return this;
        }

        public final com.apollographql.apollo.api.ObjectType.Builder interfaces(java.util.List<com.apollographql.apollo.api.InterfaceType> r2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "");
            this.getHighResolutionOutputSizeshNQ4ISI = r2;
            return this;
        }

        public final com.apollographql.apollo.api.ObjectType.Builder embeddedFields(java.util.List<java.lang.String> embeddedFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddedFields, "");
            this.getHighSpeedVideoFpsRangesFor = embeddedFields;
            return this;
        }

        public final com.apollographql.apollo.api.ObjectType build() {
            return new com.apollographql.apollo.api.ObjectType(this.name, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
        }
    }
}

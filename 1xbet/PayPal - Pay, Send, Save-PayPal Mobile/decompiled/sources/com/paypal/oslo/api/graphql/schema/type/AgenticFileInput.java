package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJD\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR(\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AgenticFileInput;", "", "url", "Lcom/apollographql/apollo/api/Optional;", "", "filename", "", "Lcom/paypal/oslo/api/graphql/schema/type/MetadataItemInput;", "metadata", "<init>", "(Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/AgenticFileInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getUrl", "Lcom/apollographql/apollo/api/Optional;", "getFilename", "getMetadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AgenticFileInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> filename;
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.MetadataItemInput>> metadata;
    private final java.lang.Object url;

    /* JADX WARN: Multi-variable type inference failed */
    public AgenticFileInput(java.lang.Object obj, com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.MetadataItemInput>> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.url = obj;
        this.filename = optional;
        this.metadata = optional2;
    }

    public final java.lang.Object getUrl() {
        return this.url;
    }

    public /* synthetic */ AgenticFileInput(java.lang.Object obj, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getFilename() {
        return this.filename;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.MetadataItemInput>> getMetadata() {
        return this.metadata;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.url;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.filename;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.MetadataItemInput>> optional2 = this.metadata;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AgenticFileInput(url=");
        sb.append(obj);
        sb.append(", filename=");
        sb.append(optional);
        sb.append(", metadata=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.url.hashCode() * 31) + this.filename.hashCode()) * 31) + this.metadata.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.AgenticFileInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.AgenticFileInput agenticFileInput = (com.paypal.oslo.api.graphql.schema.type.AgenticFileInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, agenticFileInput.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.filename, agenticFileInput.filename) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, agenticFileInput.metadata);
    }

    public final com.paypal.oslo.api.graphql.schema.type.AgenticFileInput copy(java.lang.Object url, com.apollographql.apollo.api.Optional<java.lang.String> filename, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.MetadataItemInput>> metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filename, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        return new com.paypal.oslo.api.graphql.schema.type.AgenticFileInput(url, filename, metadata);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.MetadataItemInput>> component3() {
        return this.metadata;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.filename;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AgenticFileInput copy$default(com.paypal.oslo.api.graphql.schema.type.AgenticFileInput agenticFileInput, java.lang.Object obj, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = agenticFileInput.url;
        }
        if ((i & 2) != 0) {
            optional = agenticFileInput.filename;
        }
        if ((i & 4) != 0) {
            optional2 = agenticFileInput.metadata;
        }
        return agenticFileInput.copy(obj, optional, optional2);
    }
}

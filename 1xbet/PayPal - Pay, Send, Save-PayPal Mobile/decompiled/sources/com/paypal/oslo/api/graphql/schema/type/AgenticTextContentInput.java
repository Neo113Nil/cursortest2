package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR(\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AgenticTextContentInput;", "", "", "text", "Lcom/apollographql/apollo/api/Optional;", "", "Lcom/paypal/oslo/api/graphql/schema/type/MetadataItemInput;", "metadata", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/AgenticTextContentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText", "Lcom/apollographql/apollo/api/Optional;", "getMetadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AgenticTextContentInput {
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.MetadataItemInput>> metadata;
    private final java.lang.String text;

    /* JADX WARN: Multi-variable type inference failed */
    public AgenticTextContentInput(java.lang.String str, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.MetadataItemInput>> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.text = str;
        this.metadata = optional;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public /* synthetic */ AgenticTextContentInput(java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.MetadataItemInput>> getMetadata() {
        return this.metadata;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.text;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.MetadataItemInput>> optional = this.metadata;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AgenticTextContentInput(text=");
        sb.append(str);
        sb.append(", metadata=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.text.hashCode() * 31) + this.metadata.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.AgenticTextContentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.AgenticTextContentInput agenticTextContentInput = (com.paypal.oslo.api.graphql.schema.type.AgenticTextContentInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.text, agenticTextContentInput.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, agenticTextContentInput.metadata);
    }

    public final com.paypal.oslo.api.graphql.schema.type.AgenticTextContentInput copy(java.lang.String text, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.MetadataItemInput>> metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        return new com.paypal.oslo.api.graphql.schema.type.AgenticTextContentInput(text, metadata);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.MetadataItemInput>> component2() {
        return this.metadata;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AgenticTextContentInput copy$default(com.paypal.oslo.api.graphql.schema.type.AgenticTextContentInput agenticTextContentInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = agenticTextContentInput.text;
        }
        if ((i & 2) != 0) {
            optional = agenticTextContentInput.metadata;
        }
        return agenticTextContentInput.copy(str, optional);
    }
}

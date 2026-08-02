package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ArticleContentInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/Persona;", "persona", "Lcom/paypal/oslo/api/graphql/schema/type/Experience;", "experience", "", "contentId", "Lcom/apollographql/apollo/api/Optional;", "", "native", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/Persona;Lcom/paypal/oslo/api/graphql/schema/type/Experience;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/Persona;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/Experience;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/Persona;Lcom/paypal/oslo/api/graphql/schema/type/Experience;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ArticleContentInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/Persona;", "getPersona", "Lcom/paypal/oslo/api/graphql/schema/type/Experience;", "getExperience", "Ljava/lang/String;", "getContentId", "Lcom/apollographql/apollo/api/Optional;", "getNative"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ArticleContentInput {
    private final java.lang.String contentId;
    private final com.paypal.oslo.api.graphql.schema.type.Experience experience;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> native;
    private final com.paypal.oslo.api.graphql.schema.type.Persona persona;

    public ArticleContentInput(com.paypal.oslo.api.graphql.schema.type.Persona persona, com.paypal.oslo.api.graphql.schema.type.Experience experience, java.lang.String str, com.apollographql.apollo.api.Optional<java.lang.Boolean> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persona, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experience, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.persona = persona;
        this.experience = experience;
        this.contentId = str;
        this.native = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.Persona getPersona() {
        return this.persona;
    }

    public final com.paypal.oslo.api.graphql.schema.type.Experience getExperience() {
        return this.experience;
    }

    public final java.lang.String getContentId() {
        return this.contentId;
    }

    public /* synthetic */ ArticleContentInput(com.paypal.oslo.api.graphql.schema.type.Persona persona, com.paypal.oslo.api.graphql.schema.type.Experience experience, java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(persona, experience, str, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getNative() {
        return this.native;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.Persona persona = this.persona;
        com.paypal.oslo.api.graphql.schema.type.Experience experience = this.experience;
        java.lang.String str = this.contentId;
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional = this.native;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ArticleContentInput(persona=");
        sb.append(persona);
        sb.append(", experience=");
        sb.append(experience);
        sb.append(", contentId=");
        sb.append(str);
        sb.append(", native=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.persona.hashCode() * 31) + this.experience.hashCode()) * 31) + this.contentId.hashCode()) * 31) + this.native.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ArticleContentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ArticleContentInput articleContentInput = (com.paypal.oslo.api.graphql.schema.type.ArticleContentInput) other;
        return this.persona == articleContentInput.persona && this.experience == articleContentInput.experience && kotlin.jvm.internal.Intrinsics.areEqual(this.contentId, articleContentInput.contentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.native, articleContentInput.native);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ArticleContentInput copy(com.paypal.oslo.api.graphql.schema.type.Persona persona, com.paypal.oslo.api.graphql.schema.type.Experience experience, java.lang.String contentId, com.apollographql.apollo.api.Optional<java.lang.Boolean> r5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persona, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experience, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "");
        return new com.paypal.oslo.api.graphql.schema.type.ArticleContentInput(persona, experience, contentId, r5);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component4() {
        return this.native;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getContentId() {
        return this.contentId;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.Experience getExperience() {
        return this.experience;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.Persona getPersona() {
        return this.persona;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ArticleContentInput copy$default(com.paypal.oslo.api.graphql.schema.type.ArticleContentInput articleContentInput, com.paypal.oslo.api.graphql.schema.type.Persona persona, com.paypal.oslo.api.graphql.schema.type.Experience experience, java.lang.String str, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            persona = articleContentInput.persona;
        }
        if ((i & 2) != 0) {
            experience = articleContentInput.experience;
        }
        if ((i & 4) != 0) {
            str = articleContentInput.contentId;
        }
        if ((i & 8) != 0) {
            optional = articleContentInput.native;
        }
        return articleContentInput.copy(persona, experience, str, optional);
    }
}

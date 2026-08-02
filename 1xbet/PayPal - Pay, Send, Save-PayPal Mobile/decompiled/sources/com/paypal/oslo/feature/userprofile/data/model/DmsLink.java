package com.paypal.oslo.feature.userprofile.data.model;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\rR \u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/data/model/DmsLink;", "", "", "href", io.ktor.http.LinkHeader.Parameters.Rel, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/data/model/DmsLink;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$user_profile_prodRelease", "(Lcom/paypal/oslo/feature/userprofile/data/model/DmsLink;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getHref", "getHref$annotations", "()V", "getRel", "getRel$annotations", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class DmsLink {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.userprofile.data.model.DmsLink.Companion INSTANCE = new com.paypal.oslo.feature.userprofile.data.model.DmsLink.Companion(null);
    private final java.lang.String href;
    private final java.lang.String rel;

    @kotlinx.serialization.SerialName("href")
    public static /* synthetic */ void getHref$annotations() {
    }

    @kotlinx.serialization.SerialName(io.ktor.http.LinkHeader.Parameters.Rel)
    public static /* synthetic */ void getRel$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/data/model/DmsLink$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/userprofile/data/model/DmsLink;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.userprofile.data.model.DmsLink> serializer() {
            return com.paypal.oslo.feature.userprofile.data.model.DmsLink$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DmsLink(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.userprofile.data.model.DmsLink$$serializer.INSTANCE.getDescriptor());
        }
        this.href = str;
        this.rel = str2;
    }

    public DmsLink(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.href = str;
        this.rel = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$user_profile_prodRelease(com.paypal.oslo.feature.userprofile.data.model.DmsLink self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.href);
        output.encodeStringElement(serialDesc, 1, self.rel);
    }

    public final java.lang.String getHref() {
        return this.href;
    }

    public final java.lang.String getRel() {
        return this.rel;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.href;
        java.lang.String str2 = this.rel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DmsLink(href=");
        sb.append(str);
        sb.append(", rel=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.href.hashCode() * 31) + this.rel.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.userprofile.data.model.DmsLink)) {
            return false;
        }
        com.paypal.oslo.feature.userprofile.data.model.DmsLink dmsLink = (com.paypal.oslo.feature.userprofile.data.model.DmsLink) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.href, dmsLink.href) && kotlin.jvm.internal.Intrinsics.areEqual(this.rel, dmsLink.rel);
    }

    public final com.paypal.oslo.feature.userprofile.data.model.DmsLink copy(java.lang.String href, java.lang.String rel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(href, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rel, "");
        return new com.paypal.oslo.feature.userprofile.data.model.DmsLink(href, rel);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRel() {
        return this.rel;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getHref() {
        return this.href;
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.data.model.DmsLink copy$default(com.paypal.oslo.feature.userprofile.data.model.DmsLink dmsLink, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = dmsLink.href;
        }
        if ((i & 2) != 0) {
            str2 = dmsLink.rel;
        }
        return dmsLink.copy(str, str2);
    }
}

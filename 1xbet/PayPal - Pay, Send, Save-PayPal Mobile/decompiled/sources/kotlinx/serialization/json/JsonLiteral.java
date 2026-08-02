package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lkotlinx/serialization/json/JsonLiteral;", "Lkotlinx/serialization/json/JsonPrimitive;", "", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "", "isString", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "coerceToInlineType", "<init>", "(Ljava/lang/Object;ZLkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "()Z", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getCoerceToInlineType$kotlinx_serialization_json", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "content", "Ljava/lang/String;", "getContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonLiteral extends kotlinx.serialization.json.JsonPrimitive {
    private final kotlinx.serialization.descriptors.SerialDescriptor coerceToInlineType;
    private final java.lang.String content;
    private final boolean isString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonLiteral(java.lang.Object obj, boolean z, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.isString = z;
        this.coerceToInlineType = serialDescriptor;
        this.content = obj.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public /* synthetic */ JsonLiteral(java.lang.Object obj, boolean z, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z, (i & 4) != 0 ? null : serialDescriptor);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* renamed from: isString, reason: from getter */
    public final boolean getIsString() {
        return this.isString;
    }

    /* renamed from: getCoerceToInlineType$kotlinx_serialization_json, reason: from getter */
    public final kotlinx.serialization.descriptors.SerialDescriptor getCoerceToInlineType() {
        return this.coerceToInlineType;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final java.lang.String getContent() {
        return this.content;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final java.lang.String toString() {
        if (!getIsString()) {
            return getContent();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        kotlinx.serialization.json.internal.StringOpsKt.printQuoted(sb, getContent());
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        kotlinx.serialization.json.JsonLiteral jsonLiteral = (kotlinx.serialization.json.JsonLiteral) other;
        return getIsString() == jsonLiteral.getIsString() && kotlin.jvm.internal.Intrinsics.areEqual(getContent(), jsonLiteral.getContent());
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(getIsString()) * 31) + getContent().hashCode();
    }
}

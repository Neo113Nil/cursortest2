package kotlinx.serialization.json;

/* compiled from: JsonElement.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/json/JsonLiteral;", "Lkotlinx/serialization/json/JsonPrimitive;", "body", "", "isString", "", "coerceToInlineType", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "(Ljava/lang/Object;ZLkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Z", "getCoerceToInlineType$kotlinx_serialization_json", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "content", "", "getContent", "()Ljava/lang/String;", "toString", "equals", "other", "hashCode", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonLiteral extends kotlinx.serialization.json.JsonPrimitive {
    private final kotlinx.serialization.descriptors.SerialDescriptor coerceToInlineType;
    private final java.lang.String content;
    private final boolean isString;

    public /* synthetic */ JsonLiteral(java.lang.Object obj, boolean z, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z, (i & 4) != 0 ? null : serialDescriptor);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* renamed from: isString, reason: from getter */
    public boolean getIsString() {
        return this.isString;
    }

    /* renamed from: getCoerceToInlineType$kotlinx_serialization_json, reason: from getter */
    public final kotlinx.serialization.descriptors.SerialDescriptor getCoerceToInlineType() {
        return this.coerceToInlineType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonLiteral(java.lang.Object body, boolean z, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        this.isString = z;
        this.coerceToInlineType = serialDescriptor;
        this.content = body.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public java.lang.String getContent() {
        return this.content;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public java.lang.String toString() {
        if (!getIsString()) {
            return getContent();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        kotlinx.serialization.json.internal.StringOpsKt.printQuoted(sb, getContent());
        return sb.toString();
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        kotlinx.serialization.json.JsonLiteral jsonLiteral = (kotlinx.serialization.json.JsonLiteral) other;
        return getIsString() == jsonLiteral.getIsString() && kotlin.jvm.internal.Intrinsics.areEqual(getContent(), jsonLiteral.getContent());
    }

    public int hashCode() {
        return (kotlin.UByte$$ExternalSyntheticBackport0.m(getIsString()) * 31) + getContent().hashCode();
    }
}

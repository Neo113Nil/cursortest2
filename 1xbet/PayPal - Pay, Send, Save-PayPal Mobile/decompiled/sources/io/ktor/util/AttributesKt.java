package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b*\u001c\u0010\f\u001a\u0004\b\u0000\u0010\u0001\"\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0004"}, d2 = {"", "T", "", "name", "Lio/ktor/util/AttributeKey;", "AttributeKey", "(Ljava/lang/String;)Lio/ktor/util/AttributeKey;", "Lio/ktor/util/Attributes;", "other", "", "putAll", "(Lio/ktor/util/Attributes;Lio/ktor/util/Attributes;)V", "EquatableAttributeKey"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AttributesKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Please use `AttributeKey` class instead", replaceWith = @kotlin.ReplaceWith(expression = "AttributeKey", imports = {}))
    public static /* synthetic */ void EquatableAttributeKey$annotations() {
    }

    public static final void putAll(io.ktor.util.Attributes attributes, io.ktor.util.Attributes attributes2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes2, "");
        java.util.Iterator<T> it = attributes2.getAllKeys().iterator();
        while (it.hasNext()) {
            io.ktor.util.AttributeKey attributeKey = (io.ktor.util.AttributeKey) it.next();
            kotlin.jvm.internal.Intrinsics.checkNotNull(attributeKey, "");
            attributes.put(attributeKey, attributes2.get(attributeKey));
        }
    }

    public static final /* synthetic */ <T> io.ktor.util.AttributeKey<T> AttributeKey(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        } catch (java.lang.Throwable unused) {
        }
        return new io.ktor.util.AttributeKey<>(str, new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null));
    }
}

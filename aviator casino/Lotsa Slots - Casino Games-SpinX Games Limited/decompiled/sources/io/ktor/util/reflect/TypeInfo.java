package io.ktor.util.reflect;

/* compiled from: Type.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0017\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lio/ktor/util/reflect/TypeInfo;", "", "Lkotlin/reflect/KClass;", "type", "Lkotlin/reflect/KType;", "kotlinType", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V", "Ljava/lang/reflect/Type;", "Lio/ktor/util/reflect/Type;", "reifiedType", "(Lkotlin/reflect/KClass;Ljava/lang/reflect/Type;Lkotlin/reflect/KType;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "Lkotlin/reflect/KType;", "getKotlinType", "()Lkotlin/reflect/KType;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TypeInfo {
    private final kotlin.reflect.KType kotlinType;
    private final kotlin.reflect.KClass<?> type;

    public TypeInfo(kotlin.reflect.KClass<?> type, kotlin.reflect.KType kType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.kotlinType = kType;
    }

    public /* synthetic */ TypeInfo(kotlin.reflect.KClass kClass, kotlin.reflect.KType kType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, (i & 2) != 0 ? null : kType);
    }

    public final kotlin.reflect.KClass<?> getType() {
        return this.type;
    }

    public final kotlin.reflect.KType getKotlinType() {
        return this.kotlinType;
    }

    public /* synthetic */ TypeInfo(kotlin.reflect.KClass kClass, java.lang.reflect.Type type, kotlin.reflect.KType kType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, type, (i & 4) != 0 ? null : kType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(message = "Use constructor without reifiedType parameter.", replaceWith = @kotlin.ReplaceWith(expression = "TypeInfo(type, kotlinType)", imports = {}))
    public TypeInfo(kotlin.reflect.KClass<?> type, java.lang.reflect.Type reifiedType, kotlin.reflect.KType kType) {
        this(type, kType);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reifiedType, "reifiedType");
    }

    public int hashCode() {
        kotlin.reflect.KType kType = this.kotlinType;
        return kType != null ? kType.hashCode() : this.type.hashCode();
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.util.reflect.TypeInfo)) {
            return false;
        }
        kotlin.reflect.KType kType = this.kotlinType;
        if (kType == null) {
            io.ktor.util.reflect.TypeInfo typeInfo = (io.ktor.util.reflect.TypeInfo) other;
            if (typeInfo.kotlinType == null) {
                return kotlin.jvm.internal.Intrinsics.areEqual(this.type, typeInfo.type);
            }
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(kType, ((io.ktor.util.reflect.TypeInfo) other).kotlinType);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TypeInfo(");
        kotlin.reflect.KAnnotatedElement kAnnotatedElement = this.kotlinType;
        if (kAnnotatedElement == null) {
            kAnnotatedElement = this.type;
        }
        sb.append(kAnnotatedElement);
        sb.append(')');
        return sb.toString();
    }
}

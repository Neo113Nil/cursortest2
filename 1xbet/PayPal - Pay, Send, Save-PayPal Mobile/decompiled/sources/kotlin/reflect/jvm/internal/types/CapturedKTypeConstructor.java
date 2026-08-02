package kotlin.reflect.jvm.internal.types;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlin/reflect/jvm/internal/types/CapturedKTypeConstructor;", "Lkotlin/reflect/jvm/internal/impl/types/model/CapturedTypeConstructorMarker;", "Lkotlin/reflect/KTypeProjection;", "projection", "<init>", "(Lkotlin/reflect/KTypeProjection;)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/reflect/KTypeProjection;", "getProjection", "()Lkotlin/reflect/KTypeProjection;", "", "Lkotlin/reflect/KType;", "supertypes", "Ljava/util/List;", "getSupertypes", "()Ljava/util/List;", "setSupertypes", "(Ljava/util/List;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CapturedKTypeConstructor implements kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker {
    private final kotlin.reflect.KTypeProjection projection;
    public java.util.List<? extends kotlin.reflect.KType> supertypes;

    public CapturedKTypeConstructor(kotlin.reflect.KTypeProjection kTypeProjection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kTypeProjection, "");
        this.projection = kTypeProjection;
    }

    public final kotlin.reflect.KTypeProjection getProjection() {
        return this.projection;
    }

    public final java.util.List<kotlin.reflect.KType> getSupertypes() {
        java.util.List list = this.supertypes;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setSupertypes(java.util.List<? extends kotlin.reflect.KType> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.supertypes = list;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CapturedType(");
        sb.append(this.projection);
        sb.append(')');
        return sb.toString();
    }
}

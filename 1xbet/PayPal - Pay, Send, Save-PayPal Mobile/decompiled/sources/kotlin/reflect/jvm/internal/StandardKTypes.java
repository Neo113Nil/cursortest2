package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Lkotlin/reflect/jvm/internal/StandardKTypes;", "", "<init>", "()V", "Lkotlin/reflect/KType;", "ANY", "Lkotlin/reflect/KType;", "getANY", "()Lkotlin/reflect/KType;", "NULLABLE_ANY", "getNULLABLE_ANY", "CLONEABLE", "getCLONEABLE", "SERIALIZABLE", "getSERIALIZABLE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StandardKTypes {
    public static final kotlin.reflect.jvm.internal.StandardKTypes INSTANCE = new kotlin.reflect.jvm.internal.StandardKTypes();
    private static final kotlin.reflect.KType ANY = kotlin.jvm.internal.Reflection.typeOf(java.lang.Object.class);
    private static final kotlin.reflect.KType NULLABLE_ANY = kotlin.jvm.internal.Reflection.nullableTypeOf(java.lang.Object.class);
    private static final kotlin.reflect.KType CLONEABLE = kotlin.jvm.internal.Reflection.typeOf(java.lang.Cloneable.class);
    private static final kotlin.reflect.KType SERIALIZABLE = kotlin.jvm.internal.Reflection.typeOf(java.io.Serializable.class);

    private StandardKTypes() {
    }

    public final kotlin.reflect.KType getANY() {
        return ANY;
    }

    public final kotlin.reflect.KType getNULLABLE_ANY() {
        return NULLABLE_ANY;
    }

    public final kotlin.reflect.KType getCLONEABLE() {
        return CLONEABLE;
    }

    public final kotlin.reflect.KType getSERIALIZABLE() {
        return SERIALIZABLE;
    }
}

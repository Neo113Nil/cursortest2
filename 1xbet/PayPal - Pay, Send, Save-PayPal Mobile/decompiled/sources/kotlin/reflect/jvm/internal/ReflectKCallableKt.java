package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u001c\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectKCallable;", "", "isBound", "(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReflectKCallableKt {
    public static final boolean isBound(kotlin.reflect.jvm.internal.ReflectKCallable<?> reflectKCallable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reflectKCallable, "");
        return reflectKCallable.getRawBoundReceiver() != kotlin.jvm.internal.CallableReference.NO_RECEIVER;
    }
}

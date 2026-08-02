package okhttp3.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "T", "Ljava/util/concurrent/atomic/AtomicReference;", "Lokhttp3/internal/Tags;", "Lkotlin/reflect/KClass;", "type", "Lkotlin/Function0;", "compute", "computeIfAbsent", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TagsKt {
    public static final <T> T computeIfAbsent(java.util.concurrent.atomic.AtomicReference<okhttp3.internal.Tags> atomicReference, kotlin.reflect.KClass<T> kClass, kotlin.jvm.functions.Function0<? extends T> function0) {
        okhttp3.internal.Tags tags;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        T t = null;
        do {
            tags = atomicReference.get();
            T t2 = (T) tags.get(kClass);
            if (t2 != null) {
                return t2;
            }
            if (t == null) {
                t = function0.invoke();
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, tags, tags.plus(kClass, t)));
        return t;
    }
}

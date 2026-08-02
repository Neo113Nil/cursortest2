package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00028\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/ClassValueCache;", "V", "Lkotlin/reflect/jvm/internal/CacheByClass;", "Lkotlin/Function1;", "Ljava/lang/Class;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "get", "(Ljava/lang/Class;)Ljava/lang/Object;", "", "clear", "()V", "Lkotlin/reflect/jvm/internal/ComputableClassValue;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/reflect/jvm/internal/ComputableClassValue;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ClassValueCache<V> extends kotlin.reflect.jvm.internal.CacheByClass<V> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private volatile kotlin.reflect.jvm.internal.ComputableClassValue<V> getHighSpeedVideoFpsRanges;

    public ClassValueCache(kotlin.jvm.functions.Function1<? super java.lang.Class<?>, ? extends V> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.ComputableClassValue<>(function1);
    }

    @Override // kotlin.reflect.jvm.internal.CacheByClass
    public final V get(java.lang.Class<?> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.reflect.jvm.internal.ComputableClassValue<V> computableClassValue = this.getHighSpeedVideoFpsRanges;
        V v = computableClassValue.get(p0).get();
        if (v != null) {
            return v;
        }
        computableClassValue.remove(p0);
        V v2 = computableClassValue.get(p0).get();
        return v2 != null ? v2 : computableClassValue.getHighSpeedVideoSizes.invoke(p0);
    }

    @Override // kotlin.reflect.jvm.internal.CacheByClass
    public final void clear() {
        this.getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.ComputableClassValue<>(this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes);
    }
}

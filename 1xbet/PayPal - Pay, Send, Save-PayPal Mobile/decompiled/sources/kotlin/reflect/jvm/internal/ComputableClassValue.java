package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\bR!\u0010\u000b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/reflect/jvm/internal/ComputableClassValue;", "V", "Ljava/lang/ClassValue;", "Ljava/lang/ref/SoftReference;", "Lkotlin/Function1;", "Ljava/lang/Class;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ComputableClassValue<V> extends java.lang.ClassValue<java.lang.ref.SoftReference<V>> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    public final kotlin.jvm.functions.Function1<java.lang.Class<?>, V> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ComputableClassValue(kotlin.jvm.functions.Function1<? super java.lang.Class<?>, ? extends V> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = function1;
    }

    @Override // java.lang.ClassValue
    public final /* synthetic */ java.lang.Object computeValue(java.lang.Class cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return new java.lang.ref.SoftReference(this.getHighSpeedVideoSizes.invoke(cls));
    }
}

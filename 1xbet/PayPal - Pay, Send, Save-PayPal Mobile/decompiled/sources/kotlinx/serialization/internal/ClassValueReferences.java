package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/serialization/internal/ClassValueReferences;", "T", "Ljava/lang/ClassValue;", "Lkotlinx/serialization/internal/MutableSoftReference;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ClassValueReferences<T> extends java.lang.ClassValue<kotlinx.serialization.internal.MutableSoftReference<T>> {
    @Override // java.lang.ClassValue
    public final /* synthetic */ java.lang.Object computeValue(java.lang.Class cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return new kotlinx.serialization.internal.MutableSoftReference();
    }
}

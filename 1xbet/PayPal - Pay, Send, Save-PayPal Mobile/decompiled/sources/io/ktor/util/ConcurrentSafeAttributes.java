package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u000f\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00040\f8\u0015X\u0094\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/util/ConcurrentSafeAttributes;", "Lio/ktor/util/AttributesJvmBase;", "<init>", "()V", "", "T", "Lio/ktor/util/AttributeKey;", "p0", "Lkotlin/Function0;", "p1", "computeIfAbsent", "(Lio/ktor/util/AttributeKey;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/util/concurrent/ConcurrentHashMap;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/ConcurrentHashMap;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ConcurrentSafeAttributes extends io.ktor.util.AttributesJvmBase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.ConcurrentHashMap<io.ktor.util.AttributeKey<?>, java.lang.Object> Camera2StreamConfigurationMap = new java.util.concurrent.ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.util.Attributes
    public final <T> T computeIfAbsent(io.ktor.util.AttributeKey<T> p0, kotlin.jvm.functions.Function0<? extends T> p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        T t = (T) this.Camera2StreamConfigurationMap.get(p0);
        if (t != null) {
            return t;
        }
        T invoke = p1.invoke();
        java.lang.Object putIfAbsent = this.Camera2StreamConfigurationMap.putIfAbsent(p0, invoke);
        if (putIfAbsent != 0) {
            invoke = putIfAbsent;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
        return invoke;
    }

    @Override // io.ktor.util.AttributesJvmBase
    public final /* bridge */ /* synthetic */ java.util.Map Camera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }
}

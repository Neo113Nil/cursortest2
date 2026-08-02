package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR,\u0010\u0011\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00040\f8\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lio/ktor/util/HashMapAttributes;", "Lio/ktor/util/AttributesJvmBase;", "<init>", "()V", "", "T", "Lio/ktor/util/AttributeKey;", "p0", "Lkotlin/Function0;", "p1", "computeIfAbsent", "(Lio/ktor/util/AttributeKey;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "Camera2StreamConfigurationMap", "()Ljava/util/Map;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class HashMapAttributes extends io.ktor.util.AttributesJvmBase {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<io.ktor.util.AttributeKey<?>, java.lang.Object> getHighSpeedVideoSizes = new java.util.HashMap();

    @Override // io.ktor.util.AttributesJvmBase
    protected final java.util.Map<io.ktor.util.AttributeKey<?>, java.lang.Object> Camera2StreamConfigurationMap() {
        return this.getHighSpeedVideoSizes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.util.Attributes
    public final <T> T computeIfAbsent(io.ktor.util.AttributeKey<T> p0, kotlin.jvm.functions.Function0<? extends T> p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        T t = (T) this.getHighSpeedVideoSizes.get(p0);
        if (t != null) {
            return t;
        }
        T invoke = p1.invoke();
        java.lang.Object put = this.getHighSpeedVideoSizes.put(p0, invoke);
        if (put != 0) {
            invoke = put;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
        return invoke;
    }
}

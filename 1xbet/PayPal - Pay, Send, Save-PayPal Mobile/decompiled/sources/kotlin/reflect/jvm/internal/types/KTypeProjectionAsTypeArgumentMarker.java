package kotlin.reflect.jvm.internal.types;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/reflect/jvm/internal/types/KTypeProjectionAsTypeArgumentMarker;", "Lkotlin/reflect/jvm/internal/impl/types/model/TypeArgumentMarker;", "Lkotlin/reflect/KTypeProjection;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lkotlin/reflect/KTypeProjection;)V", "Lkotlin/reflect/KTypeProjection;", "getValue", "()Lkotlin/reflect/KTypeProjection;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KTypeProjectionAsTypeArgumentMarker implements kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker {
    private final kotlin.reflect.KTypeProjection value;

    public KTypeProjectionAsTypeArgumentMarker(kotlin.reflect.KTypeProjection kTypeProjection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kTypeProjection, "");
        this.value = kTypeProjection;
    }

    public final kotlin.reflect.KTypeProjection getValue() {
        return this.value;
    }
}

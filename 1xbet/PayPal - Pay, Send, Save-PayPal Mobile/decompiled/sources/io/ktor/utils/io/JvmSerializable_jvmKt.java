package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a-\u0010\u0005\u001a\u00020\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006*\n\u0010\b\"\u00020\u00072\u00020\u0007"}, d2 = {"", "T", "Lio/ktor/utils/io/JvmSerializer;", "serializer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "JvmSerializerReplacement", "(Lio/ktor/utils/io/JvmSerializer;Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/io/Serializable;", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JvmSerializable_jvmKt {
    public static /* synthetic */ void JvmSerializable$annotations() {
    }

    public static final <T> java.lang.Object JvmSerializerReplacement(io.ktor.utils.io.JvmSerializer<T> jvmSerializer, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jvmSerializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        return new io.ktor.utils.io.DefaultJvmSerializerReplacement(jvmSerializer, t);
    }
}

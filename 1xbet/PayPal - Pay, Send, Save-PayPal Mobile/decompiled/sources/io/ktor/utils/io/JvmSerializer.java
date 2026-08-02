package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lio/ktor/utils/io/JvmSerializer;", "T", "Ljava/io/Serializable;", "Lio/ktor/utils/io/getHighSpeedVideoFpsRangesFor;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "jvmSerialize", "(Ljava/lang/Object;)[B", "jvmDeserialize", "([B)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface JvmSerializer<T> extends java.io.Serializable {
    T jvmDeserialize(byte[] value);

    byte[] jvmSerialize(T value);
}

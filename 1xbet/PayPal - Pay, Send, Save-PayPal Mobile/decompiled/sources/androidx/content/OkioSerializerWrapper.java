package androidx.content;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00028\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/datastore/OkioSerializerWrapper;", "T", "Landroidx/datastore/core/okio/OkioSerializer;", "Landroidx/datastore/core/Serializer;", "delegate", "<init>", "(Landroidx/datastore/core/Serializer;)V", "Lokio/BufferedSource;", "source", "readFrom", "(Lokio/BufferedSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Lokio/BufferedSink;", "sink", "", "writeTo", "(Ljava/lang/Object;Lokio/BufferedSink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/datastore/core/Serializer;", "Camera2StreamConfigurationMap", "getDefaultValue", "()Ljava/lang/Object;", "defaultValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OkioSerializerWrapper<T> implements androidx.content.core.okio.OkioSerializer<T> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.content.core.Serializer<T> Camera2StreamConfigurationMap;

    public OkioSerializerWrapper(androidx.content.core.Serializer<T> serializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        this.Camera2StreamConfigurationMap = serializer;
    }

    @Override // androidx.content.core.okio.OkioSerializer
    public final T getDefaultValue() {
        return this.Camera2StreamConfigurationMap.getDefaultValue();
    }

    @Override // androidx.content.core.okio.OkioSerializer
    public final java.lang.Object readFrom(okio.BufferedSource bufferedSource, kotlin.coroutines.Continuation<? super T> continuation) {
        return this.Camera2StreamConfigurationMap.readFrom(bufferedSource.inputStream(), continuation);
    }

    @Override // androidx.content.core.okio.OkioSerializer
    public final java.lang.Object writeTo(T t, okio.BufferedSink bufferedSink, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object writeTo = this.Camera2StreamConfigurationMap.writeTo(t, bufferedSink.outputStream(), continuation);
        return writeTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? writeTo : kotlin.Unit.INSTANCE;
    }
}

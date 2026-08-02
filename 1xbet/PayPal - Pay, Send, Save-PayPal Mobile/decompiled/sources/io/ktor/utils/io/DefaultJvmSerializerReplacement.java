package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001b*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u001bB!\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lio/ktor/utils/io/DefaultJvmSerializerReplacement;", "", "T", "Ljava/io/Externalizable;", "Lio/ktor/utils/io/JvmSerializer;", "serializer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lio/ktor/utils/io/JvmSerializer;Ljava/lang/Object;)V", "()V", "Ljava/io/ObjectOutput;", "out", "", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "in", "readExternal", "(Ljava/io/ObjectInput;)V", "readResolve", "()Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lio/ktor/utils/io/JvmSerializer;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DefaultJvmSerializerReplacement<T> implements java.io.Externalizable {
    private static final long serialVersionUID = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private T Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private io.ktor.utils.io.JvmSerializer<T> getHighSpeedVideoSizes;

    public DefaultJvmSerializerReplacement(io.ktor.utils.io.JvmSerializer<T> jvmSerializer, T t) {
        this.getHighSpeedVideoSizes = jvmSerializer;
        this.Camera2StreamConfigurationMap = t;
    }

    public DefaultJvmSerializerReplacement() {
        this(null, null);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput out) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "");
        out.writeObject(this.getHighSpeedVideoSizes);
        io.ktor.utils.io.JvmSerializer<T> jvmSerializer = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(jvmSerializer);
        T t = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(t);
        out.writeObject(jvmSerializer.jvmSerialize(t));
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput in) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(in, "");
        java.lang.Object readObject = in.readObject();
        kotlin.jvm.internal.Intrinsics.checkNotNull(readObject, "");
        io.ktor.utils.io.JvmSerializer<T> jvmSerializer = (io.ktor.utils.io.JvmSerializer) readObject;
        this.getHighSpeedVideoSizes = jvmSerializer;
        kotlin.jvm.internal.Intrinsics.checkNotNull(jvmSerializer);
        java.lang.Object readObject2 = in.readObject();
        kotlin.jvm.internal.Intrinsics.checkNotNull(readObject2, "");
        this.Camera2StreamConfigurationMap = jvmSerializer.jvmDeserialize((byte[]) readObject2);
    }

    private final java.lang.Object readResolve() {
        T t = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(t);
        return t;
    }
}

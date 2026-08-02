package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public interface LazyStringList extends kotlin.reflect.jvm.internal.impl.protobuf.ProtocolStringList {
    void add(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString);

    kotlin.reflect.jvm.internal.impl.protobuf.ByteString getByteString(int i);

    java.util.List<?> getUnderlyingElements();

    kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList getUnmodifiableView();
}

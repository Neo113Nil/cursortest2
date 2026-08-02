package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public interface LazyStringList extends androidx.content.preferences.protobuf.ProtocolStringList {
    void add(androidx.content.preferences.protobuf.ByteString byteString);

    void add(byte[] bArr);

    boolean addAllByteArray(java.util.Collection<byte[]> collection);

    boolean addAllByteString(java.util.Collection<? extends androidx.content.preferences.protobuf.ByteString> collection);

    java.util.List<byte[]> asByteArrayList();

    byte[] getByteArray(int i);

    androidx.content.preferences.protobuf.ByteString getByteString(int i);

    java.lang.Object getRaw(int i);

    java.util.List<?> getUnderlyingElements();

    androidx.content.preferences.protobuf.LazyStringList getUnmodifiableView();

    void mergeFrom(androidx.content.preferences.protobuf.LazyStringList lazyStringList);

    void set(int i, androidx.content.preferences.protobuf.ByteString byteString);

    void set(int i, byte[] bArr);
}

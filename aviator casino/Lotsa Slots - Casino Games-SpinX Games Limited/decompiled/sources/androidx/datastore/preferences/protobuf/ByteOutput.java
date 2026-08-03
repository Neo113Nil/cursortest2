package androidx.datastore.preferences.protobuf;

/* loaded from: classes2.dex */
public abstract class ByteOutput {
    public abstract void write(byte value) throws java.io.IOException;

    public abstract void write(java.nio.ByteBuffer value) throws java.io.IOException;

    public abstract void write(byte[] value, int offset, int length) throws java.io.IOException;

    public abstract void writeLazy(java.nio.ByteBuffer value) throws java.io.IOException;

    public abstract void writeLazy(byte[] value, int offset, int length) throws java.io.IOException;
}

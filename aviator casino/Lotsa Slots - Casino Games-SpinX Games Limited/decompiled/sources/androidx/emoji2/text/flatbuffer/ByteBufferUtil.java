package androidx.emoji2.text.flatbuffer;

/* loaded from: classes2.dex */
public class ByteBufferUtil {
    public static int getSizePrefix(java.nio.ByteBuffer byteBuffer) {
        return byteBuffer.getInt(byteBuffer.position());
    }

    public static java.nio.ByteBuffer removeSizePrefix(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(duplicate.position() + 4);
        return duplicate;
    }
}

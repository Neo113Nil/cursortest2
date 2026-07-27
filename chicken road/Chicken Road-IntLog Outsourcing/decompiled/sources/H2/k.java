package H2;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface k {
    Object decodeMessage(ByteBuffer byteBuffer);

    ByteBuffer encodeMessage(Object obj);
}

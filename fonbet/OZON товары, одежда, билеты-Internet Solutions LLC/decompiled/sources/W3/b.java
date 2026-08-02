package W3;

import j3.t;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public abstract class b {
    public final t a(a aVar) {
        ByteBuffer byteBuffer = aVar.f98184d;
        byteBuffer.getClass();
        G10.a.c(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(aVar, byteBuffer);
    }

    protected abstract t b(a aVar, ByteBuffer byteBuffer);
}

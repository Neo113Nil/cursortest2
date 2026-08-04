package A5;

import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f688b = new y(x.f685a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f689a;

    public y(x xVar) {
        this.f689a = xVar;
    }

    @Override // A5.t
    public final ByteBuffer a(o oVar) {
        w wVar = new w();
        x xVar = this.f689a;
        xVar.k(wVar, oVar.f676a);
        xVar.k(wVar, oVar.f677b);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(wVar.size());
        byteBufferAllocateDirect.put(wVar.a(), 0, wVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // A5.t
    public final o b(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        x xVar = this.f689a;
        Object objE = xVar.e(byteBuffer);
        Object objE2 = xVar.e(byteBuffer);
        if (!(objE instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new o((String) objE, objE2);
    }

    @Override // A5.t
    public final ByteBuffer c(Object obj) throws IOException {
        w wVar = new w();
        wVar.write(0);
        this.f689a.k(wVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(wVar.size());
        byteBufferAllocateDirect.put(wVar.a(), 0, wVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // A5.t
    public final ByteBuffer d(String str, String str2) throws IOException {
        w wVar = new w();
        wVar.write(1);
        x xVar = this.f689a;
        xVar.k(wVar, "error");
        xVar.k(wVar, str);
        xVar.k(wVar, null);
        xVar.k(wVar, str2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(wVar.size());
        byteBufferAllocateDirect.put(wVar.a(), 0, wVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // A5.t
    public final ByteBuffer e(String str, String str2, Object obj) throws IOException {
        w wVar = new w();
        wVar.write(1);
        x xVar = this.f689a;
        xVar.k(wVar, str);
        xVar.k(wVar, str2);
        if (obj instanceof Throwable) {
            xVar.k(wVar, Log.getStackTraceString((Throwable) obj));
        } else {
            xVar.k(wVar, obj);
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(wVar.size());
        byteBufferAllocateDirect.put(wVar.a(), 0, wVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // A5.t
    public final Object f(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b7 = byteBuffer.get();
        x xVar = this.f689a;
        if (b7 != 0) {
            if (b7 == 1) {
            }
            throw new IllegalArgumentException("Envelope corrupted");
        }
        Object objE = xVar.e(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return objE;
        }
        Object objE2 = xVar.e(byteBuffer);
        Object objE3 = xVar.e(byteBuffer);
        Object objE4 = xVar.e(byteBuffer);
        if ((objE2 instanceof String) && ((objE3 == null || (objE3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new k((String) objE2, (String) objE3, objE4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }
}

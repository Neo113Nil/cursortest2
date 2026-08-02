package A5;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public final class y implements t {

    /* renamed from: b, reason: collision with root package name */
    public static final y f688b = new y(x.f685a);

    /* renamed from: a, reason: collision with root package name */
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
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(wVar.size());
        allocateDirect.put(wVar.a(), 0, wVar.size());
        return allocateDirect;
    }

    @Override // A5.t
    public final o b(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        x xVar = this.f689a;
        Object e7 = xVar.e(byteBuffer);
        Object e8 = xVar.e(byteBuffer);
        if (!(e7 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new o((String) e7, e8);
    }

    @Override // A5.t
    public final ByteBuffer c(Object obj) {
        w wVar = new w();
        wVar.write(0);
        this.f689a.k(wVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(wVar.size());
        allocateDirect.put(wVar.a(), 0, wVar.size());
        return allocateDirect;
    }

    @Override // A5.t
    public final ByteBuffer d(String str, String str2) {
        w wVar = new w();
        wVar.write(1);
        x xVar = this.f689a;
        xVar.k(wVar, "error");
        xVar.k(wVar, str);
        xVar.k(wVar, null);
        xVar.k(wVar, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(wVar.size());
        allocateDirect.put(wVar.a(), 0, wVar.size());
        return allocateDirect;
    }

    @Override // A5.t
    public final ByteBuffer e(String str, String str2, Object obj) {
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
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(wVar.size());
        allocateDirect.put(wVar.a(), 0, wVar.size());
        return allocateDirect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // A5.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b7 = byteBuffer.get();
        x xVar = this.f689a;
        if (b7 == 0) {
            Object e7 = xVar.e(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return e7;
            }
        }
        Object e8 = xVar.e(byteBuffer);
        Object e9 = xVar.e(byteBuffer);
        Object e10 = xVar.e(byteBuffer);
        if ((e8 instanceof String) && ((e9 == null || (e9 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new k((String) e8, (String) e9, e10);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }
}

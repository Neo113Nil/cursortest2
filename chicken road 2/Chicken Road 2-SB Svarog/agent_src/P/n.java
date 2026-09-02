package P;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class n implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final n f369a;

    static {
        m mVar = m.f366a;
        f369a = new n();
    }

    @Override // P.k
    public final ByteBuffer c(Object obj) {
        l lVar = new l();
        lVar.write(0);
        m.f366a.k(lVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(lVar.size());
        allocateDirect.put(lVar.a(), 0, lVar.size());
        return allocateDirect;
    }

    @Override // P.k
    public final C.a d(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        m mVar = m.f366a;
        Object e2 = mVar.e(byteBuffer);
        Object e3 = mVar.e(byteBuffer);
        if (!(e2 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new C.a(12, (String) e2, e3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // P.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b2 = byteBuffer.get();
        if (b2 == 0) {
            Object e2 = m.f366a.e(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return e2;
            }
        }
        m mVar = m.f366a;
        Object e3 = mVar.e(byteBuffer);
        Object e4 = mVar.e(byteBuffer);
        Object e5 = mVar.e(byteBuffer);
        if ((e3 instanceof String) && ((e4 == null || (e4 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new g((String) e3, (String) e4, e5);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    @Override // P.k
    public final ByteBuffer f(C.a aVar) {
        l lVar = new l();
        m mVar = m.f366a;
        mVar.k(lVar, (String) aVar.f4c);
        mVar.k(lVar, aVar.f5d);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(lVar.size());
        allocateDirect.put(lVar.a(), 0, lVar.size());
        return allocateDirect;
    }

    @Override // P.k
    public final ByteBuffer g(String str, String str2) {
        l lVar = new l();
        lVar.write(1);
        m mVar = m.f366a;
        mVar.k(lVar, "error");
        mVar.k(lVar, str);
        mVar.k(lVar, null);
        mVar.k(lVar, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(lVar.size());
        allocateDirect.put(lVar.a(), 0, lVar.size());
        return allocateDirect;
    }

    @Override // P.k
    public final ByteBuffer h(String str, String str2, Object obj) {
        l lVar = new l();
        lVar.write(1);
        m mVar = m.f366a;
        mVar.k(lVar, str);
        mVar.k(lVar, str2);
        if (obj instanceof Throwable) {
            mVar.k(lVar, Log.getStackTraceString((Throwable) obj));
        } else {
            mVar.k(lVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(lVar.size());
        allocateDirect.put(lVar.a(), 0, lVar.size());
        return allocateDirect;
    }
}

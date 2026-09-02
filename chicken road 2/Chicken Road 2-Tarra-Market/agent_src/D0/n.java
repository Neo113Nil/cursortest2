package D0;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class n implements k {

    /* renamed from: b, reason: collision with root package name */
    public static final n f167b = new n(m.INSTANCE);

    /* renamed from: a, reason: collision with root package name */
    public final m f168a;

    public n(m mVar) {
        this.f168a = mVar;
    }

    @Override // D0.k
    public final ByteBuffer a(Y.e eVar) {
        l lVar = new l();
        m mVar = this.f168a;
        mVar.writeValue(lVar, (String) eVar.f523b);
        mVar.writeValue(lVar, eVar.f524c);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(lVar.size());
        allocateDirect.put(lVar.a(), 0, lVar.size());
        return allocateDirect;
    }

    @Override // D0.k
    public final ByteBuffer b(Object obj) {
        l lVar = new l();
        lVar.write(0);
        this.f168a.writeValue(lVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(lVar.size());
        allocateDirect.put(lVar.a(), 0, lVar.size());
        return allocateDirect;
    }

    @Override // D0.k
    public final Y.e c(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        m mVar = this.f168a;
        Object readValue = mVar.readValue(byteBuffer);
        Object readValue2 = mVar.readValue(byteBuffer);
        if (!(readValue instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new Y.e((String) readValue, readValue2, 9, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // D0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b2 = byteBuffer.get();
        m mVar = this.f168a;
        if (b2 == 0) {
            Object readValue = mVar.readValue(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return readValue;
            }
        }
        Object readValue2 = mVar.readValue(byteBuffer);
        Object readValue3 = mVar.readValue(byteBuffer);
        Object readValue4 = mVar.readValue(byteBuffer);
        if ((readValue2 instanceof String) && ((readValue3 == null || (readValue3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new g((String) readValue2, (String) readValue3, readValue4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    @Override // D0.k
    public final ByteBuffer e(String str, String str2) {
        l lVar = new l();
        lVar.write(1);
        m mVar = this.f168a;
        mVar.writeValue(lVar, "error");
        mVar.writeValue(lVar, str);
        mVar.writeValue(lVar, null);
        mVar.writeValue(lVar, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(lVar.size());
        allocateDirect.put(lVar.a(), 0, lVar.size());
        return allocateDirect;
    }

    @Override // D0.k
    public final ByteBuffer f(String str, String str2, Object obj) {
        l lVar = new l();
        lVar.write(1);
        m mVar = this.f168a;
        mVar.writeValue(lVar, str);
        mVar.writeValue(lVar, str2);
        if (obj instanceof Throwable) {
            mVar.writeValue(lVar, Log.getStackTraceString((Throwable) obj));
        } else {
            mVar.writeValue(lVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(lVar.size());
        allocateDirect.put(lVar.a(), 0, lVar.size());
        return allocateDirect;
    }
}

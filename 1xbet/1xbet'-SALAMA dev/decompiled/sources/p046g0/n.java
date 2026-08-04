package p046g0;

import java.nio.ByteBuffer;
import p052h0.a;
import p052h0.b;
import p155w1.F0;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f13042d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F0 f13044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f13045c = 0;

    public n(F0 f7, int i7) {
        this.f13044b = f7;
        this.f13043a = i7;
    }

    public final int a(int i7) {
        a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarC.f5028d;
        int i8 = iA + aVarC.f5025a;
        return byteBuffer.getInt((i7 * 4) + byteBuffer.getInt(i8) + i8 + 4);
    }

    public final int b() {
        a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        int i7 = iA + aVarC.f5025a;
        return ((ByteBuffer) aVarC.f5028d).getInt(((ByteBuffer) aVarC.f5028d).getInt(i7) + i7);
    }

    public final a c() {
        ThreadLocal threadLocal = f13042d;
        a aVar = (a) threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        b bVar = (b) this.f13044b.f17379b;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i7 = iA + bVar.f5025a;
            int i8 = (this.f13043a * 4) + ((ByteBuffer) bVar.f5028d).getInt(i7) + i7 + 4;
            int i9 = ((ByteBuffer) bVar.f5028d).getInt(i8) + i8;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f5028d;
            aVar.f5028d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f5025a = i9;
                int i10 = i9 - byteBuffer.getInt(i9);
                aVar.f5026b = i10;
                aVar.f5027c = ((ByteBuffer) aVar.f5028d).getShort(i10);
            } else {
                aVar.f5025a = 0;
                aVar.f5026b = 0;
                aVar.f5027c = 0;
            }
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        a aVarC = c();
        int iA = aVarC.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarC.f5028d).getInt(iA + aVarC.f5025a) : 0));
        sb.append(", codepoints:");
        int iB = b();
        for (int i7 = 0; i7 < iB; i7++) {
            sb.append(Integer.toHexString(a(i7)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

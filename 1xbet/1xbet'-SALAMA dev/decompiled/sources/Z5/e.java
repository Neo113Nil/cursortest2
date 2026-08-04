package Z5;

import N6.o;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N6.i f7900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f7902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public short f7905f;

    public e(N6.i iVar) {
        this.f7900a = iVar;
    }

    @Override // N6.o
    public final long t(N6.d dVar, long j) throws IOException {
        int i7;
        int iC;
        do {
            int i8 = this.f7904e;
            N6.i iVar = this.f7900a;
            if (i8 != 0) {
                long jT = iVar.t(dVar, Math.min(j, i8));
                if (jT == -1) {
                    return -1L;
                }
                this.f7904e -= (int) jT;
                return jT;
            }
            iVar.e(this.f7905f);
            this.f7905f = (short) 0;
            if ((this.f7902c & 4) != 0) {
                return -1L;
            }
            i7 = this.f7903d;
            int iA = i.a(iVar);
            this.f7904e = iA;
            this.f7901b = iA;
            byte bA = (byte) (iVar.a() & 255);
            this.f7902c = (byte) (iVar.a() & 255);
            Logger logger = i.f7917a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f.a(true, this.f7903d, this.f7901b, bA, this.f7902c));
            }
            iC = iVar.c() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            this.f7903d = iC;
            if (bA != 9) {
                i.c("%s != TYPE_CONTINUATION", Byte.valueOf(bA));
                throw null;
            }
        } while (iC == i7);
        i.c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

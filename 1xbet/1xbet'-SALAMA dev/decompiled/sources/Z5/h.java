package Z5;

import C0.J;
import W5.AbstractC0486a1;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import p031e1.k;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N6.h f7912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N6.d f7913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f7914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7916e;

    public h(N6.h hVar) {
        this.f7912a = hVar;
        N6.d dVar = new N6.d();
        this.f7913b = dVar;
        this.f7914c = new J(dVar);
        this.f7915d = 16384;
    }

    public final void a(int i7, int i8, byte b7, byte b8) {
        Logger logger = i.f7917a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(f.a(false, i7, i8, b7, b8));
        }
        int i9 = this.f7915d;
        if (i8 > i9) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC0486a1.e(i9, i8, "FRAME_SIZE_ERROR length > ", ": "));
        }
        if ((Integer.MIN_VALUE & i7) != 0) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException(k.d(i7, "reserved bit set: "));
        }
        N6.h hVar = this.f7912a;
        hVar.c((i8 >>> 16) & 255);
        hVar.c((i8 >>> 8) & 255);
        hVar.c(i8 & 255);
        hVar.c(b7 & 255);
        hVar.c(b8 & 255);
        hVar.d(i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    public final void b(boolean z4, int i7, ArrayList arrayList) throws IOException {
        int length;
        int length2;
        if (this.f7916e) {
            throw new IOException("closed");
        }
        J j = this.f7914c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = (b) arrayList.get(i8);
            N6.f fVarP = bVar.f7886a.p();
            Integer num = (Integer) d.f7899c.get(fVarP);
            N6.f fVar = bVar.f7887b;
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (length2 < 2 || length2 > 7) {
                    length = length2;
                    length2 = -1;
                } else {
                    b[] bVarArr = d.f7898b;
                    if (bVarArr[iIntValue].f7887b.equals(fVar)) {
                        length = length2;
                    } else if (bVarArr[length2].f7887b.equals(fVar)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int i9 = j.f1235b + 1;
                while (true) {
                    b[] bVarArr2 = (b[]) j.f1238e;
                    if (i9 >= bVarArr2.length) {
                        break;
                    }
                    if (bVarArr2[i9].f7886a.equals(fVarP)) {
                        if (((b[]) j.f1238e)[i9].f7887b.equals(fVar)) {
                            length2 = (i9 - j.f1235b) + d.f7898b.length;
                            break;
                        } else if (length == -1) {
                            length = (i9 - j.f1235b) + d.f7898b.length;
                        }
                    }
                    i9++;
                }
            }
            if (length2 != -1) {
                j.i(length2, 127, 128);
            } else if (length == -1) {
                ((N6.d) j.f1237d).n(64);
                j.h(fVarP);
                j.h(fVar);
                j.c(bVar);
            } else {
                N6.f fVar2 = d.f7897a;
                fVarP.getClass();
                t6.h.e(fVar2, "prefix");
                if (!fVarP.m(fVar2, fVar2.f4799a.length) || b.f7885h.equals(fVarP)) {
                    j.i(length, 63, 64);
                    j.h(fVar);
                    j.c(bVar);
                } else {
                    j.i(length, 15, 0);
                    j.h(fVar);
                }
            }
        }
        N6.d dVar = this.f7913b;
        long j3 = dVar.f4797b;
        int iMin = (int) Math.min(this.f7915d, j3);
        long j7 = iMin;
        byte b7 = j3 == j7 ? (byte) 4 : (byte) 0;
        if (z4) {
            b7 = (byte) (b7 | 1);
        }
        a(i7, iMin, (byte) 1, b7);
        N6.h hVar = this.f7912a;
        hVar.m(dVar, j7);
        if (j3 > j7) {
            long j8 = j3 - j7;
            while (j8 > 0) {
                int iMin2 = (int) Math.min(this.f7915d, j8);
                long j9 = iMin2;
                j8 -= j9;
                a(i7, iMin2, (byte) 9, j8 == 0 ? (byte) 4 : (byte) 0);
                hVar.m(dVar, j9);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f7916e = true;
        this.f7912a.close();
    }
}

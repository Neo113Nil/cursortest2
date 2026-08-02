package Z5;

import C0.J;
import W5.AbstractC0486a1;
import e1.k;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class h implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final N6.h f7912a;

    /* renamed from: b, reason: collision with root package name */
    public final N6.d f7913b;

    /* renamed from: c, reason: collision with root package name */
    public final J f7914c;

    /* renamed from: d, reason: collision with root package name */
    public int f7915d;

    /* renamed from: e, reason: collision with root package name */
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

    public final void b(boolean z4, int i7, ArrayList arrayList) {
        int i8;
        int i9;
        if (this.f7916e) {
            throw new IOException("closed");
        }
        J j = this.f7914c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            N6.f p5 = bVar.f7886a.p();
            Integer num = (Integer) d.f7899c.get(p5);
            N6.f fVar = bVar.f7887b;
            if (num != null) {
                int intValue = num.intValue();
                i9 = intValue + 1;
                if (i9 >= 2 && i9 <= 7) {
                    b[] bVarArr = d.f7898b;
                    if (bVarArr[intValue].f7887b.equals(fVar)) {
                        i8 = i9;
                    } else if (bVarArr[i9].f7887b.equals(fVar)) {
                        i9 = intValue + 2;
                        i8 = i9;
                    }
                }
                i8 = i9;
                i9 = -1;
            } else {
                i8 = -1;
                i9 = -1;
            }
            if (i9 == -1) {
                int i11 = j.f1235b + 1;
                while (true) {
                    b[] bVarArr2 = (b[]) j.f1238e;
                    if (i11 >= bVarArr2.length) {
                        break;
                    }
                    if (bVarArr2[i11].f7886a.equals(p5)) {
                        if (((b[]) j.f1238e)[i11].f7887b.equals(fVar)) {
                            i9 = (i11 - j.f1235b) + d.f7898b.length;
                            break;
                        } else if (i8 == -1) {
                            i8 = (i11 - j.f1235b) + d.f7898b.length;
                        }
                    }
                    i11++;
                }
            }
            if (i9 != -1) {
                j.i(i9, 127, 128);
            } else if (i8 == -1) {
                ((N6.d) j.f1237d).n(64);
                j.h(p5);
                j.h(fVar);
                j.c(bVar);
            } else {
                N6.f fVar2 = d.f7897a;
                p5.getClass();
                t6.h.e(fVar2, "prefix");
                if (!p5.m(fVar2, fVar2.f4799a.length) || b.f7885h.equals(p5)) {
                    j.i(i8, 63, 64);
                    j.h(fVar);
                    j.c(bVar);
                } else {
                    j.i(i8, 15, 0);
                    j.h(fVar);
                }
            }
        }
        N6.d dVar = this.f7913b;
        long j3 = dVar.f4797b;
        int min = (int) Math.min(this.f7915d, j3);
        long j7 = min;
        byte b7 = j3 == j7 ? (byte) 4 : (byte) 0;
        if (z4) {
            b7 = (byte) (b7 | 1);
        }
        a(i7, min, (byte) 1, b7);
        N6.h hVar = this.f7912a;
        hVar.m(dVar, j7);
        if (j3 > j7) {
            long j8 = j3 - j7;
            while (j8 > 0) {
                int min2 = (int) Math.min(this.f7915d, j8);
                long j9 = min2;
                j8 -= j9;
                a(i7, min2, (byte) 9, j8 == 0 ? (byte) 4 : (byte) 0);
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

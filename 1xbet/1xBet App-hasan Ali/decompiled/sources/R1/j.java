package R1;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class j implements X1.c, Closeable, AutoCloseable {

    /* renamed from: s, reason: collision with root package name */
    public static final TreeMap f5160s = new TreeMap();

    /* renamed from: k, reason: collision with root package name */
    public volatile String f5161k;

    /* renamed from: l, reason: collision with root package name */
    public final long[] f5162l;

    /* renamed from: m, reason: collision with root package name */
    public final double[] f5163m;

    /* renamed from: n, reason: collision with root package name */
    public final String[] f5164n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[][] f5165o;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f5166p;

    /* renamed from: q, reason: collision with root package name */
    public final int f5167q;

    /* renamed from: r, reason: collision with root package name */
    public int f5168r;

    public j(int i) {
        this.f5167q = i;
        int i5 = i + 1;
        this.f5166p = new int[i5];
        this.f5162l = new long[i5];
        this.f5163m = new double[i5];
        this.f5164n = new String[i5];
        this.f5165o = new byte[i5][];
    }

    public static j b(String str, int i) {
        TreeMap treeMap = f5160s;
        synchronized (treeMap) {
            try {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (ceilingEntry == null) {
                    j jVar = new j(i);
                    jVar.f5161k = str;
                    jVar.f5168r = i;
                    return jVar;
                }
                treeMap.remove(ceilingEntry.getKey());
                j jVar2 = (j) ceilingEntry.getValue();
                jVar2.f5161k = str;
                jVar2.f5168r = i;
                return jVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // X1.c
    public final String d() {
        return this.f5161k;
    }

    @Override // X1.c
    public final void f(Y1.b bVar) {
        for (int i = 1; i <= this.f5168r; i++) {
            int i5 = this.f5166p[i];
            if (i5 == 1) {
                bVar.h(i);
            } else if (i5 == 2) {
                bVar.f(i, this.f5162l[i]);
            } else if (i5 == 3) {
                ((SQLiteProgram) bVar.f6123l).bindDouble(i, this.f5163m[i]);
            } else if (i5 == 4) {
                bVar.i(this.f5164n[i], i);
            } else if (i5 == 5) {
                bVar.d(i, this.f5165o[i]);
            }
        }
    }

    public final void h(int i, long j5) {
        this.f5166p[i] = 2;
        this.f5162l[i] = j5;
    }

    public final void i(int i) {
        this.f5166p[i] = 1;
    }

    public final void k(String str, int i) {
        this.f5166p[i] = 4;
        this.f5164n[i] = str;
    }

    public final void l() {
        TreeMap treeMap = f5160s;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f5167q), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

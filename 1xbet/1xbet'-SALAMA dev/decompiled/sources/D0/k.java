package D0;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class k implements J0.d, Closeable {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final TreeMap f1662z = new TreeMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f1663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f1664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double[] f1665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f1666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[][] f1667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f1668f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f1669x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1670y;

    public k(int i7) {
        this.f1669x = i7;
        int i8 = i7 + 1;
        this.f1668f = new int[i8];
        this.f1664b = new long[i8];
        this.f1665c = new double[i8];
        this.f1666d = new String[i8];
        this.f1667e = new byte[i8][];
    }

    public static k c(int i7, String str) {
        TreeMap treeMap = f1662z;
        synchronized (treeMap) {
            try {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i7));
                if (entryCeilingEntry == null) {
                    k kVar = new k(i7);
                    kVar.f1663a = str;
                    kVar.f1670y = i7;
                    return kVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                k kVar2 = (k) entryCeilingEntry.getValue();
                kVar2.f1663a = str;
                kVar2.f1670y = i7;
                return kVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J0.d
    public final String a() {
        return this.f1663a;
    }

    @Override // J0.d
    public final void b(K0.b bVar) {
        for (int i7 = 1; i7 <= this.f1670y; i7++) {
            int i8 = this.f1668f[i7];
            if (i8 == 1) {
                bVar.d(i7);
            } else if (i8 == 2) {
                bVar.c(i7, this.f1664b[i7]);
            } else if (i8 == 3) {
                ((SQLiteProgram) bVar.f3868b).bindDouble(i7, this.f1665c[i7]);
            } else if (i8 == 4) {
                bVar.e(i7, this.f1666d[i7]);
            } else if (i8 == 5) {
                bVar.b(i7, this.f1667e[i7]);
            }
        }
    }

    public final void d(int i7, long j) {
        this.f1668f[i7] = 2;
        this.f1664b[i7] = j;
    }

    public final void e(int i7) {
        this.f1668f[i7] = 1;
    }

    public final void f(int i7, String str) {
        this.f1668f[i7] = 4;
        this.f1666d[i7] = str;
    }

    public final void g() {
        TreeMap treeMap = f1662z;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f1669x), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i7 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i7;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

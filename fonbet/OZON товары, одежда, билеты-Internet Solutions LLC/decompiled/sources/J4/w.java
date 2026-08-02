package J4;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class w implements O4.e, O4.d {

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public static final TreeMap<Integer, w> f13953i = new TreeMap<>();

    /* renamed from: a, reason: collision with root package name */
    private final int f13954a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f13955b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final long[] f13956c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final double[] f13957d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final String[] f13958e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final byte[][] f13959f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final int[] f13960g;

    /* renamed from: h, reason: collision with root package name */
    private int f13961h;

    public w(int i11) {
        this.f13954a = i11;
        int i12 = i11 + 1;
        this.f13960g = new int[i12];
        this.f13956c = new long[i12];
        this.f13957d = new double[i12];
        this.f13958e = new String[i12];
        this.f13959f = new byte[i12][];
    }

    @NotNull
    public static final w j(int i11, @NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        TreeMap<Integer, w> treeMap = f13953i;
        synchronized (treeMap) {
            Map.Entry<Integer, w> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i11));
            if (ceilingEntry == null) {
                Unit unit = Unit.f71690a;
                w wVar = new w(i11);
                wVar.k(i11, query);
                return wVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            w sqliteQuery = ceilingEntry.getValue();
            sqliteQuery.k(i11, query);
            Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
            return sqliteQuery;
        }
    }

    @Override // O4.d
    public final void C0(int i11) {
        this.f13960g[i11] = 1;
    }

    @Override // O4.d
    public final void S0(int i11, double d11) {
        this.f13960g[i11] = 3;
        this.f13957d[i11] = d11;
    }

    @Override // O4.e
    @NotNull
    public final String c() {
        String str = this.f13955b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // O4.e
    public final void d(@NotNull O4.d statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int i11 = this.f13961h;
        if (1 > i11) {
            return;
        }
        int i12 = 1;
        while (true) {
            int i13 = this.f13960g[i12];
            if (i13 == 1) {
                statement.C0(i12);
            } else if (i13 == 2) {
                statement.m0(i12, this.f13956c[i12]);
            } else if (i13 == 3) {
                statement.S0(i12, this.f13957d[i12]);
            } else if (i13 == 4) {
                String str = this.f13958e[i12];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.e0(i12, str);
            } else if (i13 == 5) {
                byte[] bArr = this.f13959f[i12];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.q0(i12, bArr);
            }
            if (i12 == i11) {
                return;
            } else {
                i12++;
            }
        }
    }

    @Override // O4.d
    public final void e0(int i11, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f13960g[i11] = 4;
        this.f13958e[i11] = value;
    }

    public final void k(int i11, @NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f13955b = query;
        this.f13961h = i11;
    }

    @Override // O4.d
    public final void m0(int i11, long j11) {
        this.f13960g[i11] = 2;
        this.f13956c[i11] = j11;
    }

    @Override // O4.d
    public final void q0(int i11, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f13960g[i11] = 5;
        this.f13959f[i11] = value;
    }

    public final void release() {
        TreeMap<Integer, w> treeMap = f13953i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f13954a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i11 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i11;
                }
            }
            Unit unit = Unit.f71690a;
        }
    }
}

package X;

import b0.InterfaceC0262c;
import b0.InterfaceC0263d;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class k implements InterfaceC0263d, InterfaceC0262c {

    /* renamed from: i, reason: collision with root package name */
    public static final TreeMap f3493i = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public final int f3494a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f3495b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f3496c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f3497d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f3498e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f3499f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3500g;

    /* renamed from: h, reason: collision with root package name */
    public int f3501h;

    public k(int i2) {
        this.f3494a = i2;
        int i3 = i2 + 1;
        this.f3500g = new int[i3];
        this.f3496c = new long[i3];
        this.f3497d = new double[i3];
        this.f3498e = new String[i3];
        this.f3499f = new byte[i3][];
    }

    public static final k c(int i2, String str) {
        TreeMap treeMap = f3493i;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry == null) {
                k kVar = new k(i2);
                kVar.f3495b = str;
                kVar.f3501h = i2;
                return kVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            k kVar2 = (k) ceilingEntry.getValue();
            kVar2.f3495b = str;
            kVar2.f3501h = i2;
            return kVar2;
        }
    }

    @Override // b0.InterfaceC0263d
    public final String a() {
        String str = this.f3495b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // b0.InterfaceC0263d
    public final void b(InterfaceC0262c interfaceC0262c) {
        int i2 = this.f3501h;
        if (1 > i2) {
            return;
        }
        int i3 = 1;
        while (true) {
            int i6 = this.f3500g[i3];
            if (i6 == 1) {
                interfaceC0262c.j(i3);
            } else if (i6 == 2) {
                interfaceC0262c.t(i3, this.f3496c[i3]);
            } else if (i6 == 3) {
                interfaceC0262c.k(i3, this.f3497d[i3]);
            } else if (i6 == 4) {
                String str = this.f3498e[i3];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC0262c.f(i3, str);
            } else if (i6 == 5) {
                byte[] bArr = this.f3499f[i3];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC0262c.w(i3, bArr);
            }
            if (i3 == i2) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // b0.InterfaceC0262c
    public final void f(int i2, String value) {
        kotlin.jvm.internal.i.e(value, "value");
        this.f3500g[i2] = 4;
        this.f3498e[i2] = value;
    }

    public final void g() {
        TreeMap treeMap = f3493i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f3494a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                kotlin.jvm.internal.i.d(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
        }
    }

    @Override // b0.InterfaceC0262c
    public final void j(int i2) {
        this.f3500g[i2] = 1;
    }

    @Override // b0.InterfaceC0262c
    public final void k(int i2, double d6) {
        this.f3500g[i2] = 3;
        this.f3497d[i2] = d6;
    }

    @Override // b0.InterfaceC0262c
    public final void t(int i2, long j2) {
        this.f3500g[i2] = 2;
        this.f3496c[i2] = j2;
    }

    @Override // b0.InterfaceC0262c
    public final void w(int i2, byte[] bArr) {
        this.f3500g[i2] = 5;
        this.f3499f[i2] = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

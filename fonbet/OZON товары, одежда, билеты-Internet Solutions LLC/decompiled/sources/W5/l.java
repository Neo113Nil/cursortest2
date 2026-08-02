package W5;

import Ij.C3261b;
import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f33281d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f33282e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f33283f;

    /* renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f33284g;

    /* renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f33285h;

    /* renamed from: a, reason: collision with root package name */
    private final c f33286a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final g<b, Bitmap> f33287b = new g<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f33288c = new HashMap();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33289a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f33289a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33289a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33289a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33289a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static final class b implements k {

        /* renamed from: a, reason: collision with root package name */
        private final c f33290a;

        /* renamed from: b, reason: collision with root package name */
        int f33291b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap.Config f33292c;

        public b(c cVar) {
            this.f33290a = cVar;
        }

        @Override // W5.k
        public final void a() {
            this.f33290a.c(this);
        }

        public final void b(int i11, Bitmap.Config config) {
            this.f33291b = i11;
            this.f33292c = config;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f33291b == bVar.f33291b && p6.l.b(this.f33292c, bVar.f33292c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i11 = this.f33291b * 31;
            Bitmap.Config config = this.f33292c;
            return i11 + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return l.c(this.f33291b, this.f33292c);
        }
    }

    static class c extends W5.c<b> {
        @Override // W5.c
        protected final b a() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f33281d = configArr;
        f33282e = configArr;
        f33283f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f33284g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f33285h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d11 = d(bitmap.getConfig());
        Integer num2 = d11.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d11.remove(num);
                return;
            } else {
                d11.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(p6.l.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    static String c(int i11, Bitmap.Config config) {
        return "[" + i11 + "](" + config + ")";
    }

    private NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        HashMap hashMap = this.f33288c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(config, treeMap);
        return treeMap;
    }

    public final Bitmap b(int i11, int i12, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int d11 = p6.l.d(config) * i11 * i12;
        c cVar = this.f33286a;
        b b11 = cVar.b();
        b11.b(d11, config);
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f33282e;
        } else {
            int i13 = a.f33289a[config.ordinal()];
            configArr = i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? new Bitmap.Config[]{config} : f33285h : f33284g : f33283f : f33281d;
        }
        int length = configArr.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i14];
            Integer ceilingKey = d(config2).ceilingKey(Integer.valueOf(d11));
            if (ceilingKey == null || ceilingKey.intValue() > d11 * 8) {
                i14++;
            } else if (ceilingKey.intValue() != d11 || (config2 != null ? !config2.equals(config) : config != null)) {
                cVar.c(b11);
                int intValue = ceilingKey.intValue();
                b11 = cVar.b();
                b11.b(intValue, config2);
            }
        }
        Bitmap a11 = this.f33287b.a(b11);
        if (a11 != null) {
            a(Integer.valueOf(b11.f33291b), a11);
            a11.reconfigure(i11, i12, config);
        }
        return a11;
    }

    public final void e(Bitmap bitmap) {
        int c11 = p6.l.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        b b11 = this.f33286a.b();
        b11.b(c11, config);
        this.f33287b.b(b11, bitmap);
        NavigableMap<Integer, Integer> d11 = d(bitmap.getConfig());
        Integer num = d11.get(Integer.valueOf(b11.f33291b));
        d11.put(Integer.valueOf(b11.f33291b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final Bitmap f() {
        Bitmap c11 = this.f33287b.c();
        if (c11 != null) {
            a(Integer.valueOf(p6.l.c(c11)), c11);
        }
        return c11;
    }

    public final String toString() {
        StringBuilder e11 = C3261b.e("SizeConfigStrategy{groupedMap=");
        e11.append(this.f33287b);
        e11.append(", sortedSizes=(");
        HashMap hashMap = this.f33288c;
        for (Map.Entry entry : hashMap.entrySet()) {
            e11.append(entry.getKey());
            e11.append('[');
            e11.append(entry.getValue());
            e11.append("], ");
        }
        if (!hashMap.isEmpty()) {
            e11.replace(e11.length() - 2, e11.length(), "");
        }
        e11.append(")}");
        return e11.toString();
    }
}

package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.m;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

@RequiresApi(19)
/* loaded from: classes3.dex */
public final class l {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;
    public final c a = new c();
    public final g<b, Bitmap> b = new g<>();
    public final HashMap c = new HashMap();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @VisibleForTesting
    public static final class b implements k {
        public final c a;
        public int b;
        public Bitmap.Config c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k
        public final void a() {
            this.a.a(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.b == bVar.b && m.b(this.c, bVar.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.b * 31;
            Bitmap.Config config = this.c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return l.c(this.b, this.c);
        }
    }

    @VisibleForTesting
    public static class c extends com.bumptech.glide.load.engine.bitmap_recycle.c<b> {
        public final k b() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d2 = d(bitmap.getConfig());
        Integer num2 = d2.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d2.remove(num);
                return;
            } else {
                d2.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(m.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2 A[EDGE_INSN: B:34:0x00a2->B:20:0x00a2 BREAK  A[LOOP:0: B:10:0x0056->B:32:0x009f], SYNTHETIC] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int length;
        int i3;
        Bitmap a2;
        Bitmap.Config config2;
        int d2 = m.d(config) * i * i2;
        c cVar = this.a;
        k kVar = (k) cVar.a.poll();
        if (kVar == null) {
            kVar = cVar.b();
        }
        b bVar = (b) kVar;
        bVar.b = d2;
        bVar.c = config;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                configArr = e;
                length = configArr.length;
                i3 = 0;
                while (true) {
                    if (i3 < length) {
                        break;
                    }
                    Bitmap.Config config3 = configArr[i3];
                    Integer ceilingKey = d(config3).ceilingKey(Integer.valueOf(d2));
                    if (ceilingKey == null || ceilingKey.intValue() > d2 * 8) {
                        i3++;
                    } else if (ceilingKey.intValue() != d2 || (config3 != null ? !config3.equals(config) : config != null)) {
                        cVar.a(bVar);
                        int intValue = ceilingKey.intValue();
                        k kVar2 = (k) cVar.a.poll();
                        if (kVar2 == null) {
                            kVar2 = cVar.b();
                        }
                        bVar = (b) kVar2;
                        bVar.b = intValue;
                        bVar.c = config3;
                    }
                }
                a2 = this.b.a(bVar);
                if (a2 != null) {
                    a(Integer.valueOf(bVar.b), a2);
                    a2.reconfigure(i, i2, config);
                }
                return a2;
            }
        }
        int i4 = a.a[config.ordinal()];
        configArr = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? new Bitmap.Config[]{config} : h : g : f : d;
        length = configArr.length;
        i3 = 0;
        while (true) {
            if (i3 < length) {
            }
            i3++;
        }
        a2 = this.b.a(bVar);
        if (a2 != null) {
        }
        return a2;
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        HashMap hashMap = this.c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int c2 = m.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        c cVar = this.a;
        k kVar = (k) cVar.a.poll();
        if (kVar == null) {
            kVar = cVar.b();
        }
        b bVar = (b) kVar;
        bVar.b = c2;
        bVar.c = config;
        this.b.b(bVar, bitmap);
        NavigableMap<Integer, Integer> d2 = d(bitmap.getConfig());
        Integer num = d2.get(Integer.valueOf(bVar.b));
        d2.put(Integer.valueOf(bVar.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder c2 = androidx.browser.browseractions.a.c("SizeConfigStrategy{groupedMap=");
        c2.append(this.b);
        c2.append(", sortedSizes=(");
        HashMap hashMap = this.c;
        for (Map.Entry entry : hashMap.entrySet()) {
            c2.append(entry.getKey());
            c2.append('[');
            c2.append(entry.getValue());
            c2.append("], ");
        }
        if (!hashMap.isEmpty()) {
            c2.replace(c2.length() - 2, c2.length(), "");
        }
        c2.append(")}");
        return c2.toString();
    }
}

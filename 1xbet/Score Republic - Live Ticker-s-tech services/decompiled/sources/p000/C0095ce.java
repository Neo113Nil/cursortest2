package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ce */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0095ce {

    /* JADX INFO: renamed from: h */
    public static final C0095ce f1224h;

    /* JADX INFO: renamed from: a */
    public final C0885xp f1225a;

    /* JADX INFO: renamed from: b */
    public final Executor f1226b;

    /* JADX INFO: renamed from: c */
    public final Object[][] f1227c;

    /* JADX INFO: renamed from: d */
    public final List f1228d;

    /* JADX INFO: renamed from: e */
    public final Boolean f1229e;

    /* JADX INFO: renamed from: f */
    public final Integer f1230f;

    /* JADX INFO: renamed from: g */
    public final Integer f1231g;

    static {
        C0547ok c0547ok = new C0547ok();
        c0547ok.f5764c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        c0547ok.f5765d = Collections.EMPTY_LIST;
        f1224h = new C0095ce(c0547ok);
    }

    public C0095ce(C0547ok c0547ok) {
        this.f1225a = (C0885xp) c0547ok.f5762a;
        this.f1226b = (Executor) c0547ok.f5763b;
        this.f1227c = (Object[][]) c0547ok.f5764c;
        this.f1228d = (List) c0547ok.f5765d;
        this.f1229e = (Boolean) c0547ok.f5766e;
        this.f1230f = (Integer) c0547ok.f5767f;
        this.f1231g = (Integer) c0547ok.f5768g;
    }

    /* JADX INFO: renamed from: b */
    public static C0547ok m919b(C0095ce c0095ce) {
        C0547ok c0547ok = new C0547ok();
        c0547ok.f5762a = c0095ce.f1225a;
        c0547ok.f5763b = c0095ce.f1226b;
        c0547ok.f5764c = c0095ce.f1227c;
        c0547ok.f5765d = c0095ce.f1228d;
        c0547ok.f5766e = c0095ce.f1229e;
        c0547ok.f5767f = c0095ce.f1230f;
        c0547ok.f5768g = c0095ce.f1231g;
        return c0547ok;
    }

    /* JADX INFO: renamed from: a */
    public final Object m920a(C0059be c0059be) {
        a90.m127k(c0059be, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.f1227c;
            if (i >= objArr.length) {
                return null;
            }
            Object[] objArr2 = objArr[i];
            if (c0059be == objArr2[0]) {
                return objArr2[1];
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0095ce m921c(C0059be c0059be, Object obj) {
        Object[][] objArr;
        a90.m127k(c0059be, "key");
        C0547ok c0547okM919b = m919b(this);
        int i = 0;
        while (true) {
            objArr = this.f1227c;
            if (i >= objArr.length) {
                i = -1;
                break;
            }
            if (c0059be == objArr[i][0]) {
                break;
            }
            i++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + (i == -1 ? 1 : 0), 2);
        c0547okM919b.f5764c = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        Object[][] objArr3 = (Object[][]) c0547okM919b.f5764c;
        if (i == -1) {
            objArr3[objArr.length] = new Object[]{c0059be, obj};
        } else {
            objArr3[i] = new Object[]{c0059be, obj};
        }
        return new C0095ce(c0547okM919b);
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(this.f1225a, "deadline");
        c0809vnM5362k.m5172c(null, "authority");
        c0809vnM5362k.m5172c(null, "callCredentials");
        Executor executor = this.f1226b;
        c0809vnM5362k.m5172c(executor != null ? executor.getClass() : null, "executor");
        c0809vnM5362k.m5172c(null, "compressorName");
        c0809vnM5362k.m5172c(Arrays.deepToString(this.f1227c), "customOptions");
        c0809vnM5362k.m5174e("waitForReady", Boolean.TRUE.equals(this.f1229e));
        c0809vnM5362k.m5172c(this.f1230f, "maxInboundMessageSize");
        c0809vnM5362k.m5172c(this.f1231g, "maxOutboundMessageSize");
        c0809vnM5362k.m5172c(this.f1228d, "streamTracerFactories");
        return c0809vnM5362k.toString();
    }
}

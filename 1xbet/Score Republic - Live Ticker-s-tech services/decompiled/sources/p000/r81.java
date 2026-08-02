package p000;

import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class r81 {

    /* JADX INFO: renamed from: d */
    public static final Bitmap.Config[] f6731d;

    /* JADX INFO: renamed from: e */
    public static final Bitmap.Config[] f6732e;

    /* JADX INFO: renamed from: f */
    public static final Bitmap.Config[] f6733f;

    /* JADX INFO: renamed from: g */
    public static final Bitmap.Config[] f6734g;

    /* JADX INFO: renamed from: h */
    public static final Bitmap.Config[] f6735h;

    /* JADX INFO: renamed from: a */
    public final mk0 f6736a = new mk0(1);

    /* JADX INFO: renamed from: b */
    public final f50 f6737b = new f50(4);

    /* JADX INFO: renamed from: c */
    public final HashMap f6738c = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f6731d = configArr;
        f6732e = configArr;
        f6733f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f6734g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f6735h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: c */
    public static String m4276c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* JADX INFO: renamed from: a */
    public final void m4277a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM4279d = m4279d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM4279d.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM4279d.remove(num);
                return;
            } else {
                navigableMapM4279d.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String strM4276c = m4276c(zg1.m5896g(bitmap), bitmap.getConfig());
        sb.append(", removed: ");
        sb.append(strM4276c);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m4278b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iM5897h = zg1.m5897h(config) * i * i2;
        mk0 mk0Var = this.f6736a;
        jw0 jw0VarM3399B = (jw0) ((ArrayDeque) mk0Var.f7192j).poll();
        if (jw0VarM3399B == null) {
            jw0VarM3399B = mk0Var.m3399B();
        }
        q81 q81Var = (q81) jw0VarM3399B;
        q81Var.f6415b = iM5897h;
        q81Var.f6416c = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f6732e;
        } else {
            int i3 = p81.f6020a[config.ordinal()];
            if (i3 == 1) {
                configArr = f6731d;
            } else if (i3 == 2) {
                configArr = f6733f;
            } else if (i3 != 3) {
                configArr = i3 != 4 ? new Bitmap.Config[]{config} : f6735h;
            } else {
                configArr = f6734g;
            }
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) m4279d(config2).ceilingKey(Integer.valueOf(iM5897h));
            if (num != null && num.intValue() <= iM5897h * 8) {
                if (num.intValue() == iM5897h && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                mk0Var.m4576l(q81Var);
                int iIntValue = num.intValue();
                jw0 jw0VarM3399B2 = (jw0) ((ArrayDeque) mk0Var.f7192j).poll();
                if (jw0VarM3399B2 == null) {
                    jw0VarM3399B2 = mk0Var.m3399B();
                }
                q81Var = (q81) jw0VarM3399B2;
                q81Var.f6415b = iIntValue;
                q81Var.f6416c = config2;
                break;
            }
        }
        Bitmap bitmap = (Bitmap) this.f6737b.m1607J(q81Var);
        if (bitmap != null) {
            m4277a(Integer.valueOf(q81Var.f6415b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: d */
    public final NavigableMap m4279d(Bitmap.Config config) {
        HashMap map = this.f6738c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: e */
    public final void m4280e(Bitmap bitmap) {
        int iM5896g = zg1.m5896g(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        mk0 mk0Var = this.f6736a;
        jw0 jw0VarM3399B = (jw0) ((ArrayDeque) mk0Var.f7192j).poll();
        if (jw0VarM3399B == null) {
            jw0VarM3399B = mk0Var.m3399B();
        }
        q81 q81Var = (q81) jw0VarM3399B;
        q81Var.f6415b = iM5896g;
        q81Var.f6416c = config;
        this.f6737b.m1621X(q81Var, bitmap);
        NavigableMap navigableMapM4279d = m4279d(bitmap.getConfig());
        Integer num = (Integer) navigableMapM4279d.get(Integer.valueOf(q81Var.f6415b));
        navigableMapM4279d.put(Integer.valueOf(q81Var.f6415b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f6737b);
        sb.append(", sortedSizes=(");
        HashMap map = this.f6738c;
        for (Map.Entry entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!map.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}

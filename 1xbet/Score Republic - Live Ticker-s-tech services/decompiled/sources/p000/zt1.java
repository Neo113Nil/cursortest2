package p000;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class zt1 {

    /* JADX INFO: renamed from: f */
    public static final zt1 f9953f = new zt1((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a */
    public final int f9954a;

    /* JADX INFO: renamed from: b */
    public final String f9955b;

    /* JADX INFO: renamed from: c */
    public final Boolean f9956c;

    /* JADX INFO: renamed from: d */
    public final String f9957d;

    /* JADX INFO: renamed from: e */
    public final EnumMap f9958e;

    public zt1(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(k12.class);
        this.f9958e = enumMap;
        enumMap.put(k12.f4251m, bool == null ? h12.f3002k : bool.booleanValue() ? h12.f3005n : h12.f3004m);
        this.f9954a = i;
        this.f9955b = m6040d();
        this.f9956c = bool2;
        this.f9957d = str;
    }

    /* JADX INFO: renamed from: b */
    public static zt1 m6037b(String str) {
        if (str == null || str.length() <= 0) {
            return f9953f;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(k12.class);
        k12[] k12VarArr = i12.DMA.f3395j;
        int length = k12VarArr.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(k12VarArr[i3], l12.m3152e(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new zt1(enumMap, i, (Boolean) null, (String) null);
    }

    /* JADX INFO: renamed from: c */
    public static zt1 m6038c(int i, Bundle bundle) {
        if (bundle == null) {
            return new zt1((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(k12.class);
        for (k12 k12Var : i12.DMA.f3395j) {
            enumMap.put(k12Var, l12.m3151d(bundle.getString(k12Var.f4254j)));
        }
        return new zt1(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    /* JADX INFO: renamed from: a */
    public final h12 m6039a() {
        h12 h12Var = (h12) this.f9958e.get(k12.f4251m);
        return h12Var == null ? h12.f3002k : h12Var;
    }

    /* JADX INFO: renamed from: d */
    public final String m6040d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9954a);
        for (k12 k12Var : i12.DMA.f3395j) {
            sb.append(":");
            sb.append(l12.m3153h((h12) this.f9958e.get(k12Var)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zt1)) {
            return false;
        }
        zt1 zt1Var = (zt1) obj;
        if (this.f9955b.equalsIgnoreCase(zt1Var.f9955b) && Objects.equals(this.f9956c, zt1Var.f9956c)) {
            return Objects.equals(this.f9957d, zt1Var.f9957d);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.f9956c;
        if (bool == null) {
            i = 3;
        } else {
            i = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.f9957d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f9955b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(l12.m3148a(this.f9954a));
        for (k12 k12Var : i12.DMA.f3395j) {
            sb.append(",");
            sb.append(k12Var.f4254j);
            sb.append("=");
            h12 h12Var = (h12) this.f9958e.get(k12Var);
            if (h12Var == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = h12Var.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.f9956c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.f9957d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public zt1(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(k12.class);
        this.f9958e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f9954a = i;
        this.f9955b = m6040d();
        this.f9956c = bool;
        this.f9957d = str;
    }
}

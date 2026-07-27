package com.startapp.sdk.ads.external.config;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.e0;
import com.startapp.sdk.internal.si;
import e2.AbstractC0292g;
import e2.p;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import v2.k;
import v2.m;

/* loaded from: classes.dex */
public final class AdUnitConfig implements Serializable {
    private static final String BID_PRICE_PREFIX = "bp";
    public static final e0 Companion = new e0();
    private static final long serialVersionUID = 6500875630965723979L;
    private String sioPrice;
    private String network = "gam";
    private String adUnitId = "";

    @TypeInfo(type = HashMap.class)
    private Map<String, ? extends List<String>> keyValues = p.f4878a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !r.a(AdUnitConfig.class).equals(r.a(obj.getClass()))) {
            return false;
        }
        AdUnitConfig adUnitConfig = (AdUnitConfig) obj;
        return j.a(this.adUnitId, adUnitConfig.adUnitId) && j.a(this.network, adUnitConfig.network) && si.a((Object) this.sioPrice, (Object) adUnitConfig.sioPrice) && si.a(this.keyValues, adUnitConfig.keyValues);
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getBp() {
        Object obj;
        List list;
        Iterator<T> it = this.keyValues.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (m.q0((String) ((Map.Entry) obj).getKey(), BID_PRICE_PREFIX)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (list = (List) entry.getValue()) == null) {
            return null;
        }
        return (String) AbstractC0292g.X(list);
    }

    public final Map<String, List<String>> getKeyValues() {
        return this.keyValues;
    }

    public final String getNetwork() {
        return this.network;
    }

    public final String getSioPrice() {
        return this.sioPrice;
    }

    public int hashCode() {
        Object[] objArr = {this.adUnitId, this.keyValues, this.sioPrice, this.network};
        WeakHashMap weakHashMap = si.f4343a;
        return Arrays.deepHashCode(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isValid() {
        Double valueOf;
        String bp;
        String str = this.sioPrice;
        Double d3 = null;
        if (str != null) {
            if (k.j0(str)) {
                valueOf = Double.valueOf(Double.parseDouble(str));
                boolean z3 = valueOf == null;
                bp = getBp();
                if (bp != null) {
                    try {
                        if (k.j0(bp)) {
                            d3 = Double.valueOf(Double.parseDouble(bp));
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                return z3 & (d3 != null) & (!m.n0(this.adUnitId));
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
        bp = getBp();
        if (bp != null) {
        }
        return z3 & (d3 != null) & (!m.n0(this.adUnitId));
    }

    public final void setAdUnitId(String str) {
        j.e(str, "<set-?>");
        this.adUnitId = str;
    }

    public final void setKeyValues(Map<String, ? extends List<String>> map) {
        j.e(map, "<set-?>");
        this.keyValues = map;
    }

    public final void setNetwork(String str) {
        j.e(str, "<set-?>");
        this.network = str;
    }

    public final void setSioPrice(String str) {
        this.sioPrice = str;
    }
}

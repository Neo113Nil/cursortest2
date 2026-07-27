package com.bytedance.adsdk.pcc;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class qf implements ork {
    @Override // com.bytedance.adsdk.pcc.ork
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public Number pcc(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Number pcc = pcc(objArr[0]);
        int pcc2 = pcc(objArr[1], 0);
        boolean pcc3 = pcc(objArr[2], false);
        if (pcc == null) {
            return null;
        }
        return pcc(pcc, pcc2, pcc3);
    }

    public Number pcc(Number number, int i, boolean z) {
        BigDecimal scale;
        if (number == null) {
            return null;
        }
        int max = Math.max(i, 0);
        BigDecimal valueOf = BigDecimal.valueOf(number.doubleValue());
        if (z) {
            scale = valueOf.setScale(max, RoundingMode.HALF_UP);
        } else {
            scale = valueOf.setScale(max, RoundingMode.DOWN);
        }
        if (max == 0 || qf$$ExternalSyntheticBackportWithForwarding0.m(scale).scale() <= 0) {
            return Long.valueOf(scale.longValue());
        }
        return Double.valueOf(scale.doubleValue());
    }

    private Number pcc(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private int pcc(Object obj, int i) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    private boolean pcc(Object obj, boolean z) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return obj instanceof String ? Boolean.parseBoolean((String) obj) : z;
    }
}

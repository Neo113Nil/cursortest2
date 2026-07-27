package com.bytedance.adsdk.pcc;

import android.text.TextUtils;

/* loaded from: classes5.dex */
public class nac {
    public static Object pcc(com.bytedance.adsdk.pcc.sf.pcc.pcc pccVar) {
        ork pcc;
        if (pccVar == null || (pcc = pcc(pccVar.pcc())) == null) {
            return null;
        }
        return pcc.pcc(null, pccVar.sf());
    }

    public static ork pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "toNumber":
                return new gbb();
            case "toString":
                return new jr();
            case "formatDecimal":
                return new qf();
            case "modArray":
                return new vh();
            case "find":
                return new wh();
            case "size":
                return new tmg();
            case "includes":
                return new kj();
            case "chunk":
                return new pcc();
            case "exist":
                return new vj();
            case "split":
                return new hc();
            case "decodeUrl":
                return new sf();
            case "translate":
                return new dax();
            case "encodeUrl":
                return new oo();
            case "isDigit":
                return new vy();
            default:
                return null;
        }
    }
}

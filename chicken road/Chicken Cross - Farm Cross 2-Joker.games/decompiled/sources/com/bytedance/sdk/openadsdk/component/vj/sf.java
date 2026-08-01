package com.bytedance.sdk.openadsdk.component.vj;

import java.util.Comparator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class sf {
    public static final Comparator<sf> pcc = new Comparator<sf>() { // from class: com.bytedance.sdk.openadsdk.component.vj.sf.1
        @Override // java.util.Comparator
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public int compare(sf sfVar, sf sfVar2) {
            if (sfVar.vj() != sfVar2.vj()) {
                return Long.compare(sfVar2.vj(), sfVar.vj());
            }
            return Long.compare(sfVar2.gm(), sfVar.gm());
        }
    };
    private final String gm;
    private final long oo;
    private final String qf;
    private final String sf;
    private final long vj;
    private final long wh;

    public sf(String str, String str2, long j, long j2, long j3, String str3) {
        this.sf = str;
        this.gm = str2;
        this.oo = j;
        this.vj = j2;
        this.wh = j3;
        this.qf = str3;
    }

    public static sf pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new sf(jSONObject.optString("rit"), jSONObject.optString("material"), jSONObject.optLong("expire_time"), jSONObject.optLong("create_time"), jSONObject.optLong("price"), jSONObject.optString("req_id"));
        } catch (Exception unused) {
            return null;
        }
    }

    public JSONObject pcc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("rit", this.sf);
            jSONObject.putOpt("material", this.gm);
            jSONObject.putOpt("expire_time", Long.valueOf(this.oo));
            jSONObject.putOpt("create_time", Long.valueOf(this.vj));
            jSONObject.putOpt("price", Long.valueOf(this.wh));
            jSONObject.putOpt("req_id", this.qf);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String sf() {
        return this.gm;
    }

    public long gm() {
        return this.oo;
    }

    public long oo() {
        return this.vj;
    }

    public long vj() {
        return this.wh;
    }

    public String wh() {
        return this.qf;
    }

    public String toString() {
        return "AdCache{mRit=" + this.sf + ", mExpireTime=" + this.oo + ", mCreateTime=" + this.vj + ", mPrice=" + this.wh + ", mReqId='" + this.qf + AbstractJsonLexerKt.END_OBJ;
    }
}

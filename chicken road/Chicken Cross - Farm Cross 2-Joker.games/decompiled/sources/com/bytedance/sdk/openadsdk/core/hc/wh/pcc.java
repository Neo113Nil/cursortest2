package com.bytedance.sdk.openadsdk.core.hc.wh;

import com.bytedance.adsdk.ugeno.core.lu;
import com.bytedance.sdk.component.adexpress.sf.hc;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc extends hc {
    private float gm;
    private float oo;
    private JSONObject pcc;
    private lu sf;
    private boolean vj;

    public pcc(C0160pcc c0160pcc) {
        super(c0160pcc);
        this.pcc = c0160pcc.pcc;
        this.sf = c0160pcc.sf;
        this.gm = c0160pcc.gm;
        this.oo = c0160pcc.oo;
        this.vj = c0160pcc.vj;
    }

    public float ye() {
        return this.gm;
    }

    public float lq() {
        return this.oo;
    }

    public JSONObject zti() {
        return this.pcc;
    }

    public lu pq() {
        return this.sf;
    }

    public boolean mu() {
        return this.vj;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.hc.wh.pcc$pcc, reason: collision with other inner class name */
    public static class C0160pcc extends hc.pcc {
        private float gm;
        private float oo;
        private JSONObject pcc;
        private lu sf;
        private boolean vj;

        public C0160pcc pcc(JSONObject jSONObject) {
            this.pcc = jSONObject;
            return this;
        }

        public C0160pcc pcc(lu luVar) {
            this.sf = luVar;
            return this;
        }

        public C0160pcc pcc(float f) {
            this.gm = f;
            return this;
        }

        public C0160pcc sf(float f) {
            this.oo = f;
            return this;
        }

        public C0160pcc qf(boolean z) {
            this.vj = z;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.sf.hc.pcc
        /* renamed from: sf, reason: merged with bridge method [inline-methods] */
        public pcc pcc() {
            return new pcc(this);
        }
    }
}

package com.mbridge.msdk.config.component.trans;

import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class TransCpt extends a {
    private com.mbridge.msdk.config.component.trans.model.a h;
    private Map<String, Object> i;

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f = "911001";
        if (this.f8907a.containsKey(c.c("50")) && (this.f8907a.get(c.c("50")) instanceof Map)) {
            this.i = (Map) this.f8907a.get(c.c("50"));
        }
        this.h = new com.mbridge.msdk.config.component.trans.model.a(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        Object a2 = new d().a(this.h.a(), this.d);
        HashMap hashMap = new HashMap();
        if (a2 != null) {
            hashMap.put(c.c("500"), a2);
        }
        a(a("911002", (Map<String, Object>) hashMap));
    }
}

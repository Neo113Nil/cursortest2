package com.mbridge.msdk.config.component.common.express.node;

import java.util.Map;

/* compiled from: propertiesNode.java */
/* loaded from: classes6.dex */
public class j extends d {

    /* renamed from: a, reason: collision with root package name */
    d f8923a;
    String b;

    public j(d dVar, String str) {
        this.f8923a = dVar;
        this.b = str;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (eVar == com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
            com.mbridge.msdk.config.component.common.express.entities.a aVar3 = (com.mbridge.msdk.config.component.common.express.entities.a) this.f8923a.a(dVar, eVar, aVar);
            aVar2.a(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) aVar3.b()).b(aVar3.a()));
            aVar2.a(this.b);
            return aVar2;
        }
        Object a2 = this.f8923a.a(dVar, eVar, aVar);
        if (a2 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            return ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) a2).b(this.b);
        }
        if (a2 instanceof Map) {
            return ((Map) a2).get(this.b);
        }
        return null;
    }
}

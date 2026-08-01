package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.List;

/* compiled from: BinaryOpNode.java */
/* loaded from: classes6.dex */
public class c extends d {

    /* renamed from: a, reason: collision with root package name */
    String f8917a;
    d b;
    d c;

    public c(String str, d dVar, d dVar2) {
        this.f8917a = str;
        this.b = dVar;
        this.c = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object a2 = this.b.a(dVar, eVar, aVar);
        Object a3 = this.c.a(dVar, eVar, aVar);
        if (eVar != com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            List<Object> arrayList = new ArrayList<>();
            arrayList.add(a3);
            return dVar.a(a2, arrayList, this.f8917a, aVar);
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
        if (!(a2 instanceof com.mbridge.msdk.config.component.common.express.entities.a)) {
            return null;
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar3 = (com.mbridge.msdk.config.component.common.express.entities.a) a2;
        String a4 = aVar3.a();
        List<Object> arrayList2 = new ArrayList<>();
        arrayList2.add(a3);
        Object a5 = dVar.a(aVar3, arrayList2, this.f8917a, aVar);
        aVar2.a(a4);
        aVar2.a(a5);
        return aVar2;
    }
}

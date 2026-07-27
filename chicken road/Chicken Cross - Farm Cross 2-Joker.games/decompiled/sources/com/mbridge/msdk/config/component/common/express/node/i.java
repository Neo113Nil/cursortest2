package com.mbridge.msdk.config.component.common.express.node;

/* compiled from: ValueNode.java */
/* loaded from: classes6.dex */
public class i extends d {

    /* renamed from: a, reason: collision with root package name */
    String f8922a;

    public i(String str) {
        this.f8922a = str;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object obj;
        if (this.f8922a.startsWith("$")) {
            obj = com.mbridge.msdk.config.component.common.express.c.a(this.f8922a, aVar);
        } else if (this.f8922a.startsWith("\\") && this.f8922a.endsWith("\\\"")) {
            obj = new StringBuilder().append(this.f8922a.substring(1, r2.length() - 2)).append("\"").toString();
        } else if (this.f8922a.startsWith("\"") && this.f8922a.endsWith("\"")) {
            String str = this.f8922a;
            obj = str.substring(1, str.length() - 1);
        } else {
            obj = this.f8922a;
        }
        if (eVar != com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            return obj;
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
        aVar2.a(aVar);
        aVar2.a(this.f8922a.substring(1));
        return aVar2;
    }
}

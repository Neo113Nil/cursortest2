package com.mbridge.msdk.config.component.common.express.node;

import java.util.HashMap;

/* compiled from: MapKeyValueNode.java */
/* loaded from: classes6.dex */
public class g extends d {

    /* renamed from: a, reason: collision with root package name */
    d f8920a;
    d b;

    public g(d dVar, d dVar2) {
        this.f8920a = dVar;
        this.b = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object a2 = this.f8920a.a(dVar, eVar, aVar);
        Object a3 = this.b.a(dVar, eVar, aVar);
        HashMap hashMap = new HashMap();
        hashMap.put(a2, a3);
        return hashMap;
    }
}

package com.mbridge.msdk.config.component.common.express.node;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MapNode.java */
/* loaded from: classes6.dex */
public class h extends d {

    /* renamed from: a, reason: collision with root package name */
    List<d> f8921a;

    public h(List<d> list) {
        this.f8921a = list;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        HashMap hashMap = new HashMap();
        Iterator<d> it = this.f8921a.iterator();
        while (it.hasNext()) {
            Object a2 = it.next().a(dVar, eVar, aVar);
            hashMap.putAll(a2 instanceof Map ? (HashMap) a2 : new HashMap());
        }
        return hashMap;
    }
}

package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ArrayNode.java */
/* loaded from: classes6.dex */
public class a extends d {

    /* renamed from: a, reason: collision with root package name */
    List<d> f8915a;

    public a(List<d> list) {
        this.f8915a = list;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<d> it = this.f8915a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a(dVar, eVar, aVar));
        }
        return arrayList;
    }
}

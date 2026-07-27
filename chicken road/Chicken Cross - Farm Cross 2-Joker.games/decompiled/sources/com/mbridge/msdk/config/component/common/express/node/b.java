package com.mbridge.msdk.config.component.common.express.node;

import com.ironsource.U3;
import java.util.ArrayList;
import java.util.Set;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* compiled from: AssignmentNode.java */
/* loaded from: classes6.dex */
public class b extends d {
    private static final Set<String> d;

    /* renamed from: a, reason: collision with root package name */
    String f8916a;
    d b;
    d c;

    static {
        Set<String> m;
        m = UByte$$ExternalSyntheticBackport0.m(new Object[]{U3.j.b, "+=", "-=", "*=", "/=", "%="});
        d = m;
    }

    public b(String str, d dVar, d dVar2) {
        this.f8916a = str;
        this.b = dVar;
        this.c = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object a2 = this.b.a(dVar, com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT, aVar);
        Object a3 = this.c.a(dVar, eVar, aVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a3);
        return dVar.a(a2, arrayList, this.f8916a, aVar);
    }
}

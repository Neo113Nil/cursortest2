package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.a3;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class z1 extends a3 {
    public final v6 k;
    public final f3 l;
    public final y1 m;
    public final String n;

    public z1(v6 v6Var, f3 f3Var, y1 y1Var, File file, String str) {
        super(a3.c.b, y1Var.d, ue.e, file);
        this.i = a3.b.c;
        this.k = v6Var;
        this.l = f3Var;
        this.m = y1Var;
        this.n = str;
    }

    @Override // com.chartboost.sdk.impl.a3
    public b3 a() {
        HashMap hashMap = new HashMap();
        hashMap.put("X-Chartboost-App", this.n);
        hashMap.put("X-Chartboost-Client", l3.b());
        hashMap.put("X-Chartboost-Reachability", Integer.toString(this.l.c().b()));
        return new b3(hashMap, null, null);
    }

    @Override // com.chartboost.sdk.impl.a3
    public void a(Void r1, d3 d3Var) {
        this.k.a(this, null, null);
    }

    @Override // com.chartboost.sdk.impl.a3
    public void a(CBError cBError, d3 d3Var) {
        this.k.a(this, cBError, d3Var);
    }
}

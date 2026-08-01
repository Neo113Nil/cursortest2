package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.a3;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ok extends a3 {
    public final f3 k;
    public final a l;
    public final String m;

    public interface a {
        void a(String str, String str2);

        void a(String str, String str2, long j, t0 t0Var);

        void a(String str, String str2, CBError cBError);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(f3 f3Var, File outputFile, String uri, a aVar, ue priority, String appId) {
        super(a3.c.b, uri, priority, outputFile);
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.k = f3Var;
        this.l = aVar;
        this.m = appId;
        this.i = a3.b.c;
    }

    @Override // com.chartboost.sdk.impl.a3
    public b3 a() {
        HashMap hashMap = new HashMap();
        hashMap.put("X-Chartboost-App", this.m);
        hashMap.put("X-Chartboost-Client", l3.b());
        f3 f3Var = this.k;
        hashMap.put("X-Chartboost-Reachability", String.valueOf(f3Var != null ? f3Var.c() : null));
        return new b3(hashMap, null, null);
    }

    @Override // com.chartboost.sdk.impl.a3
    public void a(Object obj, d3 d3Var) {
        a aVar = this.l;
        if (aVar != null) {
            String e = e();
            File file = this.d;
            Intrinsics.checkNotNull(file);
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            aVar.a(e, name);
        }
    }

    @Override // com.chartboost.sdk.impl.a3
    public void a(CBError cBError, d3 d3Var) {
        a aVar = this.l;
        if (aVar != null) {
            String e = e();
            File file = this.d;
            Intrinsics.checkNotNull(file);
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            aVar.a(e, name, cBError);
        }
    }

    @Override // com.chartboost.sdk.impl.a3
    public void a(String uri, long j) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        a aVar = this.l;
        if (aVar != null) {
            File file = this.d;
            Intrinsics.checkNotNull(file);
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            aVar.a(uri, name, j, null);
        }
    }
}

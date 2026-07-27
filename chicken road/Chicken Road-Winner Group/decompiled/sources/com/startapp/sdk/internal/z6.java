package com.startapp.sdk.internal;

import d2.C0274d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class z6 {

    /* renamed from: a, reason: collision with root package name */
    public final ei f4773a;

    /* renamed from: b, reason: collision with root package name */
    public final e3 f4774b;

    /* renamed from: c, reason: collision with root package name */
    public final w6 f4775c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4776d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f4777e;

    public z6(Object emitterObj, ei startEvent, e3 clock) {
        kotlin.jvm.internal.j.e(emitterObj, "emitterObj");
        kotlin.jvm.internal.j.e(startEvent, "startEvent");
        kotlin.jvm.internal.j.e(clock, "clock");
        this.f4773a = startEvent;
        this.f4774b = clock;
        this.f4775c = new w6(emitterObj);
        this.f4776d = new ArrayList();
        this.f4777e = new LinkedHashMap();
    }

    public final void a(Object emitterObject, Object relativeEmitterObject) {
        kotlin.jvm.internal.j.e(emitterObject, "emitterObject");
        kotlin.jvm.internal.j.e(relativeEmitterObject, "relativeEmitterObject");
        if (this.f4775c.a(emitterObject)) {
            w6 w6Var = this.f4775c;
            w6Var.getClass();
            if (w6Var.a(relativeEmitterObject)) {
                return;
            }
            w6Var.f4580b.add(new w6(relativeEmitterObject));
        }
    }

    public final void a(n8 emitterObject, HashMap keyValues) {
        kotlin.jvm.internal.j.e(emitterObject, "emitterObject");
        kotlin.jvm.internal.j.e(keyValues, "keyValues");
        if (this.f4775c.a(emitterObject)) {
            long a3 = this.f4774b.a();
            for (Map.Entry entry : keyValues.entrySet()) {
                ei eiVar = (ei) entry.getKey();
                String str = (String) entry.getValue();
                List list = (List) this.f4777e.get(eiVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f4777e.put(eiVar, list);
                }
                list.add(new C0274d(str, Long.valueOf(a3)));
            }
        }
    }
}

package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class z3 {

    /* renamed from: a, reason: collision with root package name */
    private final List f4573a = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a(c3 c3Var);
    }

    public void a(a aVar) {
        this.f4573a.add(aVar);
    }

    public void b(a aVar) {
        this.f4573a.remove(aVar);
    }

    public void a(c3 c3Var) {
        Iterator it = new ArrayList(this.f4573a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(c3Var);
        }
    }
}

package com.google.common.collect;

import com.google.common.collect.AbstractC0954b;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class p0 extends AbstractC0954b<Object> {
    public final Iterator<Object> c;
    public final Iterator<Object> d;
    public final /* synthetic */ q0 e;

    public p0(q0 q0Var) {
        this.e = q0Var;
        this.c = q0Var.a.iterator();
        this.d = q0Var.b.iterator();
    }

    @Override // com.google.common.collect.AbstractC0954b
    public final Object a() {
        Object next;
        Iterator<Object> it = this.c;
        if (it.hasNext()) {
            return it.next();
        }
        do {
            Iterator<Object> it2 = this.d;
            if (!it2.hasNext()) {
                this.a = AbstractC0954b.a.c;
                return null;
            }
            next = it2.next();
        } while (this.e.a.contains(next));
        return next;
    }
}

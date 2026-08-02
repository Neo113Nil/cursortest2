package com.google.common.collect;

import com.google.common.collect.AbstractC0954b;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class r0 extends AbstractC0954b<Object> {
    public final Iterator<Object> c;
    public final /* synthetic */ s0 d;

    public r0(s0 s0Var) {
        this.d = s0Var;
        this.c = s0Var.a.iterator();
    }

    @Override // com.google.common.collect.AbstractC0954b
    public final Object a() {
        Object next;
        do {
            Iterator<Object> it = this.c;
            if (!it.hasNext()) {
                this.a = AbstractC0954b.a.c;
                return null;
            }
            next = it.next();
        } while (!this.d.b.contains(next));
        return next;
    }
}

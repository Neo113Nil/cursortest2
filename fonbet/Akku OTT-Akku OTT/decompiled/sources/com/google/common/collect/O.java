package com.google.common.collect;

import com.google.common.collect.AbstractC0954b;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class O extends AbstractC0954b<Object> {
    public final /* synthetic */ Iterator c;
    public final /* synthetic */ com.google.common.base.l d;

    public O(Iterator it, com.google.common.base.l lVar) {
        this.c = it;
        this.d = lVar;
    }

    @Override // com.google.common.collect.AbstractC0954b
    public final Object a() {
        Object next;
        do {
            Iterator it = this.c;
            if (!it.hasNext()) {
                this.a = AbstractC0954b.a.c;
                return null;
            }
            next = it.next();
        } while (!this.d.apply(next));
        return next;
    }
}

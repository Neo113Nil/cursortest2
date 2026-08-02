package com.google.common.base;

import com.google.common.base.b;
import com.google.common.base.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class q {
    public final p b;
    public final d a = d.C0129d.a;
    public final int c = Integer.MAX_VALUE;

    public static abstract class a extends b<String> {
        public final CharSequence c;
        public final d d;
        public int e;
        public int f;

        public a(q qVar, CharSequence charSequence) {
            this.a = b.a.b;
            this.e = 0;
            this.d = qVar.a;
            this.f = qVar.c;
            this.c = charSequence;
        }
    }

    public q(p pVar) {
        this.b = pVar;
    }

    public static q a(char c) {
        return new q(new p(new d.b(c)));
    }

    public final List<String> b(CharSequence charSequence) {
        charSequence.getClass();
        p pVar = this.b;
        pVar.getClass();
        o oVar = new o(pVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (oVar.hasNext()) {
            arrayList.add(oVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}

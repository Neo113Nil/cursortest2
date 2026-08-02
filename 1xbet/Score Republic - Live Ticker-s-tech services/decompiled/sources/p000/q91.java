package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class q91 implements Iterable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f6429j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ r91 f6430k;

    public q91(r91 r91Var, String str) {
        this.f6430k = r91Var;
        this.f6429j = str;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        r91 r91Var = this.f6430k;
        jg0 jg0Var = r91Var.f6756c;
        jg0Var.getClass();
        return new p91(jg0Var, r91Var, this.f6429j);
    }

    public final String toString() {
        g72 g72Var = new g72(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        g72Var.m1993a(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}

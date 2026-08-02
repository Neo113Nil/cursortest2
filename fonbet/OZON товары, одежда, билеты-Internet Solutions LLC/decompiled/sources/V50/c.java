package V50;

import t90.AbstractC9782b;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC9782b f28324a;

    public final AbstractC9782b a() {
        return this.f28324a;
    }

    public abstract boolean b(AbstractC9782b abstractC9782b);

    public final void c(AbstractC9782b abstractC9782b) {
        if (b(abstractC9782b)) {
            if (abstractC9782b instanceof AbstractC9782b.a) {
                d(true);
            } else if (!(abstractC9782b instanceof AbstractC9782b.c) && !(abstractC9782b instanceof AbstractC9782b.C2182b) && !(abstractC9782b instanceof AbstractC9782b.d)) {
                if (abstractC9782b instanceof AbstractC9782b.e) {
                    d(false);
                } else {
                    d(false);
                }
            }
            this.f28324a = abstractC9782b;
        }
    }

    public abstract void d(boolean z11);
}

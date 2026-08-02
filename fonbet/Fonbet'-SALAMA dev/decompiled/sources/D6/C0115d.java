package D6;

import f6.C1116i;

/* renamed from: D6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0115d extends AbstractC0128k {

    /* renamed from: a, reason: collision with root package name */
    public final C0113c[] f1824a;

    public C0115d(C0113c[] c0113cArr) {
        this.f1824a = c0113cArr;
    }

    @Override // D6.AbstractC0128k
    public final void b(Throwable th) {
        c();
    }

    public final void c() {
        for (C0113c c0113c : this.f1824a) {
            O o7 = c0113c.f1821f;
            if (o7 == null) {
                t6.h.h("handle");
                throw null;
            }
            o7.dispose();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c();
        return C1116i.f13008a;
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f1824a + ']';
    }
}

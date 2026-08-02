package F4;

import L4.C0226i;
import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends B4.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f1603e;
    public final /* synthetic */ int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0226i f1604g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1605h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, o oVar, int i, C0226i c0226i, int i5, boolean z3) {
        super(str, true);
        this.f1603e = oVar;
        this.f = i;
        this.f1604g = c0226i;
        this.f1605h = i5;
    }

    @Override // B4.a
    public final long a() {
        try {
            A a5 = this.f1603e.f1629u;
            C0226i c0226i = this.f1604g;
            int i = this.f1605h;
            a5.getClass();
            c0226i.J(i);
            this.f1603e.f1616G.l(this.f, 9);
            synchronized (this.f1603e) {
                this.f1603e.f1618I.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}

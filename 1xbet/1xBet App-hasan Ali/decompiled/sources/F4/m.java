package F4;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends B4.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1606e = 1;
    public final /* synthetic */ o f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1607g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list) {
        super(str, true);
        this.f = oVar;
        this.f1607g = i;
    }

    private final long b() {
        this.f.f1629u.getClass();
        try {
            this.f.f1616G.l(this.f1607g, 9);
            synchronized (this.f) {
                this.f.f1618I.remove(Integer.valueOf(this.f1607g));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }

    @Override // B4.a
    public final long a() {
        switch (this.f1606e) {
            case 0:
                return b();
            default:
                this.f.f1629u.getClass();
                try {
                    this.f.f1616G.l(this.f1607g, 9);
                    synchronized (this.f) {
                        this.f.f1618I.remove(Integer.valueOf(this.f1607g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list, boolean z3) {
        super(str, true);
        this.f = oVar;
        this.f1607g = i;
    }
}

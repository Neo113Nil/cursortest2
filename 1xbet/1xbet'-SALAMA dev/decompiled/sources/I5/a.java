package I5;

import A5.h;
import A5.i;
import B4.C0067k;
import B4.C0069m;
import B4.C0070n;
import B4.EnumC0071o;
import B4.O;
import B4.Z;
import E4.C0174g;
import L4.l;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EnumC0071o f3695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public O f3697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3698f;

    @Override // A5.i
    public final void b() {
        switch (this.f3693a) {
            case 0:
                C0069m c0069m = (C0069m) this.f3697e;
                if (c0069m != null) {
                    c0069m.remove();
                    this.f3697e = null;
                }
                break;
            default:
                C0069m c0069m2 = (C0069m) this.f3697e;
                if (c0069m2 != null) {
                    c0069m2.remove();
                    this.f3697e = null;
                }
                break;
        }
    }

    @Override // A5.i
    public final void c(Object obj, h hVar) {
        switch (this.f3693a) {
            case 0:
                Executor executor = l.f4376a;
                int i7 = this.f3694b;
                p150v0.a.i(i7, "metadataChanges must not be null.");
                int i8 = this.f3696d;
                p150v0.a.i(i8, "listen source must not be null.");
                C0067k c0067k = new C0067k(2, this, hVar);
                C0070n c0070n = (C0070n) this.f3698f;
                C0174g c0174g = new C0174g();
                c0174g.f2181a = i7 == 2;
                c0174g.f2182b = i7 == 2;
                c0174g.f2183c = false;
                c0174g.f2184d = i8;
                this.f3697e = c0070n.a(executor, c0174g, c0067k);
                break;
            default:
                Executor executor2 = l.f4376a;
                int i9 = this.f3694b;
                p150v0.a.i(i9, "metadataChanges must not be null.");
                int i10 = this.f3696d;
                p150v0.a.i(i10, "listen source must not be null.");
                C0067k c0067k2 = new C0067k(3, this, hVar);
                Z z4 = (Z) this.f3698f;
                C0174g c0174g2 = new C0174g();
                c0174g2.f2181a = i9 == 2;
                c0174g2.f2182b = i9 == 2;
                c0174g2.f2183c = false;
                c0174g2.f2184d = i10;
                this.f3697e = z4.a(executor2, c0174g2, c0067k2);
                break;
        }
    }
}

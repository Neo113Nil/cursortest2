package m0;

/* renamed from: m0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0059p extends Y.a implements Y.f {

    /* renamed from: c, reason: collision with root package name */
    public static final C0058o f941c = new C0058o(Y.e.f409b, C0057n.f938c);

    public AbstractC0059p() {
        super(Y.e.f409b);
    }

    @Override // Y.a, Y.i
    public final Y.g d(Y.h hVar) {
        Y.g a2;
        g0.h.e(hVar, "key");
        if (hVar instanceof C0058o) {
            C0058o c0058o = (C0058o) hVar;
            Y.h hVar2 = this.f405b;
            if ((hVar2 == c0058o || c0058o.f940c == hVar2) && (a2 = c0058o.a(this)) != null) {
                return a2;
            }
        } else if (Y.e.f409b == hVar) {
            return this;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r3.a(r2) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        return Y.j.f410b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        if (Y.e.f409b == r3) goto L15;
     */
    @Override // Y.a, Y.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Y.i e(Y.h hVar) {
        g0.h.e(hVar, "key");
        if (hVar instanceof C0058o) {
            C0058o c0058o = (C0058o) hVar;
            Y.h hVar2 = this.f405b;
            if (hVar2 != c0058o && c0058o.f940c != hVar2) {
                return this;
            }
        }
    }

    public abstract void f(Y.i iVar, Runnable runnable);

    public boolean h() {
        return !(this instanceof b0);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0062t.a(this);
    }
}

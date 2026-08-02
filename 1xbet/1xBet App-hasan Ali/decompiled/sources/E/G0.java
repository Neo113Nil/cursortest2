package E;

import K0.C0203h;

/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public G.v f1033a;

    /* renamed from: b, reason: collision with root package name */
    public G.v f1034b;

    /* renamed from: c, reason: collision with root package name */
    public int f1035c;

    /* renamed from: d, reason: collision with root package name */
    public Long f1036d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1037e;

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[LOOP:0: B:23:0x005f->B:28:0x006f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[EDGE_INSN: B:29:0x0074->B:30:0x0074 BREAK  A[LOOP:0: B:23:0x005f->B:28:0x006f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(P0.w wVar) {
        G.v vVar;
        this.f1037e = false;
        G.v vVar2 = this.f1033a;
        if (wVar.equals(vVar2 != null ? (P0.w) vVar2.f1750m : null)) {
            return;
        }
        C0203h c0203h = wVar.f4679a;
        String str = c0203h.f2829l;
        G.v vVar3 = this.f1033a;
        if (kotlin.jvm.internal.l.a(str, vVar3 != null ? ((P0.w) vVar3.f1750m).f4679a.f2829l : null)) {
            G.v vVar4 = this.f1033a;
            if (vVar4 == null) {
                return;
            }
            vVar4.f1750m = wVar;
            return;
        }
        this.f1033a = new G.v(4, this.f1033a, wVar);
        this.f1034b = null;
        int length = c0203h.f2829l.length() + this.f1035c;
        this.f1035c = length;
        if (length > 100000) {
            G.v vVar5 = this.f1033a;
            if ((vVar5 != null ? (G.v) vVar5.f1749l : null) == null) {
                return;
            }
            while (true) {
                if (vVar5 != null) {
                    G.v vVar6 = (G.v) vVar5.f1749l;
                    if (vVar6 != null) {
                        vVar = (G.v) vVar6.f1749l;
                        if (vVar != null) {
                            break;
                        } else {
                            vVar5 = (G.v) vVar5.f1749l;
                        }
                    }
                }
                vVar = null;
                if (vVar != null) {
                }
            }
            if (vVar5 == null) {
                return;
            }
            vVar5.f1749l = null;
        }
    }
}

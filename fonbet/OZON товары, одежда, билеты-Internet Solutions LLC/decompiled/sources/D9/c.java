package D9;

import h9.m;
import h9.s;
import o9.C8660b;

/* loaded from: classes9.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final C8660b f6164a;

    /* renamed from: b, reason: collision with root package name */
    private final s f6165b;

    /* renamed from: c, reason: collision with root package name */
    private final s f6166c;

    /* renamed from: d, reason: collision with root package name */
    private final s f6167d;

    /* renamed from: e, reason: collision with root package name */
    private final s f6168e;

    /* renamed from: f, reason: collision with root package name */
    private final int f6169f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6170g;

    /* renamed from: h, reason: collision with root package name */
    private final int f6171h;

    /* renamed from: i, reason: collision with root package name */
    private final int f6172i;

    c(C8660b c8660b, s sVar, s sVar2, s sVar3, s sVar4) throws m {
        boolean z11 = sVar == null || sVar2 == null;
        boolean z12 = sVar3 == null || sVar4 == null;
        if (z11 && z12) {
            throw m.a();
        }
        if (z11) {
            sVar = new s(0.0f, sVar3.c());
            sVar2 = new s(0.0f, sVar4.c());
        } else if (z12) {
            sVar3 = new s(c8660b.j() - 1, sVar.c());
            sVar4 = new s(c8660b.j() - 1, sVar2.c());
        }
        this.f6164a = c8660b;
        this.f6165b = sVar;
        this.f6166c = sVar2;
        this.f6167d = sVar3;
        this.f6168e = sVar4;
        this.f6169f = (int) Math.min(sVar.b(), sVar2.b());
        this.f6170g = (int) Math.max(sVar3.b(), sVar4.b());
        this.f6171h = (int) Math.min(sVar.c(), sVar3.c());
        this.f6172i = (int) Math.max(sVar2.c(), sVar4.c());
    }

    static c j(c cVar, c cVar2) throws m {
        if (cVar == null) {
            return cVar2;
        }
        if (cVar2 == null) {
            return cVar;
        }
        return new c(cVar.f6164a, cVar.f6165b, cVar.f6166c, cVar2.f6167d, cVar2.f6168e);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final c a(int i11, int i12, boolean z11) throws m {
        s sVar;
        s sVar2;
        s sVar3;
        s sVar4;
        s sVar5 = this.f6165b;
        s sVar6 = this.f6167d;
        if (i11 > 0) {
            s sVar7 = z11 ? sVar5 : sVar6;
            int c11 = ((int) sVar7.c()) - i11;
            if (c11 < 0) {
                c11 = 0;
            }
            s sVar8 = new s(sVar7.b(), c11);
            if (!z11) {
                sVar2 = sVar8;
                sVar = sVar5;
                s sVar9 = this.f6166c;
                s sVar10 = this.f6168e;
                if (i12 <= 0) {
                    s sVar11 = z11 ? sVar9 : sVar10;
                    int c12 = ((int) sVar11.c()) + i12;
                    C8660b c8660b = this.f6164a;
                    if (c12 >= c8660b.g()) {
                        c12 = c8660b.g() - 1;
                    }
                    s sVar12 = new s(sVar11.b(), c12);
                    if (!z11) {
                        sVar3 = sVar9;
                        sVar4 = sVar12;
                        return new c(this.f6164a, sVar, sVar3, sVar2, sVar4);
                    }
                    sVar3 = sVar12;
                } else {
                    sVar3 = sVar9;
                }
                sVar4 = sVar10;
                return new c(this.f6164a, sVar, sVar3, sVar2, sVar4);
            }
            sVar = sVar8;
        } else {
            sVar = sVar5;
        }
        sVar2 = sVar6;
        s sVar92 = this.f6166c;
        s sVar102 = this.f6168e;
        if (i12 <= 0) {
        }
        sVar4 = sVar102;
        return new c(this.f6164a, sVar, sVar3, sVar2, sVar4);
    }

    final s b() {
        return this.f6166c;
    }

    final s c() {
        return this.f6168e;
    }

    final int d() {
        return this.f6170g;
    }

    final int e() {
        return this.f6172i;
    }

    final int f() {
        return this.f6169f;
    }

    final int g() {
        return this.f6171h;
    }

    final s h() {
        return this.f6165b;
    }

    final s i() {
        return this.f6167d;
    }

    c(c cVar) {
        this.f6164a = cVar.f6164a;
        this.f6165b = cVar.f6165b;
        this.f6166c = cVar.f6166c;
        this.f6167d = cVar.f6167d;
        this.f6168e = cVar.f6168e;
        this.f6169f = cVar.f6169f;
        this.f6170g = cVar.f6170g;
        this.f6171h = cVar.f6171h;
        this.f6172i = cVar.f6172i;
    }
}

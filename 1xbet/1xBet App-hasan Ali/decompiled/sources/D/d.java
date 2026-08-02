package D;

import G4.l;
import W0.m;
import h0.C1989c;
import h0.C1990d;
import h0.C1991e;
import i0.C;
import i0.C1995B;
import i0.D;
import i0.J;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class d implements J {

    /* renamed from: a, reason: collision with root package name */
    public final a f916a;

    /* renamed from: b, reason: collision with root package name */
    public final a f917b;

    /* renamed from: c, reason: collision with root package name */
    public final a f918c;

    /* renamed from: d, reason: collision with root package name */
    public final a f919d;

    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f916a = aVar;
        this.f917b = aVar2;
        this.f918c = aVar3;
        this.f919d = aVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [D.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [D.a] */
    public static d b(d dVar, b bVar, b bVar2, b bVar3, int i) {
        b bVar4 = bVar;
        if ((i & 1) != 0) {
            bVar4 = dVar.f916a;
        }
        a aVar = dVar.f917b;
        b bVar5 = bVar2;
        if ((i & 4) != 0) {
            bVar5 = dVar.f918c;
        }
        dVar.getClass();
        return new d(bVar4, aVar, bVar5, bVar3);
    }

    @Override // i0.J
    public final D a(long j5, m mVar, W0.c cVar) {
        float a5 = this.f916a.a(j5, cVar);
        float a6 = this.f917b.a(j5, cVar);
        float a7 = this.f918c.a(j5, cVar);
        float a8 = this.f919d.a(j5, cVar);
        float c5 = C1991e.c(j5);
        float f = a5 + a8;
        if (f > c5) {
            float f5 = c5 / f;
            a5 *= f5;
            a8 *= f5;
        }
        float f6 = a6 + a7;
        if (f6 > c5) {
            float f7 = c5 / f6;
            a6 *= f7;
            a7 *= f7;
        }
        if (a5 < 0.0f || a6 < 0.0f || a7 < 0.0f || a8 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a5 + ", topEnd = " + a6 + ", bottomEnd = " + a7 + ", bottomStart = " + a8 + ")!").toString());
        }
        if (a5 + a6 + a7 + a8 == 0.0f) {
            return new C1995B(l.f(0L, j5));
        }
        C1989c f8 = l.f(0L, j5);
        m mVar2 = m.f6016k;
        long b3 = AbstractC2349a.b(mVar == mVar2 ? a5 : a6);
        if (mVar == mVar2) {
            a5 = a6;
        }
        long b5 = AbstractC2349a.b(a5);
        long b6 = AbstractC2349a.b(mVar == mVar2 ? a7 : a8);
        if (mVar != mVar2) {
            a8 = a7;
        }
        return new C(new C1990d(f8.f17193a, f8.f17194b, f8.f17195c, f8.f17196d, b3, b5, b6, AbstractC2349a.b(a8)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!kotlin.jvm.internal.l.a(this.f916a, dVar.f916a)) {
            return false;
        }
        if (!kotlin.jvm.internal.l.a(this.f917b, dVar.f917b)) {
            return false;
        }
        if (kotlin.jvm.internal.l.a(this.f918c, dVar.f918c)) {
            return kotlin.jvm.internal.l.a(this.f919d, dVar.f919d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f919d.hashCode() + ((this.f918c.hashCode() + ((this.f917b.hashCode() + (this.f916a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f916a + ", topEnd = " + this.f917b + ", bottomEnd = " + this.f918c + ", bottomStart = " + this.f919d + ')';
    }
}

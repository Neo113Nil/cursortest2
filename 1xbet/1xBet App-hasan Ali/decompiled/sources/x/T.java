package x;

import b4.EnumC0510a;
import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class T implements W0.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ W0.c f20723k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20724l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20725m;

    /* renamed from: n, reason: collision with root package name */
    public final x4.c f20726n = new x4.c();

    public T(W0.c cVar) {
        this.f20723k = cVar;
    }

    @Override // W0.c
    public final float D(long j5) {
        return this.f20723k.D(j5);
    }

    @Override // W0.c
    public final int K(float f) {
        return this.f20723k.K(f);
    }

    @Override // W0.c
    public final long S(long j5) {
        return this.f20723k.S(j5);
    }

    @Override // W0.c
    public final float V(long j5) {
        return this.f20723k.V(j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC0542c abstractC0542c) {
        Q q5;
        int i;
        T t5;
        if (abstractC0542c instanceof Q) {
            q5 = (Q) abstractC0542c;
            int i5 = q5.f20705n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                q5.f20705n = i5 - Integer.MIN_VALUE;
                Object obj = q5.f20703l;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = q5.f20705n;
                if (i != 0) {
                    G4.l.N(obj);
                    q5.f20702k = this;
                    q5.f20705n = 1;
                    if (this.f20726n.c(q5) == enumC0510a) {
                        return enumC0510a;
                    }
                    t5 = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t5 = q5.f20702k;
                    G4.l.N(obj);
                }
                t5.f20724l = false;
                t5.f20725m = false;
                return W3.o.f6046a;
            }
        }
        q5 = new Q(this, abstractC0542c);
        Object obj2 = q5.f20703l;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = q5.f20705n;
        if (i != 0) {
        }
        t5.f20724l = false;
        t5.f20725m = false;
        return W3.o.f6046a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC0542c abstractC0542c) {
        S s2;
        int i;
        T t5;
        if (abstractC0542c instanceof S) {
            s2 = (S) abstractC0542c;
            int i5 = s2.f20717n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                s2.f20717n = i5 - Integer.MIN_VALUE;
                Object obj = s2.f20715l;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = s2.f20717n;
                if (i != 0) {
                    G4.l.N(obj);
                    if (this.f20724l || this.f20725m) {
                        t5 = this;
                        return Boolean.valueOf(t5.f20724l);
                    }
                    s2.f20714k = this;
                    s2.f20717n = 1;
                    if (this.f20726n.c(s2) == enumC0510a) {
                        return enumC0510a;
                    }
                    t5 = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t5 = s2.f20714k;
                    G4.l.N(obj);
                }
                t5.f20726n.d(null);
                return Boolean.valueOf(t5.f20724l);
            }
        }
        s2 = new S(this, abstractC0542c);
        Object obj2 = s2.f20715l;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = s2.f20717n;
        if (i != 0) {
        }
        t5.f20726n.d(null);
        return Boolean.valueOf(t5.f20724l);
    }

    @Override // W0.c
    public final long b0(float f) {
        return this.f20723k.b0(f);
    }

    @Override // W0.c
    public final float c() {
        return this.f20723k.c();
    }

    @Override // W0.c
    public final float h0(int i) {
        return this.f20723k.h0(i);
    }

    @Override // W0.c
    public final float i0(float f) {
        return this.f20723k.i0(f);
    }

    @Override // W0.c
    public final float n() {
        return this.f20723k.n();
    }

    @Override // W0.c
    public final long x(long j5) {
        return this.f20723k.x(j5);
    }

    @Override // W0.c
    public final float y(float f) {
        return this.f20723k.y(f);
    }
}

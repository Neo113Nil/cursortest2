package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f11263a;

    /* renamed from: b, reason: collision with root package name */
    public c f11264b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11265c;

    public b(c cVar, c cVar2, int i2) {
        this.f11265c = i2;
        this.f11263a = cVar2;
        this.f11264b = cVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f11263a == cVar && cVar == this.f11264b) {
            this.f11264b = null;
            this.f11263a = null;
        }
        c cVar4 = this.f11263a;
        if (cVar4 == cVar) {
            switch (this.f11265c) {
                case 0:
                    cVar2 = cVar4.f11269d;
                    break;
                default:
                    cVar2 = cVar4.f11268c;
                    break;
            }
            this.f11263a = cVar2;
        }
        c cVar5 = this.f11264b;
        if (cVar5 == cVar) {
            c cVar6 = this.f11263a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f11264b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f11265c) {
            case 0:
                return cVar.f11268c;
            default:
                return cVar.f11269d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11264b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f11264b;
        c cVar2 = this.f11263a;
        this.f11264b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}

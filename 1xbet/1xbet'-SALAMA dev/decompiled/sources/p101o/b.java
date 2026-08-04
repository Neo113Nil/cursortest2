package p101o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f15522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f15523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15524c;

    public b(c cVar, c cVar2, int i7) {
        this.f15524c = i7;
        this.f15522a = cVar2;
        this.f15523b = cVar;
    }

    @Override // p101o.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f15522a == cVar && cVar == this.f15523b) {
            this.f15523b = null;
            this.f15522a = null;
        }
        c cVar3 = this.f15522a;
        if (cVar3 == cVar) {
            switch (this.f15524c) {
                case 0:
                    cVar2 = cVar3.f15528d;
                    break;
                default:
                    cVar2 = cVar3.f15527c;
                    break;
            }
            this.f15522a = cVar2;
        }
        c cVar4 = this.f15523b;
        if (cVar4 == cVar) {
            c cVar5 = this.f15522a;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f15523b = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f15524c) {
            case 0:
                return cVar.f15527c;
            default:
                return cVar.f15528d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15523b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f15523b;
        c cVar2 = this.f15522a;
        this.f15523b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}

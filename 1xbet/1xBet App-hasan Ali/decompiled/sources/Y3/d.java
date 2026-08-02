package Y3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class d extends f implements Iterator, j4.a {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6151o;

    public d(g gVar, int i) {
        this.f6151o = i;
        l.f("map", gVar);
        this.f6158n = gVar;
        this.f6156l = -1;
        this.f6157m = gVar.f6167r;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6151o) {
            case 0:
                b();
                int i = this.f6155k;
                g gVar = (g) this.f6158n;
                if (i >= gVar.f6165p) {
                    throw new NoSuchElementException();
                }
                this.f6155k = i + 1;
                this.f6156l = i;
                e eVar = new e(gVar, i);
                c();
                return eVar;
            case 1:
                b();
                int i5 = this.f6155k;
                g gVar2 = (g) this.f6158n;
                if (i5 >= gVar2.f6165p) {
                    throw new NoSuchElementException();
                }
                this.f6155k = i5 + 1;
                this.f6156l = i5;
                Object obj = gVar2.f6160k[i5];
                c();
                return obj;
            default:
                b();
                int i6 = this.f6155k;
                g gVar3 = (g) this.f6158n;
                if (i6 >= gVar3.f6165p) {
                    throw new NoSuchElementException();
                }
                this.f6155k = i6 + 1;
                this.f6156l = i6;
                Object[] objArr = gVar3.f6161l;
                l.c(objArr);
                Object obj2 = objArr[this.f6156l];
                c();
                return obj2;
        }
    }
}

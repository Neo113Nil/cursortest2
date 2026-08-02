package t6;

import W5.AbstractC0486a1;
import kotlin.Function;
import v0.AbstractC1663a;

/* loaded from: classes2.dex */
public abstract class g extends b implements f, A6.a, Function {

    /* renamed from: x, reason: collision with root package name */
    public final int f16465x;

    /* renamed from: y, reason: collision with root package name */
    public final int f16466y;

    public g(int i7, Class cls, String str, String str2, int i8) {
        this(i7, a.f16454a, cls, str, str2, i8);
    }

    @Override // t6.b
    public final A6.a b() {
        q.f16473a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f16458d.equals(gVar.f16458d) && this.f16459e.equals(gVar.f16459e) && this.f16466y == gVar.f16466y && this.f16465x == gVar.f16465x && this.f16456b.equals(gVar.f16456b) && c().equals(gVar.c());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        A6.a aVar = this.f16455a;
        if (aVar == null) {
            b();
            this.f16455a = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // t6.f
    public final int getArity() {
        return this.f16465x;
    }

    public final int hashCode() {
        c();
        return this.f16459e.hashCode() + AbstractC1663a.d(c().hashCode() * 31, 31, this.f16458d);
    }

    public final String toString() {
        A6.a aVar = this.f16455a;
        if (aVar == null) {
            b();
            this.f16455a = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f16458d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC0486a1.h("function ", str, " (Kotlin reflection is not available)");
    }

    public g(int i7, Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.f16465x = i7;
        this.f16466y = 0;
    }
}

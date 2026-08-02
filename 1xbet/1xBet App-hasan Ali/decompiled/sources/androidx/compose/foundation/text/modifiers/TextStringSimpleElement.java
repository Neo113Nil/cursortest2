package androidx.compose.foundation.text.modifiers;

import H.g;
import K0.O;
import O0.d;
import b0.o;
import kotlin.jvm.internal.l;
import z0.AbstractC2749f;
import z0.Z;

/* loaded from: classes.dex */
public final class TextStringSimpleElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final String f6896k;

    /* renamed from: l, reason: collision with root package name */
    public final O f6897l;

    /* renamed from: m, reason: collision with root package name */
    public final d f6898m;

    /* renamed from: n, reason: collision with root package name */
    public final int f6899n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f6900o;

    /* renamed from: p, reason: collision with root package name */
    public final int f6901p;

    /* renamed from: q, reason: collision with root package name */
    public final int f6902q;

    public TextStringSimpleElement(String str, O o5, d dVar, int i, boolean z3, int i5, int i6) {
        this.f6896k = str;
        this.f6897l = o5;
        this.f6898m = dVar;
        this.f6899n = i;
        this.f6900o = z3;
        this.f6901p = i5;
        this.f6902q = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        textStringSimpleElement.getClass();
        return l.a(this.f6896k, textStringSimpleElement.f6896k) && l.a(this.f6897l, textStringSimpleElement.f6897l) && l.a(this.f6898m, textStringSimpleElement.f6898m) && this.f6899n == textStringSimpleElement.f6899n && this.f6900o == textStringSimpleElement.f6900o && this.f6901p == textStringSimpleElement.f6901p && this.f6902q == textStringSimpleElement.f6902q;
    }

    public final int hashCode() {
        return (((((((((this.f6898m.hashCode() + ((this.f6897l.hashCode() + (this.f6896k.hashCode() * 31)) * 31)) * 31) + this.f6899n) * 31) + (this.f6900o ? 1231 : 1237)) * 31) + this.f6901p) * 31) + this.f6902q) * 31;
    }

    @Override // z0.Z
    public final o i() {
        g gVar = new g();
        gVar.f2060y = this.f6896k;
        gVar.f2061z = this.f6897l;
        gVar.f2051A = this.f6898m;
        gVar.f2052B = this.f6899n;
        gVar.f2053C = this.f6900o;
        gVar.f2054D = this.f6901p;
        gVar.f2055E = this.f6902q;
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // z0.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(o oVar) {
        boolean z3;
        String str;
        String str2;
        int i;
        int i5;
        int i6;
        int i7;
        boolean z5;
        boolean z6;
        d dVar;
        d dVar2;
        int i8;
        int i9;
        g gVar = (g) oVar;
        gVar.getClass();
        O o5 = gVar.f2061z;
        boolean z7 = false;
        boolean z8 = true;
        O o6 = this.f6897l;
        if (o6 == o5) {
            o6.getClass();
        } else if (!o6.f2805a.b(o5.f2805a)) {
            z3 = true;
            str = gVar.f2060y;
            str2 = this.f6896k;
            if (!l.a(str, str2)) {
                gVar.f2060y = str2;
                gVar.f2059I = null;
                z7 = true;
            }
            boolean z9 = !gVar.f2061z.c(o6);
            gVar.f2061z = o6;
            i = gVar.f2055E;
            i5 = this.f6902q;
            if (i != i5) {
                gVar.f2055E = i5;
                z9 = true;
            }
            i6 = gVar.f2054D;
            i7 = this.f6901p;
            if (i6 != i7) {
                gVar.f2054D = i7;
                z9 = true;
            }
            z5 = gVar.f2053C;
            z6 = this.f6900o;
            if (z5 != z6) {
                gVar.f2053C = z6;
                z9 = true;
            }
            dVar = gVar.f2051A;
            dVar2 = this.f6898m;
            if (!l.a(dVar, dVar2)) {
                gVar.f2051A = dVar2;
                z9 = true;
            }
            i8 = gVar.f2052B;
            i9 = this.f6899n;
            if (i8 != i9) {
                z8 = z9;
            } else {
                gVar.f2052B = i9;
            }
            if (!z7 || z8) {
                H.d y02 = gVar.y0();
                String str3 = gVar.f2060y;
                O o7 = gVar.f2061z;
                d dVar3 = gVar.f2051A;
                int i10 = gVar.f2052B;
                boolean z10 = gVar.f2053C;
                int i11 = gVar.f2054D;
                int i12 = gVar.f2055E;
                y02.f2029a = str3;
                y02.f2030b = o7;
                y02.f2031c = dVar3;
                y02.f2032d = i10;
                y02.f2033e = z10;
                y02.f = i11;
                y02.f2034g = i12;
                y02.c();
            }
            if (gVar.f7175x) {
                return;
            }
            if (z7 || (z3 && gVar.f2058H != null)) {
                AbstractC2749f.o(gVar);
            }
            if (z7 || z8) {
                AbstractC2749f.n(gVar);
                AbstractC2749f.m(gVar);
            }
            if (z3) {
                AbstractC2749f.m(gVar);
                return;
            }
            return;
        }
        z3 = false;
        str = gVar.f2060y;
        str2 = this.f6896k;
        if (!l.a(str, str2)) {
        }
        boolean z92 = !gVar.f2061z.c(o6);
        gVar.f2061z = o6;
        i = gVar.f2055E;
        i5 = this.f6902q;
        if (i != i5) {
        }
        i6 = gVar.f2054D;
        i7 = this.f6901p;
        if (i6 != i7) {
        }
        z5 = gVar.f2053C;
        z6 = this.f6900o;
        if (z5 != z6) {
        }
        dVar = gVar.f2051A;
        dVar2 = this.f6898m;
        if (!l.a(dVar, dVar2)) {
        }
        i8 = gVar.f2052B;
        i9 = this.f6899n;
        if (i8 != i9) {
        }
        if (!z7) {
        }
        H.d y022 = gVar.y0();
        String str32 = gVar.f2060y;
        O o72 = gVar.f2061z;
        d dVar32 = gVar.f2051A;
        int i102 = gVar.f2052B;
        boolean z102 = gVar.f2053C;
        int i112 = gVar.f2054D;
        int i122 = gVar.f2055E;
        y022.f2029a = str32;
        y022.f2030b = o72;
        y022.f2031c = dVar32;
        y022.f2032d = i102;
        y022.f2033e = z102;
        y022.f = i112;
        y022.f2034g = i122;
        y022.c();
        if (gVar.f7175x) {
        }
    }
}

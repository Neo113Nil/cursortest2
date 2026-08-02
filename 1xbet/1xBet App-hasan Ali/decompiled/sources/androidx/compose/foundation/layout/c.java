package androidx.compose.foundation.layout;

import A0.C0009a;
import b0.g;
import b0.h;
import b0.p;
import kotlin.jvm.internal.l;
import w.i;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final FillElement f6866a = new FillElement(2, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final FillElement f6867b = new FillElement(1, 1.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final FillElement f6868c = new FillElement(3, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    public static final WrapContentElement f6869d;

    /* renamed from: e, reason: collision with root package name */
    public static final WrapContentElement f6870e;
    public static final WrapContentElement f;

    /* renamed from: g, reason: collision with root package name */
    public static final WrapContentElement f6871g;

    static {
        g gVar = b0.c.f7147u;
        f6869d = new WrapContentElement(1, new C0009a(14, gVar), gVar);
        g gVar2 = b0.c.f7146t;
        f6870e = new WrapContentElement(1, new C0009a(14, gVar2), gVar2);
        h hVar = b0.c.f7141o;
        f = new WrapContentElement(3, new C0009a(15, hVar), hVar);
        h hVar2 = b0.c.f7137k;
        f6871g = new WrapContentElement(3, new C0009a(15, hVar2), hVar2);
    }

    public static final p a(p pVar, float f5, float f6) {
        return pVar.c(new UnspecifiedConstraintsElement(f5, f6));
    }

    public static final p b(p pVar, float f5) {
        return pVar.c(f5 == 1.0f ? f6866a : new FillElement(2, f5));
    }

    public static final p c(p pVar, float f5) {
        return pVar.c(new SizeElement(0.0f, f5, 0.0f, f5, 5));
    }

    public static final p d(p pVar, float f5, float f6) {
        return pVar.c(new SizeElement(0.0f, f5, 0.0f, f6, 5));
    }

    public static p e(p pVar, float f5, float f6, float f7, float f8, int i) {
        return pVar.c(new SizeElement(f5, (i & 2) != 0 ? Float.NaN : f6, (i & 4) != 0 ? Float.NaN : f7, (i & 8) != 0 ? Float.NaN : f8, false));
    }

    public static final p f(p pVar, float f5) {
        return pVar.c(new SizeElement(f5, f5, f5, f5, true));
    }

    public static final p g(p pVar, float f5, float f6) {
        return pVar.c(new SizeElement(f5, f6, f5, f6, true));
    }

    public static final p h(p pVar) {
        float f5 = i.f20465a;
        float f6 = i.f20467c;
        return pVar.c(new SizeElement(f5, f6, i.f20466b, f6, true));
    }

    public static final p i(float f5) {
        return new SizeElement(f5, 0.0f, f5, 0.0f, 10);
    }

    public static p j(p pVar) {
        g gVar = b0.c.f7147u;
        return pVar.c(l.a(gVar, gVar) ? f6869d : l.a(gVar, b0.c.f7146t) ? f6870e : new WrapContentElement(1, new C0009a(14, gVar), gVar));
    }

    public static p k() {
        h hVar = b0.c.f7141o;
        return l.a(hVar, hVar) ? f : l.a(hVar, b0.c.f7137k) ? f6871g : new WrapContentElement(3, new C0009a(15, hVar), hVar);
    }
}

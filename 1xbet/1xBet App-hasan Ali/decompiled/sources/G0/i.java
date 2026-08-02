package G0;

import G4.l;
import W3.o;
import b4.EnumC0510a;
import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f1805a;

    /* renamed from: b, reason: collision with root package name */
    public float f1806b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1807c;

    public i(int i, e eVar) {
        this.f1805a = i;
        this.f1807c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float a(int i, boolean z3, boolean z5, boolean z6) {
        boolean z7;
        int i5;
        int i6 = 1;
        L0.k kVar = (L0.k) this.f1807c;
        if (z3) {
            int d5 = L0.h.d(kVar.f, i, z3);
            int lineStart = kVar.f.getLineStart(d5);
            int f = kVar.f(d5);
            if (i == lineStart || i == f) {
                z7 = true;
                int i7 = i * 4;
                if (z6) {
                    i6 = z7 ? 2 : 3;
                } else if (z7) {
                    i6 = 0;
                }
                i5 = i7 + i6;
                if (this.f1805a != i5) {
                    return this.f1806b;
                }
                float h3 = z6 ? kVar.h(i, z3) : kVar.i(i, z3);
                if (z5) {
                    this.f1805a = i5;
                    this.f1806b = h3;
                }
                return h3;
            }
        }
        z7 = false;
        int i72 = i * 4;
        if (z6) {
        }
        i5 = i72 + i6;
        if (this.f1805a != i5) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(float f, AbstractC0542c abstractC0542c) {
        h hVar;
        int i;
        if (abstractC0542c instanceof h) {
            hVar = (h) abstractC0542c;
            int i5 = hVar.f1804m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                hVar.f1804m = i5 - Integer.MIN_VALUE;
                Object obj = hVar.f1802k;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = hVar.f1804m;
                if (i != 0) {
                    l.N(obj);
                    Float f5 = new Float(f);
                    hVar.f1804m = 1;
                    obj = ((e) this.f1807c).invoke(f5, hVar);
                    if (obj == enumC0510a) {
                        return enumC0510a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l.N(obj);
                }
                this.f1806b += ((Number) obj).floatValue();
                return o.f6046a;
            }
        }
        hVar = new h(this, abstractC0542c);
        Object obj2 = hVar.f1802k;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = hVar.f1804m;
        if (i != 0) {
        }
        this.f1806b += ((Number) obj2).floatValue();
        return o.f6046a;
    }

    public i(L0.k kVar) {
        this.f1807c = kVar;
        this.f1805a = -1;
    }
}

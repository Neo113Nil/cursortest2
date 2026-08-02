package androidx.compose.foundation;

import H0.g;
import b0.o;
import i4.InterfaceC2015a;
import kotlin.jvm.internal.l;
import v.C2503A;
import v.J;
import v.N;
import v.Y;
import y.C2654j;
import z0.AbstractC2749f;
import z0.InterfaceC2755l;
import z0.Z;

/* loaded from: classes.dex */
final class ClickableElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final C2654j f6810k;

    /* renamed from: l, reason: collision with root package name */
    public final Y f6811l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f6812m;

    /* renamed from: n, reason: collision with root package name */
    public final String f6813n;

    /* renamed from: o, reason: collision with root package name */
    public final g f6814o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC2015a f6815p;

    public ClickableElement(C2654j c2654j, Y y5, boolean z3, String str, g gVar, InterfaceC2015a interfaceC2015a) {
        this.f6810k = c2654j;
        this.f6811l = y5;
        this.f6812m = z3;
        this.f6813n = str;
        this.f6814o = gVar;
        this.f6815p = interfaceC2015a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return l.a(this.f6810k, clickableElement.f6810k) && l.a(this.f6811l, clickableElement.f6811l) && this.f6812m == clickableElement.f6812m && l.a(this.f6813n, clickableElement.f6813n) && l.a(this.f6814o, clickableElement.f6814o) && this.f6815p == clickableElement.f6815p;
    }

    public final int hashCode() {
        C2654j c2654j = this.f6810k;
        int hashCode = (c2654j != null ? c2654j.hashCode() : 0) * 31;
        Y y5 = this.f6811l;
        int hashCode2 = (((hashCode + (y5 != null ? y5.hashCode() : 0)) * 31) + (this.f6812m ? 1231 : 1237)) * 31;
        String str = this.f6813n;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        g gVar = this.f6814o;
        return this.f6815p.hashCode() + ((hashCode3 + (gVar != null ? gVar.f2074a : 0)) * 31);
    }

    @Override // z0.Z
    public final o i() {
        return new C2503A(this.f6810k, this.f6811l, this.f6812m, this.f6813n, this.f6814o, this.f6815p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r8.J == null) goto L39;
     */
    @Override // z0.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(o oVar) {
        boolean z3;
        InterfaceC2755l interfaceC2755l;
        C2503A c2503a = (C2503A) oVar;
        C2654j c2654j = c2503a.f20133O;
        C2654j c2654j2 = this.f6810k;
        boolean z5 = false;
        boolean z6 = true;
        if (l.a(c2654j, c2654j2)) {
            z3 = false;
        } else {
            c2503a.B0();
            c2503a.f20133O = c2654j2;
            c2503a.f20121A = c2654j2;
            z3 = true;
        }
        Y y5 = c2503a.f20122B;
        Y y6 = this.f6811l;
        if (!l.a(y5, y6)) {
            c2503a.f20122B = y6;
            z3 = true;
        }
        boolean z7 = c2503a.f20125E;
        boolean z8 = this.f6812m;
        N n5 = c2503a.f20128H;
        if (z7 != z8) {
            J j5 = c2503a.f20127G;
            if (z8) {
                c2503a.y0(j5);
                c2503a.y0(n5);
            } else {
                c2503a.z0(j5);
                c2503a.z0(n5);
                c2503a.B0();
            }
            AbstractC2749f.o(c2503a);
            c2503a.f20125E = z8;
        }
        String str = c2503a.f20123C;
        String str2 = this.f6813n;
        if (!l.a(str, str2)) {
            c2503a.f20123C = str2;
            AbstractC2749f.o(c2503a);
        }
        g gVar = c2503a.f20124D;
        g gVar2 = this.f6814o;
        if (!l.a(gVar, gVar2)) {
            c2503a.f20124D = gVar2;
            AbstractC2749f.o(c2503a);
        }
        c2503a.f20126F = this.f6815p;
        boolean z9 = c2503a.f20134P;
        C2654j c2654j3 = c2503a.f20133O;
        if (z9 != (c2654j3 == null && c2503a.f20122B != null)) {
            if (c2654j3 == null && c2503a.f20122B != null) {
                z5 = true;
            }
            c2503a.f20134P = z5;
            if (!z5) {
            }
        }
        z6 = z3;
        if (z6 && ((interfaceC2755l = c2503a.J) != null || !c2503a.f20134P)) {
            if (interfaceC2755l != null) {
                c2503a.z0(interfaceC2755l);
            }
            c2503a.J = null;
            c2503a.C0();
        }
        n5.B0(c2503a.f20121A);
    }
}

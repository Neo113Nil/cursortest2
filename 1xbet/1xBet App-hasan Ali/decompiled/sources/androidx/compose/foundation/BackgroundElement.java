package androidx.compose.foundation;

import b0.o;
import i0.F;
import i0.J;
import i0.p;
import i0.y;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;
import v.C2520o;
import z0.Z;

/* loaded from: classes.dex */
final class BackgroundElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final long f6803k;

    /* renamed from: l, reason: collision with root package name */
    public final F f6804l;

    /* renamed from: m, reason: collision with root package name */
    public final float f6805m;

    /* renamed from: n, reason: collision with root package name */
    public final J f6806n;

    public BackgroundElement(long j5, y yVar, J j6, int i) {
        j5 = (i & 1) != 0 ? p.f17293g : j5;
        yVar = (i & 2) != 0 ? null : yVar;
        this.f6803k = j5;
        this.f6804l = yVar;
        this.f6805m = 1.0f;
        this.f6806n = j6;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && p.c(this.f6803k, backgroundElement.f6803k) && l.a(this.f6804l, backgroundElement.f6804l) && this.f6805m == backgroundElement.f6805m && l.a(this.f6806n, backgroundElement.f6806n);
    }

    public final int hashCode() {
        int i = p.i(this.f6803k) * 31;
        F f = this.f6804l;
        return this.f6806n.hashCode() + AbstractC2107A.n(this.f6805m, (i + (f != null ? f.hashCode() : 0)) * 31, 31);
    }

    @Override // z0.Z
    public final o i() {
        C2520o c2520o = new C2520o();
        c2520o.f20282y = this.f6803k;
        c2520o.f20283z = this.f6804l;
        c2520o.f20276A = this.f6805m;
        c2520o.f20277B = this.f6806n;
        c2520o.f20278C = 9205357640488583168L;
        return c2520o;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        C2520o c2520o = (C2520o) oVar;
        c2520o.f20282y = this.f6803k;
        c2520o.f20283z = this.f6804l;
        c2520o.f20276A = this.f6805m;
        c2520o.f20277B = this.f6806n;
    }
}

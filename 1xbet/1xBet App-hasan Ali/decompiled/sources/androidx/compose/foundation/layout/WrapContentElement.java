package androidx.compose.foundation.layout;

import b0.o;
import i4.e;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import u.AbstractC2462i;
import z.C2698W;
import z0.Z;

/* loaded from: classes.dex */
final class WrapContentElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final int f6862k;

    /* renamed from: l, reason: collision with root package name */
    public final m f6863l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f6864m;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(int i, e eVar, Object obj) {
        this.f6862k = i;
        this.f6863l = (m) eVar;
        this.f6864m = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f6862k == wrapContentElement.f6862k && l.a(this.f6864m, wrapContentElement.f6864m);
    }

    public final int hashCode() {
        return this.f6864m.hashCode() + (((AbstractC2462i.b(this.f6862k) * 31) + 1237) * 31);
    }

    @Override // z0.Z
    public final o i() {
        C2698W c2698w = new C2698W();
        c2698w.f21522y = this.f6862k;
        c2698w.f21523z = this.f6863l;
        return c2698w;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        C2698W c2698w = (C2698W) oVar;
        c2698w.f21522y = this.f6862k;
        c2698w.f21523z = this.f6863l;
    }
}

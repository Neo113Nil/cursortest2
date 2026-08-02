package androidx.compose.foundation.text.input.internal;

import G.C0129f;
import G.x;
import I.O;
import b0.o;
import kotlin.jvm.internal.l;
import z0.Z;

/* loaded from: classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final C0129f f6893k;

    /* renamed from: l, reason: collision with root package name */
    public final E.Z f6894l;

    /* renamed from: m, reason: collision with root package name */
    public final O f6895m;

    public LegacyAdaptingPlatformTextInputModifier(C0129f c0129f, E.Z z3, O o5) {
        this.f6893k = c0129f;
        this.f6894l = z3;
        this.f6895m = o5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return l.a(this.f6893k, legacyAdaptingPlatformTextInputModifier.f6893k) && l.a(this.f6894l, legacyAdaptingPlatformTextInputModifier.f6894l) && l.a(this.f6895m, legacyAdaptingPlatformTextInputModifier.f6895m);
    }

    public final int hashCode() {
        return this.f6895m.hashCode() + ((this.f6894l.hashCode() + (this.f6893k.hashCode() * 31)) * 31);
    }

    @Override // z0.Z
    public final o i() {
        O o5 = this.f6895m;
        return new x(this.f6893k, this.f6894l, o5);
    }

    @Override // z0.Z
    public final void k(o oVar) {
        x xVar = (x) oVar;
        if (xVar.f7175x) {
            xVar.f1756y.h();
            xVar.f1756y.k(xVar);
        }
        C0129f c0129f = this.f6893k;
        xVar.f1756y = c0129f;
        if (xVar.f7175x) {
            if (c0129f.f1728a != null) {
                throw new IllegalStateException("Expected textInputModifierNode to be null");
            }
            c0129f.f1728a = xVar;
        }
        xVar.f1757z = this.f6894l;
        xVar.f1754A = this.f6895m;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f6893k + ", legacyTextFieldState=" + this.f6894l + ", textFieldSelectionManager=" + this.f6895m + ')';
    }
}

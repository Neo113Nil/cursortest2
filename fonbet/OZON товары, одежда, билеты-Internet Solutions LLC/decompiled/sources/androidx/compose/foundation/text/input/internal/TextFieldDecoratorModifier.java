package androidx.compose.foundation.text.input.internal;

import B0.N0;
import D1.AbstractC2794c0;
import E0.F0;
import E0.Z0;
import E0.c1;
import F0.C2990k;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t0.q;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifier;", "LD1/c0;", "LE0/F0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TextFieldDecoratorModifier extends AbstractC2794c0<F0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c1 f39798a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Z0 f39799b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2990k f39800c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f39801d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final N0 f39802e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f39803f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final q f39804g;

    public TextFieldDecoratorModifier(@NotNull c1 c1Var, @NotNull Z0 z02, @NotNull C2990k c2990k, boolean z11, @NotNull N0 n02, boolean z12, @NotNull q qVar) {
        this.f39798a = c1Var;
        this.f39799b = z02;
        this.f39800c = c2990k;
        this.f39801d = z11;
        this.f39802e = n02;
        this.f39803f = z12;
        this.f39804g = qVar;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final F0 getF41119a() {
        return new F0(this.f39798a, this.f39799b, this.f39800c, this.f39801d, this.f39802e, this.f39803f, this.f39804g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldDecoratorModifier)) {
            return false;
        }
        TextFieldDecoratorModifier textFieldDecoratorModifier = (TextFieldDecoratorModifier) obj;
        return Intrinsics.d(this.f39798a, textFieldDecoratorModifier.f39798a) && Intrinsics.d(this.f39799b, textFieldDecoratorModifier.f39799b) && Intrinsics.d(this.f39800c, textFieldDecoratorModifier.f39800c) && this.f39801d == textFieldDecoratorModifier.f39801d && Intrinsics.d(this.f39802e, textFieldDecoratorModifier.f39802e) && this.f39803f == textFieldDecoratorModifier.f39803f && Intrinsics.d(this.f39804g, textFieldDecoratorModifier.f39804g);
    }

    public final int hashCode() {
        return this.f39804g.hashCode() + C3532b.a((this.f39802e.hashCode() + C3532b.a(C3532b.a((this.f39800c.hashCode() + ((this.f39799b.hashCode() + (this.f39798a.hashCode() * 31)) * 31)) * 961, 31, this.f39801d), 31, false)) * 961, 31, this.f39803f);
    }

    @NotNull
    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.f39798a + ", textLayoutState=" + this.f39799b + ", textFieldSelectionState=" + this.f39800c + ", filter=null, enabled=" + this.f39801d + ", readOnly=false, keyboardOptions=" + this.f39802e + ", keyboardActionHandler=null, singleLine=" + this.f39803f + ", interactionSource=" + this.f39804g + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(F0 f02) {
        f02.k2(this.f39798a, this.f39799b, this.f39800c, this.f39801d, this.f39802e, this.f39803f, this.f39804g);
    }
}

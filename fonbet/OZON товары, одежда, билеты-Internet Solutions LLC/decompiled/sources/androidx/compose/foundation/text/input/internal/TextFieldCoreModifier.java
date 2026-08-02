package androidx.compose.foundation.text.input.internal;

import D1.AbstractC2794c0;
import E0.D0;
import E0.Z0;
import E0.c1;
import F0.C2990k;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.K0;
import n0.d0;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifier;", "LD1/c0;", "LE0/D0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TextFieldCoreModifier extends AbstractC2794c0<D0> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f39789a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39790b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Z0 f39791c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final c1 f39792d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2990k f39793e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final K0 f39794f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f39795g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final d0 f39796h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final EnumC9142v f39797i;

    public TextFieldCoreModifier(boolean z11, boolean z12, @NotNull Z0 z02, @NotNull c1 c1Var, @NotNull C2990k c2990k, @NotNull K0 k02, boolean z13, @NotNull d0 d0Var, @NotNull EnumC9142v enumC9142v) {
        this.f39789a = z11;
        this.f39790b = z12;
        this.f39791c = z02;
        this.f39792d = c1Var;
        this.f39793e = c2990k;
        this.f39794f = k02;
        this.f39795g = z13;
        this.f39796h = d0Var;
        this.f39797i = enumC9142v;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final D0 getF41119a() {
        return new D0(this.f39789a, this.f39790b, this.f39791c, this.f39792d, this.f39793e, this.f39794f, this.f39795g, this.f39796h, this.f39797i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) obj;
        return this.f39789a == textFieldCoreModifier.f39789a && this.f39790b == textFieldCoreModifier.f39790b && Intrinsics.d(this.f39791c, textFieldCoreModifier.f39791c) && Intrinsics.d(this.f39792d, textFieldCoreModifier.f39792d) && Intrinsics.d(this.f39793e, textFieldCoreModifier.f39793e) && Intrinsics.d(this.f39794f, textFieldCoreModifier.f39794f) && this.f39795g == textFieldCoreModifier.f39795g && Intrinsics.d(this.f39796h, textFieldCoreModifier.f39796h) && this.f39797i == textFieldCoreModifier.f39797i;
    }

    public final int hashCode() {
        return this.f39797i.hashCode() + ((this.f39796h.hashCode() + C3532b.a((this.f39794f.hashCode() + ((this.f39793e.hashCode() + ((this.f39792d.hashCode() + ((this.f39791c.hashCode() + C3532b.a(Boolean.hashCode(this.f39789a) * 31, 31, this.f39790b)) * 31)) * 31)) * 31)) * 31, 31, this.f39795g)) * 31);
    }

    @NotNull
    public final String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.f39789a + ", isDragHovered=" + this.f39790b + ", textLayoutState=" + this.f39791c + ", textFieldState=" + this.f39792d + ", textFieldSelectionState=" + this.f39793e + ", cursorBrush=" + this.f39794f + ", writeable=" + this.f39795g + ", scrollState=" + this.f39796h + ", orientation=" + this.f39797i + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(D0 d02) {
        d02.T1(this.f39789a, this.f39790b, this.f39791c, this.f39792d, this.f39793e, this.f39794f, this.f39795g, this.f39796h, this.f39797i);
    }
}

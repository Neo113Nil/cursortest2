package androidx.compose.foundation.text.input.internal;

import B90.C2616s;
import D1.AbstractC2794c0;
import E0.W0;
import E0.Z0;
import E0.c1;
import K1.K;
import K1.T;
import Kk.C3532b;
import Z1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifier;", "LD1/c0;", "LE0/W0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TextFieldTextLayoutModifier extends AbstractC2794c0<W0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Z0 f39805a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c1 f39806b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final T f39807c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f39808d;

    /* renamed from: e, reason: collision with root package name */
    private final Function2<d, Function0<K>, Unit> f39809e;

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldTextLayoutModifier(@NotNull Z0 z02, @NotNull c1 c1Var, @NotNull T t2, boolean z11, Function2<? super d, ? super Function0<K>, Unit> function2) {
        this.f39805a = z02;
        this.f39806b = c1Var;
        this.f39807c = t2;
        this.f39808d = z11;
        this.f39809e = function2;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final W0 getF41119a() {
        return new W0(this.f39805a, this.f39806b, this.f39807c, this.f39808d, this.f39809e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        TextFieldTextLayoutModifier textFieldTextLayoutModifier = (TextFieldTextLayoutModifier) obj;
        return Intrinsics.d(this.f39805a, textFieldTextLayoutModifier.f39805a) && Intrinsics.d(this.f39806b, textFieldTextLayoutModifier.f39806b) && Intrinsics.d(this.f39807c, textFieldTextLayoutModifier.f39807c) && this.f39808d == textFieldTextLayoutModifier.f39808d && Intrinsics.d(this.f39809e, textFieldTextLayoutModifier.f39809e);
    }

    public final int hashCode() {
        int a11 = C3532b.a(C2616s.a((this.f39806b.hashCode() + (this.f39805a.hashCode() * 31)) * 31, 31, this.f39807c), 31, this.f39808d);
        Function2<d, Function0<K>, Unit> function2 = this.f39809e;
        return a11 + (function2 == null ? 0 : function2.hashCode());
    }

    @NotNull
    public final String toString() {
        return "TextFieldTextLayoutModifier(textLayoutState=" + this.f39805a + ", textFieldState=" + this.f39806b + ", textStyle=" + this.f39807c + ", singleLine=" + this.f39808d + ", onTextLayout=" + this.f39809e + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(W0 w02) {
        w02.I1(this.f39805a, this.f39806b, this.f39807c, this.f39808d, this.f39809e);
    }
}

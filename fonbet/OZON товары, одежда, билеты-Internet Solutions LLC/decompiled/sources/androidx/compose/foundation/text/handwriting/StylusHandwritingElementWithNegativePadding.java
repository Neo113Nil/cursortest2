package androidx.compose.foundation.text.handwriting;

import C0.b;
import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingElementWithNegativePadding;", "LD1/c0;", "LC0/b;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* data */ class StylusHandwritingElementWithNegativePadding extends AbstractC2794c0<b> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f39783a;

    public StylusHandwritingElementWithNegativePadding(@NotNull Function0<Boolean> function0) {
        this.f39783a = function0;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final b getF41119a() {
        return new b(this.f39783a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && Intrinsics.d(this.f39783a, ((StylusHandwritingElementWithNegativePadding) obj).f39783a);
    }

    public final int hashCode() {
        return this.f39783a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.f39783a + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(b bVar) {
        bVar.P1(this.f39783a);
    }
}

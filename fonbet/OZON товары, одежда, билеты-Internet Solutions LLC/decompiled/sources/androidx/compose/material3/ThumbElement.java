package androidx.compose.material3;

import B4.V;
import D1.AbstractC2794c0;
import D1.C2809k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t0.q;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/ThumbElement;", "LD1/c0;", "Landroidx/compose/material3/i;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* data */ class ThumbElement extends AbstractC2794c0<i> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final q f40163a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f40164b;

    public ThumbElement(@NotNull q qVar, boolean z11) {
        this.f40163a = qVar;
        this.f40164b = z11;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final i getF41119a() {
        return new i(this.f40163a, this.f40164b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return Intrinsics.d(this.f40163a, thumbElement.f40163a) && this.f40164b == thumbElement.f40164b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40164b) + (this.f40163a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThumbElement(interactionSource=");
        sb2.append(this.f40163a);
        sb2.append(", checked=");
        return V.d(sb2, this.f40164b, ')');
    }

    @Override // D1.AbstractC2794c0
    public final void update(i iVar) {
        i iVar2 = iVar;
        iVar2.P1(this.f40163a);
        boolean M12 = iVar2.M1();
        boolean z11 = this.f40164b;
        if (M12 != z11) {
            C2809k.f(iVar2).u0();
        }
        iVar2.O1(z11);
        iVar2.Q1();
    }
}

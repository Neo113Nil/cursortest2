package androidx.compose.foundation;

import D1.AbstractC2794c0;
import Sc.C;
import androidx.compose.ui.platform.C5242e1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.J0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "LD1/c0;", "Landroidx/compose/foundation/g;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackgroundElement extends AbstractC2794c0<g> {

    /* renamed from: a, reason: collision with root package name */
    private final long f38842a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7799Q f38843b;

    /* renamed from: c, reason: collision with root package name */
    private final float f38844c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final J0 f38845d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<C5242e1, Unit> f38846e;

    private BackgroundElement() {
        throw null;
    }

    public BackgroundElement(long j11, AbstractC7799Q abstractC7799Q, float f7, J0 j02, Function1 function1, int i11) {
        j11 = (i11 & 1) != 0 ? C7807Z.f72259m : j11;
        abstractC7799Q = (i11 & 2) != 0 ? null : abstractC7799Q;
        this.f38842a = j11;
        this.f38843b = abstractC7799Q;
        this.f38844c = f7;
        this.f38845d = j02;
        this.f38846e = function1;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final g getF41119a() {
        return new g(this.f38842a, this.f38843b, this.f38844c, this.f38845d);
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && C7807Z.p(this.f38842a, backgroundElement.f38842a) && Intrinsics.d(this.f38843b, backgroundElement.f38843b) && this.f38844c == backgroundElement.f38844c && Intrinsics.d(this.f38845d, backgroundElement.f38845d);
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        int hashCode = Long.hashCode(this.f38842a) * 31;
        AbstractC7799Q abstractC7799Q = this.f38843b;
        return this.f38845d.hashCode() + Pk0.b.a(this.f38844c, (hashCode + (abstractC7799Q != null ? abstractC7799Q.hashCode() : 0)) * 31, 31);
    }

    @Override // D1.AbstractC2794c0
    public final void update(g gVar) {
        g gVar2 = gVar;
        gVar2.J1(this.f38842a);
        gVar2.I1(this.f38843b);
        gVar2.setAlpha(this.f38844c);
        gVar2.setShape(this.f38845d);
    }
}

package androidx.compose.foundation;

import D1.AbstractC2794c0;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "LD1/c0;", "Landroidx/compose/foundation/m;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ClickableElement extends AbstractC2794c0<m> {

    /* renamed from: a, reason: collision with root package name */
    private final t0.q f38850a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8369J f38851b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38852c;

    /* renamed from: d, reason: collision with root package name */
    private final String f38853d;

    /* renamed from: e, reason: collision with root package name */
    private final I1.i f38854e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f38855f;

    private ClickableElement() {
        throw null;
    }

    public ClickableElement(t0.q qVar, InterfaceC8369J interfaceC8369J, boolean z11, String str, I1.i iVar, Function0 function0) {
        this.f38850a = qVar;
        this.f38851b = interfaceC8369J;
        this.f38852c = z11;
        this.f38853d = str;
        this.f38854e = iVar;
        this.f38855f = function0;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final m getF41119a() {
        return new m(this.f38850a, this.f38851b, this.f38852c, this.f38853d, this.f38854e, this.f38855f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return Intrinsics.d(this.f38850a, clickableElement.f38850a) && Intrinsics.d(this.f38851b, clickableElement.f38851b) && this.f38852c == clickableElement.f38852c && Intrinsics.d(this.f38853d, clickableElement.f38853d) && Intrinsics.d(this.f38854e, clickableElement.f38854e) && this.f38855f == clickableElement.f38855f;
    }

    public final int hashCode() {
        t0.q qVar = this.f38850a;
        int hashCode = (qVar != null ? qVar.hashCode() : 0) * 31;
        InterfaceC8369J interfaceC8369J = this.f38851b;
        int a11 = C3532b.a((hashCode + (interfaceC8369J != null ? interfaceC8369J.hashCode() : 0)) * 31, 31, this.f38852c);
        String str = this.f38853d;
        int hashCode2 = (a11 + (str != null ? str.hashCode() : 0)) * 31;
        I1.i iVar = this.f38854e;
        return this.f38855f.hashCode() + ((hashCode2 + (iVar != null ? Integer.hashCode(iVar.b()) : 0)) * 31);
    }

    @Override // D1.AbstractC2794c0
    public final void update(m mVar) {
        mVar.a2(this.f38850a, this.f38851b, this.f38852c, this.f38853d, this.f38854e, this.f38855f);
    }
}

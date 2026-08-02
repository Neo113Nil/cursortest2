package androidx.compose.foundation.layout;

import D1.AbstractC2794c0;
import androidx.compose.ui.platform.C5242e1;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "LD1/c0;", "Landroidx/compose/foundation/layout/g;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BoxChildDataElement extends AbstractC2794c0<C5184g> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6250b f39303a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39304b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<C5242e1, Unit> f39305c;

    /* JADX WARN: Multi-variable type inference failed */
    public BoxChildDataElement(@NotNull InterfaceC6250b interfaceC6250b, boolean z11, @NotNull Function1<? super C5242e1, Unit> function1) {
        this.f39303a = interfaceC6250b;
        this.f39304b = z11;
        this.f39305c = function1;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final C5184g getF41119a() {
        return new C5184g(this.f39303a, this.f39304b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && Intrinsics.d(this.f39303a, boxChildDataElement.f39303a) && this.f39304b == boxChildDataElement.f39304b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39304b) + (this.f39303a.hashCode() * 31);
    }

    @Override // D1.AbstractC2794c0
    public final void update(C5184g c5184g) {
        C5184g c5184g2 = c5184g;
        c5184g2.K1(this.f39303a);
        c5184g2.L1(this.f39304b);
    }
}

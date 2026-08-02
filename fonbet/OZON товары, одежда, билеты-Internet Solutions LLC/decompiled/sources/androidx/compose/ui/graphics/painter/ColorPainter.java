package androidx.compose.ui.graphics.painter;

import Sc.C;
import kotlin.Metadata;
import l1.C7807Z;
import l1.C7809a0;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/painter/ColorPainter;", "Lq1/b;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ColorPainter extends AbstractC8972b {

    /* renamed from: a, reason: collision with root package name */
    private final long f40454a;

    /* renamed from: c, reason: collision with root package name */
    private C7809a0 f40456c;

    /* renamed from: b, reason: collision with root package name */
    private float f40455b = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private final long f40457d = 9205357640488583168L;

    public ColorPainter(long j11) {
        this.f40454a = j11;
    }

    @Override // q1.AbstractC8972b
    protected final boolean applyAlpha(float f7) {
        this.f40455b = f7;
        return true;
    }

    @Override // q1.AbstractC8972b
    protected final boolean applyColorFilter(C7809a0 c7809a0) {
        this.f40456c = c7809a0;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ColorPainter) {
            return C7807Z.p(this.f40454a, ((ColorPainter) obj).f40454a);
        }
        return false;
    }

    @Override // q1.AbstractC8972b
    /* renamed from: getIntrinsicSize-NH-jbRc, reason: from getter */
    public final long getF40457d() {
        return this.f40457d;
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        return Long.hashCode(this.f40454a);
    }

    @Override // q1.AbstractC8972b
    protected final void onDraw(@NotNull InterfaceC8412e interfaceC8412e) {
        InterfaceC8412e.Q(interfaceC8412e, this.f40454a, 0L, 0L, this.f40455b, this.f40456c, 86);
    }

    @NotNull
    public final String toString() {
        return "ColorPainter(color=" + ((Object) C7807Z.v(this.f40454a)) + ')';
    }
}

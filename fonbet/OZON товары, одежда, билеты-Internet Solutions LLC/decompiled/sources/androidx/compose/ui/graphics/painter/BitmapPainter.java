package androidx.compose.ui.graphics.painter;

import Pk0.c;
import Z1.m;
import Z1.q;
import Z1.r;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7809a0;
import l1.InterfaceC7829k0;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Lq1/b;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BitmapPainter extends AbstractC8972b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC7829k0 f40448a;

    /* renamed from: b, reason: collision with root package name */
    private final long f40449b;

    /* renamed from: c, reason: collision with root package name */
    private int f40450c = 1;

    /* renamed from: d, reason: collision with root package name */
    private final long f40451d;

    /* renamed from: e, reason: collision with root package name */
    private float f40452e;

    /* renamed from: f, reason: collision with root package name */
    private C7809a0 f40453f;

    public BitmapPainter(InterfaceC7829k0 interfaceC7829k0, long j11) {
        int i11;
        int i12;
        this.f40448a = interfaceC7829k0;
        this.f40449b = j11;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i11 = (int) (j11 >> 32)) < 0 || (i12 = (int) (4294967295L & j11)) < 0 || i11 > interfaceC7829k0.getWidth() || i12 > interfaceC7829k0.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f40451d = j11;
        this.f40452e = 1.0f;
    }

    public final void a(int i11) {
        this.f40450c = i11;
    }

    @Override // q1.AbstractC8972b
    protected final boolean applyAlpha(float f7) {
        this.f40452e = f7;
        return true;
    }

    @Override // q1.AbstractC8972b
    protected final boolean applyColorFilter(C7809a0 c7809a0) {
        this.f40453f = c7809a0;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return Intrinsics.d(this.f40448a, bitmapPainter.f40448a) && m.c(0L, 0L) && q.c(this.f40449b, bitmapPainter.f40449b) && this.f40450c == bitmapPainter.f40450c;
    }

    @Override // q1.AbstractC8972b
    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public final long mo14getIntrinsicSizeNHjbRc() {
        return r.b(this.f40451d);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40450c) + c.a(c.a(this.f40448a.hashCode() * 31, 31, 0L), 31, this.f40449b);
    }

    @Override // q1.AbstractC8972b
    protected final void onDraw(@NotNull InterfaceC8412e interfaceC8412e) {
        InterfaceC8412e.y1(interfaceC8412e, this.f40448a, 0L, this.f40449b, 0L, r.a(Math.round(C7464j.f(interfaceC8412e.i())), Math.round(C7464j.d(interfaceC8412e.i()))), this.f40452e, null, this.f40453f, 0, this.f40450c, 328);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.f40448a);
        sb2.append(", srcOffset=");
        sb2.append((Object) m.f(0L));
        sb2.append(", srcSize=");
        sb2.append((Object) q.d(this.f40449b));
        sb2.append(", filterQuality=");
        int i11 = this.f40450c;
        sb2.append((Object) (i11 == 0 ? "None" : i11 == 1 ? "Low" : i11 == 2 ? "Medium" : i11 == 3 ? "High" : "Unknown"));
        sb2.append(')');
        return sb2.toString();
    }
}

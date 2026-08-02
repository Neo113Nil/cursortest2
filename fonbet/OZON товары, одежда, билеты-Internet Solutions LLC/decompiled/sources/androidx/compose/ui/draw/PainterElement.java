package androidx.compose.ui.draw;

import B1.InterfaceC2547p;
import D1.AbstractC2794c0;
import D1.C2809k;
import D1.C2820u;
import Kk.C3532b;
import e1.InterfaceC6250b;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7809a0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "LD1/c0;", "Landroidx/compose/ui/draw/PainterNode;", "Lq1/b;", "painter", "Lq1/b;", "getPainter", "()Lq1/b;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class PainterElement extends AbstractC2794c0<PainterNode> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f40331a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6250b f40332b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC2547p f40333c;

    /* renamed from: d, reason: collision with root package name */
    private final float f40334d;

    /* renamed from: e, reason: collision with root package name */
    private final C7809a0 f40335e;

    @NotNull
    private final AbstractC8972b painter;

    public PainterElement(@NotNull AbstractC8972b abstractC8972b, boolean z11, @NotNull InterfaceC6250b interfaceC6250b, @NotNull InterfaceC2547p interfaceC2547p, float f7, C7809a0 c7809a0) {
        this.painter = abstractC8972b;
        this.f40331a = z11;
        this.f40332b = interfaceC6250b;
        this.f40333c = interfaceC2547p;
        this.f40334d = f7;
        this.f40335e = c7809a0;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final PainterNode getF41119a() {
        return new PainterNode(this.painter, this.f40331a, this.f40332b, this.f40333c, this.f40334d, this.f40335e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return Intrinsics.d(this.painter, painterElement.painter) && this.f40331a == painterElement.f40331a && Intrinsics.d(this.f40332b, painterElement.f40332b) && Intrinsics.d(this.f40333c, painterElement.f40333c) && Float.compare(this.f40334d, painterElement.f40334d) == 0 && Intrinsics.d(this.f40335e, painterElement.f40335e);
    }

    public final int hashCode() {
        int a11 = Pk0.b.a(this.f40334d, (this.f40333c.hashCode() + ((this.f40332b.hashCode() + C3532b.a(this.painter.hashCode() * 31, 31, this.f40331a)) * 31)) * 31, 31);
        C7809a0 c7809a0 = this.f40335e;
        return a11 + (c7809a0 == null ? 0 : c7809a0.hashCode());
    }

    @NotNull
    public final String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.f40331a + ", alignment=" + this.f40332b + ", contentScale=" + this.f40333c + ", alpha=" + this.f40334d + ", colorFilter=" + this.f40335e + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(PainterNode painterNode) {
        PainterNode painterNode2 = painterNode;
        boolean f40336a = painterNode2.getF40336a();
        boolean z11 = this.f40331a;
        boolean z12 = f40336a != z11 || (z11 && !C7464j.c(painterNode2.getPainter().getF40457d(), this.painter.getF40457d()));
        painterNode2.R1(this.painter);
        painterNode2.S1(z11);
        painterNode2.O1(this.f40332b);
        painterNode2.Q1(this.f40333c);
        painterNode2.setAlpha(this.f40334d);
        painterNode2.P1(this.f40335e);
        if (z12) {
            C2809k.f(painterNode2).u0();
        }
        C2820u.a(painterNode2);
    }
}

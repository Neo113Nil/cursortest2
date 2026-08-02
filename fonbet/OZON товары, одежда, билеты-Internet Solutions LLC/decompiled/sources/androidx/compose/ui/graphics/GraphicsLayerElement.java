package androidx.compose.ui.graphics;

import D1.AbstractC2794c0;
import Kk.C3532b;
import Sc.C;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.J0;
import l1.N0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "LD1/c0;", "Landroidx/compose/ui/graphics/c;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class GraphicsLayerElement extends AbstractC2794c0<c> {

    /* renamed from: a, reason: collision with root package name */
    private final float f40418a;

    /* renamed from: b, reason: collision with root package name */
    private final float f40419b;

    /* renamed from: c, reason: collision with root package name */
    private final float f40420c;

    /* renamed from: d, reason: collision with root package name */
    private final float f40421d;

    /* renamed from: e, reason: collision with root package name */
    private final float f40422e;

    /* renamed from: f, reason: collision with root package name */
    private final float f40423f;

    /* renamed from: g, reason: collision with root package name */
    private final float f40424g = 8.0f;

    /* renamed from: h, reason: collision with root package name */
    private final long f40425h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final J0 f40426i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f40427j;

    /* renamed from: k, reason: collision with root package name */
    private final long f40428k;

    /* renamed from: l, reason: collision with root package name */
    private final long f40429l;

    /* renamed from: m, reason: collision with root package name */
    private final int f40430m;

    public GraphicsLayerElement(float f7, float f11, float f12, float f13, float f14, float f15, long j11, J0 j02, boolean z11, long j12, long j13, int i11) {
        this.f40418a = f7;
        this.f40419b = f11;
        this.f40420c = f12;
        this.f40421d = f13;
        this.f40422e = f14;
        this.f40423f = f15;
        this.f40425h = j11;
        this.f40426i = j02;
        this.f40427j = z11;
        this.f40428k = j12;
        this.f40429l = j13;
        this.f40430m = i11;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final c getF41119a() {
        return new c(this.f40418a, this.f40419b, this.f40420c, this.f40421d, this.f40422e, this.f40423f, this.f40424g, this.f40425h, this.f40426i, this.f40427j, this.f40428k, this.f40429l, this.f40430m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f40418a, graphicsLayerElement.f40418a) == 0 && Float.compare(this.f40419b, graphicsLayerElement.f40419b) == 0 && Float.compare(this.f40420c, graphicsLayerElement.f40420c) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f40421d, graphicsLayerElement.f40421d) == 0 && Float.compare(this.f40422e, graphicsLayerElement.f40422e) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f40423f, graphicsLayerElement.f40423f) == 0 && Float.compare(this.f40424g, graphicsLayerElement.f40424g) == 0 && N0.c(this.f40425h, graphicsLayerElement.f40425h) && Intrinsics.d(this.f40426i, graphicsLayerElement.f40426i) && this.f40427j == graphicsLayerElement.f40427j && C7807Z.p(this.f40428k, graphicsLayerElement.f40428k) && C7807Z.p(this.f40429l, graphicsLayerElement.f40429l) && this.f40430m == graphicsLayerElement.f40430m;
    }

    public final int hashCode() {
        int a11 = Pk0.b.a(this.f40424g, Pk0.b.a(this.f40423f, Pk0.b.a(0.0f, Pk0.b.a(0.0f, Pk0.b.a(this.f40422e, Pk0.b.a(this.f40421d, Pk0.b.a(0.0f, Pk0.b.a(this.f40420c, Pk0.b.a(this.f40419b, Float.hashCode(this.f40418a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i11 = N0.f72233c;
        int a12 = C3532b.a((this.f40426i.hashCode() + Pk0.c.a(a11, 31, this.f40425h)) * 31, 961, this.f40427j);
        int i12 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        return Integer.hashCode(this.f40430m) + Pk0.c.a(Pk0.c.a(a12, 31, this.f40428k), 31, this.f40429l);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb2.append(this.f40418a);
        sb2.append(", scaleY=");
        sb2.append(this.f40419b);
        sb2.append(", alpha=");
        sb2.append(this.f40420c);
        sb2.append(", translationX=0.0, translationY=");
        sb2.append(this.f40421d);
        sb2.append(", shadowElevation=");
        sb2.append(this.f40422e);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb2.append(this.f40423f);
        sb2.append(", cameraDistance=");
        sb2.append(this.f40424g);
        sb2.append(", transformOrigin=");
        sb2.append((Object) N0.f(this.f40425h));
        sb2.append(", shape=");
        sb2.append(this.f40426i);
        sb2.append(", clip=");
        sb2.append(this.f40427j);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        Bi.a.e(this.f40428k, ", spotShadowColor=", sb2);
        sb2.append((Object) C7807Z.v(this.f40429l));
        sb2.append(", compositingStrategy=");
        sb2.append((Object) ("CompositingStrategy(value=" + this.f40430m + ')'));
        sb2.append(')');
        return sb2.toString();
    }

    @Override // D1.AbstractC2794c0
    public final void update(c cVar) {
        c cVar2 = cVar;
        cVar2.j(this.f40418a);
        cVar2.k(this.f40419b);
        cVar2.setAlpha(this.f40420c);
        cVar2.c(this.f40421d);
        cVar2.z(this.f40422e);
        cVar2.h(this.f40423f);
        cVar2.d(this.f40424g);
        cVar2.g0(this.f40425h);
        cVar2.setShape(this.f40426i);
        cVar2.x(this.f40427j);
        cVar2.H(this.f40428k);
        cVar2.J(this.f40429l);
        cVar2.q(this.f40430m);
        cVar2.U1();
    }
}

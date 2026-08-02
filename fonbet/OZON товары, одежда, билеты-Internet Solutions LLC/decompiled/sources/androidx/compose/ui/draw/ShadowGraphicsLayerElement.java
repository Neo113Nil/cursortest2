package androidx.compose.ui.draw;

import D1.AbstractC2794c0;
import Kk.C3532b;
import Sc.C;
import Z1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7797O;
import l1.C7807Z;
import l1.J0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "LD1/c0;", "Ll1/O;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ShadowGraphicsLayerElement extends AbstractC2794c0<C7797O> {

    /* renamed from: a, reason: collision with root package name */
    private final float f40342a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final J0 f40343b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f40344c;

    /* renamed from: d, reason: collision with root package name */
    private final long f40345d;

    /* renamed from: e, reason: collision with root package name */
    private final long f40346e;

    public ShadowGraphicsLayerElement(float f7, J0 j02, boolean z11, long j11, long j12) {
        this.f40342a = f7;
        this.f40343b = j02;
        this.f40344c = z11;
        this.f40345d = j11;
        this.f40346e = j12;
    }

    /* renamed from: a, reason: from getter */
    public final long getF40345d() {
        return this.f40345d;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getF40344c() {
        return this.f40344c;
    }

    /* renamed from: c, reason: from getter */
    public final float getF40342a() {
        return this.f40342a;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final C7797O getF41119a() {
        return new C7797O(new g(this));
    }

    @NotNull
    /* renamed from: d, reason: from getter */
    public final J0 getF40343b() {
        return this.f40343b;
    }

    /* renamed from: e, reason: from getter */
    public final long getF40346e() {
        return this.f40346e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return h.b(this.f40342a, shadowGraphicsLayerElement.f40342a) && Intrinsics.d(this.f40343b, shadowGraphicsLayerElement.f40343b) && this.f40344c == shadowGraphicsLayerElement.f40344c && C7807Z.p(this.f40345d, shadowGraphicsLayerElement.f40345d) && C7807Z.p(this.f40346e, shadowGraphicsLayerElement.f40346e);
    }

    public final int hashCode() {
        int a11 = C3532b.a((this.f40343b.hashCode() + (Float.hashCode(this.f40342a) * 31)) * 31, 31, this.f40344c);
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        return Long.hashCode(this.f40346e) + Pk0.c.a(a11, 31, this.f40345d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb2.append((Object) h.c(this.f40342a));
        sb2.append(", shape=");
        sb2.append(this.f40343b);
        sb2.append(", clip=");
        sb2.append(this.f40344c);
        sb2.append(", ambientColor=");
        Bi.a.e(this.f40345d, ", spotColor=", sb2);
        sb2.append((Object) C7807Z.v(this.f40346e));
        sb2.append(')');
        return sb2.toString();
    }

    @Override // D1.AbstractC2794c0
    public final void update(C7797O c7797o) {
        C7797O c7797o2 = c7797o;
        c7797o2.K1(new g(this));
        c7797o2.J1();
    }
}

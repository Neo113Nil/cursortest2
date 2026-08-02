package C;

import i4.InterfaceC2015a;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.m;
import z0.e0;

/* loaded from: classes.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.j implements InterfaceC2015a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f782k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e0 f783l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f784m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(i iVar, e0 e0Var, InterfaceC2015a interfaceC2015a) {
        super(0, k.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.f782k = iVar;
        this.f783l = e0Var;
        this.f784m = (m) interfaceC2015a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i4.a, kotlin.jvm.internal.m] */
    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        ?? r02 = this.f784m;
        return i.y0(this.f782k, this.f783l, r02);
    }
}

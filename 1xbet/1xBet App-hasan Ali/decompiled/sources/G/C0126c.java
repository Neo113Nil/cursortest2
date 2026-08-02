package G;

import x0.InterfaceC2637x;

/* renamed from: G.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0126c extends kotlin.jvm.internal.j implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x f1716k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0126c(x xVar) {
        super(1, kotlin.jvm.internal.k.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f1716k = xVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        float[] fArr = ((i0.z) obj).f17303a;
        InterfaceC2637x interfaceC2637x = (InterfaceC2637x) this.f1716k.f1755B.getValue();
        if (interfaceC2637x != null) {
            if (!interfaceC2637x.F()) {
                interfaceC2637x = null;
            }
            if (interfaceC2637x != null) {
                interfaceC2637x.G(fArr);
            }
        }
        return W3.o.f6046a;
    }
}

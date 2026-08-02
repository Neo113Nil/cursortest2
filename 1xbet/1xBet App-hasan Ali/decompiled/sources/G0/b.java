package G0;

import G4.l;
import W3.o;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import i0.F;
import java.util.function.Consumer;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class b extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f1777k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f1778l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScrollCaptureSession f1779m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Rect f1780n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Consumer f1781o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, a4.c cVar) {
        super(2, cVar);
        this.f1778l = fVar;
        this.f1779m = scrollCaptureSession;
        this.f1780n = rect;
        this.f1781o = consumer;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new b(this.f1778l, this.f1779m, this.f1780n, this.f1781o, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1777k;
        if (i == 0) {
            l.N(obj);
            ScrollCaptureSession scrollCaptureSession = this.f1779m;
            Rect rect = this.f1780n;
            W0.k kVar = new W0.k(rect.left, rect.top, rect.right, rect.bottom);
            this.f1777k = 1;
            obj = f.a(this.f1778l, scrollCaptureSession, kVar, this);
            if (obj == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.N(obj);
        }
        this.f1781o.accept(F.r((W0.k) obj));
        return o.f6046a;
    }
}

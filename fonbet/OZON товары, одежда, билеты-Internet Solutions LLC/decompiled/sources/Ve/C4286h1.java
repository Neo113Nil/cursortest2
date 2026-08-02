package Ve;

import Sc.r;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nm0.C8609D;

/* renamed from: Ve.h1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4286h1 extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31133c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4286h1(Object obj, int i11) {
        super(1);
        this.f31132b = i11;
        this.f31133c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object a11;
        Object obj2 = this.f31133c;
        switch (this.f31132b) {
            case 0:
                Zb it = (Zb) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((N9) ((J4) obj2).u()).e0(Ah.f28614a);
                break;
            default:
                lm0.e emitter = (lm0.e) obj;
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                C8609D c8609d = (C8609D) obj2;
                try {
                    r.Companion companion = Sc.r.INSTANCE;
                    Context context = c8609d.f77384a;
                    String applicationId = c8609d.f77385b;
                    Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
                    C8609D.a(c8609d.f77384a, new nm0.y(emitter, 0), new nm0.o(context, applicationId, new nm0.z(emitter), new Dr(emitter, 1)));
                    a11 = Unit.f71690a;
                } catch (Throwable th2) {
                    r.Companion companion2 = Sc.r.INSTANCE;
                    a11 = Sc.s.a(th2);
                }
                Throwable b11 = Sc.r.b(a11);
                if (b11 != null) {
                    emitter.a(b11);
                }
                break;
        }
        return Unit.f71690a;
    }
}

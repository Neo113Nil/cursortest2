package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.k1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4372k1 extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31410c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4372k1(Object obj, int i11) {
        super(1);
        this.f31409b = i11;
        this.f31410c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f31409b) {
            case 0:
                ((Z2) this.f31410c).f30543l.setValue(Long.valueOf(((Number) obj).longValue()));
                break;
            default:
                Zi it = (Zi) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((N9) ((J4) this.f31410c).u()).e0(new Ai(it));
                break;
        }
        return Unit.f71690a;
    }
}

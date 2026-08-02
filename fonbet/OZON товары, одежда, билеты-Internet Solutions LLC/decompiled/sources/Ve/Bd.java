package Ve;

import Lm0.a;
import g.C6594f;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ol0.C8751c;
import rl0.C9300k;
import rl0.C9313y;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class Bd extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28695b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28696c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28697d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Bd(int i11, Object obj, Object obj2) {
        super(0);
        this.f28695b = i11;
        this.f28696c = obj;
        this.f28697d = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28695b) {
            case 0:
                a.b bVar = Lm0.a.f17149a;
                bVar.b("METRIC SENT");
                StringBuilder b11 = C6594f.b("action : ", ((Bi) this.f28696c).f28707a.a(), ", ");
                b11.append((LinkedHashMap) this.f28697d);
                bVar.i(b11.toString(), new Object[0]);
                break;
            case 1:
                Z2 z22 = (Z2) this.f28696c;
                C10727i.c(androidx.lifecycle.x0.a(z22), null, null, new C4682um(z22, (String) this.f28697d, (kotlin.coroutines.d) null), 3);
                break;
            default:
                C9300k c9300k = (C9300k) this.f28696c;
                c9300k.getClass();
                C8751c.a(c9300k.f83689d, (C9313y) this.f28697d);
                break;
        }
        return Unit.f71690a;
    }
}

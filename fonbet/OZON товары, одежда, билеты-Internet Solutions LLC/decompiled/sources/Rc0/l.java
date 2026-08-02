package Rc0;

import Sc.InterfaceC4008j;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import f3.AbstractC6409a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
public final class l extends AbstractC7737t implements Function0<AbstractC6409a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f25001b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC4008j interfaceC4008j) {
        super(0);
        this.f25001b = interfaceC4008j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AbstractC6409a invoke() {
        B0 b02 = (B0) this.f25001b.getValue();
        InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
        return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
    }
}

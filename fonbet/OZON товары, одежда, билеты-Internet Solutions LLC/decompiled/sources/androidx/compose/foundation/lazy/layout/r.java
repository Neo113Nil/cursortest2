package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import x0.InterfaceC10620y;

/* loaded from: classes.dex */
final class r extends AbstractC7737t implements Function1<Object, Integer> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f39680b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(q qVar) {
        super(1);
        this.f39680b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Object obj) {
        InterfaceC10620y interfaceC10620y = (InterfaceC10620y) this.f39680b.f39669a.invoke();
        int itemCount = interfaceC10620y.getItemCount();
        int i11 = 0;
        while (true) {
            if (i11 >= itemCount) {
                i11 = -1;
                break;
            }
            if (interfaceC10620y.d(i11).equals(obj)) {
                break;
            }
            i11++;
        }
        return Integer.valueOf(i11);
    }
}

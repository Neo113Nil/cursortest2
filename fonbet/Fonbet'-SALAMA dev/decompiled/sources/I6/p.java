package I6;

import A1.W;
import D6.E;
import f6.C1116i;
import i6.InterfaceC1292i;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class p extends t6.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f3753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1292i f3755c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Function1 function1, Object obj, InterfaceC1292i interfaceC1292i) {
        super(1);
        this.f3753a = function1;
        this.f3754b = obj;
        this.f3755c = interfaceC1292i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        W a2 = a.a(this.f3753a, this.f3754b, null);
        if (a2 != null) {
            E.k(this.f3755c, a2);
        }
        return C1116i.f13008a;
    }
}

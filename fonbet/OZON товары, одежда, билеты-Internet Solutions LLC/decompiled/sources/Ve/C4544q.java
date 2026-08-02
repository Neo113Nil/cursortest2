package Ve;

import fd.InterfaceC6511n;
import kotlin.Unit;
import spay.sdk.R;

/* renamed from: Ve.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4544q extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ String f31819d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Sr f31820e;

    public C4544q() {
        super(3, null);
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C4544q c4544q = new C4544q(3, (kotlin.coroutines.d) obj3);
        c4544q.f31819d = (String) obj;
        c4544q.f31820e = (Sr) obj2;
        return c4544q.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        String str = this.f31819d;
        Sr sr = this.f31820e;
        return Boolean.valueOf(str != null && str.length() == 5 && (sr == null || sr.equals(E.d(R.string.spay_empty_string))));
    }
}

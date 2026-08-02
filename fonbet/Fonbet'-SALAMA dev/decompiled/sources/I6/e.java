package I6;

import D6.C;
import i6.InterfaceC1292i;

/* loaded from: classes2.dex */
public final class e implements C {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1292i f3726a;

    public e(InterfaceC1292i interfaceC1292i) {
        this.f3726a = interfaceC1292i;
    }

    @Override // D6.C
    public final InterfaceC1292i c() {
        return this.f3726a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f3726a + ')';
    }
}

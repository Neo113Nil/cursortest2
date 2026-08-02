package I8;

import io.sentry.C7211v;
import io.sentry.W2;
import io.sentry.util.l;
import n8.C8451a;
import n8.InterfaceC8452b;
import n8.e;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements e, l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f12000a;

    public /* synthetic */ a(W2 w22) {
        this.f12000a = w22;
    }

    @Override // n8.e
    public Object a(InterfaceC8452b interfaceC8452b) {
        return ((C8451a) this.f12000a).f().a(interfaceC8452b);
    }

    @Override // io.sentry.util.l.a
    public Object g() {
        C7211v lambda$new$0;
        lambda$new$0 = ((W2) this.f12000a).lambda$new$0();
        return lambda$new$0;
    }
}

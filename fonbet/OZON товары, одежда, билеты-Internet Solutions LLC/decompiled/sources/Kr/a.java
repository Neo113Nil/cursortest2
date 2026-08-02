package Kr;

import java.util.concurrent.Callable;
import k20.InterfaceC7469a;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16031b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f16030a = i11;
        this.f16031b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f16030a) {
            case 0:
                return ((L00.c) this.f16031b).b();
            default:
                return ((InterfaceC7469a) this.f16031b).component();
        }
    }
}

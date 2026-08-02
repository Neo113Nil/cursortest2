package Ve;

import spay.sdk.view.SpayBnplGraphCompositeView;

/* renamed from: Ve.o9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4496o9 implements Jl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4699va f31713a;

    public C4496o9(C4699va c4699va) {
        this.f31713a = c4699va;
    }

    @Override // Ve.Jl
    public final void a(int i11) {
        X4.a aVar = this.f31713a.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        SpayBnplGraphCompositeView spayBnplGraphCompositeView = ((S0) aVar).f29934j;
        spayBnplGraphCompositeView.a(spayBnplGraphCompositeView.f98880c.size(), i11);
    }
}

package I;

import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import p.InterfaceC8822a;

/* loaded from: classes8.dex */
final class l implements c<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b.a f11276a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC8822a f11277b;

    l(b.a aVar, InterfaceC8822a interfaceC8822a) {
        this.f11276a = aVar;
        this.f11277b = interfaceC8822a;
    }

    @Override // I.c
    public final void onFailure(@NonNull Throwable th2) {
        this.f11276a.e(th2);
    }

    @Override // I.c
    public final void onSuccess(Object obj) {
        b.a aVar = this.f11276a;
        try {
            aVar.c(this.f11277b.apply(obj));
        } catch (Throwable th2) {
            aVar.e(th2);
        }
    }
}

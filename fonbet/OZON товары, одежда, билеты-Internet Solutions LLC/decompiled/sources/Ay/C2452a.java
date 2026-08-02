package Ay;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qc.g;
import qc.q;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerConversionStorageImpl;
import wl0.c;
import xl0.AbstractC10783a;
import yl0.C10923h;
import yl0.InterfaceC10919d;

/* renamed from: Ay.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C2452a implements g, q, InterfaceC10919d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1295a;

    public /* synthetic */ C2452a(Object obj) {
        this.f1295a = obj;
    }

    @Override // qc.g
    public void accept(Object obj) {
        ((Function1) this.f1295a).invoke(obj);
    }

    @Override // yl0.InterfaceC10919d
    public void onFailure(Throwable innerExc) {
        C10923h.a resultProvider = (C10923h.a) this.f1295a;
        Intrinsics.checkNotNullParameter(resultProvider, "$resultProvider");
        Intrinsics.checkNotNullParameter(innerExc, "innerExc");
        resultProvider.b(new AbstractC10783a.b(innerExc instanceof c ? (c) innerExc : new c(innerExc)));
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean observeDeferredResult$lambda$2;
        observeDeferredResult$lambda$2 = AppsFlyerConversionStorageImpl.observeDeferredResult$lambda$2((Function1) this.f1295a, obj);
        return observeDeferredResult$lambda$2;
    }
}

package Ve;

import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import r.o;
import spay.sdk.R;
import spay.sdk.RedirectActivity;
import xe.C10737n;

/* renamed from: Ve.cn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4164cn implements InterfaceC4228f1 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4686uq f30825a;

    /* renamed from: b, reason: collision with root package name */
    public final Te f30826b;

    /* renamed from: c, reason: collision with root package name */
    public int f30827c;

    public C4164cn(InterfaceC4686uq authHandler, Te metricFacade) {
        Intrinsics.checkNotNullParameter(authHandler, "authHandler");
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        this.f30825a = authHandler;
        this.f30826b = metricFacade;
    }

    @Override // Ve.InterfaceC4228f1
    public final Object a(RedirectActivity redirectActivity, kotlin.coroutines.d dVar) {
        return Boolean.valueOf(r.n.c(redirectActivity).a(255) == 0);
    }

    @Override // Ve.InterfaceC4228f1
    public final Object b(RedirectActivity redirectActivity, EnumC4801z0 enumC4801z0, kotlin.coroutines.d frame) {
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        Executor mainExecutor = androidx.core.content.a.getMainExecutor(redirectActivity);
        Intrinsics.checkNotNullExpressionValue(mainExecutor, "getMainExecutor(activity)");
        r.o oVar = new r.o(redirectActivity, mainExecutor, new C4823zm(c10737n, this));
        Context baseContext = redirectActivity.getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "activity.baseContext");
        o.d.a aVar = new o.d.a();
        aVar.f(baseContext.getString(R.string.spay_full_emission_biometric_title));
        aVar.e(baseContext.getString(R.string.spay_full_emission_biometric_subtitle));
        aVar.d(baseContext.getString(R.string.spay_full_emission_biometric_negative));
        aVar.b(255);
        o.d a11 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "Builder()\n            .s…EAK)\n            .build()");
        oVar.a(a11);
        this.f30826b.b(new Bi(Xf.LC_BIO_AUTH_START, Ur.PAY_VIEW, Pe.LC, null, null, null, null, 120));
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }
}

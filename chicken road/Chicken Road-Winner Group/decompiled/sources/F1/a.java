package F1;

import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.location.impl.r;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements FunctionWithThrowable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f376b;

    public /* synthetic */ a(r rVar, int i3) {
        this.f375a = i3;
        this.f376b = rVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        switch (this.f375a) {
            case 0:
                return r.b(this.f376b, (LocationManager) obj);
            default:
                return r.a(this.f376b, (LocationManager) obj);
        }
    }
}

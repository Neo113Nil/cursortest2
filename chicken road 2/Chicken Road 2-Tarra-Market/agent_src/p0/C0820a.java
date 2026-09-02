package p0;

import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.location.impl.r;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0820a implements FunctionWithThrowable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f6421b;

    public /* synthetic */ C0820a(r rVar, int i2) {
        this.f6420a = i2;
        this.f6421b = rVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        switch (this.f6420a) {
            case 0:
                return r.b(this.f6421b, (LocationManager) obj);
            default:
                return r.a(this.f6421b, (LocationManager) obj);
        }
    }
}

package Pa0;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22142a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f22143b;

    public /* synthetic */ n(Pc.a aVar, int i11) {
        this.f22142a = i11;
        this.f22143b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f22142a) {
            case 0:
                return new m(Jb.d.a(this.f22143b));
            case 1:
                return new s90.h((Context) this.f22143b.get());
            default:
                Application application = (Application) ((Jb.f) this.f22143b).get();
                Intrinsics.checkNotNullParameter(application, "application");
                Jb.j.d(application);
                return application;
        }
    }
}

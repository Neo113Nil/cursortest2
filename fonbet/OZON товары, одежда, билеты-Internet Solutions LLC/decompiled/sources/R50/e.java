package R50;

import R50.a;
import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements Jb.e<S50.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Application> f24644a;

    public e(Pc.a<Application> aVar) {
        this.f24644a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Application application = (Application) ((a.c) this.f24644a).get();
        Intrinsics.checkNotNullParameter(application, "application");
        return new S50.a(application);
    }
}

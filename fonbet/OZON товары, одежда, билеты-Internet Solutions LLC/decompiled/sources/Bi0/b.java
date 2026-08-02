package Bi0;

import Jb.j;
import Ve.C4598rp;
import WZ.l;
import ei0.InterfaceC6369b;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import ru.ozon.android.messenger.framework.data.o;
import ru.ozon.android.messenger.framework.data.remote.FileApi;

/* loaded from: classes3.dex */
public final class b implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3874a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f3875b;

    public /* synthetic */ b(Pc.a aVar, int i11) {
        this.f3874a = i11;
        this.f3875b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f3874a) {
            case 0:
                return new a((InterfaceC6369b) ((Jb.f) this.f3875b).get());
            case 1:
                RZ.a composerAnalytics = (RZ.a) this.f3875b.get();
                Intrinsics.checkNotNullParameter(composerAnalytics, "composerAnalytics");
                l f7 = composerAnalytics.f();
                j.d(f7);
                return f7;
            default:
                FileApi fileApi = (FileApi) C4598rp.b((Retrofit) ((o) this.f3875b).get(), "retrofit", FileApi.class, "create(...)");
                j.d(fileApi);
                return fileApi;
        }
    }
}

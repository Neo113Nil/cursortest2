package P80;

import Jb.e;
import Jb.j;
import Ve.C4598rp;
import android.content.Context;
import i90.C7025b;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import ru.ozon.android.messenger.framework.data.o;
import ru.ozon.android.messenger.framework.data.remote.action.ActionApi;

/* loaded from: classes3.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22012a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f22013b;

    public /* synthetic */ c(Pc.a aVar, int i11) {
        this.f22012a = i11;
        this.f22013b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f22012a) {
            case 0:
                Context context = (Context) this.f22013b.get();
                Intrinsics.checkNotNullParameter(context, "context");
                return new V80.c(context);
            case 1:
                return new U30.c((Context) this.f22013b.get());
            case 2:
                return new C7025b((Context) this.f22013b.get());
            default:
                ActionApi actionApi = (ActionApi) C4598rp.b((Retrofit) ((o) this.f22013b).get(), "retrofit", ActionApi.class, "create(...)");
                j.d(actionApi);
                return actionApi;
        }
    }
}

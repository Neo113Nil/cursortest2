package La0;

import Jb.e;
import Jb.f;
import Jb.i;
import T90.g;
import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.di.C9377b;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.x0;
import ui0.C10062a;

/* loaded from: classes3.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16670a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f16671b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f16670a = i11;
        this.f16671b = obj;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f16670a) {
            case 0:
                return new a((Context) ((f) this.f16671b).get());
            case 1:
                T90.f pinsSettingsRepository = (T90.f) ((Pc.a) this.f16671b).get();
                Intrinsics.checkNotNullParameter(pinsSettingsRepository, "pinsSettingsRepository");
                return new g(pinsSettingsRepository);
            case 2:
                ((C9377b) this.f16671b).getClass();
                return new x0();
            default:
                return new C10062a((Map) ((i) this.f16671b).get());
        }
    }
}

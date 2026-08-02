package Kr;

import kotlin.jvm.functions.Function1;
import qc.o;
import ru.ozon.app.android.favorites.domain.favoritemanager.eventmap.FavoriteEventMapImpl;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;

/* loaded from: classes6.dex */
public final /* synthetic */ class d implements qc.g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f16037b;

    public /* synthetic */ d(Function1 function1, int i11) {
        this.f16036a = i11;
        this.f16037b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f16036a) {
            case 0:
                this.f16037b.invoke(obj);
                break;
            case 1:
                this.f16037b.invoke(obj);
                break;
            default:
                this.f16037b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        FavoriteEvent observeEvents$lambda$1;
        observeEvents$lambda$1 = FavoriteEventMapImpl.observeEvents$lambda$1(this.f16037b, obj);
        return observeEvents$lambda$1;
    }
}

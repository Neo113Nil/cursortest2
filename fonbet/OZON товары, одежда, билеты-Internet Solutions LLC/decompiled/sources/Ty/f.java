package Ty;

import kotlin.jvm.functions.Function1;
import qc.o;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.initializers.cache.ComposerCacheInvalidatorInitializer;

/* loaded from: classes6.dex */
public final /* synthetic */ class f implements o, qc.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f27230b;

    public /* synthetic */ f(Function1 function1, int i11) {
        this.f27229a = i11;
        this.f27230b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f27229a) {
            case 1:
                this.f27230b.invoke(obj);
                break;
            default:
                this.f27230b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        ClearCacheReason favoritesState$lambda$4;
        favoritesState$lambda$4 = ComposerCacheInvalidatorInitializer.getFavoritesState$lambda$4(this.f27230b, obj);
        return favoritesState$lambda$4;
    }
}

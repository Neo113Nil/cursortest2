package Ty;

import kotlin.jvm.functions.Function1;
import qc.o;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.initializers.cache.ComposerCacheInvalidatorInitializer;

/* renamed from: Ty.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C4051b implements o, qc.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f27224a;

    public /* synthetic */ C4051b(Function1 function1) {
        this.f27224a = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        this.f27224a.invoke(obj);
    }

    @Override // qc.o
    public Object apply(Object obj) {
        ClearCacheReason locationState$lambda$6;
        locationState$lambda$6 = ComposerCacheInvalidatorInitializer.getLocationState$lambda$6(this.f27224a, obj);
        return locationState$lambda$6;
    }
}

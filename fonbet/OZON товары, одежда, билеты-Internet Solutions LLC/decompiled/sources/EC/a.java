package EC;

import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.initializers.cache.ComposerCacheInvalidatorInitializer;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f7677b;

    public /* synthetic */ a(Function1 function1, int i11) {
        this.f7676a = i11;
        this.f7677b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f7676a) {
            case 0:
                this.f7677b.invoke(obj);
                break;
            default:
                this.f7677b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        ClearCacheReason userState$lambda$5;
        userState$lambda$5 = ComposerCacheInvalidatorInitializer.getUserState$lambda$5(this.f7677b, obj);
        return userState$lambda$5;
    }
}

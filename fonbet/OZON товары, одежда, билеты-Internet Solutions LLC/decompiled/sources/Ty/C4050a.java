package Ty;

import Vh0.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qc.o;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.initializers.cache.ComposerCacheInvalidatorInitializer;
import xl0.AbstractC10783a;
import yl0.InterfaceC10920e;

/* renamed from: Ty.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C4050a implements o, InterfaceC10920e, qc.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f27223a;

    public /* synthetic */ C4050a(Function1 function1) {
        this.f27223a = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        this.f27223a.invoke(obj);
    }

    @Override // qc.o
    public Object apply(Object obj) {
        ClearCacheReason currencyState$lambda$8;
        currencyState$lambda$8 = ComposerCacheInvalidatorInitializer.getCurrencyState$lambda$8(this.f27223a, obj);
        return currencyState$lambda$8;
    }

    @Override // yl0.InterfaceC10920e
    public void onSuccess(Object obj) {
        Vh0.a bVar;
        AbstractC10783a result = (AbstractC10783a) obj;
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.d(result, AbstractC10783a.C2285a.f105619a)) {
            bVar = a.C0584a.f32800a;
        } else {
            if (!(result instanceof AbstractC10783a.b)) {
                throw new Sc.o();
            }
            bVar = new a.b(((AbstractC10783a.b) result).a());
        }
        this.f27223a.invoke(bVar);
    }
}

package Aq;

import Z.o;
import Z.w;
import java.util.concurrent.Executor;
import ru.ozon.app.android.common.actionHandlers.applySorting.ApplySortingViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

/* renamed from: Aq.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class RunnableC2442a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1258b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1259c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1260d;

    public /* synthetic */ RunnableC2442a(Object obj, Object obj2, Object obj3, int i11) {
        this.f1257a = i11;
        this.f1258b = obj;
        this.f1259c = obj2;
        this.f1260d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1257a) {
            case 0:
                ApplySortingViewModel.applySortingWithDelay$lambda$2$lambda$1((ComposerReferences) this.f1258b, (ApplySortingViewModel) this.f1259c, (AtomAction.Click) this.f1260d);
                break;
            default:
                ((w) this.f1258b).f35297g.g((o.a) this.f1259c, (Executor) this.f1260d);
                break;
        }
    }
}

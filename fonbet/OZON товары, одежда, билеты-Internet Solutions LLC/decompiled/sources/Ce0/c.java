package Ce0;

import J4.l;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes7.dex */
final class c implements Callable<Unit> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ De0.a f4813a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f4814b;

    c(d dVar, De0.a aVar) {
        this.f4814b = dVar;
        this.f4813a = aVar;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final Unit call() throws Exception {
        l lVar;
        d dVar = this.f4814b;
        dVar.f4815a.beginTransaction();
        try {
            lVar = dVar.f4816b;
            lVar.insert((l) this.f4813a);
            dVar.f4815a.setTransactionSuccessful();
            return Unit.f71690a;
        } finally {
            dVar.f4815a.endTransaction();
        }
    }
}

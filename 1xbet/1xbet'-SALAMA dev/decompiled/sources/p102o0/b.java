package p102o0;

import E2.l;
import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class b extends FutureTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f15546a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, l lVar) {
        super(lVar);
        this.f15546a = aVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        a aVar = this.f15546a;
        try {
            Object obj = get();
            if (aVar.f15543e.get()) {
                return;
            }
            aVar.a(obj);
        } catch (InterruptedException e7) {
            Log.w("AsyncTask", e7);
        } catch (CancellationException unused) {
            if (aVar.f15543e.get()) {
                return;
            }
            aVar.a(null);
        } catch (ExecutionException e8) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e8.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}

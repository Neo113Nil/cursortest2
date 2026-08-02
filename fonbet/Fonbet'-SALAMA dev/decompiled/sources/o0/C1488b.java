package o0;

import E2.l;
import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1488b extends FutureTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC1487a f15540a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1488b(RunnableC1487a runnableC1487a, l lVar) {
        super(lVar);
        this.f15540a = runnableC1487a;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        RunnableC1487a runnableC1487a = this.f15540a;
        try {
            Object obj = get();
            if (runnableC1487a.f15537e.get()) {
                return;
            }
            runnableC1487a.a(obj);
        } catch (InterruptedException e7) {
            Log.w("AsyncTask", e7);
        } catch (CancellationException unused) {
            if (runnableC1487a.f15537e.get()) {
                return;
            }
            runnableC1487a.a(null);
        } catch (ExecutionException e8) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e8.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}

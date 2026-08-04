package B4;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: B4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0068l implements InterfaceC0073q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f1172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f1173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1174d;

    public /* synthetic */ C0068l(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, int i7, int i8) {
        this.f1171a = i8;
        this.f1172b = taskCompletionSource;
        this.f1173c = taskCompletionSource2;
        this.f1174d = i7;
    }

    @Override // B4.InterfaceC0073q
    public final void a(Object obj, I i7) {
        switch (this.f1171a) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.f1173c;
                C0072p c0072p = (C0072p) obj;
                TaskCompletionSource taskCompletionSource2 = this.f1172b;
                if (i7 != null) {
                    taskCompletionSource2.setException(i7);
                    return;
                }
                try {
                    ((O) Tasks.await(taskCompletionSource.getTask())).remove();
                    H4.k kVar = c0072p.f1188c;
                    boolean z4 = kVar != null;
                    boolean z7 = c0072p.f1189d.f1158b;
                    if (z4 || !z7) {
                        if ((kVar != null) && z7 && this.f1174d == 2) {
                            taskCompletionSource2.setException(new I("Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)", H.UNAVAILABLE));
                        } else {
                            taskCompletionSource2.setResult(c0072p);
                        }
                    } else {
                        taskCompletionSource2.setException(new I("Failed to get document because the client is offline.", H.UNAVAILABLE));
                    }
                    return;
                } catch (InterruptedException e7) {
                    Thread.currentThread().interrupt();
                    AssertionError assertionError = new AssertionError("INTERNAL ASSERTION FAILED: ".concat("Failed to register a listener for a single document"));
                    assertionError.initCause(e7);
                    throw assertionError;
                } catch (ExecutionException e8) {
                    AssertionError assertionError2 = new AssertionError("INTERNAL ASSERTION FAILED: ".concat("Failed to register a listener for a single document"));
                    assertionError2.initCause(e8);
                    throw assertionError2;
                }
            default:
                TaskCompletionSource taskCompletionSource3 = this.f1173c;
                c0 c0Var = (c0) obj;
                TaskCompletionSource taskCompletionSource4 = this.f1172b;
                if (i7 != null) {
                    taskCompletionSource4.setException(i7);
                    return;
                }
                try {
                    ((O) Tasks.await(taskCompletionSource3.getTask())).remove();
                    if (c0Var.f1145f.f1158b && this.f1174d == 2) {
                        taskCompletionSource4.setException(new I("Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)", H.UNAVAILABLE));
                    } else {
                        taskCompletionSource4.setResult(c0Var);
                    }
                    return;
                } catch (InterruptedException e9) {
                    Thread.currentThread().interrupt();
                    AssertionError assertionError3 = new AssertionError("INTERNAL ASSERTION FAILED: ".concat("Failed to register a listener for a query result"));
                    assertionError3.initCause(e9);
                    throw assertionError3;
                } catch (ExecutionException e10) {
                    AssertionError assertionError4 = new AssertionError("INTERNAL ASSERTION FAILED: ".concat("Failed to register a listener for a query result"));
                    assertionError4.initCause(e10);
                    throw assertionError4;
                }
        }
    }
}

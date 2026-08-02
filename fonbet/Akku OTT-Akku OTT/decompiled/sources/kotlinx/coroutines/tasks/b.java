package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.C1100n;

/* loaded from: classes5.dex */
public final class b<TResult> implements OnCompleteListener {
    public final /* synthetic */ C1100n a;

    public b(C1100n c1100n) {
        this.a = c1100n;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<Object> task) {
        Exception exception = task.getException();
        C1100n c1100n = this.a;
        if (exception != null) {
            Result.Companion companion = Result.INSTANCE;
            c1100n.resumeWith(Result.m1716constructorimpl(ResultKt.createFailure(exception)));
        } else if (task.isCanceled()) {
            c1100n.cancel(null);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            c1100n.resumeWith(Result.m1716constructorimpl(task.getResult()));
        }
    }
}

package L4;

import android.os.AsyncTask;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;
import n.ExecutorC1441a;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f4376a = TaskExecutors.MAIN_THREAD;

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorC1441a f4377b = new ExecutorC1441a(1);

    /* renamed from: c, reason: collision with root package name */
    public static final q f4378c = new q(AsyncTask.THREAD_POOL_EXECUTOR);
}

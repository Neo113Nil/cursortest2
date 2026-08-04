package L4;

import android.os.AsyncTask;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f4376a = TaskExecutors.MAIN_THREAD;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p094n.a f4377b = new p094n.a(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f4378c = new q(AsyncTask.THREAD_POOL_EXECUTOR);
}

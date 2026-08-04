package J2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f3803a = new ThreadPoolExecutor(2, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 10, TimeUnit.SECONDS, new SynchronousQueue(), new a("ClientDefault"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f3804b = Executors.newSingleThreadExecutor(new a("ClientSingle"));
}

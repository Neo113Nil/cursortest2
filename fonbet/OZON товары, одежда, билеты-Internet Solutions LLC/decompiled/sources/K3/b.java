package K3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public interface b extends Executor {
    static b u0(ExecutorService executorService, Ej.b bVar) {
        return new a(executorService, bVar);
    }

    void release();
}

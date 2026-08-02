package androidx.room;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.WorkerKt;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                QueryInterceptorDatabase.execSQL$lambda$12((QueryInterceptorDatabase) this.b, (String) this.c, (List) this.d);
                break;
            default:
                WorkerKt.future$lambda$2$lambda$1((AtomicBoolean) this.b, (CallbackToFutureAdapter.Completer) this.c, (Function0) this.d);
                break;
        }
    }
}

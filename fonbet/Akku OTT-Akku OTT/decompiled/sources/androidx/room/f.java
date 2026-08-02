package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                QueryInterceptorDatabase.beginTransactionWithListenerNonExclusive$lambda$3((QueryInterceptorDatabase) this.b);
                break;
            default:
                ((AtomicBoolean) this.b).set(true);
                break;
        }
    }
}

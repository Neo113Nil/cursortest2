package androidx.core.widget;

import androidx.room.QueryInterceptorStatement;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ContentLoadingProgressBar) this.b).lambda$new$0();
                break;
            default:
                QueryInterceptorStatement.execute$lambda$0((QueryInterceptorStatement) this.b);
                break;
        }
    }
}

package androidx.appcompat.app;

import android.content.Context;
import androidx.appcompat.widget.Toolbar;
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
                AppCompatDelegate.lambda$syncRequestedAndStoredLocales$1((Context) this.b);
                break;
            case 1:
                ((Toolbar) this.b).collapseActionView();
                break;
            default:
                QueryInterceptorStatement.simpleQueryForLong$lambda$3((QueryInterceptorStatement) this.b);
                break;
        }
    }
}

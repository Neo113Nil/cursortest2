package androidx.appcompat.app;

import android.content.Context;
import androidx.appcompat.widget.Toolbar;
import androidx.room.QueryInterceptorStatement;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AppCompatDelegate.syncRequestedAndStoredLocales((Context) this.b);
                break;
            case 1:
                ((Toolbar) this.b).invalidateMenu();
                break;
            case 2:
                QueryInterceptorStatement.executeInsert$lambda$2((QueryInterceptorStatement) this.b);
                break;
            default:
                FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1((TaskCompletionSource) this.b);
                break;
        }
    }
}

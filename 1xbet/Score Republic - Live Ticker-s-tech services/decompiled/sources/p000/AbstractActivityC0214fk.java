package p000;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.C0030a;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: fk */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0214fk extends Activity implements yh0, yg0 {

    /* JADX INFO: renamed from: j */
    public final C0030a f2430j = new C0030a(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        WeakHashMap weakHashMap = ai1.f194a;
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        WeakHashMap weakHashMap = ai1.f194a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = g11.f2574j;
        e11.m1348b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        C0030a c0030a = this.f2430j;
        c0030a.m439c("setCurrentState");
        c0030a.m441e(qh0.f6499l);
        super.onSaveInstanceState(bundle);
    }
}

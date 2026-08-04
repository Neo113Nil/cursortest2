package F;

import P.InterfaceC0355k;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0726v;
import androidx.lifecycle.InterfaceC0724t;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends Activity implements InterfaceC0724t, InterfaceC0355k {
    private final p122r.l extraDataMap = new p122r.l();
    private final C0726v lifecycleRegistry = new C0726v(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        t6.h.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        t6.h.d(decorView, "window.decorView");
        if (p003a.a.R(decorView, keyEvent)) {
            return true;
        }
        return p003a.a.S(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        t6.h.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        t6.h.d(decorView, "window.decorView");
        if (p003a.a.R(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public <T extends AbstractC0216l> T getExtraData(Class<T> cls) {
        t6.h.e(cls, "extraDataClass");
        if (this.extraDataMap.getOrDefault(cls, null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i7 = androidx.lifecycle.I.f9570b;
        androidx.lifecycle.G.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        t6.h.e(bundle, "outState");
        this.lifecycleRegistry.g();
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(AbstractC0216l abstractC0216l) {
        t6.h.e(abstractC0216l, "extraData");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    /* JADX WARN: Code duplicated, block: B:28:0x0045  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean shouldDumpInternalState(String[] strArr) {
        boolean z4 = false;
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        z4 = true;
                    }
                    break;
                case 100470631:
                    if (str.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            z4 = true;
                        }
                    }
                    break;
                case 472614934:
                    if (str.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            z4 = true;
                        }
                    }
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        z4 = true;
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        z4 = true;
                    }
                    break;
            }
        }
        return !z4;
    }

    @Override // P.InterfaceC0355k
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        t6.h.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public Context zza() {
        return getApplicationContext();
    }
}

package F;

import P.InterfaceC0355k;
import a.AbstractC0603a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0747v;
import androidx.lifecycle.InterfaceC0745t;

/* loaded from: classes.dex */
public abstract class m extends Activity implements InterfaceC0745t, InterfaceC0355k {
    private final r.l extraDataMap = new r.l();
    private final C0747v lifecycleRegistry = new C0747v(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        t6.h.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        t6.h.d(decorView, "window.decorView");
        if (AbstractC0603a.R(decorView, keyEvent)) {
            return true;
        }
        return AbstractC0603a.S(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        t6.h.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        t6.h.d(decorView, "window.decorView");
        if (AbstractC0603a.R(decorView, keyEvent)) {
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 26) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 31) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldDumpInternalState(String[] strArr) {
        boolean z4 = false;
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation")) {
                        break;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture")) {
                        break;
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill")) {
                        break;
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

package Q5;

import Q3.o;
import android.util.Log;
import q5.AbstractActivityC1559c;
import w1.C1759x1;
import w5.C1782b;
import w5.InterfaceC1783c;
import x5.InterfaceC1789a;
import x5.InterfaceC1790b;

/* loaded from: classes2.dex */
public final class f implements InterfaceC1783c, InterfaceC1789a {

    /* renamed from: a, reason: collision with root package name */
    public C1759x1 f5851a;

    @Override // x5.InterfaceC1789a
    public final void onAttachedToActivity(InterfaceC1790b interfaceC1790b) {
        C1759x1 c1759x1 = this.f5851a;
        if (c1759x1 == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            c1759x1.f17927d = (AbstractActivityC1559c) ((o) interfaceC1790b).f5822a;
        }
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        C1759x1 c1759x1 = new C1759x1(c1782b.f18075a);
        this.f5851a = c1759x1;
        C1759x1.f0(c1782b.f18077c, c1759x1);
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivity() {
        C1759x1 c1759x1 = this.f5851a;
        if (c1759x1 == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            c1759x1.f17927d = null;
        }
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        if (this.f5851a == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
        } else {
            C1759x1.f0(c1782b.f18077c, null);
            this.f5851a = null;
        }
    }

    @Override // x5.InterfaceC1789a
    public final void onReattachedToActivityForConfigChanges(InterfaceC1790b interfaceC1790b) {
        onAttachedToActivity(interfaceC1790b);
    }
}

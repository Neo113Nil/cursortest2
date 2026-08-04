package io.flutter.plugin.platform;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class A implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14129b;

    public /* synthetic */ A(Object obj, int i7) {
        this.f14128a = i7;
        this.f14129b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14128a) {
            case 0:
                p005a1.i iVar = (p005a1.i) this.f14129b;
                ((View) iVar.f7958b).postDelayed((o) iVar.f7959c, 128L);
                break;
            default:
                B b7 = (B) this.f14129b;
                b7.f14130a.getViewTreeObserver().removeOnDrawListener(b7);
                break;
        }
    }
}

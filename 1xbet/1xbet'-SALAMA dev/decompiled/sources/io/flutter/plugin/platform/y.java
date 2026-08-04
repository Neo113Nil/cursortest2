package io.flutter.plugin.platform;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements io.flutter.view.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K4.u f14224a;

    public y(K4.u uVar) {
        this.f14224a = uVar;
    }

    @Override // io.flutter.view.o
    public final void onTrimMemory(int i7) {
        if (i7 != 80 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f14224a.f4066c = true;
    }
}

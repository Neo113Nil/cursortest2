package io.flutter.plugin.platform;

import android.os.Build;

/* loaded from: classes.dex */
public final class x implements io.flutter.view.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f9334a;

    public x(y yVar) {
        this.f9334a = yVar;
    }

    @Override // io.flutter.view.p
    public final void onTrimMemory(int i3) {
        if (i3 != 80 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f9334a.f = true;
    }
}

package com.unity3d.player.a;

import android.app.Activity;
import android.content.Context;
import android.view.PixelCopy;
import java.util.concurrent.Semaphore;

/* loaded from: classes7.dex */
public final class B implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Semaphore f11739a;
    public final /* synthetic */ C b;

    public B(C c, Semaphore semaphore) {
        this.b = c;
        this.f11739a = semaphore;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        this.f11739a.release();
        if (i == 0) {
            Context context = this.b.b.f11741a;
            if (context instanceof Activity) {
                ((Activity) context).runOnUiThread(new A(this));
            }
        }
    }
}

package com.unity3d.player.a;

import android.app.Activity;
import android.content.Context;
import com.unity3d.player.C4904e0;
import com.unity3d.player.S0;
import com.unity3d.player.UnityPlayer;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final UnityPlayer f11760a;
    public C4904e0 c;
    public Context b = null;
    public final Semaphore d = new Semaphore(0);
    public final ReentrantLock e = new ReentrantLock();
    public S0 f = null;
    public int g = 2;
    public boolean h = false;
    public boolean i = false;

    public Y(UnityPlayer unityPlayer) {
        this.f11760a = null;
        this.f11760a = unityPlayer;
    }

    public void runOnUiThread(Runnable runnable) {
        Context context = this.b;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            AbstractC4890t.Log(5, "Not running from an Activity; Ignoring execution request...");
        }
    }
}

package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes7.dex */
public final class Q implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f11724a;

    public Q(T t) {
        this.f11724a = t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c2, code lost:
    
        if (r6.f11724a.e != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f9, code lost:
    
        if (r6.f11724a.e == false) goto L67;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        if (message.what != 2269) {
            return false;
        }
        S s = (S) message.obj;
        S s2 = S.h;
        if (s == s2) {
            T t = this.f11724a;
            t.g--;
            t.f11729a.executeMainThreadJobs();
            T t2 = this.f11724a;
            if (!t2.d) {
                return true;
            }
            if (t2.f11729a.getHaveAndroidWindowSupport() && !this.f11724a.e) {
                return true;
            }
            T t3 = this.f11724a;
            int i = t3.j;
            if (i >= 0) {
                if (i == 0) {
                    if (t3.f11729a.getSplashEnabled()) {
                        this.f11724a.f11729a.disableStaticSplashScreen();
                    }
                    if (this.f11724a.f11729a.shouldReportFullyDrawn()) {
                        this.f11724a.f11729a.reportFullyDrawn();
                    }
                }
                this.f11724a.j--;
            }
            if (!this.f11724a.f11729a.isFinishing() && !this.f11724a.f11729a.nativeRender()) {
                this.f11724a.f11729a.finish();
            }
        } else if (s == S.c) {
            Looper.myLooper().quit();
        } else if (s == S.b) {
            this.f11724a.d = true;
        } else if (s == S.f11727a) {
            this.f11724a.d = false;
        } else if (s == S.d) {
            this.f11724a.e = false;
        } else if (s == S.e) {
            T t4 = this.f11724a;
            t4.e = true;
            if (t4.f == 3) {
                if (t4.f11729a.getHaveAndroidWindowSupport()) {
                }
                this.f11724a.f11729a.nativeFocusChanged(true);
                this.f11724a.f = 1;
            }
        } else if (s == S.f) {
            T t5 = this.f11724a;
            if (t5.f == 1) {
                t5.f11729a.nativeFocusChanged(false);
            }
            this.f11724a.f = 2;
        } else if (s == S.g) {
            T t6 = this.f11724a;
            t6.f = 3;
            if (t6.f11729a.getHaveAndroidWindowSupport()) {
            }
            this.f11724a.f11729a.nativeFocusChanged(true);
            this.f11724a.f = 1;
        } else if (s == S.i) {
            T t7 = this.f11724a;
            t7.f11729a.nativeOrientationChanged(t7.h, t7.i);
        }
        T t8 = this.f11724a;
        if (t8.d && t8.g <= 0) {
            Message.obtain(t8.c, 2269, s2).sendToTarget();
            this.f11724a.g++;
        }
        return true;
    }
}

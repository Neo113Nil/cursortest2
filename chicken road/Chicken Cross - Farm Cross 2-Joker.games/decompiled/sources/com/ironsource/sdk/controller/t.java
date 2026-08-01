package com.ironsource.sdk.controller;

import android.app.Activity;
import android.media.AudioManager;
import com.ironsource.C4491k4;
import com.ironsource.O7;
import com.ironsource.mediationsdk.logger.IronLog;

/* loaded from: classes6.dex */
class t {

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioManager f8608a;

        a(AudioManager audioManager) {
            this.f8608a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.a(this.f8608a);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioManager f8609a;

        b(AudioManager audioManager) {
            this.f8609a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.b(this.f8609a);
        }
    }

    t() {
    }

    public static void a(Activity activity) {
        O7.f7826a.b(new a((AudioManager) activity.getSystemService("audio")));
    }

    public static void b(Activity activity) {
        O7.f7826a.b(new b((AudioManager) activity.getSystemService("audio")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(AudioManager audioManager) {
        try {
            audioManager.abandonAudioFocus(null);
        } catch (Throwable th) {
            C4491k4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(AudioManager audioManager) {
        try {
            audioManager.requestAudioFocus(null, 3, 2);
        } catch (Throwable th) {
            C4491k4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }
}

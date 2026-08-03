package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
class t {

    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.media.AudioManager f6669a;

        a(android.media.AudioManager audioManager) {
            this.f6669a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.t.a(this.f6669a);
        }
    }

    class b implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.media.AudioManager f6670a;

        b(android.media.AudioManager audioManager) {
            this.f6670a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.t.b(this.f6670a);
        }
    }

    t() {
    }

    public static void a(android.app.Activity activity) {
        com.ironsource.Q7.f5934a.b(new com.ironsource.sdk.controller.t.a((android.media.AudioManager) activity.getSystemService("audio")));
    }

    public static void b(android.app.Activity activity) {
        com.ironsource.Q7.f5934a.b(new com.ironsource.sdk.controller.t.b((android.media.AudioManager) activity.getSystemService("audio")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(android.media.AudioManager audioManager) {
        try {
            audioManager.abandonAudioFocus(null);
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(android.media.AudioManager audioManager) {
        try {
            audioManager.requestAudioFocus(null, 3, 2);
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(th.toString());
        }
    }
}

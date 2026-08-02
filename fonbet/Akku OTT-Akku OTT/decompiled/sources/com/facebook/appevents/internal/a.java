package com.facebook.appevents.internal;

import com.facebook.appevents.iap.s;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s.d();
                break;
            default:
                CrashlyticsWorker.lambda$await$6();
                break;
        }
    }
}

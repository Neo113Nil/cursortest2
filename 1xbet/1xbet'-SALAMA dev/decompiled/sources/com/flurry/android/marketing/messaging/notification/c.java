package com.flurry.android.marketing.messaging.notification;

import java.util.Iterator;
import java.util.Map;
import p155w1.AbstractRunnableC0978d1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FlurryNotification f10502c;

    public /* synthetic */ c(FlurryNotification flurryNotification, Object obj, int i7) {
        this.f10500a = i7;
        this.f10502c = flurryNotification;
        this.f10501b = obj;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        switch (this.f10500a) {
            case 0:
                Iterator it = this.f10502c.f10487b.entrySet().iterator();
                while (it.hasNext()) {
                    ((FlurryNotificationListener) ((Map.Entry) it.next()).getValue()).onNotificationReceived(this.f10501b);
                }
                break;
            default:
                Iterator it2 = this.f10502c.f10487b.entrySet().iterator();
                while (it2.hasNext()) {
                    ((FlurryNotificationListener) ((Map.Entry) it2.next()).getValue()).onUnhandledNotification(this.f10501b);
                }
                break;
        }
    }
}

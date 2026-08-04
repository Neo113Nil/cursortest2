package com.flurry.android.marketing.messaging.notification;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import p155w1.AbstractC0998i1;
import p155w1.AbstractRunnableC0978d1;
import p155w1.C0965a0;
import p155w1.H2;
import p155w1.Z;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FlurryNotification f10496c;

    public /* synthetic */ a(FlurryNotification flurryNotification, boolean z4, int i7) {
        this.f10494a = i7;
        this.f10496c = flurryNotification;
        this.f10495b = z4;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        switch (this.f10494a) {
            case 0:
                Iterator it = this.f10496c.f10487b.entrySet().iterator();
                while (it.hasNext()) {
                    ((FlurryNotificationListener) ((Map.Entry) it.next()).getValue()).onIntegrationTypeUpdate(this.f10495b);
                }
                break;
            default:
                boolean z4 = this.f10495b;
                "Notification enabled: ".concat(String.valueOf(z4));
                if (AbstractC0998i1.f17749c != null) {
                    C0965a0 c0965a0 = H2.a().j;
                    "App Notification Setting Received: ".concat(String.valueOf(z4));
                    Collections.emptyMap();
                    c0965a0.f17642B = z4;
                    c0965a0.h(new Z(c0965a0.f17641A, z4));
                }
                Iterator it2 = this.f10496c.f10487b.entrySet().iterator();
                while (it2.hasNext()) {
                    ((FlurryNotificationListener) ((Map.Entry) it2.next()).getValue()).onAppNotificationPermissionStatusChange(z4);
                }
                break;
        }
    }
}

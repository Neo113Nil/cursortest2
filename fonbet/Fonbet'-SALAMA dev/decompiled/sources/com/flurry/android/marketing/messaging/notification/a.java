package com.flurry.android.marketing.messaging.notification;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import w1.AbstractC1707i1;
import w1.AbstractRunnableC1687d1;
import w1.C1674a0;
import w1.H2;
import w1.Z;

/* loaded from: classes.dex */
public final class a extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FlurryNotification f10496c;

    public /* synthetic */ a(FlurryNotification flurryNotification, boolean z4, int i7) {
        this.f10494a = i7;
        this.f10496c = flurryNotification;
        this.f10495b = z4;
    }

    @Override // w1.AbstractRunnableC1687d1
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
                if (AbstractC1707i1.f17743c != null) {
                    C1674a0 c1674a0 = H2.a().j;
                    "App Notification Setting Received: ".concat(String.valueOf(z4));
                    Collections.emptyMap();
                    c1674a0.f17636B = z4;
                    c1674a0.h(new Z(c1674a0.f17635A, z4));
                }
                Iterator it2 = this.f10496c.f10487b.entrySet().iterator();
                while (it2.hasNext()) {
                    ((FlurryNotificationListener) ((Map.Entry) it2.next()).getValue()).onAppNotificationPermissionStatusChange(z4);
                }
                break;
        }
    }
}

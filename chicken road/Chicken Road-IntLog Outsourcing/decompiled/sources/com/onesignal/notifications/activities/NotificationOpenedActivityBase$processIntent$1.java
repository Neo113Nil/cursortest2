package com.onesignal.notifications.activities;

import android.content.Context;
import android.content.Intent;
import com.onesignal.OneSignal;
import com.onesignal.common.AndroidUtils;
import com.onesignal.notifications.internal.open.INotificationOpenedProcessor;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.notifications.activities.NotificationOpenedActivityBase$processIntent$1", f = "NotificationOpenedActivityBase.kt", l = {50, 55}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationOpenedActivityBase$processIntent$1 extends h implements InterfaceC1441l {
    int label;
    final /* synthetic */ NotificationOpenedActivityBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationOpenedActivityBase$processIntent$1(NotificationOpenedActivityBase notificationOpenedActivityBase, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = notificationOpenedActivityBase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(NotificationOpenedActivityBase notificationOpenedActivityBase) {
        AndroidUtils.INSTANCE.finishSafely(notificationOpenedActivityBase);
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new NotificationOpenedActivityBase$processIntent$1(this.this$0, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        v vVar = v.f5689a;
        if (i2 == 0) {
            g.y(obj);
            Context applicationContext = this.this$0.getApplicationContext();
            i.d(applicationContext, "getApplicationContext(...)");
            this.label = 1;
            obj = OneSignal.initWithContext(applicationContext, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.y(obj);
                final NotificationOpenedActivityBase notificationOpenedActivityBase = this.this$0;
                notificationOpenedActivityBase.runOnUiThread(new Runnable() { // from class: com.onesignal.notifications.activities.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        NotificationOpenedActivityBase$processIntent$1.invokeSuspend$lambda$0(NotificationOpenedActivityBase.this);
                    }
                });
                return vVar;
            }
            g.y(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            return vVar;
        }
        INotificationOpenedProcessor iNotificationOpenedProcessor = (INotificationOpenedProcessor) OneSignal.INSTANCE.getServices().getService(INotificationOpenedProcessor.class);
        NotificationOpenedActivityBase notificationOpenedActivityBase2 = this.this$0;
        Intent intent = notificationOpenedActivityBase2.getIntent();
        i.d(intent, "getIntent(...)");
        this.label = 2;
        if (iNotificationOpenedProcessor.processFromContext(notificationOpenedActivityBase2, intent, this) == enumC1260a) {
            return enumC1260a;
        }
        final NotificationOpenedActivityBase notificationOpenedActivityBase3 = this.this$0;
        notificationOpenedActivityBase3.runOnUiThread(new Runnable() { // from class: com.onesignal.notifications.activities.a
            @Override // java.lang.Runnable
            public final void run() {
                NotificationOpenedActivityBase$processIntent$1.invokeSuspend$lambda$0(NotificationOpenedActivityBase.this);
            }
        });
        return vVar;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((NotificationOpenedActivityBase$processIntent$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}

package com.onesignal.notifications.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.OneSignal;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.bundle.INotificationBundleProcessor;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.notifications.receivers.FCMBroadcastReceiver$onReceive$1", f = "FCMBroadcastReceiver.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FCMBroadcastReceiver$onReceive$1 extends h implements InterfaceC1441l {
    final /* synthetic */ Bundle $bundle;
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
    int label;
    final /* synthetic */ FCMBroadcastReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FCMBroadcastReceiver$onReceive$1(Context context, BroadcastReceiver.PendingResult pendingResult, Intent intent, FCMBroadcastReceiver fCMBroadcastReceiver, Bundle bundle, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.$context = context;
        this.$pendingResult = pendingResult;
        this.$intent = intent;
        this.this$0 = fCMBroadcastReceiver;
        this.$bundle = bundle;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new FCMBroadcastReceiver$onReceive$1(this.$context, this.$pendingResult, this.$intent, this.this$0, this.$bundle, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        boolean isFCMMessage;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            Context applicationContext = this.$context.getApplicationContext();
            i.d(applicationContext, "getApplicationContext(...)");
            this.label = 1;
            obj = OneSignal.initWithContext(applicationContext, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        v vVar = v.f5689a;
        if (!booleanValue) {
            Logging.warn$default("FCMBroadcastReceiver skipped due to failed OneSignal init", null, 2, null);
            this.$pendingResult.finish();
            return vVar;
        }
        INotificationBundleProcessor iNotificationBundleProcessor = (INotificationBundleProcessor) OneSignal.INSTANCE.getServices().getService(INotificationBundleProcessor.class);
        isFCMMessage = FCMBroadcastReceiver.Companion.isFCMMessage(this.$intent);
        if (!isFCMMessage) {
            this.this$0.setSuccessfulResultCode();
            this.$pendingResult.finish();
            return vVar;
        }
        INotificationBundleProcessor.ProcessedBundleResult processBundleFromReceiver = iNotificationBundleProcessor.processBundleFromReceiver(this.$context, this.$bundle);
        if (processBundleFromReceiver == null || !processBundleFromReceiver.isWorkManagerProcessing()) {
            this.this$0.setSuccessfulResultCode();
            this.$pendingResult.finish();
            return vVar;
        }
        this.this$0.setAbort();
        this.$pendingResult.finish();
        return vVar;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((FCMBroadcastReceiver$onReceive$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}

package com.onesignal.flutter;

import H2.f;
import H2.l;
import H2.m;
import H2.n;
import H2.o;
import com.onesignal.OneSignal;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.subscriptions.IPushSubscriptionObserver;
import com.onesignal.user.subscriptions.PushSubscriptionChangedState;
import org.json.JSONException;

/* loaded from: classes.dex */
public class OneSignalPushSubscription extends FlutterMessengerResponder implements m, IPushSubscriptionObserver {
    private static OneSignalPushSubscription sharedInstance;

    private OneSignalPushSubscription() {
    }

    public static OneSignalPushSubscription getSharedInstance() {
        if (sharedInstance == null) {
            sharedInstance = new OneSignalPushSubscription();
        }
        return sharedInstance;
    }

    private void lifecycleInit(n nVar) {
        OneSignal.getUser().getPushSubscription().removeObserver(this);
        OneSignal.getUser().getPushSubscription().addObserver(this);
        replySuccess(nVar, null);
    }

    private void optIn(l lVar, n nVar) {
        OneSignal.getUser().getPushSubscription().optIn();
        replySuccess(nVar, null);
    }

    private void optOut(l lVar, n nVar) {
        OneSignal.getUser().getPushSubscription().optOut();
        replySuccess(nVar, null);
    }

    public static void registerWith(f fVar) {
        OneSignalPushSubscription sharedInstance2 = getSharedInstance();
        sharedInstance2.messenger = fVar;
        o oVar = new o(fVar, "OneSignal#pushsubscription");
        sharedInstance2.channel = oVar;
        oVar.b(sharedInstance2);
    }

    @Override // H2.m
    public void onMethodCall(l lVar, n nVar) {
        if (lVar.f1146a.contentEquals("OneSignal#optIn")) {
            optIn(lVar, nVar);
            return;
        }
        String str = lVar.f1146a;
        if (str.contentEquals("OneSignal#optOut")) {
            optOut(lVar, nVar);
            return;
        }
        if (str.contentEquals("OneSignal#pushSubscriptionId")) {
            replySuccess(nVar, OneSignal.getUser().getPushSubscription().getId());
            return;
        }
        if (str.contentEquals("OneSignal#pushSubscriptionToken")) {
            replySuccess(nVar, OneSignal.getUser().getPushSubscription().getToken());
            return;
        }
        if (str.contentEquals("OneSignal#pushSubscriptionOptedIn")) {
            replySuccess(nVar, Boolean.valueOf(OneSignal.getUser().getPushSubscription().getOptedIn()));
        } else if (str.contentEquals("OneSignal#lifecycleInit")) {
            lifecycleInit(nVar);
        } else {
            replyNotImplemented(nVar);
        }
    }

    @Override // com.onesignal.user.subscriptions.IPushSubscriptionObserver
    public void onPushSubscriptionChange(PushSubscriptionChangedState pushSubscriptionChangedState) {
        try {
            invokeMethodOnUiThread("OneSignal#onPushSubscriptionChange", OneSignalSerializer.convertOnPushSubscriptionChange(pushSubscriptionChangedState));
        } catch (JSONException e3) {
            e3.getStackTrace();
            Logging.error("Encountered an error attempting to convert PushSubscriptionChangedState object to hash map:" + e3.toString(), null);
        }
    }
}

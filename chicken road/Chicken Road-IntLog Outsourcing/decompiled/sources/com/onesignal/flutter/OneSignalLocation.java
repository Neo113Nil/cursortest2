package com.onesignal.flutter;

import H2.f;
import H2.l;
import H2.m;
import H2.n;
import H2.o;
import com.onesignal.Continue;
import com.onesignal.OneSignal;

/* loaded from: classes.dex */
public class OneSignalLocation extends FlutterMessengerResponder implements m {
    private static OneSignalLocation sharedInstance;

    private OneSignalLocation() {
    }

    public static OneSignalLocation getSharedInstance() {
        if (sharedInstance == null) {
            sharedInstance = new OneSignalLocation();
        }
        return sharedInstance;
    }

    public static void registerWith(f fVar) {
        OneSignalLocation sharedInstance2 = getSharedInstance();
        sharedInstance2.messenger = fVar;
        o oVar = new o(fVar, "OneSignal#location");
        sharedInstance2.channel = oVar;
        oVar.b(sharedInstance2);
    }

    private void requestPermission(n nVar) {
        OneSignal.getLocation().requestPermission(Continue.none());
        replySuccess(nVar, null);
    }

    private void setShared(l lVar, n nVar) {
        OneSignal.getLocation().setShared(((Boolean) lVar.f1147b).booleanValue());
        replySuccess(nVar, null);
    }

    @Override // H2.m
    public void onMethodCall(l lVar, n nVar) {
        if (lVar.f1146a.contentEquals("OneSignal#requestPermission")) {
            requestPermission(nVar);
            return;
        }
        String str = lVar.f1146a;
        if (str.contentEquals("OneSignal#setShared")) {
            setShared(lVar, nVar);
        } else if (str.contentEquals("OneSignal#isShared")) {
            replySuccess(nVar, Boolean.valueOf(OneSignal.getLocation().isShared()));
        } else {
            replyNotImplemented(nVar);
        }
    }
}

package com.onesignal.flutter;

import H2.f;
import H2.l;
import H2.m;
import H2.n;
import H2.o;
import com.onesignal.OneSignal;
import com.onesignal.debug.LogLevel;

/* loaded from: classes.dex */
public class OneSignalDebug extends FlutterMessengerResponder implements m {
    private static OneSignalDebug sharedInstance;

    private OneSignalDebug() {
    }

    public static OneSignalDebug getSharedInstance() {
        if (sharedInstance == null) {
            sharedInstance = new OneSignalDebug();
        }
        return sharedInstance;
    }

    public static void registerWith(f fVar) {
        OneSignalDebug sharedInstance2 = getSharedInstance();
        sharedInstance2.messenger = fVar;
        o oVar = new o(fVar, "OneSignal#debug");
        sharedInstance2.channel = oVar;
        oVar.b(sharedInstance2);
    }

    private void setAlertLevel(l lVar, n nVar) {
        try {
            OneSignal.getDebug().setAlertLevel(LogLevel.fromInt(((Integer) lVar.a("visualLevel")).intValue()));
            replySuccess(nVar, null);
        } catch (ClassCastException e3) {
            replyError(nVar, "OneSignal", "failed with error: " + e3.getMessage() + "\n" + e3.getStackTrace(), null);
        }
    }

    private void setLogLevel(l lVar, n nVar) {
        try {
            OneSignal.getDebug().setLogLevel(LogLevel.fromInt(((Integer) lVar.a("logLevel")).intValue()));
            replySuccess(nVar, null);
        } catch (ClassCastException e3) {
            replyError(nVar, "OneSignal", "failed with error: " + e3.getMessage() + "\n" + e3.getStackTrace(), null);
        }
    }

    @Override // H2.m
    public void onMethodCall(l lVar, n nVar) {
        if (lVar.f1146a.contentEquals("OneSignal#setLogLevel")) {
            setLogLevel(lVar, nVar);
        } else if (lVar.f1146a.contentEquals("OneSignal#setAlertLevel")) {
            setAlertLevel(lVar, nVar);
        } else {
            replyNotImplemented(nVar);
        }
    }
}

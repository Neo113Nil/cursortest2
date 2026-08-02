package com.razorpay;

import android.app.Activity;
import android.content.IntentFilter;
import java.util.ArrayList;

/* loaded from: classes4.dex */
class SmsAgent {
    static final int READ_SMS_PERMISSION_CODE = 1;
    static SmsAgent sSmsAgent;
    ArrayList<SmsAgentInterface> interfaceArrayList = new ArrayList<>();
    private SmsReceiver l$1_I$l$;

    public static SmsAgent getSmsAgentInstance() {
        if (sSmsAgent == null) {
            sSmsAgent = new SmsAgent();
        }
        return sSmsAgent;
    }

    public void addSMSBroadcastReceiver(Activity activity) {
        if (this.l$1_I$l$ != null) {
            return;
        }
        Logger.d("Adding SMS Broadcast receiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.setPriority(1000);
        this.l$1_I$l$ = new SmsReceiver(this);
        intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
        Logger.d("Added SMS Broadcast receiver");
    }

    public void deregisterForCallbacks(SmsAgentInterface smsAgentInterface) {
    }

    public void handleRequestPermissionsResult(Activity activity, int i, String[] strArr, int[] iArr) {
        if (i != 1) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            sendSmsPermissionCallBack(false);
            AnalyticsUtil.trackEvent(AnalyticsEvent.SMS_PERMISSION_NOW_DENIED);
        } else {
            sendSmsPermissionCallBack(true);
            addSMSBroadcastReceiver(activity);
            AnalyticsUtil.trackEvent(AnalyticsEvent.SMS_PERMISSION_NOW_GRANTED);
        }
    }

    public void postSms(String str, String str2) {
    }

    public void registerForCallbacks(SmsAgentInterface smsAgentInterface) {
    }

    public void removeSMSBroadcastReceiver(Activity activity) {
        sendSmsPermissionCallBack(false);
        SmsReceiver smsReceiver = this.l$1_I$l$;
        if (smsReceiver == null) {
            Logger.d("removeSMSBroadcastReceiver called but it was not registered");
            return;
        }
        try {
            activity.unregisterReceiver(smsReceiver);
        } catch (Exception e) {
            AnalyticsUtil.reportError("SmsAgent", "S0", e.getMessage());
        }
        this.l$1_I$l$ = null;
        Logger.d("SMS Broadcast receiver removed");
    }

    public void sendSmsPermissionCallBack(boolean z) {
    }

    public boolean takeActionsIfPermissionsAreGranted(Activity activity) {
        return false;
    }
}

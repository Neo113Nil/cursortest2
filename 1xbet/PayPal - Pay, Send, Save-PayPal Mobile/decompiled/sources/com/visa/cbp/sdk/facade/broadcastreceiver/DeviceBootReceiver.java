package com.visa.cbp.sdk.facade.broadcastreceiver;

/* loaded from: classes16.dex */
public class DeviceBootReceiver extends android.content.BroadcastReceiver {
    com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishCallbackInterface replenishCallbackInterface;

    public DeviceBootReceiver(com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishCallbackInterface replenishCallbackInterface) {
        this.replenishCallbackInterface = replenishCallbackInterface;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        try {
            if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
                com.visa.cbp.getPhone.valueOf(com.visa.cbp.getPhone.ReplenishAckRequest.DAY, this.replenishCallbackInterface);
            }
        } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException unused) {
        }
    }
}

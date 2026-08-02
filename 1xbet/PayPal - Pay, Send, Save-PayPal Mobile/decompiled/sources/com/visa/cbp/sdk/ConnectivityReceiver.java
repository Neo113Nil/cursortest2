package com.visa.cbp.sdk;

/* loaded from: classes16.dex */
public class ConnectivityReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = "ConnectivityReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent.getExtras() != null) {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting()) {
                java.lang.String str = getHighResolutionOutputSizeshNQ4ISI;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Network ");
                sb.append(connectivityManager.getActiveNetworkInfo());
                sb.append(" connected");
                com.visa.cbp.setVtsCerts.getTvls(str, sb.toString());
                if (com.visa.cbp.setEmail.settingsDao != null) {
                    com.visa.cbp.setVtsCerts.getTvls(str, "Start DASServiceManager");
                    com.visa.cbp.sdk.facade.DASServiceManager.getInstance(context, com.visa.cbp.setEmail.settingsDao);
                    return;
                }
                return;
            }
            com.visa.cbp.setVtsCerts.getTvls(getHighResolutionOutputSizeshNQ4ISI, "No network connectivity.");
            com.visa.cbp.sdk.facade.DASServiceManager.setLoginState(com.visa.cbp.sdk.facade.LoginState.NOT_CONNECTED);
        }
    }
}

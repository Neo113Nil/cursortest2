package com.ironsource;

/* renamed from: com.ironsource.o4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class RunnableC3198o4 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f6533a;

    public RunnableC3198o4(org.json.JSONObject stringToSend) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringToSend, "stringToSend");
        this.f6533a = stringToSend;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
            ironLog.verbose("preparing to send crashes report");
            java.net.URLConnection openConnection = new java.net.URL(com.ironsource.C3180n4.d().h).openConnection();
            kotlin.jvm.internal.Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT, com.ironsource.B5.M);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(this.f6533a.toString());
            dataOutputStream.flush();
            dataOutputStream.close();
            android.util.Log.i("STATUS", java.lang.String.valueOf(httpURLConnection.getResponseCode()));
            android.util.Log.i("MSG", httpURLConnection.getResponseMessage());
            httpURLConnection.disconnect();
            ironLog.verbose("sent crash report for type " + this.f6533a.get("crashType") + " and date " + this.f6533a.get("crashDate"));
        } catch (java.lang.Exception e) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }
}

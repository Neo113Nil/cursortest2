package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.dyneti.android.dyscan.f f3334a;
    public final java.lang.String b;

    public r0() {
        this.f3334a = null;
        this.b = null;
    }

    public final void a(com.dyneti.android.dyscan.n2 n2Var) {
        double d;
        android.content.Intent registerReceiver;
        java.lang.String str = android.os.Build.VERSION.RELEASE;
        java.lang.String str2 = this.b;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{ \"androidID\": \"");
        sb.append(str2);
        sb.append("\"}");
        java.lang.String obj = sb.toString();
        java.lang.String str3 = android.os.Build.MODEL;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");
        com.dyneti.android.dyscan.f fVar = this.f3334a;
        java.lang.String str4 = "unknown";
        if (fVar == null || (registerReceiver = ((com.dyneti.android.dyscan.DyScanView) fVar).getActivity().registerReceiver(null, intentFilter)) == null) {
            d = 0.0d;
        } else {
            d = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
            int intExtra = registerReceiver.getIntExtra("status", -1);
            if (intExtra == 2) {
                str4 = "charging";
            } else if (intExtra == 5) {
                str4 = a.b.m;
            } else if (intExtra == 3 || intExtra == 4) {
                str4 = "unplugged";
            }
        }
        n2Var.a("deviceOS", str);
        n2Var.a("deviceIDs", obj);
        n2Var.a("deviceModel", str3);
        n2Var.a("batteryLevel", d);
        n2Var.a("batteryState", str4);
    }

    public r0(com.dyneti.android.dyscan.f fVar) {
        this.b = null;
        this.f3334a = fVar;
        this.b = android.provider.Settings.Secure.getString(((com.dyneti.android.dyscan.DyScanView) fVar).getActivity().getContentResolver(), a.b.l);
    }
}

package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class e1 implements com.dyneti.shared_interfaces.DynetiLogger {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3300a;

    public e1(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.f3300a = str;
    }

    @Override // com.dyneti.shared_interfaces.DynetiLogger
    public final java.lang.Object logNfcScan(com.dyneti.shared_interfaces.DynetiNFCScanData dynetiNFCScanData, kotlin.coroutines.Continuation continuation) {
        com.dyneti.android.dyscan.n2 n2Var = new com.dyneti.android.dyscan.n2();
        n2Var.a("cardBIN", dynetiNFCScanData.getCardBIN());
        n2Var.a("lastFourDigits", dynetiNFCScanData.getLastFourDigits());
        n2Var.a("cardNumberHash", com.dyneti.android.dyscan.z.a(new com.dyneti.android.dyscan.x(dynetiNFCScanData.getCardNumber())));
        n2Var.a("scanSuccessful", dynetiNFCScanData.getScanSuccessful());
        n2Var.a("scanDidNotFindCard", dynetiNFCScanData.getScanDidNotFindCard());
        n2Var.a("error", dynetiNFCScanData.getError());
        java.util.List<java.lang.String> cardAids = dynetiNFCScanData.getCardAids();
        n2Var.b("cardAids", cardAids != null ? (java.lang.String[]) cardAids.toArray(new java.lang.String[0]) : null);
        n2Var.a("cardMoved", dynetiNFCScanData.getCardMoved());
        n2Var.a("hasExpirationDate", dynetiNFCScanData.getHasExpirationDate());
        try {
            n2Var.f3326a.put("listenerActiveTime", dynetiNFCScanData.getListenerActiveTime());
        } catch (org.json.JSONException e) {
            n2Var.a("listenerActiveTime", e);
        }
        n2Var.a("unrecognizedCard", dynetiNFCScanData.getUnrecognizedCard());
        com.dyneti.android.dyscan.t1.a(n2Var);
        new com.dyneti.android.dyscan.r0().a(n2Var);
        new com.dyneti.android.dyscan.p1().a(n2Var);
        new com.dyneti.android.dyscan.g2().a(n2Var);
        com.dyneti.android.dyscan.w1 w1Var = new com.dyneti.android.dyscan.w1(this.f3300a);
        if (com.dyneti.android.dyscan.DyScan.isEuVersion()) {
            java.lang.String[] strArr = {"cardBIN", "lastFourDigits", "deviceOS", "deviceModel", "deviceIDs", "acceleration", "deviceOrientation", "magnetometer", "deviceName", "wifiIp", "cellularIp", "wiredIp", "androidCameraVersion", "cardNumberHash"};
            for (int i = 0; i < 14; i++) {
                n2Var.f3326a.remove(strArr[i]);
            }
        }
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.dyneti.android.dyscan.v1(w1Var, n2Var, null), continuation);
        if (coroutineScope != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            coroutineScope = kotlin.Unit.INSTANCE;
        }
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }
}

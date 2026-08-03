package com.inmobi.media;

/* loaded from: classes5.dex */
public final class O2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f4866a;
    public int b;
    public int c;

    public O2() {
    }

    public static java.lang.String a(java.lang.String mcc, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mcc, "mcc");
        return mcc + "#" + i + "#" + i2 + "#" + i3;
    }

    public O2(android.telephony.CellInfo cellInfo, java.lang.String mcc, java.lang.String mnc, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mcc, "mcc");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mnc, "mnc");
        if (cellInfo instanceof android.telephony.CellInfoGsm) {
            this.c = i;
            android.telephony.CellInfoGsm cellInfoGsm = (android.telephony.CellInfoGsm) cellInfo;
            this.b = cellInfoGsm.getCellSignalStrength().getDbm();
            android.telephony.CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cellIdentity, "getCellIdentity(...)");
            this.f4866a = a(mcc, mnc, cellIdentity.getLac(), cellIdentity.getCid(), -1, Integer.MAX_VALUE);
            return;
        }
        if (cellInfo instanceof android.telephony.CellInfoCdma) {
            this.c = i;
            android.telephony.CellInfoCdma cellInfoCdma = (android.telephony.CellInfoCdma) cellInfo;
            this.b = cellInfoCdma.getCellSignalStrength().getDbm();
            android.telephony.CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cellIdentity2, "getCellIdentity(...)");
            this.f4866a = a(mcc, cellIdentity2.getSystemId(), cellIdentity2.getNetworkId(), cellIdentity2.getBasestationId());
            return;
        }
        if (cellInfo instanceof android.telephony.CellInfoWcdma) {
            this.c = i;
            android.telephony.CellInfoWcdma cellInfoWcdma = (android.telephony.CellInfoWcdma) cellInfo;
            this.b = cellInfoWcdma.getCellSignalStrength().getDbm();
            android.telephony.CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cellIdentity3, "getCellIdentity(...)");
            this.f4866a = a(mcc, mnc, cellIdentity3.getLac(), cellIdentity3.getCid(), cellIdentity3.getPsc(), Integer.MAX_VALUE);
        }
    }

    public static java.lang.String a(java.lang.String mcc, java.lang.String mnc, int i, int i2, int i3, int i4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mcc, "mcc");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mnc, "mnc");
        return mcc + "#" + mnc + "#" + i + "#" + i2 + "#" + (i3 == -1 ? "" : java.lang.Integer.valueOf(i3)) + "#" + (i4 != Integer.MAX_VALUE ? java.lang.Integer.valueOf(i4) : "");
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("id", this.f4866a);
            int i = this.b;
            if (i != Integer.MAX_VALUE) {
                jSONObject.put("ss", i);
            }
            jSONObject.put("nt", this.c);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }
}

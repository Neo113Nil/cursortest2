package com.inmobi.media;

import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoWcdma;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.l3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3867l3 {

    /* renamed from: a, reason: collision with root package name */
    public String f7214a;
    public int b;
    public int c;

    public C3867l3() {
    }

    public static String a(String mcc, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(mcc, "mcc");
        return mcc + "#" + i + "#" + i2 + "#" + i3;
    }

    public C3867l3(CellInfo cellInfo, String mcc, String mnc, int i) {
        Intrinsics.checkNotNullParameter(mcc, "mcc");
        Intrinsics.checkNotNullParameter(mnc, "mnc");
        if (cellInfo instanceof CellInfoGsm) {
            this.c = i;
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            this.b = cellInfoGsm.getCellSignalStrength().getDbm();
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            Intrinsics.checkNotNullExpressionValue(cellIdentity, "getCellIdentity(...)");
            this.f7214a = a(mcc, mnc, cellIdentity.getLac(), cellIdentity.getCid(), -1, Integer.MAX_VALUE);
            return;
        }
        if (cellInfo instanceof CellInfoCdma) {
            this.c = i;
            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
            this.b = cellInfoCdma.getCellSignalStrength().getDbm();
            CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
            Intrinsics.checkNotNullExpressionValue(cellIdentity2, "getCellIdentity(...)");
            this.f7214a = a(mcc, cellIdentity2.getSystemId(), cellIdentity2.getNetworkId(), cellIdentity2.getBasestationId());
            return;
        }
        if (cellInfo instanceof CellInfoWcdma) {
            this.c = i;
            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
            this.b = cellInfoWcdma.getCellSignalStrength().getDbm();
            CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
            Intrinsics.checkNotNullExpressionValue(cellIdentity3, "getCellIdentity(...)");
            this.f7214a = a(mcc, mnc, cellIdentity3.getLac(), cellIdentity3.getCid(), cellIdentity3.getPsc(), Integer.MAX_VALUE);
        }
    }

    public static String a(String mcc, String mnc, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(mcc, "mcc");
        Intrinsics.checkNotNullParameter(mnc, "mnc");
        return mcc + "#" + mnc + "#" + i + "#" + i2 + "#" + (i3 == -1 ? "" : Integer.valueOf(i3)) + "#" + (i4 != Integer.MAX_VALUE ? Integer.valueOf(i4) : "");
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f7214a);
            int i = this.b;
            if (i != Integer.MAX_VALUE) {
                jSONObject.put("ss", i);
            }
            jSONObject.put("nt", this.c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}

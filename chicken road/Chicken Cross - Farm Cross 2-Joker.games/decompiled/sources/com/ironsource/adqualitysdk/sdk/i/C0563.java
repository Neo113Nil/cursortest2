package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ւ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0563 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f1276 = StringFog.decrypt("jYPTqC9PxkSnlP+zD1TcW4mU2K8dVNpZqqPZsBlOxlM=\n", "xPG8xnwgszY=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0682 f1277;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f1278;

    static {
        StringFog.decrypt("Y8oS1EXyCdVggRnTZ/MTzmHCJNhS\n", "Dq92vSSGYLo=\n");
        StringFog.decrypt("Hne8hhRkuFkdPLeBOXWnUx9CtI4MQrRA\n", "cxLY73UQ0TY=\n");
        StringFog.decrypt("1gniUHv4uqjVQuVVf+29hM4f8lZ33rax\n", "u2yGORqM08c=\n");
    }

    public C0563(C0682 c0682) {
        this.f1277 = c0682;
        C0593 c0593 = new C0593(this);
        AbstractC0554 m5521 = AbstractC0554.m5521();
        synchronized (m5521) {
            m5521.f1253.add(c0593);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m5531(C0563 c0563, ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        c0563.getClass();
        C0627 c0627 = new C0627();
        c0627.f1673 = true;
        c0627.f1676 = iSAdQualityCustomMediationRevenue.getRevenue();
        c0627.f1678 = m5530(iSAdQualityCustomMediationRevenue.getMediationNetwork());
        c0627.f1674 = iSAdQualityCustomMediationRevenue.getPlacement();
        c0627.f1672 = iSAdQualityCustomMediationRevenue.getCustomData();
        return c0627.m5584();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5530(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.ADMOB) {
            return StringFog.decrypt("gRsU0GU=\n", "4H95vwcXv2Q=\n");
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.DT_FAIR_BID) {
            return StringFog.decrypt("H8l4szH7sg==\n", "eagRwVOS1ps=\n");
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.HELIUM) {
            return StringFog.decrypt("d6alHGzm\n", "H8PJdRmLJkQ=\n");
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.LEVEL_PLAY) {
            return StringFog.decrypt("hV4CpEe4vjyfSA==\n", "9itywTXL0VI=\n");
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.MAX) {
            return StringFog.decrypt("1/35AWwx+Jw=\n", "to2JbQNHkfI=\n");
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.UNITY) {
            return StringFog.decrypt("SnjMGsSEGYg=\n", "Pxalbr3lffs=\n");
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.SELF_MEDIATED) {
            return StringFog.decrypt("mFeUxqMAuiuKRp3E\n", "6zL4oM5l3kI=\n");
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.OTHER) {
            return StringFog.decrypt("L7quXiE=\n", "QM7GO1PeCmU=\n");
        }
        return "";
    }
}

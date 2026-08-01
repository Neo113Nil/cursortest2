package com.inmobi.media;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import androidx.autofill.HintConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* renamed from: com.inmobi.media.m3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3897m3 {
    public static HashMap a() {
        String str;
        HashMap hashMap = new HashMap();
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return hashMap;
        }
        int cellOperatorFlag = Kk.a().getCellOperatorFlag();
        boolean z = (cellOperatorFlag & 2) == 2;
        boolean z2 = (cellOperatorFlag & 1) == 1;
        C3838k3 c3838k3 = new C3838k3();
        Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        if (!z) {
            int[] a2 = a(telephonyManager.getNetworkOperator());
            c3838k3.f7193a = a2[0];
            c3838k3.b = a2[1];
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (networkCountryIso != null) {
                Locale ENGLISH = Locale.ENGLISH;
                Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                String lowerCase = networkCountryIso.toLowerCase(ENGLISH);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                c3838k3.e = lowerCase;
            }
        }
        if (!z2) {
            int[] a3 = a(telephonyManager.getSimOperator());
            c3838k3.c = a3[0];
            c3838k3.d = a3[1];
        }
        String b = c3838k3.b();
        if (b != null) {
            hashMap.put("s-ho", b);
        }
        String a4 = c3838k3.a();
        if (a4 != null) {
            hashMap.put("s-co", a4);
        }
        String str2 = c3838k3.e;
        if (str2 != null) {
            hashMap.put("s-iso", str2);
        }
        Y5.f6965a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService2 = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        TelephonyManager telephonyManager2 = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
        if (telephonyManager2 == null || (str = telephonyManager2.getNetworkOperatorName()) == null) {
            str = "";
        }
        hashMap.put("s-cn", str);
        return hashMap;
    }

    public static HashMap b() {
        String str;
        Context context;
        Oi oi = Kk.f6677a;
        Context context2 = AbstractC3914mk.f7252a;
        C3867l3 c3867l3 = null;
        if (context2 != null) {
            Intrinsics.checkNotNullParameter(context2, "context");
            ConcurrentHashMap concurrentHashMap = Db.b;
            Db a2 = Cb.a(context2, "coppa_store");
            Intrinsics.checkNotNullParameter("im_accid", "key");
            str = a2.f6510a.getString("im_accid", null);
        } else {
            str = null;
        }
        if ((str == null || Kk.a().isConnectedCellTowerEnabled()) && d() && e() && (context = AbstractC3914mk.f7252a) != null) {
            Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            int[] a3 = a(telephonyManager.getNetworkOperator());
            String valueOf = String.valueOf(a3[0]);
            String valueOf2 = String.valueOf(a3[1]);
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo != null) {
                int size = allCellInfo.size();
                CellInfo cellInfo = null;
                for (int i = 0; i < size; i++) {
                    cellInfo = allCellInfo.get(i);
                    if (cellInfo.isRegistered()) {
                        break;
                    }
                }
                if (cellInfo != null) {
                    c3867l3 = new C3867l3(cellInfo, valueOf, valueOf2, Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType());
                }
            }
            CellLocation cellLocation = telephonyManager.getCellLocation();
            if (cellLocation != null && a3[0] != -1) {
                c3867l3 = new C3867l3();
                if (cellLocation instanceof CdmaCellLocation) {
                    c3867l3.b = Integer.MAX_VALUE;
                    c3867l3.c = Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
                    CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                    c3867l3.f7214a = C3867l3.a(valueOf, cdmaCellLocation.getSystemId(), cdmaCellLocation.getNetworkId(), cdmaCellLocation.getBaseStationId());
                } else {
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                    c3867l3.b = Integer.MAX_VALUE;
                    c3867l3.c = Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
                    c3867l3.f7214a = C3867l3.a(valueOf, valueOf2, gsmCellLocation.getLac(), gsmCellLocation.getCid(), gsmCellLocation.getPsc(), Integer.MAX_VALUE);
                }
            }
        }
        HashMap hashMap = new HashMap();
        if (c3867l3 != null) {
            hashMap.put("c-sc", c3867l3.a().toString());
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap c() {
        ArrayList arrayList;
        if (AbstractC3914mk.c() && d() && e()) {
            Oi oi = Kk.f6677a;
            Context context = AbstractC3914mk.f7252a;
            String str = null;
            if (context != null) {
                Intrinsics.checkNotNullParameter(context, "context");
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db a2 = Cb.a(context, "coppa_store");
                Intrinsics.checkNotNullParameter("im_accid", "key");
                str = a2.f6510a.getString("im_accid", null);
            }
            if (str == null || Kk.a().isVisibleCellTowerEnabled()) {
                Context context2 = AbstractC3914mk.f7252a;
                if (context2 == null) {
                    arrayList = new ArrayList();
                } else {
                    Object systemService = context2.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                    TelephonyManager telephonyManager = (TelephonyManager) systemService;
                    ArrayList arrayList2 = new ArrayList();
                    int[] a3 = a(telephonyManager.getNetworkOperator());
                    String valueOf = String.valueOf(a3[0]);
                    String valueOf2 = String.valueOf(a3[1]);
                    List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                    if (allCellInfo != null) {
                        for (CellInfo cellInfo : allCellInfo) {
                            if (!cellInfo.isRegistered()) {
                                arrayList2.add(new C3867l3(cellInfo, valueOf, valueOf2, Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType()));
                            }
                        }
                    }
                    arrayList = arrayList2;
                }
                HashMap hashMap = new HashMap();
                if (!arrayList.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(((C3867l3) arrayList.get(arrayList.size() - 1)).a());
                    hashMap.put("v-sc", jSONArray.toString());
                }
                return hashMap;
            }
        }
        arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        if (!arrayList.isEmpty()) {
        }
        return hashMap2;
    }

    public static boolean d() {
        if (!AbstractC3914mk.c()) {
            return false;
        }
        boolean a2 = Og.a(AbstractC3914mk.f7252a, "android.permission.READ_PHONE_STATE");
        boolean a3 = Og.a(AbstractC3914mk.f7252a, "android.permission.ACCESS_FINE_LOCATION");
        int i = Build.VERSION.SDK_INT;
        if (i == 29) {
            if (!a3) {
                Intrinsics.checkNotNullExpressionValue("m3", "TAG");
            }
            return a3;
        }
        if (i >= 30) {
            if (!a3 || !a2) {
                Intrinsics.checkNotNullExpressionValue("m3", "TAG");
            }
            return a3 && a2;
        }
        boolean a4 = Og.a(AbstractC3914mk.f7252a, "android.permission.ACCESS_COARSE_LOCATION");
        if (!a4 && !a3) {
            Intrinsics.checkNotNullExpressionValue("m3", "TAG");
        }
        return a4 || a3;
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        Context context = AbstractC3914mk.f7252a;
        Object systemService = context != null ? context.getSystemService(FirebaseAnalytics.Param.LOCATION) : null;
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        return locationManager != null && locationManager.isLocationEnabled();
    }

    public static int[] a(String str) {
        int[] iArr = {-1, -1};
        if (str != null && !Intrinsics.areEqual("", str)) {
            try {
                String substring = str.substring(0, 3);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                int parseInt = Integer.parseInt(substring);
                String substring2 = str.substring(3);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                int parseInt2 = Integer.parseInt(substring2);
                iArr[0] = parseInt;
                iArr[1] = parseInt2;
            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            }
        }
        return iArr;
    }
}

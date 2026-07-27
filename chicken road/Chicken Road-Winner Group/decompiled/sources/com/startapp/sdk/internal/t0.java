package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.model.AdDetails;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class t0 {
    public static ArrayList a(Context context, List list, int i3, HashSet hashSet, boolean z3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = list.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            AdDetails adDetails = (AdDetails) it.next();
            List<String> asList = Arrays.asList(adDetails.t());
            WeakHashMap weakHashMap = si.f4343a;
            ArrayList arrayList5 = new ArrayList();
            for (String str : asList) {
                if (si.e(str)) {
                    arrayList5.add(str);
                }
            }
            AppPresenceDetails appPresenceDetails = new AppPresenceDetails(i3, adDetails.r(), arrayList5.isEmpty() ? null : (String) arrayList5.get(0), adDetails.d());
            boolean z5 = adDetails.d() != null && adDetails.d().startsWith("!");
            boolean a3 = p0.a(adDetails.r(), context, z5 ? adDetails.d().substring(1) : adDetails.d());
            boolean z6 = AdsCommonMetaData.k().G() && ((a3 && !z5) || (!a3 && z5));
            arrayList3.add(appPresenceDetails);
            if (z6) {
                appPresenceDetails.a(a3);
                appPresenceDetails.b(false);
                if (!z5) {
                    arrayList2.add(adDetails);
                    arrayList4.add(appPresenceDetails);
                }
                hashSet.add(adDetails.s());
                z4 = true;
            } else {
                arrayList.add(adDetails);
            }
        }
        if (arrayList.size() < 5 && (list.size() != 1 || i3 > 0)) {
            int min = Math.min(5 - arrayList.size(), arrayList2.size());
            arrayList.addAll(arrayList2.subList(0, min));
            Iterator it2 = arrayList4.subList(0, min).iterator();
            while (it2.hasNext()) {
                ((AppPresenceDetails) it2.next()).b(true);
            }
        }
        if (z4) {
            com.startapp.sdk.adsbase.g.f(context);
            if (z3) {
                ((Executor) com.startapp.sdk.components.a.a(context).f3335A.a()).execute(new s0(context, arrayList3).f4312c);
            }
        }
        return arrayList;
    }

    public static ArrayList a(String str, int i3) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = new String[0];
        String a3 = si.a(str, "@tracking@", "@tracking@");
        if (a3 != null) {
            strArr = a3.split(StringUtils.COMMA);
        }
        String[] strArr2 = new String[0];
        String a4 = si.a(str, "@appPresencePackage@", "@appPresencePackage@");
        if (a4 != null) {
            strArr2 = a4.split(StringUtils.COMMA);
        }
        String[] strArr3 = new String[0];
        String a5 = si.a(str, "@minAppVersion@", "@minAppVersion@");
        if (a5 != null) {
            strArr3 = a5.split(StringUtils.COMMA);
        }
        int i4 = 0;
        while (i4 < strArr2.length) {
            arrayList.add(new AppPresenceDetails(i3, strArr3.length > i4 ? Integer.valueOf(strArr3[i4]).intValue() : 0, strArr.length > i4 ? strArr[i4] : null, strArr2[i4]));
            i4++;
        }
        while (i4 < strArr.length) {
            arrayList.add(new AppPresenceDetails(i3, strArr3.length > i4 ? Integer.valueOf(strArr3[i4]).intValue() : 0, strArr[i4], ""));
            i4++;
        }
        return arrayList;
    }

    public static Boolean a(Context context, ArrayList arrayList, int i3, HashSet hashSet, ArrayList arrayList2) {
        Iterator it = arrayList.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            AppPresenceDetails appPresenceDetails = (AppPresenceDetails) it.next();
            boolean startsWith = appPresenceDetails.b().startsWith("!");
            boolean a3 = p0.a(appPresenceDetails.a(), context, startsWith ? appPresenceDetails.b().substring(1) : appPresenceDetails.b());
            if ((!startsWith && a3) || (startsWith && !a3)) {
                appPresenceDetails.a(a3);
                z3 = i3 == 0;
                if (z3 && !startsWith) {
                    hashSet.add(appPresenceDetails.b());
                } else if (!z3 && appPresenceDetails.c() != null) {
                    appPresenceDetails.a(appPresenceDetails.c() + "&isShown=" + appPresenceDetails.e() + "&appPresence=" + appPresenceDetails.d());
                }
            }
            arrayList2.add(appPresenceDetails);
        }
        if (z3) {
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                ((AppPresenceDetails) arrayList2.get(i4)).b(false);
            }
        }
        return Boolean.valueOf(z3);
    }
}

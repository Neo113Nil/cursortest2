package sg.bigo.ads.c;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.view.accessibility.AccessibilityManager;
import androidx.autofill.HintConstants;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: sg.bigo.ads.c.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5045k {
    public static String a(Context context) {
        if (Build.VERSION.SDK_INT < 28) {
            return "";
        }
        try {
            SignalStrength signalStrength = ((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getSignalStrength();
            return signalStrength != null ? String.valueOf(signalStrength.getLevel()) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static HashSet b(Context context) {
        HashSet hashSet = new HashSet();
        Iterator<AccessibilityServiceInfo> it = ((AccessibilityManager) context.getSystemService("accessibility")).getEnabledAccessibilityServiceList(-1).iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().getResolveInfo().serviceInfo;
            if ((serviceInfo.applicationInfo.flags & 1) == 0) {
                hashSet.add(serviceInfo.packageName + "/" + serviceInfo.name);
            }
        }
        return hashSet;
    }

    public static String a() {
        return Resources.getSystem().getConfiguration().getLocales().get(0).toLanguageTag();
    }
}

package com.pgl.ssdk;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* loaded from: classes7.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private static AccessibilityManager f11642a;

    private static AccessibilityManager a(Context context) {
        if (f11642a == null) {
            f11642a = (AccessibilityManager) context.getSystemService("accessibility");
        }
        return f11642a;
    }

    public static String b(Context context) {
        AccessibilityManager a2;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (context == null || (a2 = a(context)) == null || (enabledAccessibilityServiceList = a2.getEnabledAccessibilityServiceList(-1)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < enabledAccessibilityServiceList.size(); i++) {
            AccessibilityServiceInfo accessibilityServiceInfo = enabledAccessibilityServiceList.get(i);
            if (accessibilityServiceInfo != null) {
                String format = String.format("%s#%s", accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName, accessibilityServiceInfo.getResolveInfo().serviceInfo.name);
                if (!arrayList.contains(format)) {
                    arrayList.add(format);
                }
            }
        }
        return UByte$$ExternalSyntheticBackport0.m((CharSequence) ",", (Iterable) arrayList);
    }
}

package com.fyber.inneractive.sdk.click;

/* loaded from: classes3.dex */
public final class k implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        android.content.pm.ActivityInfo activityInfo;
        java.lang.String str;
        android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) obj2;
        android.content.pm.ActivityInfo activityInfo2 = ((android.content.pm.ResolveInfo) obj).activityInfo;
        if (activityInfo2 == null || (activityInfo = resolveInfo.activityInfo) == null || (str = activityInfo2.packageName) == null) {
            return 1;
        }
        return str.compareTo(activityInfo.packageName);
    }
}

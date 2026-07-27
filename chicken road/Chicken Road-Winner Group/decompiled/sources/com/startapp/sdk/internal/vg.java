package com.startapp.sdk.internal;

import android.content.pm.PackageInfo;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class vg implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j3 = ((PackageInfo) obj).firstInstallTime;
        long j4 = ((PackageInfo) obj2).firstInstallTime;
        if (j3 > j4) {
            return -1;
        }
        return j3 == j4 ? 0 : 1;
    }
}

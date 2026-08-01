package com.chartboost.sdk.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class h8 {
    public static final List a(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        IntRange until = RangesKt.until(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((IntIterator) it).nextInt()));
        }
        return arrayList;
    }

    public static final List b(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        IntRange until = RangesKt.until(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((IntIterator) it).nextInt());
            if (obj == null) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final qh a(ph phVar) {
        Intrinsics.checkNotNullParameter(phVar, "<this>");
        return new qh(phVar.a(), phVar.b(), phVar.c());
    }

    public static final kf a(f3 f3Var) {
        Intrinsics.checkNotNullParameter(f3Var, "<this>");
        return new kf(Integer.valueOf(f3Var.a()), Integer.valueOf(f3Var.c().b()), f3Var.b(), f3Var.f());
    }

    public static final String a(PackageManager packageManager, String packageName) {
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            String str = g8.getPackageInfoCompat(packageManager, packageName, 128).versionName;
            return str == null ? "" : str;
        } catch (Exception e) {
            mb.b("Exception raised getting package manager object", e);
            return "";
        }
    }

    public static final PackageInfo a(PackageManager packageManager, String packageName, int i) {
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(i));
            Intrinsics.checkNotNull(packageInfo);
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, i);
        Intrinsics.checkNotNull(packageInfo2);
        return packageInfo2;
    }
}

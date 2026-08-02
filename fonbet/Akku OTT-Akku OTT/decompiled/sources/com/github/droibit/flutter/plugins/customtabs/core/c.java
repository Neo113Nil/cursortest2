package com.github.droibit.flutter.plugins.customtabs.core;

import android.content.pm.ResolveInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {
    public static Set a(List list) {
        Set createSetBuilder = SetsKt.createSetBuilder(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String packageName = ((ResolveInfo) it.next()).activityInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            createSetBuilder.add(packageName);
        }
        return SetsKt.build(createSetBuilder);
    }
}

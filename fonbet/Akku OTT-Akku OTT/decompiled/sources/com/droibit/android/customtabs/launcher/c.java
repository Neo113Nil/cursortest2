package com.droibit.android.customtabs.launcher;

import android.content.pm.ResolveInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class c extends Lambda implements Function1<ResolveInfo, String> {
    public static final c a = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(ResolveInfo resolveInfo) {
        ResolveInfo it = resolveInfo;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.activityInfo.packageName;
    }
}

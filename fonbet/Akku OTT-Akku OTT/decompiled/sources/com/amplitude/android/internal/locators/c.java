package com.amplitude.android.internal.locators;

import com.amplitude.android.utilities.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class c extends Lambda implements Function1<com.amplitude.common.a, List<b>> {
    public static final c a = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final List<b> invoke(com.amplitude.common.a aVar) {
        com.amplitude.common.a logger = aVar;
        Intrinsics.checkNotNullParameter(logger, "logger");
        ArrayList arrayList = new ArrayList();
        if (n.a("androidx.compose.ui.node.Owner", null) && n.a("com.amplitude.android.internal.locators.ComposeViewTargetLocator", null)) {
            arrayList.add(new ComposeViewTargetLocator(logger));
        }
        arrayList.add(new a());
        return arrayList;
    }
}

package com.droibit.android.customtabs.launcher;

import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

@JvmName(name = "CustomTabsIntentHelper")
/* loaded from: classes3.dex */
public final class a {
    @JvmOverloads
    public static final String a(Context context, boolean z, g gVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.addAll(f.a);
        Set<String> set = gVar.a;
        if (set != null) {
            createListBuilder.addAll(set);
        }
        return CustomTabsClient.getPackageName(context, CollectionsKt.build(createListBuilder), z);
    }
}

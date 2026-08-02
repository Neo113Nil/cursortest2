package com.droibit.android.customtabs.launcher;

import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.browser.customtabs.CustomTabsService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class e extends Lambda implements Function1<String, Boolean> {
    public final /* synthetic */ PackageManager a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PackageManager packageManager) {
        super(1);
        this.a = packageManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION).setPackage(str);
        Intrinsics.checkNotNullExpressionValue(intent, "Intent(CustomTabsService…          .setPackage(it)");
        return Boolean.valueOf(this.a.resolveService(intent, 0) != null);
    }
}

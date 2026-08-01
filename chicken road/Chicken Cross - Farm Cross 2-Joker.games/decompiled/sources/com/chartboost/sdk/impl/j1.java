package com.chartboost.sdk.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j1 extends i1 {
    public final ContentResolver b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(Context context, ContentResolver contentResolver) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.b = contentResolver;
    }

    public h1 b() {
        boolean z;
        String string;
        ni niVar = ni.c;
        String str = null;
        try {
            z = Settings.Secure.getInt(this.b, "limit_ad_tracking") != 0;
            string = Settings.Secure.getString(this.b, "advertising_id");
        } catch (Settings.SettingNotFoundException unused) {
        }
        if (!z && !Intrinsics.areEqual(string, "00000000-0000-0000-0000-000000000000") && !a()) {
            niVar = ni.d;
            str = string;
            return new h1(niVar, str);
        }
        niVar = ni.e;
        return new h1(niVar, str);
    }
}

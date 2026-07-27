package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.Intent;
import com.chartboost.sdk.view.CBImpressionActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n9 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4891a;

    public n9(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4891a = context;
    }

    public final Intent a() {
        Intent addFlags = new Intent(this.f4891a, (Class<?>) CBImpressionActivity.class).putExtra("isChartboost", true).addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(addFlags, "addFlags(...)");
        return addFlags;
    }

    public final void a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            this.f4891a.startActivity(intent);
        } catch (Exception e) {
            mb.b("Cannot start the activity", e);
        }
    }
}

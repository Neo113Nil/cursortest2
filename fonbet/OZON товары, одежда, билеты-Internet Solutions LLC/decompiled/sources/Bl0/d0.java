package Bl0;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3969a;

    public d0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f3969a = context.getSharedPreferences("metrics_sdk_sp", 0);
    }
}

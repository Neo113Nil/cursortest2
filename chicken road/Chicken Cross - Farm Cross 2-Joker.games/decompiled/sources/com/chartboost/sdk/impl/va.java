package com.chartboost.sdk.impl;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class va {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f5043a;
    public final Function0 b;

    public va(PackageManager packageManager, Function0 intentFactory) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
        this.f5043a = packageManager;
        this.b = intentFactory;
    }

    public static final Intent a() {
        return new Intent("android.intent.action.VIEW");
    }

    public final boolean b(String str) {
        if (str != null && str.length() != 0) {
            try {
                return !a(a(str)).isEmpty();
            } catch (Exception e) {
                mb.b("Cannot open URL", e);
            }
        }
        return false;
    }

    public final List a(Intent intent) {
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager.ResolveInfoFlags of = PackageManager.ResolveInfoFlags.of(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
            Intrinsics.checkNotNullExpressionValue(of, "of(...)");
            return a(intent, of);
        }
        List<ResolveInfo> queryIntentActivities = this.f5043a.queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNull(queryIntentActivities);
        return queryIntentActivities;
    }

    public /* synthetic */ va(PackageManager packageManager, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(packageManager, (i & 2) != 0 ? new Function0() { // from class: com.chartboost.sdk.impl.va$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return va.a();
            }
        } : function0);
    }

    public final List a(Intent intent, PackageManager.ResolveInfoFlags resolveInfoFlags) {
        List<ResolveInfo> queryIntentActivities = this.f5043a.queryIntentActivities(intent, resolveInfoFlags);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
        return queryIntentActivities;
    }

    public final Intent a(String str) {
        Intent intent = (Intent) this.b.invoke();
        intent.addFlags(268435456);
        intent.setData(Uri.parse(str));
        return intent;
    }
}

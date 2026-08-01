package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.internal.util.PathProvider;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class l implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12137a;

    public l(Context context, PathProvider pathProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.f12137a = context;
    }

    @Override // com.vungle.ads.internal.task.c
    public final int a(Bundle bundle, g jobRunner) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        ((com.vungle.ads.internal.network.r) LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new k(this.f12137a)).getValue()).b();
        return 0;
    }
}

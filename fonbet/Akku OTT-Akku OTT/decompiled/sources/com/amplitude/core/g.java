package com.amplitude.core;

import android.content.SharedPreferences;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class g extends Lambda implements Function0<k> {
    public final /* synthetic */ com.amplitude.android.a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.amplitude.android.a aVar) {
        super(0);
        this.a = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final k invoke() {
        com.amplitude.android.a amplitude = this.a;
        amplitude.a.g.getClass();
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        com.amplitude.android.h configuration = amplitude.a;
        Intrinsics.checkNotNull(configuration, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        SharedPreferences sharedPreferences = configuration.b.getSharedPreferences("amplitude-events-" + configuration.e, 0);
        String str = configuration.e;
        com.amplitude.common.a a = configuration.h.a(amplitude);
        Intrinsics.checkNotNull(sharedPreferences);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new com.amplitude.android.storage.i(str, a, sharedPreferences, new File(configuration.a(), "events"), amplitude.n);
    }
}

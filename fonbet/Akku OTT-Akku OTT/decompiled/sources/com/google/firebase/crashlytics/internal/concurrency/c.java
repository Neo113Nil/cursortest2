package com.google.firebase.crashlytics.internal.concurrency;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String checkNotMainThread$lambda$0;
        checkNotMainThread$lambda$0 = CrashlyticsWorkers.Companion.checkNotMainThread$lambda$0();
        return checkNotMainThread$lambda$0;
    }
}

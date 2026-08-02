package com.google.firebase.crashlytics.internal.concurrency;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String checkBackgroundThread$lambda$2;
        checkBackgroundThread$lambda$2 = CrashlyticsWorkers.Companion.checkBackgroundThread$lambda$2();
        return checkBackgroundThread$lambda$2;
    }
}

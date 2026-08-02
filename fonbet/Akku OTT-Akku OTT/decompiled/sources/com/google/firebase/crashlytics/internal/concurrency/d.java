package com.google.firebase.crashlytics.internal.concurrency;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String checkBlockingThread$lambda$1;
        checkBlockingThread$lambda$1 = CrashlyticsWorkers.Companion.checkBlockingThread$lambda$1();
        return checkBlockingThread$lambda$1;
    }
}

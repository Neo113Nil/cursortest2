package com.google.firebase.crashlytics.internal.concurrency;

/* compiled from: CrashlyticsWorkers.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class CrashlyticsWorkers$Companion$checkBlockingThread$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Boolean> {
    CrashlyticsWorkers$Companion$checkBlockingThread$1(java.lang.Object obj) {
        super(0, obj, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion.class, "isBlockingThread", "isBlockingThread()Z", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Boolean invoke() {
        boolean isBlockingThread;
        isBlockingThread = ((com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion) this.receiver).isBlockingThread();
        return java.lang.Boolean.valueOf(isBlockingThread);
    }
}

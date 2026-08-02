package com.plaid.internal;

/* renamed from: com.plaid.internal.k0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0564k0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6456a;
    public final com.plaid.internal.C0537h0 b;
    public final com.plaid.internal.V<?> c;
    public final com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions d;
    public final com.google.gson.Gson e;

    public C0564k0(android.content.Context context, com.plaid.internal.C0537h0 c0537h0, com.plaid.internal.V<?> v, com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions crashApiOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0537h0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashApiOptions, "");
        this.f6456a = context;
        this.b = c0537h0;
        this.c = v;
        this.d = crashApiOptions;
        this.e = new com.google.gson.Gson();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.plaid.internal.core.crashreporting.internal.models.Crash crash, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0555j0 c0555j0;
        int i;
        com.plaid.internal.C0564k0 c0564k0;
        if (continuationImpl instanceof com.plaid.internal.C0555j0) {
            c0555j0 = (com.plaid.internal.C0555j0) continuationImpl;
            int i2 = c0555j0.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0555j0.d = i2 - 2147483648;
                java.lang.Object obj = c0555j0.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0555j0.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    c0555j0.f6446a = this;
                    c0555j0.d = 1;
                    java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.plaid.internal.C0528g0(this.b, new com.plaid.internal.core.crashreporting.internal.models.Crash[]{crash}, null), c0555j0);
                    if (withContext != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        withContext = kotlin.Unit.INSTANCE;
                    }
                    if (withContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c0564k0 = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0564k0 = c0555j0.f6446a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                androidx.work.Data build = new androidx.work.Data.Builder().putString("crashesApiClass", c0564k0.c.f5945a).putString("crashOptions", c0564k0.e.toJson(c0564k0.d)).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
                androidx.work.WorkManager.getInstance(c0564k0.f6456a).enqueue(new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.plaid.internal.core.crashreporting.internal.CrashUploadWorker.class).setInputData(build).build());
                return kotlin.Unit.INSTANCE;
            }
        }
        c0555j0 = new com.plaid.internal.C0555j0(this, continuationImpl);
        java.lang.Object obj2 = c0555j0.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0555j0.d;
        if (i != 0) {
        }
        androidx.work.Data build2 = new androidx.work.Data.Builder().putString("crashesApiClass", c0564k0.c.f5945a).putString("crashOptions", c0564k0.e.toJson(c0564k0.d)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "");
        androidx.work.WorkManager.getInstance(c0564k0.f6456a).enqueue(new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.plaid.internal.core.crashreporting.internal.CrashUploadWorker.class).setInputData(build2).build());
        return kotlin.Unit.INSTANCE;
    }
}

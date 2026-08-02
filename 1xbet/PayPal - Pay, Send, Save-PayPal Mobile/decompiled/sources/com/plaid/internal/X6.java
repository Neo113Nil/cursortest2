package com.plaid.internal;

/* loaded from: classes16.dex */
public final class X6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.E5 f5974a;
    public final kotlin.Lazy b;
    public com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions c;

    public static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.plaid.internal.Z6> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.plaid.internal.Z6 invoke() {
            com.plaid.internal.E5 e5 = com.plaid.internal.X6.this.f5974a;
            com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions crashApiOptions = com.plaid.internal.X6.this.c;
            if (crashApiOptions == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                crashApiOptions = null;
            }
            int projectId = crashApiOptions.getProjectId();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("https://analytics.plaid.com/sentry/api/");
            sb.append(projectId);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            return (com.plaid.internal.Z6) e5.a(sb.toString(), new com.plaid.internal.G5(new com.google.gson.GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").registerTypeAdapter(com.plaid.internal.core.crashreporting.internal.models.CrashContext.class, new com.plaid.internal.core.crashreporting.internal.models.CrashContextTypeAdapter()).create(), 2)).create(com.plaid.internal.Z6.class);
        }
    }

    public X6(com.plaid.internal.E5 e5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e5, "");
        this.f5974a = e5;
        this.b = kotlin.LazyKt.lazy(new com.plaid.internal.X6.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.plaid.internal.core.crashreporting.internal.models.Crash crash, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.U6 u6;
        int i;
        if (continuationImpl instanceof com.plaid.internal.U6) {
            u6 = (com.plaid.internal.U6) continuationImpl;
            int i2 = u6.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u6.c = i2 - 2147483648;
                java.lang.Object obj = u6.f5940a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = u6.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.Object value = this.b.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
                    com.plaid.internal.Z6 z6 = (com.plaid.internal.Z6) value;
                    java.lang.String a2 = a();
                    com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions crashApiOptions = this.c;
                    if (crashApiOptions == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        crashApiOptions = null;
                    }
                    java.lang.String apiKey = crashApiOptions.getApiKey();
                    u6.c = 1;
                    obj = z6.a(a2, apiKey, crash, u6);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!((com.plaid.internal.AbstractC0550i4) obj).a());
            }
        }
        u6 = new com.plaid.internal.U6(this, continuationImpl);
        java.lang.Object obj2 = u6.f5940a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = u6.c;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!((com.plaid.internal.AbstractC0550i4) obj2).a());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.util.List list, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.V6 v6;
        int i;
        java.util.ArrayList arrayList;
        if (continuationImpl instanceof com.plaid.internal.V6) {
            v6 = (com.plaid.internal.V6) continuationImpl;
            int i2 = v6.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v6.d = i2 - 2147483648;
                java.lang.Object obj = v6.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = v6.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    kotlinx.coroutines.CoroutineDispatcher io2 = kotlinx.coroutines.Dispatchers.getIO();
                    com.plaid.internal.W6 w6 = new com.plaid.internal.W6(list, arrayList2, this, null);
                    v6.f5956a = arrayList2;
                    v6.d = 1;
                    if (kotlinx.coroutines.BuildersKt.withContext(io2, w6, v6) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    arrayList = arrayList2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = v6.f5956a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj2 : arrayList) {
                    if (((com.plaid.internal.AbstractC0550i4) obj2).a()) {
                        arrayList3.add(obj2);
                    }
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!kotlin.collections.CollectionsKt.any(arrayList3));
            }
        }
        v6 = new com.plaid.internal.V6(this, continuationImpl);
        java.lang.Object obj3 = v6.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = v6.d;
        if (i != 0) {
        }
        java.util.ArrayList arrayList32 = new java.util.ArrayList();
        while (r7.hasNext()) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!kotlin.collections.CollectionsKt.any(arrayList32));
    }

    public final java.lang.String a() {
        com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions crashApiOptions = this.c;
        if (crashApiOptions == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            crashApiOptions = null;
        }
        return "Sentry sentry_version=6,sentry_key=".concat(java.lang.String.valueOf(crashApiOptions.getApiKey()));
    }
}

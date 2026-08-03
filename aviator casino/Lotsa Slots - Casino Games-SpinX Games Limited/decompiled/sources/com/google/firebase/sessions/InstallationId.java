package com.google.firebase.sessions;

/* compiled from: InstallationId.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/google/firebase/sessions/InstallationId;", "", "fid", "", "authToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getAuthToken", "()Ljava/lang/String;", "getFid", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InstallationId {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.firebase.sessions.InstallationId.Companion INSTANCE = new com.google.firebase.sessions.InstallationId.Companion(null);
    private static final java.lang.String TAG = "InstallationId";
    private final java.lang.String authToken;
    private final java.lang.String fid;

    public /* synthetic */ InstallationId(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    /* compiled from: InstallationId.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/google/firebase/sessions/InstallationId$Companion;", "", "()V", "TAG", "", "create", "Lcom/google/firebase/sessions/InstallationId;", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "(Lcom/google/firebase/installations/FirebaseInstallationsApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:19|20))(2:21|22))(3:29|30|(1:32))|23|24|25|(1:27)|13|14|15|16))|37|6|7|(0)(0)|23|24|25|(0)|13|14|15|16) */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
        
            r10 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
        
            android.util.Log.w(com.google.firebase.sessions.InstallationId.TAG, "Error getting authentication token.", r10);
            r10 = r9;
            r9 = "";
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0035, code lost:
        
            r10 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
        
            android.util.Log.w(com.google.firebase.sessions.InstallationId.TAG, "Error getting Firebase installation id .", r10);
            r9 = r9;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
        /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v8 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object create(com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.InstallationId> continuation) {
            com.google.firebase.sessions.InstallationId$Companion$create$1 installationId$Companion$create$1;
            java.lang.Object obj;
            java.lang.Object coroutine_suspended;
            int i;
            if (continuation instanceof com.google.firebase.sessions.InstallationId$Companion$create$1) {
                installationId$Companion$create$1 = (com.google.firebase.sessions.InstallationId$Companion$create$1) continuation;
                if ((installationId$Companion$create$1.label & Integer.MIN_VALUE) != 0) {
                    installationId$Companion$create$1.label -= Integer.MIN_VALUE;
                    obj = installationId$Companion$create$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = installationId$Companion$create$1.label;
                    java.lang.String str = "";
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.google.android.gms.tasks.Task<com.google.firebase.installations.InstallationTokenResult> token = firebaseInstallationsApi.getToken(false);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(token, "firebaseInstallations.getToken(false)");
                        installationId$Companion$create$1.L$0 = firebaseInstallationsApi;
                        installationId$Companion$create$1.label = 1;
                        obj = kotlinx.coroutines.tasks.TasksKt.await(token, installationId$Companion$create$1);
                        firebaseInstallationsApi = firebaseInstallationsApi;
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ?? r9 = (java.lang.String) installationId$Companion$create$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            firebaseInstallationsApi = r9;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "{\n          firebaseInst…ions.id.await()\n        }");
                            str = (java.lang.String) obj;
                            ?? r92 = firebaseInstallationsApi;
                            return new com.google.firebase.sessions.InstallationId(str, r92, null);
                        }
                        com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi2 = (com.google.firebase.installations.FirebaseInstallationsApi) installationId$Companion$create$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        firebaseInstallationsApi = firebaseInstallationsApi2;
                    }
                    java.lang.String token2 = ((com.google.firebase.installations.InstallationTokenResult) obj).getToken();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(token2, "{\n          firebaseInst…).await().token\n        }");
                    com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi3 = firebaseInstallationsApi;
                    ?? r93 = token2;
                    com.google.android.gms.tasks.Task<java.lang.String> id = firebaseInstallationsApi3.getId();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "firebaseInstallations.id");
                    installationId$Companion$create$1.L$0 = r93;
                    installationId$Companion$create$1.label = 2;
                    obj = kotlinx.coroutines.tasks.TasksKt.await(id, installationId$Companion$create$1);
                    firebaseInstallationsApi = r93;
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "{\n          firebaseInst…ions.id.await()\n        }");
                    str = (java.lang.String) obj;
                    ?? r922 = firebaseInstallationsApi;
                    return new com.google.firebase.sessions.InstallationId(str, r922, null);
                }
            }
            installationId$Companion$create$1 = new com.google.firebase.sessions.InstallationId$Companion$create$1(this, continuation);
            obj = installationId$Companion$create$1.result;
            coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = installationId$Companion$create$1.label;
            java.lang.String str2 = "";
            if (i != 0) {
            }
            java.lang.String token22 = ((com.google.firebase.installations.InstallationTokenResult) obj).getToken();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(token22, "{\n          firebaseInst…).await().token\n        }");
            com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi32 = firebaseInstallationsApi;
            ?? r932 = token22;
            com.google.android.gms.tasks.Task<java.lang.String> id2 = firebaseInstallationsApi32.getId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id2, "firebaseInstallations.id");
            installationId$Companion$create$1.L$0 = r932;
            installationId$Companion$create$1.label = 2;
            obj = kotlinx.coroutines.tasks.TasksKt.await(id2, installationId$Companion$create$1);
            firebaseInstallationsApi = r932;
            if (obj == coroutine_suspended) {
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "{\n          firebaseInst…ions.id.await()\n        }");
            str2 = (java.lang.String) obj;
            ?? r9222 = firebaseInstallationsApi;
            return new com.google.firebase.sessions.InstallationId(str2, r9222, null);
        }
    }

    private InstallationId(java.lang.String str, java.lang.String str2) {
        this.fid = str;
        this.authToken = str2;
    }

    public final java.lang.String getAuthToken() {
        return this.authToken;
    }

    public final java.lang.String getFid() {
        return this.fid;
    }
}

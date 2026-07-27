package com.google.firebase.sessions;

import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.tasks.TasksKt;

/* compiled from: InstallationId.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/sessions/InstallationId;", "", "fid", "", "authToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFid", "()Ljava/lang/String;", "getAuthToken", k.M, "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InstallationId {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String authToken;
    private final String fid;

    public /* synthetic */ InstallationId(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    /* compiled from: InstallationId.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/firebase/sessions/InstallationId$Companion;", "", "<init>", "()V", "create", "Lcom/google/firebase/sessions/InstallationId;", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "(Lcom/google/firebase/installations/FirebaseInstallationsApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|17)(2:20|21))(2:22|23))(3:30|31|(1:33))|24|25|26|(1:28)|13|(0)|16|17))|38|6|7|(0)(0)|24|25|26|(0)|13|(0)|16|17) */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
        
            r10 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
        
            android.util.Log.w(com.google.firebase.sessions.FirebaseSessions.TAG, "Error getting authentication token.", r10);
            r10 = r9;
            r9 = "";
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0035, code lost:
        
            r10 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
        
            android.util.Log.w(com.google.firebase.sessions.FirebaseSessions.TAG, "Error getting Firebase installation id .", r10);
            r9 = r9;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
        /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v8 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object create(FirebaseInstallationsApi firebaseInstallationsApi, Continuation<? super InstallationId> continuation) {
            InstallationId$Companion$create$1 installationId$Companion$create$1;
            Object obj;
            Object coroutine_suspended;
            int i;
            String str;
            if (continuation instanceof InstallationId$Companion$create$1) {
                installationId$Companion$create$1 = (InstallationId$Companion$create$1) continuation;
                if ((installationId$Companion$create$1.label & Integer.MIN_VALUE) != 0) {
                    installationId$Companion$create$1.label -= Integer.MIN_VALUE;
                    obj = installationId$Companion$create$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = installationId$Companion$create$1.label;
                    String str2 = "";
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Task<InstallationTokenResult> token = firebaseInstallationsApi.getToken(false);
                        Intrinsics.checkNotNullExpressionValue(token, "getToken(...)");
                        installationId$Companion$create$1.L$0 = firebaseInstallationsApi;
                        installationId$Companion$create$1.label = 1;
                        obj = TasksKt.await(token, installationId$Companion$create$1);
                        firebaseInstallationsApi = firebaseInstallationsApi;
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ?? r9 = (String) installationId$Companion$create$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            firebaseInstallationsApi = r9;
                            str = (String) obj;
                            ?? r92 = firebaseInstallationsApi;
                            if (str != null) {
                                str2 = str;
                                r92 = firebaseInstallationsApi;
                            }
                            return new InstallationId(str2, r92, null);
                        }
                        FirebaseInstallationsApi firebaseInstallationsApi2 = (FirebaseInstallationsApi) installationId$Companion$create$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        firebaseInstallationsApi = firebaseInstallationsApi2;
                    }
                    String token2 = ((InstallationTokenResult) obj).getToken();
                    FirebaseInstallationsApi firebaseInstallationsApi3 = firebaseInstallationsApi;
                    ?? r93 = token2;
                    Task<String> id = firebaseInstallationsApi3.getId();
                    Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
                    installationId$Companion$create$1.L$0 = r93;
                    installationId$Companion$create$1.label = 2;
                    obj = TasksKt.await(id, installationId$Companion$create$1);
                    firebaseInstallationsApi = r93;
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = (String) obj;
                    ?? r922 = firebaseInstallationsApi;
                    if (str != null) {
                    }
                    return new InstallationId(str2, r922, null);
                }
            }
            installationId$Companion$create$1 = new InstallationId$Companion$create$1(this, continuation);
            obj = installationId$Companion$create$1.result;
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = installationId$Companion$create$1.label;
            String str22 = "";
            if (i != 0) {
            }
            String token22 = ((InstallationTokenResult) obj).getToken();
            FirebaseInstallationsApi firebaseInstallationsApi32 = firebaseInstallationsApi;
            ?? r932 = token22;
            Task<String> id2 = firebaseInstallationsApi32.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
            installationId$Companion$create$1.L$0 = r932;
            installationId$Companion$create$1.label = 2;
            obj = TasksKt.await(id2, installationId$Companion$create$1);
            firebaseInstallationsApi = r932;
            if (obj == coroutine_suspended) {
            }
            str = (String) obj;
            ?? r9222 = firebaseInstallationsApi;
            if (str != null) {
            }
            return new InstallationId(str22, r9222, null);
        }
    }

    private InstallationId(String str, String str2) {
        this.fid = str;
        this.authToken = str2;
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getFid() {
        return this.fid;
    }
}

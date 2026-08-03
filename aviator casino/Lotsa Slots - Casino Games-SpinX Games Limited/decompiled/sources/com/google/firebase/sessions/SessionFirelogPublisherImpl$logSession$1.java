package com.google.firebase.sessions;

/* compiled from: SessionFirelogPublisher.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", i = {2}, l = {69, 70, 76}, m = "invokeSuspend", n = {"installationId"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class SessionFirelogPublisherImpl$logSession$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.google.firebase.sessions.SessionDetails $sessionDetails;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    int label;
    final /* synthetic */ com.google.firebase.sessions.SessionFirelogPublisherImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionFirelogPublisherImpl$logSession$1(com.google.firebase.sessions.SessionFirelogPublisherImpl sessionFirelogPublisherImpl, com.google.firebase.sessions.SessionDetails sessionDetails, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1> continuation) {
        super(2, continuation);
        this.this$0 = sessionFirelogPublisherImpl;
        this.$sessionDetails = sessionDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1(this.this$0, this.$sessionDetails, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi;
        com.google.firebase.sessions.InstallationId installationId;
        com.google.firebase.FirebaseApp firebaseApp;
        com.google.firebase.sessions.settings.SessionsSettings sessionsSettings;
        java.lang.Object registeredSubscribers$com_google_firebase_firebase_sessions;
        com.google.firebase.sessions.SessionEvents sessionEvents;
        com.google.firebase.sessions.SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
        com.google.firebase.sessions.settings.SessionsSettings sessionsSettings2;
        com.google.firebase.FirebaseApp firebaseApp2;
        com.google.firebase.sessions.SessionDetails sessionDetails;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.shouldLogSession(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.firebase.sessions.settings.SessionsSettings sessionsSettings3 = (com.google.firebase.sessions.settings.SessionsSettings) this.L$5;
                    com.google.firebase.sessions.SessionDetails sessionDetails2 = (com.google.firebase.sessions.SessionDetails) this.L$4;
                    com.google.firebase.FirebaseApp firebaseApp3 = (com.google.firebase.FirebaseApp) this.L$3;
                    com.google.firebase.sessions.SessionEvents sessionEvents2 = (com.google.firebase.sessions.SessionEvents) this.L$2;
                    com.google.firebase.sessions.SessionFirelogPublisherImpl sessionFirelogPublisherImpl2 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) this.L$1;
                    installationId = (com.google.firebase.sessions.InstallationId) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    sessionFirelogPublisherImpl = sessionFirelogPublisherImpl2;
                    sessionsSettings2 = sessionsSettings3;
                    sessionEvents = sessionEvents2;
                    sessionDetails = sessionDetails2;
                    firebaseApp2 = firebaseApp3;
                    sessionFirelogPublisherImpl.attemptLoggingSessionEvent(sessionEvents.buildSession(firebaseApp2, sessionDetails, sessionsSettings2, (java.util.Map) obj, installationId.getFid(), installationId.getAuthToken()));
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                installationId = (com.google.firebase.sessions.InstallationId) obj;
                com.google.firebase.sessions.SessionFirelogPublisherImpl sessionFirelogPublisherImpl3 = this.this$0;
                com.google.firebase.sessions.SessionEvents sessionEvents3 = com.google.firebase.sessions.SessionEvents.INSTANCE;
                firebaseApp = this.this$0.firebaseApp;
                com.google.firebase.sessions.SessionDetails sessionDetails3 = this.$sessionDetails;
                sessionsSettings = this.this$0.sessionSettings;
                this.L$0 = installationId;
                this.L$1 = sessionFirelogPublisherImpl3;
                this.L$2 = sessionEvents3;
                this.L$3 = firebaseApp;
                this.L$4 = sessionDetails3;
                this.L$5 = sessionsSettings;
                this.label = 3;
                registeredSubscribers$com_google_firebase_firebase_sessions = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (registeredSubscribers$com_google_firebase_firebase_sessions != coroutine_suspended) {
                    return coroutine_suspended;
                }
                sessionEvents = sessionEvents3;
                sessionFirelogPublisherImpl = sessionFirelogPublisherImpl3;
                sessionsSettings2 = sessionsSettings;
                firebaseApp2 = firebaseApp;
                obj = registeredSubscribers$com_google_firebase_firebase_sessions;
                sessionDetails = sessionDetails3;
                sessionFirelogPublisherImpl.attemptLoggingSessionEvent(sessionEvents.buildSession(firebaseApp2, sessionDetails, sessionsSettings2, (java.util.Map) obj, installationId.getFid(), installationId.getAuthToken()));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.google.firebase.sessions.InstallationId.Companion companion = com.google.firebase.sessions.InstallationId.INSTANCE;
            firebaseInstallationsApi = this.this$0.firebaseInstallations;
            this.label = 2;
            obj = companion.create(firebaseInstallationsApi, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            installationId = (com.google.firebase.sessions.InstallationId) obj;
            com.google.firebase.sessions.SessionFirelogPublisherImpl sessionFirelogPublisherImpl32 = this.this$0;
            com.google.firebase.sessions.SessionEvents sessionEvents32 = com.google.firebase.sessions.SessionEvents.INSTANCE;
            firebaseApp = this.this$0.firebaseApp;
            com.google.firebase.sessions.SessionDetails sessionDetails32 = this.$sessionDetails;
            sessionsSettings = this.this$0.sessionSettings;
            this.L$0 = installationId;
            this.L$1 = sessionFirelogPublisherImpl32;
            this.L$2 = sessionEvents32;
            this.L$3 = firebaseApp;
            this.L$4 = sessionDetails32;
            this.L$5 = sessionsSettings;
            this.label = 3;
            registeredSubscribers$com_google_firebase_firebase_sessions = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
            if (registeredSubscribers$com_google_firebase_firebase_sessions != coroutine_suspended) {
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}

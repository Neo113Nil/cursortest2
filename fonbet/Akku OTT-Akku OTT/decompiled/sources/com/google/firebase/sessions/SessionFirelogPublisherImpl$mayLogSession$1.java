package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.InstallationId;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.K;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/K;", "", "<anonymous>", "(Lkotlinx/coroutines/K;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1", f = "SessionFirelogPublisher.kt", i = {2}, l = {70, 71, 77}, m = "invokeSuspend", n = {"installationId"}, s = {"L$0"})
/* loaded from: classes4.dex */
public final class SessionFirelogPublisherImpl$mayLogSession$1 extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    final /* synthetic */ SessionDetails $sessionDetails;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ SessionFirelogPublisherImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionFirelogPublisherImpl$mayLogSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, SessionDetails sessionDetails, Continuation<? super SessionFirelogPublisherImpl$mayLogSession$1> continuation) {
        super(2, continuation);
        this.this$0 = sessionFirelogPublisherImpl;
        this.$sessionDetails = sessionDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SessionFirelogPublisherImpl$mayLogSession$1(this.this$0, this.$sessionDetails, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r9 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r9 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FirebaseInstallationsApi firebaseInstallationsApi;
        InstallationId installationId;
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
        FirebaseApp firebaseApp;
        SessionsSettings sessionsSettings;
        FirebaseApp firebaseApp2;
        SessionDetails sessionDetails;
        SessionEvents sessionEvents;
        SessionsSettings sessionsSettings2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl2 = this.this$0;
            this.label = 1;
            obj = sessionFirelogPublisherImpl2.shouldLogSession(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SessionsSettings sessionsSettings3 = (SessionsSettings) this.L$5;
                    SessionDetails sessionDetails2 = (SessionDetails) this.L$4;
                    FirebaseApp firebaseApp3 = (FirebaseApp) this.L$3;
                    SessionEvents sessionEvents2 = (SessionEvents) this.L$2;
                    sessionFirelogPublisherImpl = (SessionFirelogPublisherImpl) this.L$1;
                    installationId = (InstallationId) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    sessionsSettings2 = sessionsSettings3;
                    sessionEvents = sessionEvents2;
                    sessionDetails = sessionDetails2;
                    firebaseApp2 = firebaseApp3;
                    SessionFirelogPublisherImpl sessionFirelogPublisherImpl3 = sessionFirelogPublisherImpl;
                    Map<SessionSubscriber.Name, ? extends SessionSubscriber> map = (Map) obj;
                    InstallationId installationId2 = installationId;
                    sessionFirelogPublisherImpl3.attemptLoggingSessionEvent(sessionEvents.buildSession(firebaseApp2, sessionDetails, sessionsSettings2, map, installationId2.getFid(), installationId2.getAuthToken()));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                installationId = (InstallationId) obj;
                sessionFirelogPublisherImpl = this.this$0;
                SessionEvents sessionEvents3 = SessionEvents.INSTANCE;
                firebaseApp = sessionFirelogPublisherImpl.firebaseApp;
                SessionDetails sessionDetails3 = this.$sessionDetails;
                sessionsSettings = this.this$0.sessionSettings;
                FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
                this.L$0 = installationId;
                this.L$1 = sessionFirelogPublisherImpl;
                this.L$2 = sessionEvents3;
                this.L$3 = firebaseApp;
                this.L$4 = sessionDetails3;
                this.L$5 = sessionsSettings;
                this.label = 3;
                Object registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (registeredSubscribers$com_google_firebase_firebase_sessions != coroutine_suspended) {
                    firebaseApp2 = firebaseApp;
                    obj = registeredSubscribers$com_google_firebase_firebase_sessions;
                    sessionDetails = sessionDetails3;
                    sessionEvents = sessionEvents3;
                    sessionsSettings2 = sessionsSettings;
                    SessionFirelogPublisherImpl sessionFirelogPublisherImpl32 = sessionFirelogPublisherImpl;
                    Map<SessionSubscriber.Name, ? extends SessionSubscriber> map2 = (Map) obj;
                    InstallationId installationId22 = installationId;
                    sessionFirelogPublisherImpl32.attemptLoggingSessionEvent(sessionEvents.buildSession(firebaseApp2, sessionDetails, sessionsSettings2, map2, installationId22.getFid(), installationId22.getAuthToken()));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            InstallationId.Companion companion = InstallationId.INSTANCE;
            firebaseInstallationsApi = this.this$0.firebaseInstallations;
            this.label = 2;
            obj = companion.create(firebaseInstallationsApi, this);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((SessionFirelogPublisherImpl$mayLogSession$1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}

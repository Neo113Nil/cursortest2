package com.google.firebase.sessions;

import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.SharedSessionRepositoryImpl;
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
@DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", f = "SharedSessionRepository.kt", i = {}, l = {135, 186}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class SharedSessionRepositoryImpl$appForeground$1 extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    final /* synthetic */ SessionData $sessionData;
    int label;
    final /* synthetic */ SharedSessionRepositoryImpl this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/SessionData;", "currentSessionData"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", f = "SharedSessionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<SessionData, Continuation<? super SessionData>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SharedSessionRepositoryImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = sharedSessionRepositoryImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SessionData sessionData, Continuation<? super SessionData> continuation) {
            return ((AnonymousClass1) create(sessionData, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean isSessionExpired;
            boolean isColdStart;
            boolean isMyProcessStale;
            Map<String, ProcessData> processDataMap;
            ProcessDataManager processDataManager;
            SessionFirelogPublisher sessionFirelogPublisher;
            ProcessDataManager processDataManager2;
            ProcessDataManager processDataManager3;
            ProcessDataManager processDataManager4;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SessionData sessionData = (SessionData) this.L$0;
            isSessionExpired = this.this$0.isSessionExpired(sessionData);
            isColdStart = this.this$0.isColdStart(sessionData);
            isMyProcessStale = this.this$0.isMyProcessStale(sessionData);
            if (isColdStart) {
                processDataManager4 = this.this$0.processDataManager;
                processDataMap = processDataManager4.generateProcessDataMap();
            } else if (isMyProcessStale) {
                processDataManager = this.this$0.processDataManager;
                processDataMap = processDataManager.updateProcessDataMap(sessionData.getProcessDataMap());
            } else {
                processDataMap = sessionData.getProcessDataMap();
            }
            SessionDetails sessionDetails = isColdStart ? null : sessionData.getSessionDetails();
            if (!isSessionExpired && !isColdStart) {
                if (!isMyProcessStale) {
                    return sessionData;
                }
                processDataManager3 = this.this$0.processDataManager;
                return SessionData.copy$default(sessionData, null, null, processDataManager3.updateProcessDataMap(processDataMap), 3, null);
            }
            SessionDetails generateNewSession = this.this$0.sessionGenerator.generateNewSession(sessionDetails);
            sessionFirelogPublisher = this.this$0.sessionFirelogPublisher;
            sessionFirelogPublisher.mayLogSession(generateNewSession);
            processDataManager2 = this.this$0.processDataManager;
            processDataManager2.onSessionGenerated();
            return sessionData.copy(generateNewSession, null, processDataMap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSessionRepositoryImpl$appForeground$1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, SessionData sessionData, Continuation<? super SharedSessionRepositoryImpl$appForeground$1> continuation) {
        super(2, continuation);
        this.this$0 = sharedSessionRepositoryImpl;
        this.$sessionData = sessionData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SharedSessionRepositoryImpl$appForeground$1(this.this$0, this.$sessionData, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r10.updateData(r0, r9) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (r10.notifySubscribers(r0, r3, r9) == r1) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean isSessionExpired;
        SessionFirelogPublisher sessionFirelogPublisher;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            e.getMessage();
            isSessionExpired = this.this$0.isSessionExpired(this.$sessionData);
            if (isSessionExpired) {
                SessionDetails generateNewSession = this.this$0.sessionGenerator.generateNewSession(this.$sessionData.getSessionDetails());
                this.this$0.setLocalSessionData$com_google_firebase_firebase_sessions(SessionData.copy$default(this.$sessionData, generateNewSession, null, null, 4, null));
                sessionFirelogPublisher = this.this$0.sessionFirelogPublisher;
                sessionFirelogPublisher.mayLogSession(generateNewSession);
                SharedSessionRepositoryImpl sharedSessionRepositoryImpl = this.this$0;
                String sessionId = generateNewSession.getSessionId();
                SharedSessionRepositoryImpl.NotificationType notificationType = SharedSessionRepositoryImpl.NotificationType.FALLBACK;
                this.label = 2;
            }
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DataStore dataStore = this.this$0.sessionDataStore;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((SharedSessionRepositoryImpl$appForeground$1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}

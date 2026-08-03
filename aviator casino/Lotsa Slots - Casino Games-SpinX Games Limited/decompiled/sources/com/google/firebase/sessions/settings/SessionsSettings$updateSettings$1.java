package com.google.firebase.sessions.settings;

/* compiled from: SessionsSettings.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", i = {0}, l = {98, 99}, m = "updateSettings", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class SessionsSettings$updateSettings$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.google.firebase.sessions.settings.SessionsSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionsSettings$updateSettings$1(com.google.firebase.sessions.settings.SessionsSettings sessionsSettings, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1> continuation) {
        super(continuation);
        this.this$0 = sessionsSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateSettings(this);
    }
}

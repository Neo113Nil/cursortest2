package com.google.firebase.sessions.settings;

/* compiled from: SessionsSettings.kt */
@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001d\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000b8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings;", "", "localOverrideSettings", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "remoteSettings", "(Lcom/google/firebase/sessions/settings/SettingsProvider;Lcom/google/firebase/sessions/settings/SettingsProvider;)V", "samplingRate", "", "getSamplingRate", "()D", "sessionRestartTimeout", "Lkotlin/time/Duration;", "getSessionRestartTimeout-UwyO8pc", "()J", "sessionsEnabled", "", "getSessionsEnabled", "()Z", "isValidSamplingRate", "isValidSessionRestartTimeout", "isValidSessionRestartTimeout-LRDsOJo", "(J)Z", "updateSettings", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SessionsSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.firebase.sessions.settings.SessionsSettings.Companion INSTANCE = new com.google.firebase.sessions.settings.SessionsSettings.Companion(null);
    private final com.google.firebase.sessions.settings.SettingsProvider localOverrideSettings;
    private final com.google.firebase.sessions.settings.SettingsProvider remoteSettings;

    private final boolean isValidSamplingRate(double samplingRate) {
        return 0.0d <= samplingRate && samplingRate <= 1.0d;
    }

    @javax.inject.Inject
    public SessionsSettings(@com.google.firebase.sessions.LocalOverrideSettingsProvider com.google.firebase.sessions.settings.SettingsProvider localOverrideSettings, @com.google.firebase.sessions.RemoteSettingsProvider com.google.firebase.sessions.settings.SettingsProvider remoteSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localOverrideSettings, "localOverrideSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteSettings, "remoteSettings");
        this.localOverrideSettings = localOverrideSettings;
        this.remoteSettings = remoteSettings;
    }

    public final boolean getSessionsEnabled() {
        java.lang.Boolean sessionEnabled = this.localOverrideSettings.getSessionEnabled();
        if (sessionEnabled != null) {
            return sessionEnabled.booleanValue();
        }
        java.lang.Boolean sessionEnabled2 = this.remoteSettings.getSessionEnabled();
        if (sessionEnabled2 != null) {
            return sessionEnabled2.booleanValue();
        }
        return true;
    }

    public final double getSamplingRate() {
        java.lang.Double samplingRate = this.localOverrideSettings.getSamplingRate();
        if (samplingRate != null) {
            double doubleValue = samplingRate.doubleValue();
            if (isValidSamplingRate(doubleValue)) {
                return doubleValue;
            }
        }
        java.lang.Double samplingRate2 = this.remoteSettings.getSamplingRate();
        if (samplingRate2 == null) {
            return 1.0d;
        }
        double doubleValue2 = samplingRate2.doubleValue();
        if (isValidSamplingRate(doubleValue2)) {
            return doubleValue2;
        }
        return 1.0d;
    }

    /* renamed from: getSessionRestartTimeout-UwyO8pc, reason: not valid java name */
    public final long m5594getSessionRestartTimeoutUwyO8pc() {
        kotlin.time.Duration mo5592getSessionRestartTimeoutFghU774 = this.localOverrideSettings.mo5592getSessionRestartTimeoutFghU774();
        if (mo5592getSessionRestartTimeoutFghU774 != null) {
            long rawValue = mo5592getSessionRestartTimeoutFghU774.getRawValue();
            if (m5593isValidSessionRestartTimeoutLRDsOJo(rawValue)) {
                return rawValue;
            }
        }
        kotlin.time.Duration mo5592getSessionRestartTimeoutFghU7742 = this.remoteSettings.mo5592getSessionRestartTimeoutFghU774();
        if (mo5592getSessionRestartTimeoutFghU7742 != null) {
            long rawValue2 = mo5592getSessionRestartTimeoutFghU7742.getRawValue();
            if (m5593isValidSessionRestartTimeoutLRDsOJo(rawValue2)) {
                return rawValue2;
            }
        }
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        return kotlin.time.DurationKt.toDuration(30, kotlin.time.DurationUnit.MINUTES);
    }

    /* renamed from: isValidSessionRestartTimeout-LRDsOJo, reason: not valid java name */
    private final boolean m5593isValidSessionRestartTimeoutLRDsOJo(long sessionRestartTimeout) {
        return kotlin.time.Duration.m12173isPositiveimpl(sessionRestartTimeout) && kotlin.time.Duration.m12168isFiniteimpl(sessionRestartTimeout);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateSettings(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 sessionsSettings$updateSettings$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.google.firebase.sessions.settings.SessionsSettings sessionsSettings;
        com.google.firebase.sessions.settings.SettingsProvider settingsProvider;
        if (continuation instanceof com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1) {
            sessionsSettings$updateSettings$1 = (com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1) continuation;
            if ((sessionsSettings$updateSettings$1.label & Integer.MIN_VALUE) != 0) {
                sessionsSettings$updateSettings$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = sessionsSettings$updateSettings$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sessionsSettings$updateSettings$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.google.firebase.sessions.settings.SettingsProvider settingsProvider2 = this.localOverrideSettings;
                    sessionsSettings$updateSettings$1.L$0 = this;
                    sessionsSettings$updateSettings$1.label = 1;
                    if (settingsProvider2.updateSettings(sessionsSettings$updateSettings$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sessionsSettings = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    sessionsSettings = (com.google.firebase.sessions.settings.SessionsSettings) sessionsSettings$updateSettings$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                settingsProvider = sessionsSettings.remoteSettings;
                sessionsSettings$updateSettings$1.L$0 = null;
                sessionsSettings$updateSettings$1.label = 2;
                if (settingsProvider.updateSettings(sessionsSettings$updateSettings$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        sessionsSettings$updateSettings$1 = new com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1(this, continuation);
        java.lang.Object obj2 = sessionsSettings$updateSettings$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionsSettings$updateSettings$1.label;
        if (i != 0) {
        }
        settingsProvider = sessionsSettings.remoteSettings;
        sessionsSettings$updateSettings$1.L$0 = null;
        sessionsSettings$updateSettings$1.label = 2;
        if (settingsProvider.updateSettings(sessionsSettings$updateSettings$1) == coroutine_suspended) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* compiled from: SessionsSettings.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings$Companion;", "", "()V", com.ironsource.C3232q2.p, "Lcom/google/firebase/sessions/settings/SessionsSettings;", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "()Lcom/google/firebase/sessions/settings/SessionsSettings;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.google.firebase.sessions.settings.SessionsSettings getInstance() {
            return ((com.google.firebase.sessions.FirebaseSessionsComponent) com.google.firebase.FirebaseKt.getApp(com.google.firebase.Firebase.INSTANCE).get(com.google.firebase.sessions.FirebaseSessionsComponent.class)).getSessionsSettings();
        }
    }
}

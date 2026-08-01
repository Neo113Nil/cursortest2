package com.google.firebase.sessions.settings;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.LocalOverrideSettingsProvider;
import com.google.firebase.sessions.RemoteSettingsProvider;
import com.ironsource.C4561o2;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.services.core.fid.Constants;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* compiled from: SessionsSettings.kt */
@Singleton
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings;", "", "localOverrideSettings", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "remoteSettings", "<init>", "(Lcom/google/firebase/sessions/settings/SettingsProvider;Lcom/google/firebase/sessions/settings/SettingsProvider;)V", "sessionsEnabled", "", "getSessionsEnabled", "()Z", "samplingRate", "", "getSamplingRate", "()D", "sessionRestartTimeout", "Lkotlin/time/Duration;", "getSessionRestartTimeout-UwyO8pc", "()J", "isValidSamplingRate", "isValidSessionRestartTimeout", "isValidSessionRestartTimeout-LRDsOJo", "(J)Z", "updateSettings", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", k.M, "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SessionsSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SettingsProvider localOverrideSettings;
    private final SettingsProvider remoteSettings;

    private final boolean isValidSamplingRate(double samplingRate) {
        return 0.0d <= samplingRate && samplingRate <= 1.0d;
    }

    @Inject
    public SessionsSettings(@LocalOverrideSettingsProvider SettingsProvider localOverrideSettings, @RemoteSettingsProvider SettingsProvider remoteSettings) {
        Intrinsics.checkNotNullParameter(localOverrideSettings, "localOverrideSettings");
        Intrinsics.checkNotNullParameter(remoteSettings, "remoteSettings");
        this.localOverrideSettings = localOverrideSettings;
        this.remoteSettings = remoteSettings;
    }

    public final boolean getSessionsEnabled() {
        Boolean sessionEnabled = this.localOverrideSettings.getSessionEnabled();
        if (sessionEnabled != null) {
            return sessionEnabled.booleanValue();
        }
        Boolean sessionEnabled2 = this.remoteSettings.getSessionEnabled();
        if (sessionEnabled2 != null) {
            return sessionEnabled2.booleanValue();
        }
        return true;
    }

    public final double getSamplingRate() {
        Double samplingRate = this.localOverrideSettings.getSamplingRate();
        if (samplingRate != null) {
            double doubleValue = samplingRate.doubleValue();
            if (isValidSamplingRate(doubleValue)) {
                return doubleValue;
            }
        }
        Double samplingRate2 = this.remoteSettings.getSamplingRate();
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
    public final long m5207getSessionRestartTimeoutUwyO8pc() {
        Duration mo5205getSessionRestartTimeoutFghU774 = this.localOverrideSettings.mo5205getSessionRestartTimeoutFghU774();
        if (mo5205getSessionRestartTimeoutFghU774 != null) {
            long rawValue = mo5205getSessionRestartTimeoutFghU774.getRawValue();
            if (m5206isValidSessionRestartTimeoutLRDsOJo(rawValue)) {
                return rawValue;
            }
        }
        Duration mo5205getSessionRestartTimeoutFghU7742 = this.remoteSettings.mo5205getSessionRestartTimeoutFghU774();
        if (mo5205getSessionRestartTimeoutFghU7742 != null) {
            long rawValue2 = mo5205getSessionRestartTimeoutFghU7742.getRawValue();
            if (m5206isValidSessionRestartTimeoutLRDsOJo(rawValue2)) {
                return rawValue2;
            }
        }
        Duration.Companion companion = Duration.INSTANCE;
        return DurationKt.toDuration(30, DurationUnit.MINUTES);
    }

    /* renamed from: isValidSessionRestartTimeout-LRDsOJo, reason: not valid java name */
    private final boolean m5206isValidSessionRestartTimeoutLRDsOJo(long sessionRestartTimeout) {
        return Duration.m9453isPositiveimpl(sessionRestartTimeout) && Duration.m9448isFiniteimpl(sessionRestartTimeout);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSettings(Continuation<? super Unit> continuation) {
        SessionsSettings$updateSettings$1 sessionsSettings$updateSettings$1;
        Object coroutine_suspended;
        int i;
        SessionsSettings sessionsSettings;
        SettingsProvider settingsProvider;
        if (continuation instanceof SessionsSettings$updateSettings$1) {
            sessionsSettings$updateSettings$1 = (SessionsSettings$updateSettings$1) continuation;
            if ((sessionsSettings$updateSettings$1.label & Integer.MIN_VALUE) != 0) {
                sessionsSettings$updateSettings$1.label -= Integer.MIN_VALUE;
                Object obj = sessionsSettings$updateSettings$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sessionsSettings$updateSettings$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SettingsProvider settingsProvider2 = this.localOverrideSettings;
                    sessionsSettings$updateSettings$1.L$0 = this;
                    sessionsSettings$updateSettings$1.label = 1;
                    if (settingsProvider2.updateSettings(sessionsSettings$updateSettings$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sessionsSettings = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    sessionsSettings = (SessionsSettings) sessionsSettings$updateSettings$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                settingsProvider = sessionsSettings.remoteSettings;
                sessionsSettings$updateSettings$1.L$0 = null;
                sessionsSettings$updateSettings$1.label = 2;
                if (settingsProvider.updateSettings(sessionsSettings$updateSettings$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        sessionsSettings$updateSettings$1 = new SessionsSettings$updateSettings$1(this, continuation);
        Object obj2 = sessionsSettings$updateSettings$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionsSettings$updateSettings$1.label;
        if (i != 0) {
        }
        settingsProvider = sessionsSettings.remoteSettings;
        sessionsSettings$updateSettings$1.L$0 = null;
        sessionsSettings$updateSettings$1.label = 2;
        if (settingsProvider.updateSettings(sessionsSettings$updateSettings$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SessionsSettings.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings$Companion;", "", "<init>", "()V", C4561o2.p, "Lcom/google/firebase/sessions/settings/SessionsSettings;", Constants.GET_INSTANCE, "()Lcom/google/firebase/sessions/settings/SessionsSettings;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SessionsSettings getInstance() {
            return ((FirebaseSessionsComponent) FirebaseKt.getApp(Firebase.INSTANCE).get(FirebaseSessionsComponent.class)).getSessionsSettings();
        }
    }
}

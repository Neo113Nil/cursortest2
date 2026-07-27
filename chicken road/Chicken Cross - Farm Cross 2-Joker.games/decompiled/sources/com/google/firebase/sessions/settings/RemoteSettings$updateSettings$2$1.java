package com.google.firebase.sessions.settings;

import android.util.Log;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.TimeProvider;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RemoteSettings.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class RemoteSettings$updateSettings$2$1 extends SuspendLambda implements Function2<JSONObject, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, Continuation<? super RemoteSettings$updateSettings$2$1> continuation) {
        super(2, continuation);
        this.this$0 = remoteSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.this$0, continuation);
        remoteSettings$updateSettings$2$1.L$0 = obj;
        return remoteSettings$updateSettings$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(JSONObject jSONObject, Continuation<? super Unit> continuation) {
        return ((RemoteSettings$updateSettings$2$1) create(jSONObject, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Boolean] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r13;
        Double d;
        Integer num;
        SettingsCache settingsCache;
        RemoteSettings.Companion companion;
        int defaultCacheDuration;
        TimeProvider timeProvider;
        long seconds;
        JSONException jSONException;
        Integer num2;
        Integer num3;
        Double d2;
        Integer num4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            JSONObject jSONObject = (JSONObject) this.L$0;
            Log.d(FirebaseSessions.TAG, "Fetched settings: " + jSONObject);
            if (jSONObject.has("app_quality")) {
                Object obj2 = jSONObject.get("app_quality");
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject2 = (JSONObject) obj2;
                try {
                    num4 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                    try {
                        d2 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                        try {
                            num3 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                        } catch (JSONException e) {
                            num3 = null;
                            r11 = num4;
                            jSONException = e;
                            num2 = null;
                        }
                    } catch (JSONException e2) {
                        num3 = null;
                        d2 = null;
                        r11 = num4;
                        jSONException = e2;
                        num2 = null;
                    }
                } catch (JSONException e3) {
                    jSONException = e3;
                    num2 = null;
                    num3 = null;
                    d2 = null;
                }
                try {
                    r11 = jSONObject2.has("cache_duration") ? (Integer) jSONObject2.get("cache_duration") : null;
                    Unit unit = Unit.INSTANCE;
                    num = num3;
                    d = d2;
                    r13 = num4;
                } catch (JSONException e4) {
                    Integer num5 = num4;
                    jSONException = e4;
                    num2 = r11;
                    r11 = num5;
                    Boxing.boxInt(Log.e(FirebaseSessions.TAG, "Error parsing the configs remotely fetched: ", jSONException));
                    num = num3;
                    d = d2;
                    r13 = r11;
                    r11 = num2;
                    settingsCache = this.this$0.settingsCache;
                    if (r11 != null) {
                    }
                    timeProvider = this.this$0.timeProvider;
                    seconds = timeProvider.currentTime().getSeconds();
                    this.label = 1;
                    if (settingsCache.updateConfigs(new SessionConfigs(r13, d, num, Boxing.boxInt(defaultCacheDuration), Boxing.boxLong(seconds)), this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
            } else {
                r13 = 0;
                d = null;
                num = null;
            }
            settingsCache = this.this$0.settingsCache;
            if (r11 != null) {
                companion = RemoteSettings.Companion;
                defaultCacheDuration = companion.getDefaultCacheDuration();
            } else {
                defaultCacheDuration = r11.intValue();
            }
            timeProvider = this.this$0.timeProvider;
            seconds = timeProvider.currentTime().getSeconds();
            this.label = 1;
            if (settingsCache.updateConfigs(new SessionConfigs(r13, d, num, Boxing.boxInt(defaultCacheDuration), Boxing.boxLong(seconds)), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

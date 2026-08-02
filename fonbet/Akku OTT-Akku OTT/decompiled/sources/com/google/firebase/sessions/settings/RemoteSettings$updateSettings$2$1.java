package com.google.firebase.sessions.settings;

import android.util.Log;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.TimeProvider;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Objects;
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
import okhttp3.internal.ws.WebSocketProtocol;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class RemoteSettings$updateSettings$2$1 extends SuspendLambda implements Function2<JSONObject, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, Continuation<? super RemoteSettings$updateSettings$2$1> continuation) {
        super(2, continuation);
        this.this$0 = remoteSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.this$0, continuation);
        remoteSettings$updateSettings$2$1.L$0 = obj;
        return remoteSettings$updateSettings$2$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Boolean] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r12;
        ?? r13;
        Integer num;
        SettingsCache settingsCache;
        RemoteSettings.Companion companion;
        int defaultCacheDuration;
        TimeProvider timeProvider;
        SessionConfigs sessionConfigs;
        Integer num2;
        Integer num3;
        Integer num4;
        Object obj2;
        Integer num5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            JSONObject jSONObject = (JSONObject) this.L$0;
            Objects.toString(jSONObject);
            if (jSONObject.has("app_quality")) {
                Object obj3 = jSONObject.get("app_quality");
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject2 = (JSONObject) obj3;
                try {
                    num5 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                } catch (JSONException e) {
                    e = e;
                    num2 = null;
                    num3 = null;
                }
                try {
                    Object obj4 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                    try {
                        num2 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                    } catch (JSONException e2) {
                        e = e2;
                        num2 = null;
                        r10 = num5;
                        num4 = null;
                        obj2 = obj4;
                    }
                    try {
                        r10 = jSONObject2.has("cache_duration") ? (Integer) jSONObject2.get("cache_duration") : null;
                        Unit unit = Unit.INSTANCE;
                        num = num2;
                        r13 = obj4;
                        r12 = num5;
                    } catch (JSONException e3) {
                        e = e3;
                        Integer num6 = r10;
                        r10 = num5;
                        num4 = num6;
                        obj2 = obj4;
                        Boxing.boxInt(Log.e(FirebaseSessions.TAG, "Error parsing the configs remotely fetched: ", e));
                        num = num2;
                        r13 = obj2;
                        r12 = r10;
                        r10 = num4;
                        settingsCache = this.this$0.settingsCache;
                        if (r10 != null) {
                        }
                        timeProvider = this.this$0.timeProvider;
                        sessionConfigs = new SessionConfigs(r12, r13, num, Boxing.boxInt(defaultCacheDuration), Boxing.boxLong(timeProvider.currentTime().getSeconds()));
                        this.label = 1;
                        if (settingsCache.updateConfigs(sessionConfigs, this) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    num2 = null;
                    num3 = null;
                    r10 = num5;
                    num4 = num3;
                    obj2 = num3;
                    Boxing.boxInt(Log.e(FirebaseSessions.TAG, "Error parsing the configs remotely fetched: ", e));
                    num = num2;
                    r13 = obj2;
                    r12 = r10;
                    r10 = num4;
                    settingsCache = this.this$0.settingsCache;
                    if (r10 != null) {
                    }
                    timeProvider = this.this$0.timeProvider;
                    sessionConfigs = new SessionConfigs(r12, r13, num, Boxing.boxInt(defaultCacheDuration), Boxing.boxLong(timeProvider.currentTime().getSeconds()));
                    this.label = 1;
                    if (settingsCache.updateConfigs(sessionConfigs, this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
            } else {
                r12 = 0;
                r13 = null;
                num = null;
            }
            settingsCache = this.this$0.settingsCache;
            if (r10 != null) {
                defaultCacheDuration = r10.intValue();
            } else {
                companion = RemoteSettings.Companion;
                defaultCacheDuration = companion.getDefaultCacheDuration();
            }
            timeProvider = this.this$0.timeProvider;
            sessionConfigs = new SessionConfigs(r12, r13, num, Boxing.boxInt(defaultCacheDuration), Boxing.boxLong(timeProvider.currentTime().getSeconds()));
            this.label = 1;
            if (settingsCache.updateConfigs(sessionConfigs, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(JSONObject jSONObject, Continuation<? super Unit> continuation) {
        return ((RemoteSettings$updateSettings$2$1) create(jSONObject, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}

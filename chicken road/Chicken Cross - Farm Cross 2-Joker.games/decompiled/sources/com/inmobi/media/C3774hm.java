package com.inmobi.media;

import io.ktor.sse.ServerSentEventKt;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.hm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3774hm extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f7150a;
    public Mutex b;
    public int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ EnumC3944nm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3774hm(String str, Map map, EnumC3944nm enumC3944nm, Continuation continuation) {
        super(2, continuation);
        this.d = str;
        this.e = map;
        this.f = enumC3944nm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3774hm(this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3774hm) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0176, code lost:
    
        if (r13.a(r1, r12) == r3) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int a2;
        String str;
        C4057rm c4057rm;
        Mutex mutex;
        ?? r0 = "toString(...)";
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        try {
            try {
            } catch (Throwable th) {
                r0.unlock(null);
                throw th;
            }
        } catch (Exception e) {
            C3829jm c3829jm = C3829jm.f7187a;
            String str2 = "Error in submitting telemetry event : (" + e.getMessage() + ")";
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C3829jm c3829jm2 = C3829jm.f7187a;
            String str3 = "Telemetry event submitting: " + this.d + ServerSentEventKt.SPACE + this.e + ", evenType: " + this.f;
            if (C3829jm.h == null) {
                return Unit.INSTANCE;
            }
            if (C3829jm.a(this.d, this.e, this.f)) {
                String str4 = "skipping Event " + this.d;
                return Unit.INSTANCE;
            }
            C4196wm c4196wm = C3829jm.h;
            if (c4196wm == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTelemetryValidator");
                c4196wm = null;
            }
            EnumC3944nm telemetryEventType = this.f;
            String eventType = this.d;
            c4196wm.getClass();
            Intrinsics.checkNotNullParameter(telemetryEventType, "telemetryEventType");
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            int ordinal = telemetryEventType.ordinal();
            if (ordinal == 0) {
                a2 = c4196wm.b.a(eventType);
            } else {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 = c4196wm.c.a(eventType);
            }
            if (a2 != 0) {
                if (a2 != 1) {
                    return Unit.INSTANCE;
                }
                if (this.e.get("samplingRate") == null) {
                    this.e.put("samplingRate", Boxing.boxInt(100));
                }
            } else if (this.e.get("samplingRate") == null) {
                this.e.put("samplingRate", Boxing.boxInt(MathKt.roundToInt((1 - C3829jm.b().getSamplingFactor()) * 100)));
            }
            String str5 = this.d;
            int ordinal2 = this.f.ordinal();
            if (ordinal2 == 0) {
                str = "sdk";
            } else {
                if (ordinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "template";
            }
            C4057rm c4057rm2 = new C4057rm(str5, null, str);
            this.e.put("eventType", c4057rm2.f6546a);
            Map map = this.e;
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            map.put("eventId", uuid);
            this.e.put("isTemplateEvent", Boxing.boxBoolean(this.f == EnumC3944nm.b));
            Map map2 = this.e;
            Intrinsics.checkNotNull(map2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            String payload = new JSONObject(map2).toString();
            Intrinsics.checkNotNullExpressionValue(payload, "toString(...)");
            Intrinsics.checkNotNullParameter(payload, "payload");
            c4057rm2.b = payload;
            Mutex mutex2 = C3829jm.b;
            this.f7150a = c4057rm2;
            this.b = mutex2;
            this.c = 1;
            if (mutex2.lock(null, this) != coroutine_suspended) {
                c4057rm = c4057rm2;
                mutex = mutex2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex3 = (Mutex) this.f7150a;
            ResultKt.throwOnFailure(obj);
            r0 = mutex3;
            C3829jm.f7187a.a();
            Unit unit = Unit.INSTANCE;
            r0.unlock(null);
            return Unit.INSTANCE;
        }
        Mutex mutex4 = this.b;
        c4057rm = (C4057rm) this.f7150a;
        ResultKt.throwOnFailure(obj);
        mutex = mutex4;
        C3829jm c3829jm3 = C3829jm.f7187a;
        this.f7150a = mutex;
        this.b = null;
        this.c = 2;
        r0 = mutex;
    }
}

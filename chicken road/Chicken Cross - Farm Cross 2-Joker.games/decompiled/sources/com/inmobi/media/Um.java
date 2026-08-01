package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import java.nio.charset.Charset;
import java.util.HashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlinx.coroutines.Deferred;
import okio.ByteString;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Um extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6898a;
    public final /* synthetic */ SignalsConfig.UnifiedIdServiceConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Um(SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig, Continuation continuation) {
        super(1, continuation);
        this.b = unifiedIdServiceConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Um(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Um(this.b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e5, code lost:
    
        if (r2.a(r4, r12) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00fc, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00fa, code lost:
    
        if (r1.a(r3, r13, r12) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if (r13 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6898a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String url = this.b.getUrl();
            Oi oi = Kk.f6677a;
            J4 j4 = AbstractC4260z4.f7518a;
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            Mf a2 = new C3662dn(url, new Nm(((SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class)).getIncludeIds()), AbstractC3914mk.c, this.b.getMaxRetries(), this.b.getRetryInterval(), this.b.getTimeout()).a();
            HashMap hashMap = new HashMap();
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("UnifiedIdNetworkCallRequested", hashMap, EnumC3944nm.f7271a);
            Deferred a3 = ((C3733ga) If.i.getValue()).a(a2);
            Wm.d = a3;
            this.f6898a = 1;
            obj = a3.await(this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        Of of = (Of) obj;
        String str = "processRequest response = " + of;
        IntRange intRange = Tf.f6872a;
        Intrinsics.checkNotNullParameter(of, "<this>");
        ByteString d = of.d();
        Charset charset = Charsets.UTF_8;
        String str2 = "processRequest response.getStringResponse = " + d.string(charset);
        Wm wm = Wm.f6937a;
        Wm.e = new Zm(of, Wm.c);
        if (AbstractC4086sn.a(of)) {
            Zm zm = Wm.e;
            if (zm != null) {
                Intrinsics.checkNotNullParameter(of, "<this>");
                JSONObject jSONObject = new JSONObject(of.d().string(charset));
                this.f6898a = 2;
            }
            return Unit.INSTANCE;
        }
        Zm zm2 = Wm.e;
        if (zm2 != null) {
            int c = of.c();
            String e = of.e();
            this.f6898a = 3;
        }
        return Unit.INSTANCE;
    }
}

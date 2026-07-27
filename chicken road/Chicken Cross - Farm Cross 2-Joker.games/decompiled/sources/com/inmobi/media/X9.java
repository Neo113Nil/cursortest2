package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class X9 implements Yh {

    /* renamed from: a, reason: collision with root package name */
    public final String f6946a;
    public InMobiJsonResponse b;

    public X9(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f6946a = content;
        String str = "InMobiJsonPubContent: " + content;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.inmobi.media.Yh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        W9 w9;
        int i;
        X9 x9;
        try {
            if (continuation instanceof W9) {
                w9 = (W9) continuation;
                int i2 = w9.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    w9.d = i2 - Integer.MIN_VALUE;
                    Object obj = w9.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = w9.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        String str = "[AdFlow] parseContent: " + this.f6946a;
                        Intrinsics.checkNotNullParameter(InMobiJsonResponse.class, "clazz");
                        Intrinsics.checkNotNullParameter(InMobiJsonResponse.class, "type");
                        String str2 = this.f6946a;
                        w9.f6928a = this;
                        w9.d = 1;
                        JSONObject jsonObject = new JSONObject(str2);
                        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                        Intrinsics.checkNotNullParameter(InMobiJsonResponse.class, "type");
                        obj = InMobiJsonResponse.class.cast(AbstractC3875lb.a(jsonObject, InMobiJsonResponse.class, null, null));
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        x9 = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        x9 = w9.f6928a;
                        ResultKt.throwOnFailure(obj);
                    }
                    x9.b = (InMobiJsonResponse) obj;
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            x9.b = (InMobiJsonResponse) obj;
            return Unit.INSTANCE;
        } catch (Throwable th) {
            String str3 = "[AdFlow] parseFailed with exception: " + ExceptionsKt.stackTraceToString(th);
            throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4194wk(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Boxing.boxShort((short) (!(th instanceof JSONException) ? th instanceof ClassCastException ? 2310 : 2311 : 2309))))));
        }
        w9 = new W9(this, (ContinuationImpl) continuation);
        Object obj2 = w9.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = w9.d;
    }

    @Override // com.inmobi.media.Yh
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InMobiJsonResponse b() {
        String str = "getContent: " + this.b;
        return this.b;
    }

    @Override // com.inmobi.media.Yh
    public final void a() {
        String str = "validateOrThrow: " + this.f6946a;
        if (this.b == null || this.f6946a.length() == 0) {
            throw new C3572ai(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4194wk(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 3))));
        }
    }
}

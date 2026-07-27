package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.E9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class W0 {

    /* renamed from: a, reason: collision with root package name */
    public static final W0 f6919a = new W0();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        V0 v0;
        int i;
        AdResponse adResponse;
        try {
            if (continuationImpl instanceof V0) {
                v0 = (V0) continuationImpl;
                int i2 = v0.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    v0.c = i2 - Integer.MIN_VALUE;
                    Object obj = v0.f6902a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = v0.c;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        String str2 = "parseAdResponseString: " + str;
                        Intrinsics.checkNotNullParameter(AdResponse.class, "clazz");
                        Intrinsics.checkNotNullParameter(AdResponse.class, "type");
                        v0.c = 1;
                        JSONObject jsonObject = new JSONObject(str);
                        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                        Intrinsics.checkNotNullParameter(AdResponse.class, "type");
                        obj = AdResponse.class.cast(AbstractC3875lb.a(jsonObject, AdResponse.class, null, null));
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    adResponse = (AdResponse) obj;
                    if (adResponse == null) {
                        return adResponse;
                    }
                    throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4194wk(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Boxing.boxShort((short) 2232)))));
                }
            }
            if (i != 0) {
            }
            adResponse = (AdResponse) obj;
            if (adResponse == null) {
            }
        } catch (Exception e) {
            int i3 = !(e instanceof JSONException) ? e instanceof ClassCastException ? 2207 : E9.a.g : 2113;
            e.toString();
            throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4194wk(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Boxing.boxShort((short) i3)))));
        }
        v0 = new V0(this, continuationImpl);
        Object obj2 = v0.f6902a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = v0.c;
    }
}

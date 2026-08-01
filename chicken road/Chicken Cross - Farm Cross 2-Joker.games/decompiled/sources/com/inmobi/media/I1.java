package com.inmobi.media;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class I1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6614a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ P1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I1(Context context, Map map, P1 p1, Continuation continuation) {
        super(2, continuation);
        this.f6614a = context;
        this.b = map;
        this.c = p1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new I1(this.f6614a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((I1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map emptyMap;
        int optInt;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Context context = this.f6614a.getApplicationContext();
        this.c.d = MapsKt.toMap(this.b);
        if (this.c.b.isEmpty()) {
            B1 b1 = this.c.f6772a;
            Intrinsics.checkNotNull(context);
            Intrinsics.checkNotNullParameter(context, "context");
            ConcurrentHashMap concurrentHashMap = Db.b;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            Db a2 = Cb.a(applicationContext, "app_activity_counts");
            Intrinsics.checkNotNullParameter("activity_counts", "key");
            String string = a2.f6510a.getString("activity_counts", null);
            if (string == null) {
                emptyMap = MapsKt.emptyMap();
            } else {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    emptyMap = new LinkedHashMap();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("network_name");
                            Intrinsics.checkNotNull(optString);
                            if (StringsKt.isBlank(optString)) {
                                optString = null;
                            }
                            if (optString != null) {
                                String optString2 = optJSONObject.optString("format");
                                Intrinsics.checkNotNull(optString2);
                                if (StringsKt.isBlank(optString2)) {
                                    optString2 = null;
                                }
                                if (optString2 != null && (optInt = optJSONObject.optInt("count", 0)) > 0) {
                                    emptyMap.put(new C1(optString, optString2), Integer.valueOf(optInt));
                                }
                            }
                        }
                    }
                } catch (JSONException unused) {
                    emptyMap = MapsKt.emptyMap();
                }
            }
            for (Map.Entry entry : emptyMap.entrySet()) {
                C1 c1 = (C1) entry.getKey();
                int intValue = ((Number) entry.getValue()).intValue();
                if (intValue > 0) {
                    this.c.b.put(c1, Boxing.boxInt(intValue));
                }
            }
        }
        B1 b12 = this.c.f6772a;
        Intrinsics.checkNotNull(context);
        B1.a(context, new LinkedHashMap(this.c.b));
        return Unit.INSTANCE;
    }
}

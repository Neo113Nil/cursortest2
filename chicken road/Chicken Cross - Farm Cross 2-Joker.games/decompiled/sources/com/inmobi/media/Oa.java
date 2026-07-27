package com.inmobi.media;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Oa implements La {

    /* renamed from: a, reason: collision with root package name */
    public final Ia f6760a;

    public Oa(Ia incompleteLogData) {
        Intrinsics.checkNotNullParameter(incompleteLogData, "incompleteLogData");
        this.f6760a = incompleteLogData;
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            JSONArray jSONArray = this.f6760a.b;
            Ac logLevel = Ac.c;
            SimpleDateFormat simpleDateFormat = Dc.f6511a;
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scope", "ERROR");
            jSONObject.put("timestamp", Dc.f6511a.format(new Date()));
            jSONObject.put("tag", "IncompleteLogFinalizer");
            jSONObject.put("data", message);
            jSONArray.put(jSONObject);
        } catch (Exception unused) {
            String str = "failed to add - " + message;
        }
    }

    public final void b(String value) {
        Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", "tag");
        Intrinsics.checkNotNullParameter("exitReason", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            this.f6760a.f6623a.put("exitReason", value);
        } catch (Exception unused) {
            String str = "failed to add vital - exitReason = " + value;
        }
    }

    public final Object b() {
        final String str = "IncompleteLogFinalizer";
        Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", "tag");
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = this.f6760a.f6623a;
            Intrinsics.checkNotNullParameter(jSONObject, "<this>");
            if (!Intrinsics.areEqual(jSONObject.toString(), JsonUtils.EMPTY_JSON)) {
                JSONArray jSONArray = this.f6760a.b;
                Intrinsics.checkNotNullParameter(jSONArray, "<this>");
                if (jSONArray.length() != 0) {
                    CoroutineScope coroutineScope = Sc.f6848a;
                    Rc.a(new Function0() { // from class: com.inmobi.media.Oa$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Oa.a(Oa.this, str);
                        }
                    });
                }
            }
            return Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static final Unit a(Oa oa, String str) {
        Ia ia = oa.f6760a;
        JSONObject jSONObject = ia.f6623a;
        JSONArray jSONArray = ia.b;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("vitals", jSONObject);
        jSONObject2.put("log", jSONArray);
        String jSONObject3 = jSONObject2.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
        Tc.a(str, jSONObject3, oa.f6760a.c.f7325a);
        String str2 = oa.f6760a.c.f7325a;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        C4019qc c4019qc = oa.f6760a.c;
        BuildersKt__BuildersKt.runBlocking$default(null, new Na(new C4019qc(str2, timeInMillis, 0, c4019qc.d, true, c4019qc.f), null), 1, null);
        return Unit.INSTANCE;
    }

    public final Object a() {
        try {
            Result.Companion companion = Result.INSTANCE;
            CoroutineScope coroutineScope = Sc.f6848a;
            return Result.m8079constructorimpl(Result.m8078boximpl(Rc.a(new Function0() { // from class: com.inmobi.media.Oa$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Oa.a(Oa.this);
                }
            })));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static final Unit a(Oa oa) {
        Tc.a(oa.f6760a.c.f7325a);
        BuildersKt__BuildersKt.runBlocking$default(null, new Ma(oa, null), 1, null);
        return Unit.INSTANCE;
    }
}

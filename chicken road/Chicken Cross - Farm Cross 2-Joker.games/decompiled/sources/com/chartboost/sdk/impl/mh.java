package com.chartboost.sdk.impl;

import android.util.Base64;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class mh {
    public static final a d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ld f4880a;
    public final qb b;
    public final q1 c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return mh.this.a(null, null, null, null, null, this);
        }
    }

    public mh(ld networkClient, qb macroProcessor, q1 applicationComponent) {
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(macroProcessor, "macroProcessor");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.f4880a = networkClient;
        this.b = macroProcessor;
        this.c = applicationComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.chartboost.sdk.impl.qb] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.chartboost.sdk.impl.jh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.chartboost.sdk.impl.qb] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, jh jhVar, String str4, Continuation continuation) {
        b bVar;
        int i;
        String str5;
        mh mhVar;
        String str6;
        jh jhVar2;
        pd pdVar;
        ?? r3 = jhVar;
        try {
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i2 = bVar.g;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.g = i2 - Integer.MIN_VALUE;
                    b bVar2 = bVar;
                    Object obj = bVar2.e;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = bVar2.g;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        str5 = this.b.a(str, r3, true, false);
                        if (str5 == null) {
                            str5 = str;
                        }
                        if (HttpUrl.INSTANCE.parse(str5) == null) {
                            mb.b("Invalid tracker URL, cannot fire request: eventId=" + jhVar.d() + " URL=" + str5, (Throwable) null, 2, (Object) null);
                            return di.d;
                        }
                        String a2 = (!StringsKt.equals(str2, "POST", true) || str3 == null) ? null : a(this.b.a(str3, r3, false, true), jhVar.c());
                        mb.a("Sending tracker: eventId=" + jhVar.d() + " METHOD=" + str2 + " URL=" + str5, (Throwable) null, 2, (Object) null);
                        if (a2 != null) {
                            mb.a("Processed BODY: " + a2, (Throwable) null, 2, (Object) null);
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("x-monetization-session-id", this.c.h().d());
                        String d2 = this.c.k().k().d();
                        if (d2 != null) {
                            linkedHashMap.put("x-monetization-idfv", d2);
                        }
                        linkedHashMap.put("x-monetization-sdk-version", "9.13.0");
                        try {
                            if (StringsKt.equals(str2, "GET", true)) {
                                ld ldVar = this.f4880a;
                                bVar2.b = this;
                                bVar2.c = r3;
                                bVar2.d = str5;
                                bVar2.g = 1;
                                Object a3 = ldVar.a(str5, linkedHashMap, bVar2);
                                if (a3 != coroutine_suspended) {
                                    str6 = str5;
                                    obj = a3;
                                    jhVar2 = r3;
                                    pdVar = (pd) obj;
                                }
                            } else {
                                if (!StringsKt.equals(str2, "POST", true)) {
                                    mb.b("Unsupported HTTP method '" + str2 + "' for tracker: " + str5, (Throwable) null, 2, (Object) null);
                                    return di.d;
                                }
                                ld ldVar2 = this.f4880a;
                                String str7 = a2 == null ? "" : a2;
                                bVar2.b = this;
                                bVar2.c = r3;
                                bVar2.d = str5;
                                bVar2.g = 2;
                                Object a4 = ldVar2.a(str5, str7, linkedHashMap, str4, bVar2);
                                if (a4 != coroutine_suspended) {
                                    str6 = str5;
                                    obj = a4;
                                    jhVar2 = r3;
                                    pdVar = (pd) obj;
                                }
                            }
                            return coroutine_suspended;
                        } catch (Exception e) {
                            e = e;
                            mhVar = this;
                            mb.b("Unable to fire tracker: " + str5 + ". Exception: " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
                            return mhVar.a(e) ? di.d : di.c;
                        }
                    }
                    if (i == 1) {
                        str6 = (String) bVar2.d;
                        jhVar2 = (jh) bVar2.c;
                        ResultKt.throwOnFailure(obj);
                        pdVar = (pd) obj;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str6 = (String) bVar2.d;
                        jhVar2 = (jh) bVar2.c;
                        ResultKt.throwOnFailure(obj);
                        pdVar = (pd) obj;
                    }
                    if (!pdVar.e()) {
                        mb.a("Successfully sent tracker: eventId=" + jhVar2.d() + " URL=" + str6 + " Status=" + pdVar.d(), (Throwable) null, 2, (Object) null);
                        return di.b;
                    }
                    String d3 = jhVar2.d();
                    int d4 = pdVar.d();
                    Throwable c = pdVar.c();
                    mb.b("Failed tracker: eventId=" + d3 + " URL=" + str6 + " Status=" + d4 + " Error: " + (c != null ? c.getMessage() : null), (Throwable) null, 2, (Object) null);
                    return di.c;
                }
            }
            if (i != 0) {
            }
            if (!pdVar.e()) {
            }
        } catch (Exception e2) {
            e = e2;
            str5 = str3;
            mhVar = r3;
        }
        bVar = new b(continuation);
        b bVar22 = bVar;
        Object obj2 = bVar22.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar22.g;
    }

    public /* synthetic */ mh(ld ldVar, qb qbVar, q1 q1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ldVar, qbVar, (i & 4) != 0 ? b4.b.b() : q1Var);
    }

    public final boolean a(Throwable th) {
        if (th instanceof IllegalArgumentException) {
            return true;
        }
        for (int i = 0; th != null && i < 10; i++) {
            if ((th instanceof MalformedURLException) || (th instanceof URISyntaxException)) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public final String a(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                byte[] bytes = str2.getBytes(UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                jSONObject.put("log_context", Base64.encodeToString(bytes, 2));
                return jSONObject.toString();
            } catch (Exception e) {
                mb.a("Could not inject log_context into body: " + e.getMessage(), (Throwable) null, 2, (Object) null);
            }
        }
        return str;
    }
}

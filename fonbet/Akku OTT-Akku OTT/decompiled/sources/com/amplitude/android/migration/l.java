package com.amplitude.android.migration;

import com.amplitude.core.k;
import com.amplitude.core.utilities.x;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nRemnantDataMigration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemnantDataMigration.kt\ncom/amplitude/android/migration/RemnantDataMigration\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1#2:202\n*E\n"})
/* loaded from: classes3.dex */
public final class l {
    public static final a Companion = new a();
    public final com.amplitude.core.b a;
    public final g b;

    public static final class a {
    }

    public l(com.amplitude.core.b amplitude, g databaseStorage) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(databaseStorage, "databaseStorage");
        this.a = amplitude;
        this.b = databaseStorage;
    }

    public static long a(JSONObject jSONObject) {
        long j = jSONObject.getLong("$rowId");
        jSONObject.put("event_id", j);
        JSONObject optJSONObject = jSONObject.optJSONObject("library");
        if (optJSONObject != null) {
            jSONObject.put("library", optJSONObject.getString("name") + '/' + optJSONObject.getString("version"));
        }
        Object opt = jSONObject.opt(Constants.TIMESTAMP);
        if (opt != null) {
            jSONObject.put("time", opt);
        }
        Object opt2 = jSONObject.opt("uuid");
        if (opt2 != null) {
            jSONObject.put("insert_id", opt2);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("api_properties");
        if (optJSONObject2 != null) {
            Object opt3 = optJSONObject2.opt("androidADID");
            if (opt3 != null) {
                Intrinsics.checkNotNull(opt3);
                jSONObject.put("adid", opt3);
            }
            Object opt4 = optJSONObject2.opt("android_app_set_id");
            if (opt4 != null) {
                Intrinsics.checkNotNull(opt4);
                jSONObject.put("android_app_set_id", opt4);
            }
            Object opt5 = optJSONObject2.opt("productId");
            if (opt5 != null) {
                Intrinsics.checkNotNull(opt5);
                jSONObject.put("productId", opt5);
            }
            Object opt6 = optJSONObject2.opt(FirebaseAnalytics.Param.QUANTITY);
            if (opt6 != null) {
                Intrinsics.checkNotNull(opt6);
                jSONObject.put(FirebaseAnalytics.Param.QUANTITY, opt6);
            }
            Object opt7 = optJSONObject2.opt(FirebaseAnalytics.Param.PRICE);
            if (opt7 != null) {
                Intrinsics.checkNotNull(opt7);
                jSONObject.put(FirebaseAnalytics.Param.PRICE, opt7);
            }
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject(FirebaseAnalytics.Param.LOCATION);
            if (optJSONObject3 != null) {
                Intrinsics.checkNotNull(optJSONObject3);
                Object opt8 = optJSONObject3.opt("lat");
                if (opt8 != null) {
                    Intrinsics.checkNotNull(opt8);
                    jSONObject.put("location_lat", opt8);
                }
                Object opt9 = optJSONObject3.opt("lng");
                if (opt9 != null) {
                    Intrinsics.checkNotNull(opt9);
                    jSONObject.put("location_lng", opt9);
                }
            }
        }
        Object opt10 = jSONObject.opt("$productId");
        if (opt10 != null) {
            jSONObject.put("productId", opt10);
        }
        Object opt11 = jSONObject.opt("$quantity");
        if (opt11 != null) {
            jSONObject.put(FirebaseAnalytics.Param.QUANTITY, opt11);
        }
        Object opt12 = jSONObject.opt("$price");
        if (opt12 != null) {
            jSONObject.put(FirebaseAnalytics.Param.PRICE, opt12);
        }
        Object opt13 = jSONObject.opt("$revenueType");
        if (opt13 != null) {
            jSONObject.put("revenueType", opt13);
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0121, code lost:
    
        if (r10.c(r0) == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x010f, code lost:
    
        if (r10.c(r0) != r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
    
        if (r2.e(r0) != r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        m mVar;
        int i;
        l lVar;
        l lVar2;
        l lVar3;
        if (continuationImpl instanceof m) {
            mVar = (m) continuationImpl;
            int i2 = mVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.e = i2 - Integer.MIN_VALUE;
                Object obj = mVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (mVar.e) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        com.amplitude.core.b bVar = this.a;
                        String f = bVar.j().f(k.a.d);
                        i = (f != null ? StringsKt.toLongOrNull(f) : null) == null ? 1 : 0;
                        g gVar = this.b;
                        try {
                            String s = gVar.s("device_id");
                            String s2 = gVar.s("user_id");
                            if (s != null || s2 != null) {
                                com.amplitude.id.c load = bVar.h().load();
                                if (load.b == null && s != null) {
                                    bVar.h().b(s);
                                }
                                if (load.a == null && s2 != null) {
                                    bVar.h().a(s2);
                                }
                            }
                        } catch (Exception e) {
                            com.amplitude.common.android.b.Companion.getClass();
                            com.amplitude.common.android.b.b.b("device/user id migration failed: " + e.getMessage());
                        }
                        mVar.a = this;
                        mVar.b = i;
                        mVar.e = 1;
                        if (g(mVar) != coroutine_suspended) {
                            lVar = this;
                            if (i != 0) {
                                mVar.a = lVar;
                                mVar.e = 2;
                                if (lVar.f(mVar) != coroutine_suspended) {
                                    lVar2 = lVar;
                                    mVar.a = lVar2;
                                    mVar.e = 3;
                                    break;
                                }
                            }
                            mVar.a = lVar;
                            mVar.e = 4;
                            if (lVar.d(mVar) != coroutine_suspended) {
                                lVar3 = lVar;
                                com.amplitude.core.k j = lVar3.a.j();
                                mVar.a = lVar3;
                                mVar.e = 5;
                                break;
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        i = mVar.b;
                        lVar = mVar.a;
                        ResultKt.throwOnFailure(obj);
                        if (i != 0) {
                        }
                        mVar.a = lVar;
                        mVar.e = 4;
                        if (lVar.d(mVar) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 2:
                        lVar2 = mVar.a;
                        ResultKt.throwOnFailure(obj);
                        mVar.a = lVar2;
                        mVar.e = 3;
                        break;
                    case 3:
                        lVar2 = mVar.a;
                        ResultKt.throwOnFailure(obj);
                        lVar = lVar2;
                        mVar.a = lVar;
                        mVar.e = 4;
                        if (lVar.d(mVar) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 4:
                        lVar3 = mVar.a;
                        ResultKt.throwOnFailure(obj);
                        com.amplitude.core.k j2 = lVar3.a.j();
                        mVar.a = lVar3;
                        mVar.e = 5;
                        break;
                    case 5:
                        lVar3 = mVar.a;
                        ResultKt.throwOnFailure(obj);
                        com.amplitude.core.k g = lVar3.a.g();
                        mVar.a = null;
                        mVar.e = 6;
                        break;
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        mVar = new m(this, continuationImpl);
        Object obj2 = mVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (mVar.e) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22)(1:23))|12|13|14))|26|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        com.amplitude.common.android.b.Companion.getClass();
        com.amplitude.common.android.b.b.b("event migration failed: " + r7.getMessage());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(JSONObject jSONObject, com.amplitude.core.k kVar, Function1 function1, ContinuationImpl continuationImpl) {
        n nVar;
        int i;
        long j;
        Function1 function12;
        if (continuationImpl instanceof n) {
            nVar = (n) continuationImpl;
            int i2 = nVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.e = i2 - Integer.MIN_VALUE;
                Object obj = nVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long a2 = a(jSONObject);
                    com.amplitude.core.events.a f = x.f(jSONObject);
                    nVar.a = (FunctionReferenceImpl) function1;
                    nVar.b = a2;
                    nVar.e = 1;
                    if (kVar.h(f, nVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j = a2;
                    function12 = function1;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = nVar.b;
                    Function1 function13 = (Function1) nVar.a;
                    ResultKt.throwOnFailure(obj);
                    function12 = function13;
                }
                function12.invoke(Boxing.boxLong(j));
                return Unit.INSTANCE;
            }
        }
        nVar = new n(this, continuationImpl);
        Object obj2 = nVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nVar.e;
        if (i != 0) {
        }
        function12.invoke(Boxing.boxLong(j));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:24|25))(4:26|27|3d|32)|12|(3:15|(2:17|18)(1:20)|13)|21|22|23))|40|6|7|(0)(0)|12|(1:13)|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
    
        com.amplitude.common.android.b.Companion.getClass();
        com.amplitude.common.android.b.b.b("events migration failed: " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:13:0x004b, B:15:0x0051, B:27:0x003b, B:28:0x003d, B:31:0x0044, B:32:0x0045, B:36:0x007b, B:30:0x003e), top: B:7:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        o oVar;
        int i;
        AbstractList x;
        l lVar;
        Iterator it;
        if (continuationImpl instanceof o) {
            oVar = (o) continuationImpl;
            int i2 = oVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.e = i2 - Integer.MIN_VALUE;
                Object obj = oVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = oVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    g gVar = this.b;
                    synchronized (gVar) {
                        x = gVar.x("events");
                    }
                    lVar = this;
                    it = x.iterator();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = oVar.b;
                    lVar = oVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    JSONObject jSONObject = (JSONObject) it.next();
                    com.amplitude.core.k j = lVar.a.j();
                    p pVar = new p(1, lVar.b, g.class, "removeEvent", "removeEvent(J)V", 0);
                    oVar.a = lVar;
                    oVar.b = it;
                    oVar.e = 1;
                    if (lVar.c(jSONObject, j, pVar, oVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        oVar = new o(this, continuationImpl);
        Object obj2 = oVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = oVar.e;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:24|25))(4:26|27|3d|32)|12|(3:15|(2:17|18)(1:20)|13)|21|22|23))|40|6|7|(0)(0)|12|(1:13)|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
    
        com.amplitude.common.android.b.Companion.getClass();
        com.amplitude.common.android.b.b.b("identifies migration failed: " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:13:0x004b, B:15:0x0051, B:27:0x003b, B:28:0x003d, B:31:0x0044, B:32:0x0045, B:36:0x007b, B:30:0x003e), top: B:7:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        q qVar;
        int i;
        AbstractList x;
        l lVar;
        Iterator it;
        if (continuationImpl instanceof q) {
            qVar = (q) continuationImpl;
            int i2 = qVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.e = i2 - Integer.MIN_VALUE;
                Object obj = qVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = qVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    g gVar = this.b;
                    synchronized (gVar) {
                        x = gVar.x("identifys");
                    }
                    lVar = this;
                    it = x.iterator();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = qVar.b;
                    lVar = qVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    JSONObject jSONObject = (JSONObject) it.next();
                    com.amplitude.core.k j = lVar.a.j();
                    r rVar = new r(1, lVar.b, g.class, "removeIdentify", "removeIdentify(J)V", 0);
                    qVar.a = lVar;
                    qVar.b = it;
                    qVar.e = 1;
                    if (lVar.c(jSONObject, j, rVar, qVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        qVar = new q(this, continuationImpl);
        Object obj2 = qVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = qVar.e;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:24|25))(4:26|27|3d|34)|12|(3:15|(2:17|18)(1:20)|13)|21|22|23))|43|6|7|(0)(0)|12|(1:13)|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        com.amplitude.common.android.b.Companion.getClass();
        com.amplitude.common.android.b.b.b("intercepted identifies migration failed: " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:13:0x0058, B:15:0x005e, B:27:0x003b, B:28:0x003d, B:33:0x0047, B:34:0x0052, B:36:0x0051, B:39:0x0087, B:30:0x003e, B:32:0x0043, B:35:0x004b), top: B:7:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        s sVar;
        int i;
        List emptyList;
        l lVar;
        Iterator it;
        if (continuationImpl instanceof s) {
            sVar = (s) continuationImpl;
            int i2 = sVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.e = i2 - Integer.MIN_VALUE;
                Object obj = sVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    g gVar = this.b;
                    synchronized (gVar) {
                        emptyList = gVar.d < 4 ? CollectionsKt.emptyList() : gVar.x("identify_interceptor");
                    }
                    lVar = this;
                    it = emptyList.iterator();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = sVar.b;
                    lVar = sVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    JSONObject jSONObject = (JSONObject) it.next();
                    com.amplitude.core.k g = lVar.a.g();
                    t tVar = new t(1, lVar.b, g.class, "removeInterceptedIdentify", "removeInterceptedIdentify(J)V", 0);
                    sVar.a = lVar;
                    sVar.b = it;
                    sVar.e = 1;
                    if (lVar.c(jSONObject, g, tVar, sVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        sVar = new s(this, continuationImpl);
        Object obj2 = sVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sVar.e;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(6:21|22|23|(3:26|(2:29|14)|28)|15|16))(2:30|31))(9:38|39|(1:41)(1:58)|42|(1:44)(1:57)|45|(1:47)(1:56)|48|(5:55|(3:35|(2:37|28)|23)|(3:26|(0)|28)|15|16)(2:51|(2:53|28)(1:54)))|32|(3:35|(0)|23)|(0)|15|16))|61|6|7|(0)(0)|32|(0)|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0041, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012e, code lost:
    
        com.amplitude.common.android.b.Companion.getClass();
        com.amplitude.common.android.b.b.b("session data migration failed: " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0105 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        u uVar;
        int i;
        Long longOrNull;
        Long q;
        Long q2;
        l lVar;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        l lVar2;
        com.amplitude.core.k j;
        k.a aVar;
        String l5;
        com.amplitude.core.k j2;
        k.a aVar2;
        String l6;
        l lVar3;
        g gVar = this.b;
        com.amplitude.core.b bVar = this.a;
        if (continuationImpl instanceof u) {
            uVar = (u) continuationImpl;
            int i2 = uVar.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.j = i2 - Integer.MIN_VALUE;
                Object obj = uVar.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = uVar.j;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    com.amplitude.core.k j3 = bVar.j();
                    k.a aVar3 = k.a.c;
                    String f = j3.f(aVar3);
                    Long longOrNull2 = f != null ? StringsKt.toLongOrNull(f) : null;
                    String f2 = bVar.j().f(k.a.d);
                    longOrNull = f2 != null ? StringsKt.toLongOrNull(f2) : null;
                    String f3 = bVar.j().f(k.a.b);
                    Long longOrNull3 = f3 != null ? StringsKt.toLongOrNull(f3) : null;
                    Long q3 = gVar.q("previous_session_id");
                    q = gVar.q("last_event_time");
                    q2 = gVar.q("last_event_id");
                    if (longOrNull2 != null || q3 == null) {
                        lVar = this;
                        l = longOrNull3;
                        if (longOrNull == null && q != null) {
                            j = lVar.a.j();
                            aVar = k.a.d;
                            l5 = q.toString();
                            uVar.a = lVar;
                            uVar.b = l;
                            uVar.c = q2;
                            uVar.d = null;
                            uVar.e = null;
                            uVar.j = 2;
                            if (j.d(aVar, l5) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            lVar.b.H("last_event_time");
                        }
                        if (l == null) {
                            j2 = lVar.a.j();
                            aVar2 = k.a.b;
                            l6 = q2.toString();
                            uVar.a = lVar;
                            uVar.b = null;
                            uVar.c = null;
                            uVar.d = null;
                            uVar.e = null;
                            uVar.j = 3;
                            if (j2.d(aVar2, l6) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    com.amplitude.core.k j4 = bVar.j();
                    String l7 = q3.toString();
                    uVar.a = this;
                    uVar.b = longOrNull;
                    uVar.c = longOrNull3;
                    uVar.d = q;
                    uVar.e = q2;
                    uVar.j = 1;
                    if (j4.d(aVar3, l7) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    l2 = longOrNull3;
                    l3 = q;
                    l4 = longOrNull;
                    lVar2 = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            lVar3 = uVar.a;
                            ResultKt.throwOnFailure(obj);
                            lVar3.b.H("last_event_id");
                            return Unit.INSTANCE;
                        }
                        q2 = uVar.c;
                        l = uVar.b;
                        lVar = uVar.a;
                        ResultKt.throwOnFailure(obj);
                        lVar.b.H("last_event_time");
                        if (l == null && q2 != null) {
                            j2 = lVar.a.j();
                            aVar2 = k.a.b;
                            l6 = q2.toString();
                            uVar.a = lVar;
                            uVar.b = null;
                            uVar.c = null;
                            uVar.d = null;
                            uVar.e = null;
                            uVar.j = 3;
                            if (j2.d(aVar2, l6) != coroutine_suspended) {
                                lVar3 = lVar;
                                lVar3.b.H("last_event_id");
                            }
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    q2 = uVar.e;
                    l3 = uVar.d;
                    l2 = uVar.c;
                    l4 = uVar.b;
                    lVar2 = uVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                lVar2.b.H("previous_session_id");
                q = l3;
                l = l2;
                lVar = lVar2;
                longOrNull = l4;
                if (longOrNull == null) {
                    j = lVar.a.j();
                    aVar = k.a.d;
                    l5 = q.toString();
                    uVar.a = lVar;
                    uVar.b = l;
                    uVar.c = q2;
                    uVar.d = null;
                    uVar.e = null;
                    uVar.j = 2;
                    if (j.d(aVar, l5) == coroutine_suspended) {
                    }
                    lVar.b.H("last_event_time");
                }
                if (l == null) {
                }
                return Unit.INSTANCE;
            }
        }
        uVar = new u(this, continuationImpl);
        Object obj2 = uVar.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = uVar.j;
        if (i != 0) {
        }
        lVar2.b.H("previous_session_id");
        q = l3;
        l = l2;
        lVar = lVar2;
        longOrNull = l4;
        if (longOrNull == null) {
        }
        if (l == null) {
        }
        return Unit.INSTANCE;
    }
}

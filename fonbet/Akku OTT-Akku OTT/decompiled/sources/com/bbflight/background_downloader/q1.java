package com.bbflight.background_downloader;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.bbflight.background_downloader.C0639d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1082i;
import kotlinx.serialization.internal.C1126a0;
import kotlinx.serialization.json.b;

@SourceDebugExtension({"SMAP\nTaskWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskWorker.kt\ncom/bbflight/background_downloader/TaskWorkerKt\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,856:1\n96#2:857\n1#3:858\n*S KotlinDebug\n*F\n+ 1 TaskWorker.kt\ncom/bbflight/background_downloader/TaskWorkerKt\n*L\n809#1:857\n*E\n"})
/* loaded from: classes3.dex */
public final class q1 {
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b9, code lost:
    
        if (r15 == r1) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r4v12, types: [T, com.bbflight.background_downloader.M0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [T, com.bbflight.background_downloader.M0] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, com.bbflight.background_downloader.M0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Context context, M0 m0, ContinuationImpl continuationImpl) {
        n1 n1Var;
        int i;
        Ref.ObjectRef objectRef;
        C0639d c0639d;
        Context context2;
        Ref.ObjectRef objectRef2;
        T t;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        M0 m02;
        ?? r4;
        T0 t0;
        C0639d c0639d2;
        int collectionSizeOrDefault;
        Object obj;
        if (continuationImpl instanceof n1) {
            n1Var = (n1) continuationImpl;
            int i2 = n1Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n1Var.i = i2 - Integer.MIN_VALUE;
                Object obj2 = n1Var.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = n1Var.i;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    objectRef = new Ref.ObjectRef();
                    T0 t02 = m0.x;
                    c0639d = t02 != null ? t02.c : null;
                    if (c0639d != null) {
                        C0639d.b bVar = C0639d.Companion;
                        Long l = c0639d.d;
                        if (l != null) {
                            if (System.currentTimeMillis() + 10000 > l.longValue() && c0639d.i != null) {
                                kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
                                kotlinx.coroutines.scheduling.b bVar2 = kotlinx.coroutines.scheduling.b.a;
                                o1 o1Var = new o1(context, m0, null);
                                n1Var.a = context;
                                n1Var.b = m0;
                                n1Var.c = objectRef;
                                n1Var.d = SpillingKt.nullOutSpilledVariable(c0639d);
                                n1Var.e = objectRef;
                                n1Var.i = 1;
                                Object f = C1082i.f(o1Var, bVar2, n1Var);
                                if (f != coroutine_suspended) {
                                    context2 = context;
                                    objectRef2 = objectRef;
                                    t = f;
                                    objectRef3 = objectRef2;
                                }
                                return coroutine_suspended;
                            }
                        }
                        m02 = (M0) objectRef.element;
                        r4 = m02;
                        if (m02 == null) {
                            r4 = m0;
                        }
                        objectRef.element = r4;
                        t0 = r4.x;
                        if (t0 != null || (c0639d2 = t0.c) == null) {
                            return r4;
                        }
                        String url = r4.b;
                        LinkedHashMap queryParams = c0639d2.a(c0639d2.c);
                        Intrinsics.checkNotNullParameter(url, "url");
                        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
                        Uri parse = Uri.parse(url);
                        if (queryParams.isEmpty()) {
                            Intrinsics.checkNotNull(parse);
                        } else {
                            Set<String> queryParameterNames = parse.getQueryParameterNames();
                            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
                            Set<String> set = queryParameterNames;
                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10);
                            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault), 16));
                            for (Object obj3 : set) {
                                linkedHashMap.put(obj3, parse.getQueryParameter((String) obj3));
                            }
                            Map mutableMap = MapsKt.toMutableMap(linkedHashMap);
                            mutableMap.putAll(queryParams);
                            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                            for (Map.Entry entry : mutableMap.entrySet()) {
                                clearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                            }
                            parse = clearQuery.build();
                            Intrinsics.checkNotNullExpressionValue(parse, "build(...)");
                        }
                        Map mutableMap2 = MapsKt.toMutableMap(((M0) objectRef.element).e);
                        mutableMap2.putAll(c0639d2.a(c0639d2.b));
                        objectRef.element = M0.a((M0) objectRef.element, parse.toString(), null, mutableMap2, 33554413);
                    }
                    M0 m03 = m0;
                    Context context3 = context;
                    objectRef4 = objectRef;
                    M0 m04 = (M0) objectRef4.element;
                    ?? r42 = m04;
                    if (m04 == null) {
                        r42 = m03;
                    }
                    objectRef4.element = r42;
                    T0 t03 = m03.x;
                    if (t03 == null || t03.a == null) {
                        return r42;
                    }
                    String str = r42.a;
                    kotlinx.coroutines.scheduling.c cVar2 = C1049c0.a;
                    kotlinx.coroutines.scheduling.b bVar3 = kotlinx.coroutines.scheduling.b.a;
                    p1 p1Var = new p1(context3, objectRef4, null);
                    n1Var.a = SpillingKt.nullOutSpilledVariable(context3);
                    n1Var.b = SpillingKt.nullOutSpilledVariable(m03);
                    n1Var.c = objectRef4;
                    n1Var.d = SpillingKt.nullOutSpilledVariable(c0639d);
                    n1Var.e = null;
                    n1Var.i = 2;
                    Object f2 = C1082i.f(p1Var, bVar3, n1Var);
                    obj = f2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        objectRef4 = n1Var.c;
                        ResultKt.throwOnFailure(obj2);
                        obj = obj2;
                        M0 m05 = (M0) obj;
                        return m05 == null ? (M0) objectRef4.element : m05;
                    }
                    objectRef2 = n1Var.e;
                    C0639d c0639d3 = (C0639d) n1Var.d;
                    Ref.ObjectRef objectRef5 = n1Var.c;
                    M0 m06 = (M0) n1Var.b;
                    context2 = (Context) n1Var.a;
                    ResultKt.throwOnFailure(obj2);
                    c0639d = c0639d3;
                    m0 = m06;
                    objectRef3 = objectRef5;
                    t = obj2;
                }
                objectRef2.element = t;
                objectRef = objectRef3;
                context = context2;
                m02 = (M0) objectRef.element;
                r4 = m02;
                if (m02 == null) {
                }
                objectRef.element = r4;
                t0 = r4.x;
                if (t0 != null) {
                }
                return r4;
            }
        }
        n1Var = new n1(continuationImpl);
        Object obj22 = n1Var.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = n1Var.i;
        if (i != 0) {
        }
        objectRef2.element = t;
        objectRef = objectRef3;
        context = context2;
        m02 = (M0) objectRef.element;
        r4 = m02;
        if (m02 == null) {
        }
        objectRef.element = r4;
        t0 = r4.x;
        if (t0 != null) {
        }
        return r4;
    }

    public static final Map<String, M0> b(SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        String string = prefs.getString("com.bbflight.background_downloader.taskMap.v2", "{}");
        String str = string != null ? string : "{}";
        b.a aVar = kotlinx.serialization.json.b.d;
        aVar.getClass();
        return (Map) aVar.a(new C1126a0(kotlinx.serialization.internal.S0.a, M0.Companion.serializer()), str);
    }
}

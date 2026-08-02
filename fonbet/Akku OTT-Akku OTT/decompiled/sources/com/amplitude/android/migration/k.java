package com.amplitude.android.migration;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k {
    public final com.amplitude.android.a a;
    public final SharedPreferences b;
    public final com.amplitude.common.a c;
    public final int d;

    public k(com.amplitude.android.a amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        this.a = amplitude;
        com.amplitude.android.h hVar = amplitude.a;
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        this.c = amplitude.i();
        SharedPreferences sharedPreferences = hVar.b.getSharedPreferences("amplitude-android-" + hVar.e, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.b = sharedPreferences;
        this.d = sharedPreferences.getInt("storage_version", 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(5:21|22|23|24|25))(2:32|33))(5:37|38|39|(8:41|(1:43)(1:62)|(5:51|52|(1:54)|55|(1:57)(1:59))|61|52|(0)|55|(0)(0))|63)|34|(2:36|27)|25))|67|6|7|(0)(0)|34|(0)|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0106, code lost:
    
        if (r13.b(r3) == r4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d9, code lost:
    
        if (r13 != r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0039, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1 A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:39:0x005f, B:41:0x0066, B:43:0x0077, B:45:0x008e, B:48:0x0095, B:51:0x009e, B:52:0x00a7, B:54:0x00b1, B:55:0x00c1, B:59:0x00d7), top: B:38:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7 A[Catch: all -> 0x00de, TRY_LEAVE, TryCatch #1 {all -> 0x00de, blocks: (B:39:0x005f, B:41:0x0066, B:43:0x0077, B:45:0x008e, B:48:0x0095, B:51:0x009e, B:52:0x00a7, B:54:0x00b1, B:55:0x00c1, B:59:0x00d7), top: B:38:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.amplitude.android.migration.k] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        j jVar;
        Object coroutine_suspended;
        int i;
        k kVar;
        String str;
        String str2;
        g gVar;
        Object b;
        com.amplitude.android.storage.d dVar;
        k kVar2;
        k kVar3 = "null cannot be cast to non-null type com.amplitude.android.Configuration";
        com.amplitude.android.a amplitude = this.a;
        com.amplitude.android.h hVar = amplitude.a;
        if (continuationImpl instanceof j) {
            jVar = (j) continuationImpl;
            int i2 = jVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.e = i2 - Integer.MIN_VALUE;
                Object obj = jVar.c;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = jVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type com.amplitude.android.Configuration");
                        if (hVar.y) {
                            Intrinsics.checkNotNullParameter(amplitude, "amplitude");
                            LinkedHashMap linkedHashMap = h.a;
                            Intrinsics.checkNotNullParameter(amplitude, "amplitude");
                            Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type com.amplitude.android.Configuration");
                            String str3 = hVar.e;
                            if (str3 != null) {
                                Locale locale = Locale.getDefault();
                                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                                str = str3.toLowerCase(locale);
                                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                            } else {
                                str = null;
                            }
                            if (str != null && str.length() != 0 && !Intrinsics.areEqual(str, "$default_instance")) {
                                str2 = "com.amplitude.api_".concat(str);
                                LinkedHashMap linkedHashMap2 = h.a;
                                gVar = (g) linkedHashMap2.get(str2);
                                if (gVar == null) {
                                    gVar = new g(hVar.b, str2, hVar.h.a(amplitude));
                                    linkedHashMap2.put(str2, gVar);
                                }
                                jVar.a = this;
                                jVar.b = hVar;
                                jVar.e = 1;
                                b = new l(amplitude, gVar).b(jVar);
                                if (b == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    b = Unit.INSTANCE;
                                }
                            }
                            str2 = "com.amplitude.api";
                            LinkedHashMap linkedHashMap22 = h.a;
                            gVar = (g) linkedHashMap22.get(str2);
                            if (gVar == null) {
                            }
                            jVar.a = this;
                            jVar.b = hVar;
                            jVar.e = 1;
                            b = new l(amplitude, gVar).b(jVar);
                            if (b == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            }
                        }
                        kVar = this;
                    } catch (Throwable th) {
                        th = th;
                        kVar3 = this;
                        kVar3.c.b("Failed to migrate storage: " + th.getMessage());
                        return Unit.INSTANCE;
                    }
                } else if (i == 1) {
                    hVar = jVar.b;
                    k kVar4 = jVar.a;
                    ResultKt.throwOnFailure(obj);
                    kVar = kVar4;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        k kVar5 = jVar.a;
                        ResultKt.throwOnFailure(obj);
                        kVar3 = kVar5;
                        SharedPreferences.Editor edit = kVar3.b.edit();
                        com.amplitude.android.storage.j[] jVarArr = com.amplitude.android.storage.j.a;
                        edit.putInt("storage_version", 3).apply();
                        return Unit.INSTANCE;
                    }
                    com.amplitude.android.h hVar2 = jVar.b;
                    k kVar6 = jVar.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        hVar = hVar2;
                        kVar2 = kVar6;
                        com.amplitude.android.storage.f fVar = new com.amplitude.android.storage.f(kVar2.a, hVar);
                        jVar.a = kVar2;
                        jVar.b = null;
                        jVar.e = 3;
                        kVar3 = kVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        kVar3 = kVar6;
                        kVar3.c.b("Failed to migrate storage: " + th.getMessage());
                        return Unit.INSTANCE;
                    }
                }
                dVar = new com.amplitude.android.storage.d(kVar.a, hVar);
                jVar.a = kVar;
                jVar.b = hVar;
                jVar.e = 2;
                kVar2 = kVar;
                if (dVar.b(jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                com.amplitude.android.storage.f fVar2 = new com.amplitude.android.storage.f(kVar2.a, hVar);
                jVar.a = kVar2;
                jVar.b = null;
                jVar.e = 3;
                kVar3 = kVar2;
            }
        }
        jVar = new j(this, continuationImpl);
        Object obj2 = jVar.c;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = jVar.e;
        if (i != 0) {
        }
        dVar = new com.amplitude.android.storage.d(kVar.a, hVar);
        jVar.a = kVar;
        jVar.b = hVar;
        jVar.e = 2;
        kVar2 = kVar;
        if (dVar.b(jVar) == coroutine_suspended) {
        }
        com.amplitude.android.storage.f fVar22 = new com.amplitude.android.storage.f(kVar2.a, hVar);
        jVar.a = kVar2;
        jVar.b = null;
        jVar.e = 3;
        kVar3 = kVar2;
    }
}

package com.facebook.appevents.gps.topics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nGpsTopicsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GpsTopicsManager.kt\ncom/facebook/appevents/gps/topics/GpsTopicsManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n1549#2:115\n1620#2,3:116\n*S KotlinDebug\n*F\n+ 1 GpsTopicsManager.kt\ncom/facebook/appevents/gps/topics/GpsTopicsManager\n*L\n105#1:115\n105#1:116,3\n*E\n"})
/* loaded from: classes3.dex */
public final class a {
    public static final Lazy a;
    public static final AtomicBoolean b;

    /* renamed from: com.facebook.appevents.gps.topics.a$a, reason: collision with other inner class name */
    public static final class C0081a extends Lambda implements Function0<ExecutorService> {
        public static final C0081a a = new C0081a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorService invoke() {
            return Executors.newCachedThreadPool();
        }
    }

    static {
        new a();
        Intrinsics.checkNotNullExpressionValue(a.class.toString(), "GpsTopicsManager::class.java.toString()");
        a = LazyKt.lazy(C0081a.a);
        b = new AtomicBoolean(false);
    }
}

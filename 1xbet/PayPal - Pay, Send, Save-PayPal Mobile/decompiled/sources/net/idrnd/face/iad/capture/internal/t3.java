package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public abstract class t3 {
    public static void a() {
        java.lang.Object m23436constructorimpl;
        java.lang.String[] strArr = {"HACK_APP_PKG", "HACK_CORE_DIR", "HACK_HOST_PKG", "HACK_MODE"};
        java.lang.String[] strArr2 = {"virtual.camera.app"};
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.lang.Runtime.getRuntime().exec("env"));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
            kotlin.jvm.internal.Intrinsics.checkNotNull(m23439exceptionOrNullimpl);
            if (!(m23439exceptionOrNullimpl instanceof java.lang.SecurityException)) {
                throw new net.idrnd.face.iad.capture.internal.q3(m23439exceptionOrNullimpl);
            }
            throw new net.idrnd.face.iad.capture.internal.c0();
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(m23436constructorimpl);
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(((java.lang.Process) m23436constructorimpl).getInputStream()));
        try {
            java.util.List<java.lang.String> readLines = kotlin.io.TextStreamsKt.readLines(bufferedReader);
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(readLines, 10));
            java.util.Iterator<T> it = readLines.iterator();
            while (it.hasNext()) {
                arrayList.add(kotlin.text.StringsKt.split$default((java.lang.CharSequence) it.next(), new java.lang.String[]{"="}, false, 2, 2, (java.lang.Object) null));
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                java.util.List list = (java.util.List) it2.next();
                kotlin.Pair pair = kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.first(list), kotlin.collections.CollectionsKt.last(list));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
            java.util.Set<java.lang.String> keySet = linkedHashMap.keySet();
            if (!(keySet instanceof java.util.Collection) || !keySet.isEmpty()) {
                for (java.lang.String str : keySet) {
                    for (int i = 0; i < 4; i++) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(str, strArr[i])) {
                            throw new net.idrnd.face.iad.capture.internal.g0();
                        }
                    }
                }
            }
            java.lang.String str2 = strArr2[0];
            java.lang.String str3 = (java.lang.String) linkedHashMap.get("LD_PRELOAD");
            if (str3 != null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str3, (java.lang.CharSequence) str2, false, 2, (java.lang.Object) null)) {
                throw new net.idrnd.face.iad.capture.internal.h0();
            }
        } catch (java.lang.Throwable th2) {
            try {
                throw th2;
            } catch (java.lang.Throwable th3) {
                kotlin.io.CloseableKt.closeFinally(bufferedReader, th2);
                throw th3;
            }
        }
    }

    public static boolean a(long j) {
        a();
        return !(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.Math.abs(android.os.SystemClock.elapsedRealtimeNanos() - j)) <= 10000);
    }
}

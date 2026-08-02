package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0000\u001a9\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0004\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a1\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\b\u001a\u00020\u00012\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\t\u001aM\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u0005\"\u0004\b\u0000\u0010\n2\u000e\b\u0004\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0016\b\u0004\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b0\u0000H\u0080\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0007\u001aE\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u0005\"\u0004\b\u0000\u0010\n2\u0006\u0010\b\u001a\u00020\u00012\u0016\b\u0004\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b0\u0000H\u0080\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\t\u001aM\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u0005\"\u0004\b\u0000\u0010\n2\u000e\b\u0004\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0016\b\u0004\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r0\u0000H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0007\u001aC\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u0005\"\u0004\b\u0000\u0010\n2\u0006\u0010\b\u001a\u00020\u00012\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u0000H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function0;", "", "blockNameFn", "", "block", "Lkotlin/Lazy;", "lazyOrFalse", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "blockName", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "T", "", "lazyOrEmptySet", "", "lazyOrEmptyList"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyKt {
    public static final kotlin.Lazy<java.lang.Boolean> lazyOrFalse(final kotlin.jvm.functions.Function0<java.lang.String> function0, final kotlin.jvm.functions.Function0<java.lang.Boolean> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        return kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.camera.camera2.pipe.core.LazyKt$lazyOrFalse$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() {
                boolean z;
                java.lang.String invoke = function0.invoke();
                try {
                    androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                    kotlin.jvm.functions.Function0<java.lang.Boolean> function03 = function02;
                    try {
                        android.os.Trace.beginSection(invoke);
                        z = function03.invoke().booleanValue();
                        android.os.Trace.endSection();
                    } catch (java.lang.Throwable th) {
                        android.os.Trace.endSection();
                        throw th;
                    }
                } catch (java.lang.Throwable unused) {
                    androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            }
        });
    }

    public static final <T> kotlin.Lazy<java.util.Set<T>> lazyOrEmptySet(final kotlin.jvm.functions.Function0<java.lang.String> function0, final kotlin.jvm.functions.Function0<? extends java.util.Set<? extends T>> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        return kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.util.Set<? extends T>>() { // from class: androidx.camera.camera2.pipe.core.LazyKt$lazyOrEmptySet$1
            @Override // kotlin.jvm.functions.Function0
            public final java.util.Set<T> invoke() {
                java.lang.String invoke = function0.invoke();
                try {
                    androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                    kotlin.jvm.functions.Function0<java.util.Set<T>> function03 = function02;
                    try {
                        android.os.Trace.beginSection(invoke);
                        java.util.Set<T> invoke2 = function03.invoke();
                        if (invoke2 == null) {
                            invoke2 = kotlin.collections.SetsKt.emptySet();
                        }
                        return invoke2;
                    } finally {
                        android.os.Trace.endSection();
                    }
                } catch (java.lang.Throwable unused) {
                    androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                    return kotlin.collections.SetsKt.emptySet();
                }
            }
        });
    }

    public static final <T> kotlin.Lazy<java.util.List<T>> lazyOrEmptyList(final kotlin.jvm.functions.Function0<java.lang.String> function0, final kotlin.jvm.functions.Function0<? extends java.util.List<? extends T>> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        return kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.util.List<? extends T>>() { // from class: androidx.camera.camera2.pipe.core.LazyKt$lazyOrEmptyList$1
            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<T> invoke() {
                java.lang.String invoke = function0.invoke();
                try {
                    androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                    kotlin.jvm.functions.Function0<java.util.List<T>> function03 = function02;
                    try {
                        android.os.Trace.beginSection(invoke);
                        java.util.List<T> invoke2 = function03.invoke();
                        if (invoke2 == null) {
                            invoke2 = kotlin.collections.CollectionsKt.emptyList();
                        }
                        return invoke2;
                    } finally {
                        android.os.Trace.endSection();
                    }
                } catch (java.lang.Throwable unused) {
                    androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                    return kotlin.collections.CollectionsKt.emptyList();
                }
            }
        });
    }

    public static final kotlin.Lazy<java.lang.Boolean> lazyOrFalse(final java.lang.String str, final kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.camera.camera2.pipe.core.LazyKt$lazyOrFalse$$inlined$lazyOrFalse$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() {
                boolean z;
                java.lang.String str2 = str;
                try {
                    androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                    kotlin.jvm.functions.Function0 function02 = kotlin.jvm.functions.Function0.this;
                    try {
                        android.os.Trace.beginSection(str2);
                        z = ((java.lang.Boolean) function02.invoke()).booleanValue();
                        android.os.Trace.endSection();
                    } catch (java.lang.Throwable th) {
                        android.os.Trace.endSection();
                        throw th;
                    }
                } catch (java.lang.Throwable unused) {
                    androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            }
        });
    }

    public static final <T> kotlin.Lazy<java.util.Set<T>> lazyOrEmptySet(final java.lang.String str, final kotlin.jvm.functions.Function0<? extends java.util.Set<? extends T>> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.util.Set<? extends T>>() { // from class: androidx.camera.camera2.pipe.core.LazyKt$lazyOrEmptySet$$inlined$lazyOrEmptySet$1
            @Override // kotlin.jvm.functions.Function0
            public final java.util.Set<T> invoke() {
                java.lang.String str2 = str;
                try {
                    androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                    kotlin.jvm.functions.Function0 function02 = kotlin.jvm.functions.Function0.this;
                    try {
                        android.os.Trace.beginSection(str2);
                        java.util.Set<T> set = (java.util.Set) function02.invoke();
                        if (set == null) {
                            set = kotlin.collections.SetsKt.emptySet();
                        }
                        return set;
                    } finally {
                        android.os.Trace.endSection();
                    }
                } catch (java.lang.Throwable unused) {
                    androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                    return kotlin.collections.SetsKt.emptySet();
                }
            }
        });
    }

    public static final <T> kotlin.Lazy<java.util.List<T>> lazyOrEmptyList(final java.lang.String str, final kotlin.jvm.functions.Function0<? extends java.util.List<? extends T>> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.util.List<? extends T>>() { // from class: androidx.camera.camera2.pipe.core.LazyKt$lazyOrEmptyList$$inlined$lazyOrEmptyList$1
            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<T> invoke() {
                java.lang.String str2 = str;
                try {
                    androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                    kotlin.jvm.functions.Function0 function02 = kotlin.jvm.functions.Function0.this;
                    try {
                        android.os.Trace.beginSection(str2);
                        java.util.List<T> list = (java.util.List) function02.invoke();
                        if (list == null) {
                            list = kotlin.collections.CollectionsKt.emptyList();
                        }
                        return list;
                    } finally {
                        android.os.Trace.endSection();
                    }
                } catch (java.lang.Throwable unused) {
                    androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                    return kotlin.collections.CollectionsKt.emptyList();
                }
            }
        });
    }
}

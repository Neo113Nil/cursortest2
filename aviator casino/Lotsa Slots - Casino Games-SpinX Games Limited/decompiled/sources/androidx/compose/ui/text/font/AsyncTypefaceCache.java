package androidx.compose.ui.text.font;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u001f B\u0005¢\u0006\u0002\u0010\u0002J#\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u0012J*\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u0017JH\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u001e\u0010\u0019\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aH\u0086@¢\u0006\u0002\u0010\u001cJ+\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001eH\u0086\bR\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "", "()V", "PermanentFailure", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "Ljava/lang/Object;", "cacheLock", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "permanentCache", "Landroidx/compose/ui/text/caches/SimpleArrayMap;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;", "resultCache", "Landroidx/compose/ui/text/caches/LruCache;", "get", io.ktor.http.ContentType.Font.TYPE, "Landroidx/compose/ui/text/font/Font;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "get-1ASDuI8", "put", "", "result", "forever", "", "runCached", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runCachedBlocking", "Lkotlin/Function0;", "AsyncTypefaceResult", "Key", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AsyncTypefaceCache {
    public static final int $stable = 8;
    private final java.lang.Object PermanentFailure = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4033constructorimpl(null);
    private final androidx.compose.ui.text.caches.LruCache<androidx.compose.ui.text.font.AsyncTypefaceCache.Key, androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult> resultCache = new androidx.compose.ui.text.caches.LruCache<>(16);
    private final androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache.Key, androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult> permanentCache = new androidx.compose.ui.text.caches.SimpleArrayMap<>(0, 1, null);
    private final androidx.compose.ui.text.platform.SynchronizedObject cacheLock = androidx.compose.ui.text.platform.Synchronization_jvmKt.createSynchronizedObject();

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0088\u0001\u0002¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "", "result", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "isPermanentFailure", "", "isPermanentFailure-impl", "(Ljava/lang/Object;)Z", "getResult", "()Ljava/lang/Object;", "equals", "other", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/Object;)I", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class AsyncTypefaceResult {
        private final java.lang.Object result;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult m4032boximpl(java.lang.Object obj) {
            return new androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult(obj);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static java.lang.Object m4033constructorimpl(java.lang.Object obj) {
            return obj;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4034equalsimpl(java.lang.Object obj, java.lang.Object obj2) {
            return (obj2 instanceof androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) && kotlin.jvm.internal.Intrinsics.areEqual(obj, ((androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) obj2).m4039unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4035equalsimpl0(java.lang.Object obj, java.lang.Object obj2) {
            return kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4036hashCodeimpl(java.lang.Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* renamed from: isPermanentFailure-impl, reason: not valid java name */
        public static final boolean m4037isPermanentFailureimpl(java.lang.Object obj) {
            return obj == null;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m4038toStringimpl(java.lang.Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(java.lang.Object obj) {
            return m4034equalsimpl(this.result, obj);
        }

        public int hashCode() {
            return m4036hashCodeimpl(this.result);
        }

        public java.lang.String toString() {
            return m4038toStringimpl(this.result);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ java.lang.Object m4039unboximpl() {
            return this.result;
        }

        private /* synthetic */ AsyncTypefaceResult(java.lang.Object obj) {
            this.result = obj;
        }

        public final java.lang.Object getResult() {
            return this.result;
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;", "", io.ktor.http.ContentType.Font.TYPE, "Landroidx/compose/ui/text/font/Font;", "loaderKey", "(Landroidx/compose/ui/text/font/Font;Ljava/lang/Object;)V", "getFont", "()Landroidx/compose/ui/text/font/Font;", "getLoaderKey", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Key {
        public static final int $stable = 8;
        private final androidx.compose.ui.text.font.Font font;
        private final java.lang.Object loaderKey;

        public static /* synthetic */ androidx.compose.ui.text.font.AsyncTypefaceCache.Key copy$default(androidx.compose.ui.text.font.AsyncTypefaceCache.Key key, androidx.compose.ui.text.font.Font font, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                font = key.font;
            }
            if ((i & 2) != 0) {
                obj = key.loaderKey;
            }
            return key.copy(font, obj);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.ui.text.font.Font getFont() {
            return this.font;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getLoaderKey() {
            return this.loaderKey;
        }

        public final androidx.compose.ui.text.font.AsyncTypefaceCache.Key copy(androidx.compose.ui.text.font.Font font, java.lang.Object loaderKey) {
            return new androidx.compose.ui.text.font.AsyncTypefaceCache.Key(font, loaderKey);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.text.font.AsyncTypefaceCache.Key)) {
                return false;
            }
            androidx.compose.ui.text.font.AsyncTypefaceCache.Key key = (androidx.compose.ui.text.font.AsyncTypefaceCache.Key) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.font, key.font) && kotlin.jvm.internal.Intrinsics.areEqual(this.loaderKey, key.loaderKey);
        }

        public int hashCode() {
            int hashCode = this.font.hashCode() * 31;
            java.lang.Object obj = this.loaderKey;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public java.lang.String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')';
        }

        public Key(androidx.compose.ui.text.font.Font font, java.lang.Object obj) {
            this.font = font;
            this.loaderKey = obj;
        }

        public final androidx.compose.ui.text.font.Font getFont() {
            return this.font;
        }

        public final java.lang.Object getLoaderKey() {
            return this.loaderKey;
        }
    }

    public static /* synthetic */ void put$default(androidx.compose.ui.text.font.AsyncTypefaceCache asyncTypefaceCache, androidx.compose.ui.text.font.Font font, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, java.lang.Object obj, boolean z, int i, java.lang.Object obj2) {
        if ((i & 8) != 0) {
            z = false;
        }
        asyncTypefaceCache.put(font, platformFontLoader, obj, z);
    }

    public final void put(androidx.compose.ui.text.font.Font font, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, java.lang.Object result, boolean forever) {
        androidx.compose.ui.text.font.AsyncTypefaceCache.Key key = new androidx.compose.ui.text.font.AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            try {
                if (result == null) {
                    this.permanentCache.put(key, androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4032boximpl(this.PermanentFailure));
                } else if (forever) {
                    this.permanentCache.put(key, androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4032boximpl(androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4033constructorimpl(result)));
                } else {
                    this.resultCache.put(key, androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4032boximpl(androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4033constructorimpl(result)));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: get-1ASDuI8, reason: not valid java name */
    public final androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult m4031get1ASDuI8(androidx.compose.ui.text.font.Font font, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader) {
        androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult;
        androidx.compose.ui.text.font.AsyncTypefaceCache.Key key = new androidx.compose.ui.text.font.AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            asyncTypefaceResult = this.resultCache.get(key);
            if (asyncTypefaceResult == null) {
                asyncTypefaceResult = this.permanentCache.get(key);
            }
        }
        return asyncTypefaceResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object runCached(androidx.compose.ui.text.font.Font font, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, boolean z, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 asyncTypefaceCache$runCached$1;
        int i;
        androidx.compose.ui.text.font.AsyncTypefaceCache asyncTypefaceCache;
        androidx.compose.ui.text.font.AsyncTypefaceCache.Key key;
        if (continuation instanceof androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1) {
            asyncTypefaceCache$runCached$1 = (androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1) continuation;
            if ((asyncTypefaceCache$runCached$1.label & Integer.MIN_VALUE) != 0) {
                asyncTypefaceCache$runCached$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = asyncTypefaceCache$runCached$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = asyncTypefaceCache$runCached$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.text.font.AsyncTypefaceCache.Key key2 = new androidx.compose.ui.text.font.AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                    synchronized (this.cacheLock) {
                        androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = this.resultCache.get(key2);
                        if (asyncTypefaceResult == null) {
                            asyncTypefaceResult = this.permanentCache.get(key2);
                        }
                        if (asyncTypefaceResult != null) {
                            return asyncTypefaceResult.m4039unboximpl();
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        asyncTypefaceCache$runCached$1.L$0 = this;
                        asyncTypefaceCache$runCached$1.L$1 = key2;
                        asyncTypefaceCache$runCached$1.Z$0 = z;
                        asyncTypefaceCache$runCached$1.label = 1;
                        java.lang.Object invoke = function1.invoke(asyncTypefaceCache$runCached$1);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        asyncTypefaceCache = this;
                        obj = invoke;
                        key = key2;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = asyncTypefaceCache$runCached$1.Z$0;
                    key = (androidx.compose.ui.text.font.AsyncTypefaceCache.Key) asyncTypefaceCache$runCached$1.L$1;
                    asyncTypefaceCache = (androidx.compose.ui.text.font.AsyncTypefaceCache) asyncTypefaceCache$runCached$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        if (obj == null) {
                            asyncTypefaceCache.permanentCache.put(key, androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4032boximpl(asyncTypefaceCache.PermanentFailure));
                        } else if (z) {
                            asyncTypefaceCache.permanentCache.put(key, androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4032boximpl(androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4033constructorimpl(obj)));
                        } else {
                            asyncTypefaceCache.resultCache.put(key, androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4032boximpl(androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4033constructorimpl(obj)));
                        }
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                return obj;
            }
        }
        asyncTypefaceCache$runCached$1 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1(this, continuation);
        java.lang.Object obj2 = asyncTypefaceCache$runCached$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = asyncTypefaceCache$runCached$1.label;
        if (i != 0) {
        }
        synchronized (asyncTypefaceCache.cacheLock) {
        }
    }

    public final java.lang.Object runCachedBlocking(androidx.compose.ui.text.font.Font font, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, kotlin.jvm.functions.Function0<? extends java.lang.Object> block) {
        synchronized (this.cacheLock) {
            try {
                androidx.compose.ui.text.font.AsyncTypefaceCache.Key key = new androidx.compose.ui.text.font.AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) this.resultCache.get(key);
                if (asyncTypefaceResult == null) {
                    asyncTypefaceResult = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) this.permanentCache.get(key);
                }
                if (asyncTypefaceResult != null) {
                    java.lang.Object m4039unboximpl = asyncTypefaceResult.m4039unboximpl();
                    kotlin.jvm.internal.InlineMarker.finallyStart(2);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(2);
                    return m4039unboximpl;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                java.lang.Object invoke = block.invoke();
                put$default(this, font, platformFontLoader, invoke, false, 8, null);
                return invoke;
            } catch (java.lang.Throwable th) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th;
            }
        }
    }
}

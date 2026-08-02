package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010JJ\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u001e\u0010\u0014\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/Font;", io.ktor.http.ContentType.Font.TYPE, "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "result", "", "forever", "", "put", "(Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;Ljava/lang/Object;Z)V", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "get-1ASDuI8", "(Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;)Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "get", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "runCached", "(Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "runCachedBlocking", "(Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Landroidx/collection/LruCache;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;", "getHighSpeedVideoSizes", "Landroidx/collection/LruCache;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "AsyncTypefaceResult", "Key"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AsyncTypefaceCache {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRanges = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m8108constructorimpl(null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.collection.LruCache<androidx.compose.ui.text.font.AsyncTypefaceCache.Key, androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult> getHighResolutionOutputSizeshNQ4ISI = new androidx.collection.LruCache<>(16);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.collection.MutableScatterMap<androidx.compose.ui.text.font.AsyncTypefaceCache.Key, androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult> Camera2StreamConfigurationMap = androidx.collection.ScatterMapKt.mutableScatterMapOf();
    private final androidx.compose.ui.text.platform.SynchronizedObject getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.text.platform.SynchronizedObject();

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\b\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0001"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "", "result", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "isPermanentFailure-impl", "isPermanentFailure"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class AsyncTypefaceResult {
        private final java.lang.Object result;

        /* renamed from: constructor-impl, reason: not valid java name */
        public static java.lang.Object m8108constructorimpl(java.lang.Object obj) {
            return obj;
        }

        /* renamed from: isPermanentFailure-impl, reason: not valid java name */
        public static final boolean m8112isPermanentFailureimpl(java.lang.Object obj) {
            return obj == null;
        }

        private /* synthetic */ AsyncTypefaceResult(java.lang.Object obj) {
            this.result = obj;
        }

        public final java.lang.Object getResult() {
            return this.result;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ java.lang.Object m8114unboximpl() {
            return this.result;
        }

        public final java.lang.String toString() {
            return m8113toStringimpl(this.result);
        }

        public final int hashCode() {
            return m8111hashCodeimpl(this.result);
        }

        public final boolean equals(java.lang.Object other) {
            return m8109equalsimpl(this.result, other);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m8113toStringimpl(java.lang.Object obj) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AsyncTypefaceResult(result=");
            sb.append(obj);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m8111hashCodeimpl(java.lang.Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m8110equalsimpl0(java.lang.Object obj, java.lang.Object obj2) {
            return kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m8109equalsimpl(java.lang.Object obj, java.lang.Object obj2) {
            return (obj2 instanceof androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) && kotlin.jvm.internal.Intrinsics.areEqual(obj, ((androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) obj2).m8114unboximpl());
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult m8107boximpl(java.lang.Object obj) {
            return new androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;", "", "Landroidx/compose/ui/text/font/Font;", io.ktor.http.ContentType.Font.TYPE, "loaderKey", "<init>", "(Landroidx/compose/ui/text/font/Font;Ljava/lang/Object;)V", "component1", "()Landroidx/compose/ui/text/font/Font;", "component2", "()Ljava/lang/Object;", "copy", "(Landroidx/compose/ui/text/font/Font;Ljava/lang/Object;)Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/font/Font;", "getFont", "Ljava/lang/Object;", "getLoaderKey"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Key {
        public static final int $stable = 8;
        private final androidx.compose.ui.text.font.Font font;
        private final java.lang.Object loaderKey;

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

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Key(font=");
            sb.append(this.font);
            sb.append(", loaderKey=");
            sb.append(this.loaderKey);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.font.hashCode();
            java.lang.Object obj = this.loaderKey;
            return (hashCode * 31) + (obj == null ? 0 : obj.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.text.font.AsyncTypefaceCache.Key)) {
                return false;
            }
            androidx.compose.ui.text.font.AsyncTypefaceCache.Key key = (androidx.compose.ui.text.font.AsyncTypefaceCache.Key) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.font, key.font) && kotlin.jvm.internal.Intrinsics.areEqual(this.loaderKey, key.loaderKey);
        }

        public final androidx.compose.ui.text.font.AsyncTypefaceCache.Key copy(androidx.compose.ui.text.font.Font font, java.lang.Object loaderKey) {
            return new androidx.compose.ui.text.font.AsyncTypefaceCache.Key(font, loaderKey);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getLoaderKey() {
            return this.loaderKey;
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.ui.text.font.Font getFont() {
            return this.font;
        }

        public static /* synthetic */ androidx.compose.ui.text.font.AsyncTypefaceCache.Key copy$default(androidx.compose.ui.text.font.AsyncTypefaceCache.Key key, androidx.compose.ui.text.font.Font font, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                font = key.font;
            }
            if ((i & 2) != 0) {
                obj = key.loaderKey;
            }
            return key.copy(font, obj);
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
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            try {
                if (result == null) {
                    this.Camera2StreamConfigurationMap.set(key, androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m8107boximpl(this.getHighSpeedVideoFpsRanges));
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } else if (forever) {
                    this.Camera2StreamConfigurationMap.set(key, androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m8107boximpl(androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m8108constructorimpl(result)));
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI.put(key, androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m8107boximpl(androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m8108constructorimpl(result)));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: get-1ASDuI8, reason: not valid java name */
    public final androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult m8106get1ASDuI8(androidx.compose.ui.text.font.Font font, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader) {
        androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult;
        androidx.compose.ui.text.font.AsyncTypefaceCache.Key key = new androidx.compose.ui.text.font.AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            asyncTypefaceResult = this.getHighResolutionOutputSizeshNQ4ISI.get(key);
            if (asyncTypefaceResult == null) {
                asyncTypefaceResult = this.Camera2StreamConfigurationMap.get(key);
            }
        }
        return asyncTypefaceResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object runCached(androidx.compose.ui.text.font.Font font, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, boolean z, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 asyncTypefaceCache$runCached$1;
        int i;
        androidx.compose.ui.text.font.AsyncTypefaceCache.Key key;
        if (continuation instanceof androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1) {
            asyncTypefaceCache$runCached$1 = (androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1) continuation;
            if ((asyncTypefaceCache$runCached$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                asyncTypefaceCache$runCached$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = asyncTypefaceCache$runCached$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = asyncTypefaceCache$runCached$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.text.font.AsyncTypefaceCache.Key key2 = new androidx.compose.ui.text.font.AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                    synchronized (this.getHighSpeedVideoFpsRangesFor) {
                        androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = this.getHighResolutionOutputSizeshNQ4ISI.get(key2);
                        if (asyncTypefaceResult == null) {
                            asyncTypefaceResult = this.Camera2StreamConfigurationMap.get(key2);
                        }
                        if (asyncTypefaceResult != null) {
                            return asyncTypefaceResult.m8114unboximpl();
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        asyncTypefaceCache$runCached$1.getHighResolutionOutputSizeshNQ4ISI = key2;
                        asyncTypefaceCache$runCached$1.getHighSpeedVideoFpsRangesFor = z;
                        asyncTypefaceCache$runCached$1.Camera2StreamConfigurationMap = 1;
                        java.lang.Object invoke = function1.invoke(asyncTypefaceCache$runCached$1);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = invoke;
                        key = key2;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = asyncTypefaceCache$runCached$1.getHighSpeedVideoFpsRangesFor;
                    key = (androidx.compose.ui.text.font.AsyncTypefaceCache.Key) asyncTypefaceCache$runCached$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                synchronized (this.getHighSpeedVideoFpsRangesFor) {
                    try {
                        if (obj == null) {
                            this.Camera2StreamConfigurationMap.set(key, androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m8107boximpl(this.getHighSpeedVideoFpsRanges));
                        } else if (z) {
                            this.Camera2StreamConfigurationMap.set(key, androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m8107boximpl(androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m8108constructorimpl(obj)));
                        } else {
                            this.getHighResolutionOutputSizeshNQ4ISI.put(key, androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m8107boximpl(androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m8108constructorimpl(obj)));
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
        java.lang.Object obj2 = asyncTypefaceCache$runCached$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = asyncTypefaceCache$runCached$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object runCachedBlocking(androidx.compose.ui.text.font.Font font, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, kotlin.jvm.functions.Function0<? extends java.lang.Object> block) {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            androidx.compose.ui.text.font.AsyncTypefaceCache.Key key = new androidx.compose.ui.text.font.AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
            androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) this.getHighResolutionOutputSizeshNQ4ISI.get(key);
            if (asyncTypefaceResult == null) {
                asyncTypefaceResult = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) this.Camera2StreamConfigurationMap.get(key);
            }
            if (asyncTypefaceResult != null) {
                return asyncTypefaceResult.m8114unboximpl();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            java.lang.Object invoke = block.invoke();
            put$default(this, font, platformFontLoader, invoke, false, 8, null);
            return invoke;
        }
    }
}

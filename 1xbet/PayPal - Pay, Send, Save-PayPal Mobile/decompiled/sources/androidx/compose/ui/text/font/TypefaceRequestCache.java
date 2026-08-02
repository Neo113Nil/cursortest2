package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequestCache;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult;", "", "resolveTypeface", "Landroidx/compose/runtime/State;", "runCached", "(Landroidx/compose/ui/text/font/TypefaceRequest;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/State;", "", "typefaceRequests", "preWarmCache", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "get$ui_text", "(Landroidx/compose/ui/text/font/TypefaceRequest;)Landroidx/compose/ui/text/font/TypefaceResult;", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "lock", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "getLock$ui_text", "()Landroidx/compose/ui/text/platform/SynchronizedObject;", "Landroidx/collection/LruCache;", "getHighSpeedVideoFpsRanges", "Landroidx/collection/LruCache;", "Camera2StreamConfigurationMap", "", "getSize$ui_text", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TypefaceRequestCache {
    public static final int $stable = 8;
    private final androidx.compose.ui.text.platform.SynchronizedObject lock = new androidx.compose.ui.text.platform.SynchronizedObject();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.collection.LruCache<androidx.compose.ui.text.font.TypefaceRequest, androidx.compose.ui.text.font.TypefaceResult> Camera2StreamConfigurationMap = new androidx.collection.LruCache<>(16);

    /* renamed from: getLock$ui_text, reason: from getter */
    public final androidx.compose.ui.text.platform.SynchronizedObject getLock() {
        return this.lock;
    }

    public final androidx.compose.runtime.State<java.lang.Object> runCached(final androidx.compose.ui.text.font.TypefaceRequest typefaceRequest, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceResult, kotlin.Unit>, ? extends androidx.compose.ui.text.font.TypefaceResult> resolveTypeface) {
        synchronized (this.lock) {
            androidx.compose.ui.text.font.TypefaceResult typefaceResult = this.Camera2StreamConfigurationMap.get(typefaceRequest);
            if (typefaceResult != null) {
                if (typefaceResult.getCacheable()) {
                    return typefaceResult;
                }
                this.Camera2StreamConfigurationMap.remove(typefaceRequest);
            }
            try {
                androidx.compose.ui.text.font.TypefaceResult invoke = resolveTypeface.invoke(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.text.font.TypefaceRequestCache$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit highSpeedVideoFpsRangesFor;
                        highSpeedVideoFpsRangesFor = androidx.compose.ui.text.font.TypefaceRequestCache.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.font.TypefaceRequestCache.this, typefaceRequest, (androidx.compose.ui.text.font.TypefaceResult) obj);
                        return highSpeedVideoFpsRangesFor;
                    }
                });
                synchronized (this.lock) {
                    if (this.Camera2StreamConfigurationMap.get(typefaceRequest) == null && invoke.getCacheable()) {
                        this.Camera2StreamConfigurationMap.put(typefaceRequest, invoke);
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                return invoke;
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalStateException("Could not load font", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.font.TypefaceRequestCache typefaceRequestCache, androidx.compose.ui.text.font.TypefaceRequest typefaceRequest, androidx.compose.ui.text.font.TypefaceResult typefaceResult) {
        synchronized (typefaceRequestCache.lock) {
            if (typefaceResult.getCacheable()) {
                typefaceRequestCache.Camera2StreamConfigurationMap.put(typefaceRequest, typefaceResult);
            } else {
                typefaceRequestCache.Camera2StreamConfigurationMap.remove(typefaceRequest);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void preWarmCache(java.util.List<androidx.compose.ui.text.font.TypefaceRequest> typefaceRequests, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceRequest, ? extends androidx.compose.ui.text.font.TypefaceResult> resolveTypeface) {
        androidx.compose.ui.text.font.TypefaceResult typefaceResult;
        int size = typefaceRequests.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.text.font.TypefaceRequest typefaceRequest = typefaceRequests.get(i);
            synchronized (this.lock) {
                typefaceResult = this.Camera2StreamConfigurationMap.get(typefaceRequest);
            }
            if (typefaceResult == null) {
                try {
                    androidx.compose.ui.text.font.TypefaceResult invoke = resolveTypeface.invoke(typefaceRequest);
                    if (invoke instanceof androidx.compose.ui.text.font.TypefaceResult.Async) {
                        continue;
                    } else {
                        synchronized (this.lock) {
                            this.Camera2StreamConfigurationMap.put(typefaceRequest, invoke);
                        }
                    }
                } catch (java.lang.Exception e) {
                    throw new java.lang.IllegalStateException("Could not load font", e);
                }
            }
        }
    }

    public final androidx.compose.ui.text.font.TypefaceResult get$ui_text(androidx.compose.ui.text.font.TypefaceRequest typefaceRequest) {
        androidx.compose.ui.text.font.TypefaceResult typefaceResult;
        synchronized (this.lock) {
            typefaceResult = this.Camera2StreamConfigurationMap.get(typefaceRequest);
        }
        return typefaceResult;
    }

    public final int getSize$ui_text() {
        int size;
        synchronized (this.lock) {
            size = this.Camera2StreamConfigurationMap.size();
        }
        return size;
    }
}

package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001dB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0002\b\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u001aR\u00020\u00000\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolder", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function0;)V", "key", "getContentType", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "index", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "Landroidx/compose/runtime/Composable;", "getContent", "(ILjava/lang/Object;Ljava/lang/Object;)Lkotlin/jvm/functions/Function2;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "getItemProvider", "()Lkotlin/jvm/functions/Function0;", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "getHighSpeedVideoFpsRanges", "Landroidx/collection/MutableScatterMap;", "CachedItemContent"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.saveable.SaveableStateHolder getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent> getHighSpeedVideoFpsRanges = androidx.collection.ScatterMapKt.mutableScatterMapOf();
    private final kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider> itemProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutItemContentFactory(androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder, kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider> function0) {
        this.getHighResolutionOutputSizeshNQ4ISI = saveableStateHolder;
        this.itemProvider = function0;
    }

    public final kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider> getItemProvider() {
        return this.itemProvider;
    }

    public final java.lang.Object getContentType(java.lang.Object key) {
        if (key == null) {
            return null;
        }
        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this.getHighSpeedVideoFpsRanges.get(key);
        if (cachedItemContent != null) {
            return cachedItemContent.getGetHighResolutionOutputSizeshNQ4ISI();
        }
        androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider invoke = this.itemProvider.invoke();
        int index = invoke.getIndex(key);
        if (index != -1) {
            return invoke.getContentType(index);
        }
        return null;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent(int index, java.lang.Object key, java.lang.Object contentType) {
        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this.getHighSpeedVideoFpsRanges.get(key);
        if (cachedItemContent != null && cachedItemContent.getGetHighSpeedVideoFpsRanges() == index && kotlin.jvm.internal.Intrinsics.areEqual(cachedItemContent.getGetHighResolutionOutputSizeshNQ4ISI(), contentType)) {
            return cachedItemContent.getHighSpeedVideoFpsRanges();
        }
        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent cachedItemContent2 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent(index, key, contentType);
        this.getHighSpeedVideoFpsRanges.set(key, cachedItemContent2);
        return cachedItemContent2.getHighSpeedVideoFpsRanges();
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010R$\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0013R#\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\f"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "", "", "p0", "p1", "p2", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;ILjava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getHighResolutionOutputSizeshNQ4ISI", "()Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "Camera2StreamConfigurationMap", "()Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "()I", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    final class CachedItemContent {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private final java.lang.Object getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap;

        public CachedItemContent(int i, java.lang.Object obj, java.lang.Object obj2) {
            this.getHighSpeedVideoFpsRangesFor = obj;
            this.getHighResolutionOutputSizeshNQ4ISI = obj2;
            this.getHighSpeedVideoFpsRanges = i;
        }

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
        public final java.lang.Object getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
        public final int getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges() {
            kotlin.jvm.functions.Function2 function2 = this.Camera2StreamConfigurationMap;
            if (function2 != null) {
                return function2;
            }
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            this.Camera2StreamConfigurationMap = highResolutionOutputSizeshNQ4ISI;
            return highResolutionOutputSizeshNQ4ISI;
        }

        private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI() {
            final androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory lazyLayoutItemContentFactory = androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.this;
            return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(818252804, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.getHighSpeedVideoSizes(androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.this, this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    return highSpeedVideoSizes;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory lazyLayoutItemContentFactory, final androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent cachedItemContent, androidx.compose.runtime.Composer composer, int i) {
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
            } else {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(818252804, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:85)");
                }
                androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider invoke = lazyLayoutItemContentFactory.getItemProvider().invoke();
                int i2 = cachedItemContent.getHighSpeedVideoFpsRanges;
                if ((i2 >= invoke.getItemCount() || !kotlin.jvm.internal.Intrinsics.areEqual(invoke.getKey(i2), cachedItemContent.getHighSpeedVideoFpsRangesFor)) && (i2 = invoke.getIndex(cachedItemContent.getHighSpeedVideoFpsRangesFor)) != -1) {
                    cachedItemContent.getHighSpeedVideoFpsRanges = i2;
                }
                int i3 = i2;
                if (i3 != -1) {
                    composer.startReplaceGroup(-1664741271);
                    androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt.getHighSpeedVideoSizes(invoke, androidx.compose.foundation.lazy.layout.StableValue.getHighSpeedVideoFpsRanges(lazyLayoutItemContentFactory.getHighResolutionOutputSizeshNQ4ISI), i3, androidx.compose.foundation.lazy.layout.StableValue.getHighSpeedVideoFpsRanges(cachedItemContent.getHighSpeedVideoFpsRangesFor), composer, 0);
                } else {
                    composer.startReplaceGroup(-1668376610);
                }
                composer.endReplaceGroup();
                java.lang.Object obj = cachedItemContent.getHighSpeedVideoFpsRangesFor;
                boolean changedInstance = composer.changedInstance(cachedItemContent);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            androidx.compose.runtime.DisposableEffectResult highResolutionOutputSizeshNQ4ISI;
                            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.this);
                            return highResolutionOutputSizeshNQ4ISI;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(obj, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, composer, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.runtime.DisposableEffectResult getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
            return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$lambda$0$0$0$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public final void dispose() {
                    androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.this.Camera2StreamConfigurationMap = null;
                }
            };
        }
    }
}

package androidx.compose.foundation.lazy.layout;

/* compiled from: LazyLayoutItemContentFactory.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J0\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\u0002\b\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\fR\u00020\u00000\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "", "saveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "itemProvider", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function0;)V", "getItemProvider", "()Lkotlin/jvm/functions/Function0;", "lambdasCache", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "getContent", "", "Landroidx/compose/runtime/Composable;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", com.ironsource.X3.i.W, com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "(ILjava/lang/Object;Ljava/lang/Object;)Lkotlin/jvm/functions/Function2;", "getContentType", "CachedItemContent", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory {
    public static final int $stable = 8;
    private final kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider> itemProvider;
    private final java.util.Map<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent> lambdasCache = new java.util.LinkedHashMap();
    private final androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutItemContentFactory(androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder, kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider> function0) {
        this.saveableStateHolder = saveableStateHolder;
        this.itemProvider = function0;
    }

    public final kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider> getItemProvider() {
        return this.itemProvider;
    }

    public final java.lang.Object getContentType(java.lang.Object key) {
        if (key == null) {
            return null;
        }
        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this.lambdasCache.get(key);
        if (cachedItemContent != null) {
            return cachedItemContent.getContentType();
        }
        androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider invoke = this.itemProvider.invoke();
        int index = invoke.getIndex(key);
        if (index != -1) {
            return invoke.getContentType(index);
        }
        return null;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent(int index, java.lang.Object key, java.lang.Object contentType) {
        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this.lambdasCache.get(key);
        if (cachedItemContent != null && cachedItemContent.getIndex() == index && kotlin.jvm.internal.Intrinsics.areEqual(cachedItemContent.getContentType(), contentType)) {
            return cachedItemContent.getContent();
        }
        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent cachedItemContent2 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent(index, key, contentType);
        this.lambdasCache.put(key, cachedItemContent2);
        return cachedItemContent2.getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LazyLayoutItemContentFactory.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0002¢\u0006\u0002\u0010\u000eR\u001d\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u001c\u0010\f\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", com.ironsource.X3.i.W, com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;ILjava/lang/Object;Ljava/lang/Object;)V", "_content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/jvm/functions/Function2;", "content", "getContent", "()Lkotlin/jvm/functions/Function2;", "getContentType", "()Ljava/lang/Object;", "<set-?>", "getIndex", "()I", "getKey", "createContentLambda", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class CachedItemContent {
        private kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> _content;
        private final java.lang.Object contentType;
        private int index;
        private final java.lang.Object key;

        public CachedItemContent(int i, java.lang.Object obj, java.lang.Object obj2) {
            this.key = obj;
            this.contentType = obj2;
            this.index = i;
        }

        public final java.lang.Object getKey() {
            return this.key;
        }

        public final java.lang.Object getContentType() {
            return this.contentType;
        }

        public final int getIndex() {
            return this.index;
        }

        public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent() {
            kotlin.jvm.functions.Function2 function2 = this._content;
            if (function2 != null) {
                return function2;
            }
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> createContentLambda = createContentLambda();
            this._content = createContentLambda;
            return createContentLambda;
        }

        private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> createContentLambda() {
            final androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory lazyLayoutItemContentFactory = androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.this;
            return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1403994769, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    invoke(composer, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer, int i) {
                    androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder;
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C99@3690L258,107@3961L219:LazyLayoutItemContentFactory.kt#wow0x6");
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1403994769, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)");
                        }
                        androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider invoke = androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.this.getItemProvider().invoke();
                        int index = this.getIndex();
                        if ((index >= invoke.getItemCount() || !kotlin.jvm.internal.Intrinsics.areEqual(invoke.getKey(index), this.getKey())) && (index = invoke.getIndex(this.getKey())) != -1) {
                            this.index = index;
                        }
                        int i2 = index;
                        boolean z = i2 != -1;
                        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory lazyLayoutItemContentFactory2 = androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.this;
                        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this;
                        composer.startReusableGroup(207, java.lang.Boolean.valueOf(z));
                        boolean changed = composer.changed(z);
                        if (z) {
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, -1642427978, "C100@3750L184:LazyLayoutItemContentFactory.kt#wow0x6");
                            saveableStateHolder = lazyLayoutItemContentFactory2.saveableStateHolder;
                            androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt.m729SkippableItemJVlU9Rs(invoke, androidx.compose.foundation.lazy.layout.StableValue.m755constructorimpl(saveableStateHolder), i2, androidx.compose.foundation.lazy.layout.StableValue.m755constructorimpl(cachedItemContent.getKey()), composer, 0);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
                        } else {
                            composer.deactivateToEndGroup(changed);
                        }
                        composer.endReusableGroup();
                        java.lang.Object key = this.getKey();
                        final androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent cachedItemContent2 = this;
                        androidx.compose.runtime.EffectsKt.DisposableEffect(key, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1.2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                                final androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent cachedItemContent3 = androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.this;
                                return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.this._content = null;
                                    }
                                };
                            }
                        }, composer, 8);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            });
        }
    }
}

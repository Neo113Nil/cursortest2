package androidx.compose.runtime.tooling;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001b2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/runtime/tooling/CompositionErrorContextImpl;", "Landroidx/compose/runtime/tooling/CompositionErrorContext;", "Landroidx/compose/runtime/changelist/OperationErrorContext;", "Lkotlin/coroutines/CoroutineContext$Element;", "Landroidx/compose/runtime/ComposerImpl;", "composer", "<init>", "(Landroidx/compose/runtime/ComposerImpl;)V", "", "", "composeNode", "", "attachComposeStackTrace", "(Ljava/lang/Throwable;Ljava/lang/Object;)Z", "", "currentOffset", "", "Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "buildStackTrace", "(Ljava/lang/Integer;)Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/ComposerImpl;", "Camera2StreamConfigurationMap", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "Key"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompositionErrorContextImpl implements androidx.compose.runtime.tooling.CompositionErrorContext, androidx.compose.runtime.changelist.OperationErrorContext, kotlin.coroutines.CoroutineContext.Element {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.ComposerImpl Camera2StreamConfigurationMap;

    /* renamed from: Key, reason: from kotlin metadata */
    public static final androidx.compose.runtime.tooling.CompositionErrorContextImpl.Companion INSTANCE = new androidx.compose.runtime.tooling.CompositionErrorContextImpl.Companion(null);
    public static final int $stable = 8;

    public CompositionErrorContextImpl(androidx.compose.runtime.ComposerImpl composerImpl) {
        this.Camera2StreamConfigurationMap = composerImpl;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
        return (R) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        return (E) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // androidx.compose.runtime.tooling.CompositionErrorContext
    public final boolean attachComposeStackTrace(java.lang.Throwable th, final java.lang.Object obj) {
        return androidx.compose.runtime.tooling.ComposeStackTraceKt.tryAttachComposeStackTrace(th, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.tooling.CompositionErrorContextImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.compose.runtime.tooling.ComposeStackTrace Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.runtime.tooling.CompositionErrorContextImpl.Camera2StreamConfigurationMap(androidx.compose.runtime.tooling.CompositionErrorContextImpl.this, obj);
                return Camera2StreamConfigurationMap;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.tooling.ComposeStackTrace Camera2StreamConfigurationMap(androidx.compose.runtime.tooling.CompositionErrorContextImpl compositionErrorContextImpl, java.lang.Object obj) {
        return compositionErrorContextImpl.Camera2StreamConfigurationMap.stackTraceForValue$runtime(obj);
    }

    @Override // androidx.compose.runtime.changelist.OperationErrorContext
    public final java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> buildStackTrace(java.lang.Integer currentOffset) {
        return this.Camera2StreamConfigurationMap.parentStackTrace();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/runtime/tooling/CompositionErrorContextImpl$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/runtime/tooling/CompositionErrorContextImpl;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.tooling.CompositionErrorContextImpl$Key, reason: from kotlin metadata */
    public static final class Companion implements kotlin.coroutines.CoroutineContext.Key<androidx.compose.runtime.tooling.CompositionErrorContextImpl> {
        private Companion() {
        }

        public final java.lang.String toString() {
            return "CompositionErrorContext";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.CoroutineContext.Key<?> getKey() {
        return INSTANCE;
    }
}

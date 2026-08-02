package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/datastore/core/UpdatingDataContextElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "parent", "Landroidx/datastore/core/DataStoreImpl;", "instance", "<init>", "(Landroidx/datastore/core/UpdatingDataContextElement;Landroidx/datastore/core/DataStoreImpl;)V", "Landroidx/datastore/core/DataStore;", "candidate", "", "checkNotUpdating", "(Landroidx/datastore/core/DataStore;)V", "getHighSpeedVideoFpsRanges", "Landroidx/datastore/core/UpdatingDataContextElement;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Landroidx/datastore/core/DataStoreImpl;", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpdatingDataContextElement implements kotlin.coroutines.CoroutineContext.Element {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.content.core.UpdatingDataContextElement.Companion INSTANCE = new androidx.content.core.UpdatingDataContextElement.Companion(null);
    private static final java.lang.String NESTED_UPDATE_ERROR_MESSAGE = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.content.core.UpdatingDataContextElement getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.content.core.DataStoreImpl<?> getHighSpeedVideoFpsRanges;

    public UpdatingDataContextElement(androidx.content.core.UpdatingDataContextElement updatingDataContextElement, androidx.content.core.DataStoreImpl<?> dataStoreImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStoreImpl, "");
        this.getHighResolutionOutputSizeshNQ4ISI = updatingDataContextElement;
        this.getHighSpeedVideoFpsRanges = dataStoreImpl;
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

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/datastore/core/UpdatingDataContextElement$Companion;", "", "<init>", "()V", "", "NESTED_UPDATE_ERROR_MESSAGE", "Ljava/lang/String;", "getNESTED_UPDATE_ERROR_MESSAGE$datastore_core", "()Ljava/lang/String;", "Key"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getNESTED_UPDATE_ERROR_MESSAGE$datastore_core() {
            return androidx.content.core.UpdatingDataContextElement.NESTED_UPDATE_ERROR_MESSAGE;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/datastore/core/UpdatingDataContextElement$Companion$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/datastore/core/UpdatingDataContextElement;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Key implements kotlin.coroutines.CoroutineContext.Key<androidx.content.core.UpdatingDataContextElement> {
            public static final androidx.datastore.core.UpdatingDataContextElement.Companion.Key INSTANCE = new androidx.datastore.core.UpdatingDataContextElement.Companion.Key();

            private Key() {
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void checkNotUpdating(androidx.content.core.DataStore<?> candidate) {
        androidx.content.core.UpdatingDataContextElement updatingDataContextElement = this;
        do {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candidate, "");
            if (updatingDataContextElement.getHighSpeedVideoFpsRanges == candidate) {
                throw new java.lang.IllegalStateException(NESTED_UPDATE_ERROR_MESSAGE.toString());
            }
            updatingDataContextElement = updatingDataContextElement.getHighResolutionOutputSizeshNQ4ISI;
        } while (updatingDataContextElement != null);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.CoroutineContext.Key<?> getKey() {
        return androidx.datastore.core.UpdatingDataContextElement.Companion.Key.INSTANCE;
    }
}

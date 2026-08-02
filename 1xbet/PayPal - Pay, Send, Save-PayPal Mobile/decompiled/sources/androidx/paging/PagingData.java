package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 \u001d*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u001dBE\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b0\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/paging/PagingData;", "", "T", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PageEvent;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Landroidx/paging/UiReceiver;", "uiReceiver", "Landroidx/paging/HintReceiver;", "hintReceiver", "Lkotlin/Function0;", "Landroidx/paging/PageEvent$Insert;", "cachedPageEvent", "<init>", "(Lkotlinx/coroutines/flow/Flow;Landroidx/paging/UiReceiver;Landroidx/paging/HintReceiver;Lkotlin/jvm/functions/Function0;)V", "cachedEvent$paging_common", "()Landroidx/paging/PageEvent$Insert;", "Lkotlinx/coroutines/flow/Flow;", "getFlow$paging_common", "()Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/UiReceiver;", "getUiReceiver$paging_common", "()Landroidx/paging/UiReceiver;", "Landroidx/paging/HintReceiver;", "getHintReceiver$paging_common", "()Landroidx/paging/HintReceiver;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagingData<T> {
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<T>> flow;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<androidx.paging.PageEvent.Insert<T>> getHighSpeedVideoFpsRanges;
    private final androidx.paging.HintReceiver hintReceiver;
    private final androidx.paging.UiReceiver uiReceiver;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.paging.PagingData.Companion INSTANCE = new androidx.paging.PagingData.Companion(null);
    private static final androidx.paging.UiReceiver NOOP_UI_RECEIVER = new androidx.paging.UiReceiver() { // from class: androidx.paging.PagingData$Companion$NOOP_UI_RECEIVER$1
        @Override // androidx.paging.UiReceiver
        public final void refresh() {
        }

        @Override // androidx.paging.UiReceiver
        public final void retry() {
        }
    };
    private static final androidx.paging.HintReceiver NOOP_HINT_RECEIVER = new androidx.paging.HintReceiver() { // from class: androidx.paging.PagingData$Companion$NOOP_HINT_RECEIVER$1
        @Override // androidx.paging.HintReceiver
        public final void accessHint(androidx.paging.ViewportHint viewportHint) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewportHint, "");
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public PagingData(kotlinx.coroutines.flow.Flow<? extends androidx.paging.PageEvent<T>> flow, androidx.paging.UiReceiver uiReceiver, androidx.paging.HintReceiver hintReceiver, kotlin.jvm.functions.Function0<androidx.paging.PageEvent.Insert<T>> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiReceiver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hintReceiver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.flow = flow;
        this.uiReceiver = uiReceiver;
        this.hintReceiver = hintReceiver;
        this.getHighSpeedVideoFpsRanges = function0;
    }

    public final kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<T>> getFlow$paging_common() {
        return this.flow;
    }

    /* renamed from: getUiReceiver$paging_common, reason: from getter */
    public final androidx.paging.UiReceiver getUiReceiver() {
        return this.uiReceiver;
    }

    /* renamed from: getHintReceiver$paging_common, reason: from getter */
    public final androidx.paging.HintReceiver getHintReceiver() {
        return this.hintReceiver;
    }

    public /* synthetic */ PagingData(kotlinx.coroutines.flow.Flow flow, androidx.paging.UiReceiver uiReceiver, androidx.paging.HintReceiver hintReceiver, androidx.paging.PagingData.AnonymousClass1 anonymousClass1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(flow, uiReceiver, hintReceiver, (i & 8) != 0 ? new kotlin.jvm.functions.Function0() { // from class: androidx.paging.PagingData.1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
                return null;
            }
        } : anonymousClass1);
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0006\u0010\u000bJA\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012JU\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/paging/PagingData$Companion;", "", "<init>", "()V", "T", "Landroidx/paging/PagingData;", "empty", "()Landroidx/paging/PagingData;", "Landroidx/paging/LoadStates;", "sourceLoadStates", "mediatorLoadStates", "(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PagingData;", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "placeholdersBefore", "placeholdersAfter", "from", "(Ljava/util/List;II)Landroidx/paging/PagingData;", "(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;II)Landroidx/paging/PagingData;", "Landroidx/paging/UiReceiver;", "NOOP_UI_RECEIVER", "Landroidx/paging/UiReceiver;", "getNOOP_UI_RECEIVER$paging_common", "()Landroidx/paging/UiReceiver;", "Landroidx/paging/HintReceiver;", "NOOP_HINT_RECEIVER", "Landroidx/paging/HintReceiver;", "getNOOP_HINT_RECEIVER$paging_common", "()Landroidx/paging/HintReceiver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public final androidx.paging.UiReceiver getNOOP_UI_RECEIVER$paging_common() {
            return androidx.paging.PagingData.NOOP_UI_RECEIVER;
        }

        public final androidx.paging.HintReceiver getNOOP_HINT_RECEIVER$paging_common() {
            return androidx.paging.PagingData.NOOP_HINT_RECEIVER;
        }

        @kotlin.jvm.JvmStatic
        public final <T> androidx.paging.PagingData<T> empty() {
            return new androidx.paging.PagingData<>(kotlinx.coroutines.flow.FlowKt.flowOf(new androidx.paging.PageEvent.StaticList(kotlin.collections.CollectionsKt.emptyList(), null, null, 0, 0, 24, null)), getNOOP_UI_RECEIVER$paging_common(), getNOOP_HINT_RECEIVER$paging_common(), new kotlin.jvm.functions.Function0() { // from class: androidx.paging.PagingData$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.paging.PageEvent.Insert Refresh;
                    Refresh = androidx.paging.PageEvent.Insert.INSTANCE.Refresh(kotlin.collections.CollectionsKt.listOf(new androidx.paging.TransformablePage(0, kotlin.collections.CollectionsKt.emptyList())), 0, 0, androidx.paging.LoadStates.INSTANCE.getIDLE(), null);
                    return Refresh;
                }
            });
        }

        public static /* synthetic */ androidx.paging.PagingData empty$default(androidx.paging.PagingData.Companion companion, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                loadStates2 = null;
            }
            return companion.empty(loadStates, loadStates2);
        }

        @kotlin.jvm.JvmStatic
        public final <T> androidx.paging.PagingData<T> empty(final androidx.paging.LoadStates sourceLoadStates, final androidx.paging.LoadStates mediatorLoadStates) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceLoadStates, "");
            return new androidx.paging.PagingData<>(kotlinx.coroutines.flow.FlowKt.flowOf(new androidx.paging.PageEvent.StaticList(kotlin.collections.CollectionsKt.emptyList(), sourceLoadStates, mediatorLoadStates, 0, 0, 24, null)), getNOOP_UI_RECEIVER$paging_common(), getNOOP_HINT_RECEIVER$paging_common(), new kotlin.jvm.functions.Function0() { // from class: androidx.paging.PagingData$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.paging.PageEvent.Insert Refresh;
                    Refresh = androidx.paging.PageEvent.Insert.INSTANCE.Refresh(kotlin.collections.CollectionsKt.listOf(new androidx.paging.TransformablePage(0, kotlin.collections.CollectionsKt.emptyList())), 0, 0, androidx.paging.LoadStates.this, mediatorLoadStates);
                    return Refresh;
                }
            });
        }

        public static /* synthetic */ androidx.paging.PagingData from$default(androidx.paging.PagingData.Companion companion, java.util.List list, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = 0;
            }
            return companion.from(list, i, i2);
        }

        @kotlin.jvm.JvmStatic
        public final <T> androidx.paging.PagingData<T> from(final java.util.List<? extends T> data, final int placeholdersBefore, final int placeholdersAfter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new androidx.paging.PagingData<>(kotlinx.coroutines.flow.FlowKt.flowOf(new androidx.paging.PageEvent.StaticList(data, null, null, placeholdersBefore, placeholdersAfter)), getNOOP_UI_RECEIVER$paging_common(), getNOOP_HINT_RECEIVER$paging_common(), new kotlin.jvm.functions.Function0() { // from class: androidx.paging.PagingData$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.paging.PageEvent.Insert Refresh;
                    Refresh = androidx.paging.PageEvent.Insert.INSTANCE.Refresh(kotlin.collections.CollectionsKt.listOf(new androidx.paging.TransformablePage(0, data)), placeholdersBefore, placeholdersAfter, androidx.paging.LoadStates.INSTANCE.getIDLE(), null);
                    return Refresh;
                }
            });
        }

        public static /* synthetic */ androidx.paging.PagingData from$default(androidx.paging.PagingData.Companion companion, java.util.List list, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 4) != 0) {
                loadStates2 = null;
            }
            return companion.from(list, loadStates, loadStates2, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
        }

        @kotlin.jvm.JvmStatic
        public final <T> androidx.paging.PagingData<T> from(final java.util.List<? extends T> data, final androidx.paging.LoadStates sourceLoadStates, final androidx.paging.LoadStates mediatorLoadStates, final int placeholdersBefore, final int placeholdersAfter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceLoadStates, "");
            return new androidx.paging.PagingData<>(kotlinx.coroutines.flow.FlowKt.flowOf(new androidx.paging.PageEvent.StaticList(data, sourceLoadStates, mediatorLoadStates, placeholdersBefore, placeholdersAfter)), getNOOP_UI_RECEIVER$paging_common(), getNOOP_HINT_RECEIVER$paging_common(), new kotlin.jvm.functions.Function0() { // from class: androidx.paging.PagingData$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.paging.PageEvent.Insert Refresh;
                    Refresh = androidx.paging.PageEvent.Insert.INSTANCE.Refresh(kotlin.collections.CollectionsKt.listOf(new androidx.paging.TransformablePage(0, data)), placeholdersBefore, placeholdersAfter, sourceLoadStates, mediatorLoadStates);
                    return Refresh;
                }
            });
        }

        @kotlin.jvm.JvmStatic
        public final <T> androidx.paging.PagingData<T> from(java.util.List<? extends T> list, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadStates, "");
            return from$default(this, list, loadStates, loadStates2, i, 0, 16, null);
        }

        @kotlin.jvm.JvmStatic
        public final <T> androidx.paging.PagingData<T> from(java.util.List<? extends T> list, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadStates, "");
            return from$default(this, list, loadStates, loadStates2, 0, 0, 24, null);
        }

        @kotlin.jvm.JvmStatic
        public final <T> androidx.paging.PagingData<T> from(java.util.List<? extends T> list, androidx.paging.LoadStates loadStates) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadStates, "");
            return from$default(this, list, loadStates, null, 0, 0, 28, null);
        }

        @kotlin.jvm.JvmStatic
        public final <T> androidx.paging.PagingData<T> from(java.util.List<? extends T> list, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            return from$default(this, list, i, 0, 4, null);
        }

        @kotlin.jvm.JvmStatic
        public final <T> androidx.paging.PagingData<T> from(java.util.List<? extends T> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            return from$default(this, list, 0, 0, 6, null);
        }

        @kotlin.jvm.JvmStatic
        public final <T> androidx.paging.PagingData<T> empty(androidx.paging.LoadStates loadStates) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadStates, "");
            return empty$default(this, loadStates, null, 2, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final androidx.paging.PageEvent.Insert<T> cachedEvent$paging_common() {
        return this.getHighSpeedVideoFpsRanges.invoke();
    }

    @kotlin.jvm.JvmStatic
    public static final <T> androidx.paging.PagingData<T> from(java.util.List<? extends T> list, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2, int i, int i2) {
        return INSTANCE.from(list, loadStates, loadStates2, i, i2);
    }

    @kotlin.jvm.JvmStatic
    public static final <T> androidx.paging.PagingData<T> from(java.util.List<? extends T> list, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2, int i) {
        return INSTANCE.from(list, loadStates, loadStates2, i);
    }

    @kotlin.jvm.JvmStatic
    public static final <T> androidx.paging.PagingData<T> from(java.util.List<? extends T> list, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2) {
        return INSTANCE.from(list, loadStates, loadStates2);
    }

    @kotlin.jvm.JvmStatic
    public static final <T> androidx.paging.PagingData<T> from(java.util.List<? extends T> list, androidx.paging.LoadStates loadStates) {
        return INSTANCE.from(list, loadStates);
    }

    @kotlin.jvm.JvmStatic
    public static final <T> androidx.paging.PagingData<T> from(java.util.List<? extends T> list, int i, int i2) {
        return INSTANCE.from(list, i, i2);
    }

    @kotlin.jvm.JvmStatic
    public static final <T> androidx.paging.PagingData<T> from(java.util.List<? extends T> list, int i) {
        return INSTANCE.from(list, i);
    }

    @kotlin.jvm.JvmStatic
    public static final <T> androidx.paging.PagingData<T> from(java.util.List<? extends T> list) {
        return INSTANCE.from(list);
    }

    @kotlin.jvm.JvmStatic
    public static final <T> androidx.paging.PagingData<T> empty(androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2) {
        return INSTANCE.empty(loadStates, loadStates2);
    }

    @kotlin.jvm.JvmStatic
    public static final <T> androidx.paging.PagingData<T> empty(androidx.paging.LoadStates loadStates) {
        return INSTANCE.empty(loadStates);
    }

    @kotlin.jvm.JvmStatic
    public static final <T> androidx.paging.PagingData<T> empty() {
        return INSTANCE.empty();
    }
}

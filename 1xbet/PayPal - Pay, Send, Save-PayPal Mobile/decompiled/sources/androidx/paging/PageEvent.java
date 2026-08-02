package androidx.paging;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004JD\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0005*\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJJ\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0005*\u00020\u00012(\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0096@¢\u0006\u0004\b\f\u0010\nJ:\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\n\u0082\u0001\u0004\u0014\u0015\u0016\u0017"}, d2 = {"Landroidx/paging/PageEvent;", "", "T", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "transform", "map", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "flatMap", "", "predicate", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "StaticList", "Insert", "Drop", "LoadStateUpdate", "Landroidx/paging/PageEvent$Drop;", "Landroidx/paging/PageEvent$Insert;", "Landroidx/paging/PageEvent$LoadStateUpdate;", "Landroidx/paging/PageEvent$StaticList;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class PageEvent<T> {
    public java.lang.Object filter(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<T>> continuation) {
        return this;
    }

    private PageEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003BA\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJD\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\b\b\u0002\u0010\u000e*\u00020\u00012\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013JJ\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\b\b\u0002\u0010\u000e*\u00020\u00012(\u0010\u0011\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00140\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0096@¢\u0006\u0004\b\u0015\u0010\u0013J:\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0096@¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010\"JR\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b)\u0010\"R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b.\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\"R\u001a\u0010\u000b\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b1\u0010\""}, d2 = {"Landroidx/paging/PageEvent$StaticList;", "", "T", "Landroidx/paging/PageEvent;", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/paging/LoadStates;", "sourceLoadStates", "mediatorLoadStates", "", "placeholdersBefore", "placeholdersAfter", "<init>", "(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;II)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "transform", "map", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "flatMap", "", "predicate", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/util/List;", "component2", "()Landroidx/paging/LoadStates;", "component3", "component4", "()I", "component5", "copy", "(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;II)Landroidx/paging/PageEvent$StaticList;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Ljava/util/List;", "getData", "Landroidx/paging/LoadStates;", "getSourceLoadStates", "getMediatorLoadStates", com.visa.cbp.getEncExpo.warmup, "getPlaceholdersBefore", "getPlaceholdersAfter"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StaticList<T> extends androidx.paging.PageEvent<T> {
        private final java.util.List<T> data;
        private final androidx.paging.LoadStates mediatorLoadStates;
        private final int placeholdersAfter;
        private final int placeholdersBefore;
        private final androidx.paging.LoadStates sourceLoadStates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StaticList(java.util.List<? extends T> list, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2, int i, int i2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.data = list;
            this.sourceLoadStates = loadStates;
            this.mediatorLoadStates = loadStates2;
            this.placeholdersBefore = i;
            this.placeholdersAfter = i2;
        }

        public /* synthetic */ StaticList(java.util.List list, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i3 & 2) != 0 ? null : loadStates, (i3 & 4) != 0 ? null : loadStates2, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
        }

        public final java.util.List<T> getData() {
            return this.data;
        }

        public final androidx.paging.LoadStates getSourceLoadStates() {
            return this.sourceLoadStates;
        }

        public final androidx.paging.LoadStates getMediatorLoadStates() {
            return this.mediatorLoadStates;
        }

        public final int getPlaceholdersBefore() {
            return this.placeholdersBefore;
        }

        public final int getPlaceholdersAfter() {
            return this.placeholdersAfter;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:10:0x007c). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final <R> java.lang.Object map(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>> continuation) {
            androidx.paging.PageEvent$StaticList$map$1 pageEvent$StaticList$map$1;
            int i;
            kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function22;
            java.util.Collection collection;
            java.util.Iterator<T> it;
            if (continuation instanceof androidx.paging.PageEvent$StaticList$map$1) {
                pageEvent$StaticList$map$1 = (androidx.paging.PageEvent$StaticList$map$1) continuation;
                if ((pageEvent$StaticList$map$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    pageEvent$StaticList$map$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = pageEvent$StaticList$map$1.getInputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pageEvent$StaticList$map$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.util.List<T> list = this.data;
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                        java.util.Iterator<T> it2 = list.iterator();
                        function22 = function2;
                        collection = arrayList;
                        it = it2;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        collection = (java.util.Collection) pageEvent$StaticList$map$1.getHighSpeedVideoFpsRanges;
                        it = (java.util.Iterator) pageEvent$StaticList$map$1.getHighSpeedVideoFpsRangesFor;
                        java.util.Collection collection2 = (java.util.Collection) pageEvent$StaticList$map$1.getHighSpeedVideoSizes;
                        kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function23 = (kotlin.jvm.functions.Function2) pageEvent$StaticList$map$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        collection.add(obj);
                        collection = collection2;
                        function22 = function23;
                        if (it.hasNext()) {
                            T next = it.next();
                            pageEvent$StaticList$map$1.Camera2StreamConfigurationMap = function22;
                            pageEvent$StaticList$map$1.getHighSpeedVideoSizes = collection;
                            pageEvent$StaticList$map$1.getHighSpeedVideoFpsRangesFor = it;
                            pageEvent$StaticList$map$1.getHighSpeedVideoFpsRanges = collection;
                            pageEvent$StaticList$map$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            java.lang.Object invoke = function22.invoke(next, pageEvent$StaticList$map$1);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            function23 = function22;
                            obj = invoke;
                            collection2 = collection;
                            collection.add(obj);
                            collection = collection2;
                            function22 = function23;
                            if (it.hasNext()) {
                                return new androidx.paging.PageEvent.StaticList((java.util.List) collection, this.sourceLoadStates, this.mediatorLoadStates, this.placeholdersBefore, this.placeholdersAfter);
                            }
                        }
                    }
                }
            }
            pageEvent$StaticList$map$1 = new androidx.paging.PageEvent$StaticList$map$1(this, continuation);
            java.lang.Object obj2 = pageEvent$StaticList$map$1.getInputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = pageEvent$StaticList$map$1.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006c -> B:10:0x006f). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final <R> java.lang.Object flatMap(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Iterable<? extends R>>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>> continuation) {
            androidx.paging.PageEvent$StaticList$flatMap$1 pageEvent$StaticList$flatMap$1;
            int i;
            java.util.ArrayList arrayList;
            kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Iterable<? extends R>>, ? extends java.lang.Object> function22;
            java.util.Iterator<T> it;
            if (continuation instanceof androidx.paging.PageEvent$StaticList$flatMap$1) {
                pageEvent$StaticList$flatMap$1 = (androidx.paging.PageEvent$StaticList$flatMap$1) continuation;
                if ((pageEvent$StaticList$flatMap$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    pageEvent$StaticList$flatMap$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = pageEvent$StaticList$flatMap$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pageEvent$StaticList$flatMap$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.util.List<T> list = this.data;
                        arrayList = new java.util.ArrayList();
                        java.util.Iterator<T> it2 = list.iterator();
                        function22 = function2;
                        it = it2;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (java.util.Iterator) pageEvent$StaticList$flatMap$1.getHighSpeedVideoSizes;
                        arrayList = (java.util.Collection) pageEvent$StaticList$flatMap$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Iterable<? extends R>>, ? extends java.lang.Object> function23 = (kotlin.jvm.functions.Function2) pageEvent$StaticList$flatMap$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.collections.CollectionsKt.addAll(arrayList, (java.lang.Iterable) obj);
                        function22 = function23;
                        if (it.hasNext()) {
                            T next = it.next();
                            pageEvent$StaticList$flatMap$1.getHighSpeedVideoFpsRanges = function22;
                            pageEvent$StaticList$flatMap$1.getHighSpeedVideoFpsRangesFor = arrayList;
                            pageEvent$StaticList$flatMap$1.getHighSpeedVideoSizes = it;
                            pageEvent$StaticList$flatMap$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            java.lang.Object invoke = function22.invoke(next, pageEvent$StaticList$flatMap$1);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            function23 = function22;
                            obj = invoke;
                            kotlin.collections.CollectionsKt.addAll(arrayList, (java.lang.Iterable) obj);
                            function22 = function23;
                            if (it.hasNext()) {
                                return new androidx.paging.PageEvent.StaticList((java.util.List) arrayList, this.sourceLoadStates, this.mediatorLoadStates, this.placeholdersBefore, this.placeholdersAfter);
                            }
                        }
                    }
                }
            }
            pageEvent$StaticList$flatMap$1 = new androidx.paging.PageEvent$StaticList$flatMap$1(this, continuation);
            java.lang.Object obj2 = pageEvent$StaticList$flatMap$1.Camera2StreamConfigurationMap;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = pageEvent$StaticList$flatMap$1.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006f -> B:10:0x0073). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object filter(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<T>> continuation) {
            androidx.paging.PageEvent$StaticList$filter$1 pageEvent$StaticList$filter$1;
            int i;
            java.util.Collection arrayList;
            java.util.Iterator<T> it;
            if (continuation instanceof androidx.paging.PageEvent$StaticList$filter$1) {
                pageEvent$StaticList$filter$1 = (androidx.paging.PageEvent$StaticList$filter$1) continuation;
                if ((pageEvent$StaticList$filter$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    pageEvent$StaticList$filter$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = pageEvent$StaticList$filter$1.getOutputFormats;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pageEvent$StaticList$filter$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.util.List<T> list = this.data;
                        arrayList = new java.util.ArrayList();
                        it = list.iterator();
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Object obj2 = pageEvent$StaticList$filter$1.getHighResolutionOutputSizeshNQ4ISI;
                        it = (java.util.Iterator) pageEvent$StaticList$filter$1.getHighSpeedVideoFpsRangesFor;
                        arrayList = (java.util.Collection) pageEvent$StaticList$filter$1.Camera2StreamConfigurationMap;
                        kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function22 = (kotlin.jvm.functions.Function2) pageEvent$StaticList$filter$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            arrayList.add(obj2);
                        }
                        function2 = function22;
                        if (it.hasNext()) {
                            java.lang.Object next = it.next();
                            pageEvent$StaticList$filter$1.getHighSpeedVideoFpsRanges = function2;
                            pageEvent$StaticList$filter$1.Camera2StreamConfigurationMap = arrayList;
                            pageEvent$StaticList$filter$1.getHighSpeedVideoFpsRangesFor = it;
                            pageEvent$StaticList$filter$1.getHighResolutionOutputSizeshNQ4ISI = next;
                            pageEvent$StaticList$filter$1.getHighSpeedVideoSizes = 1;
                            java.lang.Object invoke = function2.invoke(next, pageEvent$StaticList$filter$1);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            function22 = function2;
                            obj2 = next;
                            obj = invoke;
                            if (((java.lang.Boolean) obj).booleanValue()) {
                            }
                            function2 = function22;
                            if (it.hasNext()) {
                                return new androidx.paging.PageEvent.StaticList((java.util.List) arrayList, this.sourceLoadStates, this.mediatorLoadStates, this.placeholdersBefore, this.placeholdersAfter);
                            }
                        }
                    }
                }
            }
            pageEvent$StaticList$filter$1 = new androidx.paging.PageEvent$StaticList$filter$1(this, continuation);
            java.lang.Object obj3 = pageEvent$StaticList$filter$1.getOutputFormats;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = pageEvent$StaticList$filter$1.getHighSpeedVideoSizes;
            if (i != 0) {
            }
        }

        public final java.lang.String toString() {
            androidx.paging.LoadStates loadStates = this.mediatorLoadStates;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PageEvent.StaticList with ");
            sb.append(this.data.size());
            sb.append(" items (\n                    |   first item: ");
            sb.append(kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.data));
            sb.append("\n                    |   last item: ");
            sb.append(kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this.data));
            sb.append("\n                    |   sourceLoadStates: ");
            sb.append(this.sourceLoadStates);
            sb.append(",\n                    |   placeholdersBefore: ");
            sb.append(this.placeholdersBefore);
            sb.append(",\n                    |   placeholdersAfter: ");
            sb.append(this.placeholdersAfter);
            sb.append(",\n                    ");
            java.lang.String obj = sb.toString();
            if (loadStates != null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(obj);
                sb2.append("|   mediatorLoadStates: ");
                sb2.append(loadStates);
                sb2.append('\n');
                obj = sb2.toString();
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(obj);
            sb3.append("|)");
            return kotlin.text.StringsKt.trimMargin$default(sb3.toString(), null, 1, null);
        }

        public final int hashCode() {
            int hashCode = this.data.hashCode();
            androidx.paging.LoadStates loadStates = this.sourceLoadStates;
            int hashCode2 = loadStates == null ? 0 : loadStates.hashCode();
            androidx.paging.LoadStates loadStates2 = this.mediatorLoadStates;
            return (((((((hashCode * 31) + hashCode2) * 31) + (loadStates2 != null ? loadStates2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.placeholdersBefore)) * 31) + java.lang.Integer.hashCode(this.placeholdersAfter);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.paging.PageEvent.StaticList)) {
                return false;
            }
            androidx.paging.PageEvent.StaticList staticList = (androidx.paging.PageEvent.StaticList) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, staticList.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.sourceLoadStates, staticList.sourceLoadStates) && kotlin.jvm.internal.Intrinsics.areEqual(this.mediatorLoadStates, staticList.mediatorLoadStates) && this.placeholdersBefore == staticList.placeholdersBefore && this.placeholdersAfter == staticList.placeholdersAfter;
        }

        public final androidx.paging.PageEvent.StaticList<T> copy(java.util.List<? extends T> data, androidx.paging.LoadStates sourceLoadStates, androidx.paging.LoadStates mediatorLoadStates, int placeholdersBefore, int placeholdersAfter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new androidx.paging.PageEvent.StaticList<>(data, sourceLoadStates, mediatorLoadStates, placeholdersBefore, placeholdersAfter);
        }

        /* renamed from: component5, reason: from getter */
        public final int getPlaceholdersAfter() {
            return this.placeholdersAfter;
        }

        /* renamed from: component4, reason: from getter */
        public final int getPlaceholdersBefore() {
            return this.placeholdersBefore;
        }

        /* renamed from: component3, reason: from getter */
        public final androidx.paging.LoadStates getMediatorLoadStates() {
            return this.mediatorLoadStates;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.paging.LoadStates getSourceLoadStates() {
            return this.sourceLoadStates;
        }

        public final java.util.List<T> component1() {
            return this.data;
        }

        public static /* synthetic */ androidx.paging.PageEvent.StaticList copy$default(androidx.paging.PageEvent.StaticList staticList, java.util.List list, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                list = staticList.data;
            }
            if ((i3 & 2) != 0) {
                loadStates = staticList.sourceLoadStates;
            }
            androidx.paging.LoadStates loadStates3 = loadStates;
            if ((i3 & 4) != 0) {
                loadStates2 = staticList.mediatorLoadStates;
            }
            androidx.paging.LoadStates loadStates4 = loadStates2;
            if ((i3 & 8) != 0) {
                i = staticList.placeholdersBefore;
            }
            int i4 = i;
            if ((i3 & 16) != 0) {
                i2 = staticList.placeholdersAfter;
            }
            return staticList.copy(list, loadStates3, loadStates4, i4, i2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\b\u0086\b\u0018\u0000 B*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001BBI\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010JO\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0011*\u00020\u00012*\u0010\u0013\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00070\u00060\u0012H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JD\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\b\b\u0002\u0010\u0011*\u00020\u00012\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019JJ\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\b\b\u0002\u0010\u0011*\u00020\u00012(\u0010\u0013\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u001a0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016H\u0096@¢\u0006\u0004\b\u001b\u0010\u0019J:\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\u001d\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016H\u0096@¢\u0006\u0004\b\u001e\u0010\u0019J\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u001c\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b+\u0010*J`\u00102\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010,\u001a\u00020\u00042\u0014\b\u0002\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00062\b\b\u0002\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020\t2\b\b\u0002\u00100\u001a\u00020\f2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u001c2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b7\u0010'R\u0017\u0010,\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b,\u00108\u001a\u0004\b9\u0010#R&\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010:\u001a\u0004\b;\u0010%R\u001a\u0010.\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010<\u001a\u0004\b=\u0010'R\u001a\u0010/\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010<\u001a\u0004\b>\u0010'R\u001a\u00100\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010?\u001a\u0004\b@\u0010*R\u001c\u00101\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010?\u001a\u0004\bA\u0010*\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/paging/PageEvent$Insert;", "", "T", "Landroidx/paging/PageEvent;", "Landroidx/paging/LoadType;", "p0", "", "Landroidx/paging/TransformablePage;", "p1", "", "p2", "p3", "Landroidx/paging/LoadStates;", "p4", "p5", "<init>", "(Landroidx/paging/LoadType;Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "transform", "transformPages$paging_common", "(Lkotlin/jvm/functions/Function1;)Landroidx/paging/PageEvent$Insert;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "map", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "flatMap", "", "predicate", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "", "toString", "()Ljava/lang/String;", "component1", "()Landroidx/paging/LoadType;", "component2", "()Ljava/util/List;", "component3", "()I", "component4", "component5", "()Landroidx/paging/LoadStates;", "component6", "loadType", "pages", "placeholdersBefore", "placeholdersAfter", "sourceLoadStates", "mediatorLoadStates", "copy", "(Landroidx/paging/LoadType;Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroidx/paging/LoadType;", "getLoadType", "Ljava/util/List;", "getPages", com.visa.cbp.getEncExpo.warmup, "getPlaceholdersBefore", "getPlaceholdersAfter", "Landroidx/paging/LoadStates;", "getSourceLoadStates", "getMediatorLoadStates", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Insert<T> extends androidx.paging.PageEvent<T> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.paging.PageEvent.Insert.Companion INSTANCE;
        private static final androidx.paging.PageEvent.Insert<java.lang.Object> EMPTY_REFRESH_LOCAL;
        private final androidx.paging.LoadType loadType;
        private final androidx.paging.LoadStates mediatorLoadStates;
        private final java.util.List<androidx.paging.TransformablePage<T>> pages;
        private final int placeholdersAfter;
        private final int placeholdersBefore;
        private final androidx.paging.LoadStates sourceLoadStates;

        private Insert(androidx.paging.LoadType loadType, java.util.List<androidx.paging.TransformablePage<T>> list, int i, int i2, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2) {
            super(null);
            this.loadType = loadType;
            this.pages = list;
            this.placeholdersBefore = i;
            this.placeholdersAfter = i2;
            this.sourceLoadStates = loadStates;
            this.mediatorLoadStates = loadStates2;
            if (loadType != androidx.paging.LoadType.APPEND && i < 0) {
                throw new java.lang.IllegalArgumentException("Prepend insert defining placeholdersBefore must be > 0, but was ".concat(java.lang.String.valueOf(i)).toString());
            }
            if (loadType != androidx.paging.LoadType.PREPEND && i2 < 0) {
                throw new java.lang.IllegalArgumentException("Append insert defining placeholdersAfter must be > 0, but was ".concat(java.lang.String.valueOf(i2)).toString());
            }
            if (loadType == androidx.paging.LoadType.REFRESH && list.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
            }
        }

        public final androidx.paging.LoadType getLoadType() {
            return this.loadType;
        }

        public final java.util.List<androidx.paging.TransformablePage<T>> getPages() {
            return this.pages;
        }

        public final int getPlaceholdersBefore() {
            return this.placeholdersBefore;
        }

        public final int getPlaceholdersAfter() {
            return this.placeholdersAfter;
        }

        public final androidx.paging.LoadStates getSourceLoadStates() {
            return this.sourceLoadStates;
        }

        public final androidx.paging.LoadStates getMediatorLoadStates() {
            return this.mediatorLoadStates;
        }

        public final <R> androidx.paging.PageEvent.Insert<R> transformPages$paging_common(kotlin.jvm.functions.Function1<? super java.util.List<androidx.paging.TransformablePage<T>>, ? extends java.util.List<androidx.paging.TransformablePage<R>>> transform) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "");
            return new androidx.paging.PageEvent.Insert<>(getLoadType(), transform.invoke(getPages()), getPlaceholdersBefore(), getPlaceholdersAfter(), getSourceLoadStates(), getMediatorLoadStates(), null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
        /* JADX WARN: Type inference failed for: r13v9, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r7v11, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00e6 -> B:10:0x00ee). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0097 -> B:11:0x00bc). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final <R> java.lang.Object map(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>> continuation) {
            androidx.paging.PageEvent$Insert$map$1 pageEvent$Insert$map$1;
            androidx.paging.PageEvent.Insert<T> insert;
            int i;
            java.util.ArrayList arrayList;
            java.util.Iterator<T> it;
            androidx.paging.LoadType loadType;
            androidx.paging.PageEvent.Insert<T> insert2;
            kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function22;
            if (continuation instanceof androidx.paging.PageEvent$Insert$map$1) {
                pageEvent$Insert$map$1 = (androidx.paging.PageEvent$Insert$map$1) continuation;
                if ((pageEvent$Insert$map$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    pageEvent$Insert$map$1.getOutputSizeshNQ4ISI -= 2147483648;
                    insert = this;
                    java.lang.Object obj = pageEvent$Insert$map$1.getOutputStallDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pageEvent$Insert$map$1.getOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.paging.LoadType loadType2 = getLoadType();
                        java.util.List<androidx.paging.TransformablePage<T>> pages = getPages();
                        arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(pages, 10));
                        it = pages.iterator();
                        loadType = loadType2;
                        insert2 = insert;
                        function22 = function2;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.util.Collection collection = (java.util.Collection) pageEvent$Insert$map$1.getHighSpeedVideoSizes;
                        ?? r7 = (java.util.Collection) pageEvent$Insert$map$1.getOutputStallDuration;
                        java.util.Iterator<T> it2 = (java.util.Iterator) pageEvent$Insert$map$1.getInputSizeshNQ4ISI;
                        ?? r9 = (java.util.Collection) pageEvent$Insert$map$1.getHighSpeedVideoSizesFor;
                        int[] originalPageOffsets = (int[]) pageEvent$Insert$map$1.getOutputMinFrameDuration;
                        androidx.paging.TransformablePage transformablePage = (androidx.paging.TransformablePage) pageEvent$Insert$map$1.getOutputFormats;
                        java.util.Iterator<T> it3 = (java.util.Iterator) pageEvent$Insert$map$1.getInputFormats;
                        ?? r13 = (java.util.Collection) pageEvent$Insert$map$1.getHighSpeedVideoFpsRanges;
                        androidx.paging.LoadType loadType3 = (androidx.paging.LoadType) pageEvent$Insert$map$1.getHighResolutionOutputSizeshNQ4ISI;
                        androidx.paging.PageEvent.Insert<T> insert3 = (androidx.paging.PageEvent.Insert) pageEvent$Insert$map$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function23 = (kotlin.jvm.functions.Function2) pageEvent$Insert$map$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.paging.TransformablePage transformablePage2 = transformablePage;
                        java.util.Iterator<T> it4 = it2;
                        androidx.paging.PageEvent.Insert<T> insert4 = insert3;
                        java.util.ArrayList arrayList2 = r9;
                        androidx.paging.LoadType loadType4 = loadType3;
                        java.util.ArrayList arrayList3 = r7;
                        java.util.ArrayList arrayList4 = r13;
                        arrayList3.add(obj);
                        function22 = function23;
                        java.util.Iterator<T> it5 = it3;
                        java.util.ArrayList arrayList5 = arrayList4;
                        java.util.ArrayList arrayList6 = arrayList2;
                        androidx.paging.TransformablePage transformablePage3 = transformablePage2;
                        if (it4.hasNext()) {
                            java.lang.Object obj2 = (T) it4.next();
                            pageEvent$Insert$map$1.Camera2StreamConfigurationMap = function22;
                            pageEvent$Insert$map$1.getHighSpeedVideoFpsRangesFor = insert4;
                            pageEvent$Insert$map$1.getHighResolutionOutputSizeshNQ4ISI = loadType4;
                            pageEvent$Insert$map$1.getHighSpeedVideoFpsRanges = arrayList5;
                            pageEvent$Insert$map$1.getInputFormats = it5;
                            pageEvent$Insert$map$1.getOutputFormats = transformablePage3;
                            pageEvent$Insert$map$1.getOutputMinFrameDuration = originalPageOffsets;
                            pageEvent$Insert$map$1.getHighSpeedVideoSizesFor = arrayList6;
                            pageEvent$Insert$map$1.getInputSizeshNQ4ISI = it4;
                            pageEvent$Insert$map$1.getOutputStallDuration = arrayList6;
                            pageEvent$Insert$map$1.getHighSpeedVideoSizes = collection;
                            pageEvent$Insert$map$1.getOutputSizeshNQ4ISI = 1;
                            java.lang.Object invoke = function22.invoke(obj2, pageEvent$Insert$map$1);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            transformablePage2 = transformablePage3;
                            arrayList4 = arrayList5;
                            java.util.ArrayList arrayList7 = arrayList6;
                            it3 = it5;
                            function23 = function22;
                            obj = invoke;
                            arrayList2 = arrayList7;
                            arrayList3 = arrayList7;
                            arrayList3.add(obj);
                            function22 = function23;
                            java.util.Iterator<T> it52 = it3;
                            java.util.ArrayList arrayList52 = arrayList4;
                            java.util.ArrayList arrayList62 = arrayList2;
                            androidx.paging.TransformablePage transformablePage32 = transformablePage2;
                            if (it4.hasNext()) {
                                collection.add(new androidx.paging.TransformablePage(originalPageOffsets, arrayList62, transformablePage32.getHintOriginalPageOffset(), transformablePage32.getHintOriginalIndices()));
                                it = it52;
                                arrayList = arrayList52;
                                insert2 = insert4;
                                loadType = loadType4;
                                if (it.hasNext()) {
                                    return new androidx.paging.PageEvent.Insert(loadType, arrayList, insert2.getPlaceholdersBefore(), insert2.getPlaceholdersAfter(), insert2.getSourceLoadStates(), insert2.getMediatorLoadStates(), null);
                                }
                                androidx.paging.TransformablePage transformablePage4 = (androidx.paging.TransformablePage) it.next();
                                originalPageOffsets = transformablePage4.getOriginalPageOffsets();
                                java.util.List<T> data = transformablePage4.getData();
                                arrayList62 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(data, 10));
                                it4 = data.iterator();
                                transformablePage32 = transformablePage4;
                                loadType4 = loadType;
                                insert4 = insert2;
                                arrayList52 = arrayList;
                                it52 = it;
                                collection = arrayList52;
                                if (it4.hasNext()) {
                                }
                            }
                        }
                    }
                }
            }
            insert = this;
            pageEvent$Insert$map$1 = new androidx.paging.PageEvent$Insert$map$1(insert, continuation);
            java.lang.Object obj3 = pageEvent$Insert$map$1.getOutputStallDurationlomOqCM;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = pageEvent$Insert$map$1.getOutputSizeshNQ4ISI;
            if (i != 0) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x012d A[LOOP:0: B:14:0x0123->B:16:0x012d, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
        /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v9, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r14v4, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0101 -> B:10:0x010e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a1 -> B:17:0x00c7). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final <R> java.lang.Object flatMap(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Iterable<? extends R>>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>> continuation) {
            androidx.paging.PageEvent$Insert$flatMap$1 pageEvent$Insert$flatMap$1;
            int i;
            java.util.ArrayList arrayList;
            java.util.Iterator<T> it;
            androidx.paging.PageEvent.Insert<T> insert;
            androidx.paging.LoadType loadType;
            kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Iterable<? extends R>>, ? extends java.lang.Object> function22;
            if (continuation instanceof androidx.paging.PageEvent$Insert$flatMap$1) {
                pageEvent$Insert$flatMap$1 = (androidx.paging.PageEvent$Insert$flatMap$1) continuation;
                if ((pageEvent$Insert$flatMap$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    pageEvent$Insert$flatMap$1.getOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = pageEvent$Insert$flatMap$1.getOutputMinFrameDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pageEvent$Insert$flatMap$1.getOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.paging.LoadType loadType2 = getLoadType();
                        java.util.List<androidx.paging.TransformablePage<T>> pages = getPages();
                        arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(pages, 10));
                        it = pages.iterator();
                        insert = this;
                        loadType = loadType2;
                        function22 = function2;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = pageEvent$Insert$flatMap$1.getHighSpeedVideoFpsRangesFor;
                        int i3 = pageEvent$Insert$flatMap$1.getHighSpeedVideoFpsRanges;
                        java.util.Collection collection = (java.util.Collection) pageEvent$Insert$flatMap$1.Camera2StreamConfigurationMap;
                        java.util.Collection collection2 = (java.util.Collection) pageEvent$Insert$flatMap$1.getOutputStallDurationlomOqCM;
                        java.util.Iterator<T> it2 = (java.util.Iterator) pageEvent$Insert$flatMap$1.getOutputStallDuration;
                        ?? r10 = (java.util.List) pageEvent$Insert$flatMap$1.getOutputSizes;
                        ?? r11 = (java.util.List) pageEvent$Insert$flatMap$1.getInputFormats;
                        androidx.paging.TransformablePage transformablePage = (androidx.paging.TransformablePage) pageEvent$Insert$flatMap$1.getOutputFormats;
                        java.util.Iterator<T> it3 = (java.util.Iterator) pageEvent$Insert$flatMap$1.getHighSpeedVideoSizesFor;
                        ?? r14 = (java.util.Collection) pageEvent$Insert$flatMap$1.getOutputMinFrameDuration;
                        androidx.paging.LoadType loadType3 = (androidx.paging.LoadType) pageEvent$Insert$flatMap$1.getInputSizeshNQ4ISI;
                        androidx.paging.PageEvent.Insert<T> insert2 = (androidx.paging.PageEvent.Insert) pageEvent$Insert$flatMap$1.getHighSpeedVideoSizes;
                        kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Iterable<? extends R>>, ? extends java.lang.Object> function23 = (kotlin.jvm.functions.Function2) pageEvent$Insert$flatMap$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.paging.TransformablePage transformablePage2 = transformablePage;
                        java.util.ArrayList arrayList2 = r10;
                        java.util.Iterator<T> it4 = it2;
                        java.util.ArrayList arrayList3 = r11;
                        int i4 = i2;
                        androidx.paging.PageEvent$Insert$flatMap$1 pageEvent$Insert$flatMap$12 = pageEvent$Insert$flatMap$1;
                        kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Iterable<? extends R>>, ? extends java.lang.Object> function24 = function23;
                        insert = insert2;
                        loadType = loadType3;
                        int i5 = i3;
                        java.util.ArrayList arrayList4 = r14;
                        kotlin.collections.CollectionsKt.addAll(collection2, (java.lang.Iterable) obj);
                        java.util.List<java.lang.Integer> hintOriginalIndices = transformablePage2.getHintOriginalIndices();
                        if (hintOriginalIndices != null) {
                            i4 = hintOriginalIndices.get(i4).intValue();
                        }
                        while (arrayList2.size() < arrayList3.size()) {
                            arrayList2.add(kotlin.coroutines.jvm.internal.Boxing.boxInt(i4));
                        }
                        function22 = function24;
                        pageEvent$Insert$flatMap$1 = pageEvent$Insert$flatMap$12;
                        java.util.ArrayList arrayList5 = arrayList3;
                        java.util.Iterator<T> it5 = it4;
                        java.util.ArrayList arrayList6 = arrayList2;
                        it = it3;
                        arrayList = arrayList4;
                        i4 = i5;
                        androidx.paging.TransformablePage transformablePage3 = transformablePage2;
                        if (it5.hasNext()) {
                            java.lang.Object obj2 = (T) it5.next();
                            int i6 = i4 + 1;
                            if (i4 < 0) {
                                kotlin.collections.CollectionsKt.throwIndexOverflow();
                            }
                            java.util.ArrayList arrayList7 = arrayList5;
                            pageEvent$Insert$flatMap$1.getHighResolutionOutputSizeshNQ4ISI = function22;
                            pageEvent$Insert$flatMap$1.getHighSpeedVideoSizes = insert;
                            pageEvent$Insert$flatMap$1.getInputSizeshNQ4ISI = loadType;
                            pageEvent$Insert$flatMap$1.getOutputMinFrameDuration = arrayList;
                            pageEvent$Insert$flatMap$1.getHighSpeedVideoSizesFor = it;
                            pageEvent$Insert$flatMap$1.getOutputFormats = transformablePage3;
                            pageEvent$Insert$flatMap$1.getInputFormats = arrayList5;
                            pageEvent$Insert$flatMap$1.getOutputSizes = arrayList6;
                            pageEvent$Insert$flatMap$1.getOutputStallDuration = it5;
                            pageEvent$Insert$flatMap$1.getOutputStallDurationlomOqCM = arrayList7;
                            pageEvent$Insert$flatMap$1.Camera2StreamConfigurationMap = collection;
                            pageEvent$Insert$flatMap$1.getHighSpeedVideoFpsRanges = i6;
                            pageEvent$Insert$flatMap$1.getHighSpeedVideoFpsRangesFor = i4;
                            java.util.Iterator<T> it6 = it;
                            pageEvent$Insert$flatMap$1.getOutputSizeshNQ4ISI = 1;
                            java.lang.Object invoke = function22.invoke(obj2, pageEvent$Insert$flatMap$1);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            transformablePage2 = transformablePage3;
                            arrayList2 = arrayList6;
                            it4 = it5;
                            arrayList3 = arrayList5;
                            collection2 = arrayList7;
                            i5 = i6;
                            arrayList4 = arrayList;
                            pageEvent$Insert$flatMap$12 = pageEvent$Insert$flatMap$1;
                            function24 = function22;
                            obj = invoke;
                            it3 = it6;
                            kotlin.collections.CollectionsKt.addAll(collection2, (java.lang.Iterable) obj);
                            java.util.List<java.lang.Integer> hintOriginalIndices2 = transformablePage2.getHintOriginalIndices();
                            if (hintOriginalIndices2 != null) {
                            }
                            while (arrayList2.size() < arrayList3.size()) {
                            }
                            function22 = function24;
                            pageEvent$Insert$flatMap$1 = pageEvent$Insert$flatMap$12;
                            java.util.ArrayList arrayList52 = arrayList3;
                            java.util.Iterator<T> it52 = it4;
                            java.util.ArrayList arrayList62 = arrayList2;
                            it = it3;
                            arrayList = arrayList4;
                            i4 = i5;
                            androidx.paging.TransformablePage transformablePage32 = transformablePage2;
                            if (it52.hasNext()) {
                                collection.add(new androidx.paging.TransformablePage(transformablePage32.getOriginalPageOffsets(), arrayList52, transformablePage32.getHintOriginalPageOffset(), arrayList62));
                                it = it;
                                if (it.hasNext()) {
                                    return new androidx.paging.PageEvent.Insert(loadType, arrayList, insert.getPlaceholdersBefore(), insert.getPlaceholdersAfter(), insert.getSourceLoadStates(), insert.getMediatorLoadStates(), null);
                                }
                                androidx.paging.TransformablePage transformablePage4 = (androidx.paging.TransformablePage) it.next();
                                arrayList52 = new java.util.ArrayList();
                                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                java.util.Iterator<T> it7 = transformablePage4.getData().iterator();
                                i4 = 0;
                                transformablePage32 = transformablePage4;
                                collection = arrayList;
                                arrayList62 = arrayList8;
                                it52 = it7;
                                if (it52.hasNext()) {
                                }
                            }
                        }
                    }
                }
            }
            pageEvent$Insert$flatMap$1 = new androidx.paging.PageEvent$Insert$flatMap$1(this, continuation);
            java.lang.Object obj3 = pageEvent$Insert$flatMap$1.getOutputMinFrameDurationlomOqCM;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = pageEvent$Insert$flatMap$1.getOutputSizeshNQ4ISI;
            if (i != 0) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
        /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r14v4, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f9 -> B:10:0x0106). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009e -> B:17:0x00c4). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object filter(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<T>> continuation) {
            androidx.paging.PageEvent$Insert$filter$1 pageEvent$Insert$filter$1;
            int i;
            java.util.ArrayList arrayList;
            java.util.Iterator<T> it;
            androidx.paging.PageEvent.Insert<T> insert;
            androidx.paging.LoadType loadType;
            kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function22;
            if (continuation instanceof androidx.paging.PageEvent$Insert$filter$1) {
                pageEvent$Insert$filter$1 = (androidx.paging.PageEvent$Insert$filter$1) continuation;
                if ((pageEvent$Insert$filter$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                    pageEvent$Insert$filter$1.getOutputSizes -= 2147483648;
                    java.lang.Object obj = pageEvent$Insert$filter$1.getOutputMinFrameDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pageEvent$Insert$filter$1.getOutputSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.paging.LoadType loadType2 = getLoadType();
                        java.util.List<androidx.paging.TransformablePage<T>> pages = getPages();
                        arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(pages, 10));
                        it = pages.iterator();
                        insert = this;
                        loadType = loadType2;
                        function22 = function2;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = pageEvent$Insert$filter$1.Camera2StreamConfigurationMap;
                        int i3 = pageEvent$Insert$filter$1.getHighSpeedVideoFpsRanges;
                        java.util.Collection collection = (java.util.Collection) pageEvent$Insert$filter$1.getHighSpeedVideoSizes;
                        java.lang.Object obj2 = pageEvent$Insert$filter$1.getOutputStallDurationlomOqCM;
                        java.util.Iterator<T> it2 = (java.util.Iterator) pageEvent$Insert$filter$1.getOutputStallDuration;
                        ?? r10 = (java.util.List) pageEvent$Insert$filter$1.getOutputSizeshNQ4ISI;
                        ?? r11 = (java.util.List) pageEvent$Insert$filter$1.getHighSpeedVideoSizesFor;
                        androidx.paging.TransformablePage transformablePage = (androidx.paging.TransformablePage) pageEvent$Insert$filter$1.getOutputMinFrameDuration;
                        java.util.Iterator<T> it3 = (java.util.Iterator) pageEvent$Insert$filter$1.getInputSizeshNQ4ISI;
                        ?? r14 = (java.util.Collection) pageEvent$Insert$filter$1.getOutputFormats;
                        androidx.paging.LoadType loadType3 = (androidx.paging.LoadType) pageEvent$Insert$filter$1.getInputFormats;
                        androidx.paging.PageEvent.Insert<T> insert2 = (androidx.paging.PageEvent.Insert) pageEvent$Insert$filter$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function23 = (kotlin.jvm.functions.Function2) pageEvent$Insert$filter$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        insert = insert2;
                        loadType = loadType3;
                        androidx.paging.TransformablePage transformablePage2 = transformablePage;
                        int i4 = i3;
                        java.lang.Object obj3 = obj2;
                        java.util.ArrayList arrayList2 = r11;
                        java.util.ArrayList arrayList3 = r10;
                        java.util.Iterator<T> it4 = it2;
                        java.util.ArrayList arrayList4 = r14;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            arrayList2.add(obj3);
                            java.util.List<java.lang.Integer> hintOriginalIndices = transformablePage2.getHintOriginalIndices();
                            if (hintOriginalIndices != null) {
                                i2 = hintOriginalIndices.get(i2).intValue();
                            }
                            arrayList3.add(kotlin.coroutines.jvm.internal.Boxing.boxInt(i2));
                        }
                        function22 = function23;
                        java.util.Iterator<T> it5 = it4;
                        java.util.ArrayList arrayList5 = arrayList3;
                        int i5 = i4;
                        it = it3;
                        arrayList = arrayList4;
                        androidx.paging.TransformablePage transformablePage3 = transformablePage2;
                        if (it5.hasNext()) {
                            java.lang.Object next = it5.next();
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                kotlin.collections.CollectionsKt.throwIndexOverflow();
                            }
                            pageEvent$Insert$filter$1.getHighSpeedVideoFpsRangesFor = function22;
                            pageEvent$Insert$filter$1.getHighResolutionOutputSizeshNQ4ISI = insert;
                            pageEvent$Insert$filter$1.getInputFormats = loadType;
                            pageEvent$Insert$filter$1.getOutputFormats = arrayList;
                            pageEvent$Insert$filter$1.getInputSizeshNQ4ISI = it;
                            pageEvent$Insert$filter$1.getOutputMinFrameDuration = transformablePage3;
                            pageEvent$Insert$filter$1.getHighSpeedVideoSizesFor = arrayList2;
                            pageEvent$Insert$filter$1.getOutputSizeshNQ4ISI = arrayList5;
                            pageEvent$Insert$filter$1.getOutputStallDuration = it5;
                            pageEvent$Insert$filter$1.getOutputStallDurationlomOqCM = next;
                            pageEvent$Insert$filter$1.getHighSpeedVideoSizes = collection;
                            pageEvent$Insert$filter$1.getHighSpeedVideoFpsRanges = i6;
                            pageEvent$Insert$filter$1.Camera2StreamConfigurationMap = i5;
                            pageEvent$Insert$filter$1.getOutputSizes = 1;
                            java.lang.Object invoke = function22.invoke(next, pageEvent$Insert$filter$1);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            java.util.Iterator<T> it6 = it;
                            function23 = function22;
                            obj = invoke;
                            transformablePage2 = transformablePage3;
                            i4 = i6;
                            arrayList4 = arrayList;
                            i2 = i5;
                            arrayList3 = arrayList5;
                            it4 = it5;
                            obj3 = next;
                            it3 = it6;
                            if (((java.lang.Boolean) obj).booleanValue()) {
                            }
                            function22 = function23;
                            java.util.Iterator<T> it52 = it4;
                            java.util.ArrayList arrayList52 = arrayList3;
                            int i52 = i4;
                            it = it3;
                            arrayList = arrayList4;
                            androidx.paging.TransformablePage transformablePage32 = transformablePage2;
                            if (it52.hasNext()) {
                                collection.add(new androidx.paging.TransformablePage(transformablePage32.getOriginalPageOffsets(), arrayList2, transformablePage32.getHintOriginalPageOffset(), arrayList52));
                                if (it.hasNext()) {
                                    return new androidx.paging.PageEvent.Insert(loadType, arrayList, insert.getPlaceholdersBefore(), insert.getPlaceholdersAfter(), insert.getSourceLoadStates(), insert.getMediatorLoadStates(), null);
                                }
                                androidx.paging.TransformablePage transformablePage4 = (androidx.paging.TransformablePage) it.next();
                                arrayList2 = new java.util.ArrayList();
                                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                java.util.Iterator<T> it7 = transformablePage4.getData().iterator();
                                i52 = 0;
                                transformablePage32 = transformablePage4;
                                collection = arrayList;
                                arrayList52 = arrayList6;
                                it52 = it7;
                                if (it52.hasNext()) {
                                }
                            }
                        }
                    }
                }
            }
            pageEvent$Insert$filter$1 = new androidx.paging.PageEvent$Insert$filter$1(this, continuation);
            java.lang.Object obj4 = pageEvent$Insert$filter$1.getOutputMinFrameDurationlomOqCM;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = pageEvent$Insert$filter$1.getOutputSizes;
            if (i != 0) {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000e\"\b\b\u0002\u0010\u0004*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010JM\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u000e\"\b\b\u0002\u0010\u0004*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u000e\"\b\b\u0002\u0010\u0004*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/paging/PageEvent$Insert$Companion;", "", "<init>", "()V", "T", "", "Landroidx/paging/TransformablePage;", "pages", "", "placeholdersBefore", "placeholdersAfter", "Landroidx/paging/LoadStates;", "sourceLoadStates", "mediatorLoadStates", "Landroidx/paging/PageEvent$Insert;", com.google.common.net.HttpHeaders.REFRESH, "(Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;", "Prepend", "(Ljava/util/List;ILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;", "Append", "EMPTY_REFRESH_LOCAL", "Landroidx/paging/PageEvent$Insert;", "getEMPTY_REFRESH_LOCAL", "()Landroidx/paging/PageEvent$Insert;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public static /* synthetic */ androidx.paging.PageEvent.Insert Refresh$default(androidx.paging.PageEvent.Insert.Companion companion, java.util.List list, int i, int i2, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2, int i3, java.lang.Object obj) {
                if ((i3 & 16) != 0) {
                    loadStates2 = null;
                }
                return companion.Refresh(list, i, i2, loadStates, loadStates2);
            }

            public final <T> androidx.paging.PageEvent.Insert<T> Refresh(java.util.List<androidx.paging.TransformablePage<T>> pages, int placeholdersBefore, int placeholdersAfter, androidx.paging.LoadStates sourceLoadStates, androidx.paging.LoadStates mediatorLoadStates) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pages, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceLoadStates, "");
                return new androidx.paging.PageEvent.Insert<>(androidx.paging.LoadType.REFRESH, pages, placeholdersBefore, placeholdersAfter, sourceLoadStates, mediatorLoadStates, null);
            }

            public static /* synthetic */ androidx.paging.PageEvent.Insert Prepend$default(androidx.paging.PageEvent.Insert.Companion companion, java.util.List list, int i, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2, int i2, java.lang.Object obj) {
                if ((i2 & 8) != 0) {
                    loadStates2 = null;
                }
                return companion.Prepend(list, i, loadStates, loadStates2);
            }

            public final <T> androidx.paging.PageEvent.Insert<T> Prepend(java.util.List<androidx.paging.TransformablePage<T>> pages, int placeholdersBefore, androidx.paging.LoadStates sourceLoadStates, androidx.paging.LoadStates mediatorLoadStates) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pages, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceLoadStates, "");
                return new androidx.paging.PageEvent.Insert<>(androidx.paging.LoadType.PREPEND, pages, placeholdersBefore, -1, sourceLoadStates, mediatorLoadStates, null);
            }

            public static /* synthetic */ androidx.paging.PageEvent.Insert Append$default(androidx.paging.PageEvent.Insert.Companion companion, java.util.List list, int i, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2, int i2, java.lang.Object obj) {
                if ((i2 & 8) != 0) {
                    loadStates2 = null;
                }
                return companion.Append(list, i, loadStates, loadStates2);
            }

            public final <T> androidx.paging.PageEvent.Insert<T> Append(java.util.List<androidx.paging.TransformablePage<T>> pages, int placeholdersAfter, androidx.paging.LoadStates sourceLoadStates, androidx.paging.LoadStates mediatorLoadStates) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pages, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceLoadStates, "");
                return new androidx.paging.PageEvent.Insert<>(androidx.paging.LoadType.APPEND, pages, -1, placeholdersAfter, sourceLoadStates, mediatorLoadStates, null);
            }

            public final androidx.paging.PageEvent.Insert<java.lang.Object> getEMPTY_REFRESH_LOCAL() {
                return androidx.paging.PageEvent.Insert.EMPTY_REFRESH_LOCAL;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            androidx.paging.PageEvent.Insert.Companion companion = new androidx.paging.PageEvent.Insert.Companion(null);
            INSTANCE = companion;
            EMPTY_REFRESH_LOCAL = androidx.paging.PageEvent.Insert.Companion.Refresh$default(companion, kotlin.collections.CollectionsKt.listOf(androidx.paging.TransformablePage.INSTANCE.getEMPTY_INITIAL_PAGE()), 0, 0, new androidx.paging.LoadStates(androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common(), androidx.paging.LoadState.NotLoading.INSTANCE.getComplete$paging_common(), androidx.paging.LoadState.NotLoading.INSTANCE.getComplete$paging_common()), null, 16, null);
        }

        public final java.lang.String toString() {
            java.util.List<T> data;
            java.util.List<T> data2;
            java.util.Iterator<T> it = this.pages.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((androidx.paging.TransformablePage) it.next()).getData().size();
            }
            int i2 = this.placeholdersBefore;
            java.lang.String valueOf = i2 != -1 ? java.lang.String.valueOf(i2) : "none";
            int i3 = this.placeholdersAfter;
            java.lang.String valueOf2 = i3 != -1 ? java.lang.String.valueOf(i3) : "none";
            androidx.paging.LoadStates loadStates = this.mediatorLoadStates;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PageEvent.Insert for ");
            sb.append(this.loadType);
            sb.append(", with ");
            sb.append(i);
            sb.append(" items (\n                    |   first item: ");
            androidx.paging.TransformablePage transformablePage = (androidx.paging.TransformablePage) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.pages);
            sb.append((transformablePage == null || (data2 = transformablePage.getData()) == null) ? null : kotlin.collections.CollectionsKt.firstOrNull((java.util.List) data2));
            sb.append("\n                    |   last item: ");
            androidx.paging.TransformablePage transformablePage2 = (androidx.paging.TransformablePage) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this.pages);
            sb.append((transformablePage2 == null || (data = transformablePage2.getData()) == null) ? null : kotlin.collections.CollectionsKt.lastOrNull((java.util.List) data));
            sb.append("\n                    |   placeholdersBefore: ");
            sb.append(valueOf);
            sb.append("\n                    |   placeholdersAfter: ");
            sb.append(valueOf2);
            sb.append("\n                    |   sourceLoadStates: ");
            sb.append(this.sourceLoadStates);
            sb.append("\n                    ");
            java.lang.String obj = sb.toString();
            if (loadStates != null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(obj);
                sb2.append("|   mediatorLoadStates: ");
                sb2.append(loadStates);
                sb2.append('\n');
                obj = sb2.toString();
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(obj);
            sb3.append("|)");
            return kotlin.text.StringsKt.trimMargin$default(sb3.toString(), null, 1, null);
        }

        public final int hashCode() {
            int hashCode = this.loadType.hashCode();
            int hashCode2 = this.pages.hashCode();
            int hashCode3 = java.lang.Integer.hashCode(this.placeholdersBefore);
            int hashCode4 = java.lang.Integer.hashCode(this.placeholdersAfter);
            int hashCode5 = this.sourceLoadStates.hashCode();
            androidx.paging.LoadStates loadStates = this.mediatorLoadStates;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (loadStates == null ? 0 : loadStates.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.paging.PageEvent.Insert)) {
                return false;
            }
            androidx.paging.PageEvent.Insert insert = (androidx.paging.PageEvent.Insert) other;
            return this.loadType == insert.loadType && kotlin.jvm.internal.Intrinsics.areEqual(this.pages, insert.pages) && this.placeholdersBefore == insert.placeholdersBefore && this.placeholdersAfter == insert.placeholdersAfter && kotlin.jvm.internal.Intrinsics.areEqual(this.sourceLoadStates, insert.sourceLoadStates) && kotlin.jvm.internal.Intrinsics.areEqual(this.mediatorLoadStates, insert.mediatorLoadStates);
        }

        public final androidx.paging.PageEvent.Insert<T> copy(androidx.paging.LoadType loadType, java.util.List<androidx.paging.TransformablePage<T>> pages, int placeholdersBefore, int placeholdersAfter, androidx.paging.LoadStates sourceLoadStates, androidx.paging.LoadStates mediatorLoadStates) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pages, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceLoadStates, "");
            return new androidx.paging.PageEvent.Insert<>(loadType, pages, placeholdersBefore, placeholdersAfter, sourceLoadStates, mediatorLoadStates);
        }

        /* renamed from: component6, reason: from getter */
        public final androidx.paging.LoadStates getMediatorLoadStates() {
            return this.mediatorLoadStates;
        }

        /* renamed from: component5, reason: from getter */
        public final androidx.paging.LoadStates getSourceLoadStates() {
            return this.sourceLoadStates;
        }

        /* renamed from: component4, reason: from getter */
        public final int getPlaceholdersAfter() {
            return this.placeholdersAfter;
        }

        /* renamed from: component3, reason: from getter */
        public final int getPlaceholdersBefore() {
            return this.placeholdersBefore;
        }

        public final java.util.List<androidx.paging.TransformablePage<T>> component2() {
            return this.pages;
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.paging.LoadType getLoadType() {
            return this.loadType;
        }

        public static /* synthetic */ androidx.paging.PageEvent.Insert copy$default(androidx.paging.PageEvent.Insert insert, androidx.paging.LoadType loadType, java.util.List list, int i, int i2, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                loadType = insert.loadType;
            }
            if ((i3 & 2) != 0) {
                list = insert.pages;
            }
            java.util.List list2 = list;
            if ((i3 & 4) != 0) {
                i = insert.placeholdersBefore;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = insert.placeholdersAfter;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                loadStates = insert.sourceLoadStates;
            }
            androidx.paging.LoadStates loadStates3 = loadStates;
            if ((i3 & 32) != 0) {
                loadStates2 = insert.mediatorLoadStates;
            }
            return insert.copy(loadType, list2, i4, i5, loadStates3, loadStates2);
        }

        public /* synthetic */ Insert(androidx.paging.LoadType loadType, java.util.List list, int i, int i2, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(loadType, list, i, i2, loadStates, loadStates2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J>\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b \u0010\u0012R\u001a\u0010\t\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b!\u0010\u0012R\u0011\u0010#\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0012"}, d2 = {"Landroidx/paging/PageEvent$Drop;", "", "T", "Landroidx/paging/PageEvent;", "Landroidx/paging/LoadType;", "loadType", "", "minPageOffset", "maxPageOffset", "placeholdersRemaining", "<init>", "(Landroidx/paging/LoadType;III)V", "", "toString", "()Ljava/lang/String;", "component1", "()Landroidx/paging/LoadType;", "component2", "()I", "component3", "component4", "copy", "(Landroidx/paging/LoadType;III)Landroidx/paging/PageEvent$Drop;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroidx/paging/LoadType;", "getLoadType", com.visa.cbp.getEncExpo.warmup, "getMinPageOffset", "getMaxPageOffset", "getPlaceholdersRemaining", "getPageCount", "pageCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Drop<T> extends androidx.paging.PageEvent<T> {
        private final androidx.paging.LoadType loadType;
        private final int maxPageOffset;
        private final int minPageOffset;
        private final int placeholdersRemaining;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Drop(androidx.paging.LoadType loadType, int i, int i2, int i3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
            this.loadType = loadType;
            this.minPageOffset = i;
            this.maxPageOffset = i2;
            this.placeholdersRemaining = i3;
            if (loadType == androidx.paging.LoadType.REFRESH) {
                throw new java.lang.IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
            }
            if (getPageCount() > 0) {
                if (i3 < 0) {
                    throw new java.lang.IllegalArgumentException("Invalid placeholdersRemaining ".concat(java.lang.String.valueOf(i3)).toString());
                }
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Drop count must be > 0, but was ");
                sb.append(getPageCount());
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
        }

        public final androidx.paging.LoadType getLoadType() {
            return this.loadType;
        }

        public final int getMinPageOffset() {
            return this.minPageOffset;
        }

        public final int getMaxPageOffset() {
            return this.maxPageOffset;
        }

        public final int getPlaceholdersRemaining() {
            return this.placeholdersRemaining;
        }

        public final int getPageCount() {
            return (this.maxPageOffset - this.minPageOffset) + 1;
        }

        public final java.lang.String toString() {
            java.lang.String str;
            int i = androidx.paging.PageEvent.Drop.WhenMappings.$EnumSwitchMapping$0[this.loadType.ordinal()];
            if (i == 1) {
                str = "end";
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalArgumentException("Drop load type must be PREPEND or APPEND");
                }
                str = "front";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PageEvent.Drop from the ");
            sb.append(str);
            sb.append(" (\n                    |   minPageOffset: ");
            sb.append(this.minPageOffset);
            sb.append("\n                    |   maxPageOffset: ");
            sb.append(this.maxPageOffset);
            sb.append("\n                    |   placeholdersRemaining: ");
            sb.append(this.placeholdersRemaining);
            sb.append("\n                    |)");
            return kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null);
        }

        public final int hashCode() {
            return (((((this.loadType.hashCode() * 31) + java.lang.Integer.hashCode(this.minPageOffset)) * 31) + java.lang.Integer.hashCode(this.maxPageOffset)) * 31) + java.lang.Integer.hashCode(this.placeholdersRemaining);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.paging.PageEvent.Drop)) {
                return false;
            }
            androidx.paging.PageEvent.Drop drop = (androidx.paging.PageEvent.Drop) other;
            return this.loadType == drop.loadType && this.minPageOffset == drop.minPageOffset && this.maxPageOffset == drop.maxPageOffset && this.placeholdersRemaining == drop.placeholdersRemaining;
        }

        public final androidx.paging.PageEvent.Drop<T> copy(androidx.paging.LoadType loadType, int minPageOffset, int maxPageOffset, int placeholdersRemaining) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
            return new androidx.paging.PageEvent.Drop<>(loadType, minPageOffset, maxPageOffset, placeholdersRemaining);
        }

        /* renamed from: component4, reason: from getter */
        public final int getPlaceholdersRemaining() {
            return this.placeholdersRemaining;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaxPageOffset() {
            return this.maxPageOffset;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMinPageOffset() {
            return this.minPageOffset;
        }

        @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[androidx.paging.LoadType.values().length];
                try {
                    iArr[androidx.paging.LoadType.APPEND.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.paging.LoadType.PREPEND.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.paging.LoadType getLoadType() {
            return this.loadType;
        }

        public static /* synthetic */ androidx.paging.PageEvent.Drop copy$default(androidx.paging.PageEvent.Drop drop, androidx.paging.LoadType loadType, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                loadType = drop.loadType;
            }
            if ((i4 & 2) != 0) {
                i = drop.minPageOffset;
            }
            if ((i4 & 4) != 0) {
                i2 = drop.maxPageOffset;
            }
            if ((i4 & 8) != 0) {
                i3 = drop.placeholdersRemaining;
            }
            return drop.copy(loadType, i, i2, i3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\r"}, d2 = {"Landroidx/paging/PageEvent$LoadStateUpdate;", "", "T", "Landroidx/paging/PageEvent;", "Landroidx/paging/LoadStates;", "source", "mediator", "<init>", "(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Landroidx/paging/LoadStates;", "component2", "copy", "(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$LoadStateUpdate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/paging/LoadStates;", "getSource", "getMediator"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoadStateUpdate<T> extends androidx.paging.PageEvent<T> {
        private final androidx.paging.LoadStates mediator;
        private final androidx.paging.LoadStates source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadStateUpdate(androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadStates, "");
            this.source = loadStates;
            this.mediator = loadStates2;
        }

        public /* synthetic */ LoadStateUpdate(androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(loadStates, (i & 2) != 0 ? null : loadStates2);
        }

        public final androidx.paging.LoadStates getMediator() {
            return this.mediator;
        }

        public final androidx.paging.LoadStates getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            androidx.paging.LoadStates loadStates = this.mediator;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: ");
            sb.append(this.source);
            sb.append("\n                    ");
            java.lang.String obj = sb.toString();
            if (loadStates != null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(obj);
                sb2.append("|   mediatorLoadStates: ");
                sb2.append(loadStates);
                sb2.append('\n');
                obj = sb2.toString();
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(obj);
            sb3.append("|)");
            return kotlin.text.StringsKt.trimMargin$default(sb3.toString(), null, 1, null);
        }

        public final int hashCode() {
            int hashCode = this.source.hashCode();
            androidx.paging.LoadStates loadStates = this.mediator;
            return (hashCode * 31) + (loadStates == null ? 0 : loadStates.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.paging.PageEvent.LoadStateUpdate)) {
                return false;
            }
            androidx.paging.PageEvent.LoadStateUpdate loadStateUpdate = (androidx.paging.PageEvent.LoadStateUpdate) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.source, loadStateUpdate.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.mediator, loadStateUpdate.mediator);
        }

        public final androidx.paging.PageEvent.LoadStateUpdate<T> copy(androidx.paging.LoadStates source, androidx.paging.LoadStates mediator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new androidx.paging.PageEvent.LoadStateUpdate<>(source, mediator);
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.paging.LoadStates getMediator() {
            return this.mediator;
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.paging.LoadStates getSource() {
            return this.source;
        }

        public static /* synthetic */ androidx.paging.PageEvent.LoadStateUpdate copy$default(androidx.paging.PageEvent.LoadStateUpdate loadStateUpdate, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                loadStates = loadStateUpdate.source;
            }
            if ((i & 2) != 0) {
                loadStates2 = loadStateUpdate.mediator;
            }
            return loadStateUpdate.copy(loadStates, loadStates2);
        }
    }

    public <R> java.lang.Object flatMap(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Iterable<? extends R>>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public <R> java.lang.Object map(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public /* synthetic */ PageEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

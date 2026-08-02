package app.cash.sqldelight.db;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u0000 \b*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\t\b\nJ\u0010\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00028\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u000b\f"}, d2 = {"Lapp/cash/sqldelight/db/QueryResult;", "T", "", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Companion", "AsyncValue", "Value", "Lapp/cash/sqldelight/db/QueryResult$AsyncValue;", "Lapp/cash/sqldelight/db/QueryResult$Value;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface QueryResult<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final app.cash.sqldelight.db.QueryResult.Companion INSTANCE = app.cash.sqldelight.db.QueryResult.Companion.getHighResolutionOutputSizeshNQ4ISI;

    java.lang.Object await(kotlin.coroutines.Continuation<? super T> continuation);

    T getValue();

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static <T> T getValue(app.cash.sqldelight.db.QueryResult<T> queryResult) {
            throw new java.lang.IllegalStateException("The driver used with SQLDelight is asynchronous, so SQLDelight should be configured for\nasynchronous usage:\n\nsqldelight {\n  databases {\n    MyDatabase {\n      generateAsync = true\n    }\n  }\n}");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00028\u0001H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00028\u00018\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0088\u0001\u0003\u0092\u0001\u00028\u0001"}, d2 = {"Lapp/cash/sqldelight/db/QueryResult$Value;", "T", "Lapp/cash/sqldelight/db/QueryResult;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "await-impl", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "await", "", "other", "", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Ljava/lang/Object;)I", "hashCode", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "toString", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class Value<T> implements app.cash.sqldelight.db.QueryResult<T> {
        private final T value;

        /* renamed from: await-impl, reason: not valid java name */
        public static java.lang.Object m9519awaitimpl(java.lang.Object obj, kotlin.coroutines.Continuation<? super T> continuation) {
            return obj;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static <T> java.lang.Object m9521constructorimpl(T t) {
            return t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private /* synthetic */ Value(java.lang.Object obj) {
            this.value = obj;
        }

        @Override // app.cash.sqldelight.db.QueryResult
        public final T getValue() {
            return this.value;
        }

        @Override // app.cash.sqldelight.db.QueryResult
        public final java.lang.Object await(kotlin.coroutines.Continuation<? super T> continuation) {
            return m9519awaitimpl(this.value, continuation);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ java.lang.Object getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            return m9525toStringimpl(this.value);
        }

        public final int hashCode() {
            return m9524hashCodeimpl(this.value);
        }

        public final boolean equals(java.lang.Object obj) {
            return m9522equalsimpl(this.value, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m9525toStringimpl(java.lang.Object obj) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Value(value=");
            sb.append(obj);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m9524hashCodeimpl(java.lang.Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m9523equalsimpl0(java.lang.Object obj, java.lang.Object obj2) {
            return kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m9522equalsimpl(java.lang.Object obj, java.lang.Object obj2) {
            return (obj2 instanceof app.cash.sqldelight.db.QueryResult.Value) && kotlin.jvm.internal.Intrinsics.areEqual(obj, ((app.cash.sqldelight.db.QueryResult.Value) obj2).getValue());
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ app.cash.sqldelight.db.QueryResult.Value m9520boximpl(java.lang.Object obj) {
            return new app.cash.sqldelight.db.QueryResult.Value(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00028\u0001H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R*\u0010\u001b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0088\u0001\u0006\u0092\u0001\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003"}, d2 = {"Lapp/cash/sqldelight/db/QueryResult$AsyncValue;", "T", "Lapp/cash/sqldelight/db/QueryResult;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "getter", "constructor-impl", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "await-impl", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "await", "other", "", "equals-impl", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Lkotlin/jvm/functions/Function1;)I", "hashCode", "", "toString-impl", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "toString", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    /* loaded from: classes7.dex */
    public static final class AsyncValue<T> implements app.cash.sqldelight.db.QueryResult<T> {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighSpeedVideoFpsRanges;

        @Override // app.cash.sqldelight.db.QueryResult
        public final T getValue() {
            return (T) app.cash.sqldelight.db.QueryResult.DefaultImpls.getValue(this);
        }

        private /* synthetic */ AsyncValue(kotlin.jvm.functions.Function1 function1) {
            this.getHighSpeedVideoFpsRanges = function1;
        }

        /* renamed from: getValue-impl, reason: not valid java name */
        public static T m9514getValueimpl(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1) {
            return (T) m9510boximpl(function1).getValue();
        }

        /* renamed from: await-impl, reason: not valid java name */
        public static java.lang.Object m9509awaitimpl(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
            return function1.invoke(continuation);
        }

        @Override // app.cash.sqldelight.db.QueryResult
        public final java.lang.Object await(kotlin.coroutines.Continuation<? super T> continuation) {
            return m9509awaitimpl(this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ kotlin.jvm.functions.Function1 getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final java.lang.String toString() {
            return m9516toStringimpl(this.getHighSpeedVideoFpsRanges);
        }

        public final int hashCode() {
            return m9515hashCodeimpl(this.getHighSpeedVideoFpsRanges);
        }

        public final boolean equals(java.lang.Object obj) {
            return m9512equalsimpl(this.getHighSpeedVideoFpsRanges, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m9516toStringimpl(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AsyncValue(getter=");
            sb.append(function1);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m9515hashCodeimpl(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1) {
            return function1.hashCode();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m9513equalsimpl0(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function12) {
            return kotlin.jvm.internal.Intrinsics.areEqual(function1, function12);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m9512equalsimpl(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, java.lang.Object obj) {
            return (obj instanceof app.cash.sqldelight.db.QueryResult.AsyncValue) && kotlin.jvm.internal.Intrinsics.areEqual(function1, ((app.cash.sqldelight.db.QueryResult.AsyncValue) obj).getGetHighSpeedVideoFpsRanges());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: constructor-impl, reason: not valid java name */
        public static <T> kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> m9511constructorimpl(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            return function1;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ app.cash.sqldelight.db.QueryResult.AsyncValue m9510boximpl(kotlin.jvm.functions.Function1 function1) {
            return new app.cash.sqldelight.db.QueryResult.AsyncValue(function1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Lapp/cash/sqldelight/db/QueryResult$Companion;", "", "<init>", "()V", "Lapp/cash/sqldelight/db/QueryResult$Value;", "", "Unit", "Ljava/lang/Object;", "getUnit-mlR-ZEE", "()Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ app.cash.sqldelight.db.QueryResult.Companion getHighResolutionOutputSizeshNQ4ISI = new app.cash.sqldelight.db.QueryResult.Companion();
        private static final java.lang.Object Unit = app.cash.sqldelight.db.QueryResult.Value.m9521constructorimpl(kotlin.Unit.INSTANCE);

        private Companion() {
        }

        /* renamed from: getUnit-mlR-ZEE, reason: not valid java name */
        public final java.lang.Object m9518getUnitmlRZEE() {
            return Unit;
        }
    }
}

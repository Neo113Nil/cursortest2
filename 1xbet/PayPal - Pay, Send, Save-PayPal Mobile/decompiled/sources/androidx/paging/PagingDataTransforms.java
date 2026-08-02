package androidx.paging;

@kotlin.Metadata(d1 = {"androidx/paging/PagingDataTransforms__PagingDataTransformsKt", "androidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PagingDataTransforms {
    public static final <T> androidx.paging.PagingData<T> filter(androidx.paging.PagingData<T> pagingData, java.util.concurrent.Executor executor, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        return androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt.filter(pagingData, executor, function1);
    }

    public static final <T, R> androidx.paging.PagingData<R> flatMap(androidx.paging.PagingData<T> pagingData, java.util.concurrent.Executor executor, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Iterable<? extends R>> function1) {
        return androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt.flatMap(pagingData, executor, function1);
    }

    public static final <T> androidx.paging.PagingData<T> insertFooterItem(androidx.paging.PagingData<T> pagingData, androidx.paging.TerminalSeparatorType terminalSeparatorType, T t) {
        return androidx.paging.PagingDataTransforms__PagingDataTransformsKt.insertFooterItem(pagingData, terminalSeparatorType, t);
    }

    public static final <T> androidx.paging.PagingData<T> insertFooterItem(androidx.paging.PagingData<T> pagingData, T t) {
        return androidx.paging.PagingDataTransforms__PagingDataTransformsKt.insertFooterItem(pagingData, t);
    }

    public static final <T> androidx.paging.PagingData<T> insertHeaderItem(androidx.paging.PagingData<T> pagingData, androidx.paging.TerminalSeparatorType terminalSeparatorType, T t) {
        return androidx.paging.PagingDataTransforms__PagingDataTransformsKt.insertHeaderItem(pagingData, terminalSeparatorType, t);
    }

    public static final <T> androidx.paging.PagingData<T> insertHeaderItem(androidx.paging.PagingData<T> pagingData, T t) {
        return androidx.paging.PagingDataTransforms__PagingDataTransformsKt.insertHeaderItem(pagingData, t);
    }

    public static final <R, T extends R> androidx.paging.PagingData<R> insertSeparators(androidx.paging.PagingData<T> pagingData, androidx.paging.TerminalSeparatorType terminalSeparatorType, java.util.concurrent.Executor executor, kotlin.jvm.functions.Function2<? super T, ? super T, ? extends R> function2) {
        return androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt.insertSeparators(pagingData, terminalSeparatorType, executor, function2);
    }

    public static final <R, T extends R> androidx.paging.PagingData<R> insertSeparators(androidx.paging.PagingData<T> pagingData, java.util.concurrent.Executor executor, kotlin.jvm.functions.Function2<? super T, ? super T, ? extends R> function2) {
        return androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt.insertSeparators(pagingData, executor, function2);
    }

    public static final <T, R> androidx.paging.PagingData<R> map(androidx.paging.PagingData<T> pagingData, java.util.concurrent.Executor executor, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        return androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt.map(pagingData, executor, function1);
    }

    public static final <T, R> androidx.paging.PagingData<R> transform(androidx.paging.PagingData<T> pagingData, kotlin.jvm.functions.Function2<? super androidx.paging.PageEvent<T>, ? super kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>>, ? extends java.lang.Object> function2) {
        return androidx.paging.PagingDataTransforms__PagingDataTransformsKt.transform(pagingData, function2);
    }
}

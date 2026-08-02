package androidx.view;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006B%\b\u0016\u0012\u001a\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u00060\tj\u0002`\n0\b\"\u00060\tj\u0002`\n¢\u0006\u0004\b\u0002\u0010\u000bB-\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u00060\tj\u0002`\n0\b\"\u00060\tj\u0002`\n¢\u0006\u0004\b\u0002\u0010\fB\u001d\b\u0017\u0012\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\b\"\u00020\r¢\u0006\u0004\b\u0002\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0014J\r\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u0014J\u001a\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\tj\u0002`\nJ\u0014\u0010\u0015\u001a\u00020\u00122\n\u0010\u0018\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\rH\u0017J#\u0010\u0019\u001a\u0004\u0018\u0001H\u001a\"\f\b\u0000\u0010\u001a*\u00060\tj\u0002`\n2\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u001bR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/ViewModel;", "", "<init>", "()V", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "closeables", "", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "([Ljava/lang/AutoCloseable;)V", "(Lkotlinx/coroutines/CoroutineScope;[Ljava/lang/AutoCloseable;)V", "Ljava/io/Closeable;", "([Ljava/io/Closeable;)V", "impl", "Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "onCleared", "", "clear", "clear$lifecycle_viewmodel", "addCloseable", "key", "", "closeable", "getCloseable", "T", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ViewModel {
    private final androidx.view.viewmodel.internal.ViewModelImpl impl;

    public void onCleared() {
    }

    public ViewModel() {
        this.impl = new androidx.view.viewmodel.internal.ViewModelImpl();
    }

    public ViewModel(kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.impl = new androidx.view.viewmodel.internal.ViewModelImpl(coroutineScope);
    }

    public ViewModel(java.lang.AutoCloseable... autoCloseableArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoCloseableArr, "");
        this.impl = new androidx.view.viewmodel.internal.ViewModelImpl((java.lang.AutoCloseable[]) java.util.Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public ViewModel(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.AutoCloseable... autoCloseableArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoCloseableArr, "");
        this.impl = new androidx.view.viewmodel.internal.ViewModelImpl(coroutineScope, (java.lang.AutoCloseable[]) java.util.Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ ViewModel(java.io.Closeable... closeableArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeableArr, "");
        this.impl = new androidx.view.viewmodel.internal.ViewModelImpl((java.lang.AutoCloseable[]) java.util.Arrays.copyOf(closeableArr, closeableArr.length));
    }

    public final void clear$lifecycle_viewmodel() {
        androidx.view.viewmodel.internal.ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.clear();
        }
        onCleared();
    }

    public final void addCloseable(java.lang.String key, java.lang.AutoCloseable closeable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeable, "");
        androidx.view.viewmodel.internal.ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(key, closeable);
        }
    }

    public void addCloseable(java.lang.AutoCloseable closeable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeable, "");
        androidx.view.viewmodel.internal.ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(closeable);
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ void addCloseable(java.io.Closeable closeable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeable, "");
        androidx.view.viewmodel.internal.ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(closeable);
        }
    }

    public final <T extends java.lang.AutoCloseable> T getCloseable(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        androidx.view.viewmodel.internal.ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            return (T) viewModelImpl.getCloseable(key);
        }
        return null;
    }
}

package io.reactivex.internal.disposables;

/* loaded from: classes17.dex */
public final class ListCompositeDisposable implements io.reactivex.disposables.Disposable, io.reactivex.internal.disposables.DisposableContainer {
    java.util.List<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRanges;
    volatile boolean getHighSpeedVideoSizes;

    public ListCompositeDisposable() {
    }

    public ListCompositeDisposable(io.reactivex.disposables.Disposable... disposableArr) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposableArr, "resources is null");
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedList();
        for (io.reactivex.disposables.Disposable disposable : disposableArr) {
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "Disposable item is null");
            this.getHighSpeedVideoFpsRanges.add(disposable);
        }
    }

    public ListCompositeDisposable(java.lang.Iterable<? extends io.reactivex.disposables.Disposable> iterable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(iterable, "resources is null");
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedList();
        for (io.reactivex.disposables.Disposable disposable : iterable) {
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "Disposable item is null");
            this.getHighSpeedVideoFpsRanges.add(disposable);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            java.util.List<io.reactivex.disposables.Disposable> list = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = null;
            getHighSpeedVideoFpsRangesFor(list);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean add(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "d is null");
        if (!this.getHighSpeedVideoSizes) {
            synchronized (this) {
                if (!this.getHighSpeedVideoSizes) {
                    java.util.List list = this.getHighSpeedVideoFpsRanges;
                    if (list == null) {
                        list = new java.util.LinkedList();
                        this.getHighSpeedVideoFpsRanges = list;
                    }
                    list.add(disposable);
                    return true;
                }
            }
        }
        disposable.dispose();
        return false;
    }

    public final boolean addAll(io.reactivex.disposables.Disposable... disposableArr) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposableArr, "ds is null");
        if (!this.getHighSpeedVideoSizes) {
            synchronized (this) {
                if (!this.getHighSpeedVideoSizes) {
                    java.util.List list = this.getHighSpeedVideoFpsRanges;
                    if (list == null) {
                        list = new java.util.LinkedList();
                        this.getHighSpeedVideoFpsRanges = list;
                    }
                    for (io.reactivex.disposables.Disposable disposable : disposableArr) {
                        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "d is null");
                        list.add(disposable);
                    }
                    return true;
                }
            }
        }
        for (io.reactivex.disposables.Disposable disposable2 : disposableArr) {
            disposable2.dispose();
        }
        return false;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean remove(io.reactivex.disposables.Disposable disposable) {
        if (!delete(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean delete(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "Disposable item is null");
        if (this.getHighSpeedVideoSizes) {
            return false;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoSizes) {
                return false;
            }
            java.util.List<io.reactivex.disposables.Disposable> list = this.getHighSpeedVideoFpsRanges;
            if (list != null) {
                if (list.remove(disposable)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void clear() {
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            java.util.List<io.reactivex.disposables.Disposable> list = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = null;
            getHighSpeedVideoFpsRangesFor(list);
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(java.util.List<io.reactivex.disposables.Disposable> list) {
        if (list != null) {
            java.util.Iterator<io.reactivex.disposables.Disposable> it = list.iterator();
            java.util.ArrayList arrayList = null;
            while (it.hasNext()) {
                try {
                    it.next().dispose();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList != null) {
                if (arrayList.size() == 1) {
                    throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow((java.lang.Throwable) arrayList.get(0));
                }
                throw new io.reactivex.exceptions.CompositeException(arrayList);
            }
        }
    }
}

package io.reactivex.disposables;

/* loaded from: classes17.dex */
public final class CompositeDisposable implements io.reactivex.disposables.Disposable, io.reactivex.internal.disposables.DisposableContainer {
    io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> getHighResolutionOutputSizeshNQ4ISI;
    volatile boolean getHighSpeedVideoFpsRanges;

    public CompositeDisposable() {
    }

    public CompositeDisposable(io.reactivex.disposables.Disposable... disposableArr) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposableArr, "resources is null");
        this.getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.util.OpenHashSet<>(disposableArr.length + 1);
        for (io.reactivex.disposables.Disposable disposable : disposableArr) {
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "Disposable item is null");
            this.getHighResolutionOutputSizeshNQ4ISI.add(disposable);
        }
    }

    public CompositeDisposable(java.lang.Iterable<? extends io.reactivex.disposables.Disposable> iterable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(iterable, "resources is null");
        this.getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.util.OpenHashSet<>();
        for (io.reactivex.disposables.Disposable disposable : iterable) {
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "Disposable item is null");
            this.getHighResolutionOutputSizeshNQ4ISI.add(disposable);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> openHashSet = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            getHighSpeedVideoFpsRangesFor(openHashSet);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean add(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "d is null");
        if (!this.getHighSpeedVideoFpsRanges) {
            synchronized (this) {
                if (!this.getHighSpeedVideoFpsRanges) {
                    io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> openHashSet = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (openHashSet == null) {
                        openHashSet = new io.reactivex.internal.util.OpenHashSet<>();
                        this.getHighResolutionOutputSizeshNQ4ISI = openHashSet;
                    }
                    openHashSet.add(disposable);
                    return true;
                }
            }
        }
        disposable.dispose();
        return false;
    }

    public final boolean addAll(io.reactivex.disposables.Disposable... disposableArr) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposableArr, "ds is null");
        if (!this.getHighSpeedVideoFpsRanges) {
            synchronized (this) {
                if (!this.getHighSpeedVideoFpsRanges) {
                    io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> openHashSet = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (openHashSet == null) {
                        openHashSet = new io.reactivex.internal.util.OpenHashSet<>(disposableArr.length + 1);
                        this.getHighResolutionOutputSizeshNQ4ISI = openHashSet;
                    }
                    for (io.reactivex.disposables.Disposable disposable : disposableArr) {
                        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "d is null");
                        openHashSet.add(disposable);
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
        if (this.getHighSpeedVideoFpsRanges) {
            return false;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges) {
                return false;
            }
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> openHashSet = this.getHighResolutionOutputSizeshNQ4ISI;
            if (openHashSet != null) {
                if (openHashSet.remove(disposable)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void clear() {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> openHashSet = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            getHighSpeedVideoFpsRangesFor(openHashSet);
        }
    }

    public final int size() {
        if (this.getHighSpeedVideoFpsRanges) {
            return 0;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges) {
                return 0;
            }
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> openHashSet = this.getHighResolutionOutputSizeshNQ4ISI;
            return openHashSet != null ? openHashSet.size() : 0;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> openHashSet) {
        if (openHashSet != null) {
            java.util.ArrayList arrayList = null;
            for (java.lang.Object obj : openHashSet.keys()) {
                if (obj instanceof io.reactivex.disposables.Disposable) {
                    try {
                        ((io.reactivex.disposables.Disposable) obj).dispose();
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        arrayList.add(th);
                    }
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

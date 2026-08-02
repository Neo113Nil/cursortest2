package io.reactivex.observers;

/* loaded from: classes17.dex */
public abstract class BaseTestConsumer<T, U extends io.reactivex.observers.BaseTestConsumer<T, U>> implements io.reactivex.disposables.Disposable {
    protected boolean checkSubscriptionOnce;
    protected long completions;
    protected int establishedFusionMode;
    protected int initialFusionMode;
    protected java.lang.Thread lastThread;
    protected java.lang.CharSequence tag;
    protected boolean timeout;
    protected final java.util.List<T> values = new io.reactivex.internal.util.VolatileSizeArrayList();
    protected final java.util.List<java.lang.Throwable> errors = new io.reactivex.internal.util.VolatileSizeArrayList();
    protected final java.util.concurrent.CountDownLatch done = new java.util.concurrent.CountDownLatch(1);

    public abstract U assertNotSubscribed();

    public abstract U assertSubscribed();

    public final java.lang.Thread lastThread() {
        return this.lastThread;
    }

    public final java.util.List<T> values() {
        return this.values;
    }

    public final java.util.List<java.lang.Throwable> errors() {
        return this.errors;
    }

    public final long completions() {
        return this.completions;
    }

    public final boolean isTerminated() {
        return this.done.getCount() == 0;
    }

    public final int valueCount() {
        return this.values.size();
    }

    public final int errorCount() {
        return this.errors.size();
    }

    protected final java.lang.AssertionError fail(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 64);
        sb.append(str);
        sb.append(" (latch = ");
        sb.append(this.done.getCount());
        sb.append(", values = ");
        sb.append(this.values.size());
        sb.append(", errors = ");
        sb.append(this.errors.size());
        sb.append(", completions = ");
        sb.append(this.completions);
        if (this.timeout) {
            sb.append(", timeout!");
        }
        if (isDisposed()) {
            sb.append(", disposed!");
        }
        java.lang.CharSequence charSequence = this.tag;
        if (charSequence != null) {
            sb.append(", tag = ");
            sb.append(charSequence);
        }
        sb.append(')');
        java.lang.AssertionError assertionError = new java.lang.AssertionError(sb.toString());
        if (!this.errors.isEmpty()) {
            if (this.errors.size() == 1) {
                assertionError.initCause(this.errors.get(0));
                return assertionError;
            }
            assertionError.initCause(new io.reactivex.exceptions.CompositeException(this.errors));
        }
        return assertionError;
    }

    public final U await() throws java.lang.InterruptedException {
        if (this.done.getCount() == 0) {
            return this;
        }
        this.done.await();
        return this;
    }

    public final boolean await(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        boolean z = this.done.getCount() == 0 || this.done.await(j, timeUnit);
        this.timeout = !z;
        return z;
    }

    public final U assertComplete() {
        long j = this.completions;
        if (j == 0) {
            throw fail("Not completed");
        }
        if (j <= 1) {
            return this;
        }
        throw fail("Multiple completions: ".concat(java.lang.String.valueOf(j)));
    }

    public final U assertNotComplete() {
        long j = this.completions;
        if (j == 1) {
            throw fail("Completed!");
        }
        if (j <= 1) {
            return this;
        }
        throw fail("Multiple completions: ".concat(java.lang.String.valueOf(j)));
    }

    public final U assertNoErrors() {
        if (this.errors.size() == 0) {
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(s) present: ");
        sb.append(this.errors);
        throw fail(sb.toString());
    }

    public final U assertError(java.lang.Throwable th) {
        return assertError(io.reactivex.internal.functions.Functions.equalsWith(th));
    }

    public final U assertError(java.lang.Class<? extends java.lang.Throwable> cls) {
        return assertError(io.reactivex.internal.functions.Functions.isInstanceOf(cls));
    }

    public final U assertError(io.reactivex.functions.Predicate<java.lang.Throwable> predicate) {
        int size = this.errors.size();
        if (size == 0) {
            throw fail("No errors");
        }
        java.util.Iterator<java.lang.Throwable> it = this.errors.iterator();
        while (it.hasNext()) {
            try {
                if (predicate.test(it.next())) {
                    if (size == 1) {
                        return this;
                    }
                    throw fail("Error present but other errors as well");
                }
            } catch (java.lang.Exception e) {
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
            }
        }
        throw fail("Error not present");
    }

    public final U assertValue(T t) {
        if (this.values.size() != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected: ");
            sb.append(valueAndClass(t));
            sb.append(", Actual: ");
            sb.append(this.values);
            throw fail(sb.toString());
        }
        T t2 = this.values.get(0);
        if (io.reactivex.internal.functions.ObjectHelper.equals(t, t2)) {
            return this;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected: ");
        sb2.append(valueAndClass(t));
        sb2.append(", Actual: ");
        sb2.append(valueAndClass(t2));
        throw fail(sb2.toString());
    }

    public final U assertNever(T t) {
        int size = this.values.size();
        for (int i = 0; i < size; i++) {
            if (io.reactivex.internal.functions.ObjectHelper.equals(this.values.get(i), t)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Value at position ");
                sb.append(i);
                sb.append(" is equal to ");
                sb.append(valueAndClass(t));
                sb.append("; Expected them to be different");
                throw fail(sb.toString());
            }
        }
        return this;
    }

    public final U assertValue(io.reactivex.functions.Predicate<T> predicate) {
        assertValueAt(0, (io.reactivex.functions.Predicate) predicate);
        if (this.values.size() <= 1) {
            return this;
        }
        throw fail("Value present but other values as well");
    }

    public final U assertNever(io.reactivex.functions.Predicate<? super T> predicate) {
        int size = this.values.size();
        for (int i = 0; i < size; i++) {
            try {
                if (predicate.test(this.values.get(i))) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Value at position ");
                    sb.append(i);
                    sb.append(" matches predicate ");
                    sb.append(predicate.toString());
                    sb.append(", which was not expected.");
                    throw fail(sb.toString());
                }
            } catch (java.lang.Exception e) {
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
            }
        }
        return this;
    }

    public final U assertValueAt(int i, T t) {
        int size = this.values.size();
        if (size == 0) {
            throw fail("No values");
        }
        if (i >= size) {
            throw fail("Invalid index: ".concat(java.lang.String.valueOf(i)));
        }
        T t2 = this.values.get(i);
        if (io.reactivex.internal.functions.ObjectHelper.equals(t, t2)) {
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected: ");
        sb.append(valueAndClass(t));
        sb.append(", Actual: ");
        sb.append(valueAndClass(t2));
        throw fail(sb.toString());
    }

    public final U assertValueAt(int i, io.reactivex.functions.Predicate<T> predicate) {
        if (this.values.size() == 0) {
            throw fail("No values");
        }
        if (i >= this.values.size()) {
            throw fail("Invalid index: ".concat(java.lang.String.valueOf(i)));
        }
        try {
            if (predicate.test(this.values.get(i))) {
                return this;
            }
            throw fail("Value not present");
        } catch (java.lang.Exception e) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
        }
    }

    public static java.lang.String valueAndClass(java.lang.Object obj) {
        if (obj != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(obj);
            sb.append(" (class: ");
            sb.append(obj.getClass().getSimpleName());
            sb.append(")");
            return sb.toString();
        }
        return "null";
    }

    public final U assertValueCount(int i) {
        int size = this.values.size();
        if (size == i) {
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Value counts differ; Expected: ");
        sb.append(i);
        sb.append(", Actual: ");
        sb.append(size);
        throw fail(sb.toString());
    }

    public final U assertNoValues() {
        return assertValueCount(0);
    }

    public final U assertValues(T... tArr) {
        int size = this.values.size();
        if (size != tArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Value count differs; Expected: ");
            sb.append(tArr.length);
            sb.append(" ");
            sb.append(java.util.Arrays.toString(tArr));
            sb.append(", Actual: ");
            sb.append(size);
            sb.append(" ");
            sb.append(this.values);
            throw fail(sb.toString());
        }
        for (int i = 0; i < size; i++) {
            T t = this.values.get(i);
            T t2 = tArr[i];
            if (!io.reactivex.internal.functions.ObjectHelper.equals(t2, t)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Values at position ");
                sb2.append(i);
                sb2.append(" differ; Expected: ");
                sb2.append(valueAndClass(t2));
                sb2.append(", Actual: ");
                sb2.append(valueAndClass(t));
                throw fail(sb2.toString());
            }
        }
        return this;
    }

    public final U assertValuesOnly(T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertNoErrors().assertNotComplete();
    }

    public final U assertValueSet(java.util.Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            assertNoValues();
            return this;
        }
        for (T t : this.values) {
            if (!collection.contains(t)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Value not in the expected collection: ");
                sb.append(valueAndClass(t));
                throw fail(sb.toString());
            }
        }
        return this;
    }

    public final U assertValueSetOnly(java.util.Collection<? extends T> collection) {
        return (U) assertSubscribed().assertValueSet(collection).assertNoErrors().assertNotComplete();
    }

    public final U assertValueSequence(java.lang.Iterable<? extends T> iterable) {
        boolean hasNext;
        boolean hasNext2;
        java.util.Iterator<T> it = this.values.iterator();
        java.util.Iterator<? extends T> it2 = iterable.iterator();
        int i = 0;
        while (true) {
            hasNext = it2.hasNext();
            hasNext2 = it.hasNext();
            if (!hasNext2 || !hasNext) {
                break;
            }
            T next = it2.next();
            T next2 = it.next();
            if (!io.reactivex.internal.functions.ObjectHelper.equals(next, next2)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Values at position ");
                sb.append(i);
                sb.append(" differ; Expected: ");
                sb.append(valueAndClass(next));
                sb.append(", Actual: ");
                sb.append(valueAndClass(next2));
                throw fail(sb.toString());
            }
            i++;
        }
        if (hasNext2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("More values received than expected (");
            sb2.append(i);
            sb2.append(")");
            throw fail(sb2.toString());
        }
        if (!hasNext) {
            return this;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Fewer values received than expected (");
        sb3.append(i);
        sb3.append(")");
        throw fail(sb3.toString());
    }

    public final U assertValueSequenceOnly(java.lang.Iterable<? extends T> iterable) {
        return (U) assertSubscribed().assertValueSequence(iterable).assertNoErrors().assertNotComplete();
    }

    public final U assertTerminated() {
        if (this.done.getCount() != 0) {
            throw fail("Subscriber still running!");
        }
        long j = this.completions;
        if (j > 1) {
            throw fail("Terminated with multiple completions: ".concat(java.lang.String.valueOf(j)));
        }
        int size = this.errors.size();
        if (size > 1) {
            throw fail("Terminated with multiple errors: ".concat(java.lang.String.valueOf(size)));
        }
        if (j == 0 || size == 0) {
            return this;
        }
        throw fail("Terminated with multiple completions and errors: ".concat(java.lang.String.valueOf(j)));
    }

    public final U assertNotTerminated() {
        if (this.done.getCount() != 0) {
            return this;
        }
        throw fail("Subscriber terminated!");
    }

    public final boolean awaitTerminalEvent() {
        try {
            await();
            return true;
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            return false;
        }
    }

    public final boolean awaitTerminalEvent(long j, java.util.concurrent.TimeUnit timeUnit) {
        try {
            return await(j, timeUnit);
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            return false;
        }
    }

    public final U assertErrorMessage(java.lang.String str) {
        int size = this.errors.size();
        if (size == 0) {
            throw fail("No errors");
        }
        if (size == 1) {
            java.lang.String message = this.errors.get(0).getMessage();
            if (io.reactivex.internal.functions.ObjectHelper.equals(str, message)) {
                return this;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error message differs; Expected: ");
            sb.append(str);
            sb.append(", Actual: ");
            sb.append(message);
            throw fail(sb.toString());
        }
        throw fail("Multiple errors");
    }

    public final java.util.List<java.util.List<java.lang.Object>> getEvents() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(values());
        arrayList.add(errors());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (long j = 0; j < this.completions; j++) {
            arrayList2.add(io.reactivex.Notification.createOnComplete());
        }
        arrayList.add(arrayList2);
        return arrayList;
    }

    public final U assertResult(T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertNoErrors().assertComplete();
    }

    public final U assertFailure(java.lang.Class<? extends java.lang.Throwable> cls, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(cls).assertNotComplete();
    }

    public final U assertFailure(io.reactivex.functions.Predicate<java.lang.Throwable> predicate, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(predicate).assertNotComplete();
    }

    public final U assertFailureAndMessage(java.lang.Class<? extends java.lang.Throwable> cls, java.lang.String str, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(cls).assertErrorMessage(str).assertNotComplete();
    }

    public final U awaitDone(long j, java.util.concurrent.TimeUnit timeUnit) {
        try {
            if (!this.done.await(j, timeUnit)) {
                this.timeout = true;
                dispose();
            }
            return this;
        } catch (java.lang.InterruptedException e) {
            dispose();
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
        }
    }

    public final U assertEmpty() {
        return (U) assertSubscribed().assertNoValues().assertNoErrors().assertNotComplete();
    }

    public final U withTag(java.lang.CharSequence charSequence) {
        this.tag = charSequence;
        return this;
    }

    public enum TestWaitStrategy implements java.lang.Runnable {
        SPIN { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.1
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public final void run() {
            }
        },
        YIELD { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.2
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public final void run() {
                java.lang.Thread.yield();
            }
        },
        SLEEP_1MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.3
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public final void run() {
                try {
                    java.lang.Thread.sleep(1L);
                } catch (java.lang.InterruptedException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        },
        SLEEP_10MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.4
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public final void run() {
                try {
                    java.lang.Thread.sleep(10L);
                } catch (java.lang.InterruptedException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        },
        SLEEP_100MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.5
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public final void run() {
                try {
                    java.lang.Thread.sleep(100L);
                } catch (java.lang.InterruptedException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        },
        SLEEP_1000MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.6
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public final void run() {
                try {
                    java.lang.Thread.sleep(1000L);
                } catch (java.lang.InterruptedException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        };

        @Override // java.lang.Runnable
        public abstract void run();

        /* synthetic */ TestWaitStrategy(byte b) {
            this();
        }
    }

    public final U awaitCount(int i) {
        return awaitCount(i, io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.SLEEP_10MS, 5000L);
    }

    public final U awaitCount(int i, java.lang.Runnable runnable) {
        return awaitCount(i, runnable, 5000L);
    }

    public final U awaitCount(int i, java.lang.Runnable runnable, long j) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        while (true) {
            if (j > 0 && java.lang.System.currentTimeMillis() - currentTimeMillis >= j) {
                this.timeout = true;
                return this;
            }
            if (this.done.getCount() == 0 || this.values.size() >= i) {
                break;
            }
            runnable.run();
        }
        return this;
    }

    public final boolean isTimeout() {
        return this.timeout;
    }

    public final U clearTimeout() {
        this.timeout = false;
        return this;
    }

    public final U assertTimeout() {
        if (this.timeout) {
            return this;
        }
        throw fail("No timeout?!");
    }

    public final U assertNoTimeout() {
        if (this.timeout) {
            throw fail("Timeout?!");
        }
        return this;
    }
}

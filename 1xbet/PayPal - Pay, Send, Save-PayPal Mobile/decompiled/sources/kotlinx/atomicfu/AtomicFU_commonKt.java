package kotlinx.atomicfu;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u000e\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a+\u0010\u000b\u001a\u00020\n*\u00020\u00132\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0015\u001a+\u0010\u000e\u001a\u00020\b*\u00020\u00132\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0016\u001a+\u0010\u0010\u001a\u00020\u0014*\u00020\u00132\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0017\u001a+\u0010\u0012\u001a\u00020\u0014*\u00020\u00132\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0017\u001a+\u0010\u000b\u001a\u00020\n*\u00020\u00182\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0019\u001a+\u0010\u000e\u001a\u00020\b*\u00020\u00182\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u001a\u001a+\u0010\u0010\u001a\u00020\u0001*\u00020\u00182\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u001b\u001a+\u0010\u0012\u001a\u00020\u0001*\u00020\u00182\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u001b\u001a+\u0010\u000b\u001a\u00020\n*\u00020\u001c2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u001e\u001a+\u0010\u000e\u001a\u00020\b*\u00020\u001c2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u001f\u001a+\u0010\u0010\u001a\u00020\u001d*\u00020\u001c2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010 \u001a+\u0010\u0012\u001a\u00020\u001d*\u00020\u001c2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "", io.ktor.http.ContentDisposition.Parameters.Size, "Lkotlinx/atomicfu/AtomicArray;", "atomicArrayOfNulls", "(I)Lkotlinx/atomicfu/AtomicArray;", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlin/Function1;", "", "action", "", "loop", "(Lkotlinx/atomicfu/AtomicRef;Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "function", "update", "(Lkotlinx/atomicfu/AtomicRef;Lkotlin/jvm/functions/Function1;)V", "getAndUpdate", "(Lkotlinx/atomicfu/AtomicRef;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "updateAndGet", "Lkotlinx/atomicfu/AtomicBoolean;", "", "(Lkotlinx/atomicfu/AtomicBoolean;Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "(Lkotlinx/atomicfu/AtomicBoolean;Lkotlin/jvm/functions/Function1;)V", "(Lkotlinx/atomicfu/AtomicBoolean;Lkotlin/jvm/functions/Function1;)Z", "Lkotlinx/atomicfu/AtomicInt;", "(Lkotlinx/atomicfu/AtomicInt;Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "(Lkotlinx/atomicfu/AtomicInt;Lkotlin/jvm/functions/Function1;)V", "(Lkotlinx/atomicfu/AtomicInt;Lkotlin/jvm/functions/Function1;)I", "Lkotlinx/atomicfu/AtomicLong;", "", "(Lkotlinx/atomicfu/AtomicLong;Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "(Lkotlinx/atomicfu/AtomicLong;Lkotlin/jvm/functions/Function1;)V", "(Lkotlinx/atomicfu/AtomicLong;Lkotlin/jvm/functions/Function1;)J"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AtomicFU_commonKt {
    public static final <T> kotlinx.atomicfu.AtomicArray<T> atomicArrayOfNulls(int i) {
        return new kotlinx.atomicfu.AtomicArray<>(i);
    }

    public static final <T> java.lang.Void loop(kotlinx.atomicfu.AtomicRef<T> atomicRef, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicRef, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        while (true) {
            function1.invoke(atomicRef.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void update(kotlinx.atomicfu.AtomicRef<T> atomicRef, kotlin.jvm.functions.Function1<? super T, ? extends T> function1) {
        amex.AMEXKernel aMEXKernel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicRef, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        do {
            aMEXKernel = (java.lang.Object) atomicRef.getValue();
        } while (!atomicRef.compareAndSet(aMEXKernel, function1.invoke(aMEXKernel)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static final <T> T getAndUpdate(kotlinx.atomicfu.AtomicRef<T> atomicRef, kotlin.jvm.functions.Function1<? super T, ? extends T> function1) {
        ?? r0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicRef, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        do {
            r0 = (java.lang.Object) atomicRef.getValue();
        } while (!atomicRef.compareAndSet(r0, function1.invoke(r0)));
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T updateAndGet(kotlinx.atomicfu.AtomicRef<T> atomicRef, kotlin.jvm.functions.Function1<? super T, ? extends T> function1) {
        amex.AMEXKernel aMEXKernel;
        T invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicRef, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        do {
            aMEXKernel = (java.lang.Object) atomicRef.getValue();
            invoke = function1.invoke(aMEXKernel);
        } while (!atomicRef.compareAndSet(aMEXKernel, invoke));
        return invoke;
    }

    public static final java.lang.Void loop(kotlinx.atomicfu.AtomicBoolean atomicBoolean, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicBoolean, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        while (true) {
            function1.invoke(java.lang.Boolean.valueOf(atomicBoolean.getValue()));
        }
    }

    public static final void update(kotlinx.atomicfu.AtomicBoolean atomicBoolean, kotlin.jvm.functions.Function1<? super java.lang.Boolean, java.lang.Boolean> function1) {
        boolean value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicBoolean, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        do {
            value = atomicBoolean.getValue();
        } while (!atomicBoolean.compareAndSet(value, function1.invoke(java.lang.Boolean.valueOf(value)).booleanValue()));
    }

    public static final boolean getAndUpdate(kotlinx.atomicfu.AtomicBoolean atomicBoolean, kotlin.jvm.functions.Function1<? super java.lang.Boolean, java.lang.Boolean> function1) {
        boolean value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicBoolean, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        do {
            value = atomicBoolean.getValue();
        } while (!atomicBoolean.compareAndSet(value, function1.invoke(java.lang.Boolean.valueOf(value)).booleanValue()));
        return value;
    }

    public static final boolean updateAndGet(kotlinx.atomicfu.AtomicBoolean atomicBoolean, kotlin.jvm.functions.Function1<? super java.lang.Boolean, java.lang.Boolean> function1) {
        boolean value;
        boolean booleanValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicBoolean, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        do {
            value = atomicBoolean.getValue();
            booleanValue = function1.invoke(java.lang.Boolean.valueOf(value)).booleanValue();
        } while (!atomicBoolean.compareAndSet(value, booleanValue));
        return booleanValue;
    }

    public static final java.lang.Void loop(kotlinx.atomicfu.AtomicInt atomicInt, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicInt, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        while (true) {
            function1.invoke(java.lang.Integer.valueOf(atomicInt.getValue()));
        }
    }

    public static final void update(kotlinx.atomicfu.AtomicInt atomicInt, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        int value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicInt, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        do {
            value = atomicInt.getValue();
        } while (!atomicInt.compareAndSet(value, function1.invoke(java.lang.Integer.valueOf(value)).intValue()));
    }

    public static final int getAndUpdate(kotlinx.atomicfu.AtomicInt atomicInt, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        int value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicInt, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        do {
            value = atomicInt.getValue();
        } while (!atomicInt.compareAndSet(value, function1.invoke(java.lang.Integer.valueOf(value)).intValue()));
        return value;
    }

    public static final int updateAndGet(kotlinx.atomicfu.AtomicInt atomicInt, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        int value;
        int intValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicInt, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        do {
            value = atomicInt.getValue();
            intValue = function1.invoke(java.lang.Integer.valueOf(value)).intValue();
        } while (!atomicInt.compareAndSet(value, intValue));
        return intValue;
    }

    public static final java.lang.Void loop(kotlinx.atomicfu.AtomicLong atomicLong, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLong, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        while (true) {
            function1.invoke(java.lang.Long.valueOf(atomicLong.getValue()));
        }
    }

    public static final void update(kotlinx.atomicfu.AtomicLong atomicLong, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> function1) {
        long value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLong, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        do {
            value = atomicLong.getValue();
        } while (!atomicLong.compareAndSet(value, function1.invoke(java.lang.Long.valueOf(value)).longValue()));
    }

    public static final long getAndUpdate(kotlinx.atomicfu.AtomicLong atomicLong, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> function1) {
        long value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLong, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        do {
            value = atomicLong.getValue();
        } while (!atomicLong.compareAndSet(value, function1.invoke(java.lang.Long.valueOf(value)).longValue()));
        return value;
    }

    public static final long updateAndGet(kotlinx.atomicfu.AtomicLong atomicLong, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> function1) {
        long value;
        long longValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLong, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        do {
            value = atomicLong.getValue();
            longValue = function1.invoke(java.lang.Long.valueOf(value)).longValue();
        } while (!atomicLong.compareAndSet(value, longValue));
        return longValue;
    }
}

package com.google.common.hash;

/* loaded from: classes9.dex */
final class LongAddables {
    private static final com.google.common.base.Supplier<com.google.common.hash.LongAddable> SUPPLIER;

    LongAddables() {
    }

    static {
        com.google.common.base.Supplier<com.google.common.hash.LongAddable> supplier;
        try {
            new com.google.common.hash.LongAdder();
            supplier = new com.google.common.base.Supplier<com.google.common.hash.LongAddable>() { // from class: com.google.common.hash.LongAddables.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.common.base.Supplier
                public com.google.common.hash.LongAddable get() {
                    return new com.google.common.hash.LongAdder();
                }
            };
        } catch (java.lang.Throwable unused) {
            supplier = new com.google.common.base.Supplier<com.google.common.hash.LongAddable>() { // from class: com.google.common.hash.LongAddables.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.common.base.Supplier
                public com.google.common.hash.LongAddable get() {
                    return new com.google.common.hash.LongAddables.PureJavaLongAddable();
                }
            };
        }
        SUPPLIER = supplier;
    }

    public static com.google.common.hash.LongAddable create() {
        return SUPPLIER.get();
    }

    static final class PureJavaLongAddable extends java.util.concurrent.atomic.AtomicLong implements com.google.common.hash.LongAddable {
        private PureJavaLongAddable() {
        }

        @Override // com.google.common.hash.LongAddable
        public final void increment() {
            getAndIncrement();
        }

        @Override // com.google.common.hash.LongAddable
        public final void add(long j) {
            getAndAdd(j);
        }

        @Override // com.google.common.hash.LongAddable
        public final long sum() {
            return get();
        }
    }
}

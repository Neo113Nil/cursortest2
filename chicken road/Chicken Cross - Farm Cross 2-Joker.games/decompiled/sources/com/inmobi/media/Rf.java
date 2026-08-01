package com.inmobi.media;

/* loaded from: classes6.dex */
public final class Rf {
    public a others;
    public a wifi;

    public static final class a {
        private int maxBatchSize;
        private int minBatchSize;
        private long retryInterval;

        public final void a(long j) {
            this.retryInterval = j;
        }

        public final int b() {
            return this.minBatchSize;
        }

        public final long c() {
            return this.retryInterval;
        }

        public final int a() {
            return this.maxBatchSize;
        }

        public final void b(int i) {
            this.maxBatchSize = i;
        }

        public final void c(int i) {
            this.minBatchSize = i;
        }

        public final boolean a(int i) {
            int i2;
            int i3 = this.maxBatchSize;
            return i3 <= i && this.retryInterval > 0 && i3 > 0 && (i2 = this.minBatchSize) > 0 && i2 <= i3;
        }
    }
}

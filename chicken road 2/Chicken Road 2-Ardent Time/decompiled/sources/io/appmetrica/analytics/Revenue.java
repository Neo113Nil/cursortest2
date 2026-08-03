package io.appmetrica.analytics;

/* loaded from: classes.dex */
public class Revenue {
    public final java.util.Currency currency;
    public final java.lang.String payload;
    public final long priceMicros;
    public final java.lang.String productID;
    public final java.lang.Integer quantity;
    public final io.appmetrica.analytics.Revenue.Receipt receipt;

    public static class Builder {

        /* renamed from: g, reason: collision with root package name */
        private static final io.appmetrica.analytics.impl.En f3409g = new io.appmetrica.analytics.impl.En(new io.appmetrica.analytics.impl.C0254be("revenue currency"));

        /* renamed from: a, reason: collision with root package name */
        final long f3410a;

        /* renamed from: b, reason: collision with root package name */
        final java.util.Currency f3411b;

        /* renamed from: c, reason: collision with root package name */
        java.lang.Integer f3412c;

        /* renamed from: d, reason: collision with root package name */
        java.lang.String f3413d;

        /* renamed from: e, reason: collision with root package name */
        java.lang.String f3414e;

        /* renamed from: f, reason: collision with root package name */
        io.appmetrica.analytics.Revenue.Receipt f3415f;

        public /* synthetic */ Builder(long j2, java.util.Currency currency, int i2) {
            this(j2, currency);
        }

        public io.appmetrica.analytics.Revenue build() {
            return new io.appmetrica.analytics.Revenue(this, 0);
        }

        public io.appmetrica.analytics.Revenue.Builder withPayload(java.lang.String str) {
            this.f3414e = str;
            return this;
        }

        public io.appmetrica.analytics.Revenue.Builder withProductID(java.lang.String str) {
            this.f3413d = str;
            return this;
        }

        public io.appmetrica.analytics.Revenue.Builder withQuantity(java.lang.Integer num) {
            this.f3412c = num;
            return this;
        }

        public io.appmetrica.analytics.Revenue.Builder withReceipt(io.appmetrica.analytics.Revenue.Receipt receipt) {
            this.f3415f = receipt;
            return this;
        }

        private Builder(long j2, java.util.Currency currency) {
            f3409g.a(currency);
            this.f3410a = j2;
            this.f3411b = currency;
        }
    }

    public static class Receipt {
        public final java.lang.String data;
        public final java.lang.String signature;

        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            private java.lang.String f3416a;

            /* renamed from: b, reason: collision with root package name */
            private java.lang.String f3417b;

            public /* synthetic */ Builder(int i2) {
                this();
            }

            public io.appmetrica.analytics.Revenue.Receipt build() {
                return new io.appmetrica.analytics.Revenue.Receipt(this, 0);
            }

            public io.appmetrica.analytics.Revenue.Receipt.Builder withData(java.lang.String str) {
                this.f3416a = str;
                return this;
            }

            public io.appmetrica.analytics.Revenue.Receipt.Builder withSignature(java.lang.String str) {
                this.f3417b = str;
                return this;
            }

            private Builder() {
            }
        }

        public /* synthetic */ Receipt(io.appmetrica.analytics.Revenue.Receipt.Builder builder, int i2) {
            this(builder);
        }

        public static io.appmetrica.analytics.Revenue.Receipt.Builder newBuilder() {
            return new io.appmetrica.analytics.Revenue.Receipt.Builder(0);
        }

        private Receipt(io.appmetrica.analytics.Revenue.Receipt.Builder builder) {
            this.data = builder.f3416a;
            this.signature = builder.f3417b;
        }
    }

    public /* synthetic */ Revenue(io.appmetrica.analytics.Revenue.Builder builder, int i2) {
        this(builder);
    }

    public static io.appmetrica.analytics.Revenue.Builder newBuilder(long j2, java.util.Currency currency) {
        return new io.appmetrica.analytics.Revenue.Builder(j2, currency, 0);
    }

    private Revenue(io.appmetrica.analytics.Revenue.Builder builder) {
        this.priceMicros = builder.f3410a;
        this.currency = builder.f3411b;
        this.quantity = builder.f3412c;
        this.productID = builder.f3413d;
        this.payload = builder.f3414e;
        this.receipt = builder.f3415f;
    }
}

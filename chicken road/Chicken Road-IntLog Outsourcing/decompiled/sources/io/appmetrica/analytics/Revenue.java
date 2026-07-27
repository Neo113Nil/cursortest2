package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.C0721ie;
import io.appmetrica.analytics.impl.Gn;
import java.util.Currency;

/* loaded from: classes.dex */
public class Revenue {
    public final Currency currency;
    public final String payload;
    public final long priceMicros;
    public final String productID;
    public final Integer quantity;
    public final Receipt receipt;

    public static class Builder {

        /* renamed from: g, reason: collision with root package name */
        private static final Gn f5917g = new Gn(new C0721ie("revenue currency"));

        /* renamed from: a, reason: collision with root package name */
        final long f5918a;

        /* renamed from: b, reason: collision with root package name */
        final Currency f5919b;

        /* renamed from: c, reason: collision with root package name */
        Integer f5920c;

        /* renamed from: d, reason: collision with root package name */
        String f5921d;

        /* renamed from: e, reason: collision with root package name */
        String f5922e;

        /* renamed from: f, reason: collision with root package name */
        Receipt f5923f;

        public /* synthetic */ Builder(long j2, Currency currency, int i2) {
            this(j2, currency);
        }

        public Revenue build() {
            return new Revenue(this, 0);
        }

        public Builder withPayload(String str) {
            this.f5922e = str;
            return this;
        }

        public Builder withProductID(String str) {
            this.f5921d = str;
            return this;
        }

        public Builder withQuantity(Integer num) {
            this.f5920c = num;
            return this;
        }

        public Builder withReceipt(Receipt receipt) {
            this.f5923f = receipt;
            return this;
        }

        private Builder(long j2, Currency currency) {
            f5917g.a(currency);
            this.f5918a = j2;
            this.f5919b = currency;
        }
    }

    public static class Receipt {
        public final String data;
        public final String signature;

        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            private String f5924a;

            /* renamed from: b, reason: collision with root package name */
            private String f5925b;

            public /* synthetic */ Builder(int i2) {
                this();
            }

            public Receipt build() {
                return new Receipt(this, 0);
            }

            public Builder withData(String str) {
                this.f5924a = str;
                return this;
            }

            public Builder withSignature(String str) {
                this.f5925b = str;
                return this;
            }

            private Builder() {
            }
        }

        public /* synthetic */ Receipt(Builder builder, int i2) {
            this(builder);
        }

        public static Builder newBuilder() {
            return new Builder(0);
        }

        private Receipt(Builder builder) {
            this.data = builder.f5924a;
            this.signature = builder.f5925b;
        }
    }

    public /* synthetic */ Revenue(Builder builder, int i2) {
        this(builder);
    }

    public static Builder newBuilder(long j2, Currency currency) {
        return new Builder(j2, currency, 0);
    }

    private Revenue(Builder builder) {
        this.priceMicros = builder.f5918a;
        this.currency = builder.f5919b;
        this.quantity = builder.f5920c;
        this.productID = builder.f5921d;
        this.payload = builder.f5922e;
        this.receipt = builder.f5923f;
    }
}

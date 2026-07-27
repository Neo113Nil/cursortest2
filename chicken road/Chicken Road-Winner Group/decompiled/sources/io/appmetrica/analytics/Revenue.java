package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.C0572ie;
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
        private static final Gn f5113g = new Gn(new C0572ie("revenue currency"));

        /* renamed from: a, reason: collision with root package name */
        final long f5114a;

        /* renamed from: b, reason: collision with root package name */
        final Currency f5115b;

        /* renamed from: c, reason: collision with root package name */
        Integer f5116c;

        /* renamed from: d, reason: collision with root package name */
        String f5117d;

        /* renamed from: e, reason: collision with root package name */
        String f5118e;
        Receipt f;

        public /* synthetic */ Builder(long j3, Currency currency, int i3) {
            this(j3, currency);
        }

        public Revenue build() {
            return new Revenue(this, 0);
        }

        public Builder withPayload(String str) {
            this.f5118e = str;
            return this;
        }

        public Builder withProductID(String str) {
            this.f5117d = str;
            return this;
        }

        public Builder withQuantity(Integer num) {
            this.f5116c = num;
            return this;
        }

        public Builder withReceipt(Receipt receipt) {
            this.f = receipt;
            return this;
        }

        private Builder(long j3, Currency currency) {
            f5113g.a(currency);
            this.f5114a = j3;
            this.f5115b = currency;
        }
    }

    public static class Receipt {
        public final String data;
        public final String signature;

        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            private String f5119a;

            /* renamed from: b, reason: collision with root package name */
            private String f5120b;

            public /* synthetic */ Builder(int i3) {
                this();
            }

            public Receipt build() {
                return new Receipt(this, 0);
            }

            public Builder withData(String str) {
                this.f5119a = str;
                return this;
            }

            public Builder withSignature(String str) {
                this.f5120b = str;
                return this;
            }

            private Builder() {
            }
        }

        public /* synthetic */ Receipt(Builder builder, int i3) {
            this(builder);
        }

        public static Builder newBuilder() {
            return new Builder(0);
        }

        private Receipt(Builder builder) {
            this.data = builder.f5119a;
            this.signature = builder.f5120b;
        }
    }

    public /* synthetic */ Revenue(Builder builder, int i3) {
        this(builder);
    }

    public static Builder newBuilder(long j3, Currency currency) {
        return new Builder(j3, currency, 0);
    }

    private Revenue(Builder builder) {
        this.priceMicros = builder.f5114a;
        this.currency = builder.f5115b;
        this.quantity = builder.f5116c;
        this.productID = builder.f5117d;
        this.payload = builder.f5118e;
        this.receipt = builder.f;
    }
}

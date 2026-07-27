package com.unity3d.coherence;

/* loaded from: classes7.dex */
public final class CommonAttributesConfig {
    private final int eventId;
    private final int productId;

    private CommonAttributesConfig(int i, int i2) {
        this.productId = i;
        this.eventId = i2;
    }

    int getProductId() {
        return this.productId;
    }

    int getEventId() {
        return this.eventId;
    }

    public static final class Builder {
        private int productId = 0;
        private int eventId = 0;

        public Builder setProductId(int i) {
            this.productId = i;
            return this;
        }

        public Builder setEventId(int i) {
            this.eventId = i;
            return this;
        }

        public CommonAttributesConfig build() {
            return new CommonAttributesConfig(this.productId, this.eventId);
        }
    }
}

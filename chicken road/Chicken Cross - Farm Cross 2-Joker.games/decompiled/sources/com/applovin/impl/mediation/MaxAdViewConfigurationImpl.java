package com.applovin.impl.mediation;

import com.applovin.impl.sdk.p;
import com.applovin.mediation.MaxAdViewConfiguration;

/* loaded from: classes5.dex */
public class MaxAdViewConfigurationImpl implements MaxAdViewConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdViewConfiguration.AdaptiveType f4298a;
    private final int b;
    private final int c;

    public static class BuilderImpl implements MaxAdViewConfiguration.Builder {

        /* renamed from: a, reason: collision with root package name */
        private MaxAdViewConfiguration.AdaptiveType f4299a = MaxAdViewConfiguration.AdaptiveType.NONE;
        private int b = -1;
        private int c = -1;

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration build() {
            return new MaxAdViewConfigurationImpl(this);
        }

        public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
            return this.f4299a;
        }

        public int getAdaptiveWidth() {
            return this.b;
        }

        public int getInlineMaximumHeight() {
            return this.c;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveType(MaxAdViewConfiguration.AdaptiveType adaptiveType) {
            p.e("MaxAdViewConfiguration", "setAdaptiveType(adaptiveType=" + adaptiveType + ")");
            this.f4299a = adaptiveType;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveWidth(int i) {
            p.e("MaxAdViewConfiguration", "setAdaptiveWidth(adaptiveWidth=" + i + ")");
            this.b = i;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setInlineMaximumHeight(int i) {
            p.e("MaxAdViewConfiguration", "setInlineMaximumHeight(inlineMaximumHeight=" + i + ")");
            this.c = i;
            return this;
        }

        public String toString() {
            return "MaxAdViewConfiguration.Builder{adaptiveType=" + this.f4299a + ", adaptiveWidth=" + this.b + ", inlineMaximumHeight=" + this.c + "}";
        }
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
        return this.f4298a;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getAdaptiveWidth() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getInlineMaximumHeight() {
        return this.c;
    }

    public String toString() {
        return "MaxAdViewConfiguration{adaptiveType=" + this.f4298a + ", adaptiveWidth=" + this.b + ", inlineMaximumHeight=" + this.c + "}";
    }

    private MaxAdViewConfigurationImpl(BuilderImpl builderImpl) {
        this.f4298a = builderImpl.f4299a;
        this.b = builderImpl.b;
        this.c = builderImpl.c;
    }
}

package com.applovin.mediation;

import com.applovin.impl.mediation.MaxAdViewConfigurationImpl;

/* loaded from: classes.dex */
public interface MaxAdViewConfiguration {

    public enum AdaptiveType {
        NONE("none"),
        ANCHORED("anchored"),
        INLINE("inline");


        /* renamed from: a, reason: collision with root package name */
        private final String f4578a;

        AdaptiveType(String str) {
            this.f4578a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f4578a;
        }
    }

    public interface Builder {
        MaxAdViewConfiguration build();

        Builder setAdaptiveType(AdaptiveType adaptiveType);

        Builder setAdaptiveWidth(int i);

        Builder setInlineMaximumHeight(int i);
    }

    static Builder builder() {
        return new MaxAdViewConfigurationImpl.BuilderImpl();
    }

    AdaptiveType getAdaptiveType();

    int getAdaptiveWidth();

    int getInlineMaximumHeight();
}

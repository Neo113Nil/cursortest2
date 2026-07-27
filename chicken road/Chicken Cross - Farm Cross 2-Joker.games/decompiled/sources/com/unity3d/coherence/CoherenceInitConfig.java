package com.unity3d.coherence;

import android.content.Context;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class CoherenceInitConfig {
    public static final int SOURCE_ADS = 2;
    private final Context context;
    private final int source;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }

    private CoherenceInitConfig(Context context, int i) {
        this.context = context;
        this.source = i;
    }

    Context getContext() {
        return this.context;
    }

    int getSource() {
        return this.source;
    }

    public static final class Builder {
        private final Context context;
        private int source;

        public Builder(Context context) {
            Context applicationContext = ((Context) Objects.requireNonNull(context, "context must not be null")).getApplicationContext();
            this.context = applicationContext != null ? applicationContext : context;
        }

        public Builder setSource(int i) {
            this.source = i;
            return this;
        }

        public CoherenceInitConfig build() {
            return new CoherenceInitConfig(this.context, this.source);
        }
    }
}

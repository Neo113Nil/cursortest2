package com.google.common.base;

@com.google.common.base.ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class Ticker {
    private static final com.google.common.base.Ticker SYSTEM_TICKER = new com.google.common.base.Ticker() { // from class: com.google.common.base.Ticker.1
        @Override // com.google.common.base.Ticker
        public long read() {
            return java.lang.System.nanoTime();
        }
    };

    public abstract long read();

    protected Ticker() {
    }

    public static com.google.common.base.Ticker systemTicker() {
        return SYSTEM_TICKER;
    }
}

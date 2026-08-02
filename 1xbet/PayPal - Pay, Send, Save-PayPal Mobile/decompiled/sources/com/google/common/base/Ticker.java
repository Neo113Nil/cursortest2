package com.google.common.base;

/* loaded from: classes4.dex */
public abstract class Ticker {
    private static final com.google.common.base.Ticker SYSTEM_TICKER = new com.google.common.base.Ticker() { // from class: com.google.common.base.Ticker.1
        @Override // com.google.common.base.Ticker
        public long read() {
            return java.lang.System.nanoTime();
        }
    };

    public abstract long read();

    public static com.google.common.base.Ticker systemTicker() {
        return SYSTEM_TICKER;
    }
}

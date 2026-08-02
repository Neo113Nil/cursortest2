package com.google.crypto.tink.config;

/* loaded from: classes4.dex */
public final class GlobalTinkFlags {
    public static final com.google.crypto.tink.config.TinkFlag validateKeysetsOnParsing = new com.google.crypto.tink.config.GlobalTinkFlags.TinkFlagImpl(false);

    static class TinkFlagImpl implements com.google.crypto.tink.config.TinkFlag {
        private final java.util.concurrent.atomic.AtomicBoolean b;

        TinkFlagImpl(boolean z) {
            this.b = new java.util.concurrent.atomic.AtomicBoolean(z);
        }

        @Override // com.google.crypto.tink.config.TinkFlag
        public boolean getValue() {
            return this.b.get();
        }

        @Override // com.google.crypto.tink.config.TinkFlag
        public void setValue(boolean z) {
            this.b.set(z);
        }
    }

    private GlobalTinkFlags() {
    }
}

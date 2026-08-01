package com.unity3d.coherence;

import java.util.Objects;

/* loaded from: classes7.dex */
public final class CoherencePipelineConfig {
    private final int concurrency;
    private final byte[] wasmBytes;

    private CoherencePipelineConfig(byte[] bArr, int i) {
        this.wasmBytes = bArr;
        this.concurrency = i;
    }

    byte[] getWasmBytes() {
        return this.wasmBytes;
    }

    int getConcurrency() {
        return this.concurrency;
    }

    public static final class Builder {
        private int concurrency = 1;
        private byte[] wasmBytes;

        public Builder setWasmBytes(byte[] bArr) {
            this.wasmBytes = (byte[]) ((byte[]) Objects.requireNonNull(bArr, "wasmBytes must not be null")).clone();
            return this;
        }

        public Builder setConcurrency(int i) {
            this.concurrency = i;
            return this;
        }

        public CoherencePipelineConfig build() {
            return new CoherencePipelineConfig(this.wasmBytes, this.concurrency);
        }
    }
}

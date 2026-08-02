package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes9.dex */
interface MutabilityOracle {
    public static final com.google.crypto.tink.shaded.protobuf.MutabilityOracle IMMUTABLE = new com.google.crypto.tink.shaded.protobuf.MutabilityOracle() { // from class: com.google.crypto.tink.shaded.protobuf.MutabilityOracle.1
        @Override // com.google.crypto.tink.shaded.protobuf.MutabilityOracle
        public void ensureMutable() {
            throw new java.lang.UnsupportedOperationException();
        }
    };

    void ensureMutable();
}

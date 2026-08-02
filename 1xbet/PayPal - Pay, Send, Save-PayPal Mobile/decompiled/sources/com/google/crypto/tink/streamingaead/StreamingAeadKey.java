package com.google.crypto.tink.streamingaead;

/* loaded from: classes9.dex */
public abstract class StreamingAeadKey extends com.google.crypto.tink.Key {
    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return null;
    }

    @Override // com.google.crypto.tink.Key
    public abstract com.google.crypto.tink.streamingaead.StreamingAeadParameters getParameters();
}

package com.google.crypto.tink.keyderivation;

/* loaded from: classes9.dex */
public abstract class KeyDerivationParameters extends com.google.crypto.tink.Parameters {
    public abstract com.google.crypto.tink.Parameters getDerivedKeyParameters();

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return getDerivedKeyParameters().hasIdRequirement();
    }
}

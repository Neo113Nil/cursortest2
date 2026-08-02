package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
public abstract class JwtMacKey extends com.google.crypto.tink.Key {
    public abstract java.util.Optional<java.lang.String> getKid();

    @Override // com.google.crypto.tink.Key
    public abstract com.google.crypto.tink.jwt.JwtMacParameters getParameters();
}

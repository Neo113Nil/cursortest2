package com.google.crypto.tink.tinkkey;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public interface TinkKey {
    com.google.crypto.tink.KeyTemplate getKeyTemplate();

    boolean hasSecret();
}

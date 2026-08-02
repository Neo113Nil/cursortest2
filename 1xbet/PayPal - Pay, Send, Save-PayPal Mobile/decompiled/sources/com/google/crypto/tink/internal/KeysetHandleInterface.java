package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public interface KeysetHandleInterface {

    public interface Entry {
        int getId();

        com.google.crypto.tink.Key getKey();

        com.google.crypto.tink.KeyStatus getStatus();

        boolean isPrimary();
    }

    com.google.crypto.tink.internal.KeysetHandleInterface.Entry getAt(int i);

    com.google.crypto.tink.internal.KeysetHandleInterface.Entry getPrimary();

    int size();
}

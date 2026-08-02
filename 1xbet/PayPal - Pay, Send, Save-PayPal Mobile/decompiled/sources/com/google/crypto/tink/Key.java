package com.google.crypto.tink;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public abstract class Key {
    public abstract boolean equalsKey(com.google.crypto.tink.Key key);

    @javax.annotation.Nullable
    public abstract java.lang.Integer getIdRequirementOrNull();

    public abstract com.google.crypto.tink.Parameters getParameters();
}

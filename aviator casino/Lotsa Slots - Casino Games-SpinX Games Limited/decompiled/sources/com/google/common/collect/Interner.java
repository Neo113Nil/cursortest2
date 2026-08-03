package com.google.common.collect;

@com.google.errorprone.annotations.DoNotMock("Use Interners.new*Interner")
@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface Interner<E> {
    E intern(E sample);
}

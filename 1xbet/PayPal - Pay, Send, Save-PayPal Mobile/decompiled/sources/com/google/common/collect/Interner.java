package com.google.common.collect;

@com.google.errorprone.annotations.DoNotMock("Use Interners.new*Interner")
/* loaded from: classes9.dex */
public interface Interner<E> {
    E intern(E e);
}

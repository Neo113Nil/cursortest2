package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;

@DoNotMock("Use Interners.new*Interner")
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public interface Interner<E> {
    E intern(E sample);
}

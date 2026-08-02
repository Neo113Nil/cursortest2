package com.google.common.io;

/* loaded from: classes9.dex */
public interface LineProcessor<T> {
    T getResult();

    boolean processLine(java.lang.String str) throws java.io.IOException;
}

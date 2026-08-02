package com.google.common.base;

/* loaded from: classes2.dex */
interface PatternCompiler {
    CommonPattern compile(String pattern);

    boolean isPcreLike();
}

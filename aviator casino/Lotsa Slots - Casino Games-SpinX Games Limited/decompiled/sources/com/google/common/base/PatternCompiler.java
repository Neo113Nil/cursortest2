package com.google.common.base;

@com.google.common.base.ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
interface PatternCompiler {
    com.google.common.base.CommonPattern compile(java.lang.String pattern);

    boolean isPcreLike();
}

package com.google.common.base;

@com.google.common.base.ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
abstract class CommonMatcher {
    public abstract int end();

    public abstract boolean find();

    public abstract boolean find(int index);

    public abstract boolean matches();

    public abstract java.lang.String replaceAll(java.lang.String replacement);

    public abstract int start();

    CommonMatcher() {
    }
}

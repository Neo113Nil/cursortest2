package com.google.common.collect;

/* loaded from: classes4.dex */
final class CollectPreconditions {
    static void checkEntryNotNull(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException("null key in entry: null=".concat(java.lang.String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("null value in entry: ");
        sb.append(obj);
        sb.append("=null");
        throw new java.lang.NullPointerException(sb.toString());
    }

    static int checkNonnegative(int i, java.lang.String str) {
        if (i >= 0) {
            return i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static long checkNonnegative(long j, java.lang.String str) {
        if (j >= 0) {
            return j;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(j);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static void checkPositive(int i, java.lang.String str) {
        if (i > 0) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" must be positive but was: ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static void checkRemove(boolean z) {
        com.google.common.base.Preconditions.checkState(z, "no calls to next() since the last call to remove()");
    }

    private CollectPreconditions() {
    }
}

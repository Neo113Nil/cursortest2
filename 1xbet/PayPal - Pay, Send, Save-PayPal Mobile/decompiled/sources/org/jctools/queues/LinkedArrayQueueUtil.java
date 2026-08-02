package org.jctools.queues;

/* loaded from: classes5.dex */
final class LinkedArrayQueueUtil {
    LinkedArrayQueueUtil() {
    }

    static int length(java.lang.Object[] objArr) {
        return objArr.length;
    }

    static long modifiedCalcCircularRefElementOffset(long j, long j2) {
        return org.jctools.util.UnsafeRefArrayAccess.REF_ARRAY_BASE + ((j & j2) << (org.jctools.util.UnsafeRefArrayAccess.REF_ELEMENT_SHIFT - 1));
    }

    static long nextArrayOffset(java.lang.Object[] objArr) {
        return org.jctools.util.UnsafeRefArrayAccess.REF_ARRAY_BASE + ((length(objArr) - 1) << org.jctools.util.UnsafeRefArrayAccess.REF_ELEMENT_SHIFT);
    }
}

package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzfd implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.String) ((java.util.Map.Entry) obj).getKey()).compareTo((java.lang.String) ((java.util.Map.Entry) obj2).getKey());
    }

    zzfd() {
    }
}

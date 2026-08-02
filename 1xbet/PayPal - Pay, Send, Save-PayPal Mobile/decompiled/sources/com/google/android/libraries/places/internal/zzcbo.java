package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcbo extends java.util.LinkedHashMap {
    /* synthetic */ zzcbo(byte[] bArr) {
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(java.util.Map.Entry entry) {
        return size() > 100;
    }

    private zzcbo() {
        throw null;
    }
}

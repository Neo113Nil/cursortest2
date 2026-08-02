package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzna extends java.util.LinkedHashMap {
    zzna(int i, float f, boolean z) {
        super(16, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(java.util.Map.Entry entry) {
        return size() > 10;
    }
}

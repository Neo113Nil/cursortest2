package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbef implements java.util.Map.Entry {
    private final java.util.Map.Entry zza;

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (((com.google.android.libraries.places.internal.zzbeh) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (obj instanceof com.google.android.libraries.places.internal.zzbex) {
            return ((com.google.android.libraries.places.internal.zzbeh) this.zza.getValue()).zza((com.google.android.libraries.places.internal.zzbex) obj);
        }
        throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final com.google.android.libraries.places.internal.zzbeh zza() {
        return (com.google.android.libraries.places.internal.zzbeh) this.zza.getValue();
    }
}

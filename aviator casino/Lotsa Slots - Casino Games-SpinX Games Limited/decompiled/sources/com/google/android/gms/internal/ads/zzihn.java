package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzihn extends com.google.android.gms.internal.ads.zzihk implements java.util.Set, kotlin.jvm.internal.markers.KMappedMarker {
    private final java.util.Set zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzihn(java.util.Set delegate) {
        super(delegate);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // com.google.android.gms.internal.ads.zzihk, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return super.contains((java.util.Map.Entry) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzihk, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.zzihm(this.zza.iterator());
    }
}

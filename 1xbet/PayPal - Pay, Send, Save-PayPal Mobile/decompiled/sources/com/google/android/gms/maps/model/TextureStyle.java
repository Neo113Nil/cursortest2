package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public class TextureStyle extends com.google.android.gms.maps.model.StampStyle {
    /* synthetic */ TextureStyle(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, com.google.android.gms.maps.model.zzaf zzafVar) {
        super(bitmapDescriptor);
    }

    public static com.google.android.gms.maps.model.TextureStyle.Builder newBuilder(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        return new com.google.android.gms.maps.model.TextureStyle.Builder(null).stamp(bitmapDescriptor);
    }

    public static final class Builder extends com.google.android.gms.maps.model.StampStyle.Builder<com.google.android.gms.maps.model.TextureStyle.Builder> {
        public final com.google.android.gms.maps.model.TextureStyle build() {
            return new com.google.android.gms.maps.model.TextureStyle(this.zza, null);
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        protected final /* bridge */ /* synthetic */ com.google.android.gms.maps.model.TextureStyle.Builder self() {
            return this;
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        /* renamed from: self, reason: avoid collision after fix types in other method */
        protected final com.google.android.gms.maps.model.TextureStyle.Builder self2() {
            return this;
        }

        /* synthetic */ Builder(com.google.android.gms.maps.model.zzaf zzafVar) {
        }

        private Builder() {
            throw null;
        }
    }
}

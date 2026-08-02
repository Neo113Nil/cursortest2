package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public class SpriteStyle extends com.google.android.gms.maps.model.StampStyle {
    public SpriteStyle(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        super(bitmapDescriptor);
    }

    public static com.google.android.gms.maps.model.SpriteStyle.Builder newBuilder(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        return new com.google.android.gms.maps.model.SpriteStyle.Builder(null).stamp(bitmapDescriptor);
    }

    public static final class Builder extends com.google.android.gms.maps.model.StampStyle.Builder<com.google.android.gms.maps.model.SpriteStyle.Builder> {
        public final com.google.android.gms.maps.model.SpriteStyle build() {
            return new com.google.android.gms.maps.model.SpriteStyle(this.zza);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        protected final com.google.android.gms.maps.model.SpriteStyle.Builder self() {
            return this;
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        protected final /* bridge */ /* synthetic */ com.google.android.gms.maps.model.SpriteStyle.Builder self() {
            return this;
        }

        /* synthetic */ Builder(com.google.android.gms.maps.model.zzv zzvVar) {
        }

        private Builder() {
            throw null;
        }
    }
}

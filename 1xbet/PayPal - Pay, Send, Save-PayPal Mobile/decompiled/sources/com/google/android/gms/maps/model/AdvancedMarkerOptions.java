package com.google.android.gms.maps.model;

/* loaded from: classes.dex */
public class AdvancedMarkerOptions extends com.google.android.gms.maps.model.MarkerOptions {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes3.dex */
    public @interface CollisionBehavior {
        public static final int OPTIONAL_AND_HIDES_LOWER_PRIORITY = 2;
        public static final int REQUIRED = 0;
        public static final int REQUIRED_AND_HIDES_OPTIONAL = 1;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public com.google.android.gms.maps.model.AdvancedMarkerOptions alpha(float f) {
        super.alpha(f);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public com.google.android.gms.maps.model.AdvancedMarkerOptions anchor(float f, float f2) {
        super.anchor(f, f2);
        return this;
    }

    public com.google.android.gms.maps.model.AdvancedMarkerOptions collisionBehavior(@com.google.android.gms.maps.model.AdvancedMarkerOptions.CollisionBehavior int i) {
        super.zzd(i);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public com.google.android.gms.maps.model.AdvancedMarkerOptions contentDescription(java.lang.String str) {
        super.contentDescription(str);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public com.google.android.gms.maps.model.AdvancedMarkerOptions draggable(boolean z) {
        super.draggable(z);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public com.google.android.gms.maps.model.AdvancedMarkerOptions flat(boolean z) {
        super.flat(z);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public com.google.android.gms.maps.model.AdvancedMarkerOptions icon(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        super.icon(bitmapDescriptor);
        return this;
    }

    public com.google.android.gms.maps.model.AdvancedMarkerOptions iconView(android.view.View view) {
        zze(view);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public com.google.android.gms.maps.model.AdvancedMarkerOptions infoWindowAnchor(float f, float f2) {
        super.infoWindowAnchor(f, f2);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public com.google.android.gms.maps.model.AdvancedMarkerOptions position(com.google.android.gms.maps.model.LatLng latLng) {
        super.position(latLng);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public com.google.android.gms.maps.model.AdvancedMarkerOptions rotation(float f) {
        super.rotation(f);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public com.google.android.gms.maps.model.AdvancedMarkerOptions snippet(java.lang.String str) {
        super.snippet(str);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public com.google.android.gms.maps.model.AdvancedMarkerOptions title(java.lang.String str) {
        super.title(str);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public com.google.android.gms.maps.model.AdvancedMarkerOptions visible(boolean z) {
        super.visible(z);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public com.google.android.gms.maps.model.AdvancedMarkerOptions zIndex(float f) {
        super.zIndex(f);
        return this;
    }

    public android.view.View getIconView() {
        return super.zzc();
    }

    public int getCollisionBehavior() {
        return super.zza();
    }
}

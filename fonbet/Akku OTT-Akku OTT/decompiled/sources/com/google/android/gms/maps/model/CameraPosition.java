package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class CameraPosition extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<CameraPosition> CREATOR = new zza();
    public final float bearing;

    @NonNull
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    public static final class Builder {
        private LatLng zza;
        private float zzb;
        private float zzc;
        private float zzd;

        public Builder() {
        }

        @NonNull
        public Builder bearing(float f) {
            this.zzd = f;
            return this;
        }

        @NonNull
        public CameraPosition build() {
            return new CameraPosition(this.zza, this.zzb, this.zzc, this.zzd);
        }

        @NonNull
        public Builder target(@NonNull LatLng latLng) {
            C0875q.h(latLng, "location must not be null.");
            this.zza = latLng;
            return this;
        }

        @NonNull
        public Builder tilt(float f) {
            this.zzc = f;
            return this;
        }

        @NonNull
        public Builder zoom(float f) {
            this.zzb = f;
            return this;
        }

        public Builder(@NonNull CameraPosition cameraPosition) {
            C0875q.h(cameraPosition, "previous must not be null.");
            this.zza = cameraPosition.target;
            this.zzb = cameraPosition.zoom;
            this.zzc = cameraPosition.tilt;
            this.zzd = cameraPosition.bearing;
        }
    }

    public CameraPosition(@NonNull LatLng latLng, float f, float f2, float f3) {
        C0875q.h(latLng, "camera target must not be null.");
        boolean z = false;
        if (f2 >= 0.0f && f2 <= 90.0f) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Tilt needs to be between 0 and 90 inclusive: " + f2);
        }
        this.target = latLng;
        this.zoom = f;
        this.tilt = f2 + 0.0f;
        this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @Nullable
    public static CameraPosition createFromAttributes(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, com.google.android.gms.maps.a.a);
        LatLng latLng = new LatLng(obtainAttributes.hasValue(5) ? obtainAttributes.getFloat(5, 0.0f) : 0.0f, obtainAttributes.hasValue(6) ? obtainAttributes.getFloat(6, 0.0f) : 0.0f);
        Builder builder = builder();
        builder.target(latLng);
        if (obtainAttributes.hasValue(8)) {
            builder.zoom(obtainAttributes.getFloat(8, 0.0f));
        }
        if (obtainAttributes.hasValue(2)) {
            builder.bearing(obtainAttributes.getFloat(2, 0.0f));
        }
        if (obtainAttributes.hasValue(7)) {
            builder.tilt(obtainAttributes.getFloat(7, 0.0f));
        }
        obtainAttributes.recycle();
        return builder.build();
    }

    @NonNull
    public static final CameraPosition fromLatLngZoom(@NonNull LatLng latLng, float f) {
        return new CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.target, Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    @NonNull
    public String toString() {
        C0874p.a aVar = new C0874p.a(this);
        aVar.a(this.target, "target");
        aVar.a(Float.valueOf(this.zoom), "zoom");
        aVar.a(Float.valueOf(this.tilt), "tilt");
        aVar.a(Float.valueOf(this.bearing), "bearing");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.k(parcel, 2, this.target, i, false);
        float f = this.zoom;
        c.s(parcel, 3, 4);
        parcel.writeFloat(f);
        float f2 = this.tilt;
        c.s(parcel, 4, 4);
        parcel.writeFloat(f2);
        float f3 = this.bearing;
        c.s(parcel, 5, 4);
        parcel.writeFloat(f3);
        c.r(parcel, q);
    }

    @NonNull
    public static Builder builder(@NonNull CameraPosition cameraPosition) {
        return new Builder(cameraPosition);
    }
}

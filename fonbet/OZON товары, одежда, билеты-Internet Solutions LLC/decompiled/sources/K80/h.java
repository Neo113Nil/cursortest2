package K80;

import android.location.Location;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends LocationCallback {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ k f15380e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ FusedLocationProviderClient f15381f;

    h(k kVar, FusedLocationProviderClient fusedLocationProviderClient) {
        this.f15380e = kVar;
        this.f15381f = fusedLocationProviderClient;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        Intrinsics.checkNotNullParameter(locationResult, "locationResult");
        for (Location location : locationResult.getLocations()) {
            if (location != null) {
                this.f15380e.a(location);
                this.f15381f.removeLocationUpdates(this);
                return;
            }
        }
    }
}

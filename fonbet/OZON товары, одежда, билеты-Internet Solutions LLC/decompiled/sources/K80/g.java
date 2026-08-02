package K80;

import B90.C2617t;
import K80.g;
import Sc.InterfaceC3999a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnFailureListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K80.a f15377a;

    public final class a implements LocationListener {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f15378c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocationManager f15379d;

        a(k kVar, LocationManager locationManager) {
            this.f15378c = kVar;
            this.f15379d = locationManager;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            this.f15378c.a(location);
            this.f15379d.removeUpdates(this);
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
        }

        @Override // android.location.LocationListener
        @InterfaceC3999a
        public final void onStatusChanged(String str, int i11, Bundle bundle) {
        }
    }

    public g(@NotNull K80.a fintechLocationConfig) {
        Intrinsics.checkNotNullParameter(fintechLocationConfig, "fintechLocationConfig");
        this.f15377a = fintechLocationConfig;
    }

    @Override // K80.b
    public final void a(@NotNull final Context context, @NotNull final j locationCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationCallback, "locationCallback");
        this.f15377a.getClass();
        OnFailureListener failureCallback = new OnFailureListener() { // from class: K80.f
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                String str;
                Intrinsics.checkNotNullParameter(it, "it");
                j locationCallback2 = locationCallback;
                g.this.getClass();
                Context context2 = context;
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(locationCallback2, "locationCallback");
                LocationManager locationManager = (LocationManager) androidx.core.content.a.getSystemService(context2, LocationManager.class);
                if (locationManager != null) {
                    Criteria criteria = new Criteria();
                    criteria.setAccuracy(1);
                    str = locationManager.getBestProvider(criteria, true);
                } else {
                    str = null;
                }
                if (str != null) {
                    locationCallback2.a(locationManager.getLastKnownLocation(str));
                } else {
                    locationCallback2.a(null);
                }
            }
        };
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationCallback, "locationCallback");
        Intrinsics.checkNotNullParameter(failureCallback, "failureCallback");
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        fusedLocationProviderClient.getLastLocation().addOnSuccessListener(new C2617t(new c(locationCallback, 0))).addOnFailureListener(failureCallback);
    }

    @Override // K80.b
    @SuppressLint({"MissingPermission"})
    public final void b(@NotNull final Context context, @NotNull final k locationCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationCallback, "locationCallback");
        this.f15377a.getClass();
        OnFailureListener failureCallback = new OnFailureListener() { // from class: K80.d
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                k locationCallback2 = locationCallback;
                g.this.getClass();
                Context context2 = context;
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(locationCallback2, "locationCallback");
                LocationManager locationManager = (LocationManager) androidx.core.content.a.getSystemService(context2, LocationManager.class);
                if (locationManager != null) {
                    Criteria criteria = new Criteria();
                    criteria.setAccuracy(1);
                    String bestProvider = locationManager.getBestProvider(criteria, true);
                    if (bestProvider != null) {
                        Location lastKnownLocation = locationManager.getLastKnownLocation(bestProvider);
                        if (lastKnownLocation != null) {
                            locationCallback2.a(lastKnownLocation);
                        } else {
                            locationManager.requestLocationUpdates("gps", 1000L, 1.0f, new g.a(locationCallback2, locationManager));
                        }
                    }
                }
            }
        };
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationCallback, "locationCallback");
        Intrinsics.checkNotNullParameter(failureCallback, "failureCallback");
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        fusedLocationProviderClient.getLastLocation().addOnSuccessListener(new DL.a(new e(locationCallback, fusedLocationProviderClient), 2)).addOnFailureListener(failureCallback);
    }
}

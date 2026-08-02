package K80;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FusedLocationProviderClient f15372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f15373b;

    public /* synthetic */ e(k kVar, FusedLocationProviderClient fusedLocationProviderClient) {
        this.f15372a = fusedLocationProviderClient;
        this.f15373b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Location location = (Location) obj;
        k kVar = this.f15373b;
        if (location == null) {
            LocationRequest create = LocationRequest.create();
            create.setInterval(1000L);
            create.setFastestInterval(1000L);
            create.setPriority(100);
            FusedLocationProviderClient fusedLocationProviderClient = this.f15372a;
            fusedLocationProviderClient.requestLocationUpdates(create, new h(kVar, fusedLocationProviderClient), (Looper) null);
        } else {
            kVar.a(location);
        }
        return Unit.f71690a;
    }
}

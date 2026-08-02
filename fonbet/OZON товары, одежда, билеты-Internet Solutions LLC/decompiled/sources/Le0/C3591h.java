package Le0;

import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;
import we0.C10551g;

/* renamed from: Le0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3591h {
    public static final C10551g a(CameraPosition cameraPosition) {
        LatLng latLng = cameraPosition.target;
        return new C10551g(latLng != null ? c(latLng) : new we0.m(0.0d, 0.0d), (float) (cameraPosition.zoom + 1), (float) cameraPosition.bearing, (float) cameraPosition.tilt);
    }

    public static final we0.i b(Xf.b bVar) {
        try {
            LatLng latLng = bVar.f34457a;
            Intrinsics.f(latLng);
            we0.m c11 = c(latLng);
            LatLng latLng2 = bVar.f34458b;
            Intrinsics.f(latLng2);
            we0.m c12 = c(latLng2);
            LatLng latLng3 = bVar.f34459c;
            Intrinsics.f(latLng3);
            we0.m c13 = c(latLng3);
            LatLng latLng4 = bVar.f34460d;
            Intrinsics.f(latLng4);
            return new we0.i(c11, c12, c(latLng4), c13);
        } catch (Exception unused) {
            LatLngBounds latLngBounds = bVar.f34461e;
            return new we0.i(c(latLngBounds.getNorthWest()), c(latLngBounds.getNorthEast()), c(latLngBounds.getSouthEast()), c(latLngBounds.getSouthWest()));
        }
    }

    private static final we0.m c(LatLng latLng) {
        return new we0.m(latLng.getLatitude(), latLng.getLongitude());
    }
}

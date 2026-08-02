package ag;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* loaded from: classes10.dex */
public final class g extends C5019a {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements LocationListener {

        /* renamed from: c, reason: collision with root package name */
        private final c<f> f36776c;

        /* renamed from: d, reason: collision with root package name */
        private Location f36777d;

        a(c<f> cVar) {
            this.f36776c = cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        
            if (r3 == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
        
            if (r4 != false) goto L46;
         */
        @Override // android.location.LocationListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onLocationChanged(Location location) {
            Location location2 = this.f36777d;
            if (location2 != null) {
                long time = location.getTime() - location2.getTime();
                boolean z11 = true;
                boolean z12 = time > 120000;
                boolean z13 = time < -120000;
                boolean z14 = time > 0;
                if (!z12) {
                    if (!z13) {
                        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
                        boolean z15 = accuracy > 0;
                        boolean z16 = accuracy < 0;
                        boolean z17 = accuracy > 200;
                        String provider = location.getProvider();
                        String provider2 = location2.getProvider();
                        if (provider != null) {
                            z11 = provider.equals(provider2);
                        } else if (provider2 != null) {
                            z11 = false;
                        }
                        if (!z16) {
                            if (z14) {
                            }
                            if (z14) {
                                if (!z17) {
                                }
                            }
                        }
                    }
                    this.f36776c.a(f.a(this.f36777d));
                }
            }
            this.f36777d = location;
            this.f36776c.a(f.a(this.f36777d));
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            Lm0.a.f17149a.d(Nk.a.b("onProviderDisabled: ", str), new Object[0]);
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
            Lm0.a.f17149a.d(Nk.a.b("onProviderEnabled: ", str), new Object[0]);
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i11, Bundle bundle) {
            Lm0.a.f17149a.d(Nk.a.b("onStatusChanged: ", str), new Object[0]);
        }
    }
}

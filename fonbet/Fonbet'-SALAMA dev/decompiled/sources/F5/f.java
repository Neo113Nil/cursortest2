package F5;

import A5.x;
import w1.F0;

/* loaded from: classes2.dex */
public interface f {
    static void a(A5.f fVar, c cVar) {
        Object obj = null;
        F0 f02 = new F0(fVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", new x(), obj, 1);
        if (cVar != null) {
            f02.M(new e(cVar, 0));
        } else {
            f02.M(null);
        }
        F0 f03 = new F0(fVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", new x(), obj, 1);
        if (cVar != null) {
            f03.M(new e(cVar, 1));
        } else {
            f03.M(null);
        }
        F0 f04 = new F0(fVar, "dev.flutter.pigeon.FirebaseAppHostApi.delete", new x(), obj, 1);
        if (cVar != null) {
            f04.M(new e(cVar, 2));
        } else {
            f04.M(null);
        }
    }
}

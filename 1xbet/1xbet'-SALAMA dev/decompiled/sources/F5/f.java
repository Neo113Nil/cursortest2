package F5;

import A5.x;
import p155w1.F0;

/* JADX INFO: loaded from: classes2.dex */
public interface f {
    static void a(A5.f fVar, c cVar) {
        Object obj = null;
        F0 f7 = new F0(fVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", new x(), obj, 1);
        if (cVar != null) {
            f7.M(new e(cVar, 0));
        } else {
            f7.M(null);
        }
        F0 f8 = new F0(fVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", new x(), obj, 1);
        if (cVar != null) {
            f8.M(new e(cVar, 1));
        } else {
            f8.M(null);
        }
        F0 f9 = new F0(fVar, "dev.flutter.pigeon.FirebaseAppHostApi.delete", new x(), obj, 1);
        if (cVar != null) {
            f9.M(new e(cVar, 2));
        } else {
            f9.M(null);
        }
    }
}

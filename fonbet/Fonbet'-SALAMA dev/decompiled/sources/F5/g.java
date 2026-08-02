package F5;

import w1.F0;

/* loaded from: classes2.dex */
public interface g {
    static void b(A5.f fVar, c cVar) {
        h hVar = h.f2767d;
        Object obj = null;
        F0 f02 = new F0(fVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", hVar, obj, 1);
        if (cVar != null) {
            f02.M(new e(cVar, 3));
        } else {
            f02.M(null);
        }
        F0 f03 = new F0(fVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", hVar, obj, 1);
        if (cVar != null) {
            f03.M(new e(cVar, 4));
        } else {
            f03.M(null);
        }
        F0 f04 = new F0(fVar, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", hVar, obj, 1);
        if (cVar != null) {
            f04.M(new e(cVar, 5));
        } else {
            f04.M(null);
        }
    }
}

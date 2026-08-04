package F5;

import p155w1.F0;

/* JADX INFO: loaded from: classes2.dex */
public interface g {
    static void b(A5.f fVar, c cVar) {
        h hVar = h.f2767d;
        Object obj = null;
        F0 f7 = new F0(fVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", hVar, obj, 1);
        if (cVar != null) {
            f7.M(new e(cVar, 3));
        } else {
            f7.M(null);
        }
        F0 f8 = new F0(fVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", hVar, obj, 1);
        if (cVar != null) {
            f8.M(new e(cVar, 4));
        } else {
            f8.M(null);
        }
        F0 f9 = new F0(fVar, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", hVar, obj, 1);
        if (cVar != null) {
            f9.M(new e(cVar, 5));
        } else {
            f9.M(null);
        }
    }
}

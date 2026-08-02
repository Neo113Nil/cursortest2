package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;
import w1.L;

/* loaded from: classes.dex */
public class zzadr {
    private zzadr() {
    }

    public static Object zza(String str, Type type) {
        if (type != String.class) {
            if (type == Void.class) {
                return null;
            }
            try {
                try {
                    return ((zzadt) ((Class) type).getConstructor(null).newInstance(null)).zza(str);
                } catch (Exception e7) {
                    throw new zzabg(L.i("Json conversion failed! ", e7.getMessage()), e7);
                }
            } catch (Exception e8) {
                throw new zzabg("Instantiation of JsonResponse failed! ".concat(String.valueOf(type)), e8);
            }
        }
        try {
            zzafj zzafjVar = (zzafj) new zzafj().zza(str);
            if (zzafjVar.zzb()) {
                return zzafjVar.zza();
            }
            throw new zzabg("No error message: " + str);
        } catch (Exception e9) {
            throw new zzabg(L.i("Json conversion failed! ", e9.getMessage()), e9);
        }
    }
}

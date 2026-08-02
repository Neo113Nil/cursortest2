package Nm0;

import androidx.annotation.NonNull;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@NonNull Om0.a aVar, Mm0.e eVar, String str, Boolean bool) {
        Om0.a aVar2 = bool.booleanValue() ? (Om0.a) aVar.remove(eVar.name()) : (Om0.a) aVar.get(eVar.name());
        if (aVar2 != null) {
            for (String str2 : aVar2.keySet()) {
                aVar.put(String.format(str, str2), (Serializable) aVar2.get(str2));
            }
        }
    }
}

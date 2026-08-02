package Oe;

import I0.C3173b;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class K {
    public static final void a(int i11, int i12, @NotNull Me.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList missingFields = new ArrayList();
        int i13 = (~i11) & i12;
        for (int i14 = 0; i14 < 32; i14++) {
            if ((i13 & 1) != 0) {
                missingFields.add(descriptor.e(i14));
            }
            i13 >>>= 1;
        }
        String serialName = descriptor.f();
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        String c11 = missingFields.size() == 1 ? C3173b.c(new StringBuilder("Field '"), (String) missingFields.get(0), "' is required for type with serial name '", serialName, "', but it was missing") : "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing";
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        throw new Le.b(c11, null);
    }
}

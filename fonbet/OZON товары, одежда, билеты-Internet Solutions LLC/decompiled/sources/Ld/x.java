package Ld;

import Ld.w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class x {
    public static final y a(@NotNull w wVar, @NotNull Sd.b classId, @NotNull Rd.e jvmMetadataVersion) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        w.a.b a11 = wVar.a(classId, jvmMetadataVersion);
        if (a11 != null) {
            return a11.a();
        }
        return null;
    }
}

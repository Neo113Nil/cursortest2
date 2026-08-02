package Oe;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class O {
    public static final int a(@NotNull Me.f fVar, @NotNull Me.f[] typeParams) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int hashCode = (fVar.f().hashCode() * 31) + Arrays.hashCode(typeParams);
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Me.j jVar = new Me.j(fVar);
        Iterator<Me.f> it = jVar.iterator();
        int i11 = 1;
        int i12 = 1;
        while (true) {
            Me.i iVar = (Me.i) it;
            int i13 = 0;
            if (!iVar.hasNext()) {
                break;
            }
            int i14 = i12 * 31;
            String f7 = ((Me.f) iVar.next()).f();
            if (f7 != null) {
                i13 = f7.hashCode();
            }
            i12 = i14 + i13;
        }
        Iterator<Me.f> it2 = jVar.iterator();
        while (true) {
            Me.i iVar2 = (Me.i) it2;
            if (!iVar2.hasNext()) {
                return (((hashCode * 31) + i12) * 31) + i11;
            }
            int i15 = i11 * 31;
            Me.m kind = ((Me.f) iVar2.next()).getKind();
            i11 = i15 + (kind != null ? kind.hashCode() : 0);
        }
    }
}

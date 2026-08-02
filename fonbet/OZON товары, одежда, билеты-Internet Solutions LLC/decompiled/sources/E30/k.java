package E30;

import E30.j;
import Sc.o;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k {
    @NotNull
    public static final String a(@NotNull j jVar, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (jVar instanceof j.c) {
            j.c cVar = (j.c) jVar;
            String string = context.getString(cVar.a(), cVar.b());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (jVar instanceof j.d) {
            return ((j.d) jVar).a();
        }
        if (!(jVar instanceof j.b)) {
            if (jVar instanceof j.a) {
                return "";
            }
            throw new o();
        }
        j.b bVar = (j.b) jVar;
        String quantityString = context.getResources().getQuantityString(bVar.b(), bVar.a(), Integer.valueOf(bVar.a()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }
}

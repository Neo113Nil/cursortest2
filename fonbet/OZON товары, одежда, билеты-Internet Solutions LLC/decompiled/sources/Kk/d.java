package Kk;

import GZ.j;
import He.g;
import S7.r;
import Ui.C4069c;
import android.graphics.Rect;
import android.os.Bundle;
import androidx.fragment.app.M;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.internal.F;
import g8.e;
import h8.C6874b;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final /* synthetic */ class d implements M, AbstractC5889h.a {
    public static int a(Rect rect, int i11, int i12) {
        return (rect.hashCode() + i11) * i12;
    }

    public static boolean c(j jVar, String str, int i11, String str2) {
        List<String> pathSegments = jVar.b().getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, str);
        return Intrinsics.d(C7714v.Q(i11, pathSegments), str2);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5889h.a
    public F b(g gVar, r rVar) {
        return C6874b.b((e) gVar, rVar);
    }

    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        int i11 = C4069c.f27731u;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "<unused var>");
    }
}

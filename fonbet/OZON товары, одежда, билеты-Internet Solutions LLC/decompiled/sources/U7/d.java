package U7;

import androidx.lifecycle.AbstractC5434v;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.internal.F;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements AbstractC5887f.a, AbstractC5889h.a {
    public static Sd.f a(Sd.c cVar, String str, Sd.c cVar2, String str2) {
        Intrinsics.checkNotNullExpressionValue(cVar, str);
        Sd.f g10 = cVar2.g();
        Intrinsics.checkNotNullExpressionValue(g10, str2);
        return g10;
    }

    public static AbstractC5434v c(ComposerReferences composerReferences) {
        return composerReferences.getContainer().g().getLifecycle();
    }

    public static String e(String str, String str2) {
        return str + str2;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5889h.a
    public F b(He.g gVar, S7.r rVar) {
        return Z7.a.c((Y7.a) gVar, rVar);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5887f.a
    public He.g d(F f7, S7.r rVar) {
        return e.c(f7, rVar);
    }
}

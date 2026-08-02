package Bl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import gk0.q;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

/* loaded from: classes11.dex */
public final /* synthetic */ class b {
    public static View a(Class cls, String str, q qVar, Context context) {
        d b11 = N.b(cls);
        Intrinsics.checkNotNullParameter(b11, str);
        return qVar.i(b11, context);
    }

    public static ViewGroup b(ComposerReferences composerReferences) {
        return ContextExtKt.getRootView(composerReferences.getContainer().i());
    }

    public static StringBuilder c(long j11, String str, String str2, boolean z11) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j11);
        sb2.append(str2);
        sb2.append(z11);
        return sb2;
    }

    public static StringBuilder d(String str, String str2, String str3, String str4, TextAtom textAtom) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(textAtom);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static /* synthetic */ boolean e(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}

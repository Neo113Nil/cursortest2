package G;

import A0.V;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public static final C f1699a = new C();

    public final void a(EditorInfo editorInfo, R0.b bVar) {
        if (kotlin.jvm.internal.l.a(bVar, R0.b.f5121m)) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(X3.o.S(bVar, 10));
        Iterator it = bVar.f5122k.iterator();
        while (it.hasNext()) {
            arrayList.add(((R0.a) it.next()).f5120a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = V.d((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}

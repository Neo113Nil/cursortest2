package E0;

import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: E0.n0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2937n0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2937n0 f7278a = new C2937n0();

    public final void a(@NotNull EditorInfo editorInfo, @NotNull R1.c cVar) {
        R1.c cVar2;
        int i11 = R1.c.f24234d;
        cVar2 = R1.c.f24233c;
        if (Intrinsics.d(cVar, cVar2)) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(C7714v.z(cVar, 10));
        Iterator<R1.b> it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}

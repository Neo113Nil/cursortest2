package T1;

import S1.f;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f26504a = new a();

    @NotNull
    public final Object a(@NotNull R1.c cVar) {
        ArrayList arrayList = new ArrayList(C7714v.z(cVar, 10));
        Iterator<R1.b> it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(@NotNull f fVar, @NotNull R1.c cVar) {
        ArrayList arrayList = new ArrayList(C7714v.z(cVar, 10));
        Iterator<R1.b> it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        fVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}

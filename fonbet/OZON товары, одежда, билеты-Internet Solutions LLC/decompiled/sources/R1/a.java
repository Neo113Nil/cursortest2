package R1;

import S1.p;
import android.os.LocaleList;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private LocaleList f24229a;

    /* renamed from: b, reason: collision with root package name */
    private c f24230b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final p f24231c = new p();

    @NotNull
    public final c a() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f24231c) {
            c cVar = this.f24230b;
            if (cVar != null && localeList == this.f24229a) {
                return cVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(new b(localeList.get(i11)));
            }
            c cVar2 = new c(arrayList);
            this.f24229a = localeList;
            this.f24230b = cVar2;
            return cVar2;
        }
    }
}

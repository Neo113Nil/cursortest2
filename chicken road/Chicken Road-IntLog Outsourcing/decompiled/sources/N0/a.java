package N0;

import B4.j;
import android.content.res.Resources;
import w2.AbstractActivityC1515c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1995a = new j("^.+:.+/");

    public static int a(AbstractActivityC1515c abstractActivityC1515c, String str, String str2) {
        Resources resources = abstractActivityC1515c.getResources();
        if (str2 == null) {
            return 0;
        }
        j jVar = f1995a;
        jVar.getClass();
        return jVar.f314a.matcher(str2).find() ? resources.getIdentifier(str2, null, null) : resources.getIdentifier(str2, str, abstractActivityC1515c.getPackageName());
    }
}

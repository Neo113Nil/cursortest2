package s0;

import I1.AbstractActivityC0027d;
import android.content.res.Resources;
import v2.e;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1193a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f10313a = new e();

    public static int a(AbstractActivityC0027d abstractActivityC0027d, String str, String str2) {
        Resources resources = abstractActivityC0027d.getResources();
        if (str2 == null) {
            return 0;
        }
        e eVar = f10313a;
        eVar.getClass();
        return eVar.f10430a.matcher(str2).find() ? resources.getIdentifier(str2, null, null) : resources.getIdentifier(str2, str, abstractActivityC0027d.getPackageName());
    }
}

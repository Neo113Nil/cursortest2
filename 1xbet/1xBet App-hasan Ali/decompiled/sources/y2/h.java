package y2;

import L4.o;
import L4.z;
import android.webkit.MimeTypeMap;
import java.io.File;
import o4.AbstractC2227e;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final File f21198a;

    public h(File file) {
        this.f21198a = file;
    }

    @Override // y2.g
    public final Object a(a4.c cVar) {
        String str = z.f3126l;
        File file = this.f21198a;
        v2.l lVar = new v2.l(j3.i.t(file), o.f3106a, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        kotlin.jvm.internal.l.e("getName(...)", name);
        return new m(lVar, singleton.getMimeTypeFromExtension(AbstractC2227e.N0(name, '.', "")), v2.e.f20404m);
    }
}

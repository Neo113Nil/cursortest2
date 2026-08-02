package a5;

import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import b5.AbstractC5540a;
import b5.C5551l;
import b5.C5557r;
import b5.C5558s;

/* renamed from: a5.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4945c {
    @Deprecated
    public static void a(@NonNull WebSettings webSettings, int i11) {
        AbstractC5540a.h hVar = C5557r.f55538c;
        if (hVar.a()) {
            C5551l.d(webSettings, i11);
        } else {
            if (!hVar.d()) {
                throw C5557r.a();
            }
            C5558s.c().b(webSettings).b(i11);
        }
    }

    @Deprecated
    public static void b(@NonNull WebSettings webSettings) {
        if (!C5557r.f55539d.d()) {
            throw C5557r.a();
        }
        C5558s.c().b(webSettings).c();
    }
}

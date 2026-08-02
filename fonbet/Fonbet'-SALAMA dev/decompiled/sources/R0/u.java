package R0;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5873a;

    public u(ArrayList arrayList) {
        this.f5873a = arrayList;
    }

    public final WebResourceResponse a(Uri uri) {
        WebResourceResponse handle;
        Iterator it = this.f5873a.iterator();
        while (true) {
            s sVar = null;
            if (!it.hasNext()) {
                return null;
            }
            t tVar = (t) it.next();
            tVar.getClass();
            boolean equals = uri.getScheme().equals("http");
            String str = tVar.f5871c;
            if ((!equals || tVar.f5869a) && ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(tVar.f5870b) && uri.getPath().startsWith(str))) {
                sVar = tVar.f5872d;
            }
            if (sVar != null && (handle = sVar.handle(uri.getPath().replaceFirst(str, ""))) != null) {
                return handle;
            }
        }
    }
}

package Va0;

import android.net.Uri;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f28489a;

    public a(Uri uri) {
        this.f28489a = uri;
    }

    public final String a() {
        String lastPathSegment;
        Uri uri = this.f28489a;
        if (uri == null || (lastPathSegment = uri.getLastPathSegment()) == null || h.K(lastPathSegment)) {
            return null;
        }
        return lastPathSegment;
    }

    public final String b() {
        String str;
        String queryParameter;
        Set<String> queryParameterNames;
        Object obj;
        Intrinsics.checkNotNullParameter("type", "requiredParam");
        Uri uri = this.f28489a;
        if (uri == null || (queryParameterNames = uri.getQueryParameterNames()) == null) {
            str = null;
        } else {
            Iterator<T> it = queryParameterNames.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (h.D((String) obj, "type", true)) {
                    break;
                }
            }
            str = (String) obj;
        }
        if (str == null || (queryParameter = uri.getQueryParameter(str)) == null || h.K(queryParameter)) {
            return null;
        }
        return queryParameter;
    }
}

package A2;

import E2.m;
import H2.e;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c implements b {
    @Override // A2.b
    public final String a(Object obj, m mVar) {
        Uri uri = (Uri) obj;
        if (!l.a(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        Configuration configuration = mVar.f1462a.getResources().getConfiguration();
        Bitmap.Config config = e.f2284a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}

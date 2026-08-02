package B2;

import E2.m;
import H2.e;
import a.AbstractC0444a;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.l;
import o4.AbstractC2227e;
import y4.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f752a;

    public /* synthetic */ a(int i) {
        this.f752a = i;
    }

    public final Object a(Object obj, m mVar) {
        String scheme;
        String authority;
        switch (this.f752a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (!e.c(uri) && ((scheme = uri.getScheme()) == null || scheme.equals("file"))) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    if (path.length() > 0 && AbstractC0444a.H(path.charAt(0), '/', false) && ((String) X3.m.Z(uri.getPathSegments())) != null) {
                        if (!l.a(uri.getScheme(), "file")) {
                            return new File(uri.toString());
                        }
                        String path2 = uri.getPath();
                        if (path2 != null) {
                            return new File(path2);
                        }
                    }
                }
                return null;
            case 2:
                return ((n) obj).i;
            case 3:
                Context context = mVar.f1462a;
                int intValue = ((Number) obj).intValue();
                try {
                    if (context.getResources().getResourceEntryName(intValue) != null) {
                        return Uri.parse("android.resource://" + context.getPackageName() + '/' + intValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            case 4:
                Uri uri2 = (Uri) obj;
                if (!l.a(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || AbstractC2227e.H0(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                if (authority2 == null) {
                    authority2 = "";
                }
                Resources resourcesForApplication = mVar.f1462a.getPackageManager().getResourcesForApplication(authority2);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                if (identifier == 0) {
                    throw new IllegalStateException(("Invalid android.resource URI: " + uri2).toString());
                }
                return Uri.parse("android.resource://" + authority2 + '/' + identifier);
            default:
                return Uri.parse((String) obj);
        }
    }
}

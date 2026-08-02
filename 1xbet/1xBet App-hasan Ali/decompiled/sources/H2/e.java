package H2;

import a.AbstractC0444a;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.util.ArrayList;
import o4.AbstractC2227e;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config f2284a;

    /* renamed from: b, reason: collision with root package name */
    public static final y4.m f2285b;

    static {
        Bitmap.Config unused;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            unused = Bitmap.Config.RGBA_F16;
        } else {
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        }
        f2284a = i >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f2285b = new y4.m((String[]) new ArrayList(20).toArray(new String[0]));
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || AbstractC2227e.H0(str)) {
            return null;
        }
        String O02 = AbstractC2227e.O0(AbstractC2227e.O0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(AbstractC2227e.N0(AbstractC2227e.N0(O02, '/', O02), '.', ""));
    }

    public static final boolean c(Uri uri) {
        return kotlin.jvm.internal.l.a(uri.getScheme(), "file") && kotlin.jvm.internal.l.a((String) X3.m.Z(uri.getPathSegments()), "android_asset");
    }

    public static final int d(AbstractC0444a abstractC0444a, F2.g gVar) {
        if (abstractC0444a instanceof F2.a) {
            return ((F2.a) abstractC0444a).f;
        }
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (ordinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new D2.e();
    }
}

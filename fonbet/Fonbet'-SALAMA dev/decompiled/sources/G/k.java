package G;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f2833a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2834b = new HashMap();

    public k(String str) {
        this.f2833a = str;
    }

    public static boolean a(String str, String str2) {
        String access$000 = l.access$000(str);
        String access$0002 = l.access$000(str2);
        if (!access$000.equals(access$0002)) {
            if (!access$000.startsWith(access$0002 + '/')) {
                return false;
            }
        }
        return true;
    }

    public final File b(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.f2834b.get(decode);
        if (file == null) {
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }
        File file2 = new File(file, decode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (a(canonicalFile.getPath(), file.getPath())) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
        }
    }
}

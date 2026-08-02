package R0;

import S0.B;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.webkit.WebResourceResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public final class r implements s {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f5866c = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5867a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5868b;

    public r(Context context, int i7) {
        this.f5867a = i7;
        switch (i7) {
            case 1:
                this.f5868b = new B(context, 1);
                break;
            default:
                this.f5868b = new B(context, 1);
                break;
        }
    }

    public boolean a(Context context) {
        String b7 = B.b((File) this.f5868b);
        String b8 = B.b(context.getCacheDir());
        String b9 = B.b(context.getDataDir());
        if ((!b7.startsWith(b8) && !b7.startsWith(b9)) || b7.equals(b8) || b7.equals(b9)) {
            return false;
        }
        String[] strArr = f5866c;
        for (int i7 = 0; i7 < 5; i7++) {
            if (b7.startsWith(b9 + strArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // R0.s
    public final WebResourceResponse handle(String str) {
        File file;
        switch (this.f5867a) {
            case 0:
                try {
                    B b7 = (B) this.f5868b;
                    String substring = (str.length() <= 1 || str.charAt(0) != '/') ? str : str.substring(1);
                    InputStream open = ((Context) b7.f6229b).getAssets().open(substring, 2);
                    if (substring.endsWith(".svgz")) {
                        open = new GZIPInputStream(open);
                    }
                    break;
                } catch (IOException e7) {
                    Log.e("WebViewAssetLoader", "Error opening asset path: " + str, e7);
                    return new WebResourceResponse(null, null, null);
                }
            case 1:
                try {
                    break;
                } catch (Resources.NotFoundException e8) {
                    Log.e("WebViewAssetLoader", "Resource not found from the path: " + str, e8);
                    return new WebResourceResponse(null, null, null);
                } catch (IOException e9) {
                    Log.e("WebViewAssetLoader", "Error opening resource from the path: " + str, e9);
                    return new WebResourceResponse(null, null, null);
                }
            default:
                File file2 = (File) this.f5868b;
                try {
                    String b8 = B.b(file2);
                    String canonicalPath = new File(file2, str).getCanonicalPath();
                    file = canonicalPath.startsWith(b8) ? new File(canonicalPath) : null;
                } catch (IOException e10) {
                    Log.e("WebViewAssetLoader", "Error opening the requested path: " + str, e10);
                }
                if (file == null) {
                    Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", str, file2));
                    break;
                } else {
                    InputStream fileInputStream = new FileInputStream(file);
                    if (file.getPath().endsWith(".svgz")) {
                        fileInputStream = new GZIPInputStream(fileInputStream);
                    }
                    break;
                }
        }
        return new WebResourceResponse(null, null, null);
    }

    public r(Context context, File file) {
        this.f5867a = 2;
        try {
            this.f5868b = new File(B.b(file));
            if (a(context)) {
                return;
            }
            throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
        } catch (IOException e7) {
            throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e7);
        }
    }
}

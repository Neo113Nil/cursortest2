package androidx.core.content;

import K1.G;
import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f42043d = {"_display_name", "_size"};

    /* renamed from: e, reason: collision with root package name */
    private static final File f42044e = new File("/");

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<String, b> f42045f = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Object f42046a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private String f42047b;

    /* renamed from: c, reason: collision with root package name */
    private b f42048c;

    /* loaded from: classes8.dex */
    static class a {
        static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* loaded from: classes8.dex */
    interface b {
        Uri a(File file);

        File b(Uri uri);
    }

    /* loaded from: classes8.dex */
    static class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final String f42049a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap<String, File> f42050b = new HashMap<>();

        c(String str) {
            this.f42049a = str;
        }

        private static boolean d(@NonNull String str, @NonNull String str2) {
            String a11 = FileProvider.a(str);
            String a12 = FileProvider.a(str2);
            if (a11.equals(a12)) {
                return true;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a12);
            sb2.append('/');
            return a11.startsWith(sb2.toString());
        }

        @Override // androidx.core.content.FileProvider.b
        public final Uri a(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f42050b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (d(canonicalPath, path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException(Nk.a.b("Failed to find configured root that contains ", canonicalPath));
                }
                String path2 = entry.getValue().getPath();
                return new Uri.Builder().scheme("content").authority(this.f42049a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // androidx.core.content.FileProvider.b
        public final File b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f42050b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException(G.b(uri, "Unable to find configured root for "));
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (d(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        final void c(File file, String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f42050b.put(str, file.getCanonicalFile());
            } catch (IOException e11) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e11);
            }
        }
    }

    static String a(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    @NonNull
    private b b() {
        b bVar;
        synchronized (this.f42046a) {
            try {
                if (this.f42047b == null) {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
                if (this.f42048c == null) {
                    this.f42048c = c(getContext(), this.f42047b);
                }
                bVar = this.f42048c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    private static b c(Context context, String str) {
        b bVar;
        HashMap<String, b> hashMap = f42045f;
        synchronized (hashMap) {
            try {
                bVar = hashMap.get(str);
                if (bVar == null) {
                    try {
                        try {
                            bVar = e(context, str);
                            hashMap.put(str, bVar);
                        } catch (IOException e11) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
                        }
                    } catch (XmlPullParserException e12) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e12);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public static Uri d(@NonNull Context context, @NonNull String str, @NonNull File file) {
        return c(context, str).a(file);
    }

    private static c e(Context context, String str) throws IOException, XmlPullParserException {
        c cVar = new c(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, UserVerificationMethods.USER_VERIFY_PATTERN);
        if (resolveContentProvider == null) {
            throw new IllegalArgumentException(Nk.a.b("Couldn't find meta-data for provider with authority ", str));
        }
        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = loadXmlMetaData.getName();
                File file = null;
                String attributeValue = loadXmlMetaData.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.NAME);
                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f42044e;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = androidx.core.content.a.getExternalFilesDirs(context, null);
                    if (externalFilesDirs.length > 0) {
                        file = externalFilesDirs[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = androidx.core.content.a.getExternalCacheDirs(context);
                    if (externalCacheDirs.length > 0) {
                        file = externalCacheDirs[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] a11 = a.a(context);
                    if (a11.length > 0) {
                        file = a11[0];
                    }
                }
                if (file != null) {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        file = new File(file, str2);
                    }
                    cVar.c(file, attributeValue);
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.f42046a) {
            this.f42047b = str;
        }
        HashMap<String, b> hashMap = f42045f;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(@NonNull Uri uri, String str, String[] strArr) {
        return b().b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(@NonNull Uri uri) {
        File b11 = b().b(uri);
        int lastIndexOf = b11.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(b11.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(@NonNull Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(@NonNull Uri uri, @NonNull ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public final ParcelFileDescriptor openFile(@NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        int i11;
        File b11 = b().b(uri);
        if ("r".equals(str)) {
            i11 = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i11 = 738197504;
        } else if ("wa".equals(str)) {
            i11 = 704643072;
        } else if ("rw".equals(str)) {
            i11 = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(Nk.a.b("Invalid mode: ", str));
            }
            i11 = 1006632960;
        }
        return ParcelFileDescriptor.open(b11, i11);
    }

    @Override // android.content.ContentProvider
    @NonNull
    public final Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i11;
        File b11 = b().b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f42043d;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i12 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i12] = "_display_name";
                i11 = i12 + 1;
                objArr[i12] = queryParameter == null ? b11.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i12] = "_size";
                i11 = i12 + 1;
                objArr[i12] = Long.valueOf(b11.length());
            }
            i12 = i11;
        }
        String[] strArr4 = new String[i12];
        System.arraycopy(strArr3, 0, strArr4, 0, i12);
        Object[] objArr2 = new Object[i12];
        System.arraycopy(objArr, 0, objArr2, 0, i12);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(@NonNull Uri uri, @NonNull ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}

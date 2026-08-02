package U30;

import G.g;
import P4.f;
import Sc.C4001c;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64InputStream;
import androidx.core.content.FileProvider;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.C7721c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import kotlin.text.Charsets;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f27326a;

    public c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27326a = context;
    }

    private final boolean s(File file) {
        String canonicalPath;
        String canonicalPath2;
        try {
            canonicalPath = file.getCanonicalPath();
            canonicalPath2 = this.f27326a.getFilesDir().getCanonicalPath();
            Intrinsics.f(canonicalPath);
        } catch (IOException unused) {
            Ns.b.c("Invalid Internal Path ", file.getCanonicalPath(), "FintechFileManagerImpl");
        }
        if (h.e0(canonicalPath, canonicalPath2 + File.separator, false)) {
            return true;
        }
        return canonicalPath.equals(canonicalPath2);
    }

    private final String t(String str) {
        String j02 = h.j0('/', str, str);
        String j03 = h.j0('\\', j02, j02);
        return (Intrinsics.d(j03, "..") || Intrinsics.d(j03, ".") || j03.length() == 0) ? e() : j03;
    }

    private final Uri u(InputStream inputStream, String str) {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file, str);
        FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
        try {
            boolean q11 = q(inputStream, fileOutputStream);
            fileOutputStream.close();
            if (q11) {
                return Uri.fromFile(file2);
            }
            return null;
        } finally {
        }
    }

    private final Uri v(InputStream inputStream, String str) {
        Uri uri;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
        Context context = this.f27326a;
        ContentResolver contentResolver = context.getContentResolver();
        uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        Uri insert = contentResolver.insert(uri, contentValues);
        if (insert == null) {
            return null;
        }
        OutputStream openOutputStream = context.getContentResolver().openOutputStream(insert);
        if (openOutputStream == null) {
            return insert;
        }
        try {
            q(inputStream, openOutputStream);
            Unit unit = Unit.f71690a;
            openOutputStream.close();
            return insert;
        } finally {
        }
    }

    private static boolean w(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            L80.a.a("FintechFileManagerImpl", "Folder not empty (" + listFiles.length + " files remain), keeping it");
            return false;
        }
        if (file.delete()) {
            Ns.b.c("Deleted empty folder: ", file.getAbsolutePath(), "FintechFileManagerImpl");
            return true;
        }
        L80.a.b("FintechFileManagerImpl", "Failed to delete folder: " + file.getAbsolutePath());
        return false;
    }

    @Override // U30.a
    public final File a(@NotNull InputStream inStream, d dVar, String str, @NotNull String fileDir) {
        Intrinsics.checkNotNullParameter(inStream, "inStream");
        Intrinsics.checkNotNullParameter(fileDir, "fileDir");
        File h11 = h(fileDir);
        try {
            File file = new File(h11, p(str, dVar));
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            try {
                q(inStream, fileOutputStream);
                fileOutputStream.close();
                return file;
            } finally {
            }
        } catch (IOException e11) {
            L80.a.b("FintechFileManagerImpl", "IOException while trying to save file in " + h11 + " downloads: " + e11.getMessage());
            return null;
        }
    }

    @Override // U30.a
    @NotNull
    public final String b(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String str = (String) C7714v.K(h.m((String) C7714v.X(h.m(url, new String[]{"/"}, 0, 6)), new String[]{"."}, 0, 6));
        return str.length() == 0 ? f.b("toString(...)") : str;
    }

    @Override // U30.a
    public final boolean c(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new File(filePath).exists();
    }

    @Override // U30.a
    public final String d(@NotNull File folder, @NotNull String prefix) {
        File file;
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(folder, "folder");
        try {
        } catch (SecurityException e11) {
            L80.a.c("FintechFileManagerImpl", "Security exception while accessing folder: " + folder.getAbsolutePath(), e11);
        } catch (Exception e12) {
            L80.a.c("FintechFileManagerImpl", "Unexpected error while searching for file with prefix: " + prefix, e12);
        }
        if (!s(folder)) {
            L80.a.b("FintechFileManagerImpl", "Folder path escapes app files: " + folder.getAbsolutePath());
            return null;
        }
        if (folder.exists() && folder.isDirectory()) {
            File[] listFiles = folder.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                int length = listFiles.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        file = null;
                        break;
                    }
                    file = listFiles[i11];
                    if (file.isFile()) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        if (h.e0(name, prefix, false)) {
                            break;
                        }
                    }
                    i11++;
                }
                if (file != null) {
                    return file.getAbsolutePath();
                }
                return null;
            }
            L80.a.a("FintechFileManagerImpl", "Folder " + folder.getAbsolutePath() + " is empty");
            return null;
        }
        L80.a.b("FintechFileManagerImpl", "Folder " + folder.getAbsolutePath() + " does not exist or is not a directory");
        return null;
    }

    @Override // U30.a
    @NotNull
    public final String e() {
        String format = new SimpleDateFormat("dd_MM_yyyy_HH_mm", Locale.getDefault()).format(Calendar.getInstance(TimeZone.getDefault()).getTime());
        Intrinsics.f(format);
        return format;
    }

    @Override // U30.a
    public final byte[] f(@NotNull ContentResolver resolver, @NotNull Uri uri) throws IOException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        InputStream openInputStream = resolver.openInputStream(uri);
        if (openInputStream == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                q(openInputStream, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                openInputStream.close();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    @Override // U30.a
    public final boolean g(long j11, @NotNull String folderName, boolean z11) {
        boolean z12;
        boolean isFile;
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        File file = new File(this.f27326a.getFilesDir(), folderName);
        boolean z13 = false;
        if (!s(file)) {
            L80.a.b("FintechFileManagerImpl", "Folder path escapes sandbox: ".concat(folderName));
            return false;
        }
        try {
            if (!file.exists()) {
                L80.a.a("FintechFileManagerImpl", "Folder " + file.getAbsolutePath() + " does not exist");
                return true;
            }
            if (!file.isDirectory()) {
                L80.a.b("FintechFileManagerImpl", "Path " + file.getAbsolutePath() + " is not a directory");
                return false;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                L80.a.a("FintechFileManagerImpl", "Cleanup started. Cutoff time: " + new Date(System.currentTimeMillis() - j11) + " | Now: " + new Date(currentTimeMillis));
                Iterator a11 = C7721c.a(listFiles);
                boolean z14 = true;
                while (a11.hasNext()) {
                    File file2 = (File) a11.next();
                    try {
                        long lastModified = file2.lastModified();
                        z12 = lastModified < currentTimeMillis - j11 ? true : z13;
                        isFile = file2.isFile();
                        L80.a.a("FintechFileManagerImpl", "Processing: " + file2.getName() + " | Is file: " + isFile + " | Last modified: " + new Date(lastModified) + " | Is old: " + z12);
                    } catch (SecurityException e11) {
                        L80.a.c("FintechFileManagerImpl", "Security exception for file: " + file2.getName(), e11);
                    }
                    if (isFile && z12) {
                        if (file2.delete()) {
                            L80.a.a("FintechFileManagerImpl", "Deleted: " + file2.getAbsolutePath());
                        } else {
                            L80.a.b("FintechFileManagerImpl", "Failed to delete: " + file2.getAbsolutePath());
                            z14 = false;
                        }
                    }
                    z13 = false;
                }
                if (z11 && z14 && w(file)) {
                    return true;
                }
                return z14;
            }
            L80.a.a("FintechFileManagerImpl", "Folder is empty");
            if (z11) {
                return w(file);
            }
            return true;
        } catch (Exception e12) {
            L80.a.c("FintechFileManagerImpl", "Global cleaUp " + folderName + " exception", e12);
            return false;
        }
    }

    @Override // U30.a
    @NotNull
    public final File h(@NotNull String dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        File file = new File(this.f27326a.getFilesDir(), dir);
        if (!s(file)) {
            L80.a.b("FintechFileManagerImpl", "Directory path escapes app files, falling back to tmp: ".concat(dir));
            return h("tmp");
        }
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    @Override // U30.a
    public final void i(@NotNull String baseFileName, @NotNull String fileProviderAuthority, @NotNull String chooserTitle, @NotNull Bitmap bitmap) {
        Context context = this.f27326a;
        Intrinsics.checkNotNullParameter(baseFileName, "baseFileName");
        Intrinsics.checkNotNullParameter(fileProviderAuthority, "fileProviderAuthority");
        Intrinsics.checkNotNullParameter(chooserTitle, "chooserTitle");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        try {
            String t2 = t(baseFileName);
            d dVar = d.PNG;
            String str = t2 + "." + dVar.b();
            File file = new File(context.getCacheDir(), "images");
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = new File(file, str);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Unit unit = Unit.f71690a;
                fileOutputStream.close();
                Uri d11 = FileProvider.d(context, fileProviderAuthority, file2);
                if (d11 != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.addFlags(1);
                    intent.setType(dVar.d());
                    intent.putExtra("android.intent.extra.STREAM", d11);
                    Intent createChooser = Intent.createChooser(intent, chooserTitle);
                    createChooser.addFlags(268435456);
                    context.startActivity(createChooser);
                }
            } finally {
            }
        } catch (Exception e11) {
            L80.a.b("FintechFileManagerImpl", "Error while sharing picture e = " + e11);
        }
    }

    @Override // U30.a
    public final void j(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        try {
            File file = new File(filePath);
            if (s(file)) {
                file.delete();
            } else {
                L80.a.b("FintechFileManagerImpl", "Cannot delete file outside app files: ".concat(filePath));
            }
        } catch (Exception e11) {
            L80.a.b("FintechFileManagerImpl", "Failed to delete: " + filePath + " " + e11.getMessage());
        }
    }

    @Override // U30.a
    public final boolean k(@NotNull Base64InputStream inStream, @NotNull String filename) {
        Intrinsics.checkNotNullParameter(inStream, "inStream");
        Intrinsics.checkNotNullParameter(filename, "filename");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(h("downloads"), t(filename)), false);
            try {
                q(inStream, fileOutputStream);
                fileOutputStream.close();
                return true;
            } finally {
            }
        } catch (Exception e11) {
            L80.a.g(e11);
            return false;
        }
    }

    @Override // U30.a
    public final Uri l(@NotNull String fileName, @NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        try {
            String t2 = t(fileName);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            try {
                Uri v11 = Build.VERSION.SDK_INT >= 29 ? v(byteArrayInputStream, t2) : u(byteArrayInputStream, t2);
                byteArrayInputStream.close();
                return v11;
            } finally {
            }
        } catch (Exception e11) {
            L80.a.g(e11);
            return null;
        }
    }

    @Override // U30.a
    @NotNull
    public final String m(@NotNull File file) throws FileNotFoundException, IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8), 8192);
        try {
            char[] cArr = new char[10240];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read < 0) {
                    Unit unit = Unit.f71690a;
                    bufferedReader.close();
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                    return sb3;
                }
                sb2.append(cArr, 0, read);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
        } finally {
        }
    }

    @Override // U30.a
    public final void n() {
        Intrinsics.checkNotNullParameter("offline_content", "dirName");
        File file = new File(this.f27326a.getFilesDir(), "offline_content");
        if (file.exists() && file.isDirectory()) {
            if (!s(file)) {
                L80.a.b("FintechFileManagerImpl", "Cannot delete files outside app files: offline_content");
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    Intrinsics.f(file2);
                    bd.h.h(file2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.io.FileOutputStream] */
    @Override // U30.a
    public final Uri o(@NotNull Bitmap bitmap, @NotNull String baseFileName) {
        Uri fromFile;
        Intrinsics.checkNotNullParameter(baseFileName, "baseFileName");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        try {
            String t2 = t(baseFileName);
            d dVar = d.JPG;
            String str = t2 + "." + dVar.b();
            M m11 = new M();
            if (Build.VERSION.SDK_INT >= 29) {
                ContentResolver contentResolver = this.f27326a.getContentResolver();
                if (contentResolver != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", str);
                    contentValues.put("mime_type", dVar.d());
                    contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                    fromFile = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    m11.f71787a = fromFile != null ? contentResolver.openOutputStream(fromFile) : 0;
                } else {
                    fromFile = null;
                }
            } else {
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str);
                fromFile = Uri.fromFile(file);
                m11.f71787a = new FileOutputStream(file);
            }
            OutputStream outputStream = (OutputStream) m11.f71787a;
            if (outputStream == null) {
                return null;
            }
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
            return fromFile;
        } catch (Exception e11) {
            L80.a.a("FintechFileManagerImpl", C4001c.b(e11));
            return null;
        }
    }

    @Override // U30.a
    @NotNull
    public final String p(String str, d dVar) {
        if (dVar == null) {
            dVar = d.TEXT;
        }
        String e11 = (str == null || str.length() == 0) ? e() : t(str);
        String lowerCase = h.j0('.', e11, "").toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.d(lowerCase, dVar.b())) {
            return e11;
        }
        String n02 = h.n0('.', e11, e11);
        return dVar.b().length() == 0 ? n02 : g.c(n02, ".", dVar.b());
    }

    @Override // U30.a
    public final boolean q(@NotNull InputStream inStream, @NotNull OutputStream outStream) {
        Intrinsics.checkNotNullParameter(inStream, "inStream");
        Intrinsics.checkNotNullParameter(outStream, "outStream");
        byte[] bArr = new byte[10240];
        int read = inStream.read(bArr);
        int i11 = 0;
        while (read >= 0) {
            outStream.write(bArr, 0, read);
            i11 += read;
            read = inStream.read(bArr);
        }
        return i11 > 0;
    }

    @Override // U30.a
    public final Uri r(@NotNull Base64InputStream inStream, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(inStream, "inStream");
        try {
            String t2 = t(fileName);
            return Build.VERSION.SDK_INT >= 29 ? v(inStream, t2) : u(inStream, t2);
        } catch (Exception e11) {
            L80.a.g(e11);
            return null;
        }
    }
}

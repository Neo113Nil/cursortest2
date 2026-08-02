package U5;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* loaded from: classes8.dex */
final class d {

    /* renamed from: f, reason: collision with root package name */
    private static final a f27340f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final a f27341a = f27340f;

    /* renamed from: b, reason: collision with root package name */
    private final c f27342b;

    /* renamed from: c, reason: collision with root package name */
    private final W5.b f27343c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentResolver f27344d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f27345e;

    d(ArrayList arrayList, c cVar, W5.b bVar, ContentResolver contentResolver) {
        this.f27342b = cVar;
        this.f27343c = bVar;
        this.f27344d = contentResolver;
        this.f27345e = arrayList;
    }

    final int a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f27344d.openInputStream(uri);
                int b11 = com.bumptech.glide.load.c.b(this.f27345e, inputStream, this.f27343c);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return b11;
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th2;
            }
        } catch (IOException | NullPointerException e11) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e11);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0043, code lost:
    
        if (r3 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r3 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x001d: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:38:0x001d */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputStream b(Uri uri) throws FileNotFoundException {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3 = null;
        try {
            try {
                cursor = this.f27342b.a(uri);
            } catch (Throwable th2) {
                th = th2;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SecurityException e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (cursor != null) {
            try {
            } catch (SecurityException e12) {
                e = e12;
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                }
            }
            if (cursor.moveToFirst()) {
                String str = cursor.getString(0);
                cursor.close();
                if (!TextUtils.isEmpty(str)) {
                    this.f27341a.getClass();
                    File file = new File(str);
                    if (file.exists() && 0 < file.length()) {
                        Uri fromFile = Uri.fromFile(file);
                        try {
                            return this.f27344d.openInputStream(fromFile);
                        } catch (NullPointerException e13) {
                            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e13));
                        }
                    }
                }
                return null;
            }
        }
    }
}

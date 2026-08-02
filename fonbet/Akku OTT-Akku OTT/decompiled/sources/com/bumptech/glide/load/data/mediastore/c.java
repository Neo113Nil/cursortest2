package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import com.bumptech.glide.load.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class c implements com.bumptech.glide.load.data.d<InputStream> {
    public final Uri a;
    public final e b;
    public InputStream c;

    public static class a implements d {
        public static final String[] b = {"_data"};
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.d
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    public static class b implements d {
        public static final String[] b = {"_data"};
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.d
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    @VisibleForTesting
    public c(Uri uri, e eVar) {
        this.a = uri;
        this.b = eVar;
    }

    public static c a(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.a(context).c.a().d(), dVar, com.bumptech.glide.b.a(context).d, context.getContentResolver()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r6 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0039, code lost:
    
        if (r6 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0022: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:35), block:B:67:0x0022 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputStream b() throws FileNotFoundException {
        Cursor cursor;
        Cursor cursor2;
        InputStream openInputStream;
        int a2;
        e eVar = this.b;
        ContentResolver contentResolver = eVar.c;
        Uri uri = this.a;
        Cursor cursor3 = null;
        r5 = null;
        r5 = null;
        InputStream inputStream = null;
        try {
            try {
                cursor = eVar.a.a(uri);
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SecurityException unused) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (cursor != null) {
            try {
            } catch (SecurityException unused2) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Objects.toString(uri);
                }
            }
            if (cursor.moveToFirst()) {
                String str = cursor.getString(0);
                cursor.close();
                try {
                    if (!TextUtils.isEmpty(str)) {
                        File file = new File(str);
                        if (file.exists() && 0 < file.length()) {
                            Uri fromFile = Uri.fromFile(file);
                            try {
                                openInputStream = contentResolver.openInputStream(fromFile);
                                if (openInputStream != null) {
                                    try {
                                        inputStream = contentResolver.openInputStream(uri);
                                        a2 = f.a(eVar.d, inputStream, eVar.b);
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused3) {
                                            }
                                        }
                                    } catch (IOException | NullPointerException unused4) {
                                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                            Objects.toString(uri);
                                        }
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused5) {
                                            }
                                        }
                                    }
                                    return a2 != -1 ? new g(openInputStream, a2) : openInputStream;
                                }
                                a2 = -1;
                                if (a2 != -1) {
                                }
                            } catch (NullPointerException e) {
                                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
                            }
                        }
                    }
                    if (openInputStream != null) {
                    }
                    a2 = -1;
                    if (a2 != -1) {
                    }
                } catch (Throwable th3) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    throw th3;
                }
                openInputStream = null;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cleanup() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public final Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public final com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.a;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void loadData(@NonNull h hVar, @NonNull d.a<? super InputStream> aVar) {
        try {
            InputStream b2 = b();
            this.c = b2;
            aVar.onDataReady(b2);
        } catch (FileNotFoundException e) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.onLoadFailed(e);
        }
    }
}

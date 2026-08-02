package U5;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.i;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes8.dex */
public final class b implements com.bumptech.glide.load.data.d<InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f27333a;

    /* renamed from: b, reason: collision with root package name */
    private final d f27334b;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f27335c;

    static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f27336b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f27337a;

        a(ContentResolver contentResolver) {
            this.f27337a = contentResolver;
        }

        @Override // U5.c
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f27337a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f27336b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    /* renamed from: U5.b$b, reason: collision with other inner class name */
    static class C0552b implements c {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f27338b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f27339a;

        C0552b(ContentResolver contentResolver) {
            this.f27339a = contentResolver;
        }

        @Override // U5.c
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f27339a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f27338b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    b(Uri uri, d dVar) {
        this.f27333a = uri;
        this.f27334b = dVar;
    }

    private static b a(Context context, Uri uri, c cVar) {
        return new b(uri, new d(com.bumptech.glide.c.a(context).g().e(), cVar, com.bumptech.glide.c.a(context).b(), context.getContentResolver()));
    }

    public static b b(Context context, Uri uri) {
        return a(context, uri, new a(context.getContentResolver()));
    }

    public static b c(Context context, Uri uri) {
        return a(context, uri, new C0552b(context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cleanup() {
        InputStream inputStream = this.f27335c;
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
    public final T5.a getDataSource() {
        return T5.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void loadData(@NonNull i iVar, @NonNull d.a<? super InputStream> aVar) {
        try {
            d dVar = this.f27334b;
            Uri uri = this.f27333a;
            InputStream b11 = dVar.b(uri);
            int a11 = b11 != null ? dVar.a(uri) : -1;
            if (a11 != -1) {
                b11 = new g(b11, a11);
            }
            this.f27335c = b11;
            aVar.a(b11);
        } catch (FileNotFoundException e11) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e11);
            }
            aVar.onLoadFailed(e11);
        }
    }
}

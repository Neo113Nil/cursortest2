package Z5;

import Z5.p;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes8.dex */
public final class l implements p<Uri, File> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f35534a;

    /* loaded from: classes.dex */
    public static final class a implements q<Uri, File> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f35535a;

        public a(Context context) {
            this.f35535a = context;
        }

        @Override // Z5.q
        @NonNull
        public final p<Uri, File> build(t tVar) {
            return new l(this.f35535a);
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    private static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: c, reason: collision with root package name */
        private static final String[] f35536c = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final Context f35537a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f35538b;

        b(Context context, Uri uri) {
            this.f35537a = context;
            this.f35538b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final Class<File> getDataClass() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final T5.a getDataSource() {
            return T5.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void loadData(@NonNull com.bumptech.glide.i iVar, @NonNull d.a<? super File> aVar) {
            Cursor query = this.f35537a.getContentResolver().query(this.f35538b, f35536c, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                    query.close();
                } catch (Throwable th2) {
                    query.close();
                    throw th2;
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.a(new File(r0));
                return;
            }
            aVar.onLoadFailed(new FileNotFoundException("Failed to find file path for: " + this.f35538b));
        }
    }

    public l(Context context) {
        this.f35534a = context;
    }

    @Override // Z5.p
    public final p.a<File> buildLoadData(@NonNull Uri uri, int i11, int i12, @NonNull T5.i iVar) {
        Uri uri2 = uri;
        return new p.a<>(new o6.d(uri2), new b(this.f35534a, uri2));
    }

    @Override // Z5.p
    public final boolean handles(@NonNull Uri uri) {
        return F2.c.h(uri);
    }
}

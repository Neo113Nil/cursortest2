package Z5;

import Z5.p;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public final class z<Data> implements p<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f35581b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    private final Object f35582a;

    /* loaded from: classes.dex */
    public static final class a implements q<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f35583a;

        public a(ContentResolver contentResolver) {
            this.f35583a = contentResolver;
        }

        @Override // Z5.z.c
        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f35583a, uri);
        }

        @Override // Z5.q
        public final p<Uri, AssetFileDescriptor> build(t tVar) {
            return new z(this);
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    /* loaded from: classes.dex */
    public static class b implements q<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f35584a;

        public b(ContentResolver contentResolver) {
            this.f35584a = contentResolver;
        }

        @Override // Z5.z.c
        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f35584a, uri);
        }

        @Override // Z5.q
        @NonNull
        public final p<Uri, ParcelFileDescriptor> build(t tVar) {
            return new z(this);
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    /* loaded from: classes.dex */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    /* loaded from: classes.dex */
    public static class d implements q<Uri, InputStream>, c<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f35585a;

        public d(ContentResolver contentResolver) {
            this.f35585a = contentResolver;
        }

        @Override // Z5.z.c
        public final com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f35585a, uri);
        }

        @Override // Z5.q
        @NonNull
        public final p<Uri, InputStream> build(t tVar) {
            return new z(this);
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    public z(c<Data> cVar) {
        this.f35582a = cVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Z5.z$c, java.lang.Object] */
    @Override // Z5.p
    public final p.a buildLoadData(@NonNull Uri uri, int i11, int i12, @NonNull T5.i iVar) {
        Uri uri2 = uri;
        return new p.a(new o6.d(uri2), this.f35582a.a(uri2));
    }

    @Override // Z5.p
    public final boolean handles(@NonNull Uri uri) {
        return f35581b.contains(uri.getScheme());
    }
}

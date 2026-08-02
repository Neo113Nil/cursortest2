package Z5;

import Z5.p;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* renamed from: Z5.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4897a<Data> implements p<Uri, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f35493a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f35494b;

    /* renamed from: Z5.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0667a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    /* renamed from: Z5.a$b */
    /* loaded from: classes.dex */
    public static class b implements q<Uri, AssetFileDescriptor>, InterfaceC0667a<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f35495a;

        public b(AssetManager assetManager) {
            this.f35495a = assetManager;
        }

        @Override // Z5.C4897a.InterfaceC0667a
        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // Z5.q
        @NonNull
        public final p<Uri, AssetFileDescriptor> build(t tVar) {
            return new C4897a(this.f35495a, this);
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    /* renamed from: Z5.a$c */
    /* loaded from: classes.dex */
    public static class c implements q<Uri, InputStream>, InterfaceC0667a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f35496a;

        public c(AssetManager assetManager) {
            this.f35496a = assetManager;
        }

        @Override // Z5.C4897a.InterfaceC0667a
        public final com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // Z5.q
        @NonNull
        public final p<Uri, InputStream> build(t tVar) {
            return new C4897a(this.f35496a, this);
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    public C4897a(AssetManager assetManager, InterfaceC0667a<Data> interfaceC0667a) {
        this.f35493a = assetManager;
        this.f35494b = interfaceC0667a;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Z5.a$a, java.lang.Object] */
    @Override // Z5.p
    public final p.a buildLoadData(@NonNull Uri uri, int i11, int i12, @NonNull T5.i iVar) {
        Uri uri2 = uri;
        return new p.a(new o6.d(uri2), this.f35494b.a(this.f35493a, uri2.toString().substring(22)));
    }

    @Override // Z5.p
    public final boolean handles(@NonNull Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }
}

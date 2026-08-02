package a6;

import T5.i;
import Z5.p;
import Z5.q;
import Z5.t;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* renamed from: a6.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4954b implements p<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36361a;

    /* renamed from: a6.b$a */
    /* loaded from: classes.dex */
    public static class a implements q<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f36362a;

        public a(Context context) {
            this.f36362a = context;
        }

        @Override // Z5.q
        @NonNull
        public final p<Uri, InputStream> build(t tVar) {
            return new C4954b(this.f36362a);
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    public C4954b(Context context) {
        this.f36361a = context.getApplicationContext();
    }

    @Override // Z5.p
    public final p.a<InputStream> buildLoadData(@NonNull Uri uri, int i11, int i12, @NonNull i iVar) {
        Uri uri2 = uri;
        if (i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || i11 > 512 || i12 > 384) {
            return null;
        }
        return new p.a<>(new o6.d(uri2), U5.b.b(this.f36361a, uri2));
    }

    @Override // Z5.p
    public final boolean handles(@NonNull Uri uri) {
        Uri uri2 = uri;
        return F2.c.h(uri2) && !uri2.getPathSegments().contains("video");
    }
}

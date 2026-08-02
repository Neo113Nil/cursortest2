package a6;

import T5.i;
import Z5.p;
import Z5.q;
import Z5.t;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import c6.F;
import java.io.InputStream;

/* loaded from: classes8.dex */
public final class c implements p<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36363a;

    /* loaded from: classes.dex */
    public static class a implements q<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f36364a;

        public a(Context context) {
            this.f36364a = context;
        }

        @Override // Z5.q
        @NonNull
        public final p<Uri, InputStream> build(t tVar) {
            return new c(this.f36364a);
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    public c(Context context) {
        this.f36363a = context.getApplicationContext();
    }

    @Override // Z5.p
    public final p.a<InputStream> buildLoadData(@NonNull Uri uri, int i11, int i12, @NonNull i iVar) {
        Long l11;
        Uri uri2 = uri;
        if (i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || i11 > 512 || i12 > 384 || (l11 = (Long) iVar.a(F.f56531d)) == null || l11.longValue() != -1) {
            return null;
        }
        return new p.a<>(new o6.d(uri2), U5.b.c(this.f36363a, uri2));
    }

    @Override // Z5.p
    public final boolean handles(@NonNull Uri uri) {
        Uri uri2 = uri;
        return F2.c.h(uri2) && uri2.getPathSegments().contains("video");
    }
}

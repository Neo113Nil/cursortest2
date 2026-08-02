package Z5;

import Z5.p;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public final class A<Data> implements p<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f35491b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    private final p<h, Data> f35492a;

    /* loaded from: classes.dex */
    public static class a implements q<Uri, InputStream> {
        @Override // Z5.q
        @NonNull
        public final p<Uri, InputStream> build(t tVar) {
            return new A(tVar.c(h.class, InputStream.class));
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    public A(p<h, Data> pVar) {
        this.f35492a = pVar;
    }

    @Override // Z5.p
    public final p.a buildLoadData(@NonNull Uri uri, int i11, int i12, @NonNull T5.i iVar) {
        return this.f35492a.buildLoadData(new h(uri.toString()), i11, i12, iVar);
    }

    @Override // Z5.p
    public final boolean handles(@NonNull Uri uri) {
        return f35491b.contains(uri.getScheme());
    }
}

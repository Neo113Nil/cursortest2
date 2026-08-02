package Z5;

import Z5.p;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* loaded from: classes8.dex */
public final class u<Data> implements p<Integer, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final p<Uri, Data> f35567a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f35568b;

    /* loaded from: classes.dex */
    public static final class a implements q<Integer, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f35569a;

        public a(Resources resources) {
            this.f35569a = resources;
        }

        @Override // Z5.q
        public final p<Integer, AssetFileDescriptor> build(t tVar) {
            return new u(this.f35569a, tVar.c(Uri.class, AssetFileDescriptor.class));
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    /* loaded from: classes.dex */
    public static class b implements q<Integer, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f35570a;

        public b(Resources resources) {
            this.f35570a = resources;
        }

        @Override // Z5.q
        @NonNull
        public final p<Integer, InputStream> build(t tVar) {
            return new u(this.f35570a, tVar.c(Uri.class, InputStream.class));
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    /* loaded from: classes.dex */
    public static class c implements q<Integer, Uri> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f35571a;

        public c(Resources resources) {
            this.f35571a = resources;
        }

        @Override // Z5.q
        @NonNull
        public final p<Integer, Uri> build(t tVar) {
            return new u(this.f35571a, y.a());
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    public u(Resources resources, p<Uri, Data> pVar) {
        this.f35568b = resources;
        this.f35567a = pVar;
    }

    @Override // Z5.p
    public final p.a buildLoadData(@NonNull Integer num, int i11, int i12, @NonNull T5.i iVar) {
        Uri uri;
        Integer num2 = num;
        Resources resources = this.f35568b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e11) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e11);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f35567a.buildLoadData(uri, i11, i12, iVar);
    }

    @Override // Z5.p
    public final /* bridge */ /* synthetic */ boolean handles(@NonNull Integer num) {
        return true;
    }
}

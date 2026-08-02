package Z5;

import Z5.p;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes8.dex */
public final class e<Model, Data> implements p<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final a<Data> f35501a;

    /* loaded from: classes.dex */
    public interface a<Data> {
    }

    private static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a, reason: collision with root package name */
        private final String f35502a;

        /* renamed from: b, reason: collision with root package name */
        private final a<Data> f35503b;

        /* renamed from: c, reason: collision with root package name */
        private ByteArrayInputStream f35504c;

        b(String str, a<Data> aVar) {
            this.f35502a = str;
            this.f35503b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cleanup() {
            try {
                this.f35504c.close();
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final Class<Data> getDataClass() {
            this.f35503b.getClass();
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final T5.a getDataSource() {
            return T5.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void loadData(@NonNull com.bumptech.glide.i iVar, @NonNull d.a<? super Data> aVar) {
            try {
                ByteArrayInputStream a11 = ((c.a) this.f35503b).a(this.f35502a);
                this.f35504c = a11;
                aVar.a(a11);
            } catch (IllegalArgumentException e11) {
                aVar.onLoadFailed(e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c<Model> implements q<Model, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final a<InputStream> f35505a = new a();

        final class a implements a<InputStream> {
            public final ByteArrayInputStream a(String str) throws IllegalArgumentException {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // Z5.q
        @NonNull
        public final p<Model, InputStream> build(@NonNull t tVar) {
            return new e(this.f35505a);
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    public e(a<Data> aVar) {
        this.f35501a = aVar;
    }

    @Override // Z5.p
    public final p.a<Data> buildLoadData(@NonNull Model model, int i11, int i12, @NonNull T5.i iVar) {
        return new p.a<>(new o6.d(model), new b(model.toString(), this.f35501a));
    }

    @Override // Z5.p
    public final boolean handles(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }
}

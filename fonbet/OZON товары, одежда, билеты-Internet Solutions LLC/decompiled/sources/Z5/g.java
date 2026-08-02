package Z5;

import Z5.p;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class g<Data> implements p<File, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final d<Data> f35516a;

    public static class a<Data> implements q<File, Data> {

        /* renamed from: a, reason: collision with root package name */
        private final d<Data> f35517a;

        public a(d<Data> dVar) {
            this.f35517a = dVar;
        }

        @Override // Z5.q
        @NonNull
        public final p<File, Data> build(@NonNull t tVar) {
            return new g(this.f35517a);
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        final class a implements d<ParcelFileDescriptor> {
            @Override // Z5.g.d
            public final void a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // Z5.g.d
            public final ParcelFileDescriptor b(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // Z5.g.d
            public final Class<ParcelFileDescriptor> getDataClass() {
                return ParcelFileDescriptor.class;
            }
        }

        public b() {
            super(new a());
        }
    }

    /* loaded from: classes8.dex */
    private static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a, reason: collision with root package name */
        private final File f35518a;

        /* renamed from: b, reason: collision with root package name */
        private final d<Data> f35519b;

        /* renamed from: c, reason: collision with root package name */
        private Data f35520c;

        c(File file, d<Data> dVar) {
            this.f35518a = file;
            this.f35519b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cleanup() {
            Data data = this.f35520c;
            if (data != null) {
                try {
                    this.f35519b.a(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final Class<Data> getDataClass() {
            return this.f35519b.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final T5.a getDataSource() {
            return T5.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public final void loadData(@NonNull com.bumptech.glide.i iVar, @NonNull d.a<? super Data> aVar) {
            try {
                Data b11 = this.f35519b.b(this.f35518a);
                this.f35520c = b11;
                aVar.a(b11);
            } catch (FileNotFoundException e11) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e11);
                }
                aVar.onLoadFailed(e11);
            }
        }
    }

    public interface d<Data> {
        void a(Data data) throws IOException;

        Data b(File file) throws FileNotFoundException;

        Class<Data> getDataClass();
    }

    public static class e extends a<InputStream> {

        final class a implements d<InputStream> {
            @Override // Z5.g.d
            public final void a(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // Z5.g.d
            public final InputStream b(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            @Override // Z5.g.d
            public final Class<InputStream> getDataClass() {
                return InputStream.class;
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d<Data> dVar) {
        this.f35516a = dVar;
    }

    @Override // Z5.p
    public final p.a buildLoadData(@NonNull File file, int i11, int i12, @NonNull T5.i iVar) {
        File file2 = file;
        return new p.a(new o6.d(file2), new c(file2, this.f35516a));
    }

    @Override // Z5.p
    public final /* bridge */ /* synthetic */ boolean handles(@NonNull File file) {
        return true;
    }
}

package Z5;

import Z5.p;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p6.C8861a;

/* loaded from: classes.dex */
public final class d implements p<File, ByteBuffer> {

    private static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: a, reason: collision with root package name */
        private final File f35500a;

        a(File file) {
            this.f35500a = file;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final Class<ByteBuffer> getDataClass() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final T5.a getDataSource() {
            return T5.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void loadData(@NonNull com.bumptech.glide.i iVar, @NonNull d.a<? super ByteBuffer> aVar) {
            try {
                aVar.a(C8861a.a(this.f35500a));
            } catch (IOException e11) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e11);
                }
                aVar.onLoadFailed(e11);
            }
        }
    }

    public static class b implements q<File, ByteBuffer> {
        @Override // Z5.q
        @NonNull
        public final p<File, ByteBuffer> build(@NonNull t tVar) {
            return new d();
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    @Override // Z5.p
    public final p.a<ByteBuffer> buildLoadData(@NonNull File file, int i11, int i12, @NonNull T5.i iVar) {
        File file2 = file;
        return new p.a<>(new o6.d(file2), new a(file2));
    }

    @Override // Z5.p
    public final /* bridge */ /* synthetic */ boolean handles(@NonNull File file) {
        return true;
    }
}

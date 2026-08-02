package Z5;

import Z5.p;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class b<Data> implements p<byte[], Data> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0669b<Data> f35497a;

    /* loaded from: classes.dex */
    public static class a implements q<byte[], ByteBuffer> {

        /* renamed from: Z5.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        final class C0668a implements InterfaceC0669b<ByteBuffer> {
            C0668a() {
            }

            @Override // Z5.b.InterfaceC0669b
            public final ByteBuffer a(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }

            @Override // Z5.b.InterfaceC0669b
            public final Class<ByteBuffer> getDataClass() {
                return ByteBuffer.class;
            }
        }

        @Override // Z5.q
        @NonNull
        public final p<byte[], ByteBuffer> build(@NonNull t tVar) {
            return new b(new C0668a());
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    /* renamed from: Z5.b$b, reason: collision with other inner class name */
    public interface InterfaceC0669b<Data> {
        Data a(byte[] bArr);

        Class<Data> getDataClass();
    }

    private static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f35498a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC0669b<Data> f35499b;

        c(byte[] bArr, InterfaceC0669b<Data> interfaceC0669b) {
            this.f35498a = bArr;
            this.f35499b = interfaceC0669b;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final Class<Data> getDataClass() {
            return this.f35499b.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final T5.a getDataSource() {
            return T5.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void loadData(@NonNull com.bumptech.glide.i iVar, @NonNull d.a<? super Data> aVar) {
            aVar.a(this.f35499b.a(this.f35498a));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements q<byte[], InputStream> {

        /* loaded from: classes8.dex */
        final class a implements InterfaceC0669b<InputStream> {
            a() {
            }

            @Override // Z5.b.InterfaceC0669b
            public final InputStream a(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }

            @Override // Z5.b.InterfaceC0669b
            public final Class<InputStream> getDataClass() {
                return InputStream.class;
            }
        }

        @Override // Z5.q
        @NonNull
        public final p<byte[], InputStream> build(@NonNull t tVar) {
            return new b(new a());
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    public b(InterfaceC0669b<Data> interfaceC0669b) {
        this.f35497a = interfaceC0669b;
    }

    @Override // Z5.p
    public final p.a buildLoadData(@NonNull byte[] bArr, int i11, int i12, @NonNull T5.i iVar) {
        byte[] bArr2 = bArr;
        return new p.a(new o6.d(bArr2), new c(bArr2, this.f35497a));
    }

    @Override // Z5.p
    public final /* bridge */ /* synthetic */ boolean handles(@NonNull byte[] bArr) {
        return true;
    }
}

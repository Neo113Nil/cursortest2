package androidx.emoji2.text;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes8.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ByteBuffer f42745a;

    s(@NonNull ByteBuffer byteBuffer) {
        this.f42745a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public final long a() {
        return this.f42745a.position();
    }

    public final int b() throws IOException {
        return this.f42745a.getInt();
    }

    public final long c() throws IOException {
        return this.f42745a.getInt() & 4294967295L;
    }

    public final int d() throws IOException {
        return this.f42745a.getShort() & 65535;
    }

    public final void e(int i11) throws IOException {
        ByteBuffer byteBuffer = this.f42745a;
        byteBuffer.position(byteBuffer.position() + i11);
    }
}

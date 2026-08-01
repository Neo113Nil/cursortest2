package sg.bigo.ads.z0;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import java.nio.ByteBuffer;

/* renamed from: sg.bigo.ads.z0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5533h extends UploadDataProvider {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f13434a;
    public int b = 0;

    public C5533h(byte[] bArr) {
        this.f13434a = bArr;
    }

    @Override // android.net.http.UploadDataProvider
    public final long getLength() {
        return this.f13434a.length;
    }

    @Override // android.net.http.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int min = Math.min(byteBuffer.remaining(), this.f13434a.length - this.b);
        byteBuffer.put(this.f13434a, this.b, min);
        this.b += min;
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // android.net.http.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.b = 0;
        uploadDataSink.onRewindSucceeded();
    }
}

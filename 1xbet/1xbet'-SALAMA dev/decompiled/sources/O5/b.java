package O5;

import A5.x;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f5011d = new b();

    @Override // A5.x
    public final Object f(byte b7, ByteBuffer byteBuffer) {
        if (b7 != -127) {
            return super.f(b7, byteBuffer);
        }
        Object objE = e(byteBuffer);
        if (objE == null) {
            return null;
        }
        return c.values()[((Long) objE).intValue()];
    }

    @Override // A5.x
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (!(obj instanceof c)) {
            super.k(byteArrayOutputStream, obj);
        } else {
            byteArrayOutputStream.write(129);
            k(byteArrayOutputStream, obj == null ? null : Integer.valueOf(((c) obj).f5013a));
        }
    }
}

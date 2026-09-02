package I0;

import D0.m;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends m {

    /* renamed from: a, reason: collision with root package name */
    public static final b f186a = new b();

    @Override // D0.m
    public final Object readValueOfType(byte b2, ByteBuffer byteBuffer) {
        if (b2 != -127) {
            return super.readValueOfType(b2, byteBuffer);
        }
        Object readValue = readValue(byteBuffer);
        if (readValue == null) {
            return null;
        }
        return c.values()[((Long) readValue).intValue()];
    }

    @Override // D0.m
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (!(obj instanceof c)) {
            super.writeValue(byteArrayOutputStream, obj);
        } else {
            byteArrayOutputStream.write(129);
            writeValue(byteArrayOutputStream, obj == null ? null : Integer.valueOf(((c) obj).f188a));
        }
    }
}

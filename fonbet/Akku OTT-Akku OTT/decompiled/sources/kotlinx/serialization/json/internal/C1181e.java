package kotlinx.serialization.json.internal;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.text.Typography;
import okhttp3.internal.ws.WebSocketProtocol;

/* renamed from: kotlinx.serialization.json.internal.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1181e {

    @JvmField
    public static final char[] a = new char[117];

    @JvmField
    public static final byte[] b = new byte[WebSocketProtocol.PAYLOAD_SHORT];

    static {
        for (int i = 0; i < 32; i++) {
        }
        a(8, 'b');
        a(9, 't');
        a(10, 'n');
        a(12, 'f');
        a(13, 'r');
        a(47, '/');
        a(34, Typography.quote);
        a(92, '\\');
        byte[] bArr = b;
        for (int i2 = 0; i2 < 33; i2++) {
            bArr[i2] = ByteCompanionObject.MAX_VALUE;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    public static void a(int i, char c) {
        if (c != 'u') {
            a[c] = (char) i;
        }
    }
}

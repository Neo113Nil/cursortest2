package S5;

import Am.C2438a;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes8.dex */
final class h {
    static int a(int i11, int i12, int i13, int i14) {
        int min = Math.min(i12 / i14, i11 / i13);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("Utils", 2) && max > 1) {
            StringBuilder a11 = C2438a.a("Downsampling WEBP, sampleSize: ", max, ", target dimens: [", "x", i13);
            Ek.a.f(i14, i11, "], actual dimens: [", "x", a11);
            a11.append(i12);
            a11.append("]");
            Log.v("Utils", a11.toString());
        }
        return max;
    }

    static byte[] b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e11) {
            if (!Log.isLoggable("Utils", 5)) {
                return null;
            }
            Log.w("Utils", "Error reading data from stream", e11);
            return null;
        }
    }
}

package p000;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class sa1 implements y11 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f7085a;

    /* JADX INFO: renamed from: b */
    public final C0245gd f7086b;

    /* JADX INFO: renamed from: c */
    public final nk0 f7087c;

    public sa1(ArrayList arrayList, C0245gd c0245gd, nk0 nk0Var) {
        this.f7085a = arrayList;
        this.f7086b = c0245gd;
        this.f7087c = nk0Var;
    }

    @Override // p000.y11
    /* JADX INFO: renamed from: a */
    public final v11 mo18a(Object obj, int i, int i2, uu0 uu0Var) {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f7086b.mo18a(ByteBuffer.wrap(byteArray), i, i2, uu0Var);
    }

    @Override // p000.y11
    /* JADX INFO: renamed from: b */
    public final boolean mo19b(Object obj, uu0 uu0Var) {
        return !((Boolean) uu0Var.m4955c(k80.f4300b)).booleanValue() && yd0.m5770i(this.f7085a, (InputStream) obj, this.f7087c) == ImageHeaderParser$ImageType.GIF;
    }
}

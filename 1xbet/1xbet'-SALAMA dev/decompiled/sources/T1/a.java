package T1;

import D3.f;
import F1.x;
import S1.c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p097n3.a {
    @Override // p097n3.a
    public final Metadata o(c cVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        x xVar = new x(byteBuffer.array(), byteBuffer.limit());
        xVar.r(12);
        int iF = (xVar.f() + xVar.i(12)) - 4;
        xVar.r(44);
        xVar.s(xVar.i(12));
        xVar.r(16);
        ArrayList arrayList = new ArrayList();
        while (xVar.f() < iF) {
            xVar.r(48);
            int i7 = xVar.i(8);
            xVar.r(4);
            int iF2 = xVar.f() + xVar.i(12);
            String str = null;
            String str2 = null;
            while (xVar.f() < iF2) {
                int i8 = xVar.i(8);
                int i9 = xVar.i(8);
                int iF3 = xVar.f() + i9;
                if (i8 == 2) {
                    int i10 = xVar.i(16);
                    xVar.r(8);
                    if (i10 == 3) {
                        while (xVar.f() < iF3) {
                            int i11 = xVar.i(8);
                            Charset charset = f.f1717a;
                            byte[] bArr = new byte[i11];
                            xVar.k(i11, bArr);
                            str = new String(bArr, charset);
                            int i12 = xVar.i(8);
                            for (int i13 = 0; i13 < i12; i13++) {
                                xVar.s(xVar.i(8));
                            }
                        }
                    }
                } else if (i8 == 21) {
                    Charset charset2 = f.f1717a;
                    byte[] bArr2 = new byte[i9];
                    xVar.k(i9, bArr2);
                    str2 = new String(bArr2, charset2);
                }
                xVar.o(iF3 * 8);
            }
            xVar.o(iF2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new AppInfoTable(i7, str.concat(str2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}

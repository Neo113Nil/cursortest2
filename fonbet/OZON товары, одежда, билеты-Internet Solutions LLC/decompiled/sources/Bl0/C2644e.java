package Bl0;

import com.google.mlkit.common.sdkinternal.C5948d;
import n8.InterfaceC8452b;

/* renamed from: Bl0.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2644e implements n8.e {
    public static final float b(int i11, int i12, float[] fArr, float[] fArr2) {
        int i13 = i11 * 4;
        return (fArr[i13 + 3] * fArr2[12 + i12]) + (fArr[i13 + 2] * fArr2[8 + i12]) + (fArr[i13 + 1] * fArr2[4 + i12]) + (fArr[i13] * fArr2[i12]);
    }

    @Override // n8.e
    public Object a(InterfaceC8452b interfaceC8452b) {
        return new C5948d(interfaceC8452b.d(com.google.mlkit.common.sdkinternal.i.class));
    }
}

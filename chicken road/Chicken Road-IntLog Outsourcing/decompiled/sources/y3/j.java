package y3;

import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12414a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String str = (String) obj;
        switch (this.f12414a) {
            case 0:
                byte[] bArr = new byte[16];
                V2.f.a(str, 32, bArr);
                return bArr;
            default:
                byte[] bArr2 = new byte[8];
                V2.f.a(str, 16, bArr2);
                return bArr2;
        }
    }
}

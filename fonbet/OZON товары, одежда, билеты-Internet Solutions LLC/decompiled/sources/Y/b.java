package Y;

import C.S;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5084b0;
import androidx.camera.core.impl.InterfaceC5086c0;
import c0.k;
import d0.W;
import d0.Y;
import d0.Z;
import d0.a0;
import f0.C6391b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class b implements InterfaceC5084b0 {

    /* renamed from: b, reason: collision with root package name */
    private final C6391b f34510b;

    /* renamed from: c, reason: collision with root package name */
    private final Z f34511c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f34512d;

    public b(@NonNull C6391b c6391b) {
        Z z11 = a0.f60873c;
        this.f34512d = new HashMap();
        this.f34510b = c6391b;
        this.f34511c = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0140  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.camera.core.impl.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private InterfaceC5086c0 c(int i11) {
        InterfaceC5086c0.c cVar;
        int doubleValue;
        InterfaceC5086c0.c cVar2;
        InterfaceC5086c0.c a11;
        ?? e11;
        HashMap hashMap = this.f34512d;
        if (hashMap.containsKey(Integer.valueOf(i11))) {
            return (InterfaceC5086c0) hashMap.get(Integer.valueOf(i11));
        }
        C6391b c6391b = this.f34510b;
        if (!c6391b.b(i11)) {
            return null;
        }
        InterfaceC5086c0 a12 = c6391b.a(i11);
        if (a12 == null) {
            e11 = 0;
        } else {
            ArrayList arrayList = new ArrayList(a12.d());
            Iterator<InterfaceC5086c0.c> it = a12.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                cVar = it.next();
                if (cVar.g() == 0) {
                    break;
                }
            }
            if (cVar == null) {
                a11 = null;
                cVar2 = null;
            } else {
                int e12 = cVar.e();
                String i12 = cVar.i();
                int j11 = cVar.j();
                if (1 != cVar.g()) {
                    e12 = 5;
                    i12 = "video/hevc";
                    j11 = 2;
                }
                String str = i12;
                int i13 = j11;
                int c11 = cVar.c();
                int b11 = cVar.b();
                if (10 == b11) {
                    doubleValue = c11;
                } else {
                    doubleValue = (int) (new Rational(10, b11).doubleValue() * c11);
                    if (S.f("BackupHdrProfileEncoderProfilesProvider")) {
                        cVar2 = null;
                        S.a("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(c11), 10, Integer.valueOf(b11), Integer.valueOf(doubleValue)));
                        a11 = InterfaceC5086c0.c.a(e12, str, doubleValue, cVar.f(), cVar.k(), cVar.h(), i13, 10, cVar.d(), 1);
                    }
                }
                cVar2 = null;
                a11 = InterfaceC5086c0.c.a(e12, str, doubleValue, cVar.f(), cVar.k(), cVar.h(), i13, 10, cVar.d(), 1);
            }
            if (a11 != null) {
                W d11 = k.d(a11);
                Y y11 = (Y) this.f34511c.apply(d11);
                if (y11 != null && y11.b(a11.k(), a11.h())) {
                    int e13 = d11.e();
                    int intValue = y11.c().clamp(Integer.valueOf(e13)).intValue();
                    if (intValue != e13) {
                        a11 = InterfaceC5086c0.c.a(a11.e(), a11.i(), intValue, a11.f(), a11.k(), a11.h(), a11.j(), a11.b(), a11.d(), a11.g());
                    }
                    if (a11 != null) {
                        arrayList.add(a11);
                    }
                    e11 = !arrayList.isEmpty() ? cVar2 : InterfaceC5086c0.b.e(a12.c(), a12.a(), a12.b(), arrayList);
                }
            }
            a11 = cVar2;
            if (a11 != null) {
            }
            if (!arrayList.isEmpty()) {
            }
        }
        hashMap.put(Integer.valueOf(i11), e11);
        return e11;
    }

    @Override // androidx.camera.core.impl.InterfaceC5084b0
    public final InterfaceC5086c0 a(int i11) {
        return c(i11);
    }

    @Override // androidx.camera.core.impl.InterfaceC5084b0
    public final boolean b(int i11) {
        return this.f34510b.b(i11) && c(i11) != null;
    }
}

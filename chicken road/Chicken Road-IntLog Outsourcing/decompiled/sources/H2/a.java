package H2;

import android.util.Log;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1137a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1138b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1139c;

    public /* synthetic */ a(Object obj, int i2, Object obj2) {
        this.f1137a = i2;
        this.f1139c = obj;
        this.f1138b = obj2;
    }

    @Override // H2.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f1137a) {
            case 0:
                f2.t tVar = (f2.t) this.f1139c;
                try {
                    ((c) this.f1138b).b(((k) tVar.f5638c).decodeMessage(byteBuffer));
                    break;
                } catch (RuntimeException e3) {
                    Log.e("BasicMessageChannel#" + ((String) tVar.f5636a), "Failed to handle message reply", e3);
                    return;
                }
            default:
                o oVar = (o) this.f1139c;
                G2.i iVar = (G2.i) this.f1138b;
                try {
                    if (byteBuffer == null) {
                        iVar.getClass();
                    } else {
                        try {
                            iVar.success(oVar.f1150c.e(byteBuffer));
                        } catch (h e6) {
                            iVar.b(e6.f1142a, e6.getMessage(), e6.f1143b);
                        }
                    }
                    break;
                } catch (RuntimeException e7) {
                    Log.e("MethodChannel#" + oVar.f1149b, "Failed to handle method call result", e7);
                    return;
                }
        }
    }
}

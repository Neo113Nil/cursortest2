package T1;

import android.util.Log;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1459a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1461c;

    public /* synthetic */ a(Object obj, int i3, Object obj2) {
        this.f1459a = i3;
        this.f1461c = obj;
        this.f1460b = obj2;
    }

    @Override // T1.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f1459a) {
            case 0:
                D0.a aVar = (D0.a) this.f1461c;
                try {
                    ((c) this.f1460b).l(((k) aVar.f262b).decodeMessage(byteBuffer));
                    break;
                } catch (RuntimeException e3) {
                    Log.e("BasicMessageChannel#" + ((String) aVar.f264d), "Failed to handle message reply", e3);
                    return;
                }
            default:
                o oVar = (o) this.f1461c;
                S1.i iVar = (S1.i) this.f1460b;
                try {
                    if (byteBuffer == null) {
                        iVar.getClass();
                    } else {
                        try {
                            iVar.success(oVar.f1472c.f(byteBuffer));
                        } catch (h e4) {
                            iVar.b(e4.f1464a, e4.getMessage(), e4.f1465b);
                        }
                    }
                    break;
                } catch (RuntimeException e5) {
                    Log.e("MethodChannel#" + oVar.f1471b, "Failed to handle method call result", e5);
                    return;
                }
        }
    }
}

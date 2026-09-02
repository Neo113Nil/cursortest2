package D0;

import C0.p;
import C0.t;
import android.util.Log;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f161b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f162c;

    public /* synthetic */ a(int i2, Object obj, Object obj2) {
        this.f160a = i2;
        this.f162c = obj;
        this.f161b = obj2;
    }

    @Override // D0.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f160a) {
            case 0:
                t tVar = (t) this.f162c;
                try {
                    ((c) this.f161b).e(((i) tVar.f118c).decodeMessage(byteBuffer));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) tVar.f116a), "Failed to handle message reply", e2);
                    return;
                }
            default:
                t tVar2 = (t) this.f162c;
                p pVar = (p) this.f161b;
                try {
                    if (byteBuffer == null) {
                        pVar.getClass();
                    } else {
                        try {
                            pVar.c(((k) tVar2.f118c).d(byteBuffer));
                        } catch (g e3) {
                            pVar.a(e3.f163a, e3.getMessage(), e3.f164b);
                        }
                    }
                    break;
                } catch (RuntimeException e4) {
                    Log.e("MethodChannel#" + ((String) tVar2.f116a), "Failed to handle method call result", e4);
                    return;
                }
        }
    }
}

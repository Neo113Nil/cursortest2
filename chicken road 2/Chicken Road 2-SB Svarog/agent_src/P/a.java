package P;

import android.util.Log;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f359a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f360b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f361c;

    public /* synthetic */ a(int i2, Object obj, Object obj2) {
        this.f359a = i2;
        this.f361c = obj;
        this.f360b = obj2;
    }

    @Override // P.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f359a) {
            case 0:
                C.e eVar = (C.e) this.f361c;
                try {
                    ((c) this.f360b).m(((i) eVar.f10c).a(byteBuffer));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) eVar.f9b), "Failed to handle message reply", e2);
                    return;
                }
            default:
                E.b bVar = (E.b) this.f361c;
                O.l lVar = (O.l) this.f360b;
                try {
                    if (byteBuffer == null) {
                        lVar.b();
                    } else {
                        try {
                            lVar.d(((k) bVar.f20c).e(byteBuffer));
                        } catch (g e3) {
                            lVar.a(e3.f362b, e3.getMessage(), e3.f363c);
                        }
                    }
                    break;
                } catch (RuntimeException e4) {
                    Log.e("MethodChannel#" + ((String) bVar.f19b), "Failed to handle method call result", e4);
                    return;
                }
        }
    }
}

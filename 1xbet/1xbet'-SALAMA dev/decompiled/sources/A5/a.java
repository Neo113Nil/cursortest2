package A5;

import android.util.Log;
import java.nio.ByteBuffer;
import p155w1.F0;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f666c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f664a = i7;
        this.f666c = obj;
        this.f665b = obj2;
    }

    @Override // A5.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f664a) {
            case 0:
                F0 f7 = (F0) this.f666c;
                try {
                    ((c) this.f665b).f(((n) f7.f17381d).b(byteBuffer));
                } catch (RuntimeException e7) {
                    Log.e("BasicMessageChannel#" + ((String) f7.f17380c), "Failed to handle message reply", e7);
                    return;
                }
                break;
            default:
                s sVar = (s) this.f666c;
                r rVar = (r) this.f665b;
                try {
                    if (byteBuffer == null) {
                        rVar.notImplemented();
                    } else {
                        try {
                            rVar.success(sVar.f683c.f(byteBuffer));
                        } catch (k e8) {
                            rVar.error(e8.f672a, e8.getMessage(), e8.f673b);
                        }
                    }
                } catch (RuntimeException e9) {
                    Log.e("MethodChannel#" + sVar.f682b, "Failed to handle method call result", e9);
                    return;
                }
                break;
        }
    }
}

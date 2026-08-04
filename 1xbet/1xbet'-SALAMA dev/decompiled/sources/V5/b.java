package V5;

import U5.AbstractC0455w;
import U5.Q;
import U5.S;
import U5.T;
import X5.h;
import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends AbstractC0455w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f6680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f6681b;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    static {
        try {
            try {
                if (((T) h.class.asSubclass(T.class).getConstructor(null).newInstance(null)).b()) {
                    return;
                }
                Log.w("AndroidChannelBuilder", "OkHttpChannelProvider.isAvailable() returned false");
            } catch (Exception e7) {
                Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e7);
            }
        } catch (ClassCastException e8) {
            Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e8);
        }
    }

    public b(S s7) {
        this.f6680a = s7;
    }

    @Override // U5.AbstractC0454v, U5.S
    public final Q a() {
        return new a(this.f6680a.a(), this.f6681b);
    }

    @Override // U5.AbstractC0454v
    public final S d() {
        return this.f6680a;
    }
}

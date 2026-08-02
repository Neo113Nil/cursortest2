package Fl;

import io.sentry.InterfaceC7217w1;
import io.sentry.U;
import io.sentry.h3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import qc.g;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements g, InterfaceC7217w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9501b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f9500a = i11;
        this.f9501b = obj;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f9500a) {
            case 0:
                ((Function1) this.f9501b).invoke(obj);
                break;
            case 1:
                ((Function1) this.f9501b).invoke(obj);
                break;
            default:
                ((Function1) this.f9501b).invoke(obj);
                break;
        }
    }

    @Override // io.sentry.InterfaceC7217w1
    public void e(U u11) {
        h3 x11 = u11.x();
        if (x11 == null || x11.h() == null) {
            return;
        }
        ((AtomicBoolean) this.f9501b).set(true);
    }
}

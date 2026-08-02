package T2;

import A0.J0;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.AbstractC1400ot;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class y extends J2.a {

    /* renamed from: b, reason: collision with root package name */
    public final U2.m f5751b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5752c;

    /* renamed from: d, reason: collision with root package name */
    public final J0 f5753d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, String str, String str2, J0 j02) {
        super(1);
        String x5 = P2.o.f4767B.f4771c.x(context, str);
        this.f5751b = new U2.m(x5);
        this.f5752c = str2;
        this.f5753d = j02;
    }

    @Override // J2.a
    public final void k() {
        String str = this.f5752c;
        U2.m mVar = this.f5751b;
        J0 j02 = this.f5753d;
        if (j02 == null) {
            mVar.d(str);
            return;
        }
        try {
            new m2.g((U2.i) j02.f304k, mVar, AbstractC0613Id.f9543e, null, 14, false).B(1, 0L, str);
        } catch (NullPointerException | RejectedExecutionException unused) {
            AbstractC1400ot.c0(U2.l.f5882l);
        }
    }
}

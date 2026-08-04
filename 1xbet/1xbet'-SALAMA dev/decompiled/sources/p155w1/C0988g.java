package p155w1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: w1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0988g extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17721b;

    public /* synthetic */ C0988g(String str, int i7) {
        this.f17720a = i7;
        this.f17721b = str;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        switch (this.f17720a) {
            case 0:
                C1036t c1036t = H2.a().f17408f;
                String str = this.f17721b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                O2 o7 = c1036t.f17865A;
                if (o7 != null) {
                    synchronized (o7) {
                        try {
                            if (!TextUtils.isEmpty(str)) {
                                int iMin = Math.min(str.length(), 250);
                                o7.f17497c.position((o7.f17495a * 512) + O2.f17494i);
                                o7.f17497c.putLong(jCurrentTimeMillis);
                                o7.f17497c.putInt(iMin);
                                o7.f17497c.asCharBuffer().put(str, 0, iMin);
                                short s7 = (short) (o7.f17495a + 1);
                                o7.f17495a = s7;
                                if (s7 >= 207) {
                                    o7.f17495a = (short) 0;
                                    o7.f17496b = true;
                                }
                                o7.f17497c.putShort(O2.f17492g, o7.f17495a);
                                o7.f17497c.put(O2.f17493h, o7.f17496b ? (byte) 1 : (byte) 0);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                synchronized (AbstractC0997i0.class) {
                }
                return;
            case 1:
                C1042v c1042v = H2.a().f17410h;
                String str2 = this.f17721b;
                c1042v.f17890B = str2;
                C1050x1.z().A(new R1(new C0999i2(str2, 1), 13));
                return;
            case 2:
                String str3 = this.f17721b;
                AtomicInteger atomicInteger = A2.f17286e;
                A2.d(str3, Collections.emptyList(), 4);
                synchronized (AbstractC0997i0.class) {
                }
                return;
            case 3:
                A2.c(6, this.f17721b, "true");
                synchronized (AbstractC0997i0.class) {
                }
                return;
            default:
                C1017n0.a().f17811b = this.f17721b;
                R1.f();
                return;
        }
    }
}

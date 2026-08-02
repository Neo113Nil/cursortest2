package w1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: w1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1697g extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17715b;

    public /* synthetic */ C1697g(String str, int i7) {
        this.f17714a = i7;
        this.f17715b = str;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        switch (this.f17714a) {
            case 0:
                C1745t c1745t = H2.a().f17402f;
                String str = this.f17715b;
                long currentTimeMillis = System.currentTimeMillis();
                O2 o22 = c1745t.f17859A;
                if (o22 != null) {
                    synchronized (o22) {
                        try {
                            if (!TextUtils.isEmpty(str)) {
                                int min = Math.min(str.length(), 250);
                                o22.f17491c.position((o22.f17489a * 512) + O2.f17488i);
                                o22.f17491c.putLong(currentTimeMillis);
                                o22.f17491c.putInt(min);
                                o22.f17491c.asCharBuffer().put(str, 0, min);
                                short s7 = (short) (o22.f17489a + 1);
                                o22.f17489a = s7;
                                if (s7 >= 207) {
                                    o22.f17489a = (short) 0;
                                    o22.f17490b = true;
                                }
                                o22.f17491c.putShort(O2.f17486g, o22.f17489a);
                                o22.f17491c.put(O2.f17487h, o22.f17490b ? (byte) 1 : (byte) 0);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                synchronized (AbstractC1706i0.class) {
                }
                return;
            case 1:
                C1751v c1751v = H2.a().f17404h;
                String str2 = this.f17715b;
                c1751v.f17884B = str2;
                C1759x1.z().A(new R1(new C1708i2(str2, 1), 13));
                return;
            case 2:
                String str3 = this.f17715b;
                AtomicInteger atomicInteger = A2.f17280e;
                A2.d(str3, Collections.emptyList(), 4);
                synchronized (AbstractC1706i0.class) {
                }
                return;
            case 3:
                A2.c(6, this.f17715b, "true");
                synchronized (AbstractC1706i0.class) {
                }
                return;
            default:
                C1726n0.a().f17805b = this.f17715b;
                R1.f();
                return;
        }
    }
}

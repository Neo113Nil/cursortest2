package w1;

import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class G2 extends AbstractC1765z1 {

    /* renamed from: z, reason: collision with root package name */
    public final HashSet f17385z;

    public G2() {
        super(AbstractC1753v1.a(EnumC1747t1.f17865c), false);
        this.f17385z = null;
        this.f17385z = new HashSet();
    }

    public final void h(Object obj) {
        d(new com.flurry.android.marketing.messaging.notification.b(24, this, obj));
    }

    public void i(I2 i22) {
        if (i22 == null) {
            return;
        }
        d(new F2(this, i22, 0));
    }
}

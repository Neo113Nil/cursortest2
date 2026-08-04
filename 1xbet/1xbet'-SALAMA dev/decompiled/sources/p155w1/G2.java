package p155w1;

import com.flurry.android.marketing.messaging.notification.b;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class G2 extends AbstractC1056z1 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashSet f17391z;

    public G2() {
        super(AbstractC1044v1.a(EnumC1038t1.f17871c), false);
        this.f17391z = null;
        this.f17391z = new HashSet();
    }

    public final void h(Object obj) {
        d(new b(24, this, obj));
    }

    public void i(I2 i7) {
        if (i7 == null) {
            return;
        }
        d(new F2(this, i7, 0));
    }
}

package W5;

import U5.AbstractC0442i;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0442i[] f7182a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f7183b = new AtomicBoolean(false);

    static {
        new d2(new AbstractC0442i[0]);
    }

    public d2(AbstractC0442i[] abstractC0442iArr) {
        this.f7182a = abstractC0442iArr;
    }

    public final void a(long j) {
        for (AbstractC0442i abstractC0442i : this.f7182a) {
            abstractC0442i.g(j);
        }
    }
}

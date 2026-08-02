package E3;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class G implements D3.q, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f1995a;

    public G() {
        AbstractC0158p.a(2, "expectedValuesPerKey");
        this.f1995a = 2;
    }

    @Override // D3.q
    public final Object get() {
        return new ArrayList(this.f1995a);
    }
}

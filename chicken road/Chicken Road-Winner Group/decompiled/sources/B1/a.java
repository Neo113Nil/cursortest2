package B1;

import com.startapp.sdk.internal.i7;
import com.startapp.sdk.internal.p;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f145b;

    public /* synthetic */ a(int i3, Object obj) {
        this.f144a = i3;
        this.f145b = obj;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        switch (this.f144a) {
            case 0:
                return Integer.valueOf(((AtomicInteger) this.f145b).get());
            case 1:
                return ((com.startapp.sdk.components.a) this.f145b).e();
            default:
                return ((p) this.f145b).a();
        }
    }
}

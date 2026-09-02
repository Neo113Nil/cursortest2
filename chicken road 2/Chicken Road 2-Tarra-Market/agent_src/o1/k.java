package o1;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends j1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6302b = 2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6303c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f6304d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, Object[] objArr, int i2, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f6304d = rVar;
        this.f6303c = i2;
    }

    @Override // j1.a
    public final void a() {
        switch (this.f6302b) {
            case 0:
                this.f6304d.f6328j.getClass();
                try {
                    this.f6304d.f6336r.l(this.f6303c, 6);
                    synchronized (this.f6304d) {
                        this.f6304d.f6338t.remove(Integer.valueOf(this.f6303c));
                    }
                    return;
                } catch (IOException unused) {
                    return;
                }
            case 1:
                this.f6304d.f6328j.getClass();
                try {
                    this.f6304d.f6336r.l(this.f6303c, 6);
                    synchronized (this.f6304d) {
                        this.f6304d.f6338t.remove(Integer.valueOf(this.f6303c));
                    }
                    return;
                } catch (IOException unused2) {
                    return;
                }
            default:
                this.f6304d.f6328j.getClass();
                synchronized (this.f6304d) {
                    this.f6304d.f6338t.remove(Integer.valueOf(this.f6303c));
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, Object[] objArr, int i2, ArrayList arrayList, boolean z2) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f6304d = rVar;
        this.f6303c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, Object[] objArr, int i2, int i3) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f6304d = rVar;
        this.f6303c = i2;
    }
}

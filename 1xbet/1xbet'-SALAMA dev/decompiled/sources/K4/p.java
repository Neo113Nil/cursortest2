package K4;

import U5.AbstractC0439f;
import U5.AbstractC0456x;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends AbstractC0456x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0439f[] f4044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Task f4045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f4046c;

    public p(r rVar, AbstractC0439f[] abstractC0439fArr, Task task) {
        this.f4046c = rVar;
        this.f4044a = abstractC0439fArr;
        this.f4045b = task;
    }

    @Override // U5.AbstractC0456x, U5.AbstractC0439f
    public final void b() {
        if (this.f4044a[0] != null) {
            super.b();
            return;
        }
        this.f4045b.addOnSuccessListener(this.f4046c.f4053a.f4359a, new o());
    }

    @Override // U5.AbstractC0456x
    public final AbstractC0439f f() {
        AbstractC0439f[] abstractC0439fArr = this.f4044a;
        p113p3.f.O("ClientCall used before onOpen() callback", abstractC0439fArr[0] != null, new Object[0]);
        return abstractC0439fArr[0];
    }
}

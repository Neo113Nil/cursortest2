package I1;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class j implements e, d, b, c {

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f1251a;

    @Override // I1.b
    public void a() {
        this.f1251a.countDown();
    }

    @Override // I1.d
    public void c(Exception exc) {
        this.f1251a.countDown();
    }

    @Override // I1.c
    public void onComplete(Task task) {
        this.f1251a.countDown();
    }

    @Override // I1.e
    public void onSuccess(Object obj) {
        this.f1251a.countDown();
    }

    public /* synthetic */ j() {
        this.f1251a = new CountDownLatch(1);
    }
}

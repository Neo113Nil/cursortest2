package androidx.emoji2.text;

import androidx.annotation.NonNull;
import androidx.emoji2.text.j;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes8.dex */
final class m extends j.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j.i f42713a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ThreadPoolExecutor f42714b;

    m(j.i iVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f42713a = iVar;
        this.f42714b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.j.i
    public final void a(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f42714b;
        try {
            this.f42713a.a(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.j.i
    public final void b(@NonNull u uVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f42714b;
        try {
            this.f42713a.b(uVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}

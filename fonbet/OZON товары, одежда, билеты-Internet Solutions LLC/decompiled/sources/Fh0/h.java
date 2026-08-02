package Fh0;

import J4.l;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import ru.ozon.push.sdk.internal.status.data.repository.database.PushDataBase_Impl;

/* loaded from: classes7.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    private final PushDataBase_Impl f9479a;

    /* renamed from: b, reason: collision with root package name */
    private final l<Gh0.b> f9480b;

    /* renamed from: c, reason: collision with root package name */
    private final J4.k<Gh0.b> f9481c;

    /* renamed from: d, reason: collision with root package name */
    private final J4.k<Gh0.e> f9482d;

    public h(@NonNull PushDataBase_Impl pushDataBase_Impl) {
        this.f9479a = pushDataBase_Impl;
        this.f9480b = new e(pushDataBase_Impl);
        this.f9481c = new f(pushDataBase_Impl);
        this.f9482d = new g(pushDataBase_Impl);
    }

    @Override // Fh0.d
    public final void a(ArrayList arrayList) {
        PushDataBase_Impl pushDataBase_Impl = this.f9479a;
        pushDataBase_Impl.assertNotSuspendingTransaction();
        pushDataBase_Impl.beginTransaction();
        try {
            this.f9482d.handleMultiple(arrayList);
            pushDataBase_Impl.setTransactionSuccessful();
        } finally {
            pushDataBase_Impl.endTransaction();
        }
    }

    public final void b(ArrayList arrayList) {
        PushDataBase_Impl pushDataBase_Impl = this.f9479a;
        pushDataBase_Impl.assertNotSuspendingTransaction();
        pushDataBase_Impl.beginTransaction();
        try {
            this.f9481c.handleMultiple(arrayList);
            pushDataBase_Impl.setTransactionSuccessful();
        } finally {
            pushDataBase_Impl.endTransaction();
        }
    }

    public final void c(Gh0.b bVar) {
        PushDataBase_Impl pushDataBase_Impl = this.f9479a;
        pushDataBase_Impl.assertNotSuspendingTransaction();
        pushDataBase_Impl.beginTransaction();
        try {
            this.f9480b.insert((l<Gh0.b>) bVar);
            pushDataBase_Impl.setTransactionSuccessful();
        } finally {
            pushDataBase_Impl.endTransaction();
        }
    }
}

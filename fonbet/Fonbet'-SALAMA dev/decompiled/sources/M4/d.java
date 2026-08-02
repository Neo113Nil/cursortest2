package M4;

import L.m;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class d implements f, g {

    /* renamed from: a, reason: collision with root package name */
    public final b f4585a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4586b;

    /* renamed from: c, reason: collision with root package name */
    public final N4.b f4587c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f4588d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f4589e;

    public d(Context context, String str, Set set, N4.b bVar, Executor executor) {
        this.f4585a = new b(context, 0, str);
        this.f4588d = set;
        this.f4589e = executor;
        this.f4587c = bVar;
        this.f4586b = context;
    }

    public final Task a() {
        if (!m.a(this.f4586b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f4589e, new c(this, 0));
    }

    public final void b() {
        if (this.f4588d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!m.a(this.f4586b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f4589e, new c(this, 1));
        }
    }
}

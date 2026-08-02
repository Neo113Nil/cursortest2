package V2;

import R2.InterfaceC3912f;
import R2.InterfaceC3917k;
import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import xe.M;

/* loaded from: classes.dex */
public final class e implements id.e<Context, InterfaceC3917k<W2.f>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f27945a;

    /* renamed from: b, reason: collision with root package name */
    private final S2.b<W2.f> f27946b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<Context, List<InterfaceC3912f<W2.f>>> f27947c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M f27948d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f27949e;

    /* renamed from: f, reason: collision with root package name */
    private volatile W2.c f27950f;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull String name, S2.b<W2.f> bVar, @NotNull Function1<? super Context, ? extends List<? extends InterfaceC3912f<W2.f>>> produceMigrations, @NotNull M scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f27945a = name;
        this.f27946b = bVar;
        this.f27947c = produceMigrations;
        this.f27948d = scope;
        this.f27949e = new Object();
    }

    @Override // id.e
    public final InterfaceC3917k<W2.f> getValue(Context context, m property) {
        W2.c cVar;
        Context thisRef = context;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        W2.c cVar2 = this.f27950f;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (this.f27949e) {
            try {
                if (this.f27950f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    S2.b<W2.f> bVar = this.f27946b;
                    Function1<Context, List<InterfaceC3912f<W2.f>>> function1 = this.f27947c;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f27950f = W2.e.a(bVar, function1.invoke(applicationContext), this.f27948d, new d(applicationContext, this));
                }
                cVar = this.f27950f;
                Intrinsics.f(cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}

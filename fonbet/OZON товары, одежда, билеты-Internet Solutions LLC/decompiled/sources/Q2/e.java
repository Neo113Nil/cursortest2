package Q2;

import De.C2862e;
import R2.C3918l;
import R2.C3922p;
import R2.InterfaceC3912f;
import R2.InterfaceC3917k;
import T2.g;
import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import sf.AbstractC9688n;

/* loaded from: classes8.dex */
public final class e<T> implements id.e<Context, InterfaceC3917k<T>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f22936a;

    /* renamed from: b, reason: collision with root package name */
    private final S2.b<T> f22937b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<Context, List<InterfaceC3912f<T>>> f22938c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2862e f22939d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f22940e;

    /* renamed from: f, reason: collision with root package name */
    private volatile C3922p f22941f;

    public e(@NotNull f serializer, S2.b bVar, @NotNull Function1 produceMigrations, @NotNull C2862e scope) {
        Intrinsics.checkNotNullParameter("secure_token_prefs.pb", "fileName");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f22936a = serializer;
        this.f22937b = bVar;
        this.f22938c = produceMigrations;
        this.f22939d = scope;
        this.f22940e = new Object();
    }

    @Override // id.e
    public final Object getValue(Context context, m property) {
        C3922p c3922p;
        Context thisRef = context;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        C3922p c3922p2 = this.f22941f;
        if (c3922p2 != null) {
            return c3922p2;
        }
        synchronized (this.f22940e) {
            try {
                if (this.f22941f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    g gVar = new g(AbstractC9688n.f98744a, this.f22936a, new d(applicationContext, this));
                    S2.b<T> bVar = this.f22937b;
                    Function1<Context, List<InterfaceC3912f<T>>> function1 = this.f22938c;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f22941f = C3918l.a(gVar, bVar, function1.invoke(applicationContext), this.f22939d);
                }
                c3922p = this.f22941f;
                Intrinsics.f(c3922p);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c3922p;
    }
}

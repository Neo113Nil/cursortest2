package P90;

import P90.a;
import Q90.n;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements Jb.e<n> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f22056a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Q90.c> f22057b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<SharedPreferences> f22058c;

    public e(Pc.a<Context> aVar, Pc.a<Q90.c> aVar2, Pc.a<SharedPreferences> aVar3) {
        this.f22056a = aVar;
        this.f22057b = aVar2;
        this.f22058c = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) ((a.h) this.f22056a).get();
        Q90.c featureToggles = this.f22057b.get();
        SharedPreferences sharedPreferences = (SharedPreferences) ((a.e) this.f22058c).get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        return new n(context, featureToggles, sharedPreferences);
    }
}

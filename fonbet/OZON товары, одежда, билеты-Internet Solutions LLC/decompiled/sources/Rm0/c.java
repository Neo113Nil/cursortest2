package Rm0;

import B90.C2618u;
import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Context f25166a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final M8.b f25167b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final C2618u f25168c;

    public c(@NonNull Context context, @NonNull M8.b bVar, @NonNull C2618u c2618u) {
        this.f25166a = context;
        this.f25167b = bVar;
        this.f25168c = c2618u;
    }

    public final b a() {
        h hVar = new h(this.f25166a, this.f25167b, this.f25168c);
        hVar.d();
        return hVar;
    }
}

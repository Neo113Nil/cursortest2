package M4;

import M4.a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5432t;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.C8620b;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    private boolean f17382b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f17383c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17384d;

    /* renamed from: e, reason: collision with root package name */
    private a.C0338a f17385e;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8620b<String, b> f17381a = new C8620b<>();

    /* renamed from: f, reason: collision with root package name */
    private boolean f17386f = true;

    /* loaded from: classes8.dex */
    public interface a {
        void a(@NotNull e eVar);
    }

    public interface b {
        @NotNull
        Bundle saveState();
    }

    public static void a(c this$0, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(j11, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC5434v.a.ON_START) {
            this$0.f17386f = true;
        } else if (event == AbstractC5434v.a.ON_STOP) {
            this$0.f17386f = false;
        }
    }

    public final Bundle b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f17384d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f17383c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(key);
        Bundle bundle3 = this.f17383c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f17383c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f17383c = null;
        return bundle2;
    }

    public final b c() {
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        Iterator<Map.Entry<String, b>> it = this.f17381a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, b> components = it.next();
            Intrinsics.checkNotNullExpressionValue(components, "components");
            String key = components.getKey();
            b value = components.getValue();
            if (Intrinsics.d(key, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return value;
            }
        }
        return null;
    }

    public final void d(@NotNull AbstractC5434v lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f17382b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new G() { // from class: M4.b
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                c.a(c.this, j11, aVar);
            }
        });
        this.f17382b = true;
    }

    public final void e(Bundle bundle) {
        if (!this.f17382b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f17384d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f17383c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f17384d = true;
    }

    public final void f(@NotNull Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f17383c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C8620b<String, b>.d c11 = this.f17381a.c();
        Intrinsics.checkNotNullExpressionValue(c11, "this.components.iteratorWithAdditions()");
        while (c11.hasNext()) {
            Map.Entry entry = (Map.Entry) c11.next();
            bundle.putBundle((String) entry.getKey(), ((b) entry.getValue()).saveState());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void g(@NotNull String key, @NotNull b provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (this.f17381a.g(key, provider) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void h() {
        Intrinsics.checkNotNullParameter(C5432t.a.class, "clazz");
        if (!this.f17386f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a.C0338a c0338a = this.f17385e;
        if (c0338a == null) {
            c0338a = new a.C0338a(this);
        }
        this.f17385e = c0338a;
        try {
            C5432t.a.class.getDeclaredConstructor(new Class[0]);
            a.C0338a c0338a2 = this.f17385e;
            if (c0338a2 != null) {
                String name = C5432t.a.class.getName();
                Intrinsics.checkNotNullExpressionValue(name, "clazz.name");
                c0338a2.a(name);
            }
        } catch (NoSuchMethodException e11) {
            throw new IllegalArgumentException("Class " + C5432t.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
        }
    }

    public final void i(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f17381a.h(key);
    }
}

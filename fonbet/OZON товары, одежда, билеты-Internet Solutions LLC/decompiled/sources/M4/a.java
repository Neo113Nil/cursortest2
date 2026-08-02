package M4;

import B0.A0;
import M4.c;
import android.os.Bundle;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements G {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f17378a;

    /* renamed from: M4.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static final class C0338a implements c.b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final LinkedHashSet f17379a;

        public C0338a(@NotNull c registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.f17379a = new LinkedHashSet();
            registry.g("androidx.savedstate.Restarter", this);
        }

        public final void a(@NotNull String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f17379a.add(className);
        }

        @Override // M4.c.b
        @NotNull
        public final Bundle saveState() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f17379a));
            return bundle;
        }
    }

    public a(@NotNull e owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f17378a = owner;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(@NotNull J source, @NotNull AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != AbstractC5434v.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().e(this);
        e eVar = this.f17378a;
        Bundle b11 = eVar.getSavedStateRegistry().b("androidx.savedstate.Restarter");
        if (b11 == null) {
            return;
        }
        ArrayList<String> stringArrayList = b11.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> asSubclass = Class.forName(str, false, a.class.getClassLoader()).asSubclass(c.a.class);
                Intrinsics.checkNotNullExpressionValue(asSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(new Object[0]);
                        Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                constr…wInstance()\n            }");
                        ((c.a) newInstance).a(eVar);
                    } catch (Exception e11) {
                        throw new RuntimeException(Nk.a.b("Failed to instantiate ", str), e11);
                    }
                } catch (NoSuchMethodException e12) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e12);
                }
            } catch (ClassNotFoundException e13) {
                throw new RuntimeException(A0.b("Class ", str, " wasn't found"), e13);
            }
        }
    }
}

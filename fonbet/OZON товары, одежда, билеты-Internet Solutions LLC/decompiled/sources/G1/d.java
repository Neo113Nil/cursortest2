package G1;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r1.C9156d;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap<b, WeakReference<a>> f9662a = new HashMap<>();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C9156d f9663a;

        /* renamed from: b, reason: collision with root package name */
        private final int f9664b;

        public a(@NotNull C9156d c9156d, int i11) {
            this.f9663a = c9156d;
            this.f9664b = i11;
        }

        public final int a() {
            return this.f9664b;
        }

        @NotNull
        public final C9156d b() {
            return this.f9663a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f9663a, aVar.f9663a) && this.f9664b == aVar.f9664b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f9664b) + (this.f9663a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
            sb2.append(this.f9663a);
            sb2.append(", configFlags=");
            return Ek.a.d(sb2, this.f9664b, ')');
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Resources.Theme f9665a;

        /* renamed from: b, reason: collision with root package name */
        private final int f9666b;

        public b(@NotNull Resources.Theme theme, int i11) {
            this.f9665a = theme;
            this.f9666b = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f9665a, bVar.f9665a) && this.f9666b == bVar.f9666b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f9666b) + (this.f9665a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Key(theme=");
            sb2.append(this.f9665a);
            sb2.append(", id=");
            return Ek.a.d(sb2, this.f9666b, ')');
        }
    }

    public final void a() {
        this.f9662a.clear();
    }

    public final a b(@NotNull b bVar) {
        WeakReference<a> weakReference = this.f9662a.get(bVar);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void c(int i11) {
        Iterator<Map.Entry<b, WeakReference<a>>> it = this.f9662a.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = it.next().getValue().get();
            if (aVar == null || Configuration.needNewResources(i11, aVar.a())) {
                it.remove();
            }
        }
    }

    public final void d(@NotNull b bVar, @NotNull a aVar) {
        this.f9662a.put(bVar, new WeakReference<>(aVar));
    }
}

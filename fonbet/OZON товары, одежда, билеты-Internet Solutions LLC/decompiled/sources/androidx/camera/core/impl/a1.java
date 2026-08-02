package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.c1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f38245a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f38246b = new LinkedHashMap();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final O0 f38247a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        private final b1<?> f38248b;

        /* renamed from: c, reason: collision with root package name */
        private final T0 f38249c;

        /* renamed from: d, reason: collision with root package name */
        private final List<c1.b> f38250d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f38251e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f38252f = false;

        a(@NonNull O0 o02, @NonNull b1<?> b1Var, T0 t02, List<c1.b> list) {
            this.f38247a = o02;
            this.f38248b = b1Var;
            this.f38249c = t02;
            this.f38250d = list;
        }

        final boolean a() {
            return this.f38252f;
        }

        final boolean b() {
            return this.f38251e;
        }

        public final List<c1.b> c() {
            return this.f38250d;
        }

        @NonNull
        public final O0 d() {
            return this.f38247a;
        }

        public final T0 e() {
            return this.f38249c;
        }

        @NonNull
        public final b1<?> f() {
            return this.f38248b;
        }

        final void g(boolean z11) {
            this.f38252f = z11;
        }

        final void h(boolean z11) {
            this.f38251e = z11;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UseCaseAttachInfo{mSessionConfig=");
            sb2.append(this.f38247a);
            sb2.append(", mUseCaseConfig=");
            sb2.append(this.f38248b);
            sb2.append(", mStreamSpec=");
            sb2.append(this.f38249c);
            sb2.append(", mCaptureTypes=");
            sb2.append(this.f38250d);
            sb2.append(", mAttached=");
            sb2.append(this.f38251e);
            sb2.append(", mActive=");
            return B4.V.d(sb2, this.f38252f, '}');
        }
    }

    public a1(@NonNull String str) {
        this.f38245a = str;
    }

    @NonNull
    public final O0.h a() {
        O0.h hVar = new O0.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f38246b.entrySet()) {
            a aVar = (a) entry.getValue();
            if (aVar.a() && aVar.b()) {
                String str = (String) entry.getKey();
                hVar.b(aVar.d());
                arrayList.add(str);
            }
        }
        C.S.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f38245a);
        return hVar;
    }

    @NonNull
    public final Collection<O0> b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f38246b.entrySet()) {
            a aVar = (a) entry.getValue();
            if (aVar.a() && aVar.b()) {
                arrayList.add(((a) entry.getValue()).d());
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    @NonNull
    public final O0.h c() {
        O0.h hVar = new O0.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f38246b.entrySet()) {
            a aVar = (a) entry.getValue();
            if (aVar.b()) {
                hVar.b(aVar.d());
                arrayList.add((String) entry.getKey());
            }
        }
        C.S.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f38245a);
        return hVar;
    }

    @NonNull
    public final Collection<O0> d() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f38246b.entrySet()) {
            if (((a) entry.getValue()).b()) {
                arrayList.add(((a) entry.getValue()).d());
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    @NonNull
    public final Collection<b1<?>> e() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f38246b.entrySet()) {
            if (((a) entry.getValue()).b()) {
                arrayList.add(((a) entry.getValue()).f());
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    @NonNull
    public final Collection<a> f() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f38246b.entrySet()) {
            if (((a) entry.getValue()).b()) {
                arrayList.add((a) entry.getValue());
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public final boolean g(@NonNull String str) {
        LinkedHashMap linkedHashMap = this.f38246b;
        if (linkedHashMap.containsKey(str)) {
            return ((a) linkedHashMap.get(str)).b();
        }
        return false;
    }

    public final void h(@NonNull String str) {
        this.f38246b.remove(str);
    }

    public final void i(@NonNull String str, @NonNull O0 o02, @NonNull b1<?> b1Var, T0 t02, List<c1.b> list) {
        LinkedHashMap linkedHashMap = this.f38246b;
        a aVar = (a) linkedHashMap.get(str);
        if (aVar == null) {
            aVar = new a(o02, b1Var, t02, list);
            linkedHashMap.put(str, aVar);
        }
        aVar.g(true);
    }

    public final void j(@NonNull String str, @NonNull O0 o02, @NonNull b1<?> b1Var, T0 t02, List<c1.b> list) {
        LinkedHashMap linkedHashMap = this.f38246b;
        a aVar = (a) linkedHashMap.get(str);
        if (aVar == null) {
            aVar = new a(o02, b1Var, t02, list);
            linkedHashMap.put(str, aVar);
        }
        aVar.h(true);
        m(str, o02, b1Var, t02, list);
    }

    public final void k(@NonNull String str) {
        LinkedHashMap linkedHashMap = this.f38246b;
        if (linkedHashMap.containsKey(str)) {
            a aVar = (a) linkedHashMap.get(str);
            aVar.h(false);
            if (aVar.a()) {
                return;
            }
            linkedHashMap.remove(str);
        }
    }

    public final void l(@NonNull String str) {
        LinkedHashMap linkedHashMap = this.f38246b;
        if (linkedHashMap.containsKey(str)) {
            a aVar = (a) linkedHashMap.get(str);
            aVar.g(false);
            if (aVar.b()) {
                return;
            }
            linkedHashMap.remove(str);
        }
    }

    public final void m(@NonNull String str, @NonNull O0 o02, @NonNull b1<?> b1Var, T0 t02, List<c1.b> list) {
        LinkedHashMap linkedHashMap = this.f38246b;
        if (linkedHashMap.containsKey(str)) {
            a aVar = new a(o02, b1Var, t02, list);
            a aVar2 = (a) linkedHashMap.get(str);
            aVar.h(aVar2.b());
            aVar.g(aVar2.a());
            linkedHashMap.put(str, aVar);
        }
    }
}

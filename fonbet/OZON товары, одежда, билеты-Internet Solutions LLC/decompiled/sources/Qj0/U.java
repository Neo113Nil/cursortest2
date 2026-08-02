package Qj0;

import Sc.InterfaceC3999a;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.Metric;

/* loaded from: classes7.dex */
public class U {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static U f23534h = new T(P4.f.b("toString(...)"));

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f23535i = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23536a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final TreeSet<Metric> f23537b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f23538c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final HashSet<C3886f> f23539d;

    /* renamed from: e, reason: collision with root package name */
    private z0 f23540e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final HashSet<C3903x> f23541f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f23542g;

    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function1<Metric, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f23543b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Metric metric) {
            Metric it = metric;
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends AbstractC7737t implements Function1<C3886f, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f23544b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(C3886f c3886f) {
            C3886f it = c3886f;
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends AbstractC7737t implements Function1<Class<? extends AbstractC3880a>, CharSequence> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Class<? extends AbstractC3880a> cls) {
            Class<? extends AbstractC3880a> it = cls;
            Intrinsics.checkNotNullParameter(it, "it");
            return String.valueOf(U.this.f23538c.get(it));
        }
    }

    public U(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f23536a = key;
        this.f23537b = new TreeSet<>();
        this.f23538c = new LinkedHashMap();
        this.f23539d = new HashSet<>();
        this.f23541f = new HashSet<>();
        this.f23542g = new AtomicBoolean(false);
    }

    public static /* synthetic */ void p(U u11, InterfaceC3892l interfaceC3892l, long j11, boolean z11, int i11) {
        if ((i11 & 2) != 0) {
            j11 = System.nanoTime();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        u11.o(interfaceC3892l, j11, z11);
    }

    public final synchronized void c(@NotNull C3903x rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        if (l()) {
            this.f23541f.add(rule);
            return;
        }
        Log.d("PerfTracing", "Unable to add metric merge rule in already stopped trace " + this.f23536a);
    }

    public final synchronized AbstractC3880a d(@NotNull Class<? extends AbstractC3880a> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        return (AbstractC3880a) this.f23538c.get(attribute);
    }

    @NotNull
    public final synchronized HashSet<AbstractC3880a> e() {
        HashSet<AbstractC3880a> hashSet;
        LinkedHashMap linkedHashMap = this.f23538c;
        hashSet = new HashSet<>();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            hashSet.add((AbstractC3880a) ((Map.Entry) it.next()).getValue());
        }
        return hashSet;
    }

    @InterfaceC3999a
    @NotNull
    public final synchronized HashSet<C3886f> f() {
        return new HashSet<>(this.f23539d);
    }

    @NotNull
    public final String g() {
        return this.f23536a;
    }

    @NotNull
    public final synchronized Set<C3903x> h() {
        return this.f23541f.isEmpty() ? kotlin.collections.M.f71699a : new HashSet<>(this.f23541f);
    }

    public final synchronized Long i(@NotNull InterfaceC3892l type) {
        Object obj;
        Metric metric;
        try {
            Intrinsics.checkNotNullParameter(type, "type");
            Iterator<T> it = this.f23537b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((Metric) obj).getType(), type)) {
                    break;
                }
            }
            metric = (Metric) obj;
        } catch (Throwable th2) {
            throw th2;
        }
        return metric != null ? Long.valueOf(metric.getValue()) : null;
    }

    @NotNull
    public final synchronized TreeSet j() {
        return new TreeSet((SortedSet) this.f23537b);
    }

    public final synchronized z0 k() {
        return this.f23540e;
    }

    public boolean l() {
        return this.f23542g.get();
    }

    public boolean m() {
        boolean containsKey;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(t0.class, "attribute");
            containsKey = this.f23538c.containsKey(t0.class);
        }
        return containsKey;
    }

    public synchronized void n(@NotNull AbstractC3880a attribute, boolean z11) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (l()) {
            if (z11 || this.f23538c.get(attribute.getClass()) == null) {
                this.f23538c.put(attribute.getClass(), attribute);
            }
        } else {
            Log.d("PerfTracing", "Unable to put attribute in already stopped trace " + this.f23536a);
        }
    }

    public synchronized void o(@NotNull InterfaceC3892l type, long j11, boolean z11) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!l()) {
            Log.d("PerfTracing", "Unable to put metric in already stopped trace " + this.f23536a);
            return;
        }
        Metric metric = new Metric(type, j11);
        if (z11 || !this.f23537b.contains(metric)) {
            this.f23537b.remove(metric);
            this.f23537b.add(metric);
        }
    }

    public synchronized void q(@NotNull z0 videoMetric) {
        Intrinsics.checkNotNullParameter(videoMetric, "videoMetric");
        if (l()) {
            this.f23540e = videoMetric;
            return;
        }
        Log.d("PerfTracing", "Unable to put video metric in already stopped trace " + this.f23536a);
    }

    public final void r() {
        this.f23542g.compareAndSet(false, true);
    }

    public void s() {
        this.f23542g.compareAndSet(true, false);
    }

    @NotNull
    public final String toString() {
        String V11 = C7714v.V(this.f23537b, ",", null, null, a.f23543b, 30);
        String V12 = C7714v.V(this.f23539d, ",", null, null, b.f23544b, 30);
        z0 z0Var = this.f23540e;
        String V13 = C7714v.V(this.f23538c.keySet(), ",", null, null, new c(), 30);
        StringBuilder sb2 = new StringBuilder();
        Nh.a.h(sb2, this.f23536a, " metrics = [", V11, "], customMetrics = [");
        sb2.append(V12);
        sb2.append("], videoMetrics = [");
        sb2.append(z0Var);
        sb2.append("], attributes = [");
        return C.o0.c(sb2, V13, "]");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public U(@NotNull U trace) {
        this(trace.f23536a);
        Intrinsics.checkNotNullParameter(trace, "trace");
        this.f23537b.addAll(trace.f23537b);
        this.f23538c.putAll(trace.f23538c);
        this.f23539d.addAll(trace.f23539d);
        this.f23540e = trace.f23540e;
        this.f23541f.addAll(trace.f23541f);
    }
}

package T2;

import R2.U;
import R2.h0;
import R2.i0;
import Sc.InterfaceC4008j;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.AbstractC9688n;
import sf.D;
import sf.x;

/* loaded from: classes8.dex */
public final class g<T> implements h0<T> {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final LinkedHashSet f26531f = new LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final m f26532g = new m();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x f26533a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Q2.f f26534b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<D, AbstractC9688n, U> f26535c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<D> f26536d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f26537e;

    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g<T> f26538b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g<T> gVar) {
            super(0);
            this.f26538b = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            m mVar = g.f26532g;
            g<T> gVar = this.f26538b;
            synchronized (mVar) {
                g.f26531f.remove(g.d(gVar).toString());
            }
            return Unit.f71690a;
        }
    }

    public g(x fileSystem, Q2.f serializer, Function0 producePath) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        e coordinatorProducer = e.f26529b;
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(producePath, "producePath");
        this.f26533a = fileSystem;
        this.f26534b = serializer;
        this.f26535c = coordinatorProducer;
        this.f26536d = producePath;
        this.f26537e = Sc.k.b(new f(this));
    }

    public static final D d(g gVar) {
        return (D) gVar.f26537e.getValue();
    }

    @Override // R2.h0
    @NotNull
    public final i0<T> a() {
        String d11 = ((D) this.f26537e.getValue()).toString();
        synchronized (f26532g) {
            LinkedHashSet linkedHashSet = f26531f;
            if (linkedHashSet.contains(d11)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + d11 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            linkedHashSet.add(d11);
        }
        return new j(this.f26533a, (D) this.f26537e.getValue(), this.f26534b, this.f26535c.invoke((D) this.f26537e.getValue(), this.f26533a), new a(this));
    }
}

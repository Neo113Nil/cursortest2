package O00;

import O00.a;
import Q00.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.InterfaceC9683i;

/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Y00.a f19824a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Q00.b f19825b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final M00.b f19826c;

    /* JADX INFO: Add missing generic type declarations: [I] */
    static final class a<I> extends AbstractC7737t implements Function1<InterfaceC9683i, O00.a<I>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class<I> f19828c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class<I> cls) {
            super(1);
            this.f19828c = cls;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC9683i interfaceC9683i) {
            InterfaceC9683i it = interfaceC9683i;
            Intrinsics.checkNotNullParameter(it, "it");
            long nanoTime = System.nanoTime();
            d<I> a11 = c.this.f19825b.a(it, this.f19828c);
            return new O00.a(a11.a(), a11.b(), new a.C0390a(nanoTime, System.nanoTime()));
        }
    }

    public c(@NotNull Y00.a api, @NotNull Q00.b decoder, @NotNull M00.b mapper) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f19824a = api;
        this.f19825b = decoder;
        this.f19826c = mapper;
    }

    @Override // O00.b
    @NotNull
    public final <I> M00.d<I> a(@NotNull M00.a request, @NotNull Class<I> reponseType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(reponseType, "reponseType");
        return this.f19824a.a(this.f19826c.a(request), new a(reponseType));
    }
}

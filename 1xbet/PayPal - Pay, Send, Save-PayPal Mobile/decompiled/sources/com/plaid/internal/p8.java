package com.plaid.internal;

/* loaded from: classes3.dex */
public abstract class p8<VM extends com.plaid.internal.u8> extends androidx.fragment.app.Fragment {
    public static final /* synthetic */ int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class<VM> f6538a;
    public VM b;
    public final kotlin.Lazy c;

    public static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.plaid.internal.J4, com.plaid.internal.u8> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.plaid.internal.p8<VM> f6539a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.plaid.internal.p8<VM> p8Var) {
            super(1);
            this.f6539a = p8Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final com.plaid.internal.u8 invoke(com.plaid.internal.J4 j4) {
            com.plaid.internal.J4 j42 = j4;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j42, "");
            com.plaid.internal.p8<VM> p8Var = this.f6539a;
            com.plaid.internal.r8 r8Var = (com.plaid.internal.r8) p8Var.c.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8Var, "");
            return p8Var.a(r8Var, j42);
        }
    }

    public p8() {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.plaid.internal.C0574l1.class, "");
        this.f6538a = com.plaid.internal.C0574l1.class;
        this.c = kotlin.LazyKt.lazy(new com.plaid.internal.o8(this));
    }

    public abstract com.plaid.internal.C0574l1 a(com.plaid.internal.r8 r8Var, com.plaid.internal.J4 j4);

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.KeyEventDispatcher.Component activity = getActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNull(activity, "");
        VM vm = (VM) new androidx.view.ViewModelProvider(this, ((com.plaid.internal.w8) activity).a(new com.plaid.internal.p8.a(this))).get(this.f6538a);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vm, "");
        this.b = vm;
    }
}

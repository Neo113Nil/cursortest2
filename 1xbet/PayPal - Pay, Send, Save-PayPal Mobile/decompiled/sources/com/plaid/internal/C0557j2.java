package com.plaid.internal;

/* renamed from: com.plaid.internal.j2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0557j2 extends androidx.view.ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0591n0 f6448a;

    @javax.inject.Inject
    public final com.plaid.internal.G2 b;

    @javax.inject.Inject
    public final com.plaid.internal.InterfaceC0655u2 c;

    @javax.inject.Inject
    public final com.plaid.internal.Z2 d;

    @javax.inject.Inject
    public final com.plaid.internal.A2 e;
    public kotlinx.coroutines.Job f;

    /* renamed from: com.plaid.internal.j2$a */
    public static final /* synthetic */ class a implements androidx.view.Observer, kotlin.jvm.internal.FunctionAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.plaid.internal.link.LinkActivity.b f6449a;

        public a(com.plaid.internal.link.LinkActivity.b bVar) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "");
            this.f6449a = bVar;
        }

        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof androidx.view.Observer) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
                return kotlin.jvm.internal.Intrinsics.areEqual(this.f6449a, ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final kotlin.Function<?> getFunctionDelegate() {
            return this.f6449a;
        }

        public final int hashCode() {
            return this.f6449a.hashCode();
        }

        @Override // androidx.view.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.f6449a.invoke(obj);
        }
    }

    public C0557j2(com.plaid.internal.InterfaceC0449a3 interfaceC0449a3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC0449a3, "");
        com.plaid.internal.C0600o0 c0600o0 = (com.plaid.internal.C0600o0) interfaceC0449a3;
        com.plaid.internal.C0609p0 c0609p0 = c0600o0.f6513a;
        com.plaid.internal.C0591n0 c0591n0 = new com.plaid.internal.C0591n0(c0609p0, c0600o0.b, new com.plaid.internal.I1());
        c0609p0.p.get();
        this.b = c0591n0.d.get();
        this.c = c0591n0.n.get();
        c0609p0.i.get();
        this.d = c0609p0.f.get();
        c0609p0.h.get();
        this.e = c0609p0.j.get();
        this.f6448a = c0591n0;
    }

    public final void a(com.plaid.internal.D6 d6) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.plaid.internal.C0539h2(d6, this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0548i2 c0548i2;
        int i;
        if (continuationImpl instanceof com.plaid.internal.C0548i2) {
            c0548i2 = (com.plaid.internal.C0548i2) continuationImpl;
            int i2 = c0548i2.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0548i2.c = i2 - 2147483648;
                java.lang.Object obj = c0548i2.f6436a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0548i2.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.InterfaceC0655u2 interfaceC0655u2 = this.c;
                    if (interfaceC0655u2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        interfaceC0655u2 = null;
                    }
                    c0548i2.c = 1;
                    if (interfaceC0655u2.a(c0548i2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
            }
        }
        c0548i2 = new com.plaid.internal.C0548i2(this, continuationImpl);
        java.lang.Object obj2 = c0548i2.f6436a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0548i2.c;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
    }
}

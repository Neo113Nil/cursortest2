package com.ironsource;

/* renamed from: com.ironsource.ke, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractRunnableC3136ke implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.AbstractRunnableC3136ke.a f6349a = new com.ironsource.AbstractRunnableC3136ke.a(null);

    /* renamed from: com.ironsource.ke$a */
    public static final class a {

        /* renamed from: com.ironsource.ke$a$a, reason: collision with other inner class name */
        public static final class C0153a extends com.ironsource.AbstractRunnableC3136ke {
            final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> b;

            C0153a(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
                this.b = function0;
            }

            @Override // com.ironsource.AbstractRunnableC3136ke
            public void a() {
                this.b.invoke();
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.ironsource.AbstractRunnableC3136ke a(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
            return new com.ironsource.AbstractRunnableC3136ke.a.C0153a(block);
        }

        private a() {
        }
    }

    public abstract void a() throws java.lang.Exception;

    public void a(java.lang.Throwable t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
        com.ironsource.Ff.a(t);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            try {
                a(th);
            } catch (java.lang.Throwable th2) {
                com.ironsource.C3180n4.d().a(th2);
            }
        }
    }
}

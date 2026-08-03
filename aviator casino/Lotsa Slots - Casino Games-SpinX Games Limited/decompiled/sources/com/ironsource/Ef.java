package com.ironsource;

/* loaded from: classes5.dex */
public interface Ef {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.S6.a.InterfaceC0127a f5687a;
        private boolean b;

        public a(com.ironsource.S6.a.InterfaceC0127a onCancel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            this.f5687a = onCancel;
        }

        public final void a() {
            this.f5687a.cancel();
            this.b = true;
        }

        public final boolean b() {
            return this.b;
        }
    }

    public static final class b {
        public static final com.ironsource.Ef.b.a b = new com.ironsource.Ef.b.a(null);

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.AbstractRunnableC3136ke f5688a;

        public static final class a {

            /* renamed from: com.ironsource.Ef$b$a$a, reason: collision with other inner class name */
            public static final class C0116a extends com.ironsource.AbstractRunnableC3136ke {
                final /* synthetic */ java.lang.ref.WeakReference<T> b;
                final /* synthetic */ kotlin.jvm.functions.Function1<T, kotlin.Unit> c;

                /* JADX WARN: Multi-variable type inference failed */
                C0116a(java.lang.ref.WeakReference<T> weakReference, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
                    this.b = weakReference;
                    this.c = function1;
                }

                @Override // com.ironsource.AbstractRunnableC3136ke
                public void a() {
                    java.lang.Object obj = this.b.get();
                    if (obj != null) {
                        this.c.invoke(obj);
                    }
                }
            }

            public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final <T> com.ironsource.Ef.b a(T t, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
                return new com.ironsource.Ef.b(new com.ironsource.Ef.b.a.C0116a(new java.lang.ref.WeakReference(t), block), null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(com.ironsource.AbstractRunnableC3136ke abstractRunnableC3136ke, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractRunnableC3136ke);
        }

        public final com.ironsource.AbstractRunnableC3136ke a() {
            return this.f5688a;
        }

        private b(com.ironsource.AbstractRunnableC3136ke abstractRunnableC3136ke) {
            this.f5688a = abstractRunnableC3136ke;
        }
    }

    com.ironsource.Ef.a a(com.ironsource.Ef.b bVar, long j);

    com.ironsource.Ef.a a(java.lang.Runnable runnable, long j);
}

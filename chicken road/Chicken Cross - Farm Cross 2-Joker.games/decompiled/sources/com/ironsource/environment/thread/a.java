package com.ironsource.environment.thread;

import com.ironsource.C4491k4;
import com.ironsource.Gf;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static final C1324a f8176a = new C1324a(null);

    /* renamed from: com.ironsource.environment.thread.a$a, reason: collision with other inner class name */
    public static final class C1324a {

        /* renamed from: com.ironsource.environment.thread.a$a$a, reason: collision with other inner class name */
        public static final class C1325a extends a {
            final /* synthetic */ Function0<Unit> b;

            C1325a(Function0<Unit> function0) {
                this.b = function0;
            }

            @Override // com.ironsource.environment.thread.a
            public void a() {
                this.b.invoke();
            }
        }

        /* renamed from: com.ironsource.environment.thread.a$a$b */
        /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
            b(Object obj) {
                super(0, obj, Runnable.class, "run", "run()V", 0);
            }

            public final void a() {
                ((Runnable) this.receiver).run();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        public /* synthetic */ C1324a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Function0<Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new C1325a(block);
        }

        private C1324a() {
        }

        public final a a(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            a aVar = runnable instanceof a ? (a) runnable : null;
            return aVar == null ? a.f8176a.a(new b(runnable)) : aVar;
        }
    }

    public abstract void a() throws Exception;

    public void a(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        Gf.a(t);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th) {
            C4491k4.d().a(th);
            try {
                a(th);
            } catch (Throwable th2) {
                C4491k4.d().a(th2);
            }
        }
    }
}

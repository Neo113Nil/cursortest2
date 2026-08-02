package financial.atomic.e;

/* loaded from: classes17.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static financial.atomic.transact.service.TransactService f6743a;
    public static boolean b;
    public static kotlin.jvm.functions.Function1 c;
    public static final financial.atomic.e.e INSTANCE = new financial.atomic.e.e();
    public static final financial.atomic.e.d d = new financial.atomic.e.d();

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(financial.atomic.e.e eVar, android.content.Context context, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        eVar.bind(context, function1);
    }

    public final void bind(android.content.Context context, kotlin.jvm.functions.Function1<? super financial.atomic.transact.service.TransactService, kotlin.Unit> function1) {
        financial.atomic.transact.service.TransactService transactService;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        context.startService(new android.content.Intent(context, (java.lang.Class<?>) financial.atomic.transact.service.TransactService.class));
        if (!b || (transactService = f6743a) == null) {
            c = function1;
            context.bindService(new android.content.Intent(context, (java.lang.Class<?>) financial.atomic.transact.service.TransactService.class), d, 1);
        } else if (function1 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(transactService);
            function1.invoke(transactService);
        }
    }

    public final financial.atomic.transact.service.TransactService getService() {
        return f6743a;
    }

    public final void stopService(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        context.stopService(new android.content.Intent(context, (java.lang.Class<?>) financial.atomic.transact.service.TransactService.class));
    }

    public final void unbind(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (b) {
            context.unbindService(d);
            b = false;
        }
    }
}

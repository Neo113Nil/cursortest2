package financial.atomic.transact.service;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 02\u00020\u0001:\u000212B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0!¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0003J\u0019\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b&\u0010'R$\u0010/\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00063"}, d2 = {"Lfinancial/atomic/transact/service/TransactService;", "Landroid/app/Service;", "<init>", "()V", "", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "Landroid/content/Context;", "context", "Lfinancial/atomic/transact/Config;", "config", "", "showTransact", "Lfinancial/atomic/transact/Transact$Mode;", "mode", "initialize", "(Landroid/content/Context;Lfinancial/atomic/transact/Config;ZLfinancial/atomic/transact/Transact$Mode;)V", "additionalFlags", "showView", "(Landroid/content/Context;I)V", "hideView", "Landroid/view/View;", "getTransactView", "()Landroid/view/View;", "", "getAllTransactViews", "()Ljava/util/List;", "onDestroy", "rootIntent", "onTaskRemoved", "(Landroid/content/Intent;)V", "Lfinancial/atomic/transact/Transact;", "a", "Lfinancial/atomic/transact/Transact;", "getTransact$transact_release", "()Lfinancial/atomic/transact/Transact;", "setTransact$transact_release", "(Lfinancial/atomic/transact/Transact;)V", "transact", "Companion", "financial/atomic/e/a", "financial/atomic/e/b", "transact_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransactService extends android.app.Service {
    public static final financial.atomic.e.a Companion = new financial.atomic.e.a(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public financial.atomic.transact.Transact transact;
    public final financial.atomic.e.b b = new financial.atomic.e.b(this);
    public final kotlinx.coroutines.CoroutineScope c;

    public TransactService() {
        kotlinx.coroutines.CompletableJob Job$default;
        kotlinx.coroutines.MainCoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();
        Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        this.c = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(main.plus(Job$default));
    }

    public static /* synthetic */ void initialize$default(financial.atomic.transact.service.TransactService transactService, android.content.Context context, financial.atomic.transact.Config config, boolean z, financial.atomic.transact.Transact.Mode mode, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            mode = financial.atomic.transact.Transact.Mode.DEFAULT;
        }
        transactService.initialize(context, config, z, mode);
    }

    public static /* synthetic */ void showView$default(financial.atomic.transact.service.TransactService transactService, android.content.Context context, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        transactService.showView(context, i);
    }

    public final java.util.List<android.view.View> getAllTransactViews() {
        java.util.List<android.view.View> allViews$transact_release;
        financial.atomic.transact.Transact transact = this.transact;
        return (transact == null || (allViews$transact_release = transact.getAllViews$transact_release()) == null) ? kotlin.collections.CollectionsKt.emptyList() : allViews$transact_release;
    }

    /* renamed from: getTransact$transact_release, reason: from getter */
    public final financial.atomic.transact.Transact getTransact() {
        return this.transact;
    }

    public final android.view.View getTransactView() {
        financial.atomic.transact.Transact transact = this.transact;
        if (transact != null) {
            return transact.view();
        }
        return null;
    }

    public final void hideView() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new financial.atomic.e.c(this, null), 3, null);
    }

    public final void initialize(android.content.Context context, financial.atomic.transact.Config config, boolean showTransact, financial.atomic.transact.Transact.Mode mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "");
        financial.atomic.transact.Transact transact = this.transact;
        if (transact != null) {
            transact.destroy();
        }
        this.transact = new financial.atomic.transact.Transact(context, config, showTransact, mode);
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return this.b;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.c, null, 1, null);
        financial.atomic.transact.Transact transact = this.transact;
        if (transact != null) {
            transact.destroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int flags, int startId) {
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(android.content.Intent rootIntent) {
        try {
            financial.atomic.transact.Transact transact = this.transact;
            if (transact != null) {
                kotlinx.coroutines.CoroutineScopeKt.cancel$default(transact.get_scope(), null, 1, null);
                transact.destroy();
                this.transact = null;
            }
        } finally {
            super.onTaskRemoved(rootIntent);
        }
    }

    public final void setTransact$transact_release(financial.atomic.transact.Transact transact) {
        this.transact = transact;
    }

    public final void showView(android.content.Context context, int additionalFlags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) financial.atomic.transact.activity.TransactActivity.class);
        intent.setFlags(additionalFlags | 268435456);
        try {
            context.startActivity(intent);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}

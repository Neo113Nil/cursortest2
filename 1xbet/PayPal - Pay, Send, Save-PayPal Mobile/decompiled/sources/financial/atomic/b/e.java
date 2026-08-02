package financial.atomic.b;

/* loaded from: classes3.dex */
public final class e implements android.content.ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.transact.activity.TransactActivity f6737a;

    public e(financial.atomic.transact.activity.TransactActivity transactActivity) {
        this.f6737a = transactActivity;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        financial.atomic.transact.Transact transact;
        financial.atomic.e.b bVar = iBinder instanceof financial.atomic.e.b ? (financial.atomic.e.b) iBinder : null;
        if (bVar == null) {
            financial.atomic.transact.activity.TransactActivity transactActivity = this.f6737a;
            transactActivity.setResult(0);
            transactActivity.finish();
            return;
        }
        financial.atomic.transact.service.TransactService service = bVar.getService();
        financial.atomic.transact.Transact transact2 = service.getTransact();
        if (transact2 == null) {
            financial.atomic.transact.activity.TransactActivity transactActivity2 = this.f6737a;
            transactActivity2.setResult(0);
            transactActivity2.finish();
            return;
        }
        java.util.List<android.view.View> allTransactViews = service.getAllTransactViews();
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f6737a.findViewById(financial.atomic.transact.R.id.TransactLayout);
        for (android.view.View view : allTransactViews) {
            if (view.getParent() instanceof android.view.ViewGroup) {
                android.view.ViewParent parent = view.getParent();
                kotlin.jvm.internal.Intrinsics.checkNotNull(parent, "");
                ((android.view.ViewGroup) parent).removeView(view);
            }
            frameLayout.addView(view);
        }
        this.f6737a.d = transact2;
        transact = this.f6737a.d;
        if (transact == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            transact = null;
        }
        financial.atomic.transact.activity.TransactActivity transactActivity3 = this.f6737a;
        if (!transact.getIsPaused()) {
            transact.once(financial.atomic.transact.Transact.Event.CLOSE, new financial.atomic.b.c(transactActivity3, null));
            transact.once(financial.atomic.transact.Transact.Event.FINISH, new financial.atomic.b.d(transactActivity3, null));
        }
        this.f6737a.b = true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f6737a.b = false;
    }
}

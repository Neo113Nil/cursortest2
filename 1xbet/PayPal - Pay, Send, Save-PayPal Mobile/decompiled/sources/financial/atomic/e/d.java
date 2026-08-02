package financial.atomic.e;

/* loaded from: classes17.dex */
public final class d implements android.content.ServiceConnection {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        r3 = financial.atomic.e.e.f6743a;
     */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        kotlin.jvm.functions.Function1 function1;
        financial.atomic.transact.service.TransactService transactService;
        financial.atomic.e.b bVar = iBinder instanceof financial.atomic.e.b ? (financial.atomic.e.b) iBinder : null;
        if (bVar != null) {
            financial.atomic.e.e.f6743a = bVar.getService();
            financial.atomic.e.e.b = true;
            function1 = financial.atomic.e.e.c;
            if (function1 == null || transactService == null) {
                return;
            }
            function1.invoke(transactService);
            financial.atomic.e.e.c = null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        financial.atomic.e.e.f6743a = null;
        financial.atomic.e.e.b = false;
    }
}

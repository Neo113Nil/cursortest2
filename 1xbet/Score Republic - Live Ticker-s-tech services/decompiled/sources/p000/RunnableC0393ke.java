package p000;

import android.os.Trace;
import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: renamed from: ke */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0393ke implements Runnable {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ RunnableC0393ke f4354k = new RunnableC0393ke(5);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ RunnableC0393ke f4355l = new RunnableC0393ke(6);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ RunnableC0393ke f4356m = new RunnableC0393ke(7);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f4357j;

    public RunnableC0393ke(an0 an0Var, int i) {
        this.f4357j = 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.f4357j) {
            case 0:
                return;
            case 1:
                try {
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if ((C0595pv.f6261k != null ? 1 : 0) != 0) {
                        C0595pv.m3994a().m3996c();
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 2:
            case 3:
                return;
            case 4:
                ArrayList arrayList = new ArrayList(i51.f3441d.keySet());
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) obj;
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        i51.f3441d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                return;
            case 5:
            case 6:
                return;
            default:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
        }
    }

    public String toString() {
        switch (this.f4357j) {
            case 2:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC0393ke(int i) {
        this.f4357j = i;
    }

    /* JADX INFO: renamed from: a */
    private final void m3025a() {
    }

    /* JADX INFO: renamed from: b */
    private final void m3026b() {
    }

    /* JADX INFO: renamed from: c */
    private final void m3027c() {
    }

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ void m3028d() {
    }

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ void m3029e() {
    }
}

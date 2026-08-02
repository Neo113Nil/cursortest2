package p000;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: d5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0126d5 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1553j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Context f1554k;

    public /* synthetic */ RunnableC0126d5(Context context, int i) {
        this.f1553j = i;
        this.f1554k = context;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    @Override // java.lang.Runnable
    public final void run() {
        tj0 tj0Var;
        Object systemService;
        Context context;
        int i = this.f1553j;
        Context context2 = this.f1554k;
        switch (i) {
            case 0:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i2 >= 33) {
                            C0165e8 c0165e8 = AbstractC0274h5.f3059p;
                            c0165e8.getClass();
                            C0904y7 c0904y7 = new C0904y7(c0165e8);
                            while (true) {
                                if (c0904y7.hasNext()) {
                                    AbstractC0274h5 abstractC0274h5 = (AbstractC0274h5) ((WeakReference) c0904y7.next()).get();
                                    if (abstractC0274h5 != null && (context = ((LayoutInflaterFactory2C0828w5) abstractC0274h5).f8427t) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                tj0Var = new tj0(new uj0(AbstractC0199f5.m1595a(systemService)));
                            } else {
                                tj0Var = tj0.f7455b;
                            }
                        } else {
                            tj0Var = AbstractC0274h5.f3055l;
                            if (tj0Var == null) {
                                tj0Var = tj0.f7455b;
                            }
                        }
                        if (tj0Var.f7456a.f7828a.isEmpty()) {
                            String strM3410l = AbstractC0477mo.m3410l(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                AbstractC0199f5.m1596b(systemService2, AbstractC0162e5.m1363a(strM3410l));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                AbstractC0274h5.f3058o = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0126d5(context2, 2));
                break;
            default:
                kd0.m3019s(context2, new fn0(), kd0.f4352d, false);
                break;
        }
    }
}

package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class sf {
    private static pcc pcc;

    public interface pcc {
        ExecutorService gm();

        boolean pcc();

        boolean sf();
    }

    /* renamed from: com.bytedance.sdk.component.utils.sf$sf, reason: collision with other inner class name */
    public interface InterfaceC0131sf {
        void pcc();

        void pcc(Throwable th);
    }

    public static void pcc(pcc pccVar) {
        pcc = pccVar;
    }

    public static void pcc(final Context context, final Intent intent, final InterfaceC0131sf interfaceC0131sf) {
        ExecutorService gm;
        pcc pccVar = pcc;
        if (pccVar != null && pccVar.sf() && (gm = pcc.gm()) != null) {
            gm.execute(new Runnable() { // from class: com.bytedance.sdk.component.utils.sf.1
                @Override // java.lang.Runnable
                public void run() {
                    sf.gm(context, intent, interfaceC0131sf);
                }
            });
        } else {
            gm(context, intent, interfaceC0131sf);
        }
    }

    public static boolean pcc(final Context context, final Intent intent, final InterfaceC0131sf interfaceC0131sf, boolean z) {
        pcc pccVar;
        ExecutorService gm;
        if (z && (pccVar = pcc) != null && pccVar.pcc() && (gm = pcc.gm()) != null) {
            gm.execute(new Runnable() { // from class: com.bytedance.sdk.component.utils.sf.2
                @Override // java.lang.Runnable
                public void run() {
                    sf.gm(context, intent, interfaceC0131sf);
                }
            });
            return true;
        }
        return gm(context, intent, interfaceC0131sf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean gm(Context context, Intent intent, InterfaceC0131sf interfaceC0131sf) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (interfaceC0131sf == null) {
                    return true;
                }
                interfaceC0131sf.pcc();
                return true;
            } catch (Throwable th) {
                if (interfaceC0131sf != null) {
                    interfaceC0131sf.pcc(th);
                }
            }
        }
        return false;
    }

    public static Activity pcc(View view) {
        View findViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (findViewById = rootView.findViewById(R.id.content)) == null || (context = findViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }

    public static boolean pcc(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}

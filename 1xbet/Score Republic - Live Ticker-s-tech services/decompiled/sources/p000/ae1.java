package p000;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ae1 {

    /* JADX INFO: renamed from: b */
    public static WeakReference f162b;

    /* JADX INFO: renamed from: a */
    public n71 f163a;

    /* JADX INFO: renamed from: a */
    public final synchronized zd1 m180a() {
        String str;
        zd1 zd1Var;
        n71 n71Var = this.f163a;
        synchronized (((ArrayDeque) n71Var.f5321d)) {
            str = (String) ((ArrayDeque) n71Var.f5321d).peek();
        }
        Pattern pattern = zd1.f9745d;
        zd1Var = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                zd1Var = new zd1(strArrSplit[0], strArrSplit[1]);
            }
        }
        return zd1Var;
    }
}

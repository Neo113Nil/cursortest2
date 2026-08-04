package P3;

import J3.f;
import android.content.Context;
import android.preference.PreferenceManager;
import androidx.appcompat.widget.n1;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f5584b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f5585a;

    public a(n1 n1Var) {
        Context context = n1Var.f8711a;
        String str = (String) n1Var.f8712b;
        String str2 = (String) n1Var.f8713c;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.f5585a = (f) n1Var.f8717g;
    }
}

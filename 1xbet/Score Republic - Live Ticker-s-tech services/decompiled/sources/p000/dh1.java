package p000;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class dh1 {

    /* JADX INFO: renamed from: b */
    public static final Pattern f1650b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: c */
    public static dh1 f1651c;

    /* JADX INFO: renamed from: a */
    public final aa0 f1652a;

    public dh1(aa0 aa0Var) {
        this.f1652a = aa0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1212a(C0389ka c0389ka) {
        if (TextUtils.isEmpty(c0389ka.f4324c)) {
            return true;
        }
        long j = c0389ka.f4327f + c0389ka.f4326e;
        this.f1652a.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}

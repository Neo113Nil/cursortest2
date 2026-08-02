package p000;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class tj0 {

    /* JADX INFO: renamed from: b */
    public static final tj0 f7455b = new tj0(new uj0(new LocaleList(new Locale[0])));

    /* JADX INFO: renamed from: a */
    public final uj0 f7456a;

    public tj0(uj0 uj0Var) {
        this.f7456a = uj0Var;
    }

    /* JADX INFO: renamed from: a */
    public static tj0 m4790a(String str) {
        if (str == null || str.isEmpty()) {
            return f7455b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return new tj0(new uj0(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tj0) {
            return this.f7456a.equals(((tj0) obj).f7456a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7456a.f7828a.hashCode();
    }

    public final String toString() {
        return this.f7456a.f7828a.toString();
    }
}

package p000;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class zd1 {

    /* JADX INFO: renamed from: d */
    public static final Pattern f9745d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a */
    public final String f9746a;

    /* JADX INFO: renamed from: b */
    public final String f9747b;

    /* JADX INFO: renamed from: c */
    public final String f9748c;

    public zd1(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f9745d.matcher(strSubstring).matches()) {
            C0270h1.m2190f(AbstractC0024an.m284g("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.f9746a = strSubstring;
        this.f9747b = str;
        this.f9748c = str + "!" + str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zd1)) {
            return false;
        }
        zd1 zd1Var = (zd1) obj;
        return this.f9746a.equals(zd1Var.f9746a) && this.f9747b.equals(zd1Var.f9747b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9747b, this.f9746a});
    }
}

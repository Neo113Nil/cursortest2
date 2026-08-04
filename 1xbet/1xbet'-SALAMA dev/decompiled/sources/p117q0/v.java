package p117q0;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15793c;

    public v(String str, int i7, int i8) {
        this.f15791a = str;
        this.f15792b = i7;
        this.f15793c = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        int i7 = this.f15793c;
        String str = this.f15791a;
        int i8 = this.f15792b;
        if (i8 < 0 || vVar.f15792b < 0) {
            return TextUtils.equals(str, vVar.f15791a) && i7 == vVar.f15793c;
        }
        return TextUtils.equals(str, vVar.f15791a) && i8 == vVar.f15792b && i7 == vVar.f15793c;
    }

    public final int hashCode() {
        return Objects.hash(this.f15791a, Integer.valueOf(this.f15793c));
    }
}

package q0;

import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f15785a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15786b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15787c;

    public v(String str, int i7, int i8) {
        this.f15785a = str;
        this.f15786b = i7;
        this.f15787c = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        int i7 = this.f15787c;
        String str = this.f15785a;
        int i8 = this.f15786b;
        return (i8 < 0 || vVar.f15786b < 0) ? TextUtils.equals(str, vVar.f15785a) && i7 == vVar.f15787c : TextUtils.equals(str, vVar.f15785a) && i8 == vVar.f15786b && i7 == vVar.f15787c;
    }

    public final int hashCode() {
        return Objects.hash(this.f15785a, Integer.valueOf(this.f15787c));
    }
}

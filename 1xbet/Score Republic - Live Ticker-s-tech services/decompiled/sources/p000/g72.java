package p000;

import android.content.Context;
import android.os.Parcel;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class g72 implements nw0, y01 {

    /* JADX INFO: renamed from: l */
    public static final Object f2639l = new Object();

    /* JADX INFO: renamed from: m */
    public static volatile v01 f2640m;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2641j;

    /* JADX INFO: renamed from: k */
    public final String f2642k;

    public g72(Context context, h72 h72Var) {
        this.f2641j = 0;
        this.f2642k = h72Var.m2225u() ? u22.m4869b(context, h72Var.m2224t()) : h72Var.m2224t();
    }

    /* JADX INFO: renamed from: a */
    public void m1993a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f2642k);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p000.y01
    public void accept(Object obj, Object obj2) {
        int i = e22.f1910k;
        w12 w12Var = new w12((qc1) obj2);
        f22 f22Var = (f22) ((h22) obj).m3890l();
        Parcel parcelM5810d = f22Var.m5810d();
        iu1.m2703c(parcelM5810d, w12Var);
        parcelM5810d.writeString(this.f2642k);
        f22Var.m5806F(parcelM5810d, 5);
    }

    @Override // p000.nw0
    public boolean test(Object obj) {
        String str = this.f2642k;
        if (obj != str) {
            return obj != null && obj.equals(str);
        }
        return true;
    }

    public String toString() {
        switch (this.f2641j) {
            case 3:
                return "<" + this.f2642k + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ g72(String str, int i) {
        this.f2641j = i;
        this.f2642k = str;
    }

    public g72(String str) {
        this.f2641j = 2;
        str.getClass();
        this.f2642k = str;
    }
}

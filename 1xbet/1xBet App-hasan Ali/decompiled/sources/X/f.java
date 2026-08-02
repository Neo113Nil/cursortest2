package X;

import a.AbstractC0444a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f6057a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f6057a);
        sb.append(")@");
        int hashCode = hashCode();
        AbstractC0444a.k(16);
        String num = Integer.toString(hashCode, 16);
        kotlin.jvm.internal.l.e("toString(...)", num);
        sb.append(num);
        return sb.toString();
    }
}

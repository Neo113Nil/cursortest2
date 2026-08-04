package p106o4;

import p120q4.k;
import p134s4.g;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f15611d = new d(1, null, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f15612e = new d(2, null, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f15614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15615c;

    public d(int i7, g gVar, boolean z4) {
        this.f15613a = i7;
        this.f15614b = gVar;
        this.f15615c = z4;
        k.c(!z4 || i7 == 2);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("OperationSource{source=");
        int i7 = this.f15613a;
        if (i7 != 1) {
            str = i7 != 2 ? "null" : "Server";
        } else {
            str = "User";
        }
        sb.append(str);
        sb.append(", queryParams=");
        sb.append(this.f15614b);
        sb.append(", tagged=");
        sb.append(this.f15615c);
        sb.append('}');
        return sb.toString();
    }
}

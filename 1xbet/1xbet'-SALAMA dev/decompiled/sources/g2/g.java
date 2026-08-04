package g2;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EventMessage[] f13144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f13145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13147d;

    public g(String str, String str2, long[] jArr, EventMessage[] eventMessageArr) {
        this.f13146c = str;
        this.f13147d = str2;
        this.f13145b = jArr;
        this.f13144a = eventMessageArr;
    }

    public final String a() {
        return this.f13146c + "/" + this.f13147d;
    }
}

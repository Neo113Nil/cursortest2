package g2;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final EventMessage[] f13138a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f13139b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13140c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13141d;

    public g(String str, String str2, long[] jArr, EventMessage[] eventMessageArr) {
        this.f13140c = str;
        this.f13141d = str2;
        this.f13139b = jArr;
        this.f13138a = eventMessageArr;
    }

    public final String a() {
        return this.f13140c + "/" + this.f13141d;
    }
}

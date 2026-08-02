package w2;

import L4.z;
import P.W;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: w2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2544b {

    /* renamed from: a, reason: collision with root package name */
    public final String f20495a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f20496b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f20497c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f20498d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20499e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public W f20500g;

    /* renamed from: h, reason: collision with root package name */
    public int f20501h;
    public final /* synthetic */ C2548f i;

    public C2544b(C2548f c2548f, String str) {
        this.i = c2548f;
        this.f20495a = str;
        c2548f.getClass();
        this.f20496b = new long[2];
        c2548f.getClass();
        this.f20497c = new ArrayList(2);
        c2548f.getClass();
        this.f20498d = new ArrayList(2);
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        c2548f.getClass();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.f20497c.add(this.i.f20508k.d(sb.toString()));
            sb.append(".tmp");
            this.f20498d.add(this.i.f20508k.d(sb.toString()));
            sb.setLength(length);
        }
    }

    public final C2545c a() {
        if (this.f20499e && this.f20500g == null && !this.f) {
            ArrayList arrayList = this.f20497c;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                C2548f c2548f = this.i;
                if (i >= size) {
                    this.f20501h++;
                    return new C2545c(c2548f, this);
                }
                if (c2548f.f20523z.c((z) arrayList.get(i))) {
                    i++;
                } else {
                    try {
                        c2548f.p(this);
                        return null;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return null;
    }
}

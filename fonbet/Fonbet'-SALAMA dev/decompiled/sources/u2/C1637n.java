package u2;

import java.io.IOException;

/* renamed from: u2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1637n extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f16793b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f16794a;

    public C1637n(int i7) {
        this.f16794a = i7;
    }

    public C1637n(Exception exc, int i7) {
        super(exc);
        this.f16794a = i7;
    }

    public C1637n(String str, int i7) {
        super(str);
        this.f16794a = i7;
    }

    public C1637n(String str, Exception exc, int i7) {
        super(str, exc);
        this.f16794a = i7;
    }
}

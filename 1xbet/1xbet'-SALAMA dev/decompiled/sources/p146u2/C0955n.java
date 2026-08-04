package p146u2;

import java.io.IOException;

/* JADX INFO: renamed from: u2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0955n extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f16799b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16800a;

    public C0955n(int i7) {
        this.f16800a = i7;
    }

    public C0955n(Exception exc, int i7) {
        super(exc);
        this.f16800a = i7;
    }

    public C0955n(String str, int i7) {
        super(str);
        this.f16800a = i7;
    }

    public C0955n(String str, Exception exc, int i7) {
        super(str, exc);
        this.f16800a = i7;
    }
}

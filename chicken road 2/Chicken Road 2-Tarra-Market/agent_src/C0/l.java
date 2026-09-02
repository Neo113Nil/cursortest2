package C0;

import java.io.Serializable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f79a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f81c;

    public l(int i2, String str, double d2, double d3, double d4, double d5, int i3, int i4, ByteBuffer byteBuffer) {
        this.f79a = i2;
        this.f81c = str;
        this.f80b = i3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [C0.l[], java.io.Serializable] */
    public l() {
        this.f81c = new l[256];
        this.f79a = 0;
        this.f80b = 0;
    }

    public l(int i2, int i3) {
        this.f81c = null;
        this.f79a = i2;
        int i4 = i3 & 7;
        this.f80b = i4 == 0 ? 8 : i4;
    }
}

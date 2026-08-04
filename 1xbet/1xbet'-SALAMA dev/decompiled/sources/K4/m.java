package K4;

import U5.AbstractC0457y;
import U5.C0443j;
import U5.W;
import U5.Y;
import U5.b0;
import java.util.BitSet;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends AbstractC0457y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W f4037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W f4038d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4.d f4039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4.b f4040b;

    static {
        C0443j c0443j = b0.f6457d;
        BitSet bitSet = Y.f6448d;
        f4037c = new W("Authorization", c0443j);
        f4038d = new W("x-firebase-appcheck", c0443j);
    }

    public m(C4.d dVar, C4.b bVar) {
        this.f4039a = dVar;
        this.f4040b = bVar;
    }
}

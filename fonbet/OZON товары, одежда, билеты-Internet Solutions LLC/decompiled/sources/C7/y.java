package C7;

import C7.d;

/* loaded from: classes9.dex */
final class y extends d.a {

    /* renamed from: a, reason: collision with root package name */
    private byte f4467a;

    public final d a() {
        if (this.f4467a == 3) {
            return new z();
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f4467a & 1) == 0) {
            sb2.append(" appUpdateType");
        }
        if ((this.f4467a & 2) == 0) {
            sb2.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final d.a b() {
        this.f4467a = (byte) (this.f4467a | 2);
        return this;
    }

    public final void c() {
        this.f4467a = (byte) (this.f4467a | 1);
    }
}

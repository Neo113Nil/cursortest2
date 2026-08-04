package p140t3;

/* JADX INFO: loaded from: classes.dex */
public enum e implements a {
    /* JADX INFO: Fake field, exist only in values array */
    ED256(-260),
    /* JADX INFO: Fake field, exist only in values array */
    ED512(-261),
    /* JADX INFO: Fake field, exist only in values array */
    ED25519(-8),
    /* JADX INFO: Fake field, exist only in values array */
    ES256(-7),
    /* JADX INFO: Fake field, exist only in values array */
    ECDH_HKDF_256(-25),
    /* JADX INFO: Fake field, exist only in values array */
    ES384(-35),
    /* JADX INFO: Fake field, exist only in values array */
    ES512(-36);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16455a;

    e(int i7) {
        this.f16455a = i7;
    }

    @Override // p140t3.a
    public final int a() {
        return this.f16455a;
    }
}

package t3;

/* loaded from: classes.dex */
public enum h implements InterfaceC1607a {
    /* JADX INFO: Fake field, exist only in values array */
    RS256(-257),
    /* JADX INFO: Fake field, exist only in values array */
    RS384(-258),
    /* JADX INFO: Fake field, exist only in values array */
    RS512(-259),
    /* JADX INFO: Fake field, exist only in values array */
    LEGACY_RS1(-262),
    /* JADX INFO: Fake field, exist only in values array */
    PS256(-37),
    /* JADX INFO: Fake field, exist only in values array */
    PS384(-38),
    /* JADX INFO: Fake field, exist only in values array */
    PS512(-39),
    RS1(-65535);


    /* renamed from: a, reason: collision with root package name */
    public final int f16452a;

    h(int i7) {
        this.f16452a = i7;
    }

    @Override // t3.InterfaceC1607a
    public final int a() {
        return this.f16452a;
    }
}

package p140t3;

/* JADX INFO: loaded from: classes.dex */
public enum h implements a {
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


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16458a;

    h(int i7) {
        this.f16458a = i7;
    }

    @Override // p140t3.a
    public final int a() {
        return this.f16458a;
    }
}

package E4;

/* renamed from: E4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0176i {
    LESS_THAN("<"),
    LESS_THAN_OR_EQUAL("<="),
    EQUAL("=="),
    NOT_EQUAL("!="),
    GREATER_THAN(">"),
    GREATER_THAN_OR_EQUAL(">="),
    ARRAY_CONTAINS("array_contains"),
    ARRAY_CONTAINS_ANY("array_contains_any"),
    IN("in"),
    NOT_IN("not_in");


    /* renamed from: a, reason: collision with root package name */
    public final String f2198a;

    EnumC0176i(String str) {
        this.f2198a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f2198a;
    }
}

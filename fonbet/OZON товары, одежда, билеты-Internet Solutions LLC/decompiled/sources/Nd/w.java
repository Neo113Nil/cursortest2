package Nd;

import Td.i;

/* loaded from: classes.dex */
public enum w implements i.a {
    INTERNAL(0),
    PRIVATE(1),
    PROTECTED(2),
    PUBLIC(3),
    PRIVATE_TO_THIS(4),
    LOCAL(5);

    private static i.b<w> internalValueMap = new a();
    private final int value;

    static class a implements i.b<w> {
    }

    w(int i11) {
        this.value = i11;
    }

    @Override // Td.i.a
    public final int getNumber() {
        return this.value;
    }
}

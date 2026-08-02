package Nd;

import Td.i;

/* loaded from: classes.dex */
public enum j implements i.a {
    FINAL(0),
    OPEN(1),
    ABSTRACT(2),
    SEALED(3);

    private static i.b<j> internalValueMap = new a();
    private final int value;

    static class a implements i.b<j> {
    }

    j(int i11) {
        this.value = i11;
    }

    @Override // Td.i.a
    public final int getNumber() {
        return this.value;
    }
}

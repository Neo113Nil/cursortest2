package Nd;

import Td.i;

/* loaded from: classes.dex */
public enum i implements i.a {
    DECLARATION(0),
    FAKE_OVERRIDE(1),
    DELEGATION(2),
    SYNTHESIZED(3);

    private static i.b<i> internalValueMap = new a();
    private final int value;

    static class a implements i.b<i> {
    }

    i(int i11) {
        this.value = i11;
    }

    @Override // Td.i.a
    public final int getNumber() {
        return this.value;
    }
}

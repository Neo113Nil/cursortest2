package Dm0;

import Dm0.b;

/* loaded from: classes4.dex */
public final class f implements b.InterfaceC0147b {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 32;
    }

    @Override // Dm0.b.InterfaceC0147b
    public final boolean z1(char c11) {
        if ('A' <= c11 && c11 <= 'Z') {
            return true;
        }
        if ('a' > c11 || c11 > 'z') {
            return 1040 <= c11 && c11 <= 1103;
        }
        return true;
    }
}

package Yf;

import android.util.Pair;

/* loaded from: classes10.dex */
public final class i extends Pair<Integer, Integer> {
    @Override // android.util.Pair
    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (((Integer) ((Pair) this).first).equals(((Pair) iVar).first) && ((Integer) ((Pair) this).second).equals(((Pair) iVar).second)) {
            return true;
        }
        return ((Integer) ((Pair) this).first).equals(((Pair) iVar).second) && ((Integer) ((Pair) this).second).equals(((Pair) iVar).first);
    }
}

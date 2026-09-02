package h1;

import android.view.KeyCharacterMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f1245a;

    public i() {
        this.f1245a = 0;
    }

    public Character a(int i2) {
        char c2 = (char) i2;
        if ((Integer.MIN_VALUE & i2) != 0) {
            int i3 = i2 & Integer.MAX_VALUE;
            int i4 = this.f1245a;
            if (i4 != 0) {
                this.f1245a = KeyCharacterMap.getDeadChar(i4, i3);
            } else {
                this.f1245a = i3;
            }
        } else {
            int i5 = this.f1245a;
            if (i5 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i5, i2);
                if (deadChar > 0) {
                    c2 = (char) deadChar;
                }
                this.f1245a = 0;
            }
        }
        return Character.valueOf(c2);
    }

    public i(int i2) {
        this.f1245a = i2;
    }
}

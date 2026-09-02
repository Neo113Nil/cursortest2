package F;

import android.view.KeyCharacterMap;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public int f38a;

    public E() {
        this.f38a = 0;
    }

    public Character a(int i2) {
        char c2 = (char) i2;
        if ((Integer.MIN_VALUE & i2) != 0) {
            int i3 = i2 & Integer.MAX_VALUE;
            int i4 = this.f38a;
            if (i4 != 0) {
                this.f38a = KeyCharacterMap.getDeadChar(i4, i3);
            } else {
                this.f38a = i3;
            }
        } else {
            int i5 = this.f38a;
            if (i5 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i5, i2);
                if (deadChar > 0) {
                    c2 = (char) deadChar;
                }
                this.f38a = 0;
            }
        }
        return Character.valueOf(c2);
    }

    public E(int i2) {
        this.f38a = i2;
    }
}

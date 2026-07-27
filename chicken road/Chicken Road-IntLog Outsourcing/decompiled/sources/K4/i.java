package K4;

import android.view.KeyCharacterMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f1443a;

    public i(int i2, boolean z) {
        switch (i2) {
            case 2:
                this.f1443a = y3.g.f12395n.getAndIncrement();
                break;
            default:
                this.f1443a = 0;
                break;
        }
    }

    public Character a(int i2) {
        char c2 = (char) i2;
        if ((Integer.MIN_VALUE & i2) != 0) {
            int i3 = i2 & Integer.MAX_VALUE;
            int i6 = this.f1443a;
            if (i6 != 0) {
                this.f1443a = KeyCharacterMap.getDeadChar(i6, i3);
            } else {
                this.f1443a = i3;
            }
        } else {
            int i7 = this.f1443a;
            if (i7 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i7, i2);
                if (deadChar > 0) {
                    c2 = (char) deadChar;
                }
                this.f1443a = 0;
            }
        }
        return Character.valueOf(c2);
    }

    public i(int i2) {
        this.f1443a = i2;
    }
}

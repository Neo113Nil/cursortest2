package G1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f584a;

    public i() {
        this.f584a = 0;
    }

    public java.lang.Character a(int i2) {
        char c2 = (char) i2;
        if ((Integer.MIN_VALUE & i2) != 0) {
            int i3 = i2 & Integer.MAX_VALUE;
            int i4 = this.f584a;
            if (i4 != 0) {
                this.f584a = android.view.KeyCharacterMap.getDeadChar(i4, i3);
            } else {
                this.f584a = i3;
            }
        } else {
            int i5 = this.f584a;
            if (i5 != 0) {
                int deadChar = android.view.KeyCharacterMap.getDeadChar(i5, i2);
                if (deadChar > 0) {
                    c2 = (char) deadChar;
                }
                this.f584a = 0;
            }
        }
        return java.lang.Character.valueOf(c2);
    }

    public i(int i2) {
        this.f584a = i2;
    }
}

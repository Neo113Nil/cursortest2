package h;

/* loaded from: classes.dex */
public final class e0 extends android.util.Property {
    @Override // android.util.Property
    public final java.lang.Object get(java.lang.Object obj) {
        return java.lang.Float.valueOf(((androidx.appcompat.widget.SwitchCompat) obj).f2120x);
    }

    @Override // android.util.Property
    public final void set(java.lang.Object obj, java.lang.Object obj2) {
        ((androidx.appcompat.widget.SwitchCompat) obj).setThumbPosition(((java.lang.Float) obj2).floatValue());
    }
}

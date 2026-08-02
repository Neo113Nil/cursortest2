package androidx.dynamicanimation.animation;

import android.util.FloatProperty;

/* loaded from: classes8.dex */
public abstract class d<T> {
    final String mPropertyName;

    static class a extends d<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FloatProperty f42670a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, FloatProperty floatProperty) {
            super(str);
            this.f42670a = floatProperty;
        }

        @Override // androidx.dynamicanimation.animation.d
        public final float getValue(T t2) {
            return ((Float) this.f42670a.get(t2)).floatValue();
        }

        @Override // androidx.dynamicanimation.animation.d
        public final void setValue(T t2, float f7) {
            this.f42670a.setValue(t2, f7);
        }
    }

    public d(String str) {
        this.mPropertyName = str;
    }

    public static <T> d<T> createFloatPropertyCompat(FloatProperty<T> floatProperty) {
        return new a(floatProperty.getName(), floatProperty);
    }

    public abstract float getValue(T t2);

    public abstract void setValue(T t2, float f7);
}

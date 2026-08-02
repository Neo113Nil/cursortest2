package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public interface c2 {
    default float a() {
        return 2.0f;
    }

    float b();

    default float c() {
        return 16.0f;
    }

    long d();

    long e();

    default long f() {
        float f7 = 48;
        return Ra.h.d(f7, f7);
    }

    default float g() {
        return Float.MAX_VALUE;
    }
}

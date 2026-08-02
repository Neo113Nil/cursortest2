package S0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface S extends A1<Float> {
    float getFloatValue();

    @Override // S0.A1
    @NotNull
    default Float getValue() {
        return Float.valueOf(getFloatValue());
    }
}

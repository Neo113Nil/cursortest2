package F3;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public enum a extends h {
    public a() {
        super("IDENTITY", 0);
    }

    @Override // F3.h
    public final String b(Field field) {
        return field.getName();
    }
}

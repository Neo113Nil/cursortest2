package P5;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Set;
import n3.AbstractC1464a;

/* loaded from: classes2.dex */
public final class O extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) {
        Set R6 = AbstractC1464a.R("java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;");
        String name = objectStreamClass != null ? objectStreamClass.getName() : null;
        if (name == null || R6.contains(name)) {
            return super.resolveClass(objectStreamClass);
        }
        throw new ClassNotFoundException(objectStreamClass.getName());
    }
}

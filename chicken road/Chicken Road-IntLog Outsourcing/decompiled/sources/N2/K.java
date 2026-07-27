package N2;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Set;

/* loaded from: classes.dex */
public final class K extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) {
        Set x5 = e5.g.x("java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;");
        String name = objectStreamClass != null ? objectStreamClass.getName() : null;
        if (name == null || x5.contains(name)) {
            return super.resolveClass(objectStreamClass);
        }
        throw new ClassNotFoundException(objectStreamClass.getName());
    }
}

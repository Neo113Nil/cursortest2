package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class n0 {

    public static final class a<T> {
        public final Field a;

        public a(Field field) {
            this.a = field;
            field.setAccessible(true);
        }
    }

    public static void a(AbstractC0958f abstractC0958f, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection<V> collection = abstractC0958f.get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    public static void b(AbstractC0960h abstractC0960h, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(abstractC0960h.b().size());
        for (Map.Entry entry : abstractC0960h.b().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }
}

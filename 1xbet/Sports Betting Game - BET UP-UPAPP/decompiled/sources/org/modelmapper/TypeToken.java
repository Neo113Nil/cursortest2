package org.modelmapper;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import org.modelmapper.internal.util.Assert;
import org.modelmapper.internal.util.Types;

/* loaded from: classes4.dex */
public class TypeToken<T> {
    private final Class<T> rawType;
    private final Type type;

    protected TypeToken() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Assert.isTrue(genericSuperclass instanceof ParameterizedType, "%s is not parameterized", genericSuperclass);
        Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        this.type = type;
        Assert.isTrue(!(type instanceof TypeVariable), "Cannot construct a TypeToken for a TypeVariable. Try new TypeToken<%s>(getClass()) instead.", type);
        this.rawType = (Class<T>) Types.rawTypeFor(type);
    }

    private TypeToken(Type type) {
        this.type = type;
        this.rawType = (Class<T>) Types.rawTypeFor(type);
    }

    public static <T> TypeToken<T> of(Type type) {
        Assert.notNull(type, "type");
        return new TypeToken<>(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof TypeToken) && this.type.equals(((TypeToken) obj).type);
    }

    public final Class<T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    public final String toString() {
        return this.type.toString();
    }
}

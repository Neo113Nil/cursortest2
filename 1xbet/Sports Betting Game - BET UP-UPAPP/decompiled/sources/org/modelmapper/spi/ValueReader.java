package org.modelmapper.spi;

import java.util.Collection;

/* loaded from: classes4.dex */
public interface ValueReader<T> {
    Object get(T t, String str);

    Member<T> getMember(T t, String str);

    Collection<String> memberNames(T t);

    public static abstract class Member<T> {
        private Class<Object> valueType;

        public abstract Object get(T t, String str);

        public T getOrigin() {
            return null;
        }

        public Member(Class<?> cls) {
            this.valueType = cls;
        }

        public Class<Object> getValueType() {
            return this.valueType;
        }
    }
}

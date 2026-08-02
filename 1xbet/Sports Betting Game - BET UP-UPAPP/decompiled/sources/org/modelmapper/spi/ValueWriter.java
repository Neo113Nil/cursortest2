package org.modelmapper.spi;

import java.util.Collection;

/* loaded from: classes4.dex */
public interface ValueWriter<T> {
    Member<T> getMember(Class<T> cls, String str);

    boolean isResolveMembersSupport();

    Collection<String> memberNames(Class<T> cls);

    void setValue(T t, Object obj, String str);

    public static abstract class Member<T> {
        private Class<Object> valueType;

        public Class<T> getOrigin() {
            return null;
        }

        public abstract void setValue(T t, Object obj);

        public Member(Class<?> cls) {
            this.valueType = cls;
        }

        public Class<Object> getValueType() {
            return this.valueType;
        }
    }
}

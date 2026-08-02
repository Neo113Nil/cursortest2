package org.modelmapper.internal.util;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class ToStringBuilder {
    private final String name;
    private final Map<String, Object> properties = new LinkedHashMap();

    public ToStringBuilder(Class<?> cls) {
        this.name = cls.getSimpleName();
    }

    public ToStringBuilder add(String str, Object obj) {
        if (obj.getClass().isArray()) {
            obj = new ArrayWrapper(obj);
        }
        if (this.properties.put(str, obj) == null) {
            return this;
        }
        throw new RuntimeException("Duplicate property: " + str);
    }

    public String toString() {
        return this.name + this.properties.toString().replace(AbstractJsonLexerKt.BEGIN_OBJ, '[').replace(AbstractJsonLexerKt.END_OBJ, AbstractJsonLexerKt.END_LIST);
    }

    static class ArrayWrapper {
        private final Object[] array;

        ArrayWrapper(Object obj) {
            this.array = (Object[]) obj;
        }

        public String toString() {
            return Arrays.toString(this.array);
        }
    }
}

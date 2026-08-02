package org.modelmapper.internal.valueaccess;

import java.util.Collection;
import java.util.Map;
import org.modelmapper.spi.ValueReader;

/* loaded from: classes4.dex */
public class MapValueReader implements ValueReader<Map<String, Object>> {
    @Override // org.modelmapper.spi.ValueReader
    public Object get(Map<String, Object> map, String str) {
        return map.get(str);
    }

    @Override // org.modelmapper.spi.ValueReader
    public ValueReader.Member<Map<String, Object>> getMember(Map<String, Object> map, String str) {
        final Object obj = get(map, str);
        if (obj instanceof Map) {
            return new ValueReader.Member<Map<String, Object>>(Map.class) { // from class: org.modelmapper.internal.valueaccess.MapValueReader.1
                @Override // org.modelmapper.spi.ValueReader.Member
                public Map<String, Object> getOrigin() {
                    return (Map) obj;
                }

                @Override // org.modelmapper.spi.ValueReader.Member
                public Object get(Map<String, Object> map2, String str2) {
                    return MapValueReader.this.get(map2, str2);
                }
            };
        }
        return new ValueReader.Member<Map<String, Object>>(obj != null ? obj.getClass() : Object.class) { // from class: org.modelmapper.internal.valueaccess.MapValueReader.2
            @Override // org.modelmapper.spi.ValueReader.Member
            public Map<String, Object> getOrigin() {
                return null;
            }

            @Override // org.modelmapper.spi.ValueReader.Member
            public Object get(Map<String, Object> map2, String str2) {
                return MapValueReader.this.get(map2, str2);
            }
        };
    }

    @Override // org.modelmapper.spi.ValueReader
    public Collection<String> memberNames(Map<String, Object> map) {
        return map.keySet();
    }
}

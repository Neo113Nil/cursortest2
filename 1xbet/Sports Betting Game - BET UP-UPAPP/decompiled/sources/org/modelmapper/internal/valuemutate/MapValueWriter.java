package org.modelmapper.internal.valuemutate;

import java.util.Collection;
import java.util.Map;
import org.modelmapper.spi.ValueWriter;

/* loaded from: classes4.dex */
public class MapValueWriter implements ValueWriter<Map<String, Object>> {
    @Override // org.modelmapper.spi.ValueWriter
    public boolean isResolveMembersSupport() {
        return false;
    }

    @Override // org.modelmapper.spi.ValueWriter
    public void setValue(Map<String, Object> map, Object obj, String str) {
        map.put(str, obj);
    }

    @Override // org.modelmapper.spi.ValueWriter
    public ValueWriter.Member<Map<String, Object>> getMember(Class<Map<String, Object>> cls, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.modelmapper.spi.ValueWriter
    public Collection<String> memberNames(Class<Map<String, Object>> cls) {
        throw new UnsupportedOperationException();
    }
}
